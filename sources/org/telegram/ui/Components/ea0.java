package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public abstract class ea0 extends o61 {
    public final int T;
    public final da0 U;
    public final t00 V;
    public final xw0 W;
    public final xw0 X;
    public float Y;
    public boolean Z;

    public ea0(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        super(n2Var.getParentActivity(), n2Var.getCurrentAccount(), n2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.j6.f20634a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        H(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.G = false;
        this.H = false;
        da0 da0Var = new da0((xh.b) this, n2Var, this.container, j3);
        this.U = da0Var;
        da0Var.B = false;
        setDimBehindAlpha(75);
        this.f29009w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        xh.g gVar = da0Var.f49475f;
        this.f29005f = gVar;
        this.f29004e = gVar;
        this.d.setAdapter(gVar);
        this.d.o1();
        bi.o0 o0Var = this.d;
        da0Var.f49484p = o0Var;
        o0Var.setOnItemClickListener(new bi.d(da0Var, 18));
        s4.s0 onScrollListener = o0Var.getOnScrollListener();
        if (onScrollListener == null) {
            o0Var.setOnScrollListener(da0Var.D);
        } else {
            o0Var.setOnScrollListener(new ji.l3(8, da0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        t00 b10 = da0Var.b();
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
    public final void D(MotionEvent motionEvent, di.h2 h2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        long j3;
        int action = motionEvent.getAction();
        da0 da0Var = this.U;
        if (action == 0) {
            this.Y = this.f29011y;
            da0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f29011y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.co) {
                boolean P9 = ((org.telegram.ui.co) n2Var).P9();
                this.Z = true;
                zu zuVar = new zu(22, this, h2Var);
                if (P9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(zuVar, j3);
            } else {
                this.Z = true;
                setFocusable(true);
                h2Var.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(4, h2Var));
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
        this.V.setTranslationY(this.f29003c.getMeasuredHeight() + i10);
        float f7 = i10;
        this.W.setTranslationY(f7);
        this.X.setTranslationY(f7);
    }

    @Override
    public final void L() {
        int i10;
        bi.o0 o0Var = this.d;
        if (o0Var.getChildCount() <= 0) {
            if (o0Var.getVisibility() == 0) {
                i10 = o0Var.getPaddingTop() - AndroidUtilities.dp(8.0f);
            } else {
                i10 = 0;
            }
            if (this.f29011y != i10) {
                this.f29011y = i10;
                I(i10);
                return;
            }
            return;
        }
        super.L();
    }

    @Override
    public final void onBackPressed() {
        xh.m mVar = this.U.f49487s;
        if (mVar != null) {
            mVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void show() {
        da0 da0Var = this.U;
        if (da0Var.f49472b && this.f29011y == 0) {
            this.f29011y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        da0Var.f49472b = false;
    }
}
