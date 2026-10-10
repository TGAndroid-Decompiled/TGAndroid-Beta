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
    public final int f33388b;
    public final int f33389c;
    public final FrameLayout d;

    public yq(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.f33388b = i11;
        this.d = frameLayout;
        this.f33389c = i10;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.f33388b) {
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
        switch (this.f33388b) {
            case 1:
                super.invalidate();
                ((cr) this.d).E[this.f33389c - 1].invalidate();
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
        nz nzVar;
        View view;
        s4.d0 d0Var;
        rm0 rm0Var;
        ?? r16;
        yq yqVar2;
        int i12;
        boolean z10;
        boolean z11;
        bz bzVar;
        float f7;
        int i13 = this.f33388b;
        int i14 = this.f33389c;
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
                nz nzVar2 = (nz) frameLayout;
                b00 b00Var = nzVar2.G;
                yq yqVar3 = nzVar2.d;
                if (!yqVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i16 = 2;
                    if (!b00Var.f24743t1.z()) {
                        rm0 rm0Var2 = b00Var.D0;
                        rm0 rm0Var3 = b00Var.P;
                        fz fzVar = b00Var.f24711j0;
                        rm0 rm0Var4 = b00Var.f24705h0;
                        AnimatorSet animatorSet = b00Var.M0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            b00Var.M0 = null;
                        }
                        b00Var.I0 = false;
                        b00Var.f24731q0 = false;
                        b00Var.f24688c0 = false;
                        int i17 = 0;
                        while (i17 < 3) {
                            if (i17 == 0) {
                                nzVar = b00Var.V;
                                view = b00Var.I;
                                r16 = z12;
                                d0Var = b00Var.Q;
                                rm0Var = rm0Var3;
                            } else {
                                boolean z13 = z12;
                                if (i17 == i15) {
                                    nzVar = b00Var.f24725o0;
                                    view = b00Var.f24728p0;
                                    d0Var = b00Var.f24708i0;
                                    rm0Var = rm0Var4;
                                    r16 = z13;
                                } else {
                                    nzVar = b00Var.G0;
                                    view = b00Var.B0;
                                    d0Var = b00Var.E0;
                                    rm0Var = rm0Var2;
                                    r16 = z13;
                                }
                            }
                            if (nzVar == null) {
                                yqVar2 = yqVar3;
                                i12 = i16;
                                z10 = r16;
                            } else if (nzVar2 == nzVar && (bzVar = b00Var.f24743t1) != null && bzVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                b00Var.M0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i17 != i16) {
                                    int i18 = i16;
                                    yqVar2 = yqVar3;
                                    float[] fArr = new float[1];
                                    fArr[r16] = -AndroidUtilities.dp(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[r16] = -AndroidUtilities.dp(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(rm0Var, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[r16] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(nzVar, property, fArr3);
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
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(rm0Var, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[r16] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(nzVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[r16] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                b00Var.M0.setDuration(220L);
                                b00Var.M0.setInterpolator(is.f27443f);
                                b00Var.M0.addListener(new ai.z(24, b00Var, rm0Var));
                                b00Var.M0.start();
                                z10 = r16;
                                i12 = 2;
                            } else {
                                yqVar2 = yqVar3;
                                nzVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                i12 = 2;
                                if (view != null && i17 != 2) {
                                    view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                }
                                if (rm0Var == rm0Var2) {
                                    int i19 = r16;
                                    rm0Var.setPadding(i19, i19, i19, b00Var.f24730p2);
                                } else {
                                    int i20 = r16;
                                    if (rm0Var == rm0Var3) {
                                        rm0Var.setPadding(AndroidUtilities.dp(5.0f), i20, AndroidUtilities.dp(5.0f), b00Var.f24730p2);
                                    } else if (rm0Var == rm0Var4) {
                                        rm0Var.setPadding(i20, b00Var.f24685b1, i20, b00Var.f24730p2);
                                    }
                                }
                                if (rm0Var == rm0Var4) {
                                    if (b00Var.f24722n0.f26543x.size() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    fzVar.K = z11;
                                    if (z11) {
                                        fzVar.G("", true);
                                        if (rm0Var4.getAdapter() != fzVar) {
                                            rm0Var4.setAdapter(fzVar);
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
                        b00Var.M(z12);
                    } else {
                        yqVar = yqVar3;
                        i10 = 2;
                    }
                    bz bzVar2 = b00Var.f24743t1;
                    if (i14 == 1) {
                        i11 = i10;
                    } else {
                        i11 = 1;
                    }
                    bzVar2.i(i11);
                    yqVar.requestFocus();
                    AndroidUtilities.showKeyboard(yqVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
