package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public abstract class ga0 extends q61 {
    public final int Q;
    public final fa0 R;
    public final u00 S;
    public final zw0 T;
    public final zw0 U;
    public float V;
    public boolean W;

    public ga0(org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        super(p2Var.getParentActivity(), p2Var.getCurrentAccount(), p2Var.getResourceProvider());
        this.Q = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.j6.f19827a7;
        setBackgroundColor(getThemedColor(i10));
        this.I = i10;
        this.H = i10;
        G(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.D = false;
        this.E = false;
        fa0 fa0Var = new fa0((jh.c) this, p2Var, this.container, j10);
        this.R = fa0Var;
        fa0Var.B = false;
        setDimBehindAlpha(75);
        this.f28096w.G.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        jh.n nVar = fa0Var.f9463f;
        this.f28092f = nVar;
        this.e = nVar;
        this.d.setAdapter(nVar);
        this.d.o1();
        lh.e1 e1Var = this.d;
        fa0Var.f9472p = e1Var;
        e1Var.setOnItemClickListener(new dg.n(fa0Var, 4));
        f2.z0 onScrollListener = e1Var.getOnScrollListener();
        if (onScrollListener == null) {
            e1Var.setOnScrollListener(fa0Var.D);
        } else {
            e1Var.setOnScrollListener(new jh.l(0, fa0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        u00 b10 = fa0Var.b();
        this.S = b10;
        this.containerView.addView(b10, indexOfChild, k7.b6.c(-1.0f, -1));
        zw0 a2 = fa0Var.a();
        this.T = a2;
        this.containerView.addView(a2, indexOfChild, k7.b6.c(-1.0f, -1));
        zw0 c3 = fa0Var.c();
        this.U = c3;
        this.containerView.addView(c3, indexOfChild, k7.b6.c(-1.0f, -1));
        fa0Var.e();
    }

    @Override
    public final void D(MotionEvent motionEvent, kg.f fVar) {
        org.telegram.ui.ActionBar.p2 p2Var;
        long j10;
        int action = motionEvent.getAction();
        fa0 fa0Var = this.R;
        if (action == 0) {
            this.V = this.f28098y;
            fa0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f28098y - this.V) < this.Q && !this.W) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                p2Var = (org.telegram.ui.ActionBar.p2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                p2Var = null;
            }
            if (p2Var instanceof org.telegram.ui.zn) {
                boolean P9 = ((org.telegram.ui.zn) p2Var).P9();
                this.W = true;
                z80 z80Var = new z80(3, this, fVar);
                if (P9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(z80Var, j10);
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
        fa0Var.i(true);
    }

    @Override
    public final void F(String str) {
        this.R.j(str);
    }

    @Override
    public final void H(int i10) {
        super.H(i10);
        this.S.setTranslationY(this.f28091c.getMeasuredHeight() + i10);
        float f10 = i10;
        this.T.setTranslationY(f10);
        this.U.setTranslationY(f10);
    }

    @Override
    public final void K() {
        int i10;
        lh.e1 e1Var = this.d;
        if (e1Var.getChildCount() <= 0) {
            if (e1Var.getVisibility() == 0) {
                i10 = e1Var.getPaddingTop() - AndroidUtilities.dp(8.0f);
            } else {
                i10 = 0;
            }
            if (this.f28098y != i10) {
                this.f28098y = i10;
                H(i10);
                return;
            }
            return;
        }
        super.K();
    }

    @Override
    public final void onBackPressed() {
        jh.u uVar = this.R.f9475s;
        if (uVar != null) {
            uVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void show() {
        fa0 fa0Var = this.R;
        if (fa0Var.f9461b && this.f28098y == 0) {
            this.f28098y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        fa0Var.f9461b = false;
    }
}
