package org.telegram.ui.Components;

import android.text.SpannableString;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sv0 implements Runnable {
    public final int f39850a;
    public final Object f39851b;
    public final Object f39852c;
    public final Object d;

    public sv0(Object obj, Object obj2, Object obj3, int i7) {
        this.f39850a = i7;
        this.f39851b = obj;
        this.f39852c = obj2;
        this.d = obj3;
    }

    private final void a() {
        q2.j jVar = (q2.j) this.f39851b;
        int i7 = jVar.f55759a;
        x2.g0 g0Var = jVar.f55760b;
        this.f39852c.K(i7, g0Var, (Exception) this.d);
    }

    private final void b() {
        q2.j jVar = (q2.j) this.f39851b;
        int i7 = jVar.f55759a;
        x2.g0 g0Var = jVar.f55760b;
        this.f39852c.c(i7, g0Var, (nb.a) this.d);
    }

    private final void c() {
        SpannableString spannableString = (SpannableString) this.f39851b;
        qi.j.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) ((ji.j) this.f39852c).f17945b);
        ((oi.s2) this.d).run();
    }

    private final void d() {
        SpannableString spannableString = (SpannableString) this.f39851b;
        qi.j.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) ((ji.j) this.f39852c).f17945b);
        ((di.o9) this.d).a(spannableString);
    }

    private final void f() {
        ((wg.u0) this.f39851b).a(new Pair((HashMap) this.f39852c, (ArrayList) this.d));
    }

    private final void g() {
        TLRPC.User c22;
        TLObject tLObject = (TLObject) this.f39851b;
        org.telegram.messenger.mp mpVar = (org.telegram.messenger.mp) this.f39852c;
        wg.u0 u0Var = (wg.u0) this.d;
        if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            mpVar.f4(tL_channels_channelParticipants.users, false);
            mpVar.Z3(tL_channels_channelParticipants.chats, false);
            long e10 = org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24770t0).e();
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < tL_channels_channelParticipants.participants.size(); i7++) {
                TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i7).peer;
                if (peer != null && org.telegram.messenger.fj.B1(peer) != e10 && (c22 = mpVar.c2(Long.valueOf(peer.user_id))) != null && !org.telegram.messenger.o10.y(c22) && !c22.bot) {
                    arrayList.add(mpVar.o1(peer));
                }
            }
            u0Var.a(arrayList);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sv0.run():void");
    }

    public sv0(Object obj, Object obj2, String str, int i7) {
        this.f39850a = i7;
        this.f39851b = obj;
        this.d = obj2;
        this.f39852c = str;
    }
}
