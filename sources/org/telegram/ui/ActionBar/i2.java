package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

public final class i2 extends e3 {

    public final l2 f23501b;

    public final b5[] f23502c;
    public final n2 d;

    public final e3[] f23503e;

    public i2(Activity activity, c6 c6Var, l2 l2Var, b5[] b5VarArr, n2 n2Var, e3[] e3VarArr) {
        super(activity, c6Var, true, false);
        this.f23501b = l2Var;
        this.f23502c = b5VarArr;
        this.d = n2Var;
        this.f23503e = e3VarArr;
        boolean z10 = l2Var != null && l2Var.f23622e;
        this.occupyNavigationBar = z10;
        this.drawNavigationBar = !z10;
        b5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) b5VarArr[0]).c(-1, n2Var);
        ((ActionBarLayout) b5VarArr[0]).c0();
        ViewGroup view = b5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = b5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new cg.g(5, n2Var, l2Var));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        b5[] b5VarArr;
        b5 b5Var;
        l2 l2Var = this.f23501b;
        return l2Var != null && l2Var.f23619a && (b5Var = (b5VarArr = this.f23502c)[0]) != null && b5Var.getFragmentStack().size() <= 1 && (b5VarArr[0].getFragmentStack().size() != 1 || ((n2) b5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent));
    }

    @Override
    public final void dismiss() {
        l2 l2Var;
        Runnable runnable;
        if (!isDismissed() && (l2Var = this.f23501b) != null && (runnable = l2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.C1.L;
        b5[] b5VarArr = this.f23502c;
        arrayList.remove(b5VarArr[0]);
        b5VarArr[0] = null;
    }

    @Override
    public final void onBackPressed() {
        b5[] b5VarArr = this.f23502c;
        b5 b5Var = b5VarArr[0];
        if (b5Var == null || b5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) b5VarArr[0]).G();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b5 b5Var = this.f23502c[0];
        e3[] e3VarArr = this.f23503e;
        b5Var.setWindow(e3VarArr[0].getWindow());
        n2 n2Var = this.d;
        l2 l2Var = this.f23501b;
        if (l2Var == null || !l2Var.f23622e) {
            fixNavigationBar(g6.v0(g6.f23143i5, n2Var.getResourceProvider()));
        } else {
            AndroidUtilities.setLightNavigationBar((Dialog) e3VarArr[0], true);
        }
        AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        n2Var.onBottomSheetCreated();
    }

    @Override
    public final void onInsetsChanged() {
        b5 b5Var = this.f23502c[0];
        if (b5Var != null) {
            for (n2 n2Var : b5Var.getFragmentStack()) {
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
        l2 l2Var = this.f23501b;
        if (l2Var == null || (runnable = l2Var.f23621c) == null) {
            return;
        }
        runnable.run();
    }
}
