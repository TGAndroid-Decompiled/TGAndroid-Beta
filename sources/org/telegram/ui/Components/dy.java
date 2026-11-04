package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
public class dy extends u4.t0 {
    public final int f33205a;
    public boolean f33206b;
    public final ey f33207c;

    public dy(ey eyVar, int i3) {
        this.f33207c = eyVar;
        this.f33205a = i3;
    }

    @Override
    public void a(RecyclerView recyclerView, int i3) {
        ObjectAnimator objectAnimator;
        rx rxVar;
        float f10;
        int i10;
        ey eyVar = this.f33207c;
        ObjectAnimator[] objectAnimatorArr = eyVar.S0;
        u4.z0 z0Var = recyclerView.getLayoutManager().f55632e;
        boolean z10 = true;
        if (z0Var != null && z0Var.f55707e) {
            this.f33206b = true;
            return;
        }
        int i11 = this.f33205a;
        if (i3 == 0) {
            if (!this.f33206b) {
                int[] iArr = eyVar.R0;
                fx fxVar = eyVar.f33582u1;
                if ((fxVar == null || !fxVar.z()) && i11 != 0) {
                    float f11 = 48.0f;
                    if (i11 == 1) {
                        f10 = 36.0f;
                    } else {
                        f10 = 48.0f;
                    }
                    float N = org.telegram.messenger.g0.N(f10);
                    float f12 = iArr[i11] / (-N);
                    if (f12 > 0.0f && f12 < 1.0f) {
                        HorizontalScrollView y9 = eyVar.y(i11);
                        int i12 = (f12 > 0.5f ? 1 : (f12 == 0.5f ? 0 : -1));
                        if (i12 > 0) {
                            i10 = (int) (-Math.ceil(N));
                        } else {
                            i10 = 0;
                        }
                        if (i12 > 0) {
                            eyVar.i(i11, i10, false);
                        }
                        if (i11 == 1) {
                            eyVar.m(i10);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y9, View.TRANSLATION_Y, y9.getTranslationY(), i10);
                            objectAnimatorArr[i11] = ofFloat;
                            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.g2(eyVar, i11, 3));
                            objectAnimatorArr[i11].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(y9.getTranslationY(), i10);
                        }
                        objectAnimatorArr[i11].start();
                    } else {
                        tj0 x10 = eyVar.x(i11);
                        if (i11 == 1) {
                            f11 = 38.0f;
                        }
                        int L = org.telegram.messenger.g0.L(f11);
                        u4.d1 K = x10.K(0);
                        if (K != null) {
                            int bottom = K.f55540a.getBottom();
                            int i13 = iArr[i11];
                            float f13 = (bottom - (L + i13)) / eyVar.f33527c1;
                            if (f13 > 0.0f || f13 < 1.0f) {
                                if (f13 <= 0.5f) {
                                    z10 = false;
                                }
                                eyVar.i(i11, i13, z10);
                            }
                        }
                    }
                }
            }
            if (eyVar.K0) {
                eyVar.K0 = false;
            }
            this.f33206b = false;
            return;
        }
        if (i3 == 1) {
            if (eyVar.K0) {
                eyVar.K0 = false;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        rxVar = eyVar.f33564p0;
                    } else {
                        throw new IllegalArgumentException(k2.p1.i(i11, "Unexpected argument: "));
                    }
                } else {
                    rxVar = eyVar.W;
                }
            } else {
                rxVar = eyVar.H0;
            }
            if (rxVar != null) {
                rxVar.b();
            }
            this.f33206b = false;
        }
        if (!this.f33206b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i11].cancel();
        }
        if (i11 == 0) {
            if (eyVar.U0 == null) {
                kg.a1 a1Var = new kg.a1(eyVar, eyVar.f33529d1, eyVar.f33582u1.a(), eyVar.f33582u1.f(), 1);
                eyVar.U0 = a1Var;
                a1Var.a();
            }
            eyVar.U0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i3, int i10) {
        int L;
        ey eyVar = this.f33207c;
        int i11 = this.f33205a;
        eyVar.p(i11);
        ey.e(eyVar, i11, i10);
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ey.f(eyVar, false);
                }
            } else {
                eyVar.l(false);
            }
        } else {
            eyVar.q(false);
        }
        if (!this.f33206b) {
            float f10 = i10;
            FrameLayout frameLayout = eyVar.f33557n;
            if (SystemClock.elapsedRealtime() - eyVar.E2 >= ViewConfiguration.getTapTimeout()) {
                eyVar.I += f10;
                if (eyVar.h.getCurrentItem() == 0) {
                    L = org.telegram.messenger.g0.L(38.0f);
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                float f11 = eyVar.I;
                if (f11 >= L) {
                    eyVar.M(false);
                } else if (f11 <= (-L)) {
                    eyVar.M(true);
                } else if ((frameLayout.getTag() == null && eyVar.I < 0.0f) || (frameLayout.getTag() != null && eyVar.I > 0.0f)) {
                    eyVar.I = 0.0f;
                }
            }
        }
    }
}
