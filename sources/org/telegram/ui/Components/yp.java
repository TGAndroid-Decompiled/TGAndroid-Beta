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
public final class yp extends EditTextBoldCursor {
    public final int f35046b;
    public final int f35047c;
    public final FrameLayout d;

    public yp(FrameLayout frameLayout, Context context, int i9, int i10) {
        super(context);
        this.f35046b = i10;
        this.d = frameLayout;
        this.f35047c = i9;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.f35046b) {
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
        switch (this.f35046b) {
            case 1:
                super.invalidate();
                ((cq) this.d).A[this.f35047c - 1].invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yp ypVar;
        int i9;
        char c10;
        jy jyVar;
        View view;
        f2.m0 m0Var;
        zv zvVar;
        yp ypVar2;
        boolean z10;
        wx wxVar;
        float f10;
        int i10 = this.f35046b;
        int i11 = this.f35047c;
        FrameLayout frameLayout = this.d;
        int i12 = 1;
        switch (i10) {
            case 0:
                cq cqVar = (cq) frameLayout;
                if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                    return false;
                }
                if (cqVar.A[i11 + 1].isFocused()) {
                    AndroidUtilities.showKeyboard(cqVar.A[i11 + 1]);
                    return false;
                }
                cqVar.A[i11 + 1].requestFocus();
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
                jy jyVar2 = (jy) frameLayout;
                wy wyVar = jyVar2.C;
                yp ypVar3 = jyVar2.d;
                if (!ypVar3.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    int i13 = 2;
                    if (!wyVar.f34432p1.z()) {
                        View view2 = wyVar.f34466z0;
                        View view3 = wyVar.L;
                        ay ayVar = wyVar.f34402f0;
                        zv zvVar2 = wyVar.f34394d0;
                        AnimatorSet animatorSet = wyVar.I0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            wyVar.I0 = null;
                        }
                        wyVar.E0 = false;
                        wyVar.m0 = false;
                        wyVar.V = false;
                        int i14 = 0;
                        while (i14 < 3) {
                            if (i14 == 0) {
                                jyVar = wyVar.R;
                                view = wyVar.E;
                                c10 = 0;
                                m0Var = wyVar.M;
                                zvVar = view3;
                            } else {
                                c10 = 0;
                                if (i14 == i12) {
                                    jyVar = wyVar.f34417k0;
                                    view = wyVar.f34420l0;
                                    m0Var = wyVar.f34398e0;
                                    zvVar = zvVar2;
                                } else {
                                    jyVar = wyVar.C0;
                                    view = wyVar.f34459x0;
                                    m0Var = wyVar.A0;
                                    zvVar = view2;
                                }
                            }
                            if (jyVar == null) {
                                ypVar2 = ypVar3;
                            } else if (jyVar2 == jyVar && (wxVar = wyVar.f34432p1) != null && wxVar.A()) {
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                wyVar.I0 = animatorSet2;
                                Property property = View.TRANSLATION_Y;
                                if (view != null && i14 != i13) {
                                    ypVar2 = ypVar3;
                                    float[] fArr = new float[1];
                                    fArr[c10] = -AndroidUtilities.dp(40.0f);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                                    float[] fArr2 = new float[1];
                                    fArr2[c10] = -AndroidUtilities.dp(36.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(zvVar, property, fArr2);
                                    float[] fArr3 = new float[1];
                                    fArr3[c10] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(jyVar, property, fArr3);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[c10] = ofFloat;
                                    animatorArr[1] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                } else {
                                    ypVar2 = ypVar3;
                                    if (i14 == 2) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = -AndroidUtilities.dp(36.0f);
                                    }
                                    float[] fArr4 = new float[1];
                                    fArr4[c10] = f10;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(zvVar, property, fArr4);
                                    float[] fArr5 = new float[1];
                                    fArr5[c10] = AndroidUtilities.dp(0.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(jyVar, property, fArr5);
                                    Animator[] animatorArr2 = new Animator[2];
                                    animatorArr2[c10] = ofFloat4;
                                    animatorArr2[1] = ofFloat5;
                                    animatorSet2.playTogether(animatorArr2);
                                }
                                wyVar.I0.setDuration(220L);
                                wyVar.I0.setInterpolator(gr.f28844f);
                                wyVar.I0.addListener(new fg.j(22, wyVar, zvVar));
                                wyVar.I0.start();
                            } else {
                                ypVar2 = ypVar3;
                                jyVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                if (view != null && i14 != 2) {
                                    view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                }
                                if (zvVar == view2) {
                                    zvVar.setPadding(0, 0, 0, wyVar.f34423m2);
                                } else if (zvVar == view3) {
                                    zvVar.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), wyVar.f34423m2);
                                } else if (zvVar == zvVar2) {
                                    zvVar.setPadding(0, wyVar.X0, 0, wyVar.f34423m2);
                                }
                                if (zvVar == zvVar2) {
                                    if (wyVar.f34414j0.f26924x.size() > 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    ayVar.G = z10;
                                    if (z10) {
                                        ayVar.G("", true);
                                        if (zvVar2.getAdapter() != ayVar) {
                                            zvVar2.setAdapter(ayVar);
                                        }
                                    }
                                }
                                m0Var.h1(0, 0);
                                i14++;
                                i12 = 1;
                                i13 = 2;
                                ypVar3 = ypVar2;
                            }
                            i14++;
                            i12 = 1;
                            i13 = 2;
                            ypVar3 = ypVar2;
                        }
                        ypVar = ypVar3;
                        wyVar.N(false);
                    } else {
                        ypVar = ypVar3;
                    }
                    wx wxVar2 = wyVar.f34432p1;
                    if (i11 == 1) {
                        i9 = 2;
                    } else {
                        i9 = 1;
                    }
                    wxVar2.i(i9);
                    ypVar.requestFocus();
                    AndroidUtilities.showKeyboard(ypVar);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
