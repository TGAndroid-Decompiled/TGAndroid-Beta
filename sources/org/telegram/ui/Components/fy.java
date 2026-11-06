package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
public class fy extends v4.s0 {
    public final int f33680a;
    public boolean f33681b;
    public final gy f33682c;

    public fy(gy gyVar, int i7) {
        this.f33682c = gyVar;
        this.f33680a = i7;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        ObjectAnimator objectAnimator;
        tx txVar;
        float f10;
        int i10;
        gy gyVar = this.f33682c;
        ObjectAnimator[] objectAnimatorArr = gyVar.R0;
        v4.z0 z0Var = recyclerView.getLayoutManager().f57041e;
        boolean z9 = true;
        if (z0Var != null && z0Var.f57123e) {
            this.f33681b = true;
            return;
        }
        int i11 = this.f33680a;
        if (i7 == 0) {
            if (!this.f33681b) {
                int[] iArr = gyVar.Q0;
                hx hxVar = gyVar.f34084t1;
                if ((hxVar == null || !hxVar.z()) && i11 != 0) {
                    float f11 = 48.0f;
                    if (i11 == 1) {
                        f10 = 36.0f;
                    } else {
                        f10 = 48.0f;
                    }
                    float N = org.telegram.messenger.g0.N(f10);
                    float f12 = iArr[i11] / (-N);
                    if (f12 > 0.0f && f12 < 1.0f) {
                        HorizontalScrollView y10 = gyVar.y(i11);
                        int i12 = (f12 > 0.5f ? 1 : (f12 == 0.5f ? 0 : -1));
                        if (i12 > 0) {
                            i10 = (int) (-Math.ceil(N));
                        } else {
                            i10 = 0;
                        }
                        if (i12 > 0) {
                            gyVar.i(i11, i10, false);
                        }
                        if (i11 == 1) {
                            gyVar.m(i10);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10, View.TRANSLATION_Y, y10.getTranslationY(), i10);
                            objectAnimatorArr[i11] = ofFloat;
                            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.i2(gyVar, i11, 3));
                            objectAnimatorArr[i11].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(y10.getTranslationY(), i10);
                        }
                        objectAnimatorArr[i11].start();
                    } else {
                        pj0 x10 = gyVar.x(i11);
                        if (i11 == 1) {
                            f11 = 38.0f;
                        }
                        int L = org.telegram.messenger.g0.L(f11);
                        v4.d1 K = x10.K(0);
                        if (K != null) {
                            int bottom = K.f56951a.getBottom();
                            int i13 = iArr[i11];
                            float f13 = (bottom - (L + i13)) / gyVar.f34028b1;
                            if (f13 > 0.0f || f13 < 1.0f) {
                                if (f13 <= 0.5f) {
                                    z9 = false;
                                }
                                gyVar.i(i11, i13, z9);
                            }
                        }
                    }
                }
            }
            if (gyVar.J0) {
                gyVar.J0 = false;
            }
            this.f33681b = false;
            return;
        }
        if (i7 == 1) {
            if (gyVar.J0) {
                gyVar.J0 = false;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        txVar = gyVar.f34066o0;
                    } else {
                        throw new IllegalArgumentException(jg.g.j(i11, "Unexpected argument: "));
                    }
                } else {
                    txVar = gyVar.V;
                }
            } else {
                txVar = gyVar.G0;
            }
            if (txVar != null) {
                txVar.b();
            }
            this.f33681b = false;
        }
        if (!this.f33681b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i11].cancel();
        }
        if (i11 == 0) {
            if (gyVar.T0 == null) {
                jg.e1 e1Var = new jg.e1(gyVar, gyVar.f34032c1, gyVar.f34084t1.a(), gyVar.f34084t1.f(), 1);
                gyVar.T0 = e1Var;
                e1Var.a();
            }
            gyVar.T0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        int L;
        gy gyVar = this.f33682c;
        int i11 = this.f33680a;
        gyVar.p(i11);
        gy.e(gyVar, i11, i10);
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    gy.f(gyVar, false);
                }
            } else {
                gyVar.l(false);
            }
        } else {
            gyVar.q(false);
        }
        if (!this.f33681b) {
            float f10 = i10;
            FrameLayout frameLayout = gyVar.f34063n;
            if (SystemClock.elapsedRealtime() - gyVar.D2 >= ViewConfiguration.getTapTimeout()) {
                gyVar.H += f10;
                if (gyVar.h.getCurrentItem() == 0) {
                    L = org.telegram.messenger.g0.L(38.0f);
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                float f11 = gyVar.H;
                if (f11 >= L) {
                    gyVar.M(false);
                } else if (f11 <= (-L)) {
                    gyVar.M(true);
                } else if ((frameLayout.getTag() == null && gyVar.H < 0.0f) || (frameLayout.getTag() != null && gyVar.H > 0.0f)) {
                    gyVar.H = 0.0f;
                }
            }
        }
    }
}
