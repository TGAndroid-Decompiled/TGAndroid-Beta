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
import org.telegram.messenger.wl;
import org.telegram.ui.Components.i8;
public final class r implements Runnable {
    public final int f19531a;
    public final Object f19532b;

    public r(Object obj, int i10) {
        this.f19531a = i10;
        this.f19532b = obj;
    }

    @Override
    public final void run() {
        int dp;
        DialogInterface.OnDismissListener onDismissListener;
        DialogInterface.OnDismissListener onDismissListener2;
        int i10 = this.f19531a;
        Object obj = this.f19532b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f18384p1;
                AndroidUtilities.runOnUIThread((c9) obj);
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
                ((q1) obj).c();
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof l5) {
                    l5 l5Var = (l5) view;
                    if (!l5Var.f19377a) {
                        l5Var.f19377a = true;
                        l5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                c2 c2Var = ((a2) obj).d;
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
                Window window = c2Var.getWindow();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(window.getAttributes());
                int min = Math.min(dp, dp2);
                Rect rect = c2Var.A0;
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
                g2Var.f18665f1.setVisibility(0);
                g2Var.f18667h1.setAlpha(0.0f);
                g2Var.f18666g1.startAnimation(AnimationUtils.loadAnimation(g2Var.getContext(), g2Var.f18663d1));
                g2Var.f18667h1.animate().setDuration(300L).alpha(1.0f).setListener(new d2(g2Var, 0)).start();
                return;
            case 8:
                g3 g3Var = (g3) ((y2) obj).f19703c;
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
                    x2Var.f19675b.dismissInternal();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 10:
                v3 v3Var = (v3) obj;
                if (v3Var.mo37getWindowView() != null) {
                    v3Var.mo37getWindowView().setDrawingFromOverlay(true);
                    return;
                }
                return;
            case 11:
                ((y3) obj).f();
                return;
            case 12:
                w4 w4Var = (w4) ((e2) obj).f18606b;
                w4Var.k();
                w4Var.j();
                return;
            case 13:
                w4 w4Var2 = ((t4) obj).f19561b;
                w4Var2.f19639c.dismiss();
                w4Var2.f19640f.removeAllViews();
                return;
            case 14:
                ((t4) obj).f19561b.f19639c.dismiss();
                return;
            case 15:
                Drawable drawable2 = (Drawable) obj;
                j6.d = null;
                j6.N();
                if (!j6.f18818b) {
                    j6.i(drawable2);
                    j6.h(drawable2);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
                return;
            case 16:
                ((CountDownLatch) obj).countDown();
                return;
            case 17:
                wl.m(1, (o2) obj);
                return;
            case 18:
                i8 i8Var = (i8) j6.f18880e5.remove((MessageObject) obj);
                if (i8Var != null) {
                    i8Var.f24856i = null;
                    return;
                }
                return;
            default:
                ((i6) obj).s();
                return;
        }
    }
}
