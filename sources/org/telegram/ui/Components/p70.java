package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class p70 extends org.telegram.ui.ActionBar.x2 {
    public static final int f38303u1 = 0;
    public int f38304m1;
    public final String n1;
    public final org.telegram.ui.ActionBar.h2 f38305o1;
    public final TLRPC.ChatInvite f38306p1;
    public final TLRPC.Chat f38307q1;
    public final TextView f38308r1;
    public final RadialProgressView f38309s1;
    public lc f38310t1;

    public p70(android.content.Context r33, org.telegram.tgnet.TLObject r34, java.lang.String r35, org.telegram.ui.ActionBar.h2 r36, org.telegram.ui.ActionBar.i6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p70.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.h2, org.telegram.ui.ActionBar.i6):void");
    }

    public static CharSequence J0(TextView textView, TLRPC.ChatInvite chatInvite, int i7) {
        String str = chatInvite.participants.get(i7).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), org.telegram.messenger.g0.L(120.0f), TextUtils.TruncateAt.END);
    }

    public static void K0(Context context, org.telegram.ui.ActionBar.h2 h2Var, lc lcVar, boolean z10) {
        String M0;
        if (context == null) {
            if (h2Var != null) {
                h2Var.getContext();
                return;
            }
            return;
        }
        if (lcVar == null) {
            lcVar = lc.b0(h2Var);
        }
        dc dcVar = new dc(context, h2Var.getResourceProvider());
        dcVar.f34369a.f(2131624292, 28, 28, null);
        dcVar.f34370b.setText(org.telegram.messenger.gd.M0(2131745966, null));
        if (z10) {
            M0 = org.telegram.messenger.gd.M0(2131745976, null);
        } else {
            M0 = org.telegram.messenger.gd.M0(2131745972, null);
        }
        dcVar.f34371c.setText(M0);
        lcVar.b(dcVar, 2750).j();
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.H0 == this.f38304m1 && (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394d6, this.J0)) != this.H0) {
                P(w02);
                this.f38304m1 = this.H0;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
