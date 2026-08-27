package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class at0 extends nt0 {

    public final int f36635l0;
    public final NotificationCenter.NotificationCenterDelegate m0;

    public at0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, qt0 qt0Var, FrameLayout frameLayout, int i10) {
        super(context, qt0Var, frameLayout);
        this.f36635l0 = i10;
        this.m0 = notificationCenterDelegate;
    }

    @Override
    public boolean C() {
        switch (this.f36635l0) {
            case 0:
                return !((PhotoViewer) this.m0).f35745s;
            default:
                return super.C();
        }
    }

    @Override
    public void D() {
        switch (this.f36635l0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.m0;
                if (secretMediaViewer.F && getScrollY() <= 0) {
                    AndroidUtilities.runOnUIThread(secretMediaViewer.f36150n1, 3000L);
                    break;
                }
                break;
        }
    }

    @Override
    public void F() {
        switch (this.f36635l0) {
            case 1:
                AndroidUtilities.cancelRunOnUIThread(((SecretMediaViewer) this.m0).f36150n1);
                break;
        }
    }

    @Override
    public void G() {
        switch (this.f36635l0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.m0;
                if (secretMediaViewer.G0 == null) {
                    secretMediaViewer.k(((float) getScrollY()) < ((float) getMeasuredHeight()) / 3.0f && secretMediaViewer.f36136g0, true);
                }
                break;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f36635l0) {
            case 0:
                super.invalidate();
                PhotoViewer photoViewer = (PhotoViewer) this.m0;
                yt0[] yt0VarArr = photoViewer.S0;
                ImageView[] imageViewArr = photoViewer.f35767u3;
                if (photoViewer.F) {
                    int scrollY = getScrollY();
                    float translationY = photoViewer.M1.getTranslationY();
                    boolean z10 = scrollY == 0 && translationY == 0.0f;
                    boolean z11 = scrollY == 0 && translationY == 0.0f;
                    if (!z10) {
                        int iB = yt0VarArr[0].b() + yt0VarArr[0].f44905j;
                        int top = (((photoViewer.V1.getTop() + ((int) translationY)) - scrollY) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (C() ? AndroidUtilities.statusBarHeight : 0))) - AndroidUtilities.dp(12.0f);
                        boolean z12 = top > AndroidUtilities.dp(32.0f) + ((int) imageViewArr[0].getY());
                        z10 = top > iB;
                        z11 = z12;
                    }
                    if (photoViewer.f35776v3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z11) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new f50(this, 12)).start();
                        } else if (imageViewArr[0].getTag() == null && !z11) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    yt0VarArr[0].e(2, z10 ? 1.0f : 0.0f, true);
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }
}
