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
    public final int f20483a;
    public final Object f20484b;

    public p(Object obj, int i10) {
        this.f20483a = i10;
        this.f20484b = obj;
    }

    @Override
    public final void run() {
        int dp;
        DialogInterface.OnDismissListener onDismissListener;
        DialogInterface.OnDismissListener onDismissListener2;
        int i10 = this.f20483a;
        Object obj = this.f20484b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f19419m1;
                AndroidUtilities.runOnUIThread((cg.v1) obj);
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
                if (view instanceof l5) {
                    l5 l5Var = (l5) view;
                    if (!l5Var.f20403a) {
                        l5Var.f20403a = true;
                        l5Var.invalidate();
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
                Rect rect = d2Var.f19590x0;
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
                h2Var.f19722c1.setVisibility(0);
                h2Var.f19724e1.setAlpha(0.0f);
                h2Var.f19723d1.startAnimation(AnimationUtils.loadAnimation(h2Var.getContext(), h2Var.f19720a1));
                h2Var.f19724e1.animate().setDuration(300L).alpha(1.0f).setListener(new e2(h2Var, 0)).start();
                return;
            case 8:
                g3 g3Var = (g3) ((y2) obj).f20724c;
                onDismissListener = g3Var.onHideListener;
                if (onDismissListener != null) {
                    onDismissListener2 = g3Var.onHideListener;
                    onDismissListener2.onDismiss(g3Var);
                }
                try {
                    g3Var.dismissInternal();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 9:
                x2 x2Var = (x2) obj;
                x2Var.getClass();
                try {
                    x2Var.f20703b.dismissInternal();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
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
                w4 w4Var = (w4) ((f2) obj).f19654b;
                w4Var.k();
                w4Var.j();
                return;
            case 13:
                w4 w4Var2 = ((t4) obj).f20556b;
                w4Var2.f20673c.dismiss();
                w4Var2.f20674f.removeAllViews();
                return;
            case 14:
                ((t4) obj).f20556b.f20673c.dismiss();
                return;
            case 15:
                Drawable drawable2 = (Drawable) obj;
                j6.d = null;
                j6.N();
                if (!j6.f19838b) {
                    j6.i(drawable2);
                    j6.h(drawable2);
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
                d8 d8Var = (d8) j6.f19898e5.remove((MessageObject) obj);
                if (d8Var != null) {
                    d8Var.f24217i = null;
                    return;
                }
                return;
            default:
                ((i6) obj).s();
                return;
        }
    }
}
