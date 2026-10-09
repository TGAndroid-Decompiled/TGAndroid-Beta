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
import org.telegram.messenger.AndroidUtilities;
public final class yq extends EditTextBoldCursor {
    public final int f33328b;
    public final int f33329c;
    public final FrameLayout d;

    public yq(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.f33328b = i11;
        this.d = frameLayout;
        this.f33329c = i10;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.f33328b) {
            case 1:
                boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
                rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                return globalVisibleRect;
            default:
                return super.getGlobalVisibleRect(rect, point);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f33328b) {
            case 1:
                super.invalidate();
                ((cr) this.d).E[this.f33329c - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yq yqVar;
        int i10;
        int i11;
        mz mzVar;
        View view;
        s4.d0 d0Var;
        qm0 qm0Var;
        ?? r16;
        yq yqVar2;
        int i12;
        boolean z10;
        boolean z11;
        az azVar;
        float f7;
        int i13 = this.f33328b;
        int i14 = this.f33329c;
        FrameLayout frameLayout = this.d;
        int i15 = 1;
        boolean z12 = false;
        switch (i13) {
            case 0:
                cr crVar = (cr) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (crVar.E[i14 + 1].isFocused()) {
                    AndroidUtilities.showKeyboard(crVar.E[i14 + 1]);
                    return false;
                }
                crVar.E[i14 + 1].requestFocus();
                return false;
            case 1:
                if (getAlpha() == 1.0f) {
                    if (!isFocused()) {
                        requestFocus();
                    } else {
                        AndroidUtilities.showKeyboard(this);
                        return super.onTouchEvent(motionEvent);
                    }
                }
                return false;
            default:
                mz mzVar2 = (mz) frameLayout;
                a00 a00Var = mzVar2.G;
                yq yqVar3 = mzVar2.d;
                if (!yqVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i16 = 2;
                    if (!a00Var.f24455t1.z()) {
                        qm0 qm0Var2 = a00Var.D0;
                        qm0 qm0Var3 = a00Var.P;
                        ez ezVar = a00Var.f24423j0;
                        qm0 qm0Var4 = a00Var.f24417h0;
                        AnimatorSet animatorSet = a00Var.M0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            a00Var.M0 = null;
                        }
                        a00Var.I0 = false;
                        a00Var.f24443q0 = false;
                        a00Var.f24400c0 = false;
                        int i17 = 0;
                        while (i17 < 3) {
                            if (i17 == 0) {
                                mzVar = a00Var.V;
                                view = a00Var.I;
                                r16 = z12;
                                d0Var = a00Var.Q;
                                qm0Var = qm0Var3;
                            } else {
                                boolean z13 = z12;
                                if (i17 == i15) {
                                    mzVar = a00Var.f24437o0;
                                    view = a00Var.f24440p0;
                                    d0Var = a00Var.f24420i0;
                                    qm0Var = qm0Var4;
                                    r16 = z13;
                                } else {
                                    mzVar = a00Var.G0;
                                    view = a00Var.B0;
                                    d0Var = a00Var.E0;
                                    qm0Var = qm0Var2;
                                    r16 = z13;
                                }
                            }
                            if (mzVar == null) {
                                yqVar2 = yqVar3;
                                i12 = i16;
                                z10 = r16;
                            } else if (mzVar2 == mzVar && (azVar = a00Var.f24455t1) != null && azVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                a00Var.M0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i17 != i16) {
                                    int i18 = i16;
                                    yqVar2 = yqVar3;
                                    float[] fArr = new float[1];
                                    fArr[r16] = -AndroidUtilities.dp(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[r16] = -AndroidUtilities.dp(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(qm0Var, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[r16] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(mzVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[r16] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[i18] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    yqVar2 = yqVar3;
                                    if (i17 == i16) {
                                        f7 = 0.0f;
                                    } else {
                                        f7 = -AndroidUtilities.dp(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[r16] = f7;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(qm0Var, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[r16] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(mzVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[r16] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                a00Var.M0.setDuration(220L);
                                a00Var.M0.setInterpolator(hs.f27118f);
                                a00Var.M0.addListener(new ai.z(24, a00Var, qm0Var));
                                a00Var.M0.start();
                                z10 = r16;
                                i12 = 2;
                            } else {
                                yqVar2 = yqVar3;
                                mzVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                i12 = 2;
                                if (view != null && i17 != 2) {
                                    view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                }
                                if (qm0Var == qm0Var2) {
                                    int i19 = r16;
                                    qm0Var.setPadding(i19, i19, i19, a00Var.f24442p2);
                                } else {
                                    int i20 = r16;
                                    if (qm0Var == qm0Var3) {
                                        qm0Var.setPadding(AndroidUtilities.dp(5.0f), i20, AndroidUtilities.dp(5.0f), a00Var.f24442p2);
                                    } else if (qm0Var == qm0Var4) {
                                        qm0Var.setPadding(i20, a00Var.f24397b1, i20, a00Var.f24442p2);
                                    }
                                }
                                if (qm0Var == qm0Var4) {
                                    if (a00Var.f24434n0.f26187x.size() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    ezVar.K = z11;
                                    if (z11) {
                                        ezVar.G("", true);
                                        if (qm0Var4.getAdapter() != ezVar) {
                                            qm0Var4.setAdapter(ezVar);
                                        }
                                    }
                                }
                                z10 = false;
                                d0Var.h1(0, 0);
                            }
                            i17++;
                            i16 = i12;
                            z12 = z10;
                            yqVar3 = yqVar2;
                            i15 = 1;
                        }
                        yqVar = yqVar3;
                        i10 = i16;
                        a00Var.M(z12);
                    } else {
                        yqVar = yqVar3;
                        i10 = 2;
                    }
                    az azVar2 = a00Var.f24455t1;
                    if (i14 == 1) {
                        i11 = i10;
                    } else {
                        i11 = 1;
                    }
                    azVar2.i(i11);
                    yqVar.requestFocus();
                    AndroidUtilities.showKeyboard(yqVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
