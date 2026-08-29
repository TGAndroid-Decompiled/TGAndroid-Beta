package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class j2 extends f3 {
    public final m2 f23548b;
    public final b5[] f23549c;
    public final o2 d;
    public final f3[] f23550e;

    public j2(Activity activity, c6 c6Var, m2 m2Var, b5[] b5VarArr, o2 o2Var, f3[] f3VarArr) {
        super(activity, c6Var, true, false);
        boolean z10;
        this.f23548b = m2Var;
        this.f23549c = b5VarArr;
        this.d = o2Var;
        this.f23550e = f3VarArr;
        if (m2Var != null && m2Var.f23676e) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.occupyNavigationBar = z10;
        this.drawNavigationBar = !z10;
        b5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) b5VarArr[0]).c(-1, o2Var);
        ((ActionBarLayout) b5VarArr[0]).c0();
        ViewGroup view = b5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = b5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new eg.g(3, o2Var, m2Var));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        b5[] b5VarArr;
        b5 b5Var;
        m2 m2Var = this.f23548b;
        if (m2Var == null || !m2Var.f23673a || (b5Var = (b5VarArr = this.f23549c)[0]) == null || b5Var.getFragmentStack().size() > 1 || (b5VarArr[0].getFragmentStack().size() == 1 && !((o2) b5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        m2 m2Var;
        Runnable runnable;
        if (!isDismissed() && (m2Var = this.f23548b) != null && (runnable = m2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.C1.L;
        b5[] b5VarArr = this.f23549c;
        arrayList.remove(b5VarArr[0]);
        b5VarArr[0] = null;
    }

    @Override
    public final void onBackPressed() {
        b5[] b5VarArr = this.f23549c;
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
        b5 b5Var = this.f23549c[0];
        f3[] f3VarArr = this.f23550e;
        b5Var.setWindow(f3VarArr[0].getWindow());
        o2 o2Var = this.d;
        m2 m2Var = this.f23548b;
        if (m2Var != null && m2Var.f23676e) {
            AndroidUtilities.setLightNavigationBar((Dialog) f3VarArr[0], true);
        } else {
            fixNavigationBar(g6.v0(g6.f23151i5, o2Var.getResourceProvider()));
        }
        AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        o2Var.onBottomSheetCreated();
    }

    @Override
    public final void onInsetsChanged() {
        b5 b5Var = this.f23549c[0];
        if (b5Var != null) {
            for (o2 o2Var : b5Var.getFragmentStack()) {
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
        m2 m2Var = this.f23548b;
        if (m2Var != null && (runnable = m2Var.f23675c) != null) {
            runnable.run();
        }
    }
}
