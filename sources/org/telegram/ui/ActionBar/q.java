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
import org.telegram.ui.Components.h8;
public final class q implements Runnable {
    public final int f23731a;
    public final Object f23732b;

    public q(Object obj, int i10) {
        this.f23731a = i10;
        this.f23732b = obj;
    }

    @Override
    public final void run() {
        int dp;
        DialogInterface.OnDismissListener onDismissListener;
        DialogInterface.OnDismissListener onDismissListener2;
        int i10 = this.f23731a;
        Object obj = this.f23732b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.l1;
                AndroidUtilities.runOnUIThread((ag.z1) obj);
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
                d1Var.Q = true;
                AndroidUtilities.makeGlobalBlurBitmap(new y0(d1Var, 0), 8.0f);
                return;
            case 4:
                ((q1) obj).c();
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof i5) {
                    i5 i5Var = (i5) view;
                    if (!i5Var.f23529a) {
                        i5Var.f23529a = true;
                        i5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                c2 c2Var = ((a2) obj).d;
                int i11 = AndroidUtilities.displaySize.x;
                c2Var.H = i11;
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
                Window window = c2Var.getWindow();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(window.getAttributes());
                int min = Math.min(dp, dp2);
                Rect rect = c2Var.f22808w0;
                layoutParams.width = min + rect.left + rect.right;
                try {
                    window.setAttributes(layoutParams);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 7:
                g2 g2Var = (g2) obj;
                g2Var.f22976b1.setVisibility(0);
                g2Var.f22978d1.setAlpha(0.0f);
                g2Var.f22977c1.startAnimation(AnimationUtils.loadAnimation(g2Var.getContext(), g2Var.Z0));
                g2Var.f22978d1.animate().setDuration(300L).alpha(1.0f).setListener(new d2(g2Var, 0)).start();
                return;
            case 8:
                f3 f3Var = (f3) ((x2) obj).f23962c;
                onDismissListener = f3Var.onHideListener;
                if (onDismissListener != null) {
                    onDismissListener2 = f3Var.onHideListener;
                    onDismissListener2.onDismiss(f3Var);
                }
                try {
                    f3Var.dismissInternal();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 9:
                w2 w2Var = (w2) obj;
                w2Var.getClass();
                try {
                    w2Var.f23943b.dismissInternal();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 10:
                s3 s3Var = (s3) obj;
                if (s3Var.mo37getWindowView() != null) {
                    s3Var.mo37getWindowView().setDrawingFromOverlay(true);
                    return;
                }
                return;
            case 11:
                ((v3) obj).f();
                return;
            case 12:
                t4 t4Var = (t4) ((e2) obj).f22892b;
                t4Var.k();
                t4Var.j();
                return;
            case 13:
                t4 t4Var2 = ((q4) obj).f23761b;
                t4Var2.f23794c.dismiss();
                t4Var2.f23796f.removeAllViews();
                return;
            case 14:
                ((q4) obj).f23761b.f23794c.dismiss();
                return;
            case 15:
                Drawable drawable2 = (Drawable) obj;
                g6.d = null;
                g6.N();
                if (!g6.f23020b) {
                    g6.i(drawable2);
                    g6.h(drawable2);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
                return;
            case 16:
                ((CountDownLatch) obj).countDown();
                return;
            case 17:
                org.telegram.ui.b.l(1, (o2) obj);
                return;
            case 18:
                h8 h8Var = (h8) g6.f23079e5.remove((MessageObject) obj);
                if (h8Var != null) {
                    h8Var.f29115i = null;
                    return;
                }
                return;
            default:
                ((f6) obj).s();
                return;
        }
    }
}
