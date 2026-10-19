package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public abstract class ya0 extends k71 {
    public final int T;
    public final xa0 U;
    public final b10 V;
    public final sx0 W;
    public final sx0 X;
    public float Y;
    public boolean Z;

    public ya0(org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        super(n2Var.getParentActivity(), n2Var.getCurrentAccount(), n2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.h6.f20929a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        I(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.G = false;
        this.H = false;
        xa0 xa0Var = new xa0((xh.b) this, n2Var, this.container, j10);
        this.U = xa0Var;
        xa0Var.B = false;
        setDimBehindAlpha(75);
        this.f27738w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        xh.f fVar = xa0Var.f49861f;
        this.f27734f = fVar;
        this.e = fVar;
        this.d.setAdapter(fVar);
        this.d.p1();
        ai.u1 u1Var = this.d;
        xa0Var.f49870p = u1Var;
        u1Var.setOnItemClickListener(new ai.wa(xa0Var, 22));
        s4.r0 onScrollListener = u1Var.getOnScrollListener();
        if (onScrollListener == null) {
            u1Var.setOnScrollListener(xa0Var.D);
        } else {
            u1Var.setOnScrollListener(new ki.m3(8, xa0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        b10 b10 = xa0Var.b();
        this.V = b10;
        this.containerView.addView(b10, indexOfChild, w7.z5.c(-1.0f, -1));
        sx0 a2 = xa0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, w7.z5.c(-1.0f, -1));
        sx0 c10 = xa0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, w7.z5.c(-1.0f, -1));
        xa0Var.e();
    }

    @Override
    public final void E(MotionEvent motionEvent, ei.e2 e2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        long j10;
        int action = motionEvent.getAction();
        xa0 xa0Var = this.U;
        if (action == 0) {
            this.Y = this.f27740y;
            xa0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f27740y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.qn) {
                boolean U9 = ((org.telegram.ui.qn) n2Var).U9();
                this.Z = true;
                yt ytVar = new yt(this, e2Var, 23);
                if (U9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(ytVar, j10);
            } else {
                this.Z = true;
                setFocusable(true);
                e2Var.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(3, e2Var));
            }
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return;
        }
        xa0Var.i(true);
    }

    @Override
    public final void G(String str) {
        this.U.j(str);
    }

    @Override
    public final void J(int i10) {
        super.J(i10);
        this.V.setTranslationY(this.f27733c.getMeasuredHeight() + i10);
        float f7 = i10;
        this.W.setTranslationY(f7);
        this.X.setTranslationY(f7);
    }

    @Override
    public final void M() {
        int i10;
        ai.u1 u1Var = this.d;
        if (u1Var.getChildCount() <= 0) {
            if (u1Var.getVisibility() == 0) {
                i10 = u1Var.getPaddingTop() - AndroidUtilities.dp(8.0f);
            } else {
                i10 = 0;
            }
            if (this.f27740y != i10) {
                this.f27740y = i10;
                J(i10);
                return;
            }
            return;
        }
        super.M();
    }

    @Override
    public final void onBackPressed() {
        xh.j jVar = this.U.f49873s;
        if (jVar != null) {
            jVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void show() {
        xa0 xa0Var = this.U;
        if (xa0Var.f49859b && this.f27740y == 0) {
            this.f27740y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        xa0Var.f49859b = false;
    }
}
