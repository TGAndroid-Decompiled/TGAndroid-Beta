package org.telegram.ui.Components;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class wm0 extends oj0 {
    public final org.telegram.ui.ActionBar.f6 f40002c;
    public final List d;
    public final org.telegram.messenger.qp f40003e;
    public final int f40004f;
    public final TLRPC.Peer h;

    public wm0(org.telegram.ui.ActionBar.f6 f6Var, List list, org.telegram.messenger.qp qpVar, int i7, TLRPC.Peer peer) {
        this.f40002c = f6Var;
        this.d = list;
        this.f40003e = qpVar;
        this.f40004f = i7;
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
        an0 an0Var = (an0) d1Var.f57043a;
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
        org.telegram.messenger.qp qpVar = this.f40003e;
        boolean z9 = true;
        if (i10 < 0) {
            TLRPC.Chat M0 = qpVar.M0(Long.valueOf(-j3));
            if (M0 != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = M0.title;
                    TextView textView = an0Var.f31866b;
                    sb2.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f40004f - org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
                    sb2.append(" d");
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    wp wpVar = new wp(2131232245, 0);
                    wpVar.f40019n = 1;
                    wpVar.c(org.telegram.messenger.g0.L(14.0f));
                    wpVar.a(org.telegram.ui.ActionBar.k6.C6);
                    spannableString.setSpan(wpVar, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    an0Var.f31866b.setEllipsize(TextUtils.TruncateAt.END);
                    an0Var.f31866b.setText(M0.title);
                }
                TextView textView2 = an0Var.f31867c;
                if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(org.telegram.messenger.id.G(M0.participants_count, str, new Object[0]));
                an0Var.f31865a.setAvatar(M0);
            }
            it0 it0Var = an0Var.f31865a;
            if (peer2 == null ? i7 != 0 : peer2.channel_id != peer.channel_id) {
                z9 = false;
            }
            it0Var.a(z9, false);
            return;
        }
        TLRPC.User a22 = qpVar.a2(Long.valueOf(j3));
        if (a22 != null) {
            an0Var.f31866b.setText(org.telegram.messenger.t10.p(a22));
            an0Var.f31867c.setText(org.telegram.messenger.id.M0(2131743352, null));
            an0Var.f31865a.setAvatar(a22);
        }
        it0 it0Var2 = an0Var.f31865a;
        if (peer2 == null ? i7 != 0 : peer2.user_id != peer.user_id) {
            z9 = false;
        }
        it0Var2.a(z9, false);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new an0(viewGroup.getContext(), this.f40002c));
    }
}
