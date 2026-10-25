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
public final class m2 extends k3 {
    public final p2 f22861b;
    public final j5[] f22862c;
    public final r2 d;
    public final k3[] e;

    public m2(Activity activity, u6 u6Var, p2 p2Var, j5[] j5VarArr, r2 r2Var, k3[] k3VarArr) {
        super(1, (Context) activity, u6Var, true);
        boolean z10;
        this.f22861b = p2Var;
        this.f22862c = j5VarArr;
        this.d = r2Var;
        this.e = k3VarArr;
        if (p2Var != null && p2Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.occupyNavigationBar = z10;
        this.drawNavigationBar = !z10;
        j5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) j5VarArr[0]).c(-1, r2Var);
        ((ActionBarLayout) j5VarArr[0]).e0();
        ViewGroup view = j5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = j5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new bi.u3(6, r2Var, p2Var));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        j5[] j5VarArr;
        j5 j5Var;
        p2 p2Var = this.f22861b;
        if (p2Var == null || !p2Var.f22926a || (j5Var = (j5VarArr = this.f22862c)[0]) == null || j5Var.getFragmentStack().size() > 1 || (j5VarArr[0].getFragmentStack().size() == 1 && !((r2) j5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        p2 p2Var;
        Runnable runnable;
        if (!isDismissed() && (p2Var = this.f22861b) != null && (runnable = p2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.I1.P;
        j5[] j5VarArr = this.f22862c;
        arrayList.remove(j5VarArr[0]);
        j5VarArr[0] = null;
    }

    @Override
    public final void onBackPressed() {
        j5[] j5VarArr = this.f22862c;
        j5 j5Var = j5VarArr[0];
        if (j5Var != null && j5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) j5VarArr[0]).H();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j5 j5Var = this.f22862c[0];
        k3[] k3VarArr = this.e;
        j5Var.setWindow(k3VarArr[0].getWindow());
        p2 p2Var = this.f22861b;
        if (p2Var != null && p2Var.e) {
            AndroidUtilities.setLightNavigationBar((Dialog) k3VarArr[0], true);
        } else {
            fixNavigationBarKey(y6.f23445i5);
        }
        r2 r2Var = this.d;
        AndroidUtilities.setLightStatusBar(this, r2Var.isLightStatusBar());
        r2Var.onBottomSheetCreated();
    }

    @Override
    public final void onInsetsChanged() {
        j5 j5Var = this.f22862c[0];
        if (j5Var != null) {
            for (r2 r2Var : j5Var.getFragmentStack()) {
                if (r2Var.getFragmentView() != null) {
                    r2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        Runnable runnable;
        this.d.onTransitionAnimationEnd(true, false);
        p2 p2Var = this.f22861b;
        if (p2Var != null && (runnable = p2Var.f22928c) != null) {
            runnable.run();
        }
    }
}
