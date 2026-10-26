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
public final class uq extends EditTextBoldCursor {
    public final int f33477b;
    public final int f33478c;
    public final FrameLayout d;

    public uq(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.f33477b = i11;
        this.d = frameLayout;
        this.f33478c = i10;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.f33477b) {
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
        switch (this.f33477b) {
            case 1:
                super.invalidate();
                ((yq) this.d).E[this.f33478c - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        uq uqVar;
        int i10;
        int i11;
        fz fzVar;
        View view;
        s4.c0 c0Var;
        uw uwVar;
        ?? r16;
        uq uqVar2;
        int i12;
        boolean z10;
        boolean z11;
        ty tyVar;
        float f7;
        int i13 = this.f33477b;
        int i14 = this.f33478c;
        FrameLayout frameLayout = this.d;
        int i15 = 1;
        boolean z12 = false;
        switch (i13) {
            case 0:
                yq yqVar = (yq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (yqVar.E[i14 + 1].isFocused()) {
                    AndroidUtilities.showKeyboard(yqVar.E[i14 + 1]);
                    return false;
                }
                yqVar.E[i14 + 1].requestFocus();
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
                fz fzVar2 = (fz) frameLayout;
                sz szVar = fzVar2.G;
                uq uqVar3 = fzVar2.d;
                if (!uqVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i16 = 2;
                    if (!szVar.f32772t1.z()) {
                        View view2 = szVar.D0;
                        View view3 = szVar.P;
                        xy xyVar = szVar.f32740j0;
                        uw uwVar2 = szVar.f32734h0;
                        AnimatorSet animatorSet = szVar.M0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            szVar.M0 = null;
                        }
                        szVar.I0 = false;
                        szVar.f32760q0 = false;
                        szVar.f32718c0 = false;
                        int i17 = 0;
                        while (i17 < 3) {
                            if (i17 == 0) {
                                fzVar = szVar.V;
                                view = szVar.I;
                                r16 = z12;
                                c0Var = szVar.Q;
                                uwVar = view3;
                            } else {
                                boolean z13 = z12;
                                if (i17 == i15) {
                                    fzVar = szVar.f32754o0;
                                    view = szVar.f32757p0;
                                    c0Var = szVar.f32737i0;
                                    uwVar = uwVar2;
                                    r16 = z13;
                                } else {
                                    fzVar = szVar.G0;
                                    view = szVar.B0;
                                    c0Var = szVar.E0;
                                    uwVar = view2;
                                    r16 = z13;
                                }
                            }
                            if (fzVar == null) {
                                uqVar2 = uqVar3;
                                i12 = i16;
                                z10 = r16;
                            } else if (fzVar2 == fzVar && (tyVar = szVar.f32772t1) != null && tyVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                szVar.M0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i17 != i16) {
                                    int i18 = i16;
                                    uqVar2 = uqVar3;
                                    float[] fArr = new float[1];
                                    fArr[r16] = -AndroidUtilities.dp(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[r16] = -AndroidUtilities.dp(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(uwVar, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[r16] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(fzVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[r16] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[i18] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    uqVar2 = uqVar3;
                                    if (i17 == i16) {
                                        f7 = 0.0f;
                                    } else {
                                        f7 = -AndroidUtilities.dp(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[r16] = f7;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(uwVar, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[r16] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(fzVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[r16] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                szVar.M0.setDuration(220L);
                                szVar.M0.setInterpolator(ds.f27586f);
                                szVar.M0.addListener(new bi.ce(25, szVar, uwVar));
                                szVar.M0.start();
                                z10 = r16;
                                i12 = 2;
                            } else {
                                uqVar2 = uqVar3;
                                fzVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                i12 = 2;
                                if (view != null && i17 != 2) {
                                    view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                }
                                if (uwVar == view2) {
                                    int i19 = r16;
                                    uwVar.setPadding(i19, i19, i19, szVar.f32762q2);
                                } else {
                                    int i20 = r16;
                                    if (uwVar == view3) {
                                        uwVar.setPadding(AndroidUtilities.dp(5.0f), i20, AndroidUtilities.dp(5.0f), szVar.f32762q2);
                                    } else if (uwVar == uwVar2) {
                                        uwVar.setPadding(i20, szVar.f32715b1, i20, szVar.f32762q2);
                                    }
                                }
                                if (uwVar == uwVar2) {
                                    if (szVar.f32751n0.f34854x.size() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    xyVar.K = z11;
                                    if (z11) {
                                        xyVar.G("", true);
                                        if (uwVar2.getAdapter() != xyVar) {
                                            uwVar2.setAdapter(xyVar);
                                        }
                                    }
                                }
                                z10 = false;
                                c0Var.h1(0, 0);
                            }
                            i17++;
                            i16 = i12;
                            z12 = z10;
                            uqVar3 = uqVar2;
                            i15 = 1;
                        }
                        uqVar = uqVar3;
                        i10 = i16;
                        szVar.M(z12);
                    } else {
                        uqVar = uqVar3;
                        i10 = 2;
                    }
                    ty tyVar2 = szVar.f32772t1;
                    if (i14 == 1) {
                        i11 = i10;
                    } else {
                        i11 = 1;
                    }
                    tyVar2.i(i11);
                    uqVar.requestFocus();
                    AndroidUtilities.showKeyboard(uqVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
