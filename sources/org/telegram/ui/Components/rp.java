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
public final class rp extends EditTextBoldCursor {
    public final int H1;
    public final int I1;
    public final FrameLayout J1;

    public rp(FrameLayout frameLayout, Context context, int i3, int i10) {
        super(context);
        this.H1 = i10;
        this.J1 = frameLayout;
        this.I1 = i3;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.H1) {
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
        switch (this.H1) {
            case 1:
                super.invalidate();
                ((vp) this.J1).F[this.I1 - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rp rpVar;
        int i3;
        int i10;
        rx rxVar;
        View view;
        u4.b0 b0Var;
        tj0 tj0Var;
        ?? r16;
        rp rpVar2;
        int i11;
        boolean z10;
        boolean z11;
        fx fxVar;
        float f10;
        int i12 = this.H1;
        int i13 = this.I1;
        FrameLayout frameLayout = this.J1;
        int i14 = 1;
        boolean z12 = false;
        switch (i12) {
            case 0:
                vp vpVar = (vp) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (vpVar.F[i13 + 1].isFocused()) {
                    org.telegram.messenger.g0.K3(vpVar.F[i13 + 1]);
                    return false;
                }
                vpVar.F[i13 + 1].requestFocus();
                return false;
            case 1:
                if (getAlpha() == 1.0f) {
                    if (!isFocused()) {
                        requestFocus();
                    } else {
                        org.telegram.messenger.g0.K3(this);
                        return super.onTouchEvent(motionEvent);
                    }
                }
                return false;
            default:
                rx rxVar2 = (rx) frameLayout;
                ey eyVar = rxVar2.H;
                rp rpVar3 = rxVar2.d;
                if (!rpVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i15 = 2;
                    if (!eyVar.f33582u1.z()) {
                        tj0 tj0Var2 = eyVar.E0;
                        tj0 tj0Var3 = eyVar.Q;
                        jx jxVar = eyVar.f33551k0;
                        tj0 tj0Var4 = eyVar.f33545i0;
                        AnimatorSet animatorSet = eyVar.N0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            eyVar.N0 = null;
                        }
                        eyVar.J0 = false;
                        eyVar.f33571r0 = false;
                        eyVar.f33528d0 = false;
                        int i16 = 0;
                        while (i16 < 3) {
                            if (i16 == 0) {
                                rxVar = eyVar.W;
                                view = eyVar.J;
                                r16 = z12;
                                b0Var = eyVar.R;
                                tj0Var = tj0Var3;
                            } else {
                                boolean z13 = z12;
                                if (i16 == i14) {
                                    rxVar = eyVar.f33564p0;
                                    view = eyVar.f33567q0;
                                    b0Var = eyVar.f33548j0;
                                    tj0Var = tj0Var4;
                                    r16 = z13;
                                } else {
                                    rxVar = eyVar.H0;
                                    view = eyVar.C0;
                                    b0Var = eyVar.F0;
                                    tj0Var = tj0Var2;
                                    r16 = z13;
                                }
                            }
                            if (rxVar == null) {
                                rpVar2 = rpVar3;
                                i11 = i15;
                                z10 = r16;
                            } else if (rxVar2 == rxVar && (fxVar = eyVar.f33582u1) != null && fxVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                eyVar.N0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i16 != i15) {
                                    int i17 = i15;
                                    rpVar2 = rpVar3;
                                    float[] fArr = new float[1];
                                    fArr[r16] = -org.telegram.messenger.g0.L(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[r16] = -org.telegram.messenger.g0.L(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tj0Var, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[r16] = org.telegram.messenger.g0.L(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(rxVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[r16] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[i17] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    rpVar2 = rpVar3;
                                    if (i16 == i15) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = -org.telegram.messenger.g0.L(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[r16] = f10;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tj0Var, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[r16] = org.telegram.messenger.g0.L(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(rxVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[r16] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                eyVar.N0.setDuration(220L);
                                eyVar.N0.setInterpolator(xq.f40452f);
                                eyVar.N0.addListener(new bh.j(26, eyVar, tj0Var));
                                eyVar.N0.start();
                                z10 = r16;
                                i11 = 2;
                            } else {
                                rpVar2 = rpVar3;
                                rxVar.setTranslationY(org.telegram.messenger.g0.L(0.0f));
                                i11 = 2;
                                if (view != null && i16 != 2) {
                                    view.setTranslationY(-org.telegram.messenger.g0.L(40.0f));
                                }
                                if (tj0Var == tj0Var2) {
                                    int i18 = r16;
                                    tj0Var.setPadding(i18, i18, i18, eyVar.f33573r2);
                                } else {
                                    int i19 = r16;
                                    if (tj0Var == tj0Var3) {
                                        tj0Var.setPadding(org.telegram.messenger.g0.L(5.0f), i19, org.telegram.messenger.g0.L(5.0f), eyVar.f33573r2);
                                    } else if (tj0Var == tj0Var4) {
                                        tj0Var.setPadding(i19, eyVar.f33527c1, i19, eyVar.f33573r2);
                                    }
                                }
                                if (tj0Var == tj0Var4) {
                                    if (eyVar.f33561o0.f35214y.size() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    jxVar.L = z11;
                                    if (z11) {
                                        jxVar.G("", true);
                                        if (tj0Var4.getAdapter() != jxVar) {
                                            tj0Var4.setAdapter(jxVar);
                                        }
                                    }
                                }
                                z10 = false;
                                b0Var.h1(0, 0);
                            }
                            i16++;
                            i15 = i11;
                            z12 = z10;
                            rpVar3 = rpVar2;
                            i14 = 1;
                        }
                        rpVar = rpVar3;
                        i3 = i15;
                        eyVar.M(z12);
                    } else {
                        rpVar = rpVar3;
                        i3 = 2;
                    }
                    fx fxVar2 = eyVar.f33582u1;
                    if (i13 == 1) {
                        i10 = i3;
                    } else {
                        i10 = 1;
                    }
                    fxVar2.i(i10);
                    rpVar.requestFocus();
                    org.telegram.messenger.g0.K3(rpVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
