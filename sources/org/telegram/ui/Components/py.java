package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
public class py extends v4.u0 {
    public final int f38610a;
    public boolean f38611b;
    public final qy f38612c;

    public py(qy qyVar, int i7) {
        this.f38612c = qyVar;
        this.f38610a = i7;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        ObjectAnimator objectAnimator;
        dy dyVar;
        float f10;
        int i10;
        qy qyVar = this.f38612c;
        ObjectAnimator[] objectAnimatorArr = qyVar.S0;
        v4.b1 b1Var = recyclerView.getLayoutManager().f59334e;
        boolean z10 = true;
        if (b1Var != null && b1Var.f59193e) {
            this.f38611b = true;
            return;
        }
        int i11 = this.f38610a;
        if (i7 == 0) {
            if (!this.f38611b) {
                int[] iArr = qyVar.R0;
                qx qxVar = qyVar.f39099u1;
                if ((qxVar == null || !qxVar.z()) && i11 != 0) {
                    float f11 = 48.0f;
                    if (i11 == 1) {
                        f10 = 36.0f;
                    } else {
                        f10 = 48.0f;
                    }
                    float N = org.telegram.messenger.g0.N(f10);
                    float f12 = iArr[i11] / (-N);
                    if (f12 > 0.0f && f12 < 1.0f) {
                        HorizontalScrollView y10 = qyVar.y(i11);
                        int i12 = (f12 > 0.5f ? 1 : (f12 == 0.5f ? 0 : -1));
                        if (i12 > 0) {
                            i10 = (int) (-Math.ceil(N));
                        } else {
                            i10 = 0;
                        }
                        if (i12 > 0) {
                            qyVar.i(i11, i10, false);
                        }
                        if (i11 == 1) {
                            qyVar.m(i10);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10, View.TRANSLATION_Y, y10.getTranslationY(), i10);
                            objectAnimatorArr[i11] = ofFloat;
                            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.j2(qyVar, i11, 3));
                            objectAnimatorArr[i11].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(y10.getTranslationY(), i10);
                        }
                        objectAnimatorArr[i11].start();
                    } else {
                        ek0 x10 = qyVar.x(i11);
                        if (i11 == 1) {
                            f11 = 38.0f;
                        }
                        int L = org.telegram.messenger.g0.L(f11);
                        v4.f1 K = x10.K(0);
                        if (K != null) {
                            int bottom = K.f59245a.getBottom();
                            int i13 = iArr[i11];
                            float f13 = (bottom - (L + i13)) / qyVar.f39044c1;
                            if (f13 > 0.0f || f13 < 1.0f) {
                                if (f13 <= 0.5f) {
                                    z10 = false;
                                }
                                qyVar.i(i11, i13, z10);
                            }
                        }
                    }
                }
            }
            if (qyVar.K0) {
                qyVar.K0 = false;
            }
            this.f38611b = false;
            return;
        }
        if (i7 == 1) {
            if (qyVar.K0) {
                qyVar.K0 = false;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        dyVar = qyVar.f39081p0;
                    } else {
                        throw new IllegalArgumentException(i5.c.i(i11, "Unexpected argument: "));
                    }
                } else {
                    dyVar = qyVar.W;
                }
            } else {
                dyVar = qyVar.H0;
            }
            if (dyVar != null) {
                dyVar.b();
            }
            this.f38611b = false;
        }
        if (!this.f38611b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i11].cancel();
        }
        if (i11 == 0) {
            if (qyVar.U0 == null) {
                jg.d1 d1Var = new jg.d1(qyVar, qyVar.f39047d1, qyVar.f39099u1.a(), qyVar.f39099u1.f(), 1);
                qyVar.U0 = d1Var;
                d1Var.a();
            }
            qyVar.U0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        int L;
        qy qyVar = this.f38612c;
        int i11 = this.f38610a;
        qyVar.p(i11);
        qy.e(qyVar, i11, i10);
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    qy.f(qyVar, false);
                }
            } else {
                qyVar.l(false);
            }
        } else {
            qyVar.q(false);
        }
        if (!this.f38611b) {
            float f10 = i10;
            FrameLayout frameLayout = qyVar.f39075n;
            if (SystemClock.elapsedRealtime() - qyVar.E2 >= ViewConfiguration.getTapTimeout()) {
                qyVar.I += f10;
                if (qyVar.h.getCurrentItem() == 0) {
                    L = org.telegram.messenger.g0.L(38.0f);
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                float f11 = qyVar.I;
                if (f11 >= L) {
                    qyVar.N(false);
                } else if (f11 <= (-L)) {
                    qyVar.N(true);
                } else if ((frameLayout.getTag() == null && qyVar.I < 0.0f) || (frameLayout.getTag() != null && qyVar.I > 0.0f)) {
                    qyVar.I = 0.0f;
                }
            }
        }
    }
}
