package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public class jz extends s4.s0 {
    public final int f27613a;
    public boolean f27614b;
    public final kz f27615c;

    public jz(kz kzVar, int i10) {
        this.f27615c = kzVar;
        this.f27613a = i10;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        xy xyVar;
        float f7;
        int i11;
        kz kzVar = this.f27615c;
        ObjectAnimator[] objectAnimatorArr = kzVar.R0;
        s4.y0 y0Var = recyclerView.getLayoutManager().f45872e;
        boolean z10 = true;
        if (y0Var != null && y0Var.f45937e) {
            this.f27614b = true;
            return;
        }
        int i12 = this.f27613a;
        if (i10 == 0) {
            if (!this.f27614b) {
                int[] iArr = kzVar.Q0;
                ly lyVar = kzVar.f28013t1;
                if ((lyVar == null || !lyVar.z()) && i12 != 0) {
                    float f10 = 48.0f;
                    if (i12 == 1) {
                        f7 = 36.0f;
                    } else {
                        f7 = 48.0f;
                    }
                    float dpf2 = AndroidUtilities.dpf2(f7);
                    float f11 = iArr[i12] / (-dpf2);
                    if (f11 > 0.0f && f11 < 1.0f) {
                        HorizontalScrollView y3 = kzVar.y(i12);
                        int i13 = (f11 > 0.5f ? 1 : (f11 == 0.5f ? 0 : -1));
                        if (i13 > 0) {
                            i11 = (int) (-Math.ceil(dpf2));
                        } else {
                            i11 = 0;
                        }
                        if (i13 > 0) {
                            kzVar.i(i12, i11, false);
                        }
                        if (i12 == 1) {
                            kzVar.m(i11);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i12];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y3, View.TRANSLATION_Y, y3.getTranslationY(), i11);
                            objectAnimatorArr[i12] = ofFloat;
                            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(kzVar, i12, 3));
                            objectAnimatorArr[i12].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(y3.getTranslationY(), i11);
                        }
                        objectAnimatorArr[i12].start();
                    } else {
                        ll0 x10 = kzVar.x(i12);
                        if (i12 == 1) {
                            f10 = 38.0f;
                        }
                        int dp = AndroidUtilities.dp(f10);
                        s4.c1 K = x10.K(0);
                        if (K != null) {
                            int bottom = K.f45766a.getBottom();
                            int i14 = iArr[i12];
                            float f12 = (bottom - (dp + i14)) / kzVar.f27955b1;
                            if (f12 > 0.0f || f12 < 1.0f) {
                                if (f12 <= 0.5f) {
                                    z10 = false;
                                }
                                kzVar.i(i12, i14, z10);
                            }
                        }
                    }
                }
            }
            if (kzVar.J0) {
                kzVar.J0 = false;
            }
            this.f27614b = false;
            return;
        }
        if (i10 == 1) {
            if (kzVar.J0) {
                kzVar.J0 = false;
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        xyVar = kzVar.f27995o0;
                    } else {
                        throw new IllegalArgumentException(i2.g.i(i12, "Unexpected argument: "));
                    }
                } else {
                    xyVar = kzVar.V;
                }
            } else {
                xyVar = kzVar.G0;
            }
            if (xyVar != null) {
                xyVar.b();
            }
            this.f27614b = false;
        }
        if (!this.f27614b && (objectAnimator = objectAnimatorArr[i12]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i12].cancel();
        }
        if (i12 == 0) {
            if (kzVar.T0 == null) {
                hg.g1 g1Var = new hg.g1(kzVar, kzVar.f27959c1, kzVar.f28013t1.a(), kzVar.f28013t1.f(), 1);
                kzVar.T0 = g1Var;
                g1Var.a();
            }
            kzVar.T0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int dp;
        kz kzVar = this.f27615c;
        int i12 = this.f27613a;
        kzVar.p(i12);
        kz.e(kzVar, i12, i11);
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    kz.f(kzVar, false);
                }
            } else {
                kzVar.l(false);
            }
        } else {
            kzVar.q(false);
        }
        if (!this.f27614b) {
            float f7 = i11;
            FrameLayout frameLayout = kzVar.f27991n;
            if (SystemClock.elapsedRealtime() - kzVar.F2 >= ViewConfiguration.getTapTimeout()) {
                kzVar.H += f7;
                if (kzVar.h.getCurrentItem() == 0) {
                    dp = AndroidUtilities.dp(38.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                float f10 = kzVar.H;
                if (f10 >= dp) {
                    kzVar.O(false);
                } else if (f10 <= (-dp)) {
                    kzVar.O(true);
                } else if ((frameLayout.getTag() == null && kzVar.H < 0.0f) || (frameLayout.getTag() != null && kzVar.H > 0.0f)) {
                    kzVar.H = 0.0f;
                }
            }
        }
    }
}
