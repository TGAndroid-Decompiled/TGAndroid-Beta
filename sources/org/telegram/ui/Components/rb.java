package org.telegram.ui.Components;

import org.telegram.messenger.support.SparseLongArray;
public final class rb extends ob implements org.telegram.messenger.gs {
    public final pb d;
    public SparseLongArray f39141e;
    public final org.telegram.ui.ActionBar.g2 f39142f;
    public final int h;
    public gc f39143n;

    public rb(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        super(g2Var.getContext(), g2Var.getResourceProvider());
        this.f39142f = g2Var;
        this.h = i7;
        this.f38158b.setLayoutParams(c8.ma.i(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
        this.f38157a.setLayoutParams(c8.ma.h(56.0f, 48.0f, 8388659));
        pb pbVar = new pb(this, g2Var, getContext(), g2Var.getCurrentAccount(), g2Var.getResourceProvider());
        this.d = pbVar;
        pbVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(0.0f));
        this.d.setDelegate(new qb(this));
        this.d.setTop(true);
        this.d.setClipChildren(false);
        this.d.setClipToPadding(false);
        this.d.setVisibility(0);
        this.d.setBubbleOffset(-org.telegram.messenger.g0.L(80.0f));
        this.d.setHint(org.telegram.messenger.hd.N0(2131745679, null));
        addView(this.d, c8.ma.d(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
        this.d.p(null, null, true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.f25346m3) {
            this.f39141e = (SparseLongArray) objArr[0];
        }
    }

    public final void f() {
        if (this.d.getReactionsWindow() != null) {
            this.d.e();
            if (this.d.getReactionsWindow().f5326a != null) {
                this.d.getReactionsWindow().f5326a.animate().alpha(0.0f).setDuration(180L).start();
            }
        }
    }

    @Override
    public int getMeasuredBackgroundHeight() {
        return org.telegram.messenger.g0.L(30.0f) + this.f38158b.getMeasuredHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ls.f(org.telegram.messenger.k10.f24968t0).c(this, org.telegram.messenger.ls.f25346m3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ls.f(org.telegram.messenger.k10.f24968t0).n(this, org.telegram.messenger.ls.f25346m3);
    }

    public void setBulletin(gc gcVar) {
        this.f39143n = gcVar;
    }
}
