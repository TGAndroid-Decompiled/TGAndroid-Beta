package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class fr0 extends tr0 {
    public final int f37336p0;
    public final org.telegram.messenger.us f37337q0;

    public fr0(org.telegram.messenger.us usVar, Context context, wr0 wr0Var, FrameLayout frameLayout, int i10) {
        super(context, wr0Var, frameLayout);
        this.f37336p0 = i10;
        this.f37337q0 = usVar;
    }

    @Override
    public boolean D() {
        switch (this.f37336p0) {
            case 0:
                return !((PhotoViewer) this.f37337q0).f33592s;
            default:
                return super.D();
        }
    }

    @Override
    public void E() {
        switch (this.f37336p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37337q0;
                if (secretMediaViewer.J && getScrollY() <= 0) {
                    org.telegram.messenger.i0.h3(secretMediaViewer.f34010p1, 3000L);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void F() {
        switch (this.f37336p0) {
            case 1:
                org.telegram.messenger.i0.r(((SecretMediaViewer) this.f37337q0).f34010p1);
                return;
            default:
                return;
        }
    }

    @Override
    public void G() {
        boolean z10;
        switch (this.f37336p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37337q0;
                if (secretMediaViewer.I0 == null) {
                    if (getScrollY() < getMeasuredHeight() / 3.0f && secretMediaViewer.f33996i0) {
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
        switch (this.f37336p0) {
            case 0:
                super.invalidate();
                PhotoViewer photoViewer = (PhotoViewer) this.f37337q0;
                fq0[] fq0VarArr = photoViewer.W0;
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
                        int b10 = fq0VarArr[0].b() + fq0VarArr[0].f37324j;
                        if (D()) {
                            i10 = org.telegram.messenger.i0.f16020m;
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
                    if (photoViewer.f33661z3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z11) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new org.telegram.ui.Components.voip.h2(this, 24)).start();
                        } else if (imageViewArr[0].getTag() == null && !z11) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    fq0 fq0Var = fq0VarArr[0];
                    if (z10) {
                        f7 = 1.0f;
                    }
                    fq0Var.e(2, f7, true);
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }
}
