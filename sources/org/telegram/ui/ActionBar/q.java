package org.telegram.ui.ActionBar;

import ai.c9;
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
import org.telegram.messenger.ok;
import org.telegram.ui.Components.k8;
public final class q implements Runnable {
    public final int f21470a;
    public final Object f21471b;

    public q(Object obj, int i10) {
        this.f21470a = i10;
        this.f21471b = obj;
    }

    @Override
    public final void run() {
        int dp;
        DialogInterface.OnDismissListener onDismissListener;
        DialogInterface.OnDismissListener onDismissListener2;
        int i10 = this.f21470a;
        Object obj = this.f21471b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f20304p1;
                AndroidUtilities.runOnUIThread((c9) obj);
                return;
            case 1:
                v0 v0Var = (v0) obj;
                if (v0Var.getParent() != null) {
                    v0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                v0Var.M(null, null);
                return;
            case 2:
                ((u0) obj).setSelectedForDelete(false);
                return;
            case 3:
                c1 c1Var = (c1) obj;
                c1Var.U = true;
                AndroidUtilities.makeGlobalBlurBitmap(new x0(c1Var, 0), 8.0f);
                return;
            case 4:
                ((p1) obj).c();
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof j5) {
                    j5 j5Var = (j5) view;
                    if (!j5Var.f21244a) {
                        j5Var.f21244a = true;
                        j5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                b2 b2Var = ((z1) obj).d;
                int i11 = AndroidUtilities.displaySize.x;
                b2Var.L = i11;
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
                Window window = b2Var.getWindow();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(window.getAttributes());
                int min = Math.min(dp, dp2);
                Rect rect = b2Var.A0;
                layoutParams.width = min + rect.left + rect.right;
                try {
                    window.setAttributes(layoutParams);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 7:
                f2 f2Var = (f2) obj;
                f2Var.f20597f1.setVisibility(0);
                f2Var.f20599h1.setAlpha(0.0f);
                f2Var.f20598g1.startAnimation(AnimationUtils.loadAnimation(f2Var.getContext(), f2Var.f20595d1));
                f2Var.f20599h1.animate().setDuration(300L).alpha(1.0f).setListener(new c2(f2Var, 0)).start();
                return;
            case 8:
                f3 f3Var = (f3) ((x2) obj).f21688c;
                onDismissListener = f3Var.onHideListener;
                if (onDismissListener != null) {
                    onDismissListener2 = f3Var.onHideListener;
                    onDismissListener2.onDismiss(f3Var);
                }
                try {
                    f3Var.dismissInternal();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 9:
                w2 w2Var = (w2) obj;
                w2Var.getClass();
                try {
                    w2Var.f21639b.dismissInternal();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 10:
                t3 t3Var = (t3) obj;
                if (t3Var.mo37getWindowView() != null) {
                    t3Var.mo37getWindowView().setDrawingFromOverlay(true);
                    return;
                }
                return;
            case 11:
                ((w3) obj).f();
                return;
            case 12:
                u4 u4Var = (u4) ((d2) obj).f20515b;
                u4Var.k();
                u4Var.j();
                return;
            case 13:
                u4 u4Var2 = ((r4) obj).f21493b;
                u4Var2.f21540c.dismiss();
                u4Var2.f21542f.removeAllViews();
                return;
            case 14:
                ((r4) obj).f21493b.f21540c.dismiss();
                return;
            case 15:
                Drawable drawable2 = (Drawable) obj;
                i6.d = null;
                i6.N();
                if (!i6.f20774b) {
                    i6.i(drawable2);
                    i6.h(drawable2);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
                return;
            case 16:
                ((CountDownLatch) obj).countDown();
                return;
            case 17:
                ok.m(1, (n2) obj);
                return;
            case 18:
                k8 k8Var = (k8) i6.f20837e5.remove((MessageObject) obj);
                if (k8Var != null) {
                    k8Var.f27988i = null;
                    return;
                }
                return;
            default:
                ((h6) obj).s();
                return;
        }
    }
}
