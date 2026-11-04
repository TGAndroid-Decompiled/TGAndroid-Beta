package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class mp0 extends zp0 {
    public final int f47740q0;
    public final org.telegram.messenger.cs f47741r0;

    public mp0(org.telegram.messenger.cs csVar, Context context, cq0 cq0Var, FrameLayout frameLayout, int i3) {
        super(context, cq0Var, frameLayout);
        this.f47740q0 = i3;
        this.f47741r0 = csVar;
    }

    @Override
    public boolean D() {
        switch (this.f47740q0) {
            case 0:
                return !((PhotoViewer) this.f47741r0).f41531s;
            default:
                return super.D();
        }
    }

    @Override
    public void E() {
        switch (this.f47740q0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f47741r0;
                if (secretMediaViewer.K && getScrollY() <= 0) {
                    org.telegram.messenger.g0.i3(secretMediaViewer.f41961q1, 3000L);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void F() {
        switch (this.f47740q0) {
            case 1:
                org.telegram.messenger.g0.r(((SecretMediaViewer) this.f47741r0).f41961q1);
                return;
            default:
                return;
        }
    }

    @Override
    public void G() {
        boolean z10;
        switch (this.f47740q0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f47741r0;
                if (secretMediaViewer.J0 == null) {
                    if (getScrollY() < getMeasuredHeight() / 3.0f && secretMediaViewer.f41948j0) {
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
        int i3;
        boolean z12;
        switch (this.f47740q0) {
            case 0:
                super.invalidate();
                PhotoViewer photoViewer = (PhotoViewer) this.f47741r0;
                mo0[] mo0VarArr = photoViewer.X0;
                ImageView[] imageViewArr = photoViewer.f41600z3;
                if (photoViewer.K) {
                    int scrollY = getScrollY();
                    float translationY = photoViewer.R1.getTranslationY();
                    float f10 = 0.0f;
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
                        int b10 = mo0VarArr[0].b() + mo0VarArr[0].f47726j;
                        if (D()) {
                            i3 = org.telegram.messenger.g0.f22602m;
                        } else {
                            i3 = 0;
                        }
                        int top = (((photoViewer.f41374a2.getTop() + ((int) translationY)) - scrollY) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i3)) - org.telegram.messenger.g0.L(12.0f);
                        if (top > org.telegram.messenger.g0.L(32.0f) + ((int) imageViewArr[0].getY())) {
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
                    if (photoViewer.A3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z11) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new y20(this, 13)).start();
                        } else if (imageViewArr[0].getTag() == null && !z11) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    mo0 mo0Var = mo0VarArr[0];
                    if (z10) {
                        f10 = 1.0f;
                    }
                    mo0Var.e(2, f10, true);
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }
}
