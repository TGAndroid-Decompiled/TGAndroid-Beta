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
public final class hq extends EditTextBoldCursor {
    public final int f26811b;
    public final int f26812c;
    public final FrameLayout d;

    public hq(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.f26811b = i11;
        this.d = frameLayout;
        this.f26812c = i10;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.f26811b) {
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
        switch (this.f26811b) {
            case 1:
                super.invalidate();
                ((lq) this.d).E[this.f26812c - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hq hqVar;
        int i10;
        char c10;
        xy xyVar;
        View view;
        s4.c0 c0Var;
        nw nwVar;
        hq hqVar2;
        boolean z10;
        ly lyVar;
        float f7;
        int i11 = this.f26811b;
        int i12 = this.f26812c;
        FrameLayout frameLayout = this.d;
        int i13 = 1;
        switch (i11) {
            case 0:
                lq lqVar = (lq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (lqVar.E[i12 + 1].isFocused()) {
                    AndroidUtilities.showKeyboard(lqVar.E[i12 + 1]);
                    return false;
                }
                lqVar.E[i12 + 1].requestFocus();
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
                hq hqVar3 = xyVar2.d;
                if (!hqVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i14 = 2;
                    if (!kzVar.f28013t1.z()) {
                        View view2 = kzVar.D0;
                        View view3 = kzVar.P;
                        py pyVar = kzVar.f27981j0;
                        nw nwVar2 = kzVar.f27975h0;
                        AnimatorSet animatorSet = kzVar.M0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            kzVar.M0 = null;
                        }
                        kzVar.I0 = false;
                        kzVar.f28001q0 = false;
                        kzVar.f27958c0 = false;
                        int i15 = 0;
                        while (i15 < 3) {
                            if (i15 == 0) {
                                xyVar = kzVar.V;
                                view = kzVar.I;
                                c10 = 0;
                                c0Var = kzVar.Q;
                                nwVar = view3;
                            } else {
                                c10 = 0;
                                if (i15 == i13) {
                                    xyVar = kzVar.f27995o0;
                                    view = kzVar.f27998p0;
                                    c0Var = kzVar.f27978i0;
                                    nwVar = nwVar2;
                                } else {
                                    xyVar = kzVar.G0;
                                    view = kzVar.B0;
                                    c0Var = kzVar.E0;
                                    nwVar = view2;
                                }
                            }
                            if (xyVar == null) {
                                hqVar2 = hqVar3;
                            } else if (xyVar2 == xyVar && (lyVar = kzVar.f28013t1) != null && lyVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                kzVar.M0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i15 != i14) {
                                    hqVar2 = hqVar3;
                                    float[] fArr = new float[1];
                                    fArr[c10] = -AndroidUtilities.dp(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[c10] = -AndroidUtilities.dp(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(nwVar, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[c10] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(xyVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[c10] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    hqVar2 = hqVar3;
                                    if (i15 == 2) {
                                        f7 = 0.0f;
                                    } else {
                                        f7 = -AndroidUtilities.dp(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[c10] = f7;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(nwVar, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[c10] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(xyVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[c10] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                kzVar.M0.setDuration(220L);
                                kzVar.M0.setInterpolator(pr.f29493f);
                                kzVar.M0.addListener(new bi.t(24, kzVar, nwVar));
                                kzVar.M0.start();
                            } else {
                                hqVar2 = hqVar3;
                                xyVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                if (view != null && i15 != 2) {
                                    view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                }
                                if (nwVar == view2) {
                                    nwVar.setPadding(0, 0, 0, kzVar.f28003q2);
                                } else if (nwVar == view3) {
                                    nwVar.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), kzVar.f28003q2);
                                } else if (nwVar == nwVar2) {
                                    nwVar.setPadding(0, kzVar.f27955b1, 0, kzVar.f28003q2);
                                }
                                if (nwVar == nwVar2) {
                                    if (kzVar.f27992n0.f29545x.size() > 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    pyVar.K = z10;
                                    if (z10) {
                                        pyVar.G("", true);
                                        if (nwVar2.getAdapter() != pyVar) {
                                            nwVar2.setAdapter(pyVar);
                                        }
                                    }
                                }
                                c0Var.h1(0, 0);
                                i15++;
                                i13 = 1;
                                i14 = 2;
                                hqVar3 = hqVar2;
                            }
                            i15++;
                            i13 = 1;
                            i14 = 2;
                            hqVar3 = hqVar2;
                        }
                        hqVar = hqVar3;
                        kzVar.O(false);
                    } else {
                        hqVar = hqVar3;
                    }
                    ly lyVar2 = kzVar.f28013t1;
                    if (i12 == 1) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    lyVar2.i(i10);
                    hqVar.requestFocus();
                    AndroidUtilities.showKeyboard(hqVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
