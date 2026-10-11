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
public final class h2 extends e3 {
    public final k2 f20680b;
    public final b5[] f20681c;
    public final m2 d;
    public final e3[] f20682e;

    public h2(Activity activity, d6 d6Var, k2 k2Var, b5[] b5VarArr, m2 m2Var, e3[] e3VarArr) {
        super(1, (Context) activity, d6Var, true);
        boolean z10;
        this.f20680b = k2Var;
        this.f20681c = b5VarArr;
        this.d = m2Var;
        this.f20682e = e3VarArr;
        if (k2Var != null && k2Var.f21316e) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.occupyNavigationBar = z10;
        this.drawNavigationBar = !z10;
        b5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) b5VarArr[0]).c(-1, m2Var);
        ((ActionBarLayout) b5VarArr[0]).c0();
        ViewGroup view = b5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = b5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new ei.e0(4, m2Var, k2Var));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        b5[] b5VarArr;
        b5 b5Var;
        k2 k2Var = this.f20680b;
        if (k2Var == null || !k2Var.f21313a || (b5Var = (b5VarArr = this.f20681c)[0]) == null || b5Var.getFragmentStack().size() > 1 || (b5VarArr[0].getFragmentStack().size() == 1 && !((m2) b5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        k2 k2Var;
        Runnable runnable;
        if (!isDismissed() && (k2Var = this.f20680b) != null && (runnable = k2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.G1.P;
        b5[] b5VarArr = this.f20681c;
        arrayList.remove(b5VarArr[0]);
        b5VarArr[0] = null;
    }

    @Override
    public final void onBackPressed() {
        b5[] b5VarArr = this.f20681c;
        b5 b5Var = b5VarArr[0];
        if (b5Var != null && b5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) b5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b5 b5Var = this.f20681c[0];
        e3[] e3VarArr = this.f20682e;
        b5Var.setWindow(e3VarArr[0].getWindow());
        m2 m2Var = this.d;
        k2 k2Var = this.f20680b;
        if (k2Var != null && k2Var.f21316e) {
            AndroidUtilities.setLightNavigationBar((Dialog) e3VarArr[0], true);
        } else {
            fixNavigationBar(h6.w0(h6.f20876i5, m2Var.getResourceProvider()));
        }
        AndroidUtilities.setLightStatusBar(this, m2Var.isLightStatusBar());
        m2Var.onBottomSheetCreated();
    }

    @Override
    public final void onInsetsChanged() {
        b5 b5Var = this.f20681c[0];
        if (b5Var != null) {
            for (m2 m2Var : b5Var.getFragmentStack()) {
                if (m2Var.getFragmentView() != null) {
                    m2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        Runnable runnable;
        this.d.onTransitionAnimationEnd(true, false);
        k2 k2Var = this.f20680b;
        if (k2Var != null && (runnable = k2Var.f21315c) != null) {
            runnable.run();
        }
    }
}
