package org.telegram.ui;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class g60 extends ActionBarPopupWindow$ActionBarPopupWindowLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.x70 T;
    public final org.telegram.ui.ActionBar.z0 U;
    public final org.telegram.ui.ActionBar.z0 V;
    public final org.telegram.ui.ActionBar.z0 W;
    public final ArrayList f45913a0;
    public final f60 f45914b0;
    public int f45915c0;
    public final org.telegram.messenger.u2 f45916d0;
    public d60 f45917e0;
    public ArrayList f45918f0;
    public final org.telegram.ui.ActionBar.f2 f45919g0;
    public final FrameLayout f45920h0;

    public g60(Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f45913a0 = arrayList;
        this.f45919g0 = f2Var;
        this.f45916d0 = f2Var.getMessagesController().f24887r7;
        setFitItems(true);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232061, org.telegram.messenger.id.G(1, "Days", new Object[0]), false, null);
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232064, org.telegram.messenger.id.G(2, "Days", new Object[0]), false, null);
        this.W = c11;
        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232063, org.telegram.messenger.id.G(1, "Weeks", new Object[0]), false, null);
        org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232062, org.telegram.messenger.id.G(1, "Months", new Object[0]), false, null);
        this.V = c13;
        org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232087, org.telegram.messenger.id.M0(2131753851, null), false, null);
        org.telegram.ui.ActionBar.z0 c15 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232108, org.telegram.messenger.id.M0(2131751542, null), false, null);
        this.U = c15;
        int i7 = org.telegram.ui.ActionBar.l6.f28086p7;
        c15.d(org.telegram.ui.ActionBar.l6.x0(null, i7, false), org.telegram.ui.ActionBar.l6.x0(null, i7, false));
        arrayList.add(new e60(c10, 3));
        arrayList.add(new e60(c11, 6));
        arrayList.add(new e60(c12, 0));
        arrayList.add(new e60(c13, 1));
        arrayList.add(new e60(c14, 2));
        arrayList.add(new e60(c15, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45920h0 = frameLayout;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.H8, frameLayout, null);
        View view = new View(context);
        org.telegram.ui.ActionBar.s6.Z(view, context, 2131231229, org.telegram.ui.ActionBar.l6.f27829b7);
        frameLayout.addView(view, c8.ha.c(-1.0f, -1));
        frameLayout.setTag(2131296437, 1);
        a(frameLayout, c8.ha.o(-1, 8));
        f60 f60Var = new f60(this, context);
        this.f45914b0 = f60Var;
        a(f60Var, c8.ha.o(-1, 48));
        f60Var.setOnClickListener(new org.telegram.ui.Components.u41(19, this, f2Var));
        for (int i10 = 0; i10 < this.f45913a0.size(); i10++) {
            ((e60) this.f45913a0.get(i10)).f45305a.setOnClickListener(new ai.v(this, ((e60) this.f45913a0.get(i10)).f45306b, 24));
        }
        org.telegram.ui.Components.x70 x70Var = new org.telegram.ui.Components.x70(context, null);
        this.T = x70Var;
        x70Var.setTag(2131296437, 1);
        x70Var.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        x70Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.s6.U(x70Var, org.telegram.ui.ActionBar.l6.E8, null);
        x70Var.setMovementMethod(LinkMovementMethod.getInstance());
        org.telegram.ui.ActionBar.s6.G(x70Var, org.telegram.ui.ActionBar.l6.J6, null);
        x70Var.setText(org.telegram.messenger.id.M0(2131749057, null));
        a(x70Var, c8.ha.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void g() {
        if (this.f45918f0 != null) {
            this.f45914b0.f45600b.setTranslationX((3 - Math.min(3, this.f45918f0.size())) * org.telegram.messenger.g0.L(12.0f));
        }
    }

    public final void h(boolean z9) {
        int i7;
        this.f45915c0 = -1;
        this.f45920h0.setVisibility(0);
        if (z9) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        this.U.setVisibility(i7);
        this.T.setVisibility(0);
        this.f45914b0.setVisibility(8);
    }

    public void setCallback(d60 d60Var) {
        this.f45917e0 = d60Var;
    }

    @Override
    public final void updateColors() {
        try {
            org.telegram.ui.ActionBar.z0 z0Var = this.U;
            if (z0Var != null) {
                int i7 = org.telegram.ui.ActionBar.l6.f28086p7;
                z0Var.d(org.telegram.ui.ActionBar.l6.x0(null, i7, false), org.telegram.ui.ActionBar.l6.x0(null, i7, false));
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
