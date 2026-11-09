package org.telegram.ui.Components;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class xm0 extends pj0 {
    public final org.telegram.ui.ActionBar.g6 f40435c;
    public final List d;
    public final org.telegram.messenger.qp f40436e;
    public final int f40437f;
    public final TLRPC.Peer h;

    public xm0(org.telegram.ui.ActionBar.g6 g6Var, List list, org.telegram.messenger.qp qpVar, int i7, TLRPC.Peer peer) {
        this.f40435c = g6Var;
        this.d = list;
        this.f40436e = qpVar;
        this.f40437f = i7;
        this.h = peer;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.d.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        long j3;
        String str;
        bn0 bn0Var = (bn0) d1Var.f57056a;
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
        org.telegram.messenger.qp qpVar = this.f40436e;
        boolean z9 = true;
        if (i10 < 0) {
            TLRPC.Chat M0 = qpVar.M0(Long.valueOf(-j3));
            if (M0 != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = M0.title;
                    TextView textView = bn0Var.f32332b;
                    sb2.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f40437f - org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
                    sb2.append(" d");
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    wp wpVar = new wp(2131232245, 0);
                    wpVar.f40119n = 1;
                    wpVar.c(org.telegram.messenger.g0.L(14.0f));
                    wpVar.a(org.telegram.ui.ActionBar.l6.C6);
                    spannableString.setSpan(wpVar, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    bn0Var.f32332b.setEllipsize(TextUtils.TruncateAt.END);
                    bn0Var.f32332b.setText(M0.title);
                }
                TextView textView2 = bn0Var.f32333c;
                if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(org.telegram.messenger.id.G(M0.participants_count, str, new Object[0]));
                bn0Var.f32331a.setAvatar(M0);
            }
            kt0 kt0Var = bn0Var.f32331a;
            if (peer2 == null ? i7 != 0 : peer2.channel_id != peer.channel_id) {
                z9 = false;
            }
            kt0Var.a(z9, false);
            return;
        }
        TLRPC.User a22 = qpVar.a2(Long.valueOf(j3));
        if (a22 != null) {
            bn0Var.f32332b.setText(org.telegram.messenger.t10.p(a22));
            bn0Var.f32333c.setText(org.telegram.messenger.id.M0(2131743349, null));
            bn0Var.f32331a.setAvatar(a22);
        }
        kt0 kt0Var2 = bn0Var.f32331a;
        if (peer2 == null ? i7 != 0 : peer2.user_id != peer.user_id) {
            z9 = false;
        }
        kt0Var2.a(z9, false);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new bn0(viewGroup.getContext(), this.f40435c));
    }
}
