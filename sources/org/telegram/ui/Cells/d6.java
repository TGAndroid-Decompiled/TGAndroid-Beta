package org.telegram.ui.Cells;

import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.qr;
import org.telegram.messenger.xp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d6 {
    public final int f29082a;
    public boolean f29083b;
    public boolean f29084c;
    public int f29085e;
    public long f29086f;
    public int f29087g;
    public final ArrayList d = new ArrayList();
    public final ArrayList h = new ArrayList();

    public d6(int i3) {
        this.f29082a = i3;
    }

    public static void a(d6 d6Var, TLObject tLObject, qr qrVar, long j10, int i3, ArrayList arrayList) {
        ArrayList arrayList2 = d6Var.d;
        int i10 = d6Var.f29082a;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            hp.s1(i10).Y3(messages_messages.users, false);
            hp.s1(i10).S3(messages_messages.chats, false);
            qrVar.m1(messages_messages.users, messages_messages.chats, true, true);
            qrVar.h1(3, 0, 0, -j10, 0L, messages_messages, false);
            if (i3 == d6Var.f29085e && !messages_messages.messages.isEmpty()) {
                arrayList2.clear();
                Collections.sort(arrayList, Comparator$CC.comparingInt(new cg.d(16)));
                TLRPC.Message message = (TLRPC.Message) k2.p1.h(1, messages_messages.messages);
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
                            arrayList2.add(new zi(i10, message3, false, true));
                        }
                    }
                } else {
                    arrayList2.add(new zi(i10, message, false, true));
                }
                if (!arrayList2.isEmpty()) {
                    d6Var.c();
                }
            }
        } else if (i3 != d6Var.f29085e) {
        } else {
            d6Var.c();
        }
    }

    public static void b(final d6 d6Var, final int i3, final ArrayList arrayList, final long j10, int i10, final qr qrVar) {
        int i11 = d6Var.f29082a;
        ArrayList arrayList2 = d6Var.d;
        if (i3 != d6Var.f29085e) {
            return;
        }
        if (!arrayList.isEmpty()) {
            arrayList2.clear();
            Collections.sort(arrayList, Comparator$CC.comparingInt(new cg.d(15)));
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
                        arrayList2.add(new zi(i11, message2, false, true));
                    }
                }
            } else {
                arrayList2.add(new zi(i11, message, false, true));
            }
            if (!arrayList2.isEmpty()) {
                d6Var.c();
                return;
            }
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = hp.s1(i11).h1(j10);
        for (int i13 = 10; i13 >= 0; i13--) {
            int i14 = i10 - i13;
            if (i14 >= 0) {
                tL_channels_getMessages.f27039id.add(Integer.valueOf(i14));
            }
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.h3(new ci.d8(d6.this, tLObject, qrVar, j10, i3, arrayList));
            }
        });
    }

    public final void c() {
        int i3 = 0;
        this.f29083b = false;
        this.f29084c = true;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((Runnable) obj).run();
        }
        arrayList.clear();
    }

    public final void d(TLRPC.UserFull userFull) {
        ArrayList arrayList = this.d;
        if (userFull != null && (userFull.flags2 & 64) != 0) {
            long j10 = userFull.personal_channel_id;
            int i3 = userFull.personal_channel_message;
            if (this.f29084c || this.f29083b) {
                if (this.f29086f == j10 && this.f29087g == i3) {
                    return;
                }
                this.f29084c = false;
                arrayList.clear();
            }
            int i10 = this.f29085e + 1;
            this.f29085e = i10;
            this.f29083b = true;
            this.f29086f = j10;
            this.f29087g = i3;
            int i11 = this.f29082a;
            long e10 = h10.i(i11).e();
            qr a02 = qr.a0(i11);
            a02.f24934a.c(new xp(this, i3, a02, j10, e10, i10));
            return;
        }
        this.f29085e++;
        this.f29084c = true;
        arrayList.clear();
        c();
    }
}
