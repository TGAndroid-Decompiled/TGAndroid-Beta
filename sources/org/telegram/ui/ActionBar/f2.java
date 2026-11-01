package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class f2 extends z2 {
    public final i2 f20296i1;
    public final z4[] f20297j1;
    public final k2 f20298k1;
    public final z2[] l1;

    public f2(Activity activity, p6 p6Var, i2 i2Var, z4[] z4VarArr, k2 k2Var, z2[] z2VarArr) {
        super(1, (Context) activity, p6Var, true);
        boolean z10;
        this.f20296i1 = i2Var;
        this.f20297j1 = z4VarArr;
        this.f20298k1 = k2Var;
        this.l1 = z2VarArr;
        if (i2Var != null && i2Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f21621x = z10;
        this.f21607n = !z10;
        z4VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) z4VarArr[0]).c(-1, k2Var);
        ((ActionBarLayout) z4VarArr[0]).e0();
        ViewGroup view = z4VarArr[0].getView();
        int i10 = this.f21616t0;
        view.setPadding(i10, 0, i10, 0);
        this.f21587b = z4VarArr[0].getView();
        this.f21618v0 = false;
        setOnDismissListener(new mg.g(2, k2Var, i2Var));
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final boolean J(MotionEvent motionEvent) {
        z4[] z4VarArr;
        z4 z4Var;
        i2 i2Var = this.f20296i1;
        if (i2Var == null || !i2Var.f20390a || (z4Var = (z4VarArr = this.f20297j1)[0]) == null || z4Var.getFragmentStack().size() > 1 || (z4VarArr[0].getFragmentStack().size() == 1 && !((k2) z4VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        i2 i2Var;
        Runnable runnable;
        if (!this.I && (i2Var = this.f20296i1) != null && (runnable = i2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.I1.P;
        z4[] z4VarArr = this.f20297j1;
        arrayList.remove(z4VarArr[0]);
        z4VarArr[0] = null;
    }

    @Override
    public final void onBackPressed() {
        z4[] z4VarArr = this.f20297j1;
        z4 z4Var = z4VarArr[0];
        if (z4Var != null && z4Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) z4VarArr[0]).H();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z4 z4Var = this.f20297j1[0];
        z2[] z2VarArr = this.l1;
        z4Var.setWindow(z2VarArr[0].getWindow());
        i2 i2Var = this.f20296i1;
        if (i2Var != null && i2Var.e) {
            org.telegram.messenger.i0.m3(z2VarArr[0], true);
        } else {
            Q(t6.f21020i5);
        }
        k2 k2Var = this.f20298k1;
        org.telegram.messenger.i0.p3(this, k2Var.isLightStatusBar());
        k2Var.onBottomSheetCreated();
    }

    @Override
    public final void p0() {
        z4 z4Var = this.f20297j1[0];
        if (z4Var != null) {
            for (k2 k2Var : z4Var.getFragmentStack()) {
                if (k2Var.getFragmentView() != null) {
                    k2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override
    public final void w() {
        Runnable runnable;
        this.f20298k1.onTransitionAnimationEnd(true, false);
        i2 i2Var = this.f20296i1;
        if (i2Var != null && (runnable = i2Var.f20392c) != null) {
            runnable.run();
        }
    }
}
