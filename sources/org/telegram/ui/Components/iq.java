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
    public final int f27881b;
    public final int f27882c;
    public final FrameLayout d;

    public iq(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.f27881b = i11;
        this.d = frameLayout;
        this.f27882c = i10;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.f27881b) {
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
        switch (this.f27881b) {
            case 1:
                super.invalidate();
                ((mq) this.d).B[this.f27882c - 1].invalidate();
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
        char c3;
        yy yyVar;
        View view;
        f2.j0 j0Var;
        tl0 tl0Var;
        iq iqVar2;
        boolean z4;
        my myVar;
        float f10;
        int i11 = this.f27881b;
        int i12 = this.f27882c;
        FrameLayout frameLayout = this.d;
        int i13 = 1;
        switch (i11) {
            case 0:
                mq mqVar = (mq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (mqVar.B[i12 + 1].isFocused()) {
                    AndroidUtilities.showKeyboard(mqVar.B[i12 + 1]);
                    return false;
                }
                mqVar.B[i12 + 1].requestFocus();
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
                yy yyVar2 = (yy) frameLayout;
                mz mzVar = yyVar2.D;
                iq iqVar3 = yyVar2.d;
                if (!iqVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i14 = 2;
                    if (!mzVar.f29315q1.z()) {
                        tl0 tl0Var2 = mzVar.A0;
                        tl0 tl0Var3 = mzVar.M;
                        qy qyVar = mzVar.f29285g0;
                        tl0 tl0Var4 = mzVar.f29278e0;
                        AnimatorSet animatorSet = mzVar.J0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            mzVar.J0 = null;
                        }
                        mzVar.F0 = false;
                        mzVar.f29305n0 = false;
                        mzVar.W = false;
                        int i15 = 0;
                        while (i15 < 3) {
                            if (i15 == 0) {
                                yyVar = mzVar.S;
                                view = mzVar.F;
                                c3 = 0;
                                j0Var = mzVar.N;
                                tl0Var = tl0Var3;
                            } else {
                                c3 = 0;
                                if (i15 == i13) {
                                    yyVar = mzVar.f29300l0;
                                    view = mzVar.m0;
                                    j0Var = mzVar.f29282f0;
                                    tl0Var = tl0Var4;
                                } else {
                                    yyVar = mzVar.D0;
                                    view = mzVar.f29343y0;
                                    j0Var = mzVar.B0;
                                    tl0Var = tl0Var2;
                                }
                            }
                            if (yyVar == null) {
                                iqVar2 = iqVar3;
                            } else if (yyVar2 == yyVar && (myVar = mzVar.f29315q1) != null && myVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                mzVar.J0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i15 != i14) {
                                    iqVar2 = iqVar3;
                                    float[] fArr = new float[1];
                                    fArr[c3] = -AndroidUtilities.dp(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[c3] = -AndroidUtilities.dp(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tl0Var, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[c3] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(yyVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[c3] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    iqVar2 = iqVar3;
                                    if (i15 == 2) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = -AndroidUtilities.dp(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[c3] = f10;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tl0Var, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[c3] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(yyVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[c3] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                mzVar.J0.setDuration(220L);
                                mzVar.J0.setInterpolator(pr.f30183f);
                                mzVar.J0.addListener(new eg.w2(21, mzVar, tl0Var));
                                mzVar.J0.start();
                            } else {
                                iqVar2 = iqVar3;
                                yyVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                if (view != null && i15 != 2) {
                                    view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                }
                                if (tl0Var == tl0Var2) {
                                    tl0Var.setPadding(0, 0, 0, mzVar.f29307n2);
                                } else if (tl0Var == tl0Var3) {
                                    tl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), mzVar.f29307n2);
                                } else if (tl0Var == tl0Var4) {
                                    tl0Var.setPadding(0, mzVar.Y0, 0, mzVar.f29307n2);
                                }
                                if (tl0Var == tl0Var4) {
                                    if (mzVar.f29297k0.f30527x.size() > 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    qyVar.H = z4;
                                    if (z4) {
                                        qyVar.G("", true);
                                        if (tl0Var4.getAdapter() != qyVar) {
                                            tl0Var4.setAdapter(qyVar);
                                        }
                                    }
                                }
                                j0Var.h1(0, 0);
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
                        mzVar.O(false);
                    } else {
                        iqVar = iqVar3;
                    }
                    my myVar2 = mzVar.f29315q1;
                    if (i12 == 1) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    myVar2.i(i10);
                    iqVar.requestFocus();
                    AndroidUtilities.showKeyboard(iqVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
