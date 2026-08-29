package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public abstract class aa0 extends f61 {
    public final int P;
    public final z90 Q;
    public final p00 R;
    public final qw0 S;
    public final qw0 T;
    public float U;
    public boolean V;

    public aa0(org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        super(o2Var.getParentActivity(), o2Var.getCurrentAccount(), o2Var.getResourceProvider());
        this.P = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.g6.f23009a7;
        setBackgroundColor(getThemedColor(i10));
        this.H = i10;
        this.G = i10;
        G(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.C = false;
        this.D = false;
        z90 z90Var = new z90((hh.c) this, o2Var, this.container, j10);
        this.Q = z90Var;
        z90Var.B = false;
        setDimBehindAlpha(75);
        this.f28335w.F.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        hh.n nVar = z90Var.f8124f;
        this.f28331f = nVar;
        this.f28330e = nVar;
        this.d.setAdapter(nVar);
        this.d.p1();
        jh.e1 e1Var = this.d;
        z90Var.f8133p = e1Var;
        e1Var.setOnItemClickListener(new bg.o(z90Var, 4));
        f2.a1 onScrollListener = e1Var.getOnScrollListener();
        if (onScrollListener == null) {
            e1Var.setOnScrollListener(z90Var.D);
        } else {
            e1Var.setOnScrollListener(new hh.l(0, z90Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        p00 b10 = z90Var.b();
        this.R = b10;
        this.containerView.addView(b10, indexOfChild, i7.f6.c(-1.0f, -1));
        qw0 a2 = z90Var.a();
        this.S = a2;
        this.containerView.addView(a2, indexOfChild, i7.f6.c(-1.0f, -1));
        qw0 c3 = z90Var.c();
        this.T = c3;
        this.containerView.addView(c3, indexOfChild, i7.f6.c(-1.0f, -1));
        z90Var.e();
    }

    @Override
    public final void D(MotionEvent motionEvent, ig.f fVar) {
        org.telegram.ui.ActionBar.o2 o2Var;
        long j10;
        int action = motionEvent.getAction();
        z90 z90Var = this.Q;
        if (action == 0) {
            this.U = this.f28337y;
            z90Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f28337y - this.U) < this.P && !this.V) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                o2Var = (org.telegram.ui.ActionBar.o2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                o2Var = null;
            }
            if (o2Var instanceof org.telegram.ui.tn) {
                boolean P9 = ((org.telegram.ui.tn) o2Var).P9();
                this.V = true;
                gt gtVar = new gt(25, this, fVar);
                if (P9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(gtVar, j10);
            } else {
                this.V = true;
                setFocusable(true);
                fVar.requestFocus();
                AndroidUtilities.runOnUIThread(new s1(4, fVar));
            }
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return;
        }
        z90Var.i(true);
    }

    @Override
    public final void F(String str) {
        this.Q.j(str);
    }

    @Override
    public final void H(int i10) {
        super.H(i10);
        this.R.setTranslationY(this.f28329c.getMeasuredHeight() + i10);
        float f9 = i10;
        this.S.setTranslationY(f9);
        this.T.setTranslationY(f9);
    }

    @Override
    public final void K() {
        int i10;
        jh.e1 e1Var = this.d;
        if (e1Var.getChildCount() <= 0) {
            if (e1Var.getVisibility() == 0) {
                i10 = e1Var.getPaddingTop() - AndroidUtilities.dp(8.0f);
            } else {
                i10 = 0;
            }
            if (this.f28337y != i10) {
                this.f28337y = i10;
                H(i10);
                return;
            }
            return;
        }
        super.K();
    }

    @Override
    public final void onBackPressed() {
        hh.u uVar = this.Q.f8136s;
        if (uVar != null) {
            uVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void show() {
        z90 z90Var = this.Q;
        if (z90Var.f8121b && this.f28337y == 0) {
            this.f28337y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        z90Var.f8121b = false;
    }
}
