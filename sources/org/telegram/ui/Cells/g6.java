package org.telegram.ui.Cells;

import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.fd;
import org.telegram.messenger.rf;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g6 {
    public final int f22151a;
    public boolean f22152b;
    public boolean f22153c;
    public int f22154e;
    public long f22155f;
    public int f22156g;
    public final ArrayList d = new ArrayList();
    public final ArrayList h = new ArrayList();

    public g6(int i10) {
        this.f22151a = i10;
    }

    public static void a(g6 g6Var, TLObject tLObject, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        ArrayList arrayList2 = g6Var.d;
        int i11 = g6Var.f22151a;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(i11).putUsers(messages_messages.users, false);
            MessagesController.getInstance(i11).putChats(messages_messages.chats, false);
            messagesStorage.putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            messagesStorage.putMessages(messages_messages, -j3, 3, 0, false, 0, 0L);
            if (i10 == g6Var.f22154e && !messages_messages.messages.isEmpty()) {
                arrayList2.clear();
                Collections.sort(arrayList, Comparator$CC.comparingInt(new ai.g7(7)));
                TLRPC.Message message = (TLRPC.Message) hg.k0.g(1, messages_messages.messages);
                long j10 = message.grouped_id;
                if (j10 != 0) {
                    ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TLRPC.Message message2 = arrayList3.get(i12);
                        i12++;
                        TLRPC.Message message3 = message2;
                        if (message3.grouped_id == j10) {
                            arrayList2.add(new MessageObject(i11, message3, false, true));
                        }
                    }
                } else {
                    arrayList2.add(new MessageObject(i11, message, false, true));
                }
                if (!arrayList2.isEmpty()) {
                    g6Var.c();
                }
            }
        } else if (i10 != g6Var.f22154e) {
        } else {
            g6Var.c();
        }
    }

    public static void b(g6 g6Var, int i10, ArrayList arrayList, long j3, int i11, MessagesStorage messagesStorage) {
        int i12 = g6Var.f22151a;
        ArrayList arrayList2 = g6Var.d;
        if (i10 != g6Var.f22154e) {
            return;
        }
        if (!arrayList.isEmpty()) {
            arrayList2.clear();
            Collections.sort(arrayList, Comparator$CC.comparingInt(new ai.g7(6)));
            TLRPC.Message message = (TLRPC.Message) arrayList.get(arrayList.size() - 1);
            long j10 = message.grouped_id;
            if (j10 != 0) {
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    TLRPC.Message message2 = (TLRPC.Message) obj;
                    if (message2.grouped_id == j10) {
                        arrayList2.add(new MessageObject(i12, message2, false, true));
                    }
                }
            } else {
                arrayList2.add(new MessageObject(i12, message, false, true));
            }
            if (!arrayList2.isEmpty()) {
                g6Var.c();
                return;
            }
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(i12).getInputChannel(j3);
        for (int i14 = 10; i14 >= 0; i14--) {
            int i15 = i11 - i14;
            if (i15 >= 0) {
                tL_channels_getMessages.f20075id.add(Integer.valueOf(i15));
            }
        }
        ConnectionsManager.getInstance(i12).sendRequest(tL_channels_getMessages, new fd(g6Var, messagesStorage, j3, i10, arrayList));
    }

    public final void c() {
        int i10 = 0;
        this.f22152b = false;
        this.f22153c = true;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        arrayList.clear();
    }

    public final void d(TLRPC.UserFull userFull) {
        ArrayList arrayList = this.d;
        if (userFull != null && (userFull.flags2 & 64) != 0) {
            long j3 = userFull.personal_channel_id;
            int i10 = userFull.personal_channel_message;
            if (this.f22153c || this.f22152b) {
                if (this.f22155f == j3 && this.f22156g == i10) {
                    return;
                }
                this.f22153c = false;
                arrayList.clear();
            }
            int i11 = this.f22154e + 1;
            this.f22154e = i11;
            this.f22152b = true;
            this.f22155f = j3;
            this.f22156g = i10;
            int i12 = this.f22151a;
            long clientUserId = UserConfig.getInstance(i12).getClientUserId();
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
            messagesStorage.getStorageQueue().postRunnable(new rf(this, i10, messagesStorage, j3, clientUserId, i11));
            return;
        }
        this.f22154e++;
        this.f22153c = true;
        arrayList.clear();
        c();
    }
}
