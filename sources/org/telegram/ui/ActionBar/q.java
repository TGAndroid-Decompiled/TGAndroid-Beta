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
import org.telegram.messenger.rk;
import org.telegram.ui.Components.j8;
public final class q implements Runnable {
    public final int f19723a;
    public final Object f19724b;

    public q(Object obj, int i10) {
        this.f19723a = i10;
        this.f19724b = obj;
    }

    @Override
    public final void run() {
        int dp;
        DialogInterface.OnDismissListener onDismissListener;
        DialogInterface.OnDismissListener onDismissListener2;
        int i10 = this.f19723a;
        Object obj = this.f19724b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f18592p1;
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
                if (view instanceof k5) {
                    k5 k5Var = (k5) view;
                    if (!k5Var.f19571a) {
                        k5Var.f19571a = true;
                        k5Var.invalidate();
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
                f2Var.f18856f1.setVisibility(0);
                f2Var.f18858h1.setAlpha(0.0f);
                f2Var.f18857g1.startAnimation(AnimationUtils.loadAnimation(f2Var.getContext(), f2Var.f18854d1));
                f2Var.f18858h1.animate().setDuration(300L).alpha(1.0f).setListener(new c2(f2Var, 0)).start();
                return;
            case 8:
                f3 f3Var = (f3) ((x2) obj).f19895c;
                onDismissListener = f3Var.onHideListener;
                if (onDismissListener != null) {
                    onDismissListener2 = f3Var.onHideListener;
                    onDismissListener2.onDismiss(f3Var);
                }
                try {
                    f3Var.dismissInternal();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 9:
                w2 w2Var = (w2) obj;
                w2Var.getClass();
                try {
                    w2Var.f19867b.dismissInternal();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 10:
                u3 u3Var = (u3) obj;
                if (u3Var.mo37getWindowView() != null) {
                    u3Var.mo37getWindowView().setDrawingFromOverlay(true);
                    return;
                }
                return;
            case 11:
                ((x3) obj).f();
                return;
            case 12:
                v4 v4Var = (v4) ((d2) obj).f18796b;
                v4Var.k();
                v4Var.j();
                return;
            case 13:
                v4 v4Var2 = ((s4) obj).f19753b;
                v4Var2.f19831c.dismiss();
                v4Var2.f19832f.removeAllViews();
                return;
            case 14:
                ((s4) obj).f19753b.f19831c.dismiss();
                return;
            case 15:
                Drawable drawable2 = (Drawable) obj;
                j6.d = null;
                j6.N();
                if (!j6.f19050b) {
                    j6.i(drawable2);
                    j6.h(drawable2);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
                return;
            case 16:
                ((CountDownLatch) obj).countDown();
                return;
            case 17:
                rk.m(1, (n2) obj);
                return;
            case 18:
                j8 j8Var = (j8) j6.f19112e5.remove((MessageObject) obj);
                if (j8Var != null) {
                    j8Var.f25279i = null;
                    return;
                }
                return;
            default:
                ((i6) obj).s();
                return;
        }
    }
}
