package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class k2 extends h3 {
    public final n2 f21576b;
    public final f5[] f21577c;
    public final p2 d;
    public final h3[] f21578e;

    public k2(Activity activity, g6 g6Var, n2 n2Var, f5[] f5VarArr, p2 p2Var, h3[] h3VarArr) {
        super(activity, g6Var, true, false);
        boolean z4;
        this.f21576b = n2Var;
        this.f21577c = f5VarArr;
        this.d = p2Var;
        this.f21578e = h3VarArr;
        if (n2Var != null && n2Var.f22161e) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.occupyNavigationBar = z4;
        this.drawNavigationBar = !z4;
        f5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) f5VarArr[0]).c(-1, p2Var);
        ((ActionBarLayout) f5VarArr[0]).c0();
        ViewGroup view = f5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = f5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new hg.g(3, p2Var, n2Var));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        f5[] f5VarArr;
        f5 f5Var;
        n2 n2Var = this.f21576b;
        if (n2Var == null || !n2Var.f22158a || (f5Var = (f5VarArr = this.f21577c)[0]) == null || f5Var.getFragmentStack().size() > 1 || (f5VarArr[0].getFragmentStack().size() == 1 && !((p2) f5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        n2 n2Var;
        Runnable runnable;
        if (!isDismissed() && (n2Var = this.f21576b) != null && (runnable = n2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.D1.M;
        f5[] f5VarArr = this.f21577c;
        arrayList.remove(f5VarArr[0]);
        f5VarArr[0] = null;
    }

    @Override
    public final void onBackPressed() {
        f5[] f5VarArr = this.f21577c;
        f5 f5Var = f5VarArr[0];
        if (f5Var != null && f5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) f5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f5 f5Var = this.f21577c[0];
        h3[] h3VarArr = this.f21578e;
        f5Var.setWindow(h3VarArr[0].getWindow());
        p2 p2Var = this.d;
        n2 n2Var = this.f21576b;
        if (n2Var != null && n2Var.f22161e) {
            AndroidUtilities.setLightNavigationBar((Dialog) h3VarArr[0], true);
        } else {
            fixNavigationBar(k6.v0(k6.f21751i5, p2Var.getResourceProvider()));
        }
        AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
        p2Var.onBottomSheetCreated();
    }

    @Override
    public final void onInsetsChanged() {
        f5 f5Var = this.f21577c[0];
        if (f5Var != null) {
            for (p2 p2Var : f5Var.getFragmentStack()) {
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
        n2 n2Var = this.f21576b;
        if (n2Var != null && (runnable = n2Var.f22160c) != null) {
            runnable.run();
        }
    }
}
