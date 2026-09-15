package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public abstract class da0 extends o61 {
    public final int T;
    public final ca0 U;
    public final t00 V;
    public final yw0 W;
    public final yw0 X;
    public float Y;
    public boolean Z;

    public da0(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        super(n2Var.getParentActivity(), n2Var.getCurrentAccount(), n2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.i6.f18780a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        H(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.G = false;
        this.H = false;
        ca0 ca0Var = new ca0((wh.b) this, n2Var, this.container, j3);
        this.U = ca0Var;
        ca0Var.B = false;
        setDimBehindAlpha(75);
        this.f26710w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        wh.g gVar = ca0Var.f45114f;
        this.f26706f = gVar;
        this.e = gVar;
        this.d.setAdapter(gVar);
        this.d.p1();
        ai.w0 w0Var = this.d;
        ca0Var.f45123p = w0Var;
        w0Var.setOnItemClickListener(new ai.g(ca0Var, 18));
        s4.s0 onScrollListener = w0Var.getOnScrollListener();
        if (onScrollListener == null) {
            w0Var.setOnScrollListener(ca0Var.D);
        } else {
            w0Var.setOnScrollListener(new ii.m3(8, ca0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        t00 b10 = ca0Var.b();
        this.V = b10;
        this.containerView.addView(b10, indexOfChild, w7.x5.c(-1.0f, -1));
        yw0 a2 = ca0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, w7.x5.c(-1.0f, -1));
        yw0 c10 = ca0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, w7.x5.c(-1.0f, -1));
        ca0Var.e();
    }

    @Override
    public final void E(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        long j3;
        int action = motionEvent.getAction();
        ca0 ca0Var = this.U;
        if (action == 0) {
            this.Y = this.f26712y;
            ca0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f26712y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.bo) {
                boolean P9 = ((org.telegram.ui.bo) n2Var).P9();
                this.Z = true;
                ny nyVar = new ny(16, this, h2Var);
                if (P9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(nyVar, j3);
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
        ca0Var.i(true);
    }

    @Override
    public final void G(String str) {
        this.U.j(str);
    }

    @Override
    public final void I(int i10) {
        super.I(i10);
        this.V.setTranslationY(this.f26705c.getMeasuredHeight() + i10);
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
            if (this.f26712y != i10) {
                this.f26712y = i10;
                I(i10);
                return;
            }
            return;
        }
        super.L();
    }

    @Override
    public final void onBackPressed() {
        wh.m mVar = this.U.f45126s;
        if (mVar != null) {
            mVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void show() {
        ca0 ca0Var = this.U;
        if (ca0Var.f45112b && this.f26712y == 0) {
            this.f26712y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        ca0Var.f45112b = false;
    }
}
