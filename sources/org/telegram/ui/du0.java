package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class du0 extends qu0 {
    public final int f33224p0;
    public final NotificationCenter.NotificationCenterDelegate f33225q0;

    public du0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, tu0 tu0Var, FrameLayout frameLayout, int i10) {
        super(context, tu0Var, frameLayout);
        this.f33224p0 = i10;
        this.f33225q0 = notificationCenterDelegate;
    }

    @Override
    public boolean C() {
        switch (this.f33224p0) {
            case 0:
                return !((PhotoViewer) this.f33225q0).f31071s;
            default:
                return super.C();
        }
    }

    @Override
    public void D() {
        switch (this.f33224p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f33225q0;
                if (secretMediaViewer.J && getScrollY() <= 0) {
                    AndroidUtilities.runOnUIThread(secretMediaViewer.f31488r1, 3000L);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void F() {
        switch (this.f33224p0) {
            case 1:
                AndroidUtilities.cancelRunOnUIThread(((SecretMediaViewer) this.f33225q0).f31488r1);
                return;
            default:
                return;
        }
    }

    @Override
    public void G() {
        boolean z10;
        switch (this.f33224p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f33225q0;
                if (secretMediaViewer.K0 == null) {
                    if (getScrollY() < getMeasuredHeight() / 3.0f && secretMediaViewer.f31473k0) {
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
        switch (this.f33224p0) {
            case 0:
                super.invalidate();
                PhotoViewer photoViewer = (PhotoViewer) this.f33225q0;
                bv0[] bv0VarArr = photoViewer.W0;
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
                        int b10 = bv0VarArr[0].b() + bv0VarArr[0].f32580j;
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
                    if (photoViewer.f31140z3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z11) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new er0(this, 4)).start();
                        } else if (imageViewArr[0].getTag() == null && !z11) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    bv0 bv0Var = bv0VarArr[0];
                    if (z10) {
                        f7 = 1.0f;
                    }
                    bv0Var.e(2, f7, true);
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }
}
