package org.telegram.ui.Cells;

import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.id;
import org.telegram.messenger.tf;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d6 {
    public final int f24228a;
    public boolean f24229b;
    public boolean f24230c;
    public int f24231e;
    public long f24232f;
    public int f24233g;
    public final ArrayList d = new ArrayList();
    public final ArrayList h = new ArrayList();

    public d6(int i10) {
        this.f24228a = i10;
    }

    public static void a(d6 d6Var, TLObject tLObject, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        ArrayList arrayList2 = d6Var.d;
        int i11 = d6Var.f24228a;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(i11).putUsers(messages_messages.users, false);
            MessagesController.getInstance(i11).putChats(messages_messages.chats, false);
            messagesStorage.putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            messagesStorage.putMessages(messages_messages, -j10, 3, 0, false, 0, 0L);
            if (i10 == d6Var.f24231e && !messages_messages.messages.isEmpty()) {
                arrayList2.clear();
                Collections.sort(arrayList, Comparator$CC.comparingInt(new jf.d(13)));
                TLRPC.Message message = (TLRPC.Message) j7.l1.i(1, messages_messages.messages);
                long j11 = message.grouped_id;
                if (j11 != 0) {
                    ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TLRPC.Message message2 = arrayList3.get(i12);
                        i12++;
                        TLRPC.Message message3 = message2;
                        if (message3.grouped_id == j11) {
                            arrayList2.add(new MessageObject(i11, message3, false, true));
                        }
                    }
                } else {
                    arrayList2.add(new MessageObject(i11, message, false, true));
                }
                if (!arrayList2.isEmpty()) {
                    d6Var.c();
                }
            }
        } else if (i10 != d6Var.f24231e) {
        } else {
            d6Var.c();
        }
    }

    public static void b(d6 d6Var, int i10, ArrayList arrayList, long j10, int i11, MessagesStorage messagesStorage) {
        int i12 = d6Var.f24228a;
        ArrayList arrayList2 = d6Var.d;
        if (i10 != d6Var.f24231e) {
            return;
        }
        if (!arrayList.isEmpty()) {
            arrayList2.clear();
            Collections.sort(arrayList, Comparator$CC.comparingInt(new jf.d(12)));
            TLRPC.Message message = (TLRPC.Message) arrayList.get(arrayList.size() - 1);
            long j11 = message.grouped_id;
            if (j11 != 0) {
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    TLRPC.Message message2 = (TLRPC.Message) obj;
                    if (message2.grouped_id == j11) {
                        arrayList2.add(new MessageObject(i12, message2, false, true));
                    }
                }
            } else {
                arrayList2.add(new MessageObject(i12, message, false, true));
            }
            if (!arrayList2.isEmpty()) {
                d6Var.c();
                return;
            }
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(i12).getInputChannel(j10);
        for (int i14 = 10; i14 >= 0; i14--) {
            int i15 = i11 - i14;
            if (i15 >= 0) {
                tL_channels_getMessages.f22430id.add(Integer.valueOf(i15));
            }
        }
        ConnectionsManager.getInstance(i12).sendRequest(tL_channels_getMessages, new id(d6Var, messagesStorage, j10, i10, arrayList));
    }

    public final void c() {
        int i10 = 0;
        this.f24229b = false;
        this.f24230c = true;
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
            long j10 = userFull.personal_channel_id;
            int i10 = userFull.personal_channel_message;
            if (this.f24230c || this.f24229b) {
                if (this.f24232f == j10 && this.f24233g == i10) {
                    return;
                }
                this.f24230c = false;
                arrayList.clear();
            }
            int i11 = this.f24231e + 1;
            this.f24231e = i11;
            this.f24229b = true;
            this.f24232f = j10;
            this.f24233g = i10;
            int i12 = this.f24228a;
            long clientUserId = UserConfig.getInstance(i12).getClientUserId();
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
            messagesStorage.getStorageQueue().postRunnable(new tf(this, i10, messagesStorage, j10, clientUserId, i11));
            return;
        }
        this.f24231e++;
        this.f24230c = true;
        arrayList.clear();
        c();
    }
}
