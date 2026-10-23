package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public abstract class za0 extends s71 {
    public final int T;
    public final ya0 U;
    public final b10 V;
    public final wx0 W;
    public final wx0 X;
    public float Y;
    public boolean Z;
    public int f33199a0;

    public za0(org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        super(o2Var.getParentActivity(), o2Var.getCurrentAccount(), o2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.k6.f21125a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        G(0.0f);
        fixNavigationBarKey(i10);
        this.G = false;
        this.H = false;
        ya0 ya0Var = new ya0((xh.b) this, o2Var, this.container, j10);
        this.U = ya0Var;
        ya0Var.B = false;
        setDimBehindAlpha(75);
        this.f30408w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        xh.f fVar = ya0Var.f50310f;
        this.f30404f = fVar;
        this.e = fVar;
        this.d.setAdapter(fVar);
        this.d.t1();
        ai.u1 u1Var = this.d;
        ya0Var.f50319p = u1Var;
        u1Var.setOnItemClickListener(new ai.xa(ya0Var, 22));
        s4.r0 onScrollListener = u1Var.getOnScrollListener();
        if (onScrollListener == null) {
            u1Var.setOnScrollListener(ya0Var.D);
        } else {
            u1Var.setOnScrollListener(new ki.m3(8, ya0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        b10 b10 = ya0Var.b();
        this.V = b10;
        this.containerView.addView(b10, indexOfChild, w7.z5.c(-1.0f, -1));
        wx0 a2 = ya0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, w7.z5.c(-1.0f, -1));
        wx0 c10 = ya0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, w7.z5.c(-1.0f, -1));
        ya0Var.e();
    }

    @Override
    public final void D(MotionEvent motionEvent, ei.e2 e2Var) {
        org.telegram.ui.ActionBar.o2 o2Var;
        long j10;
        int action = motionEvent.getAction();
        ya0 ya0Var = this.U;
        if (action == 0) {
            this.Y = this.f30410y;
            ya0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f30410y - this.Y) < this.T && !this.Z) {
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
                AndroidUtilities.runOnUIThread(new n70(e2Var, 2));
            }
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return;
        }
        ya0Var.i(true);
    }

    @Override
    public final void F(String str) {
        this.U.j(str);
    }

    @Override
    public final void I(int i10) {
        super.I(i10);
        this.V.setTranslationY(this.f30403c.getMeasuredHeight() + i10);
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
            if (this.f30410y != i10) {
                this.f30410y = i10;
                I(i10);
                return;
            }
            return;
        }
        super.L();
    }

    @Override
    public final void onBackPressed() {
        xh.j jVar = this.U.f50322s;
        if (jVar != null) {
            jVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21125a7);
        if (themedColor != this.f33199a0) {
            this.f33199a0 = themedColor;
            setBackgroundColor(themedColor);
        }
    }

    @Override
    public final void show() {
        ya0 ya0Var = this.U;
        if (ya0Var.f50308b && this.f30410y == 0) {
            this.f30410y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        ya0Var.f50308b = false;
    }
}
