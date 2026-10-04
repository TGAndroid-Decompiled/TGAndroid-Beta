package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public abstract class ra0 extends n71 {
    public final int T;
    public final qa0 U;
    public final w00 V;
    public final tx0 W;
    public final tx0 X;
    public float Y;
    public boolean Z;

    public ra0(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        super(n2Var.getParentActivity(), n2Var.getCurrentAccount(), n2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.i6.f20766a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        F(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.G = false;
        this.H = false;
        qa0 qa0Var = new qa0((wh.b) this, n2Var, this.container, j3);
        this.U = qa0Var;
        qa0Var.B = false;
        setDimBehindAlpha(75);
        this.f28900w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        wh.g gVar = qa0Var.f49147f;
        this.f28896f = gVar;
        this.f28895e = gVar;
        this.d.setAdapter(gVar);
        this.d.s1();
        ai.w0 w0Var = this.d;
        qa0Var.f49156p = w0Var;
        w0Var.setOnItemClickListener(new ai.g(qa0Var, 18));
        s4.s0 onScrollListener = w0Var.getOnScrollListener();
        if (onScrollListener == null) {
            w0Var.setOnScrollListener(qa0Var.D);
        } else {
            w0Var.setOnScrollListener(new ii.n3(8, qa0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        w00 b10 = qa0Var.b();
        this.V = b10;
        this.containerView.addView(b10, indexOfChild, w7.z5.c(-1.0f, -1));
        tx0 a2 = qa0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, w7.z5.c(-1.0f, -1));
        tx0 c10 = qa0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, w7.z5.c(-1.0f, -1));
        qa0Var.e();
    }

    @Override
    public final void C(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        long j3;
        int action = motionEvent.getAction();
        qa0 qa0Var = this.U;
        if (action == 0) {
            this.Y = this.f28902y;
            qa0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f28902y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.yn) {
                boolean O9 = ((org.telegram.ui.yn) n2Var).O9();
                this.Z = true;
                yw ywVar = new yw(20, this, h2Var);
                if (O9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(ywVar, j3);
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
        qa0Var.i(true);
    }

    @Override
    public final void E(String str) {
        this.U.j(str);
    }

    @Override
    public final void G(int i10) {
        super.G(i10);
        this.V.setTranslationY(this.f28894c.getMeasuredHeight() + i10);
        float f7 = i10;
        this.W.setTranslationY(f7);
        this.X.setTranslationY(f7);
    }

    @Override
    public final void J() {
        int i10;
        ai.w0 w0Var = this.d;
        if (w0Var.getChildCount() <= 0) {
            if (w0Var.getVisibility() == 0) {
                i10 = w0Var.getPaddingTop() - AndroidUtilities.dp(8.0f);
            } else {
                i10 = 0;
            }
            if (this.f28902y != i10) {
                this.f28902y = i10;
                G(i10);
                return;
            }
            return;
        }
        super.J();
    }

    @Override
    public final void onBackPressed() {
        wh.m mVar = this.U.f49159s;
        if (mVar != null) {
            mVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void show() {
        qa0 qa0Var = this.U;
        if (qa0Var.f49144b && this.f28902y == 0) {
            this.f28902y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        qa0Var.f49144b = false;
    }
}
