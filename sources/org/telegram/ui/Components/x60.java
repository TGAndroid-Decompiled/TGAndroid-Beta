package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class x60 extends org.telegram.ui.ActionBar.t2 {
    public static final int f40246r1 = 0;
    public int f40247j1;
    public final String k1;
    public final org.telegram.ui.ActionBar.d2 f40248l1;
    public final TLRPC.ChatInvite m1;
    public final TLRPC.Chat f40249n1;
    public final TextView f40250o1;
    public final RadialProgressView f40251p1;
    public fc f40252q1;

    public x60(android.content.Context r33, org.telegram.tgnet.TLObject r34, java.lang.String r35, org.telegram.ui.ActionBar.d2 r36, org.telegram.ui.ActionBar.e6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x60.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.d2, org.telegram.ui.ActionBar.e6):void");
    }

    public static CharSequence I0(TextView textView, TLRPC.ChatInvite chatInvite, int i3) {
        String str = chatInvite.participants.get(i3).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), org.telegram.messenger.g0.L(120.0f), TextUtils.TruncateAt.END);
    }

    public static void J0(Context context, org.telegram.ui.ActionBar.d2 d2Var, fc fcVar, boolean z10) {
        String M0;
        if (context == null) {
            if (d2Var != null) {
                d2Var.getContext();
                return;
            }
            return;
        }
        if (fcVar == null) {
            fcVar = fc.a0(d2Var);
        }
        xb xbVar = new xb(context, d2Var.getResourceProvider());
        xbVar.f40302a.f(2131624291, 28, 28, null);
        xbVar.f40303b.setText(org.telegram.messenger.bd.M0(2131746171, null));
        if (z10) {
            M0 = org.telegram.messenger.bd.M0(2131746181, null);
        } else {
            M0 = org.telegram.messenger.bd.M0(2131746177, null);
        }
        xbVar.f40304c.setText(M0);
        fcVar.b(xbVar, 2750).j();
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.H0 == this.f40247j1 && (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.J0)) != this.H0) {
                O(w02);
                this.f40247j1 = this.H0;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
