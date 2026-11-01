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
public final class yp extends EditTextBoldCursor {
    public final int G1;
    public final int H1;
    public final FrameLayout I1;

    public yp(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.G1 = i11;
        this.I1 = frameLayout;
        this.H1 = i10;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.G1) {
            case 1:
                boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
                rect.bottom = org.telegram.messenger.i0.L(40.0f) + rect.bottom;
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
                ((cq) this.I1).E[this.H1 - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yp ypVar;
        int i10;
        int i11;
        iy iyVar;
        View view;
        s4.a0 a0Var;
        uk0 uk0Var;
        ?? r16;
        yp ypVar2;
        int i12;
        boolean z10;
        boolean z11;
        vx vxVar;
        float f7;
        int i13 = this.G1;
        int i14 = this.H1;
        FrameLayout frameLayout = this.I1;
        int i15 = 1;
        boolean z12 = false;
        switch (i13) {
            case 0:
                cq cqVar = (cq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (cqVar.E[i14 + 1].isFocused()) {
                    org.telegram.messenger.i0.J3(cqVar.E[i14 + 1]);
                    return false;
                }
                cqVar.E[i14 + 1].requestFocus();
                return false;
            case 1:
                if (getAlpha() == 1.0f) {
                    if (!isFocused()) {
                        requestFocus();
                    } else {
                        org.telegram.messenger.i0.J3(this);
                        return super.onTouchEvent(motionEvent);
                    }
                }
                return false;
            default:
                iy iyVar2 = (iy) frameLayout;
                vy vyVar = iyVar2.G;
                yp ypVar3 = iyVar2.d;
                if (!ypVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i16 = 2;
                    if (!vyVar.f31996t1.z()) {
                        uk0 uk0Var2 = vyVar.D0;
                        uk0 uk0Var3 = vyVar.P;
                        zx zxVar = vyVar.f31964j0;
                        uk0 uk0Var4 = vyVar.f31958h0;
                        AnimatorSet animatorSet = vyVar.M0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            vyVar.M0 = null;
                        }
                        vyVar.I0 = false;
                        vyVar.f31984q0 = false;
                        vyVar.f31942c0 = false;
                        int i17 = 0;
                        while (i17 < 3) {
                            if (i17 == 0) {
                                iyVar = vyVar.V;
                                view = vyVar.I;
                                r16 = z12;
                                a0Var = vyVar.Q;
                                uk0Var = uk0Var3;
                            } else {
                                boolean z13 = z12;
                                if (i17 == i15) {
                                    iyVar = vyVar.f31978o0;
                                    view = vyVar.f31981p0;
                                    a0Var = vyVar.f31961i0;
                                    uk0Var = uk0Var4;
                                    r16 = z13;
                                } else {
                                    iyVar = vyVar.G0;
                                    view = vyVar.B0;
                                    a0Var = vyVar.E0;
                                    uk0Var = uk0Var2;
                                    r16 = z13;
                                }
                            }
                            if (iyVar == null) {
                                ypVar2 = ypVar3;
                                i12 = i16;
                                z10 = r16;
                            } else if (iyVar2 == iyVar && (vxVar = vyVar.f31996t1) != null && vxVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                vyVar.M0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i17 != i16) {
                                    int i18 = i16;
                                    ypVar2 = ypVar3;
                                    float[] fArr = new float[1];
                                    fArr[r16] = -org.telegram.messenger.i0.L(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[r16] = -org.telegram.messenger.i0.L(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(uk0Var, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[r16] = org.telegram.messenger.i0.L(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(iyVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[r16] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[i18] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    ypVar2 = ypVar3;
                                    if (i17 == i16) {
                                        f7 = 0.0f;
                                    } else {
                                        f7 = -org.telegram.messenger.i0.L(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[r16] = f7;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(uk0Var, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[r16] = org.telegram.messenger.i0.L(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(iyVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[r16] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                vyVar.M0.setDuration(220L);
                                vyVar.M0.setInterpolator(gr.f26523f);
                                vyVar.M0.addListener(new bg.f(22, vyVar, uk0Var));
                                vyVar.M0.start();
                                z10 = r16;
                                i12 = 2;
                            } else {
                                ypVar2 = ypVar3;
                                iyVar.setTranslationY(org.telegram.messenger.i0.L(0.0f));
                                i12 = 2;
                                if (view != null && i17 != 2) {
                                    view.setTranslationY(-org.telegram.messenger.i0.L(40.0f));
                                }
                                if (uk0Var == uk0Var2) {
                                    int i19 = r16;
                                    uk0Var.setPadding(i19, i19, i19, vyVar.f31986q2);
                                } else {
                                    int i20 = r16;
                                    if (uk0Var == uk0Var3) {
                                        uk0Var.setPadding(org.telegram.messenger.i0.L(5.0f), i20, org.telegram.messenger.i0.L(5.0f), vyVar.f31986q2);
                                    } else if (uk0Var == uk0Var4) {
                                        uk0Var.setPadding(i20, vyVar.f31939b1, i20, vyVar.f31986q2);
                                    }
                                }
                                if (uk0Var == uk0Var4) {
                                    if (vyVar.f31975n0.f33253y.size() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    zxVar.K = z11;
                                    if (z11) {
                                        zxVar.G("", true);
                                        if (uk0Var4.getAdapter() != zxVar) {
                                            uk0Var4.setAdapter(zxVar);
                                        }
                                    }
                                }
                                z10 = false;
                                a0Var.h1(0, 0);
                            }
                            i17++;
                            i16 = i12;
                            z12 = z10;
                            ypVar3 = ypVar2;
                            i15 = 1;
                        }
                        ypVar = ypVar3;
                        i10 = i16;
                        vyVar.N(z12);
                    } else {
                        ypVar = ypVar3;
                        i10 = 2;
                    }
                    vx vxVar2 = vyVar.f31996t1;
                    if (i14 == 1) {
                        i11 = i10;
                    } else {
                        i11 = 1;
                    }
                    vxVar2.i(i11);
                    ypVar.requestFocus();
                    org.telegram.messenger.i0.J3(ypVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
