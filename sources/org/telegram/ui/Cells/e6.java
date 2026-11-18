package org.telegram.ui.Cells;

import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.bq;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e6 {
    public final int f30561a;
    public boolean f30562b;
    public boolean f30563c;
    public int f30564e;
    public long f30565f;
    public int f30566g;
    public final ArrayList d = new ArrayList();
    public final ArrayList h = new ArrayList();

    public e6(int i7) {
        this.f30561a = i7;
    }

    public static void a(e6 e6Var, TLObject tLObject, tr trVar, long j3, int i7, ArrayList arrayList) {
        ArrayList arrayList2 = e6Var.d;
        int i10 = e6Var.f30561a;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            mp.u1(i10).f4(messages_messages.users, false);
            mp.u1(i10).Z3(messages_messages.chats, false);
            trVar.m1(messages_messages.users, messages_messages.chats, true, true);
            trVar.h1(3, 0, 0, -j3, 0L, messages_messages, false);
            if (i7 == e6Var.f30564e && !messages_messages.messages.isEmpty()) {
                arrayList2.clear();
                Collections.sort(arrayList, Comparator$CC.comparingInt(new bg.d(16)));
                TLRPC.Message message = (TLRPC.Message) i5.c.h(1, messages_messages.messages);
                long j10 = message.grouped_id;
                if (j10 != 0) {
                    ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.Message message2 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Message message3 = message2;
                        if (message3.grouped_id == j10) {
                            arrayList2.add(new fj(i10, message3, false, true));
                        }
                    }
                } else {
                    arrayList2.add(new fj(i10, message, false, true));
                }
                if (!arrayList2.isEmpty()) {
                    e6Var.c();
                }
            }
        } else if (i7 != e6Var.f30564e) {
        } else {
            e6Var.c();
        }
    }

    public static void b(e6 e6Var, final int i7, final ArrayList arrayList, final long j3, int i10, final tr trVar) {
        int i11 = e6Var.f30561a;
        ArrayList arrayList2 = e6Var.d;
        if (i7 != e6Var.f30564e) {
            return;
        }
        if (!arrayList.isEmpty()) {
            arrayList2.clear();
            Collections.sort(arrayList, Comparator$CC.comparingInt(new bg.d(15)));
            TLRPC.Message message = (TLRPC.Message) arrayList.get(arrayList.size() - 1);
            long j10 = message.grouped_id;
            if (j10 != 0) {
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    TLRPC.Message message2 = (TLRPC.Message) obj;
                    if (message2.grouped_id == j10) {
                        arrayList2.add(new fj(i11, message2, false, true));
                    }
                }
            } else {
                arrayList2.add(new fj(i11, message, false, true));
            }
            if (!arrayList2.isEmpty()) {
                e6Var.c();
                return;
            }
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = mp.u1(i11).j1(j3);
        for (int i13 = 10; i13 >= 0; i13--) {
            int i14 = i10 - i13;
            if (i14 >= 0) {
                tL_channels_getMessages.f28443id.add(Integer.valueOf(i14));
            }
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.g3(new bi.l4(e6.this, tLObject, trVar, j3, i7, arrayList, 4));
            }
        });
    }

    public final void c() {
        int i7 = 0;
        this.f30562b = false;
        this.f30563c = true;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
        arrayList.clear();
    }

    public final void d(TLRPC.UserFull userFull) {
        ArrayList arrayList = this.d;
        if (userFull != null && (userFull.flags2 & 64) != 0) {
            long j3 = userFull.personal_channel_id;
            int i7 = userFull.personal_channel_message;
            if (this.f30563c || this.f30562b) {
                if (this.f30565f == j3 && this.f30566g == i7) {
                    return;
                }
                this.f30563c = false;
                arrayList.clear();
            }
            int i10 = this.f30564e + 1;
            this.f30564e = i10;
            this.f30562b = true;
            this.f30565f = j3;
            this.f30566g = i7;
            int i11 = this.f30561a;
            long e10 = j10.i(i11).e();
            tr a02 = tr.a0(i11);
            a02.f27054a.c(new bq(this, i7, a02, j3, e10, i10));
            return;
        }
        this.f30564e++;
        this.f30563c = true;
        arrayList.clear();
        c();
    }
}
