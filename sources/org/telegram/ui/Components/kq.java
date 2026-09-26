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
public final class kq extends EditTextBoldCursor {
    public final int f25776b;
    public final int f25777c;
    public final FrameLayout d;

    public kq(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.f25776b = i11;
        this.d = frameLayout;
        this.f25777c = i10;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.f25776b) {
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
        switch (this.f25776b) {
            case 1:
                super.invalidate();
                ((oq) this.d).E[this.f25777c - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        kq kqVar;
        int i10;
        char c10;
        zy zyVar;
        View view;
        s4.c0 c0Var;
        ow owVar;
        kq kqVar2;
        boolean z10;
        ny nyVar;
        float f7;
        int i11 = this.f25776b;
        int i12 = this.f25777c;
        FrameLayout frameLayout = this.d;
        int i13 = 1;
        switch (i11) {
            case 0:
                oq oqVar = (oq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (oqVar.E[i12 + 1].isFocused()) {
                    AndroidUtilities.showKeyboard(oqVar.E[i12 + 1]);
                    return false;
                }
                oqVar.E[i12 + 1].requestFocus();
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
                zy zyVar2 = (zy) frameLayout;
                mz mzVar = zyVar2.G;
                kq kqVar3 = zyVar2.d;
                if (!kqVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i14 = 2;
                    if (!mzVar.f26601t1.z()) {
                        View view2 = mzVar.D0;
                        View view3 = mzVar.P;
                        ry ryVar = mzVar.f26569j0;
                        ow owVar2 = mzVar.f26563h0;
                        AnimatorSet animatorSet = mzVar.M0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            mzVar.M0 = null;
                        }
                        mzVar.I0 = false;
                        mzVar.f26589q0 = false;
                        mzVar.f26547c0 = false;
                        int i15 = 0;
                        while (i15 < 3) {
                            if (i15 == 0) {
                                zyVar = mzVar.V;
                                view = mzVar.I;
                                c10 = 0;
                                c0Var = mzVar.Q;
                                owVar = view3;
                            } else {
                                c10 = 0;
                                if (i15 == i13) {
                                    zyVar = mzVar.f26583o0;
                                    view = mzVar.f26586p0;
                                    c0Var = mzVar.f26566i0;
                                    owVar = owVar2;
                                } else {
                                    zyVar = mzVar.G0;
                                    view = mzVar.B0;
                                    c0Var = mzVar.E0;
                                    owVar = view2;
                                }
                            }
                            if (zyVar == null) {
                                kqVar2 = kqVar3;
                            } else if (zyVar2 == zyVar && (nyVar = mzVar.f26601t1) != null && nyVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                mzVar.M0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i15 != i14) {
                                    kqVar2 = kqVar3;
                                    float[] fArr = new float[1];
                                    fArr[c10] = -AndroidUtilities.dp(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[c10] = -AndroidUtilities.dp(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(owVar, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[c10] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(zyVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[c10] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    kqVar2 = kqVar3;
                                    if (i15 == 2) {
                                        f7 = 0.0f;
                                    } else {
                                        f7 = -AndroidUtilities.dp(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[c10] = f7;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(owVar, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[c10] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(zyVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[c10] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                mzVar.M0.setDuration(220L);
                                mzVar.M0.setInterpolator(sr.f28339f);
                                mzVar.M0.addListener(new ai.z(24, mzVar, owVar));
                                mzVar.M0.start();
                            } else {
                                kqVar2 = kqVar3;
                                zyVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                if (view != null && i15 != 2) {
                                    view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                }
                                if (owVar == view2) {
                                    owVar.setPadding(0, 0, 0, mzVar.f26588p2);
                                } else if (owVar == view3) {
                                    owVar.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), mzVar.f26588p2);
                                } else if (owVar == owVar2) {
                                    owVar.setPadding(0, mzVar.f26544b1, 0, mzVar.f26588p2);
                                }
                                if (owVar == owVar2) {
                                    if (mzVar.f26580n0.f28086x.size() > 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    ryVar.K = z10;
                                    if (z10) {
                                        ryVar.G("", true);
                                        if (owVar2.getAdapter() != ryVar) {
                                            owVar2.setAdapter(ryVar);
                                        }
                                    }
                                }
                                c0Var.h1(0, 0);
                                i15++;
                                i13 = 1;
                                i14 = 2;
                                kqVar3 = kqVar2;
                            }
                            i15++;
                            i13 = 1;
                            i14 = 2;
                            kqVar3 = kqVar2;
                        }
                        kqVar = kqVar3;
                        mzVar.M(false);
                    } else {
                        kqVar = kqVar3;
                    }
                    ny nyVar2 = mzVar.f26601t1;
                    if (i12 == 1) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    nyVar2.i(i10);
                    kqVar.requestFocus();
                    AndroidUtilities.showKeyboard(kqVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
