package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class b70 extends org.telegram.ui.ActionBar.w2 {
    public static final int f32131t1 = 0;
    public int l1;
    public final String f32132m1;
    public final org.telegram.ui.ActionBar.f2 n1;
    public final TLRPC.ChatInvite f32133o1;
    public final TLRPC.Chat f32134p1;
    public final TextView f32135q1;
    public final RadialProgressView f32136r1;
    public gc f32137s1;

    public b70(android.content.Context r33, org.telegram.tgnet.TLObject r34, java.lang.String r35, org.telegram.ui.ActionBar.f2 r36, org.telegram.ui.ActionBar.h6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b70.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.f2, org.telegram.ui.ActionBar.h6):void");
    }

    public static CharSequence I0(TextView textView, TLRPC.ChatInvite chatInvite, int i7) {
        String str = chatInvite.participants.get(i7).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), org.telegram.messenger.g0.L(120.0f), TextUtils.TruncateAt.END);
    }

    public static void J0(Context context, org.telegram.ui.ActionBar.f2 f2Var, gc gcVar, boolean z9) {
        String M0;
        if (context == null) {
            if (f2Var != null) {
                f2Var.getContext();
                return;
            }
            return;
        }
        if (gcVar == null) {
            gcVar = gc.a0(f2Var);
        }
        yb ybVar = new yb(context, f2Var.getResourceProvider());
        ybVar.f40544a.f(2131624291, 28, 28, null);
        ybVar.f40545b.setText(org.telegram.messenger.id.M0(2131746161, null));
        if (z9) {
            M0 = org.telegram.messenger.id.M0(2131746171, null);
        } else {
            M0 = org.telegram.messenger.id.M0(2131746167, null);
        }
        ybVar.f40546c.setText(M0);
        gcVar.b(ybVar, 2750).j();
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 == this.l1 && (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, this.I0)) != this.G0) {
                O(w02);
                this.l1 = this.G0;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
