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
public final class iq extends EditTextBoldCursor {
    public final int M1;
    public final int N1;
    public final FrameLayout O1;

    public iq(FrameLayout frameLayout, Context context, int i7, int i10) {
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
                ((mq) this.O1).F[this.N1 - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        iq iqVar;
        int i7;
        int i10;
        gy gyVar;
        View view;
        v4.c0 c0Var;
        ek0 ek0Var;
        ?? r16;
        iq iqVar2;
        int i11;
        boolean z10;
        boolean z11;
        tx txVar;
        float f10;
        int i12 = this.M1;
        int i13 = this.N1;
        FrameLayout frameLayout = this.O1;
        int i14 = 1;
        boolean z12 = false;
        switch (i12) {
            case 0:
                mq mqVar = (mq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (mqVar.F[i13 + 1].isFocused()) {
                    org.telegram.messenger.g0.I3(mqVar.F[i13 + 1]);
                    return false;
                }
                mqVar.F[i13 + 1].requestFocus();
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
                gy gyVar2 = (gy) frameLayout;
                ty tyVar = gyVar2.H;
                iq iqVar3 = gyVar2.d;
                if (!iqVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i15 = 2;
                    if (!tyVar.f40151u1.z()) {
                        ek0 ek0Var2 = tyVar.E0;
                        ek0 ek0Var3 = tyVar.Q;
                        xx xxVar = tyVar.f40120k0;
                        ek0 ek0Var4 = tyVar.f40114i0;
                        AnimatorSet animatorSet = tyVar.N0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            tyVar.N0 = null;
                        }
                        tyVar.J0 = false;
                        tyVar.f40140r0 = false;
                        tyVar.f40098d0 = false;
                        int i16 = 0;
                        while (i16 < 3) {
                            if (i16 == 0) {
                                gyVar = tyVar.W;
                                view = tyVar.J;
                                r16 = z12;
                                c0Var = tyVar.R;
                                ek0Var = ek0Var3;
                            } else {
                                boolean z13 = z12;
                                if (i16 == i14) {
                                    gyVar = tyVar.f40133p0;
                                    view = tyVar.f40136q0;
                                    c0Var = tyVar.f40117j0;
                                    ek0Var = ek0Var4;
                                    r16 = z13;
                                } else {
                                    gyVar = tyVar.H0;
                                    view = tyVar.C0;
                                    c0Var = tyVar.F0;
                                    ek0Var = ek0Var2;
                                    r16 = z13;
                                }
                            }
                            if (gyVar == null) {
                                iqVar2 = iqVar3;
                                i11 = i15;
                                z10 = r16;
                            } else if (gyVar2 == gyVar && (txVar = tyVar.f40151u1) != null && txVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                tyVar.N0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i16 != i15) {
                                    int i17 = i15;
                                    iqVar2 = iqVar3;
                                    float[] fArr = new float[1];
                                    fArr[r16] = -org.telegram.messenger.g0.L(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[r16] = -org.telegram.messenger.g0.L(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ek0Var, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[r16] = org.telegram.messenger.g0.L(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(gyVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[r16] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[i17] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    iqVar2 = iqVar3;
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
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(gyVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[r16] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                tyVar.N0.setDuration(220L);
                                tyVar.N0.setInterpolator(nr.f37956f);
                                tyVar.N0.addListener(new ah.l(28, tyVar, ek0Var));
                                tyVar.N0.start();
                                z10 = r16;
                                i11 = 2;
                            } else {
                                iqVar2 = iqVar3;
                                gyVar.setTranslationY(org.telegram.messenger.g0.L(0.0f));
                                i11 = 2;
                                if (view != null && i16 != 2) {
                                    view.setTranslationY(-org.telegram.messenger.g0.L(40.0f));
                                }
                                if (ek0Var == ek0Var2) {
                                    int i18 = r16;
                                    ek0Var.setPadding(i18, i18, i18, tyVar.f40142r2);
                                } else {
                                    int i19 = r16;
                                    if (ek0Var == ek0Var3) {
                                        ek0Var.setPadding(org.telegram.messenger.g0.L(5.0f), i19, org.telegram.messenger.g0.L(5.0f), tyVar.f40142r2);
                                    } else if (ek0Var == ek0Var4) {
                                        ek0Var.setPadding(i19, tyVar.f40096c1, i19, tyVar.f40142r2);
                                    }
                                }
                                if (ek0Var == ek0Var4) {
                                    if (tyVar.f40130o0.f42251y.size() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    xxVar.L = z11;
                                    if (z11) {
                                        xxVar.G("", true);
                                        if (ek0Var4.getAdapter() != xxVar) {
                                            ek0Var4.setAdapter(xxVar);
                                        }
                                    }
                                }
                                z10 = false;
                                c0Var.h1(0, 0);
                            }
                            i16++;
                            i15 = i11;
                            z12 = z10;
                            iqVar3 = iqVar2;
                            i14 = 1;
                        }
                        iqVar = iqVar3;
                        i7 = i15;
                        tyVar.N(z12);
                    } else {
                        iqVar = iqVar3;
                        i7 = 2;
                    }
                    tx txVar2 = tyVar.f40151u1;
                    if (i13 == 1) {
                        i10 = i7;
                    } else {
                        i10 = 1;
                    }
                    txVar2.i(i10);
                    iqVar.requestFocus();
                    org.telegram.messenger.g0.I3(iqVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
