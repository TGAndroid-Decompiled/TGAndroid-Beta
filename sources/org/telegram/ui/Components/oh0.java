package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class oh0 extends s4.t0 {
    public final int f29405a;
    public final Object f29406b;

    public oh0(Object obj, int i10) {
        this.f29405a = i10;
        this.f29406b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        cm0 cm0Var;
        int i11 = this.f29405a;
        rg.o1 o1Var = null;
        boolean z10 = false;
        Object obj = this.f29406b;
        switch (i11) {
            case 0:
                uh0 uh0Var = (uh0) obj;
                nh0 nh0Var = uh0Var.f31451b;
                if (i10 == 0 && uh0.J(uh0Var) + ((uh0Var.E - uh0.I(uh0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && nh0Var.canScrollVertically(1)) {
                    nh0Var.getChildAt(0);
                    cm0 cm0Var2 = (cm0) nh0Var.K(0);
                    if (cm0Var2 != null) {
                        View view = cm0Var2.f47748a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            nh0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                sm0 sm0Var = (sm0) obj;
                if (i10 == 0) {
                    if (sm0Var.f30819t2) {
                        sm0Var.f30819t2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!sm0Var.f30819t2 && sm0Var.f30822v1) {
                    sm0Var.f30819t2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && sm0Var.L1 != null) {
                    km0 km0Var = sm0Var.f30785c1;
                    if (km0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(km0Var);
                        sm0Var.f30785c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        sm0Var.K1.T0(obtain);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    sm0Var.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = sm0Var.L1;
                    sm0Var.h1(view2, 0.0f, 0.0f, false);
                    sm0Var.L1 = null;
                    sm0Var.k1(null, view2);
                    sm0Var.N1 = false;
                }
                s4.t0 t0Var = sm0Var.Y0;
                if (t0Var != null) {
                    t0Var.a(recyclerView, i10);
                }
                z10 = (i10 == 1 || i10 == 2) ? true : true;
                sm0Var.I1 = z10;
                if (z10) {
                    sm0Var.J1 = true;
                    return;
                }
                return;
            case 3:
                do0 do0Var = (do0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(do0Var.F.getCurrentFocus());
                }
                do0Var.a();
                return;
            case 7:
                v71 v71Var = (v71) obj;
                ai.w0 w0Var = v71Var.d;
                if (i10 == 0 && v71Var.G && AndroidUtilities.dp(13.0f) + v71.o(v71Var) + v71Var.f31702y < AndroidUtilities.statusBarHeight * 2 && w0Var.canScrollVertically(1) && (cm0Var = (cm0) w0Var.K(0)) != null) {
                    View view3 = cm0Var.f47748a;
                    if (view3.getTop() > 0) {
                        w0Var.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                rg.s0 s0Var = (rg.s0) obj;
                if (i10 == 1) {
                    s0Var.f47481b3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        rg.o1 o1Var2 = (rg.o1) s0Var.getChildAt(i12);
                        if (o1Var == null || o1Var2.f47458a > o1Var.f47458a) {
                            o1Var = o1Var2;
                        }
                    }
                    if (o1Var != null) {
                        s0Var.x1(o1Var, true);
                        s0Var.f47481b3 = false;
                        s0Var.v0(0, o1Var.getTop() - ((s0Var.getMeasuredHeight() - o1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var.y1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(s0Var.f47482c3);
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((tg.y0) obj).Y.getEditText());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(androidx.recyclerview.widget.RecyclerView r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oh0.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
