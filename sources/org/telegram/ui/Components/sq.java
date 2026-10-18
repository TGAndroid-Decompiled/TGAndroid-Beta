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
public final class sq extends EditTextBoldCursor {
    public final int f30318b;
    public final int f30319c;
    public final FrameLayout d;

    public sq(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.f30318b = i11;
        this.d = frameLayout;
        this.f30319c = i10;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.f30318b) {
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
        switch (this.f30318b) {
            case 1:
                super.invalidate();
                ((wq) this.d).E[this.f30319c - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        sq sqVar;
        int i10;
        int i11;
        gz gzVar;
        View view;
        s4.b0 b0Var;
        uw uwVar;
        ?? r16;
        sq sqVar2;
        int i12;
        boolean z10;
        boolean z11;
        uy uyVar;
        float f7;
        int i13 = this.f30318b;
        int i14 = this.f30319c;
        FrameLayout frameLayout = this.d;
        int i15 = 1;
        boolean z12 = false;
        switch (i13) {
            case 0:
                wq wqVar = (wq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (wqVar.E[i14 + 1].isFocused()) {
                    AndroidUtilities.showKeyboard(wqVar.E[i14 + 1]);
                    return false;
                }
                wqVar.E[i14 + 1].requestFocus();
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
                gz gzVar2 = (gz) frameLayout;
                tz tzVar = gzVar2.G;
                sq sqVar3 = gzVar2.d;
                if (!sqVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i16 = 2;
                    if (!tzVar.f30807t1.z()) {
                        View view2 = tzVar.D0;
                        View view3 = tzVar.P;
                        yy yyVar = tzVar.f30775j0;
                        uw uwVar2 = tzVar.f30769h0;
                        AnimatorSet animatorSet = tzVar.M0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            tzVar.M0 = null;
                        }
                        tzVar.I0 = false;
                        tzVar.f30795q0 = false;
                        tzVar.f30753c0 = false;
                        int i17 = 0;
                        while (i17 < 3) {
                            if (i17 == 0) {
                                gzVar = tzVar.V;
                                view = tzVar.I;
                                r16 = z12;
                                b0Var = tzVar.Q;
                                uwVar = view3;
                            } else {
                                boolean z13 = z12;
                                if (i17 == i15) {
                                    gzVar = tzVar.f30789o0;
                                    view = tzVar.f30792p0;
                                    b0Var = tzVar.f30772i0;
                                    uwVar = uwVar2;
                                    r16 = z13;
                                } else {
                                    gzVar = tzVar.G0;
                                    view = tzVar.B0;
                                    b0Var = tzVar.E0;
                                    uwVar = view2;
                                    r16 = z13;
                                }
                            }
                            if (gzVar == null) {
                                sqVar2 = sqVar3;
                                i12 = i16;
                                z10 = r16;
                            } else if (gzVar2 == gzVar && (uyVar = tzVar.f30807t1) != null && uyVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                tzVar.M0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i17 != i16) {
                                    int i18 = i16;
                                    sqVar2 = sqVar3;
                                    float[] fArr = new float[1];
                                    fArr[r16] = -AndroidUtilities.dp(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[r16] = -AndroidUtilities.dp(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(uwVar, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[r16] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(gzVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[r16] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[i18] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    sqVar2 = sqVar3;
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
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(gzVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[r16] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                tzVar.M0.setDuration(220L);
                                tzVar.M0.setInterpolator(bs.f25037f);
                                tzVar.M0.addListener(new ai.me(25, tzVar, uwVar));
                                tzVar.M0.start();
                                z10 = r16;
                                i12 = 2;
                            } else {
                                sqVar2 = sqVar3;
                                gzVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                i12 = 2;
                                if (view != null && i17 != 2) {
                                    view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                }
                                if (uwVar == view2) {
                                    int i19 = r16;
                                    uwVar.setPadding(i19, i19, i19, tzVar.f30794p2);
                                } else {
                                    int i20 = r16;
                                    if (uwVar == view3) {
                                        uwVar.setPadding(AndroidUtilities.dp(5.0f), i20, AndroidUtilities.dp(5.0f), tzVar.f30794p2);
                                    } else if (uwVar == uwVar2) {
                                        uwVar.setPadding(i20, tzVar.f30750b1, i20, tzVar.f30794p2);
                                    }
                                }
                                if (uwVar == uwVar2) {
                                    if (tzVar.f30786n0.f32785x.size() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    yyVar.K = z11;
                                    if (z11) {
                                        yyVar.G("", true);
                                        if (uwVar2.getAdapter() != yyVar) {
                                            uwVar2.setAdapter(yyVar);
                                        }
                                    }
                                }
                                z10 = false;
                                b0Var.h1(0, 0);
                            }
                            i17++;
                            i16 = i12;
                            z12 = z10;
                            sqVar3 = sqVar2;
                            i15 = 1;
                        }
                        sqVar = sqVar3;
                        i10 = i16;
                        tzVar.M(z12);
                    } else {
                        sqVar = sqVar3;
                        i10 = 2;
                    }
                    uy uyVar2 = tzVar.f30807t1;
                    if (i14 == 1) {
                        i11 = i10;
                    } else {
                        i11 = 1;
                    }
                    uyVar2.i(i11);
                    sqVar.requestFocus();
                    AndroidUtilities.showKeyboard(sqVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
