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
public final class oq extends EditTextBoldCursor {
    public final int f25883b;
    public final int f25884c;
    public final FrameLayout d;

    public oq(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.f25883b = i11;
        this.d = frameLayout;
        this.f25884c = i10;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.f25883b) {
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
        switch (this.f25883b) {
            case 1:
                super.invalidate();
                ((sq) this.d).E[this.f25884c - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        oq oqVar;
        int i10;
        char c10;
        ez ezVar;
        View view;
        s4.c0 c0Var;
        vl0 vl0Var;
        oq oqVar2;
        boolean z10;
        sy syVar;
        float f7;
        int i11 = this.f25883b;
        int i12 = this.f25884c;
        FrameLayout frameLayout = this.d;
        int i13 = 1;
        switch (i11) {
            case 0:
                sq sqVar = (sq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (sqVar.E[i12 + 1].isFocused()) {
                    AndroidUtilities.showKeyboard(sqVar.E[i12 + 1]);
                    return false;
                }
                sqVar.E[i12 + 1].requestFocus();
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
                oq oqVar3 = ezVar2.d;
                if (!oqVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i14 = 2;
                    if (!rzVar.f26858t1.z()) {
                        vl0 vl0Var2 = rzVar.D0;
                        vl0 vl0Var3 = rzVar.P;
                        wy wyVar = rzVar.f26826j0;
                        vl0 vl0Var4 = rzVar.f26820h0;
                        AnimatorSet animatorSet = rzVar.M0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            rzVar.M0 = null;
                        }
                        rzVar.I0 = false;
                        rzVar.f26846q0 = false;
                        rzVar.f26804c0 = false;
                        int i15 = 0;
                        while (i15 < 3) {
                            if (i15 == 0) {
                                ezVar = rzVar.V;
                                view = rzVar.I;
                                c10 = 0;
                                c0Var = rzVar.Q;
                                vl0Var = vl0Var3;
                            } else {
                                c10 = 0;
                                if (i15 == i13) {
                                    ezVar = rzVar.f26840o0;
                                    view = rzVar.f26843p0;
                                    c0Var = rzVar.f26823i0;
                                    vl0Var = vl0Var4;
                                } else {
                                    ezVar = rzVar.G0;
                                    view = rzVar.B0;
                                    c0Var = rzVar.E0;
                                    vl0Var = vl0Var2;
                                }
                            }
                            if (ezVar == null) {
                                oqVar2 = oqVar3;
                            } else if (ezVar2 == ezVar && (syVar = rzVar.f26858t1) != null && syVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                rzVar.M0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i15 != i14) {
                                    oqVar2 = oqVar3;
                                    float[] fArr = new float[1];
                                    fArr[c10] = -AndroidUtilities.dp(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[c10] = -AndroidUtilities.dp(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(vl0Var, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[c10] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ezVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[c10] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    oqVar2 = oqVar3;
                                    if (i15 == 2) {
                                        f7 = 0.0f;
                                    } else {
                                        f7 = -AndroidUtilities.dp(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[c10] = f7;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(vl0Var, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[c10] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ezVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[c10] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                rzVar.M0.setDuration(220L);
                                rzVar.M0.setInterpolator(wr.f28819f);
                                rzVar.M0.addListener(new bi.u3(22, rzVar, vl0Var));
                                rzVar.M0.start();
                            } else {
                                oqVar2 = oqVar3;
                                ezVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                if (view != null && i15 != 2) {
                                    view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                }
                                if (vl0Var == vl0Var2) {
                                    vl0Var.setPadding(0, 0, 0, rzVar.f26848q2);
                                } else if (vl0Var == vl0Var3) {
                                    vl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), rzVar.f26848q2);
                                } else if (vl0Var == vl0Var4) {
                                    vl0Var.setPadding(0, rzVar.f26801b1, 0, rzVar.f26848q2);
                                }
                                if (vl0Var == vl0Var4) {
                                    if (rzVar.f26837n0.f28868x.size() > 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    wyVar.K = z10;
                                    if (z10) {
                                        wyVar.G("", true);
                                        if (vl0Var4.getAdapter() != wyVar) {
                                            vl0Var4.setAdapter(wyVar);
                                        }
                                    }
                                }
                                c0Var.h1(0, 0);
                                i15++;
                                i13 = 1;
                                i14 = 2;
                                oqVar3 = oqVar2;
                            }
                            i15++;
                            i13 = 1;
                            i14 = 2;
                            oqVar3 = oqVar2;
                        }
                        oqVar = oqVar3;
                        rzVar.O(false);
                    } else {
                        oqVar = oqVar3;
                    }
                    sy syVar2 = rzVar.f26858t1;
                    if (i12 == 1) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    syVar2.i(i10);
                    oqVar.requestFocus();
                    AndroidUtilities.showKeyboard(oqVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
