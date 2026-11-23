package org.telegram.ui.Components;

import org.telegram.messenger.support.SparseLongArray;
public final class qb extends nb implements org.telegram.messenger.fs {
    public final ob d;
    public SparseLongArray f38753e;
    public final org.telegram.ui.ActionBar.g2 f38754f;
    public final int h;
    public fc f38755n;

    public qb(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        super(g2Var.getContext(), g2Var.getResourceProvider());
        this.f38754f = g2Var;
        this.h = i7;
        this.f37752b.setLayoutParams(c8.na.i(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
        this.f37751a.setLayoutParams(c8.na.h(56.0f, 48.0f, 8388659));
        ob obVar = new ob(this, g2Var, getContext(), g2Var.getCurrentAccount(), g2Var.getResourceProvider());
        this.d = obVar;
        obVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(0.0f));
        this.d.setDelegate(new pb(this));
        this.d.setTop(true);
        this.d.setClipChildren(false);
        this.d.setClipToPadding(false);
        this.d.setVisibility(0);
        this.d.setBubbleOffset(-org.telegram.messenger.g0.L(80.0f));
        this.d.setHint(org.telegram.messenger.gd.N0(2131745679, null));
        addView(this.d, c8.na.d(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
        this.d.p(null, null, true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25251m3) {
            this.f38753e = (SparseLongArray) objArr[0];
        }
    }

    public final void f() {
        if (this.d.getReactionsWindow() != null) {
            this.d.e();
            if (this.d.getReactionsWindow().f5289a != null) {
                this.d.getReactionsWindow().f5289a.animate().alpha(0.0f).setDuration(180L).start();
            }
        }
    }

    @Override
    public int getMeasuredBackgroundHeight() {
        return org.telegram.messenger.g0.L(30.0f) + this.f37752b.getMeasuredHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.f(org.telegram.messenger.i10.f24637t0).c(this, org.telegram.messenger.ks.f25251m3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(org.telegram.messenger.i10.f24637t0).n(this, org.telegram.messenger.ks.f25251m3);
    }

    public void setBulletin(fc fcVar) {
        this.f38755n = fcVar;
    }
}
