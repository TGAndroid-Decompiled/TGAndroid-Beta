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
public final class zp extends EditTextBoldCursor {
    public final int M1;
    public final int N1;
    public final FrameLayout O1;

    public zp(FrameLayout frameLayout, Context context, int i7, int i10) {
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
                ((dq) this.O1).F[this.N1 - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        zp zpVar;
        int i7;
        int i10;
        yx yxVar;
        View view;
        v4.b0 b0Var;
        qv qvVar;
        ?? r16;
        zp zpVar2;
        int i11;
        boolean z10;
        boolean z11;
        mx mxVar;
        float f10;
        int i12 = this.M1;
        int i13 = this.N1;
        FrameLayout frameLayout = this.O1;
        int i14 = 1;
        boolean z12 = false;
        switch (i12) {
            case 0:
                dq dqVar = (dq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (dqVar.F[i13 + 1].isFocused()) {
                    org.telegram.messenger.g0.J3(dqVar.F[i13 + 1]);
                    return false;
                }
                dqVar.F[i13 + 1].requestFocus();
                return false;
            case 1:
                if (getAlpha() == 1.0f) {
                    if (!isFocused()) {
                        requestFocus();
                    } else {
                        org.telegram.messenger.g0.J3(this);
                        return super.onTouchEvent(motionEvent);
                    }
                }
                return false;
            default:
                yx yxVar2 = (yx) frameLayout;
                ly lyVar = yxVar2.H;
                zp zpVar3 = yxVar2.d;
                if (!zpVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i15 = 2;
                    if (!lyVar.f36993u1.z()) {
                        View view2 = lyVar.E0;
                        View view3 = lyVar.Q;
                        qx qxVar = lyVar.f36962k0;
                        qv qvVar2 = lyVar.f36956i0;
                        AnimatorSet animatorSet = lyVar.N0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            lyVar.N0 = null;
                        }
                        lyVar.J0 = false;
                        lyVar.f36982r0 = false;
                        lyVar.f36940d0 = false;
                        int i16 = 0;
                        while (i16 < 3) {
                            if (i16 == 0) {
                                yxVar = lyVar.W;
                                view = lyVar.J;
                                r16 = z12;
                                b0Var = lyVar.R;
                                qvVar = view3;
                            } else {
                                boolean z13 = z12;
                                if (i16 == i14) {
                                    yxVar = lyVar.f36975p0;
                                    view = lyVar.f36978q0;
                                    b0Var = lyVar.f36959j0;
                                    qvVar = qvVar2;
                                    r16 = z13;
                                } else {
                                    yxVar = lyVar.H0;
                                    view = lyVar.C0;
                                    b0Var = lyVar.F0;
                                    qvVar = view2;
                                    r16 = z13;
                                }
                            }
                            if (yxVar == null) {
                                zpVar2 = zpVar3;
                                i11 = i15;
                                z10 = r16;
                            } else if (yxVar2 == yxVar && (mxVar = lyVar.f36993u1) != null && mxVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                lyVar.N0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i16 != i15) {
                                    int i17 = i15;
                                    zpVar2 = zpVar3;
                                    float[] fArr = new float[1];
                                    fArr[r16] = -org.telegram.messenger.g0.L(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[r16] = -org.telegram.messenger.g0.L(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(qvVar, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[r16] = org.telegram.messenger.g0.L(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(yxVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[r16] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[i17] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    zpVar2 = zpVar3;
                                    if (i16 == i15) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = -org.telegram.messenger.g0.L(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[r16] = f10;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(qvVar, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[r16] = org.telegram.messenger.g0.L(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(yxVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[r16] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                lyVar.N0.setDuration(220L);
                                lyVar.N0.setInterpolator(er.f34419f);
                                lyVar.N0.addListener(new ah.l(27, lyVar, qvVar));
                                lyVar.N0.start();
                                z10 = r16;
                                i11 = 2;
                            } else {
                                zpVar2 = zpVar3;
                                yxVar.setTranslationY(org.telegram.messenger.g0.L(0.0f));
                                i11 = 2;
                                if (view != null && i16 != 2) {
                                    view.setTranslationY(-org.telegram.messenger.g0.L(40.0f));
                                }
                                if (qvVar == view2) {
                                    int i18 = r16;
                                    qvVar.setPadding(i18, i18, i18, lyVar.f36984r2);
                                } else {
                                    int i19 = r16;
                                    if (qvVar == view3) {
                                        qvVar.setPadding(org.telegram.messenger.g0.L(5.0f), i19, org.telegram.messenger.g0.L(5.0f), lyVar.f36984r2);
                                    } else if (qvVar == qvVar2) {
                                        qvVar.setPadding(i19, lyVar.f36938c1, i19, lyVar.f36984r2);
                                    }
                                }
                                if (qvVar == qvVar2) {
                                    if (lyVar.f36972o0.f38788y.size() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    qxVar.L = z11;
                                    if (z11) {
                                        qxVar.G("", true);
                                        if (qvVar2.getAdapter() != qxVar) {
                                            qvVar2.setAdapter(qxVar);
                                        }
                                    }
                                }
                                z10 = false;
                                b0Var.h1(0, 0);
                            }
                            i16++;
                            i15 = i11;
                            z12 = z10;
                            zpVar3 = zpVar2;
                            i14 = 1;
                        }
                        zpVar = zpVar3;
                        i7 = i15;
                        lyVar.N(z12);
                    } else {
                        zpVar = zpVar3;
                        i7 = 2;
                    }
                    mx mxVar2 = lyVar.f36993u1;
                    if (i13 == 1) {
                        i10 = i7;
                    } else {
                        i10 = 1;
                    }
                    mxVar2.i(i10);
                    zpVar.requestFocus();
                    org.telegram.messenger.g0.J3(zpVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
