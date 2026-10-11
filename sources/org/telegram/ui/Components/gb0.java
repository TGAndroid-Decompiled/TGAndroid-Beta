package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public abstract class gb0 extends v71 {
    public final int T;
    public final fb0 U;
    public final k10 V;
    public final cy0 W;
    public final cy0 X;
    public float Y;
    public boolean Z;

    public gb0(org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        super(m2Var.getParentActivity(), m2Var.getCurrentAccount(), m2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.h6.f20730a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        I(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.G = false;
        this.H = false;
        fb0 fb0Var = new fb0((wh.b) this, m2Var, this.container, j3);
        this.U = fb0Var;
        fb0Var.B = false;
        setDimBehindAlpha(75);
        this.f31700w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        wh.g gVar = fb0Var.f50520f;
        this.f31696f = gVar;
        this.f31695e = gVar;
        this.d.setAdapter(gVar);
        this.d.p1();
        ai.w0 w0Var = this.d;
        fb0Var.f50529p = w0Var;
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
        cy0 a2 = fb0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, w7.x5.d(-1.0f, -1));
        cy0 c10 = fb0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, w7.x5.d(-1.0f, -1));
        fb0Var.e();
    }

    @Override
    public final void F(MotionEvent motionEvent, ci.g2 g2Var) {
        org.telegram.ui.ActionBar.m2 m2Var;
        long j3;
        int action = motionEvent.getAction();
        fb0 fb0Var = this.U;
        if (action == 0) {
            this.Y = this.f31702y;
            fb0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f31702y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                m2Var = (org.telegram.ui.ActionBar.m2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                m2Var = null;
            }
            if (m2Var instanceof org.telegram.ui.zn) {
                boolean U9 = ((org.telegram.ui.zn) m2Var).U9();
                this.Z = true;
                bs bsVar = new bs(27, this, g2Var);
                if (U9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(bsVar, j3);
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
        this.V.setTranslationY(this.f31694c.getMeasuredHeight() + i10);
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
            if (this.f31702y != i10) {
                this.f31702y = i10;
                J(i10);
                return;
            }
            return;
        }
        super.M();
    }

    @Override
    public final void onBackPressed() {
        wh.k kVar = this.U.f50532s;
        if (kVar != null) {
            kVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void show() {
        fb0 fb0Var = this.U;
        if (fb0Var.f50517b && this.f31702y == 0) {
            this.f31702y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        fb0Var.f50517b = false;
    }
}
