package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class y1 extends t2 {
    public final b2 f28823j1;
    public final q4[] k1;
    public final d2 f28824l1;
    public final t2[] m1;

    public y1(Activity activity, e6 e6Var, b2 b2Var, q4[] q4VarArr, d2 d2Var, t2[] t2VarArr) {
        super(1, (Context) activity, e6Var, true);
        boolean z10;
        this.f28823j1 = b2Var;
        this.k1 = q4VarArr;
        this.f28824l1 = d2Var;
        this.m1 = t2VarArr;
        if (b2Var != null && b2Var.f27398e) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28622x = z10;
        this.f28608n = !z10;
        q4VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) q4VarArr[0]).c(-1, d2Var);
        ((ActionBarLayout) q4VarArr[0]).f0();
        ViewGroup view = q4VarArr[0].getView();
        int i3 = this.f28618u0;
        view.setPadding(i3, 0, i3, 0);
        this.f28586b = q4VarArr[0].getView();
        this.f28621w0 = false;
        setOnDismissListener(new ci.h3(6, d2Var, b2Var));
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final boolean I(MotionEvent motionEvent) {
        q4[] q4VarArr;
        q4 q4Var;
        b2 b2Var = this.f28823j1;
        if (b2Var == null || !b2Var.f27395a || (q4Var = (q4VarArr = this.k1)[0]) == null || q4Var.getFragmentStack().size() > 1 || (q4VarArr[0].getFragmentStack().size() == 1 && !((d2) q4VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        b2 b2Var;
        Runnable runnable;
        if (!this.J && (b2Var = this.f28823j1) != null && (runnable = b2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.K1.Q;
        q4[] q4VarArr = this.k1;
        arrayList.remove(q4VarArr[0]);
        q4VarArr[0] = null;
    }

    @Override
    public final void onBackPressed() {
        q4[] q4VarArr = this.k1;
        q4 q4Var = q4VarArr[0];
        if (q4Var != null && q4Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) q4VarArr[0]).I();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q4 q4Var = this.k1[0];
        t2[] t2VarArr = this.m1;
        q4Var.setWindow(t2VarArr[0].getWindow());
        b2 b2Var = this.f28823j1;
        if (b2Var != null && b2Var.f27398e) {
            org.telegram.messenger.g0.n3(t2VarArr[0], true);
        } else {
            P(k6.f27971i5);
        }
        d2 d2Var = this.f28824l1;
        org.telegram.messenger.g0.q3(this, d2Var.isLightStatusBar());
        d2Var.onBottomSheetCreated();
    }

    @Override
    public final void p0() {
        q4 q4Var = this.k1[0];
        if (q4Var != null) {
            for (d2 d2Var : q4Var.getFragmentStack()) {
                if (d2Var.getFragmentView() != null) {
                    d2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override
    public final void v() {
        Runnable runnable;
        this.f28824l1.onTransitionAnimationEnd(true, false);
        b2 b2Var = this.f28823j1;
        if (b2Var != null && (runnable = b2Var.f27397c) != null) {
            runnable.run();
        }
    }
}
