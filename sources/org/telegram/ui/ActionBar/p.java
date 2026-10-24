package org.telegram.ui.ActionBar;

import ai.db;
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
import org.telegram.messenger.tl;
import org.telegram.ui.Components.j8;
public final class p implements Runnable {
    public final int f21746a;
    public final Object f21747b;

    public p(Object obj, int i10) {
        this.f21746a = i10;
        this.f21747b = obj;
    }

    @Override
    public final void run() {
        int dp;
        DialogInterface.OnDismissListener onDismissListener;
        DialogInterface.OnDismissListener onDismissListener2;
        int i10 = this.f21746a;
        Object obj = this.f21747b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f20611v1;
                AndroidUtilities.runOnUIThread((db) obj);
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
                b1Var.W = true;
                AndroidUtilities.makeGlobalBlurBitmap(new w0(b1Var, 0), 8.0f);
                return;
            case 4:
                ((o1) obj).c();
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof o5) {
                    o5 o5Var = (o5) view;
                    if (!o5Var.f21743a) {
                        o5Var.f21743a = true;
                        o5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                y1 y1Var = (y1) obj;
                c2 c2Var = y1Var.d;
                int i11 = AndroidUtilities.displaySize.x;
                c2Var.L = i11;
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
                Rect rect = c2Var.C0;
                int i12 = min + rect.left + rect.right;
                if (c2Var.Z0) {
                    ViewGroup.LayoutParams layoutParams = y1Var.getLayoutParams();
                    if (layoutParams != null && layoutParams.width != i12) {
                        layoutParams.width = i12;
                        y1Var.requestLayout();
                        return;
                    }
                    return;
                }
                Window window = c2Var.getWindow();
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
                g2 g2Var = (g2) obj;
                g2Var.f20906o1.setVisibility(0);
                g2Var.f20908q1.setAlpha(0.0f);
                g2Var.f20907p1.startAnimation(AnimationUtils.loadAnimation(g2Var.getContext(), g2Var.f20904m1));
                g2Var.f20908q1.animate().setDuration(300L).alpha(1.0f).setListener(new d2(g2Var, 0)).start();
                return;
            case 8:
                h3 h3Var = (h3) ((y2) obj).f21976c;
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
                x2 x2Var = (x2) obj;
                x2Var.getClass();
                try {
                    x2Var.f21957b.dismissInternal();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 10:
                w3 w3Var = (w3) obj;
                if (w3Var.mo36getWindowView() != null) {
                    w3Var.mo36getWindowView().setDrawingFromOverlay(true);
                    return;
                }
                return;
            case 11:
                ((z3) obj).f();
                return;
            case 12:
                y4 y4Var = (y4) ((e2) obj).f20847b;
                y4Var.k();
                y4Var.j();
                return;
            case 13:
                y4 y4Var2 = ((v4) obj).f21929b;
                y4Var2.f21994c.dismiss();
                y4Var2.f21995f.removeAllViews();
                return;
            case 14:
                ((v4) obj).f21929b.f21994c.dismiss();
                return;
            case 15:
                Drawable drawable2 = (Drawable) obj;
                k6.d = null;
                k6.O();
                if (!k6.f21138b) {
                    k6.i(drawable2);
                    k6.h(drawable2);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
                return;
            case 16:
                ((CountDownLatch) obj).countDown();
                return;
            case 17:
                tl.o(1, (o2) obj);
                return;
            case 18:
                j8 j8Var = (j8) k6.f21200e5.remove((MessageObject) obj);
                if (j8Var != null) {
                    j8Var.f27609i = null;
                    return;
                }
                return;
            default:
                ((j6) obj).s();
                return;
        }
    }
}
