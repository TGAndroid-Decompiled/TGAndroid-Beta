package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;

public abstract class q90 extends u51 {
    public final int P;
    public final p90 Q;
    public final h00 R;
    public final iw0 S;
    public final iw0 T;
    public float U;
    public boolean V;

    public q90(org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        super(n2Var.getParentActivity(), n2Var.getCurrentAccount(), n2Var.getResourceProvider());
        this.P = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.g6.f22999a7;
        setBackgroundColor(getThemedColor(i10));
        this.H = i10;
        this.G = i10;
        H(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.C = false;
        this.D = false;
        p90 p90Var = new p90((fh.c) this, n2Var, this.container, j10);
        this.Q = p90Var;
        p90Var.B = false;
        setDimBehindAlpha(75);
        this.f32984w.F.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        fh.n nVar = p90Var.f6177f;
        this.f32980f = nVar;
        this.f32979e = nVar;
        this.d.setAdapter(nVar);
        this.d.p1();
        hh.f1 f1Var = this.d;
        p90Var.f6186p = f1Var;
        f1Var.setOnItemClickListener(new ag.p0(p90Var, 2));
        f2.b1 onScrollListener = f1Var.getOnScrollListener();
        if (onScrollListener == null) {
            f1Var.setOnScrollListener(p90Var.D);
        } else {
            f1Var.setOnScrollListener(new fh.l(0, p90Var, onScrollListener));
        }
        int iIndexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        h00 h00VarB = p90Var.b();
        this.R = h00VarB;
        this.containerView.addView(h00VarB, iIndexOfChild, h7.z5.c(-1.0f, -1));
        iw0 iw0VarA = p90Var.a();
        this.S = iw0VarA;
        this.containerView.addView(iw0VarA, iIndexOfChild, h7.z5.c(-1.0f, -1));
        iw0 iw0VarC = p90Var.c();
        this.T = iw0VarC;
        this.containerView.addView(iw0VarC, iIndexOfChild, h7.z5.c(-1.0f, -1));
        p90Var.e();
    }

    @Override
    public final void E(MotionEvent motionEvent, gg.g gVar) {
        org.telegram.ui.ActionBar.n2 n2Var;
        int action = motionEvent.getAction();
        p90 p90Var = this.Q;
        if (action == 0) {
            this.U = this.f32986y;
            p90Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f32986y - this.U) < this.P && !this.V) {
            Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
            if (activityFindActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activityFindActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.rn) {
                boolean zP9 = ((org.telegram.ui.rn) n2Var).P9();
                this.V = true;
                AndroidUtilities.runOnUIThread(new xq(28, this, gVar), zP9 ? 200L : 0L);
            } else {
                this.V = true;
                setFocusable(true);
                gVar.requestFocus();
                AndroidUtilities.runOnUIThread(new p1(4, gVar));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            p90Var.i(true);
        }
    }

    @Override
    public final void G(String str) {
        this.Q.j(str);
    }

    @Override
    public final void I(int i10) {
        super.I(i10);
        this.R.setTranslationY(this.f32978c.getMeasuredHeight() + i10);
        float f10 = i10;
        this.S.setTranslationY(f10);
        this.T.setTranslationY(f10);
    }

    @Override
    public final void L() {
        hh.f1 f1Var = this.d;
        if (f1Var.getChildCount() > 0) {
            super.L();
            return;
        }
        int paddingTop = f1Var.getVisibility() == 0 ? f1Var.getPaddingTop() - AndroidUtilities.dp(8.0f) : 0;
        if (this.f32986y != paddingTop) {
            this.f32986y = paddingTop;
            I(paddingTop);
        }
    }

    @Override
    public final void onBackPressed() {
        fh.u uVar = this.Q.f6189s;
        if (uVar != null) {
            uVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void show() {
        p90 p90Var = this.Q;
        if (p90Var.f6174b && this.f32986y == 0) {
            this.f32986y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        p90Var.f6174b = false;
    }
}
