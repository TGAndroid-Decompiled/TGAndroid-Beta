package org.telegram.ui;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class f60 extends ActionBarPopupWindow$ActionBarPopupWindowLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.j80 U;
    public final org.telegram.ui.ActionBar.y0 V;
    public final org.telegram.ui.ActionBar.y0 W;
    public final org.telegram.ui.ActionBar.y0 f47693a0;
    public final ArrayList f47694b0;
    public final e60 f47695c0;
    public int f47696d0;
    public final org.telegram.messenger.v2 f47697e0;
    public c60 f47698f0;
    public ArrayList f47699g0;
    public final org.telegram.ui.ActionBar.g2 f47700h0;
    public final FrameLayout f47701i0;

    public f60(Context context, org.telegram.ui.ActionBar.g2 g2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f47694b0 = arrayList;
        this.f47700h0 = g2Var;
        this.f47697e0 = g2Var.getMessagesController().f25873u7;
        setFitItems(true);
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232066, org.telegram.messenger.gd.G(1, "Days", new Object[0]), false, null);
        org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232069, org.telegram.messenger.gd.G(2, "Days", new Object[0]), false, null);
        this.f47693a0 = c11;
        org.telegram.ui.ActionBar.y0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232068, org.telegram.messenger.gd.G(1, "Weeks", new Object[0]), false, null);
        org.telegram.ui.ActionBar.y0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232067, org.telegram.messenger.gd.G(1, "Months", new Object[0]), false, null);
        this.W = c13;
        org.telegram.ui.ActionBar.y0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232092, org.telegram.messenger.gd.N0(2131753848, null), false, null);
        org.telegram.ui.ActionBar.y0 c15 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232113, org.telegram.messenger.gd.N0(2131751530, null), false, null);
        this.V = c15;
        int i7 = org.telegram.ui.ActionBar.n6.f29672p7;
        c15.d(org.telegram.ui.ActionBar.n6.x0(null, i7, false), org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        arrayList.add(new d60(c10, 3));
        arrayList.add(new d60(c11, 6));
        arrayList.add(new d60(c12, 0));
        arrayList.add(new d60(c13, 1));
        arrayList.add(new d60(c14, 2));
        arrayList.add(new d60(c15, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47701i0 = frameLayout;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.H8, frameLayout, null);
        View view = new View(context);
        org.telegram.ui.ActionBar.u6.Z(view, context, 2131231232, org.telegram.ui.ActionBar.n6.f29415b7);
        frameLayout.addView(view, c8.na.c(-1.0f, -1));
        frameLayout.setTag(2131296439, 1);
        a(frameLayout, c8.na.o(-1, 8));
        e60 e60Var = new e60(this, context);
        this.f47695c0 = e60Var;
        a(e60Var, c8.na.o(-1, 48));
        e60Var.setOnClickListener(new org.telegram.ui.Components.p31(21, this, g2Var));
        for (int i10 = 0; i10 < this.f47694b0.size(); i10++) {
            ((d60) this.f47694b0.get(i10)).f46957a.setOnClickListener(new ci.q(this, ((d60) this.f47694b0.get(i10)).f46958b, 26));
        }
        org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(context, null);
        this.U = j80Var;
        j80Var.setTag(2131296439, 1);
        j80Var.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        j80Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.E8, null);
        j80Var.setMovementMethod(LinkMovementMethod.getInstance());
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.J6, null);
        j80Var.setText(org.telegram.messenger.gd.N0(2131748864, null));
        a(j80Var, c8.na.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void g() {
        if (this.f47699g0 != null) {
            this.f47695c0.f47456b.setTranslationX((3 - Math.min(3, this.f47699g0.size())) * org.telegram.messenger.g0.L(12.0f));
        }
    }

    public final void h(boolean z10) {
        int i7;
        this.f47696d0 = -1;
        this.f47701i0.setVisibility(0);
        if (z10) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        this.V.setVisibility(i7);
        this.U.setVisibility(0);
        this.f47695c0.setVisibility(8);
    }

    public void setCallback(c60 c60Var) {
        this.f47698f0 = c60Var;
    }

    @Override
    public final void updateColors() {
        try {
            org.telegram.ui.ActionBar.y0 y0Var = this.V;
            if (y0Var != null) {
                int i7 = org.telegram.ui.ActionBar.n6.f29672p7;
                y0Var.d(org.telegram.ui.ActionBar.n6.x0(null, i7, false), org.telegram.ui.ActionBar.n6.x0(null, i7, false));
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
