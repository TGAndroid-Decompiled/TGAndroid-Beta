package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public abstract class ha0 extends r61 {
    public final int Q;
    public final ga0 R;
    public final u00 S;
    public final zw0 T;
    public final zw0 U;
    public float V;
    public boolean W;

    public ha0(org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        super(p2Var.getParentActivity(), p2Var.getCurrentAccount(), p2Var.getResourceProvider());
        this.Q = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.k6.f21607a7;
        setBackgroundColor(getThemedColor(i10));
        this.I = i10;
        this.H = i10;
        G(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.D = false;
        this.E = false;
        ga0 ga0Var = new ga0((kh.c) this, p2Var, this.container, j10);
        this.R = ga0Var;
        ga0Var.B = false;
        setDimBehindAlpha(75);
        this.f30671w.G.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        kh.n nVar = ga0Var.f11308f;
        this.f30667f = nVar;
        this.f30666e = nVar;
        this.d.setAdapter(nVar);
        this.d.o1();
        mh.d1 d1Var = this.d;
        ga0Var.f11317p = d1Var;
        d1Var.setOnItemClickListener(new ag.h(ga0Var, 5));
        f2.a1 onScrollListener = d1Var.getOnScrollListener();
        if (onScrollListener == null) {
            d1Var.setOnScrollListener(ga0Var.D);
        } else {
            d1Var.setOnScrollListener(new kh.l(0, ga0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        u00 b10 = ga0Var.b();
        this.S = b10;
        this.containerView.addView(b10, indexOfChild, k7.c6.c(-1.0f, -1));
        zw0 a2 = ga0Var.a();
        this.T = a2;
        this.containerView.addView(a2, indexOfChild, k7.c6.c(-1.0f, -1));
        zw0 c3 = ga0Var.c();
        this.U = c3;
        this.containerView.addView(c3, indexOfChild, k7.c6.c(-1.0f, -1));
        ga0Var.e();
    }

    @Override
    public final void D(MotionEvent motionEvent, lg.f fVar) {
        org.telegram.ui.ActionBar.p2 p2Var;
        long j10;
        int action = motionEvent.getAction();
        ga0 ga0Var = this.R;
        if (action == 0) {
            this.V = this.f30673y;
            ga0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f30673y - this.V) < this.Q && !this.W) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                p2Var = (org.telegram.ui.ActionBar.p2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                p2Var = null;
            }
            if (p2Var instanceof org.telegram.ui.xn) {
                boolean P9 = ((org.telegram.ui.xn) p2Var).P9();
                this.W = true;
                b90 b90Var = new b90(2, this, fVar);
                if (P9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(b90Var, j10);
            } else {
                this.W = true;
                setFocusable(true);
                fVar.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(4, fVar));
            }
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return;
        }
        ga0Var.i(true);
    }

    @Override
    public final void F(String str) {
        this.R.j(str);
    }

    @Override
    public final void H(int i10) {
        super.H(i10);
        this.S.setTranslationY(this.f30665c.getMeasuredHeight() + i10);
        float f10 = i10;
        this.T.setTranslationY(f10);
        this.U.setTranslationY(f10);
    }

    @Override
    public final void K() {
        int i10;
        mh.d1 d1Var = this.d;
        if (d1Var.getChildCount() <= 0) {
            if (d1Var.getVisibility() == 0) {
                i10 = d1Var.getPaddingTop() - AndroidUtilities.dp(8.0f);
            } else {
                i10 = 0;
            }
            if (this.f30673y != i10) {
                this.f30673y = i10;
                H(i10);
                return;
            }
            return;
        }
        super.K();
    }

    @Override
    public final void onBackPressed() {
        kh.u uVar = this.R.f11320s;
        if (uVar != null) {
            uVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void show() {
        ga0 ga0Var = this.R;
        if (ga0Var.f11305b && this.f30673y == 0) {
            this.f30673y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        ga0Var.f11305b = false;
    }
}
