package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public abstract class na0 extends b71 {
    public final int T;
    public final ma0 U;
    public final a10 V;
    public final jx0 W;
    public final jx0 X;
    public float Y;
    public boolean Z;

    public na0(org.telegram.ui.ActionBar.p2 p2Var, long j3) {
        super(p2Var.getParentActivity(), p2Var.getCurrentAccount(), p2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.j6.f17872a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        H(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.G = false;
        this.H = false;
        ma0 ma0Var = new ma0((vh.c) this, p2Var, this.container, j3);
        this.U = ma0Var;
        ma0Var.B = false;
        setDimBehindAlpha(75);
        this.f21750w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        vh.i iVar = ma0Var.f43401f;
        this.f21746f = iVar;
        this.e = iVar;
        this.d.setAdapter(iVar);
        this.d.o1();
        bi.y1 y1Var = this.d;
        ma0Var.f43410p = y1Var;
        y1Var.setOnItemClickListener(new ai.g(ma0Var, 17));
        s4.s0 onScrollListener = y1Var.getOnScrollListener();
        if (onScrollListener == null) {
            y1Var.setOnScrollListener(ma0Var.D);
        } else {
            y1Var.setOnScrollListener(new hi.p3(8, ma0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        a10 b10 = ma0Var.b();
        this.V = b10;
        this.containerView.addView(b10, indexOfChild, w7.a6.c(-1.0f, -1));
        jx0 a2 = ma0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, w7.a6.c(-1.0f, -1));
        jx0 c10 = ma0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, w7.a6.c(-1.0f, -1));
        ma0Var.e();
    }

    @Override
    public final void D(MotionEvent motionEvent, bi.t2 t2Var) {
        org.telegram.ui.ActionBar.p2 p2Var;
        long j3;
        int action = motionEvent.getAction();
        ma0 ma0Var = this.U;
        if (action == 0) {
            this.Y = this.f21752y;
            ma0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f21752y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                p2Var = (org.telegram.ui.ActionBar.p2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                p2Var = null;
            }
            if (p2Var instanceof org.telegram.ui.eo) {
                boolean P9 = ((org.telegram.ui.eo) p2Var).P9();
                this.Z = true;
                hy hyVar = new hy(19, this, t2Var);
                if (P9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(hyVar, j3);
            } else {
                this.Z = true;
                setFocusable(true);
                t2Var.requestFocus();
                AndroidUtilities.runOnUIThread(new s1(4, t2Var));
            }
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return;
        }
        ma0Var.i(true);
    }

    @Override
    public final void F(String str) {
        this.U.j(str);
    }

    @Override
    public final void I(int i10) {
        super.I(i10);
        this.V.setTranslationY(this.f21745c.getMeasuredHeight() + i10);
        float f7 = i10;
        this.W.setTranslationY(f7);
        this.X.setTranslationY(f7);
    }

    @Override
    public final void L() {
        int i10;
        bi.y1 y1Var = this.d;
        if (y1Var.getChildCount() <= 0) {
            if (y1Var.getVisibility() == 0) {
                i10 = y1Var.getPaddingTop() - AndroidUtilities.dp(8.0f);
            } else {
                i10 = 0;
            }
            if (this.f21752y != i10) {
                this.f21752y = i10;
                I(i10);
                return;
            }
            return;
        }
        super.L();
    }

    @Override
    public final void onBackPressed() {
        vh.o oVar = this.U.f43413s;
        if (oVar != null) {
            oVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void show() {
        ma0 ma0Var = this.U;
        if (ma0Var.f43399b && this.f21752y == 0) {
            this.f21752y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        ma0Var.f43399b = false;
    }
}
