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
public final class p implements Runnable {
    public final int f19693a;
    public final Object f19694b;

    public p(Object obj, int i10) {
        this.f19693a = i10;
        this.f19694b = obj;
    }

    @Override
    public final void run() {
        int dp;
        DialogInterface.OnDismissListener onDismissListener;
        DialogInterface.OnDismissListener onDismissListener2;
        int i10 = this.f19693a;
        Object obj = this.f19694b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f18599p1;
                AndroidUtilities.runOnUIThread((c9) obj);
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
                if (view instanceof i5) {
                    i5 i5Var = (i5) view;
                    if (!i5Var.f19482a) {
                        i5Var.f19482a = true;
                        i5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                a2 a2Var = ((y1) obj).d;
                int i11 = AndroidUtilities.displaySize.x;
                a2Var.L = i11;
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
                Window window = a2Var.getWindow();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(window.getAttributes());
                int min = Math.min(dp, dp2);
                Rect rect = a2Var.A0;
                layoutParams.width = min + rect.left + rect.right;
                try {
                    window.setAttributes(layoutParams);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 7:
                e2 e2Var = (e2) obj;
                e2Var.f18845f1.setVisibility(0);
                e2Var.f18847h1.setAlpha(0.0f);
                e2Var.f18846g1.startAnimation(AnimationUtils.loadAnimation(e2Var.getContext(), e2Var.f18843d1));
                e2Var.f18847h1.animate().setDuration(300L).alpha(1.0f).setListener(new b2(e2Var, 0)).start();
                return;
            case 8:
                e3 e3Var = (e3) ((w2) obj).f19899c;
                onDismissListener = e3Var.onHideListener;
                if (onDismissListener != null) {
                    onDismissListener2 = e3Var.onHideListener;
                    onDismissListener2.onDismiss(e3Var);
                }
                try {
                    e3Var.dismissInternal();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 9:
                v2 v2Var = (v2) obj;
                v2Var.getClass();
                try {
                    v2Var.f19852b.dismissInternal();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
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
                t4 t4Var = (t4) ((c2) obj).f18772b;
                t4Var.k();
                t4Var.j();
                return;
            case 13:
                t4 t4Var2 = ((q4) obj).f19716b;
                t4Var2.f19760c.dismiss();
                t4Var2.f19761f.removeAllViews();
                return;
            case 14:
                ((q4) obj).f19716b.f19760c.dismiss();
                return;
            case 15:
                Drawable drawable2 = (Drawable) obj;
                h6.d = null;
                h6.N();
                if (!h6.f19015b) {
                    h6.i(drawable2);
                    h6.h(drawable2);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
                return;
            case 16:
                ((CountDownLatch) obj).countDown();
                return;
            case 17:
                ok.m(1, (m2) obj);
                return;
            case 18:
                k8 k8Var = (k8) h6.f19077e5.remove((MessageObject) obj);
                if (k8Var != null) {
                    k8Var.f25659i = null;
                    return;
                }
                return;
            default:
                ((g6) obj).s();
                return;
        }
    }
}
