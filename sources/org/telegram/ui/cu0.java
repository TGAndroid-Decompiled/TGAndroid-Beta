package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class cu0 extends pu0 {
    public final int f36739p0;
    public final NotificationCenter.NotificationCenterDelegate f36740q0;

    public cu0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, su0 su0Var, FrameLayout frameLayout, int i10) {
        super(context, su0Var, frameLayout);
        this.f36739p0 = i10;
        this.f36740q0 = notificationCenterDelegate;
    }

    @Override
    public boolean C() {
        switch (this.f36739p0) {
            case 0:
                return !((PhotoViewer) this.f36740q0).f34025s;
            default:
                return super.C();
        }
    }

    @Override
    public void D() {
        switch (this.f36739p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f36740q0;
                if (secretMediaViewer.J && getScrollY() <= 0) {
                    AndroidUtilities.runOnUIThread(secretMediaViewer.f34452r1, 3000L);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void F() {
        switch (this.f36739p0) {
            case 1:
                AndroidUtilities.cancelRunOnUIThread(((SecretMediaViewer) this.f36740q0).f34452r1);
                return;
            default:
                return;
        }
    }

    @Override
    public void G() {
        boolean z10;
        switch (this.f36739p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f36740q0;
                if (secretMediaViewer.K0 == null) {
                    if (getScrollY() < getMeasuredHeight() / 3.0f && secretMediaViewer.f34437k0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    secretMediaViewer.k(z10, true);
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
        switch (this.f36739p0) {
            case 0:
                super.invalidate();
                PhotoViewer photoViewer = (PhotoViewer) this.f36740q0;
                av0[] av0VarArr = photoViewer.W0;
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
                        int b10 = av0VarArr[0].b() + av0VarArr[0].f36021j;
                        if (C()) {
                            i10 = AndroidUtilities.statusBarHeight;
                        } else {
                            i10 = 0;
                        }
                        int top = (((photoViewer.Z1.getTop() + ((int) translationY)) - scrollY) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10)) - AndroidUtilities.dp(12.0f);
                        if (top > AndroidUtilities.dp(32.0f) + ((int) imageViewArr[0].getY())) {
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
                    if (photoViewer.f34094z3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z11) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new ep0(this, 5)).start();
                        } else if (imageViewArr[0].getTag() == null && !z11) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    av0 av0Var = av0VarArr[0];
                    if (z10) {
                        f7 = 1.0f;
                    }
                    av0Var.e(2, f7, true);
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }
}
