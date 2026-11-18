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
public final class f6 {
    public final int f30613a;
    public boolean f30614b;
    public boolean f30615c;
    public int f30616e;
    public long f30617f;
    public int f30618g;
    public final ArrayList d = new ArrayList();
    public final ArrayList h = new ArrayList();

    public f6(int i7) {
        this.f30613a = i7;
    }

    public static void a(f6 f6Var, TLObject tLObject, tr trVar, long j3, int i7, ArrayList arrayList) {
        ArrayList arrayList2 = f6Var.d;
        int i10 = f6Var.f30613a;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            mp.u1(i10).f4(messages_messages.users, false);
            mp.u1(i10).Z3(messages_messages.chats, false);
            trVar.m1(messages_messages.users, messages_messages.chats, true, true);
            trVar.h1(3, 0, 0, -j3, 0L, messages_messages, false);
            if (i7 == f6Var.f30616e && !messages_messages.messages.isEmpty()) {
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
                    f6Var.c();
                }
            }
        } else if (i7 != f6Var.f30616e) {
        } else {
            f6Var.c();
        }
    }

    public static void b(f6 f6Var, final int i7, final ArrayList arrayList, final long j3, int i10, final tr trVar) {
        int i11 = f6Var.f30613a;
        ArrayList arrayList2 = f6Var.d;
        if (i7 != f6Var.f30616e) {
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
                f6Var.c();
                return;
            }
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = mp.u1(i11).j1(j3);
        for (int i13 = 10; i13 >= 0; i13--) {
            int i14 = i10 - i13;
            if (i14 >= 0) {
                tL_channels_getMessages.f28441id.add(Integer.valueOf(i14));
            }
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.g3(new bi.l4(f6.this, tLObject, trVar, j3, i7, arrayList, 4));
            }
        });
    }

    public final void c() {
        int i7 = 0;
        this.f30614b = false;
        this.f30615c = true;
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
            if (this.f30615c || this.f30614b) {
                if (this.f30617f == j3 && this.f30618g == i7) {
                    return;
                }
                this.f30615c = false;
                arrayList.clear();
            }
            int i10 = this.f30616e + 1;
            this.f30616e = i10;
            this.f30614b = true;
            this.f30617f = j3;
            this.f30618g = i7;
            int i11 = this.f30613a;
            long e10 = j10.i(i11).e();
            tr a02 = tr.a0(i11);
            a02.f27052a.c(new bq(this, i7, a02, j3, e10, i10));
            return;
        }
        this.f30616e++;
        this.f30615c = true;
        arrayList.clear();
        c();
    }
}
