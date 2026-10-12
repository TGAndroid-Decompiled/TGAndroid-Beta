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
public final class vq extends EditTextBoldCursor {
    public final int f30624b;
    public final int f30625c;
    public final FrameLayout d;

    public vq(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.f30624b = i11;
        this.d = frameLayout;
        this.f30625c = i10;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.f30624b) {
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
        switch (this.f30624b) {
            case 1:
                super.invalidate();
                ((zq) this.d).E[this.f30625c - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        vq vqVar;
        int i10;
        int i11;
        iz izVar;
        View view;
        s4.b0 b0Var;
        yw ywVar;
        ?? r16;
        vq vqVar2;
        int i12;
        boolean z10;
        boolean z11;
        wy wyVar;
        float f7;
        int i13 = this.f30624b;
        int i14 = this.f30625c;
        FrameLayout frameLayout = this.d;
        int i15 = 1;
        boolean z12 = false;
        switch (i13) {
            case 0:
                zq zqVar = (zq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (zqVar.E[i14 + 1].isFocused()) {
                    AndroidUtilities.showKeyboard(zqVar.E[i14 + 1]);
                    return false;
                }
                zqVar.E[i14 + 1].requestFocus();
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
                iz izVar2 = (iz) frameLayout;
                wz wzVar = izVar2.G;
                vq vqVar3 = izVar2.d;
                if (!vqVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i16 = 2;
                    if (!wzVar.f31067t1.z()) {
                        View view2 = wzVar.D0;
                        View view3 = wzVar.P;
                        az azVar = wzVar.f31035j0;
                        yw ywVar2 = wzVar.f31029h0;
                        AnimatorSet animatorSet = wzVar.M0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            wzVar.M0 = null;
                        }
                        wzVar.I0 = false;
                        wzVar.f31055q0 = false;
                        wzVar.f31013c0 = false;
                        int i17 = 0;
                        while (i17 < 3) {
                            if (i17 == 0) {
                                izVar = wzVar.V;
                                view = wzVar.I;
                                r16 = z12;
                                b0Var = wzVar.Q;
                                ywVar = view3;
                            } else {
                                boolean z13 = z12;
                                if (i17 == i15) {
                                    izVar = wzVar.f31049o0;
                                    view = wzVar.f31052p0;
                                    b0Var = wzVar.f31032i0;
                                    ywVar = ywVar2;
                                    r16 = z13;
                                } else {
                                    izVar = wzVar.G0;
                                    view = wzVar.B0;
                                    b0Var = wzVar.E0;
                                    ywVar = view2;
                                    r16 = z13;
                                }
                            }
                            if (izVar == null) {
                                vqVar2 = vqVar3;
                                i12 = i16;
                                z10 = r16;
                            } else if (izVar2 == izVar && (wyVar = wzVar.f31067t1) != null && wyVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                wzVar.M0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i17 != i16) {
                                    int i18 = i16;
                                    vqVar2 = vqVar3;
                                    float[] fArr = new float[1];
                                    fArr[r16] = -AndroidUtilities.dp(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[r16] = -AndroidUtilities.dp(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ywVar, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[r16] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(izVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[r16] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[i18] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    vqVar2 = vqVar3;
                                    if (i17 == i16) {
                                        f7 = 0.0f;
                                    } else {
                                        f7 = -AndroidUtilities.dp(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[r16] = f7;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ywVar, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[r16] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(izVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[r16] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                wzVar.M0.setDuration(220L);
                                wzVar.M0.setInterpolator(es.f24771f);
                                wzVar.M0.addListener(new bi.t(24, wzVar, ywVar));
                                wzVar.M0.start();
                                z10 = r16;
                                i12 = 2;
                            } else {
                                vqVar2 = vqVar3;
                                izVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                i12 = 2;
                                if (view != null && i17 != 2) {
                                    view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                }
                                if (ywVar == view2) {
                                    int i19 = r16;
                                    ywVar.setPadding(i19, i19, i19, wzVar.f31054p2);
                                } else {
                                    int i20 = r16;
                                    if (ywVar == view3) {
                                        ywVar.setPadding(AndroidUtilities.dp(5.0f), i20, AndroidUtilities.dp(5.0f), wzVar.f31054p2);
                                    } else if (ywVar == ywVar2) {
                                        ywVar.setPadding(i20, wzVar.f31010b1, i20, wzVar.f31054p2);
                                    }
                                }
                                if (ywVar == ywVar2) {
                                    if (wzVar.f31046n0.f23645x.size() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    azVar.K = z11;
                                    if (z11) {
                                        azVar.G("", true);
                                        if (ywVar2.getAdapter() != azVar) {
                                            ywVar2.setAdapter(azVar);
                                        }
                                    }
                                }
                                z10 = false;
                                b0Var.h1(0, 0);
                            }
                            i17++;
                            i16 = i12;
                            z12 = z10;
                            vqVar3 = vqVar2;
                            i15 = 1;
                        }
                        vqVar = vqVar3;
                        i10 = i16;
                        wzVar.M(z12);
                    } else {
                        vqVar = vqVar3;
                        i10 = 2;
                    }
                    wy wyVar2 = wzVar.f31067t1;
                    if (i14 == 1) {
                        i11 = i10;
                    } else {
                        i11 = 1;
                    }
                    wyVar2.i(i11);
                    vqVar.requestFocus();
                    AndroidUtilities.showKeyboard(vqVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
