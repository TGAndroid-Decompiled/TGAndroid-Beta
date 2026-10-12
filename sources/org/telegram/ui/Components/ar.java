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
public final class ar extends EditTextBoldCursor {
    public final int f24461b;
    public final int f24462c;
    public final FrameLayout d;

    public ar(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.f24461b = i11;
        this.d = frameLayout;
        this.f24462c = i10;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.f24461b) {
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
        switch (this.f24461b) {
            case 1:
                super.invalidate();
                ((er) this.d).E[this.f24462c - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ar arVar;
        int i10;
        int i11;
        pz pzVar;
        View view;
        s4.d0 d0Var;
        wm0 wm0Var;
        ?? r16;
        ar arVar2;
        int i12;
        boolean z10;
        boolean z11;
        dz dzVar;
        float f7;
        int i13 = this.f24461b;
        int i14 = this.f24462c;
        FrameLayout frameLayout = this.d;
        int i15 = 1;
        boolean z12 = false;
        switch (i13) {
            case 0:
                er erVar = (er) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (erVar.E[i14 + 1].isFocused()) {
                    AndroidUtilities.showKeyboard(erVar.E[i14 + 1]);
                    return false;
                }
                erVar.E[i14 + 1].requestFocus();
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
                pz pzVar2 = (pz) frameLayout;
                d00 d00Var = pzVar2.G;
                ar arVar3 = pzVar2.d;
                if (!arVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i16 = 2;
                    if (!d00Var.f25134t1.z()) {
                        wm0 wm0Var2 = d00Var.D0;
                        wm0 wm0Var3 = d00Var.P;
                        hz hzVar = d00Var.f25102j0;
                        wm0 wm0Var4 = d00Var.f25096h0;
                        AnimatorSet animatorSet = d00Var.M0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            d00Var.M0 = null;
                        }
                        d00Var.I0 = false;
                        d00Var.f25122q0 = false;
                        d00Var.f25079c0 = false;
                        int i17 = 0;
                        while (i17 < 3) {
                            if (i17 == 0) {
                                pzVar = d00Var.V;
                                view = d00Var.I;
                                r16 = z12;
                                d0Var = d00Var.Q;
                                wm0Var = wm0Var3;
                            } else {
                                boolean z13 = z12;
                                if (i17 == i15) {
                                    pzVar = d00Var.f25116o0;
                                    view = d00Var.f25119p0;
                                    d0Var = d00Var.f25099i0;
                                    wm0Var = wm0Var4;
                                    r16 = z13;
                                } else {
                                    pzVar = d00Var.G0;
                                    view = d00Var.B0;
                                    d0Var = d00Var.E0;
                                    wm0Var = wm0Var2;
                                    r16 = z13;
                                }
                            }
                            if (pzVar == null) {
                                arVar2 = arVar3;
                                i12 = i16;
                                z10 = r16;
                            } else if (pzVar2 == pzVar && (dzVar = d00Var.f25134t1) != null && dzVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                d00Var.M0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i17 != i16) {
                                    int i18 = i16;
                                    arVar2 = arVar3;
                                    float[] fArr = new float[1];
                                    fArr[r16] = -AndroidUtilities.dp(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[r16] = -AndroidUtilities.dp(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(wm0Var, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[r16] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(pzVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[r16] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[i18] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    arVar2 = arVar3;
                                    if (i17 == i16) {
                                        f7 = 0.0f;
                                    } else {
                                        f7 = -AndroidUtilities.dp(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[r16] = f7;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(wm0Var, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[r16] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(pzVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[r16] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                d00Var.M0.setDuration(220L);
                                d00Var.M0.setInterpolator(js.f27627f);
                                d00Var.M0.addListener(new ai.z(24, d00Var, wm0Var));
                                d00Var.M0.start();
                                z10 = r16;
                                i12 = 2;
                            } else {
                                arVar2 = arVar3;
                                pzVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                i12 = 2;
                                if (view != null && i17 != 2) {
                                    view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                }
                                if (wm0Var == wm0Var2) {
                                    int i19 = r16;
                                    wm0Var.setPadding(i19, i19, i19, d00Var.f25121p2);
                                } else {
                                    int i20 = r16;
                                    if (wm0Var == wm0Var3) {
                                        wm0Var.setPadding(AndroidUtilities.dp(5.0f), i20, AndroidUtilities.dp(5.0f), d00Var.f25121p2);
                                    } else if (wm0Var == wm0Var4) {
                                        wm0Var.setPadding(i20, d00Var.f25076b1, i20, d00Var.f25121p2);
                                    }
                                }
                                if (wm0Var == wm0Var4) {
                                    if (d00Var.f25113n0.f26995x.size() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    hzVar.K = z11;
                                    if (z11) {
                                        hzVar.G("", true);
                                        if (wm0Var4.getAdapter() != hzVar) {
                                            wm0Var4.setAdapter(hzVar);
                                        }
                                    }
                                }
                                z10 = false;
                                d0Var.h1(0, 0);
                            }
                            i17++;
                            i16 = i12;
                            z12 = z10;
                            arVar3 = arVar2;
                            i15 = 1;
                        }
                        arVar = arVar3;
                        i10 = i16;
                        d00Var.M(z12);
                    } else {
                        arVar = arVar3;
                        i10 = 2;
                    }
                    dz dzVar2 = d00Var.f25134t1;
                    if (i14 == 1) {
                        i11 = i10;
                    } else {
                        i11 = 1;
                    }
                    dzVar2.i(i11);
                    arVar.requestFocus();
                    AndroidUtilities.showKeyboard(arVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
