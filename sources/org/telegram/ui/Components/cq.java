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
public final class cq extends EditTextBoldCursor {
    public final int f27550b;
    public final int f27551c;
    public final FrameLayout d;

    public cq(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.f27550b = i11;
        this.d = frameLayout;
        this.f27551c = i10;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.f27550b) {
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
        switch (this.f27550b) {
            case 1:
                super.invalidate();
                ((gq) this.d).A[this.f27551c - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cq cqVar;
        int i10;
        char c3;
        ry ryVar;
        View view;
        f2.j0 j0Var;
        fw fwVar;
        cq cqVar2;
        boolean z10;
        fy fyVar;
        float f9;
        int i11 = this.f27550b;
        int i12 = this.f27551c;
        FrameLayout frameLayout = this.d;
        int i13 = 1;
        switch (i11) {
            case 0:
                gq gqVar = (gq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (gqVar.A[i12 + 1].isFocused()) {
                    AndroidUtilities.showKeyboard(gqVar.A[i12 + 1]);
                    return false;
                }
                gqVar.A[i12 + 1].requestFocus();
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
                ry ryVar2 = (ry) frameLayout;
                fz fzVar = ryVar2.C;
                cq cqVar3 = ryVar2.d;
                if (!cqVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i14 = 2;
                    if (!fzVar.f28623p1.z()) {
                        View view2 = fzVar.f28657z0;
                        View view3 = fzVar.L;
                        jy jyVar = fzVar.f28593f0;
                        fw fwVar2 = fzVar.f28585d0;
                        AnimatorSet animatorSet = fzVar.I0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            fzVar.I0 = null;
                        }
                        fzVar.E0 = false;
                        fzVar.m0 = false;
                        fzVar.V = false;
                        int i15 = 0;
                        while (i15 < 3) {
                            if (i15 == 0) {
                                ryVar = fzVar.R;
                                view = fzVar.E;
                                c3 = 0;
                                j0Var = fzVar.M;
                                fwVar = view3;
                            } else {
                                c3 = 0;
                                if (i15 == i13) {
                                    ryVar = fzVar.f28608k0;
                                    view = fzVar.f28611l0;
                                    j0Var = fzVar.f28589e0;
                                    fwVar = fwVar2;
                                } else {
                                    ryVar = fzVar.C0;
                                    view = fzVar.f28650x0;
                                    j0Var = fzVar.A0;
                                    fwVar = view2;
                                }
                            }
                            if (ryVar == null) {
                                cqVar2 = cqVar3;
                            } else if (ryVar2 == ryVar && (fyVar = fzVar.f28623p1) != null && fyVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                fzVar.I0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i15 != i14) {
                                    cqVar2 = cqVar3;
                                    float[] fArr = new float[1];
                                    fArr[c3] = -AndroidUtilities.dp(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[c3] = -AndroidUtilities.dp(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fwVar, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[c3] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ryVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[c3] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    cqVar2 = cqVar3;
                                    if (i15 == 2) {
                                        f9 = 0.0f;
                                    } else {
                                        f9 = -AndroidUtilities.dp(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[c3] = f9;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(fwVar, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[c3] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ryVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[c3] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                fzVar.I0.setDuration(220L);
                                fzVar.I0.setInterpolator(jr.f29800f);
                                fzVar.I0.addListener(new bg.c3(25, fzVar, fwVar));
                                fzVar.I0.start();
                            } else {
                                cqVar2 = cqVar3;
                                ryVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                if (view != null && i15 != 2) {
                                    view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                }
                                if (fwVar == view2) {
                                    fwVar.setPadding(0, 0, 0, fzVar.f28614m2);
                                } else if (fwVar == view3) {
                                    fwVar.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), fzVar.f28614m2);
                                } else if (fwVar == fwVar2) {
                                    fwVar.setPadding(0, fzVar.X0, 0, fzVar.f28614m2);
                                }
                                if (fwVar == fwVar2) {
                                    if (fzVar.f28605j0.f29852x.size() > 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    jyVar.G = z10;
                                    if (z10) {
                                        jyVar.G("", true);
                                        if (fwVar2.getAdapter() != jyVar) {
                                            fwVar2.setAdapter(jyVar);
                                        }
                                    }
                                }
                                j0Var.h1(0, 0);
                                i15++;
                                i13 = 1;
                                i14 = 2;
                                cqVar3 = cqVar2;
                            }
                            i15++;
                            i13 = 1;
                            i14 = 2;
                            cqVar3 = cqVar2;
                        }
                        cqVar = cqVar3;
                        fzVar.O(false);
                    } else {
                        cqVar = cqVar3;
                    }
                    fy fyVar2 = fzVar.f28623p1;
                    if (i12 == 1) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    fyVar2.i(i10);
                    cqVar.requestFocus();
                    AndroidUtilities.showKeyboard(cqVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
