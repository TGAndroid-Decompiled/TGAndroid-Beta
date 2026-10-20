package org.telegram.ui.ActionBar;

import ai.cb;
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
import org.telegram.messenger.mk;
import org.telegram.ui.Components.l8;
public final class p implements Runnable {
    public final int f21658a;
    public final Object f21659b;

    public p(Object obj, int i10) {
        this.f21658a = i10;
        this.f21659b = obj;
    }

    @Override
    public final void run() {
        int dp;
        DialogInterface.OnDismissListener onDismissListener;
        DialogInterface.OnDismissListener onDismissListener2;
        int i10 = this.f21658a;
        Object obj = this.f21659b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f20543p1;
                AndroidUtilities.runOnUIThread((cb) obj);
                return;
            case 1:
                u0 u0Var = (u0) obj;
                if (u0Var.getParent() != null) {
                    u0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                u0Var.M(null, null);
                return;
            case 2:
                ((t0) obj).setSelectedForDelete(false);
                return;
            case 3:
                b1 b1Var = (b1) obj;
                b1Var.U = true;
                AndroidUtilities.makeGlobalBlurBitmap(new w0(b1Var, 0), 8.0f);
                return;
            case 4:
                ((o1) obj).c();
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof k5) {
                    k5 k5Var = (k5) view;
                    if (!k5Var.f21549a) {
                        k5Var.f21549a = true;
                        k5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                z1 z1Var = (z1) obj;
                b2 b2Var = z1Var.d;
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
                int min = Math.min(dp, dp2);
                Rect rect = b2Var.A0;
                int i12 = min + rect.left + rect.right;
                if (b2Var.X0) {
                    ViewGroup.LayoutParams layoutParams = z1Var.getLayoutParams();
                    if (layoutParams != null && layoutParams.width != i12) {
                        layoutParams.width = i12;
                        z1Var.requestLayout();
                        return;
                    }
                    return;
                }
                Window window = b2Var.getWindow();
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
                f2 f2Var = (f2) obj;
                f2Var.f20800f1.setVisibility(0);
                f2Var.f20802h1.setAlpha(0.0f);
                f2Var.f20801g1.startAnimation(AnimationUtils.loadAnimation(f2Var.getContext(), f2Var.f20798d1));
                f2Var.f20802h1.animate().setDuration(300L).alpha(1.0f).setListener(new c2(f2Var, 0)).start();
                return;
            case 8:
                f3 f3Var = (f3) ((x2) obj).f21874c;
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
                    w2Var.f21832b.dismissInternal();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 10:
                t3 t3Var = (t3) obj;
                if (t3Var.mo36getWindowView() != null) {
                    t3Var.mo36getWindowView().setDrawingFromOverlay(true);
                    return;
                }
                return;
            case 11:
                ((w3) obj).f();
                return;
            case 12:
                v4 v4Var = (v4) ((d2) obj).f20746b;
                v4Var.k();
                v4Var.j();
                return;
            case 13:
                v4 v4Var2 = ((s4) obj).f21711b;
                v4Var2.f21803c.dismiss();
                v4Var2.f21804f.removeAllViews();
                return;
            case 14:
                ((s4) obj).f21711b.f21803c.dismiss();
                return;
            case 15:
                Drawable drawable2 = (Drawable) obj;
                h6.d = null;
                h6.O();
                if (!h6.f20944b) {
                    h6.i(drawable2);
                    h6.h(drawable2);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
                return;
            case 16:
                ((CountDownLatch) obj).countDown();
                return;
            case 17:
                mk.n(1, (n2) obj);
                return;
            case 18:
                l8 l8Var = (l8) h6.f21006e5.remove((MessageObject) obj);
                if (l8Var != null) {
                    l8Var.f28102i = null;
                    return;
                }
                return;
            default:
                ((g6) obj).s();
                return;
        }
    }
}
