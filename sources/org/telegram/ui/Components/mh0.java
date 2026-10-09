package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class mh0 extends s4.t0 {
    public final int f28836a;
    public final Object f28837b;

    public mh0(Object obj, int i10) {
        this.f28836a = i10;
        this.f28837b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        am0 am0Var;
        int i11 = this.f28836a;
        rg.o1 o1Var = null;
        boolean z10 = false;
        Object obj = this.f28837b;
        switch (i11) {
            case 0:
                sh0 sh0Var = (sh0) obj;
                lh0 lh0Var = sh0Var.f30796b;
                if (i10 == 0 && sh0.J(sh0Var) + ((sh0Var.E - sh0.I(sh0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && lh0Var.canScrollVertically(1)) {
                    lh0Var.getChildAt(0);
                    am0 am0Var2 = (am0) lh0Var.K(0);
                    if (am0Var2 != null) {
                        View view = am0Var2.f47656a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            lh0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                qm0 qm0Var = (qm0) obj;
                if (i10 == 0) {
                    if (qm0Var.f30228t2) {
                        qm0Var.f30228t2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!qm0Var.f30228t2 && qm0Var.f30231v1) {
                    qm0Var.f30228t2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && qm0Var.L1 != null) {
                    im0 im0Var = qm0Var.f30194c1;
                    if (im0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(im0Var);
                        qm0Var.f30194c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        qm0Var.K1.T0(obtain);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    qm0Var.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = qm0Var.L1;
                    qm0Var.h1(view2, 0.0f, 0.0f, false);
                    qm0Var.L1 = null;
                    qm0Var.k1(null, view2);
                    qm0Var.N1 = false;
                }
                s4.t0 t0Var = qm0Var.Y0;
                if (t0Var != null) {
                    t0Var.a(recyclerView, i10);
                }
                z10 = (i10 == 1 || i10 == 2) ? true : true;
                qm0Var.I1 = z10;
                if (z10) {
                    qm0Var.J1 = true;
                    return;
                }
                return;
            case 3:
                bo0 bo0Var = (bo0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(bo0Var.F.getCurrentFocus());
                }
                bo0Var.a();
                return;
            case 7:
                t71 t71Var = (t71) obj;
                ai.w0 w0Var = t71Var.d;
                if (i10 == 0 && t71Var.G && AndroidUtilities.dp(13.0f) + t71.o(t71Var) + t71Var.f31084y < AndroidUtilities.statusBarHeight * 2 && w0Var.canScrollVertically(1) && (am0Var = (am0) w0Var.K(0)) != null) {
                    View view3 = am0Var.f47656a;
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
                    s0Var.f47389b3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        rg.o1 o1Var2 = (rg.o1) s0Var.getChildAt(i12);
                        if (o1Var == null || o1Var2.f47366a > o1Var.f47366a) {
                            o1Var = o1Var2;
                        }
                    }
                    if (o1Var != null) {
                        s0Var.x1(o1Var, true);
                        s0Var.f47389b3 = false;
                        s0Var.v0(0, o1Var.getTop() - ((s0Var.getMeasuredHeight() - o1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var.y1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(s0Var.f47390c3);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mh0.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
