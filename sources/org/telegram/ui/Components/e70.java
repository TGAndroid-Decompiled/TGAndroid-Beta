package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class e70 extends org.telegram.ui.ActionBar.u2 {
    public static final int f34228u1 = 0;
    public int f34229m1;
    public final String n1;
    public final org.telegram.ui.ActionBar.e2 f34230o1;
    public final TLRPC.ChatInvite f34231p1;
    public final TLRPC.Chat f34232q1;
    public final TextView f34233r1;
    public final RadialProgressView f34234s1;
    public cc f34235t1;

    public e70(android.content.Context r33, org.telegram.tgnet.TLObject r34, java.lang.String r35, org.telegram.ui.ActionBar.e2 r36, org.telegram.ui.ActionBar.e6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e70.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.e2, org.telegram.ui.ActionBar.e6):void");
    }

    public static CharSequence I0(TextView textView, TLRPC.ChatInvite chatInvite, int i7) {
        String str = chatInvite.participants.get(i7).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), org.telegram.messenger.g0.L(120.0f), TextUtils.TruncateAt.END);
    }

    public static void J0(Context context, org.telegram.ui.ActionBar.e2 e2Var, cc ccVar, boolean z10) {
        String M0;
        if (context == null) {
            if (e2Var != null) {
                e2Var.getContext();
                return;
            }
            return;
        }
        if (ccVar == null) {
            ccVar = cc.a0(e2Var);
        }
        ub ubVar = new ub(context, e2Var.getResourceProvider());
        ubVar.f39987a.f(2131624292, 28, 28, null);
        ubVar.f39988b.setText(org.telegram.messenger.hd.M0(2131746161, null));
        if (z10) {
            M0 = org.telegram.messenger.hd.M0(2131746171, null);
        } else {
            M0 = org.telegram.messenger.hd.M0(2131746167, null);
        }
        ubVar.f39989c.setText(M0);
        ccVar.b(ubVar, 2750).j();
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.H0 == this.f34229m1 && (w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.J0)) != this.H0) {
                P(w02);
                this.f34229m1 = this.H0;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
