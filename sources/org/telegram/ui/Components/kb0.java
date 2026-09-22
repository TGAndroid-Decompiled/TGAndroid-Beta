package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class kb0 extends s4.s0 {
    public final int f25581a;
    public final Object f25582b;

    public kb0(Object obj, int i10) {
        this.f25581a = i10;
        this.f25582b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        vk0 vk0Var;
        int i11 = this.f25581a;
        rg.n1 n1Var = null;
        boolean z10 = false;
        Object obj = this.f25582b;
        switch (i11) {
            case 1:
                pg0 pg0Var = (pg0) obj;
                jg0 jg0Var = pg0Var.f27032b;
                if (i10 == 0 && pg0.I(pg0Var) + ((pg0Var.E - pg0.H(pg0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && jg0Var.canScrollVertically(1)) {
                    jg0Var.getChildAt(0);
                    vk0 vk0Var2 = (vk0) jg0Var.K(0);
                    if (vk0Var2 != null) {
                        View view = vk0Var2.f42671a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            jg0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ll0 ll0Var = (ll0) obj;
                if (i10 == 0) {
                    if (ll0Var.f25981v2) {
                        ll0Var.f25981v2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!ll0Var.f25981v2 && ll0Var.f25984x1) {
                    ll0Var.f25981v2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && ll0Var.N1 != null) {
                    dl0 dl0Var = ll0Var.f25947e1;
                    if (dl0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(dl0Var);
                        ll0Var.f25947e1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        ll0Var.M1.y(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    ll0Var.N1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = ll0Var.N1;
                    ll0Var.h1(view2, 0.0f, 0.0f, false);
                    ll0Var.N1 = null;
                    ll0Var.k1(null, view2);
                    ll0Var.P1 = false;
                }
                s4.s0 s0Var = ll0Var.f25940a1;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i10);
                }
                z10 = (i10 == 1 || i10 == 2) ? true : true;
                ll0Var.K1 = z10;
                if (z10) {
                    ll0Var.L1 = true;
                    return;
                }
                return;
            case 4:
                vm0 vm0Var = (vm0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(vm0Var.F.getCurrentFocus());
                }
                vm0Var.a();
                return;
            case 8:
                o61 o61Var = (o61) obj;
                ai.w0 w0Var = o61Var.d;
                if (i10 == 0 && o61Var.G && AndroidUtilities.dp(13.0f) + o61.m(o61Var) + o61Var.f26709y < AndroidUtilities.statusBarHeight * 2 && w0Var.canScrollVertically(1) && (vk0Var = (vk0) w0Var.K(0)) != null) {
                    View view3 = vk0Var.f42671a;
                    if (view3.getTop() > 0) {
                        w0Var.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                rg.s0 s0Var2 = (rg.s0) obj;
                if (i10 == 1) {
                    s0Var2.f42404d3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        rg.n1 n1Var2 = (rg.n1) s0Var2.getChildAt(i12);
                        if (n1Var == null || n1Var2.f42390a > n1Var.f42390a) {
                            n1Var = n1Var2;
                        }
                    }
                    if (n1Var != null) {
                        s0Var2.w1(n1Var, true);
                        s0Var2.f42404d3 = false;
                        s0Var2.v0(0, n1Var.getTop() - ((s0Var2.getMeasuredHeight() - n1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var2.x1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(s0Var2.f42405e3);
                return;
            case 13:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((tg.a1) obj).Y.getEditText());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(androidx.recyclerview.widget.RecyclerView r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kb0.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
