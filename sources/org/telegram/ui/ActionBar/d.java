package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class d extends nx0 {
    public final bg0 l1;
    public final wk5[] m1;
    public final e n1;
    public final nx0[] o1;

    public d(Activity activity, vnb vnbVar, bg0 bg0Var, wk5[] wk5VarArr, e eVar, nx0[] nx0VarArr) {
        super(1, vnbVar, (Context) activity, true);
        boolean z;
        this.l1 = bg0Var;
        this.m1 = wk5VarArr;
        this.n1 = eVar;
        this.o1 = nx0VarArr;
        if (bg0Var != null && bg0Var.e) {
            z = true;
        } else {
            z = false;
        }
        this.x = z;
        this.n = !z;
        wk5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) wk5VarArr[0]).b(-1, eVar);
        ((ActionBarLayout) wk5VarArr[0]).e0();
        ViewGroup view = wk5VarArr[0].getView();
        int i = this.u0;
        view.setPadding(i, 0, i, 0);
        this.b = wk5VarArr[0].getView();
        this.w0 = false;
        setOnDismissListener(new gf(eVar, bg0Var, (byte) 3));
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final boolean F(MotionEvent motionEvent) {
        wk5[] wk5VarArr;
        wk5 wk5Var;
        bg0 bg0Var = this.l1;
        if (bg0Var != null && bg0Var.a && (wk5Var = (wk5VarArr = this.m1)[0]) != null && wk5Var.getFragmentStack().size() <= 1) {
            if (wk5VarArr[0].getFragmentStack().size() == 1) {
                e eVar = (e) wk5VarArr[0].getFragmentStack().get(0);
                if (eVar.isSwipeBackEnabled(motionEvent)) {
                    View fragmentView = eVar.getFragmentView();
                    if (motionEvent != null && (fragmentView instanceof ViewGroup) && fragmentView.isAttachedToWindow()) {
                        int[] iArr = new int[2];
                        fragmentView.getLocationOnScreen(iArr);
                        if (ActionBarLayout.s((ViewGroup) fragmentView, motionEvent.getRawX() - iArr[0], motionEvent.getRawY() - iArr[1]) == null) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final void dismiss() {
        bg0 bg0Var;
        Runnable runnable;
        if (!this.J && (bg0Var = this.l1) != null && (runnable = bg0Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.H1.Q;
        wk5[] wk5VarArr = this.m1;
        arrayList.remove(wk5VarArr[0]);
        wk5VarArr[0] = null;
    }

    @Override
    public final void m0() {
        wk5 wk5Var = this.m1[0];
        if (wk5Var != null) {
            for (e eVar : wk5Var.getFragmentStack()) {
                if (eVar.getFragmentView() != null) {
                    eVar.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override
    public final void onBackPressed() {
        wk5[] wk5VarArr = this.m1;
        wk5 wk5Var = wk5VarArr[0];
        if (wk5Var != null && wk5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) wk5VarArr[0]).G();
            return;
        }
        wk5 wk5Var2 = wk5VarArr[0];
        if (wk5Var2 != null && !wk5Var2.getFragmentStack().isEmpty()) {
            e eVar = (e) wk5VarArr[0].getFragmentStack().get(0);
            if (!eVar.closeOpenMenuOverlay(true)) {
                jla jlaVar = eVar.simpleActionBar;
                if (jlaVar != null && jlaVar.E()) {
                    return;
                }
            } else {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        wk5 wk5Var = this.m1[0];
        nx0[] nx0VarArr = this.o1;
        wk5Var.setWindow(nx0VarArr[0].getWindow());
        bg0 bg0Var = this.l1;
        if (bg0Var != null && bg0Var.e) {
            hl.i3(nx0VarArr[0], true);
        } else {
            L(aob.i5);
        }
        e eVar = this.n1;
        hl.l3(this, eVar.isLightStatusBar());
        eVar.onBottomSheetCreated();
    }

    @Override
    public final void x() {
        Runnable runnable;
        this.n1.onTransitionAnimationEnd(true, false);
        bg0 bg0Var = this.l1;
        if (bg0Var != null && (runnable = bg0Var.c) != null) {
            runnable.run();
        }
    }
}
