package org.telegram.ui.Components;

import org.telegram.messenger.support.SparseLongArray;
public final class lb extends ib implements org.telegram.messenger.cs {
    public final jb d;
    public SparseLongArray f35673e;
    public final org.telegram.ui.ActionBar.d2 f35674f;
    public final int h;
    public ac f35675n;

    public lb(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        super(d2Var.getContext(), d2Var.getResourceProvider());
        this.f35674f = d2Var;
        this.h = i3;
        this.f34651b.setLayoutParams(b8.mf.i(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
        this.f34650a.setLayoutParams(b8.mf.h(56.0f, 48.0f, 8388659));
        jb jbVar = new jb(this, d2Var, getContext(), d2Var.getCurrentAccount(), d2Var.getResourceProvider());
        this.d = jbVar;
        jbVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(0.0f));
        this.d.setDelegate(new kb(this));
        this.d.setTop(true);
        this.d.setClipChildren(false);
        this.d.setClipToPadding(false);
        this.d.setVisibility(0);
        this.d.setBubbleOffset(-org.telegram.messenger.g0.L(80.0f));
        this.d.setHint(org.telegram.messenger.bd.M0(2131745885, null));
        addView(this.d, b8.mf.d(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
        this.d.p(null, null, true);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23256k3) {
            this.f35673e = (SparseLongArray) objArr[0];
        }
    }

    public final void f() {
        if (this.d.getReactionsWindow() != null) {
            this.d.e();
            if (this.d.getReactionsWindow().f8931a != null) {
                this.d.getReactionsWindow().f8931a.animate().alpha(0.0f).setDuration(180L).start();
            }
        }
    }

    @Override
    public int getMeasuredBackgroundHeight() {
        return org.telegram.messenger.g0.L(30.0f) + this.f34651b.getMeasuredHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.f(org.telegram.messenger.h10.f22829t0).c(this, org.telegram.messenger.hs.f23256k3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(org.telegram.messenger.h10.f22829t0).n(this, org.telegram.messenger.hs.f23256k3);
    }

    public void setBulletin(ac acVar) {
        this.f35675n = acVar;
    }
}
