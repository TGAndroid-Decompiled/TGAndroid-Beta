package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class c2 extends x2 {
    public final f2 f28821m1;
    public final s4[] n1;
    public final h2 f28822o1;
    public final x2[] f28823p1;

    public c2(Activity activity, i6 i6Var, f2 f2Var, s4[] s4VarArr, h2 h2Var, x2[] x2VarArr) {
        super(1, (Context) activity, i6Var, true);
        boolean z10;
        this.f28821m1 = f2Var;
        this.n1 = s4VarArr;
        this.f28822o1 = h2Var;
        this.f28823p1 = x2VarArr;
        if (f2Var != null && f2Var.f28926e) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30231x = z10;
        this.f30217n = !z10;
        s4VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) s4VarArr[0]).c(-1, h2Var);
        ((ActionBarLayout) s4VarArr[0]).f0();
        ViewGroup view = s4VarArr[0].getView();
        int i7 = this.f30227u0;
        view.setPadding(i7, 0, i7, 0);
        this.f30192b = s4VarArr[0].getView();
        this.f30230w0 = false;
        setOnDismissListener(new z1(1, h2Var, f2Var));
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final boolean J(MotionEvent motionEvent) {
        s4[] s4VarArr;
        s4 s4Var;
        f2 f2Var = this.f28821m1;
        if (f2Var == null || !f2Var.f28923a || (s4Var = (s4VarArr = this.n1)[0]) == null || s4Var.getFragmentStack().size() > 1 || (s4VarArr[0].getFragmentStack().size() == 1 && !((h2) s4VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        f2 f2Var;
        Runnable runnable;
        if (!this.J && (f2Var = this.f28821m1) != null && (runnable = f2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.H1.Q;
        s4[] s4VarArr = this.n1;
        arrayList.remove(s4VarArr[0]);
        s4VarArr[0] = null;
    }

    @Override
    public final void onBackPressed() {
        s4[] s4VarArr = this.n1;
        s4 s4Var = s4VarArr[0];
        if (s4Var != null && s4Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) s4VarArr[0]).I();
            return;
        }
        s4 s4Var2 = s4VarArr[0];
        if (s4Var2 != null && !s4Var2.getFragmentStack().isEmpty() && ((h2) s4VarArr[0].getFragmentStack().get(0)).closeOpenMenuOverlay(true)) {
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s4 s4Var = this.n1[0];
        x2[] x2VarArr = this.f28823p1;
        s4Var.setWindow(x2VarArr[0].getWindow());
        f2 f2Var = this.f28821m1;
        if (f2Var != null && f2Var.f28926e) {
            org.telegram.messenger.g0.m3(x2VarArr[0], true);
        } else {
            Q(n6.f29487i5);
        }
        h2 h2Var = this.f28822o1;
        org.telegram.messenger.g0.p3(this, h2Var.isLightStatusBar());
        h2Var.onBottomSheetCreated();
    }

    @Override
    public final void p0() {
        s4 s4Var = this.n1[0];
        if (s4Var != null) {
            for (h2 h2Var : s4Var.getFragmentStack()) {
                if (h2Var.getFragmentView() != null) {
                    h2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override
    public final void v() {
        Runnable runnable;
        this.f28822o1.onTransitionAnimationEnd(true, false);
        f2 f2Var = this.f28821m1;
        if (f2Var != null && (runnable = f2Var.f28925c) != null) {
            runnable.run();
        }
    }
}
