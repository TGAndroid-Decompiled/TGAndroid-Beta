package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class j2 extends g3 {
    public final m2 f19475b;
    public final d5[] f19476c;
    public final o2 d;
    public final g3[] e;

    public j2(Activity activity, e6 e6Var, m2 m2Var, d5[] d5VarArr, o2 o2Var, g3[] g3VarArr) {
        super(1, (Context) activity, e6Var, true);
        boolean z10;
        this.f19475b = m2Var;
        this.f19476c = d5VarArr;
        this.d = o2Var;
        this.e = g3VarArr;
        if (m2Var != null && m2Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.occupyNavigationBar = z10;
        this.drawNavigationBar = !z10;
        d5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) d5VarArr[0]).c(-1, o2Var);
        ((ActionBarLayout) d5VarArr[0]).c0();
        ViewGroup view = d5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = d5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new ei.e0(4, o2Var, m2Var));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        d5[] d5VarArr;
        d5 d5Var;
        m2 m2Var = this.f19475b;
        if (m2Var == null || !m2Var.f19631a || (d5Var = (d5VarArr = this.f19476c)[0]) == null || d5Var.getFragmentStack().size() > 1 || (d5VarArr[0].getFragmentStack().size() == 1 && !((o2) d5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        m2 m2Var;
        Runnable runnable;
        if (!isDismissed() && (m2Var = this.f19475b) != null && (runnable = m2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.G1.P;
        d5[] d5VarArr = this.f19476c;
        arrayList.remove(d5VarArr[0]);
        d5VarArr[0] = null;
    }

    @Override
    public final void onBackPressed() {
        d5[] d5VarArr = this.f19476c;
        d5 d5Var = d5VarArr[0];
        if (d5Var != null && d5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) d5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d5 d5Var = this.f19476c[0];
        g3[] g3VarArr = this.e;
        d5Var.setWindow(g3VarArr[0].getWindow());
        o2 o2Var = this.d;
        m2 m2Var = this.f19475b;
        if (m2Var != null && m2Var.e) {
            AndroidUtilities.setLightNavigationBar((Dialog) g3VarArr[0], true);
        } else {
            fixNavigationBar(i6.v0(i6.f19146i5, o2Var.getResourceProvider()));
        }
        AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        o2Var.onBottomSheetCreated();
    }

    @Override
    public final void onInsetsChanged() {
        d5 d5Var = this.f19476c[0];
        if (d5Var != null) {
            for (o2 o2Var : d5Var.getFragmentStack()) {
                if (o2Var.getFragmentView() != null) {
                    o2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        Runnable runnable;
        this.d.onTransitionAnimationEnd(true, false);
        m2 m2Var = this.f19475b;
        if (m2Var != null && (runnable = m2Var.f19633c) != null) {
            runnable.run();
        }
    }
}
