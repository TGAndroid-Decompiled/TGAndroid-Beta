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
public final class i2 extends f3 {
    public final l2 f20543b;
    public final d5[] f20544c;
    public final n2 d;
    public final f3[] f20545e;

    public i2(Activity activity, f6 f6Var, l2 l2Var, d5[] d5VarArr, n2 n2Var, f3[] f3VarArr) {
        super(1, (Context) activity, f6Var, true);
        boolean z10;
        this.f20543b = l2Var;
        this.f20544c = d5VarArr;
        this.d = n2Var;
        this.f20545e = f3VarArr;
        if (l2Var != null && l2Var.f21172e) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.occupyNavigationBar = z10;
        this.drawNavigationBar = !z10;
        d5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) d5VarArr[0]).c(-1, n2Var);
        ((ActionBarLayout) d5VarArr[0]).c0();
        ViewGroup view = d5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = d5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new fi.e0(4, n2Var, l2Var));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        d5[] d5VarArr;
        d5 d5Var;
        l2 l2Var = this.f20543b;
        if (l2Var == null || !l2Var.f21169a || (d5Var = (d5VarArr = this.f20544c)[0]) == null || d5Var.getFragmentStack().size() > 1 || (d5VarArr[0].getFragmentStack().size() == 1 && !((n2) d5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        l2 l2Var;
        Runnable runnable;
        if (!isDismissed() && (l2Var = this.f20543b) != null && (runnable = l2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.G1.P;
        d5[] d5VarArr = this.f20544c;
        arrayList.remove(d5VarArr[0]);
        d5VarArr[0] = null;
    }

    @Override
    public final void onBackPressed() {
        d5[] d5VarArr = this.f20544c;
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
        d5 d5Var = this.f20544c[0];
        f3[] f3VarArr = this.f20545e;
        d5Var.setWindow(f3VarArr[0].getWindow());
        n2 n2Var = this.d;
        l2 l2Var = this.f20543b;
        if (l2Var != null && l2Var.f21172e) {
            AndroidUtilities.setLightNavigationBar((Dialog) f3VarArr[0], true);
        } else {
            fixNavigationBar(j6.v0(j6.f20779i5, n2Var.getResourceProvider()));
        }
        AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        n2Var.onBottomSheetCreated();
    }

    @Override
    public final void onInsetsChanged() {
        d5 d5Var = this.f20544c[0];
        if (d5Var != null) {
            for (n2 n2Var : d5Var.getFragmentStack()) {
                if (n2Var.getFragmentView() != null) {
                    n2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        Runnable runnable;
        this.d.onTransitionAnimationEnd(true, false);
        l2 l2Var = this.f20543b;
        if (l2Var != null && (runnable = l2Var.f21171c) != null) {
            runnable.run();
        }
    }
}
