package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.d8;
public final class p implements Runnable {
    public final int f22208a;
    public final Object f22209b;

    public p(Object obj, int i10) {
        this.f22208a = i10;
        this.f22209b = obj;
    }

    @Override
    public final void run() {
        int dp;
        DialogInterface.OnDismissListener onDismissListener;
        DialogInterface.OnDismissListener onDismissListener2;
        int i10 = this.f22208a;
        Object obj = this.f22209b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f21105m1;
                AndroidUtilities.runOnUIThread((dg.u1) obj);
                return;
            case 1:
                w0 w0Var = (w0) obj;
                if (w0Var.getParent() != null) {
                    w0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                w0Var.M(null, null);
                return;
            case 2:
                ((v0) obj).setSelectedForDelete(false);
                return;
            case 3:
                d1 d1Var = (d1) obj;
                d1Var.R = true;
                AndroidUtilities.makeGlobalBlurBitmap(new y0(d1Var, 0), 8.0f);
                return;
            case 4:
                ((r1) obj).c();
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof m5) {
                    m5 m5Var = (m5) view;
                    if (!m5Var.f22136a) {
                        m5Var.f22136a = true;
                        m5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                d2 d2Var = ((b2) obj).d;
                int i11 = AndroidUtilities.displaySize.x;
                d2Var.I = i11;
                int dp2 = i11 - AndroidUtilities.dp(56.0f);
                if (AndroidUtilities.isTablet()) {
                    if (AndroidUtilities.isSmallTablet()) {
                        dp = AndroidUtilities.dp(446.0f);
                    } else {
                        dp = AndroidUtilities.dp(496.0f);
                    }
                } else {
                    dp = AndroidUtilities.dp(356.0f);
                }
                Window window = d2Var.getWindow();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(window.getAttributes());
                int min = Math.min(dp, dp2);
                Rect rect = d2Var.f21267x0;
                layoutParams.width = min + rect.left + rect.right;
                try {
                    window.setAttributes(layoutParams);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 7:
                h2 h2Var = (h2) obj;
                h2Var.f21409c1.setVisibility(0);
                h2Var.f21411e1.setAlpha(0.0f);
                h2Var.f21410d1.startAnimation(AnimationUtils.loadAnimation(h2Var.getContext(), h2Var.f21407a1));
                h2Var.f21411e1.animate().setDuration(300L).alpha(1.0f).setListener(new e2(h2Var, 0)).start();
                return;
            case 8:
                h3 h3Var = (h3) ((z2) obj).f22481c;
                onDismissListener = h3Var.onHideListener;
                if (onDismissListener != null) {
                    onDismissListener2 = h3Var.onHideListener;
                    onDismissListener2.onDismiss(h3Var);
                }
                try {
                    h3Var.dismissInternal();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 9:
                y2 y2Var = (y2) obj;
                y2Var.getClass();
                try {
                    y2Var.f22466b.dismissInternal();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 10:
                u3 u3Var = (u3) obj;
                if (u3Var.mo36getWindowView() != null) {
                    u3Var.mo36getWindowView().setDrawingFromOverlay(true);
                    return;
                }
                return;
            case 11:
                ((x3) obj).f();
                return;
            case 12:
                x4 x4Var = (x4) ((f2) obj).f21346b;
                x4Var.k();
                x4Var.j();
                return;
            case 13:
                x4 x4Var2 = ((u4) obj).f22311b;
                x4Var2.f22425c.dismiss();
                x4Var2.f22427f.removeAllViews();
                return;
            case 14:
                ((u4) obj).f22311b.f22425c.dismiss();
                return;
            case 15:
                Drawable drawable2 = (Drawable) obj;
                k6.d = null;
                k6.N();
                if (!k6.f21616b) {
                    k6.i(drawable2);
                    k6.h(drawable2);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
                return;
            case 16:
                ((CountDownLatch) obj).countDown();
                return;
            case 17:
                org.telegram.ui.b.k(1, (p2) obj);
                return;
            case 18:
                d8 d8Var = (d8) k6.f21677e5.remove((MessageObject) obj);
                if (d8Var != null) {
                    d8Var.f26214i = null;
                    return;
                }
                return;
            default:
                ((j6) obj).s();
                return;
        }
    }
}
