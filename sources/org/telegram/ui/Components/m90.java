package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public abstract class m90 extends s51 {
    public final int P;
    public final l90 Q;
    public final e00 R;
    public final gw0 S;
    public final gw0 T;
    public float U;
    public boolean V;

    public m90(org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        super(o2Var.getParentActivity(), o2Var.getCurrentAccount(), o2Var.getResourceProvider());
        this.P = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i9 = org.telegram.ui.ActionBar.f6.f22947a7;
        setBackgroundColor(getThemedColor(i9));
        this.H = i9;
        this.G = i9;
        G(0.0f);
        fixNavigationBar(getThemedColor(i9));
        this.C = false;
        this.D = false;
        l90 l90Var = new l90((eh.c) this, o2Var, this.container, j10);
        this.Q = l90Var;
        l90Var.B = false;
        setDimBehindAlpha(75);
        this.f32376w.F.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        eh.p pVar = l90Var.f5250f;
        this.f32372f = pVar;
        this.f32371e = pVar;
        this.d.setAdapter(pVar);
        this.d.p1();
        gh.f1 f1Var = this.d;
        l90Var.f5259p = f1Var;
        f1Var.setOnItemClickListener(new eh.j(l90Var, 0));
        f2.d1 onScrollListener = f1Var.getOnScrollListener();
        if (onScrollListener == null) {
            f1Var.setOnScrollListener(l90Var.D);
        } else {
            f1Var.setOnScrollListener(new eh.n(0, l90Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        e00 b10 = l90Var.b();
        this.R = b10;
        this.containerView.addView(b10, indexOfChild, g7.e6.c(-1.0f, -1));
        gw0 a2 = l90Var.a();
        this.S = a2;
        this.containerView.addView(a2, indexOfChild, g7.e6.c(-1.0f, -1));
        gw0 c10 = l90Var.c();
        this.T = c10;
        this.containerView.addView(c10, indexOfChild, g7.e6.c(-1.0f, -1));
        l90Var.e();
    }

    @Override
    public final void D(MotionEvent motionEvent, fg.g gVar) {
        org.telegram.ui.ActionBar.o2 o2Var;
        long j10;
        int action = motionEvent.getAction();
        l90 l90Var = this.Q;
        if (action == 0) {
            this.U = this.f32378y;
            l90Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f32378y - this.U) < this.P && !this.V) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                o2Var = (org.telegram.ui.ActionBar.o2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                o2Var = null;
            }
            if (o2Var instanceof org.telegram.ui.qn) {
                boolean P9 = ((org.telegram.ui.qn) o2Var).P9();
                this.V = true;
                zq zqVar = new zq(28, this, gVar);
                if (P9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(zqVar, j10);
            } else {
                this.V = true;
                setFocusable(true);
                gVar.requestFocus();
                AndroidUtilities.runOnUIThread(new p1(4, gVar));
            }
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return;
        }
        l90Var.i(true);
    }

    @Override
    public final void F(String str) {
        this.Q.j(str);
    }

    @Override
    public final void H(int i9) {
        super.H(i9);
        this.R.setTranslationY(this.f32370c.getMeasuredHeight() + i9);
        float f10 = i9;
        this.S.setTranslationY(f10);
        this.T.setTranslationY(f10);
    }

    @Override
    public final void K() {
        int i9;
        gh.f1 f1Var = this.d;
        if (f1Var.getChildCount() <= 0) {
            if (f1Var.getVisibility() == 0) {
                i9 = f1Var.getPaddingTop() - AndroidUtilities.dp(8.0f);
            } else {
                i9 = 0;
            }
            if (this.f32378y != i9) {
                this.f32378y = i9;
                H(i9);
                return;
            }
            return;
        }
        super.K();
    }

    @Override
    public final void onBackPressed() {
        eh.w wVar = this.Q.f5262s;
        if (wVar != null) {
            wVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void show() {
        l90 l90Var = this.Q;
        if (l90Var.f5247b && this.f32378y == 0) {
            this.f32378y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        l90Var.f5247b = false;
    }
}
