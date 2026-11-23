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
public final class fq extends EditTextBoldCursor {
    public final int M1;
    public final int N1;
    public final FrameLayout O1;

    public fq(FrameLayout frameLayout, Context context, int i7, int i10) {
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
                ((jq) this.O1).F[this.N1 - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fq fqVar;
        int i7;
        int i10;
        dy dyVar;
        View view;
        v4.c0 c0Var;
        ek0 ek0Var;
        ?? r16;
        fq fqVar2;
        int i11;
        boolean z10;
        boolean z11;
        qx qxVar;
        float f10;
        int i12 = this.M1;
        int i13 = this.N1;
        FrameLayout frameLayout = this.O1;
        int i14 = 1;
        boolean z12 = false;
        switch (i12) {
            case 0:
                jq jqVar = (jq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (jqVar.F[i13 + 1].isFocused()) {
                    org.telegram.messenger.g0.I3(jqVar.F[i13 + 1]);
                    return false;
                }
                jqVar.F[i13 + 1].requestFocus();
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
                dy dyVar2 = (dy) frameLayout;
                qy qyVar = dyVar2.H;
                fq fqVar3 = dyVar2.d;
                if (!fqVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i15 = 2;
                    if (!qyVar.f39099u1.z()) {
                        ek0 ek0Var2 = qyVar.E0;
                        ek0 ek0Var3 = qyVar.Q;
                        ux uxVar = qyVar.f39068k0;
                        ek0 ek0Var4 = qyVar.f39062i0;
                        AnimatorSet animatorSet = qyVar.N0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            qyVar.N0 = null;
                        }
                        qyVar.J0 = false;
                        qyVar.f39088r0 = false;
                        qyVar.f39046d0 = false;
                        int i16 = 0;
                        while (i16 < 3) {
                            if (i16 == 0) {
                                dyVar = qyVar.W;
                                view = qyVar.J;
                                r16 = z12;
                                c0Var = qyVar.R;
                                ek0Var = ek0Var3;
                            } else {
                                boolean z13 = z12;
                                if (i16 == i14) {
                                    dyVar = qyVar.f39081p0;
                                    view = qyVar.f39084q0;
                                    c0Var = qyVar.f39065j0;
                                    ek0Var = ek0Var4;
                                    r16 = z13;
                                } else {
                                    dyVar = qyVar.H0;
                                    view = qyVar.C0;
                                    c0Var = qyVar.F0;
                                    ek0Var = ek0Var2;
                                    r16 = z13;
                                }
                            }
                            if (dyVar == null) {
                                fqVar2 = fqVar3;
                                i11 = i15;
                                z10 = r16;
                            } else if (dyVar2 == dyVar && (qxVar = qyVar.f39099u1) != null && qxVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                qyVar.N0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i16 != i15) {
                                    int i17 = i15;
                                    fqVar2 = fqVar3;
                                    float[] fArr = new float[1];
                                    fArr[r16] = -org.telegram.messenger.g0.L(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[r16] = -org.telegram.messenger.g0.L(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ek0Var, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[r16] = org.telegram.messenger.g0.L(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(dyVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[r16] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[i17] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    fqVar2 = fqVar3;
                                    if (i16 == i15) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = -org.telegram.messenger.g0.L(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[r16] = f10;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ek0Var, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[r16] = org.telegram.messenger.g0.L(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(dyVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[r16] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                qyVar.N0.setDuration(220L);
                                qyVar.N0.setInterpolator(kr.f36858f);
                                qyVar.N0.addListener(new ah.l(28, qyVar, ek0Var));
                                qyVar.N0.start();
                                z10 = r16;
                                i11 = 2;
                            } else {
                                fqVar2 = fqVar3;
                                dyVar.setTranslationY(org.telegram.messenger.g0.L(0.0f));
                                i11 = 2;
                                if (view != null && i16 != 2) {
                                    view.setTranslationY(-org.telegram.messenger.g0.L(40.0f));
                                }
                                if (ek0Var == ek0Var2) {
                                    int i18 = r16;
                                    ek0Var.setPadding(i18, i18, i18, qyVar.f39090r2);
                                } else {
                                    int i19 = r16;
                                    if (ek0Var == ek0Var3) {
                                        ek0Var.setPadding(org.telegram.messenger.g0.L(5.0f), i19, org.telegram.messenger.g0.L(5.0f), qyVar.f39090r2);
                                    } else if (ek0Var == ek0Var4) {
                                        ek0Var.setPadding(i19, qyVar.f39044c1, i19, qyVar.f39090r2);
                                    }
                                }
                                if (ek0Var == ek0Var4) {
                                    if (qyVar.f39078o0.f40499y.size() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    uxVar.L = z11;
                                    if (z11) {
                                        uxVar.G("", true);
                                        if (ek0Var4.getAdapter() != uxVar) {
                                            ek0Var4.setAdapter(uxVar);
                                        }
                                    }
                                }
                                z10 = false;
                                c0Var.h1(0, 0);
                            }
                            i16++;
                            i15 = i11;
                            z12 = z10;
                            fqVar3 = fqVar2;
                            i14 = 1;
                        }
                        fqVar = fqVar3;
                        i7 = i15;
                        qyVar.N(z12);
                    } else {
                        fqVar = fqVar3;
                        i7 = 2;
                    }
                    qx qxVar2 = qyVar.f39099u1;
                    if (i13 == 1) {
                        i10 = i7;
                    } else {
                        i10 = 1;
                    }
                    qxVar2.i(i10);
                    fqVar.requestFocus();
                    org.telegram.messenger.g0.I3(fqVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
