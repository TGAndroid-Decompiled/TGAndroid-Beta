package org.telegram.ui;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class d70 extends ActionBarPopupWindow$ActionBarPopupWindowLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.p80 T;
    public final org.telegram.ui.ActionBar.b1 U;
    public final org.telegram.ui.ActionBar.b1 V;
    public final org.telegram.ui.ActionBar.b1 W;
    public final ArrayList f36634a0;
    public final c70 f36635b0;
    public int f36636c0;
    public final org.telegram.messenger.y2 f36637d0;
    public a70 f36638e0;
    public ArrayList f36639f0;
    public final org.telegram.ui.ActionBar.k2 f36640g0;
    public final FrameLayout f36641h0;

    public d70(Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f36634a0 = arrayList;
        this.f36640g0 = k2Var;
        this.f36637d0 = k2Var.getMessagesController().f18901s7;
        setFitItems(true);
        org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, this, 2131232060, org.telegram.messenger.cd.G(1, "Days", new Object[0]), false, null);
        org.telegram.ui.ActionBar.b1 c11 = org.telegram.ui.ActionBar.t0.c(false, false, this, 2131232063, org.telegram.messenger.cd.G(2, "Days", new Object[0]), false, null);
        this.W = c11;
        org.telegram.ui.ActionBar.b1 c12 = org.telegram.ui.ActionBar.t0.c(false, false, this, 2131232062, org.telegram.messenger.cd.G(1, "Weeks", new Object[0]), false, null);
        org.telegram.ui.ActionBar.b1 c13 = org.telegram.ui.ActionBar.t0.c(false, false, this, 2131232061, org.telegram.messenger.cd.G(1, "Months", new Object[0]), false, null);
        this.V = c13;
        org.telegram.ui.ActionBar.b1 c14 = org.telegram.ui.ActionBar.t0.c(false, false, this, 2131232086, org.telegram.messenger.cd.L0(2131753851, null), false, null);
        org.telegram.ui.ActionBar.b1 c15 = org.telegram.ui.ActionBar.t0.c(false, false, this, 2131232107, org.telegram.messenger.cd.L0(2131751543, null), false, null);
        this.U = c15;
        int i10 = org.telegram.ui.ActionBar.t6.f21153p7;
        c15.d(org.telegram.ui.ActionBar.t6.x0(null, i10, false), org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        arrayList.add(new b70(c10, 3));
        arrayList.add(new b70(c11, 6));
        arrayList.add(new b70(c12, 0));
        arrayList.add(new b70(c13, 1));
        arrayList.add(new b70(c14, 2));
        arrayList.add(new b70(c15, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36641h0 = frameLayout;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.H8, frameLayout, null);
        View view = new View(context);
        org.telegram.ui.ActionBar.a7.a0(view, context, 2131231230, org.telegram.ui.ActionBar.t6.f20892b7);
        frameLayout.addView(view, w7.b6.c(-1.0f, -1));
        frameLayout.setTag(2131296437, 1);
        a(frameLayout, w7.b6.o(-1, 8));
        c70 c70Var = new c70(this, context);
        this.f36635b0 = c70Var;
        a(c70Var, w7.b6.o(-1, 48));
        c70Var.setOnClickListener(new wu(12, this, k2Var));
        for (int i11 = 0; i11 < this.f36634a0.size(); i11++) {
            ((b70) this.f36634a0.get(i11)).f36120a.setOnClickListener(new bh.f(this, ((b70) this.f36634a0.get(i11)).f36121b, 19));
        }
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, null);
        this.T = p80Var;
        p80Var.setTag(2131296437, 1);
        p80Var.setPadding(org.telegram.messenger.i0.L(13.0f), 0, org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f));
        p80Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.E8, null);
        p80Var.setMovementMethod(LinkMovementMethod.getInstance());
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.J6, null);
        p80Var.setText(org.telegram.messenger.cd.L0(2131749067, null));
        a(p80Var, w7.b6.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void g() {
        if (this.f36639f0 != null) {
            this.f36635b0.f36406b.setTranslationX((3 - Math.min(3, this.f36639f0.size())) * org.telegram.messenger.i0.L(12.0f));
        }
    }

    public final void h(boolean z10) {
        int i10;
        this.f36636c0 = -1;
        this.f36641h0.setVisibility(0);
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.U.setVisibility(i10);
        this.T.setVisibility(0);
        this.f36635b0.setVisibility(8);
    }

    public void setCallback(a70 a70Var) {
        this.f36638e0 = a70Var;
    }

    @Override
    public final void updateColors() {
        try {
            org.telegram.ui.ActionBar.b1 b1Var = this.U;
            if (b1Var != null) {
                int i10 = org.telegram.ui.ActionBar.t6.f21153p7;
                b1Var.d(org.telegram.ui.ActionBar.t6.x0(null, i10, false), org.telegram.ui.ActionBar.t6.x0(null, i10, false));
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
