package org.telegram.ui.Components;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class ln0 extends dk0 {
    public final org.telegram.ui.ActionBar.h6 f37245c;
    public final List d;
    public final org.telegram.messenger.np f37246e;
    public final int f37247f;
    public final TLRPC.Peer h;

    public ln0(org.telegram.ui.ActionBar.h6 h6Var, List list, org.telegram.messenger.np npVar, int i7, TLRPC.Peer peer) {
        this.f37245c = h6Var;
        this.d = list;
        this.f37246e = npVar;
        this.f37247f = i7;
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
        pn0 pn0Var = (pn0) f1Var.f59165a;
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
        org.telegram.messenger.np npVar = this.f37246e;
        boolean z10 = true;
        if (i10 < 0) {
            TLRPC.Chat O0 = npVar.O0(Long.valueOf(-j3));
            if (O0 != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = O0.title;
                    TextView textView = pn0Var.f38643b;
                    sb2.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f37247f - org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
                    sb2.append(" d");
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    nq nqVar = new nq(2131232247, 0);
                    nqVar.f37949n = 1;
                    nqVar.c(org.telegram.messenger.g0.L(14.0f));
                    nqVar.a(org.telegram.ui.ActionBar.m6.C6);
                    spannableString.setSpan(nqVar, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    pn0Var.f38643b.setEllipsize(TextUtils.TruncateAt.END);
                    pn0Var.f38643b.setText(O0.title);
                }
                TextView textView2 = pn0Var.f38644c;
                if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(org.telegram.messenger.hd.G(O0.participants_count, str, new Object[0]));
                pn0Var.f38642a.setAvatar(O0);
            }
            ut0 ut0Var = pn0Var.f38642a;
            if (peer2 == null ? i7 != 0 : peer2.channel_id != peer.channel_id) {
                z10 = false;
            }
            ut0Var.a(z10, false);
            return;
        }
        TLRPC.User c22 = npVar.c2(Long.valueOf(j3));
        if (c22 != null) {
            pn0Var.f38643b.setText(org.telegram.messenger.p10.q(c22));
            pn0Var.f38644c.setText(org.telegram.messenger.hd.N0(2131743104, null));
            pn0Var.f38642a.setAvatar(c22);
        }
        ut0 ut0Var2 = pn0Var.f38642a;
        if (peer2 == null ? i7 != 0 : peer2.user_id != peer.user_id) {
            z10 = false;
        }
        ut0Var2.a(z10, false);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new v4.f1(new pn0(viewGroup.getContext(), this.f37245c));
    }
}
