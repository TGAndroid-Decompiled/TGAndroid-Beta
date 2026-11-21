package org.telegram.ui.Components;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class ln0 extends dk0 {
    public final org.telegram.ui.ActionBar.h6 f37240c;
    public final List d;
    public final org.telegram.messenger.mp f37241e;
    public final int f37242f;
    public final TLRPC.Peer h;

    public ln0(org.telegram.ui.ActionBar.h6 h6Var, List list, org.telegram.messenger.mp mpVar, int i7, TLRPC.Peer peer) {
        this.f37240c = h6Var;
        this.d = list;
        this.f37241e = mpVar;
        this.f37242f = i7;
        this.h = peer;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.d.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        long j3;
        String str;
        pn0 pn0Var = (pn0) f1Var.f59161a;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) this.d.get(i7);
        TLRPC.Peer peer = tL_sendAsPeer.peer;
        long j10 = peer.channel_id;
        if (j10 != 0) {
            j3 = -j10;
        } else {
            j3 = 0;
        }
        if (j3 == 0) {
            long j11 = peer.user_id;
            if (j11 != 0) {
                j3 = j11;
            }
        }
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        TLRPC.Peer peer2 = this.h;
        org.telegram.messenger.mp mpVar = this.f37241e;
        boolean z10 = true;
        if (i10 < 0) {
            TLRPC.Chat O0 = mpVar.O0(Long.valueOf(-j3));
            if (O0 != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = O0.title;
                    TextView textView = pn0Var.f38645b;
                    sb2.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f37242f - org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
                    sb2.append(" d");
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    nq nqVar = new nq(2131232247, 0);
                    nqVar.f37945n = 1;
                    nqVar.c(org.telegram.messenger.g0.L(14.0f));
                    nqVar.a(org.telegram.ui.ActionBar.m6.C6);
                    spannableString.setSpan(nqVar, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    pn0Var.f38645b.setEllipsize(TextUtils.TruncateAt.END);
                    pn0Var.f38645b.setText(O0.title);
                }
                TextView textView2 = pn0Var.f38646c;
                if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(org.telegram.messenger.gd.G(O0.participants_count, str, new Object[0]));
                pn0Var.f38644a.setAvatar(O0);
            }
            ut0 ut0Var = pn0Var.f38644a;
            if (peer2 == null ? i7 != 0 : peer2.channel_id != peer.channel_id) {
                z10 = false;
            }
            ut0Var.a(z10, false);
            return;
        }
        TLRPC.User c22 = mpVar.c2(Long.valueOf(j3));
        if (c22 != null) {
            pn0Var.f38645b.setText(org.telegram.messenger.o10.q(c22));
            pn0Var.f38646c.setText(org.telegram.messenger.gd.N0(2131743106, null));
            pn0Var.f38644a.setAvatar(c22);
        }
        ut0 ut0Var2 = pn0Var.f38644a;
        if (peer2 == null ? i7 != 0 : peer2.user_id != peer.user_id) {
            z10 = false;
        }
        ut0Var2.a(z10, false);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new v4.f1(new pn0(viewGroup.getContext(), this.f37240c));
    }
}
