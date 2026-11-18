package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
public class qy extends v4.u0 {
    public final int f38936a;
    public boolean f38937b;
    public final ry f38938c;

    public qy(ry ryVar, int i7) {
        this.f38938c = ryVar;
        this.f38936a = i7;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        ObjectAnimator objectAnimator;
        ey eyVar;
        float f10;
        int i10;
        ry ryVar = this.f38938c;
        ObjectAnimator[] objectAnimatorArr = ryVar.S0;
        v4.b1 b1Var = recyclerView.getLayoutManager().f59209e;
        boolean z10 = true;
        if (b1Var != null && b1Var.f59069e) {
            this.f38937b = true;
            return;
        }
        int i11 = this.f38936a;
        if (i7 == 0) {
            if (!this.f38937b) {
                int[] iArr = ryVar.R0;
                rx rxVar = ryVar.f39397u1;
                if ((rxVar == null || !rxVar.z()) && i11 != 0) {
                    float f11 = 48.0f;
                    if (i11 == 1) {
                        f10 = 36.0f;
                    } else {
                        f10 = 48.0f;
                    }
                    float N = org.telegram.messenger.g0.N(f10);
                    float f12 = iArr[i11] / (-N);
                    if (f12 > 0.0f && f12 < 1.0f) {
                        HorizontalScrollView y10 = ryVar.y(i11);
                        int i12 = (f12 > 0.5f ? 1 : (f12 == 0.5f ? 0 : -1));
                        if (i12 > 0) {
                            i10 = (int) (-Math.ceil(N));
                        } else {
                            i10 = 0;
                        }
                        if (i12 > 0) {
                            ryVar.i(i11, i10, false);
                        }
                        if (i11 == 1) {
                            ryVar.m(i10);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10, View.TRANSLATION_Y, y10.getTranslationY(), i10);
                            objectAnimatorArr[i11] = ofFloat;
                            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.k2(ryVar, i11, 3));
                            objectAnimatorArr[i11].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(y10.getTranslationY(), i10);
                        }
                        objectAnimatorArr[i11].start();
                    } else {
                        ck0 x10 = ryVar.x(i11);
                        if (i11 == 1) {
                            f11 = 38.0f;
                        }
                        int L = org.telegram.messenger.g0.L(f11);
                        v4.f1 K = x10.K(0);
                        if (K != null) {
                            int bottom = K.f59122a.getBottom();
                            int i13 = iArr[i11];
                            float f13 = (bottom - (L + i13)) / ryVar.f39342c1;
                            if (f13 > 0.0f || f13 < 1.0f) {
                                if (f13 <= 0.5f) {
                                    z10 = false;
                                }
                                ryVar.i(i11, i13, z10);
                            }
                        }
                    }
                }
            }
            if (ryVar.K0) {
                ryVar.K0 = false;
            }
            this.f38937b = false;
            return;
        }
        if (i7 == 1) {
            if (ryVar.K0) {
                ryVar.K0 = false;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        eyVar = ryVar.f39379p0;
                    } else {
                        throw new IllegalArgumentException(i5.c.i(i11, "Unexpected argument: "));
                    }
                } else {
                    eyVar = ryVar.W;
                }
            } else {
                eyVar = ryVar.H0;
            }
            if (eyVar != null) {
                eyVar.b();
            }
            this.f38937b = false;
        }
        if (!this.f38937b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i11].cancel();
        }
        if (i11 == 0) {
            if (ryVar.U0 == null) {
                jg.d1 d1Var = new jg.d1(ryVar, ryVar.f39345d1, ryVar.f39397u1.a(), ryVar.f39397u1.f(), 1);
                ryVar.U0 = d1Var;
                d1Var.a();
            }
            ryVar.U0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        int L;
        ry ryVar = this.f38938c;
        int i11 = this.f38936a;
        ryVar.p(i11);
        ry.e(ryVar, i11, i10);
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ry.f(ryVar, false);
                }
            } else {
                ryVar.l(false);
            }
        } else {
            ryVar.q(false);
        }
        if (!this.f38937b) {
            float f10 = i10;
            FrameLayout frameLayout = ryVar.f39373n;
            if (SystemClock.elapsedRealtime() - ryVar.E2 >= ViewConfiguration.getTapTimeout()) {
                ryVar.I += f10;
                if (ryVar.h.getCurrentItem() == 0) {
                    L = org.telegram.messenger.g0.L(38.0f);
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                float f11 = ryVar.I;
                if (f11 >= L) {
                    ryVar.N(false);
                } else if (f11 <= (-L)) {
                    ryVar.N(true);
                } else if ((frameLayout.getTag() == null && ryVar.I < 0.0f) || (frameLayout.getTag() != null && ryVar.I > 0.0f)) {
                    ryVar.I = 0.0f;
                }
            }
        }
    }
}
