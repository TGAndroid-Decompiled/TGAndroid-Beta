package org.telegram.ui.Cells;

import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.fd;
import org.telegram.messenger.qf;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class c6 {

    public final int f24156a;

    public boolean f24157b;

    public boolean f24158c;

    public int f24159e;

    public long f24160f;

    public int f24161g;
    public final ArrayList d = new ArrayList();
    public final ArrayList h = new ArrayList();

    public c6(int i10) {
        this.f24156a = i10;
    }

    public static void a(c6 c6Var, TLObject tLObject, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        ArrayList arrayList2 = c6Var.d;
        int i11 = c6Var.f24156a;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (i10 != c6Var.f24159e) {
                return;
            }
            c6Var.c();
            return;
        }
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(i11).putUsers(messages_messages.users, false);
        MessagesController.getInstance(i11).putChats(messages_messages.chats, false);
        messagesStorage.putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
        messagesStorage.putMessages(messages_messages, -j10, 3, 0, false, 0, 0L);
        if (i10 == c6Var.f24159e && !messages_messages.messages.isEmpty()) {
            arrayList2.clear();
            Collections.sort(arrayList, Comparator$CC.comparingInt(new gf.d(13)));
            TLRPC.Message message = (TLRPC.Message) i0.a.i(1, messages_messages.messages);
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
            if (arrayList2.isEmpty()) {
                return;
            }
            c6Var.c();
        }
    }

    public static void b(c6 c6Var, int i10, ArrayList arrayList, long j10, int i11, MessagesStorage messagesStorage) {
        int i12 = c6Var.f24156a;
        ArrayList arrayList2 = c6Var.d;
        if (i10 != c6Var.f24159e) {
            return;
        }
        if (!arrayList.isEmpty()) {
            arrayList2.clear();
            Collections.sort(arrayList, Comparator$CC.comparingInt(new gf.d(12)));
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
                c6Var.c();
                return;
            }
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(i12).getInputChannel(j10);
        for (int i14 = 10; i14 >= 0; i14--) {
            int i15 = i11 - i14;
            if (i15 >= 0) {
                tL_channels_getMessages.f22418id.add(Integer.valueOf(i15));
            }
        }
        ConnectionsManager.getInstance(i12).sendRequest(tL_channels_getMessages, new fd(c6Var, messagesStorage, j10, i10, arrayList));
    }

    public final void c() {
        int i10 = 0;
        this.f24157b = false;
        this.f24158c = true;
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
        if (userFull == null || (userFull.flags2 & 64) == 0) {
            this.f24159e++;
            this.f24158c = true;
            arrayList.clear();
            c();
            return;
        }
        long j10 = userFull.personal_channel_id;
        int i10 = userFull.personal_channel_message;
        if (this.f24158c || this.f24157b) {
            if (this.f24160f == j10 && this.f24161g == i10) {
                return;
            }
            this.f24158c = false;
            arrayList.clear();
        }
        int i11 = this.f24159e + 1;
        this.f24159e = i11;
        this.f24157b = true;
        this.f24160f = j10;
        this.f24161g = i10;
        int i12 = this.f24156a;
        long clientUserId = UserConfig.getInstance(i12).getClientUserId();
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
        messagesStorage.getStorageQueue().postRunnable(new qf(this, i10, messagesStorage, j10, clientUserId, i11));
    }
}
