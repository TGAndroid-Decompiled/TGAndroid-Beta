package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public abstract class ea0 extends n61 {
    public final int T;
    public final da0 U;
    public final u00 V;
    public final xw0 W;
    public final xw0 X;
    public float Y;
    public boolean Z;

    public ea0(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        super(n2Var.getParentActivity(), n2Var.getCurrentAccount(), n2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.h6.f18733a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        H(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.G = false;
        this.H = false;
        da0 da0Var = new da0((wh.b) this, n2Var, this.container, j3);
        this.U = da0Var;
        da0Var.B = false;
        setDimBehindAlpha(75);
        this.f26360w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        wh.g gVar = da0Var.f45064f;
        this.f26356f = gVar;
        this.e = gVar;
        this.d.setAdapter(gVar);
        this.d.p1();
        ai.w0 w0Var = this.d;
        da0Var.f45073p = w0Var;
        w0Var.setOnItemClickListener(new ai.g(da0Var, 18));
        s4.s0 onScrollListener = w0Var.getOnScrollListener();
        if (onScrollListener == null) {
            w0Var.setOnScrollListener(da0Var.D);
        } else {
            w0Var.setOnScrollListener(new ii.n3(8, da0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        u00 b10 = da0Var.b();
        this.V = b10;
        this.containerView.addView(b10, indexOfChild, w7.x5.c(-1.0f, -1));
        xw0 a2 = da0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, w7.x5.c(-1.0f, -1));
        xw0 c10 = da0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, w7.x5.c(-1.0f, -1));
        da0Var.e();
    }

    @Override
    public final void E(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        long j3;
        int action = motionEvent.getAction();
        da0 da0Var = this.U;
        if (action == 0) {
            this.Y = this.f26362y;
            da0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f26362y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.xn) {
                boolean P9 = ((org.telegram.ui.xn) n2Var).P9();
                this.Z = true;
                oy oyVar = new oy(16, this, h2Var);
                if (P9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(oyVar, j3);
            } else {
                this.Z = true;
                setFocusable(true);
                h2Var.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(4, h2Var));
            }
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return;
        }
        da0Var.i(true);
    }

    @Override
    public final void G(String str) {
        this.U.j(str);
    }

    @Override
    public final void I(int i10) {
        super.I(i10);
        this.V.setTranslationY(this.f26355c.getMeasuredHeight() + i10);
        float f7 = i10;
        this.W.setTranslationY(f7);
        this.X.setTranslationY(f7);
    }

    @Override
    public final void L() {
        int i10;
        ai.w0 w0Var = this.d;
        if (w0Var.getChildCount() <= 0) {
            if (w0Var.getVisibility() == 0) {
                i10 = w0Var.getPaddingTop() - AndroidUtilities.dp(8.0f);
            } else {
                i10 = 0;
            }
            if (this.f26362y != i10) {
                this.f26362y = i10;
                I(i10);
                return;
            }
            return;
        }
        super.L();
    }

    @Override
    public final void onBackPressed() {
        wh.m mVar = this.U.f45076s;
        if (mVar != null) {
            mVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void show() {
        da0 da0Var = this.U;
        if (da0Var.f45062b && this.f26362y == 0) {
            this.f26362y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        da0Var.f45062b = false;
    }
}
