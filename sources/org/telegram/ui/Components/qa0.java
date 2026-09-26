package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public abstract class qa0 extends c71 {
    public final int T;
    public final pa0 U;
    public final v00 V;
    public final jx0 W;
    public final jx0 X;
    public float Y;
    public boolean Z;

    public qa0(org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        super(m2Var.getParentActivity(), m2Var.getCurrentAccount(), m2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.h6.f19003a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        H(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.G = false;
        this.H = false;
        pa0 pa0Var = new pa0((wh.b) this, m2Var, this.container, j3);
        this.U = pa0Var;
        pa0Var.B = false;
        setDimBehindAlpha(75);
        this.f23263w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        wh.g gVar = pa0Var.f45391f;
        this.f23259f = gVar;
        this.e = gVar;
        this.d.setAdapter(gVar);
        this.d.p1();
        ai.w0 w0Var = this.d;
        pa0Var.f45400p = w0Var;
        w0Var.setOnItemClickListener(new ai.g(pa0Var, 18));
        s4.s0 onScrollListener = w0Var.getOnScrollListener();
        if (onScrollListener == null) {
            w0Var.setOnScrollListener(pa0Var.D);
        } else {
            w0Var.setOnScrollListener(new ii.n3(8, pa0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        v00 b10 = pa0Var.b();
        this.V = b10;
        this.containerView.addView(b10, indexOfChild, w7.y5.c(-1.0f, -1));
        jx0 a2 = pa0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, w7.y5.c(-1.0f, -1));
        jx0 c10 = pa0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, w7.y5.c(-1.0f, -1));
        pa0Var.e();
    }

    @Override
    public final void E(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.ActionBar.m2 m2Var;
        long j3;
        int action = motionEvent.getAction();
        pa0 pa0Var = this.U;
        if (action == 0) {
            this.Y = this.f23265y;
            pa0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f23265y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                m2Var = (org.telegram.ui.ActionBar.m2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                m2Var = null;
            }
            if (m2Var instanceof org.telegram.ui.wn) {
                boolean P9 = ((org.telegram.ui.wn) m2Var).P9();
                this.Z = true;
                ww wwVar = new ww(21, this, h2Var);
                if (P9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(wwVar, j3);
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
        pa0Var.i(true);
    }

    @Override
    public final void G(String str) {
        this.U.j(str);
    }

    @Override
    public final void I(int i10) {
        super.I(i10);
        this.V.setTranslationY(this.f23258c.getMeasuredHeight() + i10);
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
            if (this.f23265y != i10) {
                this.f23265y = i10;
                I(i10);
                return;
            }
            return;
        }
        super.L();
    }

    @Override
    public final void onBackPressed() {
        wh.m mVar = this.U.f45403s;
        if (mVar != null) {
            mVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void show() {
        pa0 pa0Var = this.U;
        if (pa0Var.f45389b && this.f23265y == 0) {
            this.f23265y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        pa0Var.f45389b = false;
    }
}
