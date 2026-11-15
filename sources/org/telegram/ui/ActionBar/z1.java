package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class z1 extends u2 {
    public final c2 f29910m1;
    public final o4[] n1;
    public final e2 f29911o1;
    public final u2[] f29912p1;

    public z1(Activity activity, e6 e6Var, c2 c2Var, o4[] o4VarArr, e2 e2Var, u2[] u2VarArr) {
        super(1, (Context) activity, e6Var, true);
        boolean z10;
        this.f29910m1 = c2Var;
        this.n1 = o4VarArr;
        this.f29911o1 = e2Var;
        this.f29912p1 = u2VarArr;
        if (c2Var != null && c2Var.f28479e) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29721x = z10;
        this.f29707n = !z10;
        o4VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) o4VarArr[0]).c(-1, e2Var);
        ((ActionBarLayout) o4VarArr[0]).f0();
        ViewGroup view = o4VarArr[0].getView();
        int i7 = this.f29717u0;
        view.setPadding(i7, 0, i7, 0);
        this.f29682b = o4VarArr[0].getView();
        this.f29720w0 = false;
        setOnDismissListener(new di.a3(6, e2Var, c2Var));
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final boolean J(MotionEvent motionEvent) {
        o4[] o4VarArr;
        o4 o4Var;
        c2 c2Var = this.f29910m1;
        if (c2Var == null || !c2Var.f28476a || (o4Var = (o4VarArr = this.n1)[0]) == null || o4Var.getFragmentStack().size() > 1 || (o4VarArr[0].getFragmentStack().size() == 1 && !((e2) o4VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        c2 c2Var;
        Runnable runnable;
        if (!this.J && (c2Var = this.f29910m1) != null && (runnable = c2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.H1.Q;
        o4[] o4VarArr = this.n1;
        arrayList.remove(o4VarArr[0]);
        o4VarArr[0] = null;
    }

    @Override
    public final void onBackPressed() {
        o4[] o4VarArr = this.n1;
        o4 o4Var = o4VarArr[0];
        if (o4Var != null && o4Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) o4VarArr[0]).I();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o4 o4Var = this.n1[0];
        u2[] u2VarArr = this.f29912p1;
        o4Var.setWindow(u2VarArr[0].getWindow());
        c2 c2Var = this.f29910m1;
        if (c2Var != null && c2Var.f28479e) {
            org.telegram.messenger.g0.n3(u2VarArr[0], true);
        } else {
            Q(j6.f28940i5);
        }
        e2 e2Var = this.f29911o1;
        org.telegram.messenger.g0.q3(this, e2Var.isLightStatusBar());
        e2Var.onBottomSheetCreated();
    }

    @Override
    public final void p0() {
        o4 o4Var = this.n1[0];
        if (o4Var != null) {
            for (e2 e2Var : o4Var.getFragmentStack()) {
                if (e2Var.getFragmentView() != null) {
                    e2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override
    public final void v() {
        Runnable runnable;
        this.f29911o1.onTransitionAnimationEnd(true, false);
        c2 c2Var = this.f29910m1;
        if (c2Var != null && (runnable = c2Var.f28478c) != null) {
            runnable.run();
        }
    }
}
