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
public final class iq extends EditTextBoldCursor {
    public final int f24984b;
    public final int f24985c;
    public final FrameLayout d;

    public iq(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.f24984b = i11;
        this.d = frameLayout;
        this.f24985c = i10;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.f24984b) {
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
        switch (this.f24984b) {
            case 1:
                super.invalidate();
                ((mq) this.d).E[this.f24985c - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        iq iqVar;
        int i10;
        char c10;
        xy xyVar;
        View view;
        s4.c0 c0Var;
        ml0 ml0Var;
        iq iqVar2;
        boolean z10;
        ky kyVar;
        float f7;
        int i11 = this.f24984b;
        int i12 = this.f24985c;
        FrameLayout frameLayout = this.d;
        int i13 = 1;
        switch (i11) {
            case 0:
                mq mqVar = (mq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (mqVar.E[i12 + 1].isFocused()) {
                    AndroidUtilities.showKeyboard(mqVar.E[i12 + 1]);
                    return false;
                }
                mqVar.E[i12 + 1].requestFocus();
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
                xy xyVar2 = (xy) frameLayout;
                kz kzVar = xyVar2.G;
                iq iqVar3 = xyVar2.d;
                if (!iqVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i14 = 2;
                    if (!kzVar.f25769t1.z()) {
                        ml0 ml0Var2 = kzVar.D0;
                        ml0 ml0Var3 = kzVar.P;
                        py pyVar = kzVar.f25737j0;
                        ml0 ml0Var4 = kzVar.f25731h0;
                        AnimatorSet animatorSet = kzVar.M0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            kzVar.M0 = null;
                        }
                        kzVar.I0 = false;
                        kzVar.f25757q0 = false;
                        kzVar.f25715c0 = false;
                        int i15 = 0;
                        while (i15 < 3) {
                            if (i15 == 0) {
                                xyVar = kzVar.V;
                                view = kzVar.I;
                                c10 = 0;
                                c0Var = kzVar.Q;
                                ml0Var = ml0Var3;
                            } else {
                                c10 = 0;
                                if (i15 == i13) {
                                    xyVar = kzVar.f25751o0;
                                    view = kzVar.f25754p0;
                                    c0Var = kzVar.f25734i0;
                                    ml0Var = ml0Var4;
                                } else {
                                    xyVar = kzVar.G0;
                                    view = kzVar.B0;
                                    c0Var = kzVar.E0;
                                    ml0Var = ml0Var2;
                                }
                            }
                            if (xyVar == null) {
                                iqVar2 = iqVar3;
                            } else if (xyVar2 == xyVar && (kyVar = kzVar.f25769t1) != null && kyVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                kzVar.M0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i15 != i14) {
                                    iqVar2 = iqVar3;
                                    float[] fArr = new float[1];
                                    fArr[c10] = -AndroidUtilities.dp(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[c10] = -AndroidUtilities.dp(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ml0Var, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[c10] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(xyVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[c10] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    iqVar2 = iqVar3;
                                    if (i15 == 2) {
                                        f7 = 0.0f;
                                    } else {
                                        f7 = -AndroidUtilities.dp(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[c10] = f7;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ml0Var, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[c10] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(xyVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[c10] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                kzVar.M0.setDuration(220L);
                                kzVar.M0.setInterpolator(qr.f27383f);
                                kzVar.M0.addListener(new ai.z(24, kzVar, ml0Var));
                                kzVar.M0.start();
                            } else {
                                iqVar2 = iqVar3;
                                xyVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                if (view != null && i15 != 2) {
                                    view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                }
                                if (ml0Var == ml0Var2) {
                                    ml0Var.setPadding(0, 0, 0, kzVar.f25756p2);
                                } else if (ml0Var == ml0Var3) {
                                    ml0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), kzVar.f25756p2);
                                } else if (ml0Var == ml0Var4) {
                                    ml0Var.setPadding(0, kzVar.f25712b1, 0, kzVar.f25756p2);
                                }
                                if (ml0Var == ml0Var4) {
                                    if (kzVar.f25748n0.f27160x.size() > 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    pyVar.K = z10;
                                    if (z10) {
                                        pyVar.G("", true);
                                        if (ml0Var4.getAdapter() != pyVar) {
                                            ml0Var4.setAdapter(pyVar);
                                        }
                                    }
                                }
                                c0Var.h1(0, 0);
                                i15++;
                                i13 = 1;
                                i14 = 2;
                                iqVar3 = iqVar2;
                            }
                            i15++;
                            i13 = 1;
                            i14 = 2;
                            iqVar3 = iqVar2;
                        }
                        iqVar = iqVar3;
                        kzVar.M(false);
                    } else {
                        iqVar = iqVar3;
                    }
                    ky kyVar2 = kzVar.f25769t1;
                    if (i12 == 1) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    kyVar2.i(i10);
                    iqVar.requestFocus();
                    AndroidUtilities.showKeyboard(iqVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
