package org.telegram.ui.Cells;

import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.gd;
import org.telegram.messenger.sf;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g6 {
    public final int f20313a;
    public boolean f20314b;
    public boolean f20315c;
    public int e;
    public long f20316f;
    public int f20317g;
    public final ArrayList d = new ArrayList();
    public final ArrayList h = new ArrayList();

    public g6(int i10) {
        this.f20313a = i10;
    }

    public static void a(g6 g6Var, TLObject tLObject, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        ArrayList arrayList2 = g6Var.d;
        int i11 = g6Var.f20313a;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(i11).putUsers(messages_messages.users, false);
            MessagesController.getInstance(i11).putChats(messages_messages.chats, false);
            messagesStorage.putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            messagesStorage.putMessages(messages_messages, -j3, 3, 0, false, 0, 0L);
            if (i10 == g6Var.e && !messages_messages.messages.isEmpty()) {
                arrayList2.clear();
                Collections.sort(arrayList, Comparator$CC.comparingInt(new ai.f7(7)));
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
        } else if (i10 != g6Var.e) {
        } else {
            g6Var.c();
        }
    }

    public static void b(g6 g6Var, int i10, ArrayList arrayList, long j3, int i11, MessagesStorage messagesStorage) {
        int i12 = g6Var.f20313a;
        ArrayList arrayList2 = g6Var.d;
        if (i10 != g6Var.e) {
            return;
        }
        if (!arrayList.isEmpty()) {
            arrayList2.clear();
            Collections.sort(arrayList, Comparator$CC.comparingInt(new ai.f7(6)));
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
                tL_channels_getMessages.f18334id.add(Integer.valueOf(i15));
            }
        }
        ConnectionsManager.getInstance(i12).sendRequest(tL_channels_getMessages, new gd(g6Var, messagesStorage, j3, i10, arrayList));
    }

    public final void c() {
        int i10 = 0;
        this.f20314b = false;
        this.f20315c = true;
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
            if (this.f20315c || this.f20314b) {
                if (this.f20316f == j3 && this.f20317g == i10) {
                    return;
                }
                this.f20315c = false;
                arrayList.clear();
            }
            int i11 = this.e + 1;
            this.e = i11;
            this.f20314b = true;
            this.f20316f = j3;
            this.f20317g = i10;
            int i12 = this.f20313a;
            long clientUserId = UserConfig.getInstance(i12).getClientUserId();
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
            messagesStorage.getStorageQueue().postRunnable(new sf(this, i10, messagesStorage, j3, clientUserId, i11));
            return;
        }
        this.e++;
        this.f20315c = true;
        arrayList.clear();
        c();
    }
}
