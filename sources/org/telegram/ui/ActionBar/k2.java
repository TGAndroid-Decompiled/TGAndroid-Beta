package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class k2 extends g3 {
    public final n2 f20358b;
    public final e5[] f20359c;
    public final p2 d;
    public final g3[] e;

    public k2(Activity activity, f6 f6Var, n2 n2Var, e5[] e5VarArr, p2 p2Var, g3[] g3VarArr) {
        super(activity, f6Var, true, false);
        boolean z4;
        this.f20358b = n2Var;
        this.f20359c = e5VarArr;
        this.d = p2Var;
        this.e = g3VarArr;
        if (n2Var != null && n2Var.e) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.occupyNavigationBar = z4;
        this.drawNavigationBar = !z4;
        e5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) e5VarArr[0]).c(-1, p2Var);
        ((ActionBarLayout) e5VarArr[0]).c0();
        ViewGroup view = e5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = e5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new gg.g(3, p2Var, n2Var));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        e5[] e5VarArr;
        e5 e5Var;
        n2 n2Var = this.f20358b;
        if (n2Var == null || !n2Var.f20478a || (e5Var = (e5VarArr = this.f20359c)[0]) == null || e5Var.getFragmentStack().size() > 1 || (e5VarArr[0].getFragmentStack().size() == 1 && !((p2) e5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        n2 n2Var;
        Runnable runnable;
        if (!isDismissed() && (n2Var = this.f20358b) != null && (runnable = n2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.D1.M;
        e5[] e5VarArr = this.f20359c;
        arrayList.remove(e5VarArr[0]);
        e5VarArr[0] = null;
    }

    @Override
    public final void onBackPressed() {
        e5[] e5VarArr = this.f20359c;
        e5 e5Var = e5VarArr[0];
        if (e5Var != null && e5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) e5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e5 e5Var = this.f20359c[0];
        g3[] g3VarArr = this.e;
        e5Var.setWindow(g3VarArr[0].getWindow());
        p2 p2Var = this.d;
        n2 n2Var = this.f20358b;
        if (n2Var != null && n2Var.e) {
            AndroidUtilities.setLightNavigationBar((Dialog) g3VarArr[0], true);
        } else {
            fixNavigationBar(j6.v0(j6.f19995i5, p2Var.getResourceProvider()));
        }
        AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
        p2Var.onBottomSheetCreated();
    }

    @Override
    public final void onInsetsChanged() {
        e5 e5Var = this.f20359c[0];
        if (e5Var != null) {
            for (p2 p2Var : e5Var.getFragmentStack()) {
                if (p2Var.getFragmentView() != null) {
                    p2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        Runnable runnable;
        this.d.onTransitionAnimationEnd(true, false);
        n2 n2Var = this.f20358b;
        if (n2Var != null && (runnable = n2Var.f20480c) != null) {
            runnable.run();
        }
    }
}
