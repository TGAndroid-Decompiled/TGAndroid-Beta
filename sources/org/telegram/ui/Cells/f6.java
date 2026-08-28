package org.telegram.ui.Cells;

import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.bd;
import org.telegram.messenger.mf;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f6 {
    public final int f24335a;
    public boolean f24336b;
    public boolean f24337c;
    public int f24338e;
    public long f24339f;
    public int f24340g;
    public final ArrayList d = new ArrayList();
    public final ArrayList h = new ArrayList();

    public f6(int i9) {
        this.f24335a = i9;
    }

    public static void a(f6 f6Var, TLObject tLObject, MessagesStorage messagesStorage, long j10, int i9, ArrayList arrayList) {
        ArrayList arrayList2 = f6Var.d;
        int i10 = f6Var.f24335a;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(i10).putUsers(messages_messages.users, false);
            MessagesController.getInstance(i10).putChats(messages_messages.chats, false);
            messagesStorage.putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            messagesStorage.putMessages(messages_messages, -j10, 3, 0, false, 0, 0L);
            if (i9 == f6Var.f24338e && !messages_messages.messages.isEmpty()) {
                arrayList2.clear();
                Collections.sort(arrayList, Comparator$CC.comparingInt(new ff.d(13)));
                TLRPC.Message message = (TLRPC.Message) j3.r0.j(1, messages_messages.messages);
                long j11 = message.grouped_id;
                if (j11 != 0) {
                    ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.Message message2 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Message message3 = message2;
                        if (message3.grouped_id == j11) {
                            arrayList2.add(new MessageObject(i10, message3, false, true));
                        }
                    }
                } else {
                    arrayList2.add(new MessageObject(i10, message, false, true));
                }
                if (!arrayList2.isEmpty()) {
                    f6Var.c();
                }
            }
        } else if (i9 != f6Var.f24338e) {
        } else {
            f6Var.c();
        }
    }

    public static void b(f6 f6Var, int i9, ArrayList arrayList, long j10, int i10, MessagesStorage messagesStorage) {
        int i11 = f6Var.f24335a;
        ArrayList arrayList2 = f6Var.d;
        if (i9 != f6Var.f24338e) {
            return;
        }
        if (!arrayList.isEmpty()) {
            arrayList2.clear();
            Collections.sort(arrayList, Comparator$CC.comparingInt(new ff.d(12)));
            TLRPC.Message message = (TLRPC.Message) arrayList.get(arrayList.size() - 1);
            long j11 = message.grouped_id;
            if (j11 != 0) {
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    TLRPC.Message message2 = (TLRPC.Message) obj;
                    if (message2.grouped_id == j11) {
                        arrayList2.add(new MessageObject(i11, message2, false, true));
                    }
                }
            } else {
                arrayList2.add(new MessageObject(i11, message, false, true));
            }
            if (!arrayList2.isEmpty()) {
                f6Var.c();
                return;
            }
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(i11).getInputChannel(j10);
        for (int i13 = 10; i13 >= 0; i13--) {
            int i14 = i10 - i13;
            if (i14 >= 0) {
                tL_channels_getMessages.f22418id.add(Integer.valueOf(i14));
            }
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_getMessages, new bd(f6Var, messagesStorage, j10, i9, arrayList));
    }

    public final void c() {
        int i9 = 0;
        this.f24336b = false;
        this.f24337c = true;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((Runnable) obj).run();
        }
        arrayList.clear();
    }

    public final void d(TLRPC.UserFull userFull) {
        ArrayList arrayList = this.d;
        if (userFull != null && (userFull.flags2 & 64) != 0) {
            long j10 = userFull.personal_channel_id;
            int i9 = userFull.personal_channel_message;
            if (this.f24337c || this.f24336b) {
                if (this.f24339f == j10 && this.f24340g == i9) {
                    return;
                }
                this.f24337c = false;
                arrayList.clear();
            }
            int i10 = this.f24338e + 1;
            this.f24338e = i10;
            this.f24336b = true;
            this.f24339f = j10;
            this.f24340g = i9;
            int i11 = this.f24335a;
            long clientUserId = UserConfig.getInstance(i11).getClientUserId();
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
            messagesStorage.getStorageQueue().postRunnable(new mf(this, i9, messagesStorage, j10, clientUserId, i10));
            return;
        }
        this.f24338e++;
        this.f24337c = true;
        arrayList.clear();
        c();
    }
}
