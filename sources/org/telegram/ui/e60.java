package org.telegram.ui;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class e60 extends ActionBarPopupWindow$ActionBarPopupWindowLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.Components.w70 T;
    public final org.telegram.ui.ActionBar.z0 U;
    public final org.telegram.ui.ActionBar.z0 V;
    public final org.telegram.ui.ActionBar.z0 W;
    public final ArrayList f45207a0;
    public final d60 f45208b0;
    public int f45209c0;
    public final org.telegram.messenger.u2 f45210d0;
    public b60 f45211e0;
    public ArrayList f45212f0;
    public final org.telegram.ui.ActionBar.f2 f45213g0;
    public final FrameLayout f45214h0;

    public e60(Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f45207a0 = arrayList;
        this.f45213g0 = f2Var;
        this.f45210d0 = f2Var.getMessagesController().f24880r7;
        setFitItems(true);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232061, org.telegram.messenger.hd.G(1, "Days", new Object[0]), false, null);
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232064, org.telegram.messenger.hd.G(2, "Days", new Object[0]), false, null);
        this.W = c11;
        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232063, org.telegram.messenger.hd.G(1, "Weeks", new Object[0]), false, null);
        org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232062, org.telegram.messenger.hd.G(1, "Months", new Object[0]), false, null);
        this.V = c13;
        org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232087, org.telegram.messenger.hd.M0(2131753851, null), false, null);
        org.telegram.ui.ActionBar.z0 c15 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232108, org.telegram.messenger.hd.M0(2131751543, null), false, null);
        this.U = c15;
        int i7 = org.telegram.ui.ActionBar.k6.f28070p7;
        c15.d(org.telegram.ui.ActionBar.k6.x0(null, i7, false), org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        arrayList.add(new c60(c10, 3));
        arrayList.add(new c60(c11, 6));
        arrayList.add(new c60(c12, 0));
        arrayList.add(new c60(c13, 1));
        arrayList.add(new c60(c14, 2));
        arrayList.add(new c60(c15, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45214h0 = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.H8, frameLayout, null);
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.a0(view, context, 2131231229, org.telegram.ui.ActionBar.k6.f27813b7);
        frameLayout.addView(view, c8.ha.c(-1.0f, -1));
        frameLayout.setTag(2131296437, 1);
        a(frameLayout, c8.ha.o(-1, 8));
        d60 d60Var = new d60(this, context);
        this.f45208b0 = d60Var;
        a(d60Var, c8.ha.o(-1, 48));
        d60Var.setOnClickListener(new org.telegram.ui.Components.t41(19, this, f2Var));
        for (int i10 = 0; i10 < this.f45207a0.size(); i10++) {
            ((c60) this.f45207a0.get(i10)).f44702a.setOnClickListener(new ai.v(this, ((c60) this.f45207a0.get(i10)).f44703b, 24));
        }
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(context, null);
        this.T = w70Var;
        w70Var.setTag(2131296437, 1);
        w70Var.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        w70Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.E8, null);
        w70Var.setMovementMethod(LinkMovementMethod.getInstance());
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.J6, null);
        w70Var.setText(org.telegram.messenger.hd.M0(2131749056, null));
        a(w70Var, c8.ha.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void g() {
        if (this.f45212f0 != null) {
            this.f45208b0.f44965b.setTranslationX((3 - Math.min(3, this.f45212f0.size())) * org.telegram.messenger.g0.L(12.0f));
        }
    }

    public final void h(boolean z9) {
        int i7;
        this.f45209c0 = -1;
        this.f45214h0.setVisibility(0);
        if (z9) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        this.U.setVisibility(i7);
        this.T.setVisibility(0);
        this.f45208b0.setVisibility(8);
    }

    public void setCallback(b60 b60Var) {
        this.f45211e0 = b60Var;
    }

    @Override
    public final void updateColors() {
        try {
            org.telegram.ui.ActionBar.z0 z0Var = this.U;
            if (z0Var != null) {
                int i7 = org.telegram.ui.ActionBar.k6.f28070p7;
                z0Var.d(org.telegram.ui.ActionBar.k6.x0(null, i7, false), org.telegram.ui.ActionBar.k6.x0(null, i7, false));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
