package org.telegram.ui.Components;

import org.telegram.messenger.support.SparseLongArray;
public final class nb extends kb implements org.telegram.messenger.ls {
    public final lb d;
    public SparseLongArray f36286e;
    public final org.telegram.ui.ActionBar.f2 f36287f;
    public final int h;
    public cc f36288n;

    public nb(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        super(f2Var.getContext(), f2Var.getResourceProvider());
        this.f36287f = f2Var;
        this.h = i7;
        this.f35243b.setLayoutParams(c8.ha.i(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
        this.f35242a.setLayoutParams(c8.ha.h(56.0f, 48.0f, 8388659));
        lb lbVar = new lb(this, f2Var, getContext(), f2Var.getCurrentAccount(), f2Var.getResourceProvider());
        this.d = lbVar;
        lbVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(0.0f));
        this.d.setDelegate(new mb(this));
        this.d.setTop(true);
        this.d.setClipChildren(false);
        this.d.setClipToPadding(false);
        this.d.setVisibility(0);
        this.d.setBubbleOffset(-org.telegram.messenger.g0.L(80.0f));
        this.d.setHint(org.telegram.messenger.hd.M0(2131745876, null));
        addView(this.d, c8.ha.d(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
        this.d.p(null, null, true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25019k3) {
            this.f36286e = (SparseLongArray) objArr[0];
        }
    }

    public final void f() {
        if (this.d.getReactionsWindow() != null) {
            this.d.e();
            if (this.d.getReactionsWindow().f6183a != null) {
                this.d.getReactionsWindow().f6183a.animate().alpha(0.0f).setDuration(180L).start();
            }
        }
    }

    @Override
    public int getMeasuredBackgroundHeight() {
        return org.telegram.messenger.g0.L(30.0f) + this.f35243b.getMeasuredHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24467s0).c(this, org.telegram.messenger.qs.f25019k3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24467s0).n(this, org.telegram.messenger.qs.f25019k3);
    }

    public void setBulletin(cc ccVar) {
        this.f36288n = ccVar;
    }
}
