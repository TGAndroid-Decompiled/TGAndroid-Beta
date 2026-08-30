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
public final class gq extends EditTextBoldCursor {
    public final int f25232b;
    public final int f25233c;
    public final FrameLayout d;

    public gq(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.f25232b = i11;
        this.d = frameLayout;
        this.f25233c = i10;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.f25232b) {
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
        switch (this.f25232b) {
            case 1:
                super.invalidate();
                ((kq) this.d).B[this.f25233c - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gq gqVar;
        int i10;
        char c3;
        wy wyVar;
        View view;
        f2.i0 i0Var;
        sl0 sl0Var;
        gq gqVar2;
        boolean z4;
        ky kyVar;
        float f10;
        int i11 = this.f25232b;
        int i12 = this.f25233c;
        FrameLayout frameLayout = this.d;
        int i13 = 1;
        switch (i11) {
            case 0:
                kq kqVar = (kq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (kqVar.B[i12 + 1].isFocused()) {
                    AndroidUtilities.showKeyboard(kqVar.B[i12 + 1]);
                    return false;
                }
                kqVar.B[i12 + 1].requestFocus();
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
                wy wyVar2 = (wy) frameLayout;
                kz kzVar = wyVar2.D;
                gq gqVar3 = wyVar2.d;
                if (!gqVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i14 = 2;
                    if (!kzVar.f26460q1.z()) {
                        sl0 sl0Var2 = kzVar.A0;
                        sl0 sl0Var3 = kzVar.M;
                        oy oyVar = kzVar.f26430g0;
                        sl0 sl0Var4 = kzVar.f26423e0;
                        AnimatorSet animatorSet = kzVar.J0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            kzVar.J0 = null;
                        }
                        kzVar.F0 = false;
                        kzVar.f26450n0 = false;
                        kzVar.W = false;
                        int i15 = 0;
                        while (i15 < 3) {
                            if (i15 == 0) {
                                wyVar = kzVar.S;
                                view = kzVar.F;
                                c3 = 0;
                                i0Var = kzVar.N;
                                sl0Var = sl0Var3;
                            } else {
                                c3 = 0;
                                if (i15 == i13) {
                                    wyVar = kzVar.f26445l0;
                                    view = kzVar.m0;
                                    i0Var = kzVar.f26427f0;
                                    sl0Var = sl0Var4;
                                } else {
                                    wyVar = kzVar.D0;
                                    view = kzVar.f26488y0;
                                    i0Var = kzVar.B0;
                                    sl0Var = sl0Var2;
                                }
                            }
                            if (wyVar == null) {
                                gqVar2 = gqVar3;
                            } else if (wyVar2 == wyVar && (kyVar = kzVar.f26460q1) != null && kyVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                kzVar.J0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i15 != i14) {
                                    gqVar2 = gqVar3;
                                    float[] fArr = new float[1];
                                    fArr[c3] = -AndroidUtilities.dp(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[c3] = -AndroidUtilities.dp(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(sl0Var, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[c3] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(wyVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[c3] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    gqVar2 = gqVar3;
                                    if (i15 == 2) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = -AndroidUtilities.dp(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[c3] = f10;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(sl0Var, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[c3] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(wyVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[c3] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                kzVar.J0.setDuration(220L);
                                kzVar.J0.setInterpolator(nr.f27346f);
                                kzVar.J0.addListener(new dg.y2(21, kzVar, sl0Var));
                                kzVar.J0.start();
                            } else {
                                gqVar2 = gqVar3;
                                wyVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                if (view != null && i15 != 2) {
                                    view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                }
                                if (sl0Var == sl0Var2) {
                                    sl0Var.setPadding(0, 0, 0, kzVar.f26452n2);
                                } else if (sl0Var == sl0Var3) {
                                    sl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), kzVar.f26452n2);
                                } else if (sl0Var == sl0Var4) {
                                    sl0Var.setPadding(0, kzVar.Y0, 0, kzVar.f26452n2);
                                }
                                if (sl0Var == sl0Var4) {
                                    if (kzVar.f26442k0.f27692x.size() > 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    oyVar.H = z4;
                                    if (z4) {
                                        oyVar.G("", true);
                                        if (sl0Var4.getAdapter() != oyVar) {
                                            sl0Var4.setAdapter(oyVar);
                                        }
                                    }
                                }
                                i0Var.h1(0, 0);
                                i15++;
                                i13 = 1;
                                i14 = 2;
                                gqVar3 = gqVar2;
                            }
                            i15++;
                            i13 = 1;
                            i14 = 2;
                            gqVar3 = gqVar2;
                        }
                        gqVar = gqVar3;
                        kzVar.O(false);
                    } else {
                        gqVar = gqVar3;
                    }
                    ky kyVar2 = kzVar.f26460q1;
                    if (i12 == 1) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    kyVar2.i(i10);
                    gqVar.requestFocus();
                    AndroidUtilities.showKeyboard(gqVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
