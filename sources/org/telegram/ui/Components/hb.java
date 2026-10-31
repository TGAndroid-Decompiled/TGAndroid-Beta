package org.telegram.ui.Components;

import org.telegram.messenger.support.SparseLongArray;
public final class hb extends eb implements org.telegram.messenger.us {
    public final fb d;
    public SparseLongArray e;
    public final org.telegram.ui.ActionBar.k2 f26684f;
    public final int h;
    public wb f26685n;

    public hb(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        super(k2Var.getContext(), k2Var.getResourceProvider());
        this.f26684f = k2Var;
        this.h = i10;
        this.f25745b.setLayoutParams(w7.b6.i(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
        this.f25744a.setLayoutParams(w7.b6.h(56.0f, 48.0f, 8388659));
        fb fbVar = new fb(this, k2Var, getContext(), k2Var.getCurrentAccount(), k2Var.getResourceProvider());
        this.d = fbVar;
        fbVar.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(0.0f));
        this.d.setDelegate(new gb(this));
        this.d.setTop(true);
        this.d.setClipChildren(false);
        this.d.setClipToPadding(false);
        this.d.setVisibility(0);
        this.d.setBubbleOffset(-org.telegram.messenger.i0.L(80.0f));
        this.d.setHint(org.telegram.messenger.cd.L0(2131745892, null));
        addView(this.d, w7.b6.d(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
        this.d.p(null, null, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19641k3) {
            this.e = (SparseLongArray) objArr[0];
        }
    }

    public final void f() {
        if (this.d.getReactionsWindow() != null) {
            this.d.e();
            if (this.d.getReactionsWindow().f48275a != null) {
                this.d.getReactionsWindow().f48275a.animate().alpha(0.0f).setDuration(180L).start();
            }
        }
    }

    @Override
    public int getMeasuredBackgroundHeight() {
        return org.telegram.messenger.i0.L(30.0f) + this.f25745b.getMeasuredHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.f(org.telegram.messenger.d20.f15147s0).c(this, org.telegram.messenger.zs.f19641k3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.f(org.telegram.messenger.d20.f15147s0).n(this, org.telegram.messenger.zs.f19641k3);
    }

    public void setBulletin(wb wbVar) {
        this.f26685n = wbVar;
    }
}
