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
    public final m2 f18778b;
    public final e5[] f18779c;
    public final o2 d;
    public final g3[] e;

    public j2(Activity activity, f6 f6Var, m2 m2Var, e5[] e5VarArr, o2 o2Var, g3[] g3VarArr) {
        super(1, (Context) activity, f6Var, true);
        boolean z10;
        this.f18778b = m2Var;
        this.f18779c = e5VarArr;
        this.d = o2Var;
        this.e = g3VarArr;
        if (m2Var != null && m2Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.occupyNavigationBar = z10;
        this.drawNavigationBar = !z10;
        e5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) e5VarArr[0]).c(-1, o2Var);
        ((ActionBarLayout) e5VarArr[0]).c0();
        ViewGroup view = e5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = e5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new ei.e0(4, o2Var, m2Var));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        e5[] e5VarArr;
        e5 e5Var;
        m2 m2Var = this.f18778b;
        if (m2Var == null || !m2Var.f19397a || (e5Var = (e5VarArr = this.f18779c)[0]) == null || e5Var.getFragmentStack().size() > 1 || (e5VarArr[0].getFragmentStack().size() == 1 && !((o2) e5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        m2 m2Var;
        Runnable runnable;
        if (!isDismissed() && (m2Var = this.f18778b) != null && (runnable = m2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.G1.P;
        e5[] e5VarArr = this.f18779c;
        arrayList.remove(e5VarArr[0]);
        e5VarArr[0] = null;
    }

    @Override
    public final void onBackPressed() {
        e5[] e5VarArr = this.f18779c;
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
        e5 e5Var = this.f18779c[0];
        g3[] g3VarArr = this.e;
        e5Var.setWindow(g3VarArr[0].getWindow());
        o2 o2Var = this.d;
        m2 m2Var = this.f18778b;
        if (m2Var != null && m2Var.e) {
            AndroidUtilities.setLightNavigationBar((Dialog) g3VarArr[0], true);
        } else {
            fixNavigationBar(j6.v0(j6.f18951i5, o2Var.getResourceProvider()));
        }
        AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        o2Var.onBottomSheetCreated();
    }

    @Override
    public final void onInsetsChanged() {
        e5 e5Var = this.f18779c[0];
        if (e5Var != null) {
            for (o2 o2Var : e5Var.getFragmentStack()) {
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
        m2 m2Var = this.f18778b;
        if (m2Var != null && (runnable = m2Var.f19399c) != null) {
            runnable.run();
        }
    }
}
