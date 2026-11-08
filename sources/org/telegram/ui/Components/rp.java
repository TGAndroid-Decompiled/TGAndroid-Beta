package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class rp extends EditTextBoldCursor {
    public final int G1;
    public final int H1;
    public final FrameLayout I1;

    public rp(FrameLayout frameLayout, Context context, int i7, int i10) {
        super(context);
        this.G1 = i10;
        this.I1 = frameLayout;
        this.H1 = i7;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.G1) {
            case 1:
                boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
                rect.bottom = org.telegram.messenger.g0.L(40.0f) + rect.bottom;
                return globalVisibleRect;
            default:
                return super.getGlobalVisibleRect(rect, point);
        }
    }

    @Override
    public void invalidate() {
        switch (this.G1) {
            case 1:
                super.invalidate();
                ((vp) this.I1).E[this.H1 - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rp rpVar;
        int i7;
        int i10;
        ux uxVar;
        View view;
        v4.b0 b0Var;
        pj0 pj0Var;
        ?? r16;
        rp rpVar2;
        int i11;
        boolean z9;
        boolean z10;
        ix ixVar;
        float f10;
        int i12 = this.G1;
        int i13 = this.H1;
        FrameLayout frameLayout = this.I1;
        int i14 = 1;
        boolean z11 = false;
        switch (i12) {
            case 0:
                vp vpVar = (vp) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (vpVar.E[i13 + 1].isFocused()) {
                    org.telegram.messenger.g0.K3(vpVar.E[i13 + 1]);
                    return false;
                }
                vpVar.E[i13 + 1].requestFocus();
                return false;
            case 1:
                if (getAlpha() == 1.0f) {
                    if (!isFocused()) {
                        requestFocus();
                    } else {
                        org.telegram.messenger.g0.K3(this);
                        return super.onTouchEvent(motionEvent);
                    }
                }
                return false;
            default:
                ux uxVar2 = (ux) frameLayout;
                hy hyVar = uxVar2.G;
                rp rpVar3 = uxVar2.d;
                if (!rpVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i15 = 2;
                    if (!hyVar.f34452t1.z()) {
                        pj0 pj0Var2 = hyVar.D0;
                        pj0 pj0Var3 = hyVar.P;
                        mx mxVar = hyVar.f34421j0;
                        pj0 pj0Var4 = hyVar.f34415h0;
                        AnimatorSet animatorSet = hyVar.M0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            hyVar.M0 = null;
                        }
                        hyVar.I0 = false;
                        hyVar.f34440q0 = false;
                        hyVar.f34399c0 = false;
                        int i16 = 0;
                        while (i16 < 3) {
                            if (i16 == 0) {
                                uxVar = hyVar.V;
                                view = hyVar.I;
                                r16 = z11;
                                b0Var = hyVar.Q;
                                pj0Var = pj0Var3;
                            } else {
                                boolean z12 = z11;
                                if (i16 == i14) {
                                    uxVar = hyVar.f34434o0;
                                    view = hyVar.f34437p0;
                                    b0Var = hyVar.f34418i0;
                                    pj0Var = pj0Var4;
                                    r16 = z12;
                                } else {
                                    uxVar = hyVar.G0;
                                    view = hyVar.B0;
                                    b0Var = hyVar.E0;
                                    pj0Var = pj0Var2;
                                    r16 = z12;
                                }
                            }
                            if (uxVar == null) {
                                rpVar2 = rpVar3;
                                i11 = i15;
                                z9 = r16;
                            } else if (uxVar2 == uxVar && (ixVar = hyVar.f34452t1) != null && ixVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                hyVar.M0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i16 != i15) {
                                    int i17 = i15;
                                    rpVar2 = rpVar3;
                                    float[] fArr = new float[1];
                                    fArr[r16] = -org.telegram.messenger.g0.L(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[r16] = -org.telegram.messenger.g0.L(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pj0Var, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[r16] = org.telegram.messenger.g0.L(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(uxVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[r16] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[i17] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    rpVar2 = rpVar3;
                                    if (i16 == i15) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = -org.telegram.messenger.g0.L(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[r16] = f10;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(pj0Var, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[r16] = org.telegram.messenger.g0.L(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(uxVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[r16] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                hyVar.M0.setDuration(220L);
                                hyVar.M0.setInterpolator(xq.f40366f);
                                hyVar.M0.addListener(new ah.l(27, hyVar, pj0Var));
                                hyVar.M0.start();
                                z9 = r16;
                                i11 = 2;
                            } else {
                                rpVar2 = rpVar3;
                                uxVar.setTranslationY(org.telegram.messenger.g0.L(0.0f));
                                i11 = 2;
                                if (view != null && i16 != 2) {
                                    view.setTranslationY(-org.telegram.messenger.g0.L(40.0f));
                                }
                                if (pj0Var == pj0Var2) {
                                    int i18 = r16;
                                    pj0Var.setPadding(i18, i18, i18, hyVar.f34442q2);
                                } else {
                                    int i19 = r16;
                                    if (pj0Var == pj0Var3) {
                                        pj0Var.setPadding(org.telegram.messenger.g0.L(5.0f), i19, org.telegram.messenger.g0.L(5.0f), hyVar.f34442q2);
                                    } else if (pj0Var == pj0Var4) {
                                        pj0Var.setPadding(i19, hyVar.f34396b1, i19, hyVar.f34442q2);
                                    }
                                }
                                if (pj0Var == pj0Var4) {
                                    if (hyVar.f34432n0.f36133y.size() > 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    mxVar.K = z10;
                                    if (z10) {
                                        mxVar.G("", true);
                                        if (pj0Var4.getAdapter() != mxVar) {
                                            pj0Var4.setAdapter(mxVar);
                                        }
                                    }
                                }
                                z9 = false;
                                b0Var.h1(0, 0);
                            }
                            i16++;
                            i15 = i11;
                            z11 = z9;
                            rpVar3 = rpVar2;
                            i14 = 1;
                        }
                        rpVar = rpVar3;
                        i7 = i15;
                        hyVar.M(z11);
                    } else {
                        rpVar = rpVar3;
                        i7 = 2;
                    }
                    ix ixVar2 = hyVar.f34452t1;
                    if (i13 == 1) {
                        i10 = i7;
                    } else {
                        i10 = 1;
                    }
                    ixVar2.i(i10);
                    rpVar.requestFocus();
                    org.telegram.messenger.g0.K3(rpVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
