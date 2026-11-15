package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
public class ky extends v4.t0 {
    public final int f36650a;
    public boolean f36651b;
    public final ly f36652c;

    public ky(ly lyVar, int i7) {
        this.f36652c = lyVar;
        this.f36650a = i7;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        ObjectAnimator objectAnimator;
        yx yxVar;
        float f10;
        int i10;
        ly lyVar = this.f36652c;
        ObjectAnimator[] objectAnimatorArr = lyVar.S0;
        v4.a1 a1Var = recyclerView.getLayoutManager().f58624e;
        boolean z10 = true;
        if (a1Var != null && a1Var.f58483e) {
            this.f36651b = true;
            return;
        }
        int i11 = this.f36650a;
        if (i7 == 0) {
            if (!this.f36651b) {
                int[] iArr = lyVar.R0;
                mx mxVar = lyVar.f36993u1;
                if ((mxVar == null || !mxVar.z()) && i11 != 0) {
                    float f11 = 48.0f;
                    if (i11 == 1) {
                        f10 = 36.0f;
                    } else {
                        f10 = 48.0f;
                    }
                    float N = org.telegram.messenger.g0.N(f10);
                    float f12 = iArr[i11] / (-N);
                    if (f12 > 0.0f && f12 < 1.0f) {
                        HorizontalScrollView y10 = lyVar.y(i11);
                        int i12 = (f12 > 0.5f ? 1 : (f12 == 0.5f ? 0 : -1));
                        if (i12 > 0) {
                            i10 = (int) (-Math.ceil(N));
                        } else {
                            i10 = 0;
                        }
                        if (i12 > 0) {
                            lyVar.i(i11, i10, false);
                        }
                        if (i11 == 1) {
                            lyVar.m(i10);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10, View.TRANSLATION_Y, y10.getTranslationY(), i10);
                            objectAnimatorArr[i11] = ofFloat;
                            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.h2(lyVar, i11, 3));
                            objectAnimatorArr[i11].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(y10.getTranslationY(), i10);
                        }
                        objectAnimatorArr[i11].start();
                    } else {
                        uj0 x10 = lyVar.x(i11);
                        if (i11 == 1) {
                            f11 = 38.0f;
                        }
                        int L = org.telegram.messenger.g0.L(f11);
                        v4.e1 K = x10.K(0);
                        if (K != null) {
                            int bottom = K.f58535a.getBottom();
                            int i13 = iArr[i11];
                            float f13 = (bottom - (L + i13)) / lyVar.f36938c1;
                            if (f13 > 0.0f || f13 < 1.0f) {
                                if (f13 <= 0.5f) {
                                    z10 = false;
                                }
                                lyVar.i(i11, i13, z10);
                            }
                        }
                    }
                }
            }
            if (lyVar.K0) {
                lyVar.K0 = false;
            }
            this.f36651b = false;
            return;
        }
        if (i7 == 1) {
            if (lyVar.K0) {
                lyVar.K0 = false;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        yxVar = lyVar.f36975p0;
                    } else {
                        throw new IllegalArgumentException(i5.c.i(i11, "Unexpected argument: "));
                    }
                } else {
                    yxVar = lyVar.W;
                }
            } else {
                yxVar = lyVar.H0;
            }
            if (yxVar != null) {
                yxVar.b();
            }
            this.f36651b = false;
        }
        if (!this.f36651b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i11].cancel();
        }
        if (i11 == 0) {
            if (lyVar.U0 == null) {
                jg.d1 d1Var = new jg.d1(lyVar, lyVar.f36941d1, lyVar.f36993u1.a(), lyVar.f36993u1.f(), 1);
                lyVar.U0 = d1Var;
                d1Var.a();
            }
            lyVar.U0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        int L;
        ly lyVar = this.f36652c;
        int i11 = this.f36650a;
        lyVar.p(i11);
        ly.e(lyVar, i11, i10);
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ly.f(lyVar, false);
                }
            } else {
                lyVar.l(false);
            }
        } else {
            lyVar.q(false);
        }
        if (!this.f36651b) {
            float f10 = i10;
            FrameLayout frameLayout = lyVar.f36969n;
            if (SystemClock.elapsedRealtime() - lyVar.E2 >= ViewConfiguration.getTapTimeout()) {
                lyVar.I += f10;
                if (lyVar.h.getCurrentItem() == 0) {
                    L = org.telegram.messenger.g0.L(38.0f);
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                float f11 = lyVar.I;
                if (f11 >= L) {
                    lyVar.N(false);
                } else if (f11 <= (-L)) {
                    lyVar.N(true);
                } else if ((frameLayout.getTag() == null && lyVar.I < 0.0f) || (frameLayout.getTag() != null && lyVar.I > 0.0f)) {
                    lyVar.I = 0.0f;
                }
            }
        }
    }
}
