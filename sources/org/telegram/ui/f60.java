package org.telegram.ui;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class f60 extends ActionBarPopupWindow$ActionBarPopupWindowLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.k80 U;
    public final org.telegram.ui.ActionBar.z0 V;
    public final org.telegram.ui.ActionBar.z0 W;
    public final org.telegram.ui.ActionBar.z0 f47537a0;
    public final ArrayList f47538b0;
    public final e60 f47539c0;
    public int f47540d0;
    public final org.telegram.messenger.v2 f47541e0;
    public c60 f47542f0;
    public ArrayList f47543g0;
    public final org.telegram.ui.ActionBar.h2 f47544h0;
    public final FrameLayout f47545i0;

    public f60(Context context, org.telegram.ui.ActionBar.h2 h2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f47538b0 = arrayList;
        this.f47544h0 = h2Var;
        this.f47541e0 = h2Var.getMessagesController().f25778u7;
        setFitItems(true);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232063, org.telegram.messenger.gd.G(1, "Days", new Object[0]), false, null);
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232066, org.telegram.messenger.gd.G(2, "Days", new Object[0]), false, null);
        this.f47537a0 = c11;
        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232065, org.telegram.messenger.gd.G(1, "Weeks", new Object[0]), false, null);
        org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232064, org.telegram.messenger.gd.G(1, "Months", new Object[0]), false, null);
        this.W = c13;
        org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232089, org.telegram.messenger.gd.M0(2131753849, null), false, null);
        org.telegram.ui.ActionBar.z0 c15 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232110, org.telegram.messenger.gd.M0(2131751531, null), false, null);
        this.V = c15;
        int i7 = org.telegram.ui.ActionBar.n6.f29615p7;
        c15.d(org.telegram.ui.ActionBar.n6.x0(null, i7, false), org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        arrayList.add(new d60(c10, 3));
        arrayList.add(new d60(c11, 6));
        arrayList.add(new d60(c12, 0));
        arrayList.add(new d60(c13, 1));
        arrayList.add(new d60(c14, 2));
        arrayList.add(new d60(c15, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47545i0 = frameLayout;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.H8, frameLayout, null);
        View view = new View(context);
        org.telegram.ui.ActionBar.u6.Z(view, context, 2131231229, org.telegram.ui.ActionBar.n6.f29358b7);
        frameLayout.addView(view, c8.ma.c(-1.0f, -1));
        frameLayout.setTag(2131296437, 1);
        a(frameLayout, c8.ma.o(-1, 8));
        e60 e60Var = new e60(this, context);
        this.f47539c0 = e60Var;
        a(e60Var, c8.ma.o(-1, 48));
        e60Var.setOnClickListener(new org.telegram.ui.Components.c31(23, this, h2Var));
        for (int i10 = 0; i10 < this.f47538b0.size(); i10++) {
            ((d60) this.f47538b0.get(i10)).f46826a.setOnClickListener(new ci.q(this, ((d60) this.f47538b0.get(i10)).f46827b, 26));
        }
        org.telegram.ui.Components.k80 k80Var = new org.telegram.ui.Components.k80(context, null);
        this.U = k80Var;
        k80Var.setTag(2131296437, 1);
        k80Var.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        k80Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.E8, null);
        k80Var.setMovementMethod(LinkMovementMethod.getInstance());
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.J6, null);
        k80Var.setText(org.telegram.messenger.gd.M0(2131748865, null));
        a(k80Var, c8.ma.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void g() {
        if (this.f47543g0 != null) {
            this.f47539c0.f47072b.setTranslationX((3 - Math.min(3, this.f47543g0.size())) * org.telegram.messenger.g0.L(12.0f));
        }
    }

    public final void h(boolean z10) {
        int i7;
        this.f47540d0 = -1;
        this.f47545i0.setVisibility(0);
        if (z10) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        this.V.setVisibility(i7);
        this.U.setVisibility(0);
        this.f47539c0.setVisibility(8);
    }

    public void setCallback(c60 c60Var) {
        this.f47542f0 = c60Var;
    }

    @Override
    public final void updateColors() {
        try {
            org.telegram.ui.ActionBar.z0 z0Var = this.V;
            if (z0Var != null) {
                int i7 = org.telegram.ui.ActionBar.n6.f29615p7;
                z0Var.d(org.telegram.ui.ActionBar.n6.x0(null, i7, false), org.telegram.ui.ActionBar.n6.x0(null, i7, false));
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
