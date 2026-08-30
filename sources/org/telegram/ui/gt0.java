package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class gt0 extends tt0 {
    public final int m0;
    public final NotificationCenter.NotificationCenterDelegate f34676n0;

    public gt0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, wt0 wt0Var, FrameLayout frameLayout, int i10) {
        super(context, wt0Var, frameLayout);
        this.m0 = i10;
        this.f34676n0 = notificationCenterDelegate;
    }

    @Override
    public boolean C() {
        switch (this.m0) {
            case 0:
                return !((PhotoViewer) this.f34676n0).f31858s;
            default:
                return super.C();
        }
    }

    @Override
    public void D() {
        switch (this.m0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34676n0;
                if (secretMediaViewer.G && getScrollY() <= 0) {
                    AndroidUtilities.runOnUIThread(secretMediaViewer.f32256o1, 3000L);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void F() {
        switch (this.m0) {
            case 1:
                AndroidUtilities.cancelRunOnUIThread(((SecretMediaViewer) this.f34676n0).f32256o1);
                return;
            default:
                return;
        }
    }

    @Override
    public void G() {
        boolean z4;
        switch (this.m0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34676n0;
                if (secretMediaViewer.H0 == null) {
                    if (getScrollY() < getMeasuredHeight() / 3.0f && secretMediaViewer.f32242h0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    secretMediaViewer.k(z4, true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void invalidate() {
        boolean z4;
        boolean z10;
        int i10;
        boolean z11;
        switch (this.m0) {
            case 0:
                super.invalidate();
                PhotoViewer photoViewer = (PhotoViewer) this.f34676n0;
                fu0[] fu0VarArr = photoViewer.T0;
                ImageView[] imageViewArr = photoViewer.f31887v3;
                if (photoViewer.G) {
                    int scrollY = getScrollY();
                    float translationY = photoViewer.N1.getTranslationY();
                    float f10 = 0.0f;
                    if (scrollY == 0 && translationY == 0.0f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (scrollY == 0 && translationY == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z4) {
                        int b10 = fu0VarArr[0].b() + fu0VarArr[0].f34362j;
                        if (C()) {
                            i10 = AndroidUtilities.statusBarHeight;
                        } else {
                            i10 = 0;
                        }
                        int top = (((photoViewer.W1.getTop() + ((int) translationY)) - scrollY) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10)) - AndroidUtilities.dp(12.0f);
                        if (top > AndroidUtilities.dp(32.0f) + ((int) imageViewArr[0].getY())) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (top > b10) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z10 = z11;
                    }
                    if (photoViewer.f31897w3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z10) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new ls0(this, 3)).start();
                        } else if (imageViewArr[0].getTag() == null && !z10) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    fu0 fu0Var = fu0VarArr[0];
                    if (z4) {
                        f10 = 1.0f;
                    }
                    fu0Var.e(2, f10, true);
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }
}
