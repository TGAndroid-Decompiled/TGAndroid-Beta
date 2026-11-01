package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class dr0 extends sr0 {
    public final int f36672p0;
    public final org.telegram.messenger.vs f36673q0;

    public dr0(org.telegram.messenger.vs vsVar, Context context, vr0 vr0Var, FrameLayout frameLayout, int i10) {
        super(context, vr0Var, frameLayout);
        this.f36672p0 = i10;
        this.f36673q0 = vsVar;
    }

    @Override
    public boolean D() {
        switch (this.f36672p0) {
            case 0:
                return !((PhotoViewer) this.f36673q0).f33599s;
            default:
                return super.D();
        }
    }

    @Override
    public void E() {
        switch (this.f36672p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f36673q0;
                if (secretMediaViewer.J && getScrollY() <= 0) {
                    org.telegram.messenger.i0.h3(secretMediaViewer.f34017p1, 3000L);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void F() {
        switch (this.f36672p0) {
            case 1:
                org.telegram.messenger.i0.r(((SecretMediaViewer) this.f36673q0).f34017p1);
                return;
            default:
                return;
        }
    }

    @Override
    public void G() {
        boolean z10;
        switch (this.f36672p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f36673q0;
                if (secretMediaViewer.I0 == null) {
                    if (getScrollY() < getMeasuredHeight() / 3.0f && secretMediaViewer.f34003i0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    secretMediaViewer.l(z10, true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void invalidate() {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        switch (this.f36672p0) {
            case 0:
                super.invalidate();
                PhotoViewer photoViewer = (PhotoViewer) this.f36673q0;
                dq0[] dq0VarArr = photoViewer.W0;
                ImageView[] imageViewArr = photoViewer.y3;
                if (photoViewer.J) {
                    int scrollY = getScrollY();
                    float translationY = photoViewer.Q1.getTranslationY();
                    float f7 = 0.0f;
                    if (scrollY == 0 && translationY == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (scrollY == 0 && translationY == 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z10) {
                        int b10 = dq0VarArr[0].b() + dq0VarArr[0].f36660j;
                        if (D()) {
                            i10 = org.telegram.messenger.i0.f16166m;
                        } else {
                            i10 = 0;
                        }
                        int top = (((photoViewer.Z1.getTop() + ((int) translationY)) - scrollY) + (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10)) - org.telegram.messenger.i0.L(12.0f);
                        if (top > org.telegram.messenger.i0.L(32.0f) + ((int) imageViewArr[0].getY())) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (top > b10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = z12;
                    }
                    if (photoViewer.f33668z3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z11) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new org.telegram.ui.Components.voip.i2(this, 24)).start();
                        } else if (imageViewArr[0].getTag() == null && !z11) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    dq0 dq0Var = dq0VarArr[0];
                    if (z10) {
                        f7 = 1.0f;
                    }
                    dq0Var.e(2, f7, true);
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }
}
