package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class nh0 extends s4.t0 {
    public final int f29166a;
    public final Object f29167b;

    public nh0(Object obj, int i10) {
        this.f29166a = i10;
        this.f29167b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        bm0 bm0Var;
        int i11 = this.f29166a;
        rg.o1 o1Var = null;
        boolean z10 = false;
        Object obj = this.f29167b;
        switch (i11) {
            case 0:
                th0 th0Var = (th0) obj;
                mh0 mh0Var = th0Var.f31255b;
                if (i10 == 0 && th0.J(th0Var) + ((th0Var.E - th0.I(th0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && mh0Var.canScrollVertically(1)) {
                    mh0Var.getChildAt(0);
                    bm0 bm0Var2 = (bm0) mh0Var.K(0);
                    if (bm0Var2 != null) {
                        View view = bm0Var2.f47782a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            mh0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                rm0 rm0Var = (rm0) obj;
                if (i10 == 0) {
                    if (rm0Var.f30582t2) {
                        rm0Var.f30582t2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!rm0Var.f30582t2 && rm0Var.f30585v1) {
                    rm0Var.f30582t2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && rm0Var.L1 != null) {
                    jm0 jm0Var = rm0Var.f30548c1;
                    if (jm0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(jm0Var);
                        rm0Var.f30548c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        rm0Var.K1.T0(obtain);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    rm0Var.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = rm0Var.L1;
                    rm0Var.h1(view2, 0.0f, 0.0f, false);
                    rm0Var.L1 = null;
                    rm0Var.k1(null, view2);
                    rm0Var.N1 = false;
                }
                s4.t0 t0Var = rm0Var.Y0;
                if (t0Var != null) {
                    t0Var.a(recyclerView, i10);
                }
                z10 = (i10 == 1 || i10 == 2) ? true : true;
                rm0Var.I1 = z10;
                if (z10) {
                    rm0Var.J1 = true;
                    return;
                }
                return;
            case 3:
                co0 co0Var = (co0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(co0Var.F.getCurrentFocus());
                }
                co0Var.a();
                return;
            case 7:
                u71 u71Var = (u71) obj;
                ai.w0 w0Var = u71Var.d;
                if (i10 == 0 && u71Var.G && AndroidUtilities.dp(13.0f) + u71.o(u71Var) + u71Var.f31475y < AndroidUtilities.statusBarHeight * 2 && w0Var.canScrollVertically(1) && (bm0Var = (bm0) w0Var.K(0)) != null) {
                    View view3 = bm0Var.f47782a;
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
                    s0Var.f47515b3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        rg.o1 o1Var2 = (rg.o1) s0Var.getChildAt(i12);
                        if (o1Var == null || o1Var2.f47492a > o1Var.f47492a) {
                            o1Var = o1Var2;
                        }
                    }
                    if (o1Var != null) {
                        s0Var.x1(o1Var, true);
                        s0Var.f47515b3 = false;
                        s0Var.v0(0, o1Var.getTop() - ((s0Var.getMeasuredHeight() - o1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var.y1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(s0Var.f47516c3);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nh0.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
