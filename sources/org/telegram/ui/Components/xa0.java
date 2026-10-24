package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public abstract class xa0 extends r71 {
    public final int T;
    public final wa0 U;
    public final z00 V;
    public final vx0 W;
    public final vx0 X;
    public float Y;
    public boolean Z;
    public int f32559a0;

    public xa0(org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        super(o2Var.getParentActivity(), o2Var.getCurrentAccount(), o2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.k6.f21126a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        G(0.0f);
        fixNavigationBarKey(i10);
        this.G = false;
        this.H = false;
        wa0 wa0Var = new wa0((xh.b) this, o2Var, this.container, j10);
        this.U = wa0Var;
        wa0Var.B = false;
        setDimBehindAlpha(75);
        this.f30094w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        xh.f fVar = wa0Var.f50309f;
        this.f30090f = fVar;
        this.e = fVar;
        this.d.setAdapter(fVar);
        this.d.t1();
        ai.u1 u1Var = this.d;
        wa0Var.f50318p = u1Var;
        u1Var.setOnItemClickListener(new ai.xa(wa0Var, 22));
        s4.r0 onScrollListener = u1Var.getOnScrollListener();
        if (onScrollListener == null) {
            u1Var.setOnScrollListener(wa0Var.D);
        } else {
            u1Var.setOnScrollListener(new ki.m3(8, wa0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        z00 b10 = wa0Var.b();
        this.V = b10;
        this.containerView.addView(b10, indexOfChild, w7.z5.c(-1.0f, -1));
        vx0 a2 = wa0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, w7.z5.c(-1.0f, -1));
        vx0 c10 = wa0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, w7.z5.c(-1.0f, -1));
        wa0Var.e();
    }

    @Override
    public final void D(MotionEvent motionEvent, ei.e2 e2Var) {
        org.telegram.ui.ActionBar.o2 o2Var;
        long j10;
        int action = motionEvent.getAction();
        wa0 wa0Var = this.U;
        if (action == 0) {
            this.Y = this.f30096y;
            wa0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f30096y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                o2Var = (org.telegram.ui.ActionBar.o2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                o2Var = null;
            }
            if (o2Var instanceof org.telegram.ui.sn) {
                boolean U9 = ((org.telegram.ui.sn) o2Var).U9();
                this.Z = true;
                wt wtVar = new wt(this, e2Var, 23);
                if (U9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(wtVar, j10);
            } else {
                this.Z = true;
                setFocusable(true);
                e2Var.requestFocus();
                AndroidUtilities.runOnUIThread(new l70(e2Var, 2));
            }
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return;
        }
        wa0Var.i(true);
    }

    @Override
    public final void F(String str) {
        this.U.j(str);
    }

    @Override
    public final void I(int i10) {
        super.I(i10);
        this.V.setTranslationY(this.f30089c.getMeasuredHeight() + i10);
        float f7 = i10;
        this.W.setTranslationY(f7);
        this.X.setTranslationY(f7);
    }

    @Override
    public final void L() {
        int i10;
        ai.u1 u1Var = this.d;
        if (u1Var.getChildCount() <= 0) {
            if (u1Var.getVisibility() == 0) {
                i10 = u1Var.getPaddingTop() - AndroidUtilities.dp(8.0f);
            } else {
                i10 = 0;
            }
            if (this.f30096y != i10) {
                this.f30096y = i10;
                I(i10);
                return;
            }
            return;
        }
        super.L();
    }

    @Override
    public final void onBackPressed() {
        xh.j jVar = this.U.f50321s;
        if (jVar != null) {
            jVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21126a7);
        if (themedColor != this.f32559a0) {
            this.f32559a0 = themedColor;
            setBackgroundColor(themedColor);
        }
    }

    @Override
    public final void show() {
        wa0 wa0Var = this.U;
        if (wa0Var.f50307b && this.f30096y == 0) {
            this.f30096y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        wa0Var.f50307b = false;
    }
}
