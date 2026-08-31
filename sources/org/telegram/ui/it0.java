package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class it0 extends vt0 {
    public final int m0;
    public final NotificationCenter.NotificationCenterDelegate f37926n0;

    public it0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, yt0 yt0Var, FrameLayout frameLayout, int i10) {
        super(context, yt0Var, frameLayout);
        this.m0 = i10;
        this.f37926n0 = notificationCenterDelegate;
    }

    @Override
    public boolean C() {
        switch (this.m0) {
            case 0:
                return !((PhotoViewer) this.f37926n0).f34384s;
            default:
                return super.C();
        }
    }

    @Override
    public void D() {
        switch (this.m0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37926n0;
                if (secretMediaViewer.G && getScrollY() <= 0) {
                    AndroidUtilities.runOnUIThread(secretMediaViewer.f34792o1, 3000L);
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
                AndroidUtilities.cancelRunOnUIThread(((SecretMediaViewer) this.f37926n0).f34792o1);
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
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37926n0;
                if (secretMediaViewer.H0 == null) {
                    if (getScrollY() < getMeasuredHeight() / 3.0f && secretMediaViewer.f34778h0) {
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
                PhotoViewer photoViewer = (PhotoViewer) this.f37926n0;
                hu0[] hu0VarArr = photoViewer.T0;
                ImageView[] imageViewArr = photoViewer.f34413v3;
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
                        int b10 = hu0VarArr[0].b() + hu0VarArr[0].f37626j;
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
                    if (photoViewer.f34423w3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z10) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new ns0(this, 3)).start();
                        } else if (imageViewArr[0].getTag() == null && !z10) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    hu0 hu0Var = hu0VarArr[0];
                    if (z4) {
                        f10 = 1.0f;
                    }
                    hu0Var.e(2, f10, true);
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }
}
