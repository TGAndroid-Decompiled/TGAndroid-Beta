package org.telegram.ui.Components;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class an0 extends tj0 {
    public final org.telegram.ui.ActionBar.e6 f33022c;
    public final List d;
    public final org.telegram.messenger.np f33023e;
    public final int f33024f;
    public final TLRPC.Peer h;

    public an0(org.telegram.ui.ActionBar.e6 e6Var, List list, org.telegram.messenger.np npVar, int i7, TLRPC.Peer peer) {
        this.f33022c = e6Var;
        this.d = list;
        this.f33023e = npVar;
        this.f33024f = i7;
        this.h = peer;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.d.size();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        long j3;
        String str;
        en0 en0Var = (en0) e1Var.f58535a;
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
        org.telegram.messenger.np npVar = this.f33023e;
        boolean z10 = true;
        if (i10 < 0) {
            TLRPC.Chat M0 = npVar.M0(Long.valueOf(-j3));
            if (M0 != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = M0.title;
                    TextView textView = en0Var.f34377b;
                    sb2.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f33024f - org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
                    sb2.append(" d");
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    eq eqVar = new eq(2131232246, 0);
                    eqVar.f34414n = 1;
                    eqVar.c(org.telegram.messenger.g0.L(14.0f));
                    eqVar.a(org.telegram.ui.ActionBar.j6.C6);
                    spannableString.setSpan(eqVar, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    en0Var.f34377b.setEllipsize(TextUtils.TruncateAt.END);
                    en0Var.f34377b.setText(M0.title);
                }
                TextView textView2 = en0Var.f34378c;
                if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(org.telegram.messenger.hd.G(M0.participants_count, str, new Object[0]));
                en0Var.f34376a.setAvatar(M0);
            }
            jt0 jt0Var = en0Var.f34376a;
            if (peer2 == null ? i7 != 0 : peer2.channel_id != peer.channel_id) {
                z10 = false;
            }
            jt0Var.a(z10, false);
            return;
        }
        TLRPC.User a22 = npVar.a2(Long.valueOf(j3));
        if (a22 != null) {
            en0Var.f34377b.setText(org.telegram.messenger.q10.p(a22));
            en0Var.f34378c.setText(org.telegram.messenger.hd.M0(2131743349, null));
            en0Var.f34376a.setAvatar(a22);
        }
        jt0 jt0Var2 = en0Var.f34376a;
        if (peer2 == null ? i7 != 0 : peer2.user_id != peer.user_id) {
            z10 = false;
        }
        jt0Var2.a(z10, false);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return new v4.e1(new en0(viewGroup.getContext(), this.f33022c));
    }
}
