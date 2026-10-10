package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public abstract class gb0 extends u71 {
    public final int T;
    public final fb0 U;
    public final k10 V;
    public final by0 W;
    public final by0 X;
    public float Y;
    public boolean Z;

    public gb0(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        super(n2Var.getParentActivity(), n2Var.getCurrentAccount(), n2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.i6.f20745a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        I(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.G = false;
        this.H = false;
        fb0 fb0Var = new fb0((wh.b) this, n2Var, this.container, j3);
        this.U = fb0Var;
        fb0Var.B = false;
        setDimBehindAlpha(75);
        this.f31416w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        wh.g gVar = fb0Var.f50476f;
        this.f31412f = gVar;
        this.f31411e = gVar;
        this.d.setAdapter(gVar);
        this.d.p1();
        ai.w0 w0Var = this.d;
        fb0Var.f50485p = w0Var;
        w0Var.setOnItemClickListener(new ai.g(fb0Var, 18));
        s4.t0 onScrollListener = w0Var.getOnScrollListener();
        if (onScrollListener == null) {
            w0Var.setOnScrollListener(fb0Var.D);
        } else {
            w0Var.setOnScrollListener(new ii.n3(8, fb0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        k10 b10 = fb0Var.b();
        this.V = b10;
        this.containerView.addView(b10, indexOfChild, w7.x5.d(-1.0f, -1));
        by0 a2 = fb0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, w7.x5.d(-1.0f, -1));
        by0 c10 = fb0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, w7.x5.d(-1.0f, -1));
        fb0Var.e();
    }

    @Override
    public final void F(MotionEvent motionEvent, ci.g2 g2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        long j3;
        int action = motionEvent.getAction();
        fb0 fb0Var = this.U;
        if (action == 0) {
            this.Y = this.f31418y;
            fb0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f31418y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.zn) {
                boolean U9 = ((org.telegram.ui.zn) n2Var).U9();
                this.Z = true;
                as asVar = new as(28, this, g2Var);
                if (U9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(asVar, j3);
            } else {
                this.Z = true;
                setFocusable(true);
                g2Var.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(3, g2Var));
            }
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return;
        }
        fb0Var.i(true);
    }

    @Override
    public final void H(String str) {
        this.U.j(str);
    }

    @Override
    public final void J(int i10) {
        super.J(i10);
        this.V.setTranslationY(this.f31410c.getMeasuredHeight() + i10);
        float f7 = i10;
        this.W.setTranslationY(f7);
        this.X.setTranslationY(f7);
    }

    @Override
    public final void M() {
        int i10;
        ai.w0 w0Var = this.d;
        if (w0Var.getChildCount() <= 0) {
            if (w0Var.getVisibility() == 0) {
                i10 = w0Var.getPaddingTop() - AndroidUtilities.dp(8.0f);
            } else {
                i10 = 0;
            }
            if (this.f31418y != i10) {
                this.f31418y = i10;
                J(i10);
                return;
            }
            return;
        }
        super.M();
    }

    @Override
    public final void onBackPressed() {
        wh.k kVar = this.U.f50488s;
        if (kVar != null) {
            kVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void show() {
        fb0 fb0Var = this.U;
        if (fb0Var.f50473b && this.f31418y == 0) {
            this.f31418y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        fb0Var.f50473b = false;
    }
}
