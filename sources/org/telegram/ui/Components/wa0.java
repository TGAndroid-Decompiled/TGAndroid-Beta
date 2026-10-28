package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public abstract class wa0 extends c81 {
    public final int T;
    public final va0 U;
    public final c10 V;
    public final fy0 W;
    public final fy0 X;
    public float Y;
    public boolean Z;
    public int f34489a0;

    public wa0(org.telegram.ui.ActionBar.r2 r2Var, long j10) {
        super(r2Var.getParentActivity(), r2Var.getCurrentAccount(), r2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.y6.f23300a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        H(0.0f);
        fixNavigationBarKey(i10);
        this.G = false;
        this.H = false;
        va0 va0Var = new va0((yh.b) this, r2Var, this.container, j10);
        this.U = va0Var;
        va0Var.B = false;
        setDimBehindAlpha(75);
        this.f27097w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        yh.f fVar = va0Var.f52671f;
        this.f27093f = fVar;
        this.e = fVar;
        this.d.setAdapter(fVar);
        this.d.u1();
        bi.r1 r1Var = this.d;
        va0Var.f52680p = r1Var;
        r1Var.setOnItemClickListener(new ai.k(va0Var, 23));
        s4.u0 onScrollListener = r1Var.getOnScrollListener();
        if (onScrollListener == null) {
            r1Var.setOnScrollListener(va0Var.D);
        } else {
            r1Var.setOnScrollListener(new ai.u0(9, va0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        c10 b10 = va0Var.b();
        this.V = b10;
        this.containerView.addView(b10, indexOfChild, kb1.g(-1.0f, -1));
        fy0 a2 = va0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, kb1.g(-1.0f, -1));
        fy0 c10 = va0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, kb1.g(-1.0f, -1));
        va0Var.e();
    }

    @Override
    public final void D(MotionEvent motionEvent, fi.c2 c2Var) {
        org.telegram.ui.ActionBar.r2 r2Var;
        long j10;
        int action = motionEvent.getAction();
        va0 va0Var = this.U;
        if (action == 0) {
            this.Y = this.f27099y;
            va0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f27099y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                r2Var = (org.telegram.ui.ActionBar.r2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                r2Var = null;
            }
            if (r2Var instanceof org.telegram.ui.wn) {
                boolean ca2 = ((org.telegram.ui.wn) r2Var).ca();
                this.Z = true;
                u90 u90Var = new u90(3, this, c2Var);
                if (ca2) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(u90Var, j10);
            } else {
                this.Z = true;
                setFocusable(true);
                c2Var.requestFocus();
                AndroidUtilities.runOnUIThread(new p70(c2Var, 2));
            }
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return;
        }
        va0Var.i(true);
    }

    @Override
    public final void G(String str) {
        this.U.j(str);
    }

    @Override
    public final void I(int i10) {
        super.I(i10);
        this.V.setTranslationY(this.f27092c.getMeasuredHeight() + i10);
        float f7 = i10;
        this.W.setTranslationY(f7);
        this.X.setTranslationY(f7);
    }

    @Override
    public final void L() {
        int i10;
        bi.r1 r1Var = this.d;
        if (r1Var.getChildCount() <= 0) {
            if (r1Var.getVisibility() == 0) {
                i10 = r1Var.getPaddingTop() - AndroidUtilities.dp(8.0f);
            } else {
                i10 = 0;
            }
            if (this.f27099y != i10) {
                this.f27099y = i10;
                I(i10);
                return;
            }
            return;
        }
        super.L();
    }

    @Override
    public final void onBackPressed() {
        yh.j jVar = this.U.f52683s;
        if (jVar != null) {
            jVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23300a7);
        if (themedColor != this.f34489a0) {
            this.f34489a0 = themedColor;
            setBackgroundColor(themedColor);
        }
    }

    @Override
    public final void show() {
        va0 va0Var = this.U;
        if (va0Var.f52669b && this.f27099y == 0) {
            this.f27099y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        va0Var.f52669b = false;
    }
}
