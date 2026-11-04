package org.telegram.ui.Components;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class zm0 extends sj0 {
    public final org.telegram.ui.ActionBar.e6 f41074c;
    public final List d;
    public final org.telegram.messenger.hp f41075e;
    public final int f41076f;
    public final TLRPC.Peer h;

    public zm0(org.telegram.ui.ActionBar.e6 e6Var, List list, org.telegram.messenger.hp hpVar, int i3, TLRPC.Peer peer) {
        this.f41074c = e6Var;
        this.d = list;
        this.f41075e = hpVar;
        this.f41076f = i3;
        this.h = peer;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.d.size();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        long j10;
        String str;
        dn0 dn0Var = (dn0) d1Var.f55540a;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) this.d.get(i3);
        TLRPC.Peer peer = tL_sendAsPeer.peer;
        long j11 = peer.channel_id;
        if (j11 != 0) {
            j10 = -j11;
        } else {
            j10 = 0;
        }
        if (j10 == 0) {
            long j12 = peer.user_id;
            if (j12 != 0) {
                j10 = j12;
            }
        }
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        TLRPC.Peer peer2 = this.h;
        org.telegram.messenger.hp hpVar = this.f41075e;
        boolean z10 = true;
        if (i10 < 0) {
            TLRPC.Chat M0 = hpVar.M0(Long.valueOf(-j10));
            if (M0 != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = M0.title;
                    TextView textView = dn0Var.f33170b;
                    sb2.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f41076f - org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
                    sb2.append(" d");
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    wp wpVar = new wp(2131232245, 0);
                    wpVar.f40044n = 1;
                    wpVar.c(org.telegram.messenger.g0.L(14.0f));
                    wpVar.a(org.telegram.ui.ActionBar.k6.C6);
                    spannableString.setSpan(wpVar, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    dn0Var.f33170b.setEllipsize(TextUtils.TruncateAt.END);
                    dn0Var.f33170b.setText(M0.title);
                }
                TextView textView2 = dn0Var.f33171c;
                if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(org.telegram.messenger.bd.G(M0.participants_count, str, new Object[0]));
                dn0Var.f33169a.setAvatar(M0);
            }
            ht0 ht0Var = dn0Var.f33169a;
            if (peer2 == null ? i3 != 0 : peer2.channel_id != peer.channel_id) {
                z10 = false;
            }
            ht0Var.a(z10, false);
            return;
        }
        TLRPC.User a22 = hpVar.a2(Long.valueOf(j10));
        if (a22 != null) {
            dn0Var.f33170b.setText(org.telegram.messenger.l10.p(a22));
            dn0Var.f33171c.setText(org.telegram.messenger.bd.M0(2131743359, null));
            dn0Var.f33169a.setAvatar(a22);
        }
        ht0 ht0Var2 = dn0Var.f33169a;
        if (peer2 == null ? i3 != 0 : peer2.user_id != peer.user_id) {
            z10 = false;
        }
        ht0Var2.a(z10, false);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        return new u4.d1(new dn0(viewGroup.getContext(), this.f41074c));
    }
}
