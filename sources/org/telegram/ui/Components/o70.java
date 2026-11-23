package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class o70 extends org.telegram.ui.ActionBar.w2 {
    public static final int f38051u1 = 0;
    public int f38052m1;
    public final String n1;
    public final org.telegram.ui.ActionBar.g2 f38053o1;
    public final TLRPC.ChatInvite f38054p1;
    public final TLRPC.Chat f38055q1;
    public final TextView f38056r1;
    public final RadialProgressView f38057s1;
    public kc f38058t1;

    public o70(android.content.Context r33, org.telegram.tgnet.TLObject r34, java.lang.String r35, org.telegram.ui.ActionBar.g2 r36, org.telegram.ui.ActionBar.i6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o70.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.g2, org.telegram.ui.ActionBar.i6):void");
    }

    public static CharSequence J0(TextView textView, TLRPC.ChatInvite chatInvite, int i7) {
        String str = chatInvite.participants.get(i7).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), org.telegram.messenger.g0.L(120.0f), TextUtils.TruncateAt.END);
    }

    public static void K0(Context context, org.telegram.ui.ActionBar.g2 g2Var, kc kcVar, boolean z10) {
        String N0;
        if (context == null) {
            if (g2Var != null) {
                g2Var.getContext();
                return;
            }
            return;
        }
        if (kcVar == null) {
            kcVar = kc.b0(g2Var);
        }
        cc ccVar = new cc(context, g2Var.getResourceProvider());
        ccVar.f34012a.f(2131624292, 28, 28, null);
        ccVar.f34013b.setText(org.telegram.messenger.gd.N0(2131745965, null));
        if (z10) {
            N0 = org.telegram.messenger.gd.N0(2131745975, null);
        } else {
            N0 = org.telegram.messenger.gd.N0(2131745971, null);
        }
        ccVar.f34014c.setText(N0);
        kcVar.b(ccVar, 2750).j();
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.H0 == this.f38052m1 && (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, this.J0)) != this.H0) {
                P(w02);
                this.f38052m1 = this.H0;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
