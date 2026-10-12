package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class qh0 extends s4.t0 {
    public final int f29816a;
    public final Object f29817b;

    public qh0(Object obj, int i10) {
        this.f29816a = i10;
        this.f29817b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        gm0 gm0Var;
        int i11 = this.f29816a;
        rg.o1 o1Var = null;
        boolean z10 = false;
        Object obj = this.f29817b;
        switch (i11) {
            case 0:
                wh0 wh0Var = (wh0) obj;
                ph0 ph0Var = wh0Var.f32393b;
                if (i10 == 0 && wh0.J(wh0Var) + ((wh0Var.E - wh0.I(wh0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && ph0Var.canScrollVertically(1)) {
                    ph0Var.getChildAt(0);
                    gm0 gm0Var2 = (gm0) ph0Var.K(0);
                    if (gm0Var2 != null) {
                        View view = gm0Var2.f47897a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            ph0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                wm0 wm0Var = (wm0) obj;
                if (i10 == 0) {
                    if (wm0Var.f32479t2) {
                        wm0Var.f32479t2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!wm0Var.f32479t2 && wm0Var.f32482v1) {
                    wm0Var.f32479t2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && wm0Var.L1 != null) {
                    om0 om0Var = wm0Var.f32445c1;
                    if (om0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(om0Var);
                        wm0Var.f32445c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        wm0Var.K1.y0(obtain);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    wm0Var.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = wm0Var.L1;
                    wm0Var.h1(view2, 0.0f, 0.0f, false);
                    wm0Var.L1 = null;
                    wm0Var.k1(null, view2);
                    wm0Var.N1 = false;
                }
                s4.t0 t0Var = wm0Var.Y0;
                if (t0Var != null) {
                    t0Var.a(recyclerView, i10);
                }
                z10 = (i10 == 1 || i10 == 2) ? true : true;
                wm0Var.I1 = z10;
                if (z10) {
                    wm0Var.J1 = true;
                    return;
                }
                return;
            case 3:
                ho0 ho0Var = (ho0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(ho0Var.F.getCurrentFocus());
                }
                ho0Var.a();
                return;
            case 7:
                y71 y71Var = (y71) obj;
                ai.w0 w0Var = y71Var.d;
                if (i10 == 0 && y71Var.G && AndroidUtilities.dp(13.0f) + y71.o(y71Var) + y71Var.f32971y < AndroidUtilities.statusBarHeight * 2 && w0Var.canScrollVertically(1) && (gm0Var = (gm0) w0Var.K(0)) != null) {
                    View view3 = gm0Var.f47897a;
                    if (view3.getTop() > 0) {
                        w0Var.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                rg.t0 t0Var2 = (rg.t0) obj;
                if (i10 == 1) {
                    t0Var2.f47604b3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        rg.o1 o1Var2 = (rg.o1) t0Var2.getChildAt(i12);
                        if (o1Var == null || o1Var2.f47590a > o1Var.f47590a) {
                            o1Var = o1Var2;
                        }
                    }
                    if (o1Var != null) {
                        t0Var2.x1(o1Var, true);
                        t0Var2.f47604b3 = false;
                        t0Var2.v0(0, o1Var.getTop() - ((t0Var2.getMeasuredHeight() - o1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    t0Var2.y1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(t0Var2.f47605c3);
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((tg.z0) obj).Y.getEditText());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(androidx.recyclerview.widget.RecyclerView r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qh0.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
