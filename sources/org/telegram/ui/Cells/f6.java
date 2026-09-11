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
public final class f6 {
    public final int f21924a;
    public boolean f21925b;
    public boolean f21926c;
    public int f21927e;
    public long f21928f;
    public int f21929g;
    public final ArrayList d = new ArrayList();
    public final ArrayList h = new ArrayList();

    public f6(int i10) {
        this.f21924a = i10;
    }

    public static void a(f6 f6Var, TLObject tLObject, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        ArrayList arrayList2 = f6Var.d;
        int i11 = f6Var.f21924a;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(i11).putUsers(messages_messages.users, false);
            MessagesController.getInstance(i11).putChats(messages_messages.chats, false);
            messagesStorage.putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            messagesStorage.putMessages(messages_messages, -j3, 3, 0, false, 0, 0L);
            if (i10 == f6Var.f21927e && !messages_messages.messages.isEmpty()) {
                arrayList2.clear();
                Collections.sort(arrayList, Comparator$CC.comparingInt(new bi.o6(7)));
                TLRPC.Message message = (TLRPC.Message) i2.g.h(1, messages_messages.messages);
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
                    f6Var.c();
                }
            }
        } else if (i10 != f6Var.f21927e) {
        } else {
            f6Var.c();
        }
    }

    public static void b(f6 f6Var, int i10, ArrayList arrayList, long j3, int i11, MessagesStorage messagesStorage) {
        int i12 = f6Var.f21924a;
        ArrayList arrayList2 = f6Var.d;
        if (i10 != f6Var.f21927e) {
            return;
        }
        if (!arrayList.isEmpty()) {
            arrayList2.clear();
            Collections.sort(arrayList, Comparator$CC.comparingInt(new bi.o6(6)));
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
                f6Var.c();
                return;
            }
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(i12).getInputChannel(j3);
        for (int i14 = 10; i14 >= 0; i14--) {
            int i15 = i11 - i14;
            if (i15 >= 0) {
                tL_channels_getMessages.f19907id.add(Integer.valueOf(i15));
            }
        }
        ConnectionsManager.getInstance(i12).sendRequest(tL_channels_getMessages, new fd(f6Var, messagesStorage, j3, i10, arrayList));
    }

    public final void c() {
        int i10 = 0;
        this.f21925b = false;
        this.f21926c = true;
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
            if (this.f21926c || this.f21925b) {
                if (this.f21928f == j3 && this.f21929g == i10) {
                    return;
                }
                this.f21926c = false;
                arrayList.clear();
            }
            int i11 = this.f21927e + 1;
            this.f21927e = i11;
            this.f21925b = true;
            this.f21928f = j3;
            this.f21929g = i10;
            int i12 = this.f21924a;
            long clientUserId = UserConfig.getInstance(i12).getClientUserId();
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
            messagesStorage.getStorageQueue().postRunnable(new rf(this, i10, messagesStorage, j3, clientUserId, i11));
            return;
        }
        this.f21927e++;
        this.f21926c = true;
        arrayList.clear();
        c();
    }
}
