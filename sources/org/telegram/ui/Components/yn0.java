package org.telegram.ui.Components;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class yn0 extends tk0 {
    public final org.telegram.ui.ActionBar.p6 f32881c;
    public final List d;
    public final org.telegram.messenger.wp e;
    public final int f32882f;
    public final TLRPC.Peer h;

    public yn0(org.telegram.ui.ActionBar.p6 p6Var, List list, org.telegram.messenger.wp wpVar, int i10, TLRPC.Peer peer) {
        this.f32881c = p6Var;
        this.d = list;
        this.e = wpVar;
        this.f32882f = i10;
        this.h = peer;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.d.size();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        long j10;
        String str;
        co0 co0Var = (co0) c1Var.f47909a;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) this.d.get(i10);
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
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        TLRPC.Peer peer2 = this.h;
        org.telegram.messenger.wp wpVar = this.e;
        boolean z10 = true;
        if (i11 < 0) {
            TLRPC.Chat L0 = wpVar.L0(Long.valueOf(-j10));
            if (L0 != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = L0.title;
                    TextView textView = co0Var.f25195b;
                    sb2.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f32882f - org.telegram.messenger.i0.L(100.0f), TextUtils.TruncateAt.END));
                    sb2.append(" d");
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    dq dqVar = new dq(2131232244, 0);
                    dqVar.f25567n = 1;
                    dqVar.c(org.telegram.messenger.i0.L(14.0f));
                    dqVar.a(org.telegram.ui.ActionBar.t6.C6);
                    spannableString.setSpan(dqVar, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    co0Var.f25195b.setEllipsize(TextUtils.TruncateAt.END);
                    co0Var.f25195b.setText(L0.title);
                }
                TextView textView2 = co0Var.f25196c;
                if (org.telegram.messenger.w3.T(L0) && !L0.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(org.telegram.messenger.dd.G(L0.participants_count, str, new Object[0]));
                co0Var.f25194a.setAvatar(L0);
            }
            mu0 mu0Var = co0Var.f25194a;
            if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
                z10 = false;
            }
            mu0Var.a(z10, false);
            return;
        }
        TLRPC.User Z1 = wpVar.Z1(Long.valueOf(j10));
        if (Z1 != null) {
            co0Var.f25195b.setText(org.telegram.messenger.i20.p(Z1));
            co0Var.f25196c.setText(org.telegram.messenger.dd.L0(2131743375, null));
            co0Var.f25194a.setAvatar(Z1);
        }
        mu0 mu0Var2 = co0Var.f25194a;
        if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
            z10 = false;
        }
        mu0Var2.a(z10, false);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new s4.c1(new co0(viewGroup.getContext(), this.f32881c));
    }
}
