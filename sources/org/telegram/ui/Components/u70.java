package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class u70 extends org.telegram.ui.ActionBar.z2 {
    public static final int f30855q1 = 0;
    public int f30856i1;
    public final String f30857j1;
    public final org.telegram.ui.ActionBar.k2 f30858k1;
    public final TLRPC.ChatInvite l1;
    public final TLRPC.Chat f30859m1;
    public final TextView f30860n1;
    public final RadialProgressView f30861o1;
    public cc f30862p1;

    public u70(android.content.Context r33, org.telegram.tgnet.TLObject r34, java.lang.String r35, org.telegram.ui.ActionBar.k2 r36, org.telegram.ui.ActionBar.p6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u70.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.k2, org.telegram.ui.ActionBar.p6):void");
    }

    public static CharSequence I0(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), org.telegram.messenger.i0.L(120.0f), TextUtils.TruncateAt.END);
    }

    public static void J0(Context context, org.telegram.ui.ActionBar.k2 k2Var, cc ccVar, boolean z10) {
        String L0;
        if (context == null) {
            if (k2Var != null) {
                k2Var.getContext();
                return;
            }
            return;
        }
        if (ccVar == null) {
            ccVar = cc.a0(k2Var);
        }
        tb tbVar = new tb(context, k2Var.getResourceProvider());
        tbVar.f30536a.f(2131624289, 28, 28, null);
        tbVar.f30537b.setText(org.telegram.messenger.cd.L0(2131746178, null));
        if (z10) {
            L0 = org.telegram.messenger.cd.L0(2131746188, null);
        } else {
            L0 = org.telegram.messenger.cd.L0(2131746184, null);
        }
        tbVar.f30538c.setText(L0);
        ccVar.b(tbVar, 2750).j();
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 == this.f30856i1 && (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, this.I0)) != this.G0) {
                P(w02);
                this.f30856i1 = this.G0;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
