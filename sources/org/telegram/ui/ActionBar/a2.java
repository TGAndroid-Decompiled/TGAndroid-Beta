package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class a2 extends v2 {
    public final d2 f27300i1;
    public final q4[] f27301j1;
    public final f2 f27302k1;
    public final v2[] l1;

    public a2(Activity activity, f6 f6Var, d2 d2Var, q4[] q4VarArr, f2 f2Var, v2[] v2VarArr) {
        super(1, (Context) activity, f6Var, true);
        boolean z9;
        this.f27300i1 = d2Var;
        this.f27301j1 = q4VarArr;
        this.f27302k1 = f2Var;
        this.l1 = v2VarArr;
        if (d2Var != null && d2Var.f27424e) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f28651x = z9;
        this.f28637n = !z9;
        q4VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) q4VarArr[0]).c(-1, f2Var);
        ((ActionBarLayout) q4VarArr[0]).f0();
        ViewGroup view = q4VarArr[0].getView();
        int i7 = this.f28646t0;
        view.setPadding(i7, 0, i7, 0);
        this.f28616b = q4VarArr[0].getView();
        this.f28648v0 = false;
        setOnDismissListener(new bi.u3(6, f2Var, d2Var));
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final boolean I(MotionEvent motionEvent) {
        q4[] q4VarArr;
        q4 q4Var;
        d2 d2Var = this.f27300i1;
        if (d2Var == null || !d2Var.f27421a || (q4Var = (q4VarArr = this.f27301j1)[0]) == null || q4Var.getFragmentStack().size() > 1 || (q4VarArr[0].getFragmentStack().size() == 1 && !((f2) q4VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        d2 d2Var;
        Runnable runnable;
        if (!this.I && (d2Var = this.f27300i1) != null && (runnable = d2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.G1.P;
        q4[] q4VarArr = this.f27301j1;
        arrayList.remove(q4VarArr[0]);
        q4VarArr[0] = null;
    }

    @Override
    public final void onBackPressed() {
        q4[] q4VarArr = this.f27301j1;
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
        q4 q4Var = this.f27301j1[0];
        v2[] v2VarArr = this.l1;
        q4Var.setWindow(v2VarArr[0].getWindow());
        d2 d2Var = this.f27300i1;
        if (d2Var != null && d2Var.f27424e) {
            org.telegram.messenger.g0.n3(v2VarArr[0], true);
        } else {
            P(k6.f27940i5);
        }
        f2 f2Var = this.f27302k1;
        org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
        f2Var.onBottomSheetCreated();
    }

    @Override
    public final void p0() {
        q4 q4Var = this.f27301j1[0];
        if (q4Var != null) {
            for (f2 f2Var : q4Var.getFragmentStack()) {
                if (f2Var.getFragmentView() != null) {
                    f2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override
    public final void v() {
        Runnable runnable;
        this.f27302k1.onTransitionAnimationEnd(true, false);
        d2 d2Var = this.f27300i1;
        if (d2Var != null && (runnable = d2Var.f27423c) != null) {
            runnable.run();
        }
    }
}
