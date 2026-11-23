package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class b2 extends w2 {
    public final e2 f28770m1;
    public final r4[] n1;
    public final g2 f28771o1;
    public final w2[] f28772p1;

    public b2(Activity activity, h6 h6Var, e2 e2Var, r4[] r4VarArr, g2 g2Var, w2[] w2VarArr) {
        super(1, (Context) activity, h6Var, true);
        boolean z10;
        this.f28770m1 = e2Var;
        this.n1 = r4VarArr;
        this.f28771o1 = g2Var;
        this.f28772p1 = w2VarArr;
        if (e2Var != null && e2Var.f28874e) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30181x = z10;
        this.f30167n = !z10;
        r4VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) r4VarArr[0]).c(-1, g2Var);
        ((ActionBarLayout) r4VarArr[0]).f0();
        ViewGroup view = r4VarArr[0].getView();
        int i7 = this.f30177u0;
        view.setPadding(i7, 0, i7, 0);
        this.f30142b = r4VarArr[0].getView();
        this.f30180w0 = false;
        setOnDismissListener(new y1(1, g2Var, e2Var));
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final boolean J(MotionEvent motionEvent) {
        r4[] r4VarArr;
        r4 r4Var;
        e2 e2Var = this.f28770m1;
        if (e2Var == null || !e2Var.f28871a || (r4Var = (r4VarArr = this.n1)[0]) == null || r4Var.getFragmentStack().size() > 1 || (r4VarArr[0].getFragmentStack().size() == 1 && !((g2) r4VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        e2 e2Var;
        Runnable runnable;
        if (!this.J && (e2Var = this.f28770m1) != null && (runnable = e2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.H1.Q;
        r4[] r4VarArr = this.n1;
        arrayList.remove(r4VarArr[0]);
        r4VarArr[0] = null;
    }

    @Override
    public final void onBackPressed() {
        r4[] r4VarArr = this.n1;
        r4 r4Var = r4VarArr[0];
        if (r4Var != null && r4Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) r4VarArr[0]).I();
            return;
        }
        r4 r4Var2 = r4VarArr[0];
        if (r4Var2 != null && !r4Var2.getFragmentStack().isEmpty() && ((g2) r4VarArr[0].getFragmentStack().get(0)).closeOpenMenuOverlay(true)) {
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r4 r4Var = this.n1[0];
        w2[] w2VarArr = this.f28772p1;
        r4Var.setWindow(w2VarArr[0].getWindow());
        e2 e2Var = this.f28770m1;
        if (e2Var != null && e2Var.f28874e) {
            org.telegram.messenger.g0.m3(w2VarArr[0], true);
        } else {
            Q(m6.f29438i5);
        }
        g2 g2Var = this.f28771o1;
        org.telegram.messenger.g0.p3(this, g2Var.isLightStatusBar());
        g2Var.onBottomSheetCreated();
    }

    @Override
    public final void p0() {
        r4 r4Var = this.n1[0];
        if (r4Var != null) {
            for (g2 g2Var : r4Var.getFragmentStack()) {
                if (g2Var.getFragmentView() != null) {
                    g2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override
    public final void v() {
        Runnable runnable;
        this.f28771o1.onTransitionAnimationEnd(true, false);
        e2 e2Var = this.f28770m1;
        if (e2Var != null && (runnable = e2Var.f28873c) != null) {
            runnable.run();
        }
    }
}
