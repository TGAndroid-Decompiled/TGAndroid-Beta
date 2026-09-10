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
import org.telegram.messenger.em;
import org.telegram.ui.Components.k8;
public final class q implements Runnable {
    public final int f18567a;
    public final Object f18568b;

    public q(Object obj, int i10) {
        this.f18567a = i10;
        this.f18568b = obj;
    }

    @Override
    public final void run() {
        int dp;
        DialogInterface.OnDismissListener onDismissListener;
        DialogInterface.OnDismissListener onDismissListener2;
        int i10 = this.f18567a;
        Object obj = this.f18568b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f17466p1;
                AndroidUtilities.runOnUIThread((di.q) obj);
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
                d1Var.U = true;
                AndroidUtilities.makeGlobalBlurBitmap(new y0(d1Var, 0), 8.0f);
                return;
            case 4:
                ((r1) obj).c();
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof m5) {
                    m5 m5Var = (m5) view;
                    if (!m5Var.f18476a) {
                        m5Var.f18476a = true;
                        m5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                d2 d2Var = ((b2) obj).d;
                int i11 = AndroidUtilities.displaySize.x;
                d2Var.L = i11;
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
                Rect rect = d2Var.A0;
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
                h2Var.f17761f1.setVisibility(0);
                h2Var.f17763h1.setAlpha(0.0f);
                h2Var.f17762g1.startAnimation(AnimationUtils.loadAnimation(h2Var.getContext(), h2Var.f17759d1));
                h2Var.f17763h1.animate().setDuration(300L).alpha(1.0f).setListener(new e2(h2Var, 0)).start();
                return;
            case 8:
                h3 h3Var = (h3) ((z2) obj).f18800c;
                onDismissListener = h3Var.onHideListener;
                if (onDismissListener != null) {
                    onDismissListener2 = h3Var.onHideListener;
                    onDismissListener2.onDismiss(h3Var);
                }
                try {
                    h3Var.dismissInternal();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 9:
                y2 y2Var = (y2) obj;
                y2Var.getClass();
                try {
                    y2Var.f18773b.dismissInternal();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 10:
                w3 w3Var = (w3) obj;
                if (w3Var.mo37getWindowView() != null) {
                    w3Var.mo37getWindowView().setDrawingFromOverlay(true);
                    return;
                }
                return;
            case 11:
                ((z3) obj).f();
                return;
            case 12:
                x4 x4Var = (x4) ((f2) obj).f17703b;
                x4Var.k();
                x4Var.j();
                return;
            case 13:
                x4 x4Var2 = ((u4) obj).f18654b;
                x4Var2.f18734c.dismiss();
                x4Var2.f18735f.removeAllViews();
                return;
            case 14:
                ((u4) obj).f18654b.f18734c.dismiss();
                return;
            case 15:
                Drawable drawable2 = (Drawable) obj;
                j6.d = null;
                j6.N();
                if (!j6.f17884b) {
                    j6.i(drawable2);
                    j6.h(drawable2);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
                return;
            case 16:
                ((CountDownLatch) obj).countDown();
                return;
            case 17:
                em.m(1, (p2) obj);
                return;
            case 18:
                k8 k8Var = (k8) j6.f17945e5.remove((MessageObject) obj);
                if (k8Var != null) {
                    k8Var.f24658i = null;
                    return;
                }
                return;
            default:
                ((i6) obj).s();
                return;
        }
    }
}
