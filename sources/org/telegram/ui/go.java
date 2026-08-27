package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;

public final class go extends AnimatorListenerAdapter {

    public final int f38456a;

    public boolean f38457b;

    public final Object f38458c;

    public go(int i10, Object obj, boolean z10) {
        this.f38456a = i10;
        this.f38458c = obj;
        this.f38457b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38456a) {
            case 0:
                ((jo) this.f38458c).h = null;
                break;
            case 1:
                org.telegram.ui.Components.t9 t9Var = (org.telegram.ui.Components.t9) this.f38458c;
                AnimatorSet animatorSet = t9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t9Var.h = null;
                    break;
                }
                break;
            case 3:
                ((org.telegram.ui.Components.gi) this.f38458c).U0 = null;
                break;
            case 4:
                this.f38457b = true;
                break;
            case 9:
                org.telegram.ui.Components.b00 b00Var = (org.telegram.ui.Components.b00) this.f38458c;
                AnimatorSet animatorSet2 = b00Var.f26867e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    b00Var.f26867e = null;
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Components.f60 f60Var = (org.telegram.ui.Components.f60) this.f38458c;
                AnimatorSet animatorSet3 = f60Var.T;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    f60Var.T = null;
                    break;
                }
                break;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f38458c;
                if (animator.equals(pipRoundVideoView.f26426r)) {
                    pipRoundVideoView.f26426r = null;
                }
                break;
            case 20:
                ((org.telegram.ui.Components.hu0) this.f38458c).J1 = null;
                break;
            case 24:
                org.telegram.ui.Components.q51 q51Var = (org.telegram.ui.Components.q51) this.f38458c;
                AnimatorSet animatorSet4 = q51Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    q51Var.d = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.u51 u51Var = (org.telegram.ui.Components.u51) this.f38458c;
                AnimatorSet animatorSet5 = u51Var.f32982r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    u51Var.f32982r = null;
                    break;
                }
                break;
            case 27:
                ((js) this.f38458c).f39491w = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        RadialProgressView radialProgressView;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView2;
        switch (this.f38456a) {
            case 0:
                jo joVar = (jo) this.f38458c;
                if (joVar.h != null && (radialProgressView = joVar.f39420n) != null) {
                    if (!this.f38457b) {
                        radialProgressView.setVisibility(4);
                        joVar.f39412f.setVisibility(4);
                    }
                    joVar.h = null;
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.t9 t9Var = (org.telegram.ui.Components.t9) this.f38458c;
                AnimatorSet animatorSet = t9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f38457b) {
                        t9Var.f32716c.setVisibility(4);
                    } else {
                        t9Var.f32715b.setVisibility(4);
                    }
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.nc ncVar = (org.telegram.ui.Components.nc) this.f38458c;
                if (animator == ncVar.f30949g) {
                    ncVar.f30949g = null;
                    ncVar.f30950i = this.f38457b ? 1.0f : 0.0f;
                    ncVar.b();
                }
                break;
            case 3:
                org.telegram.ui.Components.gi giVar = (org.telegram.ui.Components.gi) this.f38458c;
                if (giVar.U0 != null) {
                    if (!this.f38457b) {
                        org.telegram.ui.ActionBar.v0 v0Var = giVar.f28633a1;
                        if (v0Var != null) {
                            v0Var.setVisibility(4);
                        }
                        if (giVar.M0 != 0 || !giVar.f28670m1) {
                            giVar.W0.setVisibility(4);
                        }
                    } else if (giVar.O0) {
                        org.telegram.ui.Components.yh yhVar = giVar.f28696u0;
                        if (yhVar == null || yhVar.J()) {
                            giVar.f28694t1.setVisibility(4);
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.Components.wn wnVar = (org.telegram.ui.Components.wn) this.f38458c;
                if (!this.f38457b) {
                    org.telegram.ui.Components.n9 n9Var = wnVar.h;
                    wnVar.h = wnVar.f34295n;
                    wnVar.f34295n = n9Var;
                    n9Var.setVisibility(8);
                    wnVar.f34295n.setAlpha(0.0f);
                    wnVar.h.setVisibility(0);
                    wnVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 5:
                boolean z10 = this.f38457b;
                org.telegram.ui.Components.ho hoVar = (org.telegram.ui.Components.ho) this.f38458c;
                if (animator == hoVar.f29065e) {
                    float f10 = z10 ? 1.0f : 0.0f;
                    hoVar.d = f10;
                    hoVar.setShown(f10);
                    if (!z10) {
                        hoVar.setVisibility(8);
                    }
                    hoVar.a(true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.ap apVar = (org.telegram.ui.Components.ap) this.f38458c;
                apVar.f26781c0 = this.f38457b ? 1.0f : 0.0f;
                apVar.F.setTranslationY((-AndroidUtilities.dp(7.0f)) * apVar.f26781c0);
                break;
            case 7:
                if (!this.f38457b) {
                    ((org.telegram.ui.Components.aq) this.f38458c).D.setVisibility(8);
                }
                break;
            case 8:
                org.telegram.ui.Components.iv ivVar = (org.telegram.ui.Components.iv) this.f38458c;
                org.telegram.ui.Components.mv mvVar = ivVar.F;
                if (mvVar.R && !ivVar.h) {
                    if (!this.f38457b && !ivVar.f29494n) {
                        ivVar.setBackground(null);
                    } else if (ivVar.getBackground() == null) {
                        ivVar.setBackground(org.telegram.ui.ActionBar.g6.Y(mvVar.k(), 8, 8));
                    }
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.b00 b00Var = (org.telegram.ui.Components.b00) this.f38458c;
                AnimatorSet animatorSet2 = b00Var.f26867e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f38457b) {
                        b00Var.f26868f.setVisibility(4);
                    }
                    b00Var.f26867e = null;
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.m00 m00Var = (org.telegram.ui.Components.m00) this.f38458c;
                m00Var.h = this.f38457b ? 1.0f : 0.0f;
                m00Var.invalidate();
                break;
            case 11:
                org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) this.f38458c;
                org.telegram.ui.Components.k20 k20Var = n20Var.f30819a;
                if (!n20Var.B) {
                    float f11 = this.f38457b ? 1.0f : 0.0f;
                    n20Var.X = f11;
                    n20Var.Q.setPinnedProgress(f11);
                    k20Var.setScaleX(1.0f - (n20Var.X * 0.6f));
                    k20Var.setScaleY(1.0f - (n20Var.X * 0.6f));
                    if (n20Var.S) {
                        n20Var.i();
                    }
                    break;
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                ((View) this.f38458c).setVisibility(this.f38457b ? 8 : 4);
                break;
            case 13:
                org.telegram.ui.Components.f60 f60Var = (org.telegram.ui.Components.f60) this.f38458c;
                AnimatorSet animatorSet3 = f60Var.T;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f38457b) {
                        f60Var.U.setVisibility(4);
                    }
                    f60Var.T = null;
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.p60 p60Var = (org.telegram.ui.Components.p60) this.f38458c;
                boolean z11 = this.f38457b;
                p60Var.f31517d0 = z11 ? 1.0f : 0.0f;
                ((org.telegram.ui.ActionBar.e3) p60Var).containerView.invalidate();
                if (!z11) {
                    p60Var.R.setVisibility(8);
                }
                break;
            case 15:
                org.telegram.ui.Components.gb0 gb0Var = (org.telegram.ui.Components.gb0) this.f38458c;
                if (gb0Var.getParent() != null) {
                    ((ViewGroup) gb0Var.getParent()).removeView(gb0Var);
                }
                boolean z12 = this.f38457b;
                yk ykVar = (yk) gb0Var;
                MessagePreviewParams messagePreviewParams = ykVar.D.f41992b5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new xk(ykVar, 0), 15L);
                }
                break;
            case 16:
                org.telegram.ui.Components.ab0 ab0Var = (org.telegram.ui.Components.ab0) this.f38458c;
                ab0Var.L = null;
                ab0Var.g(this.f38457b, false);
                break;
            case 17:
                org.telegram.ui.Components.dd0 dd0Var = (org.telegram.ui.Components.dd0) this.f38458c;
                TextView textView = dd0Var.f27725w;
                ag.d dVar = dd0Var.f27720e;
                float f12 = this.f38457b ? 1.0f : 0.0f;
                dVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f12));
                dVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f12));
                dVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f12));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f12));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f12));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f12));
                dd0Var.f27724s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f12));
                break;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f38458c;
                if (animator.equals(pipRoundVideoView.f26426r)) {
                    if (!this.f38457b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f26426r = null;
                }
                break;
            case 19:
                boolean z13 = this.f38457b;
                org.telegram.ui.Components.um0 um0Var = (org.telegram.ui.Components.um0) this.f38458c;
                if (animator == um0Var.C) {
                    float f13 = z13 ? 1.0f : 0.0f;
                    um0Var.B = f13;
                    um0Var.setShown(f13);
                    if (!z13) {
                        um0Var.setVisibility(8);
                    }
                    um0Var.b(true);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.hu0 hu0Var = (org.telegram.ui.Components.hu0) this.f38458c;
                if (hu0Var.J1 != null) {
                    hu0Var.J1 = null;
                    if (!this.f38457b) {
                        hu0Var.f29159x0.setVisibility(4);
                    }
                    break;
                }
                break;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.b11 b11Var = (org.telegram.ui.Components.b11) this.f38458c;
                b11Var.I = this.f38457b ? 1.0f : 0.0f;
                b11Var.invalidate();
                break;
            case 22:
                org.telegram.ui.Components.y11 y11Var = (org.telegram.ui.Components.y11) this.f38458c;
                y11Var.B = this.f38457b ? 1.0f : 0.0f;
                y11Var.h();
                break;
            case 23:
                org.telegram.ui.Components.c21 c21Var = (org.telegram.ui.Components.c21) this.f38458c;
                c21Var.M = this.f38457b ? 1.0f : 0.0f;
                c21Var.h();
                c21Var.g();
                break;
            case 24:
                org.telegram.ui.Components.q51 q51Var = (org.telegram.ui.Components.q51) this.f38458c;
                AnimatorSet animatorSet4 = q51Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f38457b) {
                        q51Var.f31802e.setVisibility(4);
                    }
                    q51Var.d = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.u51 u51Var = (org.telegram.ui.Components.u51) this.f38458c;
                AnimatorSet animatorSet5 = u51Var.f32982r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f38457b) {
                        u51Var.f32981n.setVisibility(4);
                    }
                    u51Var.f32982r = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.f38458c;
                u2Var.v = null;
                if (this.f38457b) {
                    TextView[] textViewArr = u2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!u2Var.C && (drawable = (drawableArr = u2Var.f33938e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                u2Var.C = false;
                if (!u2Var.K) {
                    u2Var.f33940n = u2Var.f33941r;
                }
                u2Var.f33942s = 0.0f;
                u2Var.invalidate();
                break;
            case 27:
                js jsVar = (js) this.f38458c;
                if (jsVar.f39491w != null && (radialProgressView2 = jsVar.f39490s) != null) {
                    if (!this.f38457b) {
                        radialProgressView2.setVisibility(4);
                        jsVar.v.setVisibility(4);
                    }
                    jsVar.f39491w = null;
                    break;
                }
                break;
            case 28:
                xy xyVar = (xy) this.f38458c;
                xyVar.f44644r = this.f38457b ? 1.0f : 0.0f;
                org.telegram.ui.Components.n9 n9Var2 = xyVar.f44640c;
                int i10 = org.telegram.ui.ActionBar.g6.C6;
                int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, xyVar.f44638a);
                int i11 = org.telegram.ui.ActionBar.g6.Oh;
                int iD = i0.b.d(xyVar.f44644r, iV0, org.telegram.ui.ActionBar.g6.v0(i11, xyVar.f44638a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                n9Var2.setColorFilter(new PorterDuffColorFilter(iD, mode));
                xyVar.f44640c.invalidate();
                xyVar.f44642f.setColorFilter(new PorterDuffColorFilter(i0.b.d(1.0f - xyVar.f44644r, org.telegram.ui.ActionBar.g6.v0(i10, xyVar.f44638a), org.telegram.ui.ActionBar.g6.v0(i11, xyVar.f44638a)), mode));
                xyVar.f44642f.invalidate();
                break;
            default:
                j00 j00Var = (j00) this.f38458c;
                j00Var.f39205s = this.f38457b ? 1.0f : 0.0f;
                j00Var.invalidate();
                break;
        }
    }

    public go(View view) {
        this.f38456a = 12;
        this.f38458c = view;
        this.f38457b = true;
    }

    public go(View view, boolean z10) {
        this.f38456a = 12;
        this.f38458c = view;
        this.f38457b = z10;
    }

    public go(org.telegram.ui.Components.wn wnVar) {
        this.f38456a = 4;
        this.f38458c = wnVar;
    }
}
