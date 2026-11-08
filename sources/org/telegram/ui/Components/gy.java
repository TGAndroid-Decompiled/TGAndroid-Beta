package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
public class gy extends v4.s0 {
    public final int f34036a;
    public boolean f34037b;
    public final hy f34038c;

    public gy(hy hyVar, int i7) {
        this.f34038c = hyVar;
        this.f34036a = i7;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        ObjectAnimator objectAnimator;
        ux uxVar;
        float f10;
        int i10;
        hy hyVar = this.f34038c;
        ObjectAnimator[] objectAnimatorArr = hyVar.R0;
        v4.z0 z0Var = recyclerView.getLayoutManager().f57133e;
        boolean z9 = true;
        if (z0Var != null && z0Var.f57215e) {
            this.f34037b = true;
            return;
        }
        int i11 = this.f34036a;
        if (i7 == 0) {
            if (!this.f34037b) {
                int[] iArr = hyVar.Q0;
                ix ixVar = hyVar.f34452t1;
                if ((ixVar == null || !ixVar.z()) && i11 != 0) {
                    float f11 = 48.0f;
                    if (i11 == 1) {
                        f10 = 36.0f;
                    } else {
                        f10 = 48.0f;
                    }
                    float N = org.telegram.messenger.g0.N(f10);
                    float f12 = iArr[i11] / (-N);
                    if (f12 > 0.0f && f12 < 1.0f) {
                        HorizontalScrollView y10 = hyVar.y(i11);
                        int i12 = (f12 > 0.5f ? 1 : (f12 == 0.5f ? 0 : -1));
                        if (i12 > 0) {
                            i10 = (int) (-Math.ceil(N));
                        } else {
                            i10 = 0;
                        }
                        if (i12 > 0) {
                            hyVar.i(i11, i10, false);
                        }
                        if (i11 == 1) {
                            hyVar.m(i10);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10, View.TRANSLATION_Y, y10.getTranslationY(), i10);
                            objectAnimatorArr[i11] = ofFloat;
                            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.i2(hyVar, i11, 3));
                            objectAnimatorArr[i11].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(y10.getTranslationY(), i10);
                        }
                        objectAnimatorArr[i11].start();
                    } else {
                        pj0 x10 = hyVar.x(i11);
                        if (i11 == 1) {
                            f11 = 38.0f;
                        }
                        int L = org.telegram.messenger.g0.L(f11);
                        v4.d1 K = x10.K(0);
                        if (K != null) {
                            int bottom = K.f57043a.getBottom();
                            int i13 = iArr[i11];
                            float f13 = (bottom - (L + i13)) / hyVar.f34396b1;
                            if (f13 > 0.0f || f13 < 1.0f) {
                                if (f13 <= 0.5f) {
                                    z9 = false;
                                }
                                hyVar.i(i11, i13, z9);
                            }
                        }
                    }
                }
            }
            if (hyVar.J0) {
                hyVar.J0 = false;
            }
            this.f34037b = false;
            return;
        }
        if (i7 == 1) {
            if (hyVar.J0) {
                hyVar.J0 = false;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        uxVar = hyVar.f34434o0;
                    } else {
                        throw new IllegalArgumentException(jg.g.j(i11, "Unexpected argument: "));
                    }
                } else {
                    uxVar = hyVar.V;
                }
            } else {
                uxVar = hyVar.G0;
            }
            if (uxVar != null) {
                uxVar.b();
            }
            this.f34037b = false;
        }
        if (!this.f34037b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i11].cancel();
        }
        if (i11 == 0) {
            if (hyVar.T0 == null) {
                jg.e1 e1Var = new jg.e1(hyVar, hyVar.f34400c1, hyVar.f34452t1.a(), hyVar.f34452t1.f(), 1);
                hyVar.T0 = e1Var;
                e1Var.a();
            }
            hyVar.T0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        int L;
        hy hyVar = this.f34038c;
        int i11 = this.f34036a;
        hyVar.p(i11);
        hy.e(hyVar, i11, i10);
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    hy.f(hyVar, false);
                }
            } else {
                hyVar.l(false);
            }
        } else {
            hyVar.q(false);
        }
        if (!this.f34037b) {
            float f10 = i10;
            FrameLayout frameLayout = hyVar.f34431n;
            if (SystemClock.elapsedRealtime() - hyVar.D2 >= ViewConfiguration.getTapTimeout()) {
                hyVar.H += f10;
                if (hyVar.h.getCurrentItem() == 0) {
                    L = org.telegram.messenger.g0.L(38.0f);
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                float f11 = hyVar.H;
                if (f11 >= L) {
                    hyVar.M(false);
                } else if (f11 <= (-L)) {
                    hyVar.M(true);
                } else if ((frameLayout.getTag() == null && hyVar.H < 0.0f) || (frameLayout.getTag() != null && hyVar.H > 0.0f)) {
                    hyVar.H = 0.0f;
                }
            }
        }
    }
}
