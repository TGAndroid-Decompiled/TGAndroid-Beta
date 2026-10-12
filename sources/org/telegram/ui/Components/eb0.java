package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public abstract class eb0 extends q71 {
    public final int T;
    public final db0 U;
    public final f10 V;
    public final wx0 W;
    public final wx0 X;
    public float Y;
    public boolean Z;

    public eb0(org.telegram.ui.ActionBar.m2 m2Var, long j10) {
        super(m2Var.getParentActivity(), m2Var.getCurrentAccount(), m2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.g6.f19843a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        I(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.G = false;
        this.H = false;
        db0 db0Var = new db0((xh.b) this, m2Var, this.container, j10);
        this.U = db0Var;
        db0Var.B = false;
        setDimBehindAlpha(75);
        this.f28542w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        xh.g gVar = db0Var.f48478f;
        this.f28538f = gVar;
        this.e = gVar;
        this.d.setAdapter(gVar);
        this.d.p1();
        bi.o0 o0Var = this.d;
        db0Var.f48487p = o0Var;
        o0Var.setOnItemClickListener(new bi.d(db0Var, 18));
        s4.r0 onScrollListener = o0Var.getOnScrollListener();
        if (onScrollListener == null) {
            o0Var.setOnScrollListener(db0Var.D);
        } else {
            o0Var.setOnScrollListener(new ji.n3(8, db0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        f10 b10 = db0Var.b();
        this.V = b10;
        this.containerView.addView(b10, indexOfChild, w7.a6.d(-1.0f, -1));
        wx0 a2 = db0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, w7.a6.d(-1.0f, -1));
        wx0 c10 = db0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, w7.a6.d(-1.0f, -1));
        db0Var.e();
    }

    @Override
    public final void F(MotionEvent motionEvent, di.g2 g2Var) {
        org.telegram.ui.ActionBar.m2 m2Var;
        long j10;
        int action = motionEvent.getAction();
        db0 db0Var = this.U;
        if (action == 0) {
            this.Y = this.f28544y;
            db0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f28544y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                m2Var = (org.telegram.ui.ActionBar.m2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                m2Var = null;
            }
            if (m2Var instanceof org.telegram.ui.fo) {
                boolean U9 = ((org.telegram.ui.fo) m2Var).U9();
                this.Z = true;
                f60 f60Var = new f60(9, this, g2Var);
                if (U9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(f60Var, j10);
            } else {
                this.Z = true;
                setFocusable(true);
                g2Var.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(3, g2Var));
            }
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return;
        }
        db0Var.i(true);
    }

    @Override
    public final void H(String str) {
        this.U.j(str);
    }

    @Override
    public final void J(int i10) {
        super.J(i10);
        this.V.setTranslationY(this.f28537c.getMeasuredHeight() + i10);
        float f7 = i10;
        this.W.setTranslationY(f7);
        this.X.setTranslationY(f7);
    }

    @Override
    public final void M() {
        int i10;
        bi.o0 o0Var = this.d;
        if (o0Var.getChildCount() <= 0) {
            if (o0Var.getVisibility() == 0) {
                i10 = o0Var.getPaddingTop() - AndroidUtilities.dp(8.0f);
            } else {
                i10 = 0;
            }
            if (this.f28544y != i10) {
                this.f28544y = i10;
                J(i10);
                return;
            }
            return;
        }
        super.M();
    }

    @Override
    public final void onBackPressed() {
        xh.k kVar = this.U.f48490s;
        if (kVar != null) {
            kVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void show() {
        db0 db0Var = this.U;
        if (db0Var.f48476b && this.f28544y == 0) {
            this.f28544y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        db0Var.f48476b = false;
    }
}
