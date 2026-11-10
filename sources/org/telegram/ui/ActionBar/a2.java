package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class a2 extends w2 {
    public final d2 l1;
    public final r4[] f27307m1;
    public final f2 n1;
    public final w2[] f27308o1;

    public a2(Activity activity, h6 h6Var, d2 d2Var, r4[] r4VarArr, f2 f2Var, w2[] w2VarArr) {
        super(1, (Context) activity, h6Var, true);
        boolean z9;
        this.l1 = d2Var;
        this.f27307m1 = r4VarArr;
        this.n1 = f2Var;
        this.f27308o1 = w2VarArr;
        if (d2Var != null && d2Var.f27391e) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f28710x = z9;
        this.f28696n = !z9;
        r4VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) r4VarArr[0]).c(-1, f2Var);
        ((ActionBarLayout) r4VarArr[0]).f0();
        ViewGroup view = r4VarArr[0].getView();
        int i7 = this.f28705t0;
        view.setPadding(i7, 0, i7, 0);
        this.f28672b = r4VarArr[0].getView();
        this.f28707v0 = false;
        setOnDismissListener(new bi.u3(6, f2Var, d2Var));
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final boolean I(MotionEvent motionEvent) {
        r4[] r4VarArr;
        r4 r4Var;
        d2 d2Var = this.l1;
        if (d2Var == null || !d2Var.f27388a || (r4Var = (r4VarArr = this.f27307m1)[0]) == null || r4Var.getFragmentStack().size() > 1 || (r4VarArr[0].getFragmentStack().size() == 1 && !((f2) r4VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        d2 d2Var;
        Runnable runnable;
        if (!this.I && (d2Var = this.l1) != null && (runnable = d2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.G1.P;
        r4[] r4VarArr = this.f27307m1;
        arrayList.remove(r4VarArr[0]);
        r4VarArr[0] = null;
    }

    @Override
    public final void onBackPressed() {
        r4[] r4VarArr = this.f27307m1;
        r4 r4Var = r4VarArr[0];
        if (r4Var != null && r4Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) r4VarArr[0]).I();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r4 r4Var = this.f27307m1[0];
        w2[] w2VarArr = this.f27308o1;
        r4Var.setWindow(w2VarArr[0].getWindow());
        d2 d2Var = this.l1;
        if (d2Var != null && d2Var.f27391e) {
            org.telegram.messenger.g0.n3(w2VarArr[0], true);
        } else {
            P(m6.f27981i5);
        }
        f2 f2Var = this.n1;
        org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
        f2Var.onBottomSheetCreated();
    }

    @Override
    public final void p0() {
        r4 r4Var = this.f27307m1[0];
        if (r4Var != null) {
            for (f2 f2Var : r4Var.getFragmentStack()) {
                if (f2Var.getFragmentView() != null) {
                    f2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override
    public final void v() {
        Runnable runnable;
        this.n1.onTransitionAnimationEnd(true, false);
        d2 d2Var = this.l1;
        if (d2Var != null && (runnable = d2Var.f27390c) != null) {
            runnable.run();
        }
    }
}
