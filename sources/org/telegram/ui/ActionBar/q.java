package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.n8;
public final class q implements Runnable {
    public final int f22958a;
    public final Object f22959b;

    public q(Object obj, int i10) {
        this.f22958a = i10;
        this.f22959b = obj;
    }

    @Override
    public final void run() {
        int dp;
        DialogInterface.OnDismissListener onDismissListener;
        DialogInterface.OnDismissListener onDismissListener2;
        int i10 = this.f22958a;
        Object obj = this.f22959b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f22300v1;
                AndroidUtilities.runOnUIThread((ai.h1) obj);
                return;
            case 1:
                w0 w0Var = (w0) obj;
                if (w0Var.getParent() != null) {
                    w0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                w0Var.U(null, null);
                return;
            case 2:
                ((v0) obj).setSelectedForDelete(false);
                return;
            case 3:
                d1 d1Var = (d1) obj;
                d1Var.W = true;
                AndroidUtilities.makeGlobalBlurBitmap(new y0(d1Var, 0), 8.0f);
                return;
            case 4:
                ((q1) obj).c();
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof c6) {
                    c6 c6Var = (c6) view;
                    if (!c6Var.f22517a) {
                        c6Var.f22517a = true;
                        c6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                a2 a2Var = (a2) obj;
                e2 e2Var = a2Var.d;
                int i11 = AndroidUtilities.displaySize.x;
                e2Var.L = i11;
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
                int min = Math.min(dp, dp2);
                Rect rect = e2Var.C0;
                int i12 = min + rect.left + rect.right;
                if (e2Var.Z0) {
                    ViewGroup.LayoutParams layoutParams = a2Var.getLayoutParams();
                    if (layoutParams != null && layoutParams.width != i12) {
                        layoutParams.width = i12;
                        a2Var.requestLayout();
                        return;
                    }
                    return;
                }
                Window window = e2Var.getWindow();
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                layoutParams2.copyFrom(window.getAttributes());
                layoutParams2.width = i12;
                try {
                    window.setAttributes(layoutParams2);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 7:
                i2 i2Var = (i2) obj;
                i2Var.f22708o1.setVisibility(0);
                i2Var.f22710q1.setAlpha(0.0f);
                i2Var.f22709p1.startAnimation(AnimationUtils.loadAnimation(i2Var.getContext(), i2Var.f22706m1));
                i2Var.f22710q1.animate().setDuration(300L).alpha(1.0f).setListener(new f2(i2Var, 0)).start();
                return;
            case 8:
                k3 k3Var = (k3) ((b3) obj).f22429c;
                onDismissListener = k3Var.onHideListener;
                if (onDismissListener != null) {
                    onDismissListener2 = k3Var.onHideListener;
                    onDismissListener2.onDismiss(k3Var);
                }
                try {
                    k3Var.dismissInternal();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 9:
                a3 a3Var = (a3) obj;
                a3Var.getClass();
                try {
                    a3Var.f22381b.dismissInternal();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 10:
                y3 y3Var = (y3) obj;
                if (y3Var.mo36getWindowView() != null) {
                    y3Var.mo36getWindowView().setDrawingFromOverlay(true);
                    return;
                }
                return;
            case 11:
                ((b4) obj).f();
                return;
            case 12:
                a5 a5Var = (a5) ((g2) obj).f22647b;
                a5Var.k();
                a5Var.j();
                return;
            case 13:
                a5 a5Var2 = ((x4) obj).f23246b;
                a5Var2.f22399c.dismiss();
                a5Var2.f22400f.removeAllViews();
                return;
            case 14:
                ((x4) obj).f23246b.f22399c.dismiss();
                return;
            case 15:
                z5 z5Var = (z5) obj;
                if (!z5Var.f23793n && z5Var.H) {
                    z5Var.d();
                    return;
                }
                return;
            case 16:
                Drawable drawable2 = (Drawable) obj;
                y6.d = null;
                y6.O();
                if (!y6.f23310b) {
                    y6.i(drawable2);
                    y6.h(drawable2);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
                return;
            case 17:
                ((CountDownLatch) obj).countDown();
                return;
            case 18:
                vh.l(1, (r2) obj);
                return;
            case 19:
                n8 n8Var = (n8) y6.f23374e5.remove((MessageObject) obj);
                if (n8Var != null) {
                    n8Var.f30911i = null;
                    return;
                }
                return;
            default:
                ((x6) obj).s();
                return;
        }
    }
}
