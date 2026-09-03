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
public final class fq extends EditTextBoldCursor {
    public final int f24950b;
    public final int f24951c;
    public final FrameLayout d;

    public fq(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.f24950b = i11;
        this.d = frameLayout;
        this.f24951c = i10;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.f24950b) {
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
        switch (this.f24950b) {
            case 1:
                super.invalidate();
                ((jq) this.d).B[this.f24951c - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fq fqVar;
        int i10;
        char c3;
        wy wyVar;
        View view;
        f2.i0 i0Var;
        rl0 rl0Var;
        fq fqVar2;
        boolean z4;
        ky kyVar;
        float f10;
        int i11 = this.f24950b;
        int i12 = this.f24951c;
        FrameLayout frameLayout = this.d;
        int i13 = 1;
        switch (i11) {
            case 0:
                jq jqVar = (jq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (jqVar.B[i12 + 1].isFocused()) {
                    AndroidUtilities.showKeyboard(jqVar.B[i12 + 1]);
                    return false;
                }
                jqVar.B[i12 + 1].requestFocus();
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
                wy wyVar2 = (wy) frameLayout;
                kz kzVar = wyVar2.D;
                fq fqVar3 = wyVar2.d;
                if (!fqVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i14 = 2;
                    if (!kzVar.f26472q1.z()) {
                        rl0 rl0Var2 = kzVar.A0;
                        rl0 rl0Var3 = kzVar.M;
                        oy oyVar = kzVar.f26442g0;
                        rl0 rl0Var4 = kzVar.f26435e0;
                        AnimatorSet animatorSet = kzVar.J0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            kzVar.J0 = null;
                        }
                        kzVar.F0 = false;
                        kzVar.f26462n0 = false;
                        kzVar.W = false;
                        int i15 = 0;
                        while (i15 < 3) {
                            if (i15 == 0) {
                                wyVar = kzVar.S;
                                view = kzVar.F;
                                c3 = 0;
                                i0Var = kzVar.N;
                                rl0Var = rl0Var3;
                            } else {
                                c3 = 0;
                                if (i15 == i13) {
                                    wyVar = kzVar.f26457l0;
                                    view = kzVar.m0;
                                    i0Var = kzVar.f26439f0;
                                    rl0Var = rl0Var4;
                                } else {
                                    wyVar = kzVar.D0;
                                    view = kzVar.f26500y0;
                                    i0Var = kzVar.B0;
                                    rl0Var = rl0Var2;
                                }
                            }
                            if (wyVar == null) {
                                fqVar2 = fqVar3;
                            } else if (wyVar2 == wyVar && (kyVar = kzVar.f26472q1) != null && kyVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                kzVar.J0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i15 != i14) {
                                    fqVar2 = fqVar3;
                                    float[] fArr = new float[1];
                                    fArr[c3] = -AndroidUtilities.dp(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[c3] = -AndroidUtilities.dp(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(rl0Var, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[c3] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(wyVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[c3] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    fqVar2 = fqVar3;
                                    if (i15 == 2) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = -AndroidUtilities.dp(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[c3] = f10;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(rl0Var, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[c3] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(wyVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[c3] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                kzVar.J0.setDuration(220L);
                                kzVar.J0.setInterpolator(mr.f27122f);
                                kzVar.J0.addListener(new dg.y2(21, kzVar, rl0Var));
                                kzVar.J0.start();
                            } else {
                                fqVar2 = fqVar3;
                                wyVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                if (view != null && i15 != 2) {
                                    view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                }
                                if (rl0Var == rl0Var2) {
                                    rl0Var.setPadding(0, 0, 0, kzVar.f26464n2);
                                } else if (rl0Var == rl0Var3) {
                                    rl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), kzVar.f26464n2);
                                } else if (rl0Var == rl0Var4) {
                                    rl0Var.setPadding(0, kzVar.Y0, 0, kzVar.f26464n2);
                                }
                                if (rl0Var == rl0Var4) {
                                    if (kzVar.f26454k0.f27688x.size() > 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    oyVar.H = z4;
                                    if (z4) {
                                        oyVar.G("", true);
                                        if (rl0Var4.getAdapter() != oyVar) {
                                            rl0Var4.setAdapter(oyVar);
                                        }
                                    }
                                }
                                i0Var.h1(0, 0);
                                i15++;
                                i13 = 1;
                                i14 = 2;
                                fqVar3 = fqVar2;
                            }
                            i15++;
                            i13 = 1;
                            i14 = 2;
                            fqVar3 = fqVar2;
                        }
                        fqVar = fqVar3;
                        kzVar.O(false);
                    } else {
                        fqVar = fqVar3;
                    }
                    ky kyVar2 = kzVar.f26472q1;
                    if (i12 == 1) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    kyVar2.i(i10);
                    fqVar.requestFocus();
                    AndroidUtilities.showKeyboard(fqVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
