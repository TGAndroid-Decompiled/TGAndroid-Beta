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

public final class wp extends EditTextBoldCursor {

    public final int f34307b;

    public final int f34308c;
    public final FrameLayout d;

    public wp(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.f34307b = i11;
        this.d = frameLayout;
        this.f34308c = i10;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.f34307b) {
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
        switch (this.f34307b) {
            case 1:
                super.invalidate();
                ((aq) this.d).A[this.f34308c - 1].invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wp wpVar;
        char c10;
        ky kyVar;
        View view;
        f2.k0 k0Var;
        View view2;
        xx xxVar;
        int i10 = this.f34307b;
        int i11 = this.f34308c;
        FrameLayout frameLayout = this.d;
        int i12 = 1;
        switch (i10) {
            case 0:
                aq aqVar = (aq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (aqVar.A[i11 + 1].isFocused()) {
                    AndroidUtilities.showKeyboard(aqVar.A[i11 + 1]);
                    return false;
                }
                aqVar.A[i11 + 1].requestFocus();
                return false;
            case 1:
                if (getAlpha() == 1.0f) {
                    if (isFocused()) {
                        AndroidUtilities.showKeyboard(this);
                        return super.onTouchEvent(motionEvent);
                    }
                    requestFocus();
                }
                return false;
            default:
                ky kyVar2 = (ky) frameLayout;
                yy yyVar = kyVar2.C;
                wp wpVar2 = kyVar2.d;
                if (!wpVar2.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i13 = 2;
                    if (yyVar.f35025p1.z()) {
                        wpVar = wpVar2;
                    } else {
                        ew ewVar = yyVar.f35059z0;
                        ww wwVar = yyVar.L;
                        cy cyVar = yyVar.f34995f0;
                        yv yvVar = yyVar.f34987d0;
                        AnimatorSet animatorSet = yyVar.I0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            yyVar.I0 = null;
                        }
                        yyVar.E0 = false;
                        yyVar.m0 = false;
                        yyVar.V = false;
                        int i14 = 0;
                        while (i14 < 3) {
                            if (i14 == 0) {
                                kyVar = yyVar.R;
                                view = yyVar.E;
                                c10 = 0;
                                k0Var = yyVar.M;
                                view2 = wwVar;
                            } else {
                                c10 = 0;
                                if (i14 == i12) {
                                    kyVar = yyVar.f35010k0;
                                    view = yyVar.f35013l0;
                                    k0Var = yyVar.f34991e0;
                                    view2 = yvVar;
                                } else {
                                    kyVar = yyVar.C0;
                                    view = yyVar.f35052x0;
                                    k0Var = yyVar.A0;
                                    view2 = ewVar;
                                }
                            }
                            if (kyVar == null) {
                                wpVar2 = wpVar2;
                            } else {
                                if (kyVar2 == kyVar && (xxVar = yyVar.f35025p1) != null && xxVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    yyVar.I0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i14 == i13) {
                                        float[] fArr = new float[1];
                                        fArr[c10] = i14 == 2 ? 0.0f : -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[c10] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(kyVar, (Property<ky, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[c10] = objectAnimatorOfFloat;
                                        animatorArr[1] = objectAnimatorOfFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        float[] fArr3 = new float[1];
                                        fArr3[c10] = -AndroidUtilities.dp(40.0f);
                                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[c10] = -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[c10] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(kyVar, (Property<ky, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[c10] = objectAnimatorOfFloat3;
                                        animatorArr2[1] = objectAnimatorOfFloat4;
                                        animatorArr2[2] = objectAnimatorOfFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    yyVar.I0.setDuration(220L);
                                    yyVar.I0.setInterpolator(er.f28122f);
                                    yyVar.I0.addListener(new ag.x1(24, yyVar, view2));
                                    yyVar.I0.start();
                                } else {
                                    wpVar2 = wpVar2;
                                    kyVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                    if (view != null && i14 != 2) {
                                        view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                    }
                                    if (view2 == ewVar) {
                                        view2.setPadding(0, 0, 0, yyVar.f35016m2);
                                    } else if (view2 == wwVar) {
                                        view2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), yyVar.f35016m2);
                                    } else if (view2 == yvVar) {
                                        view2.setPadding(0, yyVar.X0, 0, yyVar.f35016m2);
                                    }
                                    if (view2 == yvVar) {
                                        boolean z10 = yyVar.f35007j0.f27569x.size() > 0;
                                        cyVar.G = z10;
                                        if (z10) {
                                            cyVar.G("", true);
                                            if (yvVar.getAdapter() != cyVar) {
                                                yvVar.setAdapter(cyVar);
                                            }
                                        }
                                    }
                                    k0Var.h1(0, 0);
                                }
                                i14++;
                                i12 = 1;
                                i13 = 2;
                                wpVar2 = wpVar2;
                            }
                            i14++;
                            i12 = 1;
                            i13 = 2;
                            wpVar2 = wpVar2;
                        }
                        wpVar = wpVar2;
                        yyVar.O(false);
                    }
                    yyVar.f35025p1.i(i11 == 1 ? 2 : 1);
                    wpVar.requestFocus();
                    AndroidUtilities.showKeyboard(wpVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
