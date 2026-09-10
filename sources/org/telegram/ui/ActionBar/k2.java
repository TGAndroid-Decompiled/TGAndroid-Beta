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
public final class k2 extends h3 {
    public final n2 f18339b;
    public final f5[] f18340c;
    public final p2 d;
    public final h3[] e;

    public k2(Activity activity, f6 f6Var, n2 n2Var, f5[] f5VarArr, p2 p2Var, h3[] h3VarArr) {
        super(1, (Context) activity, f6Var, true);
        boolean z10;
        this.f18339b = n2Var;
        this.f18340c = f5VarArr;
        this.d = p2Var;
        this.e = h3VarArr;
        if (n2Var != null && n2Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.occupyNavigationBar = z10;
        this.drawNavigationBar = !z10;
        f5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) f5VarArr[0]).c(-1, p2Var);
        ((ActionBarLayout) f5VarArr[0]).c0();
        ViewGroup view = f5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = f5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new di.h0(4, p2Var, n2Var));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        f5[] f5VarArr;
        f5 f5Var;
        n2 n2Var = this.f18339b;
        if (n2Var == null || !n2Var.f18485a || (f5Var = (f5VarArr = this.f18340c)[0]) == null || f5Var.getFragmentStack().size() > 1 || (f5VarArr[0].getFragmentStack().size() == 1 && !((p2) f5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        n2 n2Var;
        Runnable runnable;
        if (!isDismissed() && (n2Var = this.f18339b) != null && (runnable = n2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.G1.P;
        f5[] f5VarArr = this.f18340c;
        arrayList.remove(f5VarArr[0]);
        f5VarArr[0] = null;
    }

    @Override
    public final void onBackPressed() {
        f5[] f5VarArr = this.f18340c;
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
        f5 f5Var = this.f18340c[0];
        h3[] h3VarArr = this.e;
        f5Var.setWindow(h3VarArr[0].getWindow());
        p2 p2Var = this.d;
        n2 n2Var = this.f18339b;
        if (n2Var != null && n2Var.e) {
            AndroidUtilities.setLightNavigationBar((Dialog) h3VarArr[0], true);
        } else {
            fixNavigationBar(j6.v0(j6.f18016i5, p2Var.getResourceProvider()));
        }
        AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
        p2Var.onBottomSheetCreated();
    }

    @Override
    public final void onInsetsChanged() {
        f5 f5Var = this.f18340c[0];
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
        n2 n2Var = this.f18339b;
        if (n2Var != null && (runnable = n2Var.f18487c) != null) {
            runnable.run();
        }
    }
}
