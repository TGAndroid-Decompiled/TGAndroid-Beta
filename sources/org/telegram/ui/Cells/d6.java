package org.telegram.ui.Cells;

import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.cq;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d6 {
    public final int f30140a;
    public boolean f30141b;
    public boolean f30142c;
    public int f30143e;
    public long f30144f;
    public int f30145g;
    public final ArrayList d = new ArrayList();
    public final ArrayList h = new ArrayList();

    public d6(int i7) {
        this.f30140a = i7;
    }

    public static void a(d6 d6Var, TLObject tLObject, vr vrVar, long j3, int i7, ArrayList arrayList) {
        ArrayList arrayList2 = d6Var.d;
        int i10 = d6Var.f30140a;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            np.s1(i10).Y3(messages_messages.users, false);
            np.s1(i10).S3(messages_messages.chats, false);
            vrVar.m1(messages_messages.users, messages_messages.chats, true, true);
            vrVar.h1(3, 0, 0, -j3, 0L, messages_messages, false);
            if (i7 == d6Var.f30143e && !messages_messages.messages.isEmpty()) {
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
                            arrayList2.add(new gj(i10, message3, false, true));
                        }
                    }
                } else {
                    arrayList2.add(new gj(i10, message, false, true));
                }
                if (!arrayList2.isEmpty()) {
                    d6Var.c();
                }
            }
        } else if (i7 != d6Var.f30143e) {
        } else {
            d6Var.c();
        }
    }

    public static void b(d6 d6Var, final int i7, final ArrayList arrayList, final long j3, int i10, final vr vrVar) {
        int i11 = d6Var.f30140a;
        ArrayList arrayList2 = d6Var.d;
        if (i7 != d6Var.f30143e) {
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
                        arrayList2.add(new gj(i11, message2, false, true));
                    }
                }
            } else {
                arrayList2.add(new gj(i11, message, false, true));
            }
            if (!arrayList2.isEmpty()) {
                d6Var.c();
                return;
            }
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = np.s1(i11).h1(j3);
        for (int i13 = 10; i13 >= 0; i13--) {
            int i14 = i10 - i13;
            if (i14 >= 0) {
                tL_channels_getMessages.f28089id.add(Integer.valueOf(i14));
            }
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.h3(new di.u7(d6.this, tLObject, vrVar, j3, i7, arrayList));
            }
        });
    }

    public final void c() {
        int i7 = 0;
        this.f30141b = false;
        this.f30142c = true;
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
            if (this.f30142c || this.f30141b) {
                if (this.f30144f == j3 && this.f30145g == i7) {
                    return;
                }
                this.f30142c = false;
                arrayList.clear();
            }
            int i10 = this.f30143e + 1;
            this.f30143e = i10;
            this.f30141b = true;
            this.f30144f = j3;
            this.f30145g = i7;
            int i11 = this.f30140a;
            long e10 = m10.i(i11).e();
            vr a02 = vr.a0(i11);
            a02.f27219a.c(new cq(this, i7, a02, j3, e10, i10));
            return;
        }
        this.f30143e++;
        this.f30142c = true;
        arrayList.clear();
        c();
    }
}
