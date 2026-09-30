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
public final class lq extends EditTextBoldCursor {
    public final int f26084b;
    public final int f26085c;
    public final FrameLayout d;

    public lq(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.f26084b = i11;
        this.d = frameLayout;
        this.f26085c = i10;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.f26084b) {
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
        switch (this.f26084b) {
            case 1:
                super.invalidate();
                ((pq) this.d).E[this.f26085c - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        lq lqVar;
        int i10;
        char c10;
        az azVar;
        View view;
        s4.c0 c0Var;
        pw pwVar;
        lq lqVar2;
        boolean z10;
        oy oyVar;
        float f7;
        int i11 = this.f26084b;
        int i12 = this.f26085c;
        FrameLayout frameLayout = this.d;
        int i13 = 1;
        switch (i11) {
            case 0:
                pq pqVar = (pq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (pqVar.E[i12 + 1].isFocused()) {
                    AndroidUtilities.showKeyboard(pqVar.E[i12 + 1]);
                    return false;
                }
                pqVar.E[i12 + 1].requestFocus();
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
                az azVar2 = (az) frameLayout;
                nz nzVar = azVar2.G;
                lq lqVar3 = azVar2.d;
                if (!lqVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i14 = 2;
                    if (!nzVar.f26871t1.z()) {
                        View view2 = nzVar.D0;
                        View view3 = nzVar.P;
                        sy syVar = nzVar.f26839j0;
                        pw pwVar2 = nzVar.f26833h0;
                        AnimatorSet animatorSet = nzVar.M0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            nzVar.M0 = null;
                        }
                        nzVar.I0 = false;
                        nzVar.f26859q0 = false;
                        nzVar.f26817c0 = false;
                        int i15 = 0;
                        while (i15 < 3) {
                            if (i15 == 0) {
                                azVar = nzVar.V;
                                view = nzVar.I;
                                c10 = 0;
                                c0Var = nzVar.Q;
                                pwVar = view3;
                            } else {
                                c10 = 0;
                                if (i15 == i13) {
                                    azVar = nzVar.f26853o0;
                                    view = nzVar.f26856p0;
                                    c0Var = nzVar.f26836i0;
                                    pwVar = pwVar2;
                                } else {
                                    azVar = nzVar.G0;
                                    view = nzVar.B0;
                                    c0Var = nzVar.E0;
                                    pwVar = view2;
                                }
                            }
                            if (azVar == null) {
                                lqVar2 = lqVar3;
                            } else if (azVar2 == azVar && (oyVar = nzVar.f26871t1) != null && oyVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                nzVar.M0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i15 != i14) {
                                    lqVar2 = lqVar3;
                                    float[] fArr = new float[1];
                                    fArr[c10] = -AndroidUtilities.dp(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[c10] = -AndroidUtilities.dp(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pwVar, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[c10] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(azVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[c10] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    lqVar2 = lqVar3;
                                    if (i15 == 2) {
                                        f7 = 0.0f;
                                    } else {
                                        f7 = -AndroidUtilities.dp(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[c10] = f7;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(pwVar, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[c10] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(azVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[c10] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                nzVar.M0.setDuration(220L);
                                nzVar.M0.setInterpolator(tr.f28636f);
                                nzVar.M0.addListener(new ai.z(24, nzVar, pwVar));
                                nzVar.M0.start();
                            } else {
                                lqVar2 = lqVar3;
                                azVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                if (view != null && i15 != 2) {
                                    view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                }
                                if (pwVar == view2) {
                                    pwVar.setPadding(0, 0, 0, nzVar.f26858p2);
                                } else if (pwVar == view3) {
                                    pwVar.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), nzVar.f26858p2);
                                } else if (pwVar == pwVar2) {
                                    pwVar.setPadding(0, nzVar.f26814b1, 0, nzVar.f26858p2);
                                }
                                if (pwVar == pwVar2) {
                                    if (nzVar.f26850n0.f28368x.size() > 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    syVar.K = z10;
                                    if (z10) {
                                        syVar.G("", true);
                                        if (pwVar2.getAdapter() != syVar) {
                                            pwVar2.setAdapter(syVar);
                                        }
                                    }
                                }
                                c0Var.h1(0, 0);
                                i15++;
                                i13 = 1;
                                i14 = 2;
                                lqVar3 = lqVar2;
                            }
                            i15++;
                            i13 = 1;
                            i14 = 2;
                            lqVar3 = lqVar2;
                        }
                        lqVar = lqVar3;
                        nzVar.M(false);
                    } else {
                        lqVar = lqVar3;
                    }
                    oy oyVar2 = nzVar.f26871t1;
                    if (i12 == 1) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    oyVar2.i(i10);
                    lqVar.requestFocus();
                    AndroidUtilities.showKeyboard(lqVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
