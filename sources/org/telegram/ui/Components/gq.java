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
public final class gq extends EditTextBoldCursor {
    public final int M1;
    public final int N1;
    public final FrameLayout O1;

    public gq(FrameLayout frameLayout, Context context, int i7, int i10) {
        super(context);
        this.M1 = i10;
        this.O1 = frameLayout;
        this.N1 = i7;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.M1) {
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
        switch (this.M1) {
            case 1:
                super.invalidate();
                ((kq) this.O1).F[this.N1 - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gq gqVar;
        int i7;
        int i10;
        ey eyVar;
        View view;
        v4.c0 c0Var;
        ck0 ck0Var;
        ?? r16;
        gq gqVar2;
        int i11;
        boolean z10;
        boolean z11;
        rx rxVar;
        float f10;
        int i12 = this.M1;
        int i13 = this.N1;
        FrameLayout frameLayout = this.O1;
        int i14 = 1;
        boolean z12 = false;
        switch (i12) {
            case 0:
                kq kqVar = (kq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (kqVar.F[i13 + 1].isFocused()) {
                    org.telegram.messenger.g0.I3(kqVar.F[i13 + 1]);
                    return false;
                }
                kqVar.F[i13 + 1].requestFocus();
                return false;
            case 1:
                if (getAlpha() == 1.0f) {
                    if (!isFocused()) {
                        requestFocus();
                    } else {
                        org.telegram.messenger.g0.I3(this);
                        return super.onTouchEvent(motionEvent);
                    }
                }
                return false;
            default:
                ey eyVar2 = (ey) frameLayout;
                ry ryVar = eyVar2.H;
                gq gqVar3 = eyVar2.d;
                if (!gqVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i15 = 2;
                    if (!ryVar.f39397u1.z()) {
                        ck0 ck0Var2 = ryVar.E0;
                        ck0 ck0Var3 = ryVar.Q;
                        vx vxVar = ryVar.f39366k0;
                        ck0 ck0Var4 = ryVar.f39360i0;
                        AnimatorSet animatorSet = ryVar.N0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            ryVar.N0 = null;
                        }
                        ryVar.J0 = false;
                        ryVar.f39386r0 = false;
                        ryVar.f39344d0 = false;
                        int i16 = 0;
                        while (i16 < 3) {
                            if (i16 == 0) {
                                eyVar = ryVar.W;
                                view = ryVar.J;
                                r16 = z12;
                                c0Var = ryVar.R;
                                ck0Var = ck0Var3;
                            } else {
                                boolean z13 = z12;
                                if (i16 == i14) {
                                    eyVar = ryVar.f39379p0;
                                    view = ryVar.f39382q0;
                                    c0Var = ryVar.f39363j0;
                                    ck0Var = ck0Var4;
                                    r16 = z13;
                                } else {
                                    eyVar = ryVar.H0;
                                    view = ryVar.C0;
                                    c0Var = ryVar.F0;
                                    ck0Var = ck0Var2;
                                    r16 = z13;
                                }
                            }
                            if (eyVar == null) {
                                gqVar2 = gqVar3;
                                i11 = i15;
                                z10 = r16;
                            } else if (eyVar2 == eyVar && (rxVar = ryVar.f39397u1) != null && rxVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                ryVar.N0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i16 != i15) {
                                    int i17 = i15;
                                    gqVar2 = gqVar3;
                                    float[] fArr = new float[1];
                                    fArr[r16] = -org.telegram.messenger.g0.L(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[r16] = -org.telegram.messenger.g0.L(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ck0Var, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[r16] = org.telegram.messenger.g0.L(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eyVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[r16] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[i17] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    gqVar2 = gqVar3;
                                    if (i16 == i15) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = -org.telegram.messenger.g0.L(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[r16] = f10;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ck0Var, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[r16] = org.telegram.messenger.g0.L(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(eyVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[r16] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                ryVar.N0.setDuration(220L);
                                ryVar.N0.setInterpolator(lr.f37208f);
                                ryVar.N0.addListener(new ah.l(27, ryVar, ck0Var));
                                ryVar.N0.start();
                                z10 = r16;
                                i11 = 2;
                            } else {
                                gqVar2 = gqVar3;
                                eyVar.setTranslationY(org.telegram.messenger.g0.L(0.0f));
                                i11 = 2;
                                if (view != null && i16 != 2) {
                                    view.setTranslationY(-org.telegram.messenger.g0.L(40.0f));
                                }
                                if (ck0Var == ck0Var2) {
                                    int i18 = r16;
                                    ck0Var.setPadding(i18, i18, i18, ryVar.f39388r2);
                                } else {
                                    int i19 = r16;
                                    if (ck0Var == ck0Var3) {
                                        ck0Var.setPadding(org.telegram.messenger.g0.L(5.0f), i19, org.telegram.messenger.g0.L(5.0f), ryVar.f39388r2);
                                    } else if (ck0Var == ck0Var4) {
                                        ck0Var.setPadding(i19, ryVar.f39342c1, i19, ryVar.f39388r2);
                                    }
                                }
                                if (ck0Var == ck0Var4) {
                                    if (ryVar.f39376o0.f41479y.size() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    vxVar.L = z11;
                                    if (z11) {
                                        vxVar.G("", true);
                                        if (ck0Var4.getAdapter() != vxVar) {
                                            ck0Var4.setAdapter(vxVar);
                                        }
                                    }
                                }
                                z10 = false;
                                c0Var.h1(0, 0);
                            }
                            i16++;
                            i15 = i11;
                            z12 = z10;
                            gqVar3 = gqVar2;
                            i14 = 1;
                        }
                        gqVar = gqVar3;
                        i7 = i15;
                        ryVar.N(z12);
                    } else {
                        gqVar = gqVar3;
                        i7 = 2;
                    }
                    rx rxVar2 = ryVar.f39397u1;
                    if (i13 == 1) {
                        i10 = i7;
                    } else {
                        i10 = 1;
                    }
                    rxVar2.i(i10);
                    gqVar.requestFocus();
                    org.telegram.messenger.g0.I3(gqVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
