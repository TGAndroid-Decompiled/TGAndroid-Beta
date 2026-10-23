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
public final class j2 extends h3 {
    public final m2 f20989b;
    public final h5[] f20990c;
    public final o2 d;
    public final h3[] e;

    public j2(Activity activity, g6 g6Var, m2 m2Var, h5[] h5VarArr, o2 o2Var, h3[] h3VarArr) {
        super(1, (Context) activity, g6Var, true);
        boolean z10;
        this.f20989b = m2Var;
        this.f20990c = h5VarArr;
        this.d = o2Var;
        this.e = h3VarArr;
        if (m2Var != null && m2Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.occupyNavigationBar = z10;
        this.drawNavigationBar = !z10;
        h5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) h5VarArr[0]).c(-1, o2Var);
        ((ActionBarLayout) h5VarArr[0]).d0();
        ViewGroup view = h5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = h5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new ai.z3(6, o2Var, m2Var));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        h5[] h5VarArr;
        h5 h5Var;
        m2 m2Var = this.f20989b;
        if (m2Var == null || !m2Var.f21636a || (h5Var = (h5VarArr = this.f20990c)[0]) == null || h5Var.getFragmentStack().size() > 1 || (h5VarArr[0].getFragmentStack().size() == 1 && !((o2) h5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        m2 m2Var;
        Runnable runnable;
        if (!isDismissed() && (m2Var = this.f20989b) != null && (runnable = m2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.J1.P;
        h5[] h5VarArr = this.f20990c;
        arrayList.remove(h5VarArr[0]);
        h5VarArr[0] = null;
    }

    @Override
    public final void onBackPressed() {
        h5[] h5VarArr = this.f20990c;
        h5 h5Var = h5VarArr[0];
        if (h5Var != null && h5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) h5VarArr[0]).H();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h5 h5Var = this.f20990c[0];
        h3[] h3VarArr = this.e;
        h5Var.setWindow(h3VarArr[0].getWindow());
        m2 m2Var = this.f20989b;
        if (m2Var != null && m2Var.e) {
            AndroidUtilities.setLightNavigationBar((Dialog) h3VarArr[0], true);
        } else {
            fixNavigationBarKey(k6.f21271i5);
        }
        o2 o2Var = this.d;
        AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        o2Var.onBottomSheetCreated();
    }

    @Override
    public final void onInsetsChanged() {
        h5 h5Var = this.f20990c[0];
        if (h5Var != null) {
            for (o2 o2Var : h5Var.getFragmentStack()) {
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
        m2 m2Var = this.f20989b;
        if (m2Var != null && (runnable = m2Var.f21638c) != null) {
            runnable.run();
        }
    }
}
