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
public final class jq extends EditTextBoldCursor {
    public final int f25463b;
    public final int f25464c;
    public final FrameLayout d;

    public jq(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.f25463b = i11;
        this.d = frameLayout;
        this.f25464c = i10;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.f25463b) {
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
        switch (this.f25463b) {
            case 1:
                super.invalidate();
                ((nq) this.d).E[this.f25464c - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jq jqVar;
        int i10;
        char c10;
        yy yyVar;
        View view;
        s4.c0 c0Var;
        ow owVar;
        jq jqVar2;
        boolean z10;
        my myVar;
        float f7;
        int i11 = this.f25463b;
        int i12 = this.f25464c;
        FrameLayout frameLayout = this.d;
        int i13 = 1;
        switch (i11) {
            case 0:
                nq nqVar = (nq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (nqVar.E[i12 + 1].isFocused()) {
                    AndroidUtilities.showKeyboard(nqVar.E[i12 + 1]);
                    return false;
                }
                nqVar.E[i12 + 1].requestFocus();
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
                lz lzVar = yyVar2.G;
                jq jqVar3 = yyVar2.d;
                if (!jqVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i14 = 2;
                    if (!lzVar.f26282t1.z()) {
                        View view2 = lzVar.D0;
                        View view3 = lzVar.P;
                        qy qyVar = lzVar.f26250j0;
                        ow owVar2 = lzVar.f26244h0;
                        AnimatorSet animatorSet = lzVar.M0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            lzVar.M0 = null;
                        }
                        lzVar.I0 = false;
                        lzVar.f26270q0 = false;
                        lzVar.f26228c0 = false;
                        int i15 = 0;
                        while (i15 < 3) {
                            if (i15 == 0) {
                                yyVar = lzVar.V;
                                view = lzVar.I;
                                c10 = 0;
                                c0Var = lzVar.Q;
                                owVar = view3;
                            } else {
                                c10 = 0;
                                if (i15 == i13) {
                                    yyVar = lzVar.f26264o0;
                                    view = lzVar.f26267p0;
                                    c0Var = lzVar.f26247i0;
                                    owVar = owVar2;
                                } else {
                                    yyVar = lzVar.G0;
                                    view = lzVar.B0;
                                    c0Var = lzVar.E0;
                                    owVar = view2;
                                }
                            }
                            if (yyVar == null) {
                                jqVar2 = jqVar3;
                            } else if (yyVar2 == yyVar && (myVar = lzVar.f26282t1) != null && myVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                lzVar.M0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i15 != i14) {
                                    jqVar2 = jqVar3;
                                    float[] fArr = new float[1];
                                    fArr[c10] = -AndroidUtilities.dp(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[c10] = -AndroidUtilities.dp(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(owVar, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[c10] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(yyVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[c10] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    jqVar2 = jqVar3;
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
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(yyVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[c10] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                lzVar.M0.setDuration(220L);
                                lzVar.M0.setInterpolator(rr.f28022f);
                                lzVar.M0.addListener(new ai.z(24, lzVar, owVar));
                                lzVar.M0.start();
                            } else {
                                jqVar2 = jqVar3;
                                yyVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                if (view != null && i15 != 2) {
                                    view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                }
                                if (owVar == view2) {
                                    owVar.setPadding(0, 0, 0, lzVar.f26269p2);
                                } else if (owVar == view3) {
                                    owVar.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), lzVar.f26269p2);
                                } else if (owVar == owVar2) {
                                    owVar.setPadding(0, lzVar.f26225b1, 0, lzVar.f26269p2);
                                }
                                if (owVar == owVar2) {
                                    if (lzVar.f26261n0.f27782x.size() > 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    qyVar.K = z10;
                                    if (z10) {
                                        qyVar.G("", true);
                                        if (owVar2.getAdapter() != qyVar) {
                                            owVar2.setAdapter(qyVar);
                                        }
                                    }
                                }
                                c0Var.h1(0, 0);
                                i15++;
                                i13 = 1;
                                i14 = 2;
                                jqVar3 = jqVar2;
                            }
                            i15++;
                            i13 = 1;
                            i14 = 2;
                            jqVar3 = jqVar2;
                        }
                        jqVar = jqVar3;
                        lzVar.M(false);
                    } else {
                        jqVar = jqVar3;
                    }
                    my myVar2 = lzVar.f26282t1;
                    if (i12 == 1) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    myVar2.i(i10);
                    jqVar.requestFocus();
                    AndroidUtilities.showKeyboard(jqVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
