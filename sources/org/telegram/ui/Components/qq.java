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
public final class qq extends EditTextBoldCursor {
    public final int f29974b;
    public final int f29975c;
    public final FrameLayout d;

    public qq(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.f29974b = i11;
        this.d = frameLayout;
        this.f29975c = i10;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.f29974b) {
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
        switch (this.f29974b) {
            case 1:
                super.invalidate();
                ((uq) this.d).E[this.f29975c - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qq qqVar;
        int i10;
        int i11;
        ez ezVar;
        View view;
        s4.b0 b0Var;
        sw swVar;
        ?? r16;
        qq qqVar2;
        int i12;
        boolean z10;
        boolean z11;
        sy syVar;
        float f7;
        int i13 = this.f29974b;
        int i14 = this.f29975c;
        FrameLayout frameLayout = this.d;
        int i15 = 1;
        boolean z12 = false;
        switch (i13) {
            case 0:
                uq uqVar = (uq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (uqVar.E[i14 + 1].isFocused()) {
                    AndroidUtilities.showKeyboard(uqVar.E[i14 + 1]);
                    return false;
                }
                uqVar.E[i14 + 1].requestFocus();
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
                ez ezVar2 = (ez) frameLayout;
                rz rzVar = ezVar2.G;
                qq qqVar3 = ezVar2.d;
                if (!qqVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i16 = 2;
                    if (!rzVar.f30363t1.z()) {
                        View view2 = rzVar.D0;
                        View view3 = rzVar.P;
                        wy wyVar = rzVar.f30331j0;
                        sw swVar2 = rzVar.f30325h0;
                        AnimatorSet animatorSet = rzVar.M0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            rzVar.M0 = null;
                        }
                        rzVar.I0 = false;
                        rzVar.f30351q0 = false;
                        rzVar.f30309c0 = false;
                        int i17 = 0;
                        while (i17 < 3) {
                            if (i17 == 0) {
                                ezVar = rzVar.V;
                                view = rzVar.I;
                                r16 = z12;
                                b0Var = rzVar.Q;
                                swVar = view3;
                            } else {
                                boolean z13 = z12;
                                if (i17 == i15) {
                                    ezVar = rzVar.f30345o0;
                                    view = rzVar.f30348p0;
                                    b0Var = rzVar.f30328i0;
                                    swVar = swVar2;
                                    r16 = z13;
                                } else {
                                    ezVar = rzVar.G0;
                                    view = rzVar.B0;
                                    b0Var = rzVar.E0;
                                    swVar = view2;
                                    r16 = z13;
                                }
                            }
                            if (ezVar == null) {
                                qqVar2 = qqVar3;
                                i12 = i16;
                                z10 = r16;
                            } else if (ezVar2 == ezVar && (syVar = rzVar.f30363t1) != null && syVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                rzVar.M0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i17 != i16) {
                                    int i18 = i16;
                                    qqVar2 = qqVar3;
                                    float[] fArr = new float[1];
                                    fArr[r16] = -AndroidUtilities.dp(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[r16] = -AndroidUtilities.dp(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(swVar, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[r16] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ezVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[r16] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[i18] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    qqVar2 = qqVar3;
                                    if (i17 == i16) {
                                        f7 = 0.0f;
                                    } else {
                                        f7 = -AndroidUtilities.dp(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[r16] = f7;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(swVar, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[r16] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ezVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[r16] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                rzVar.M0.setDuration(220L);
                                rzVar.M0.setInterpolator(zr.f33337f);
                                rzVar.M0.addListener(new ai.ne(25, rzVar, swVar));
                                rzVar.M0.start();
                                z10 = r16;
                                i12 = 2;
                            } else {
                                qqVar2 = qqVar3;
                                ezVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                i12 = 2;
                                if (view != null && i17 != 2) {
                                    view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                }
                                if (swVar == view2) {
                                    int i19 = r16;
                                    swVar.setPadding(i19, i19, i19, rzVar.f30353q2);
                                } else {
                                    int i20 = r16;
                                    if (swVar == view3) {
                                        swVar.setPadding(AndroidUtilities.dp(5.0f), i20, AndroidUtilities.dp(5.0f), rzVar.f30353q2);
                                    } else if (swVar == swVar2) {
                                        swVar.setPadding(i20, rzVar.f30306b1, i20, rzVar.f30353q2);
                                    }
                                }
                                if (swVar == swVar2) {
                                    if (rzVar.f30342n0.f32439x.size() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    wyVar.K = z11;
                                    if (z11) {
                                        wyVar.G("", true);
                                        if (swVar2.getAdapter() != wyVar) {
                                            swVar2.setAdapter(wyVar);
                                        }
                                    }
                                }
                                z10 = false;
                                b0Var.h1(0, 0);
                            }
                            i17++;
                            i16 = i12;
                            z12 = z10;
                            qqVar3 = qqVar2;
                            i15 = 1;
                        }
                        qqVar = qqVar3;
                        i10 = i16;
                        rzVar.M(z12);
                    } else {
                        qqVar = qqVar3;
                        i10 = 2;
                    }
                    sy syVar2 = rzVar.f30363t1;
                    if (i14 == 1) {
                        i11 = i10;
                    } else {
                        i11 = 1;
                    }
                    syVar2.i(i11);
                    qqVar.requestFocus();
                    AndroidUtilities.showKeyboard(qqVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
