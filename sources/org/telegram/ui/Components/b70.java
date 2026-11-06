package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class b70 extends org.telegram.ui.ActionBar.v2 {
    public static final int f32050q1 = 0;
    public int f32051i1;
    public final String f32052j1;
    public final org.telegram.ui.ActionBar.f2 f32053k1;
    public final TLRPC.ChatInvite l1;
    public final TLRPC.Chat f32054m1;
    public final TextView n1;
    public final RadialProgressView f32055o1;
    public hc f32056p1;

    public b70(android.content.Context r33, org.telegram.tgnet.TLObject r34, java.lang.String r35, org.telegram.ui.ActionBar.f2 r36, org.telegram.ui.ActionBar.f6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b70.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.f2, org.telegram.ui.ActionBar.f6):void");
    }

    public static CharSequence I0(TextView textView, TLRPC.ChatInvite chatInvite, int i7) {
        String str = chatInvite.participants.get(i7).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), org.telegram.messenger.g0.L(120.0f), TextUtils.TruncateAt.END);
    }

    public static void J0(Context context, org.telegram.ui.ActionBar.f2 f2Var, hc hcVar, boolean z9) {
        String M0;
        if (context == null) {
            if (f2Var != null) {
                f2Var.getContext();
                return;
            }
            return;
        }
        if (hcVar == null) {
            hcVar = hc.a0(f2Var);
        }
        zb zbVar = new zb(context, f2Var.getResourceProvider());
        zbVar.f40927a.f(2131624291, 28, 28, null);
        zbVar.f40928b.setText(org.telegram.messenger.hd.M0(2131746162, null));
        if (z9) {
            M0 = org.telegram.messenger.hd.M0(2131746172, null);
        } else {
            M0 = org.telegram.messenger.hd.M0(2131746168, null);
        }
        zbVar.f40929c.setText(M0);
        hcVar.b(zbVar, 2750).j();
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 == this.f32051i1 && (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27849d6, this.I0)) != this.G0) {
                O(w02);
                this.f32051i1 = this.G0;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
