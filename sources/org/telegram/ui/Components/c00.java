package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public class c00 extends s4.t0 {
    public final int f24781a;
    public boolean f24782b;
    public final d00 f24783c;

    public c00(d00 d00Var, int i10) {
        this.f24783c = d00Var;
        this.f24781a = i10;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        pz pzVar;
        float f7;
        int i11;
        d00 d00Var = this.f24783c;
        ObjectAnimator[] objectAnimatorArr = d00Var.R0;
        s4.z0 z0Var = recyclerView.getLayoutManager().f48005e;
        boolean z10 = true;
        if (z0Var != null && z0Var.f48069e) {
            this.f24782b = true;
            return;
        }
        int i12 = this.f24781a;
        if (i10 == 0) {
            if (!this.f24782b) {
                int[] iArr = d00Var.Q0;
                dz dzVar = d00Var.f25126t1;
                if ((dzVar == null || !dzVar.z()) && i12 != 0) {
                    float f10 = 48.0f;
                    if (i12 == 1) {
                        f7 = 36.0f;
                    } else {
                        f7 = 48.0f;
                    }
                    float dpf2 = AndroidUtilities.dpf2(f7);
                    float f11 = iArr[i12] / (-dpf2);
                    if (f11 > 0.0f && f11 < 1.0f) {
                        HorizontalScrollView z11 = d00Var.z(i12);
                        int i13 = (f11 > 0.5f ? 1 : (f11 == 0.5f ? 0 : -1));
                        if (i13 > 0) {
                            i11 = (int) (-Math.ceil(dpf2));
                        } else {
                            i11 = 0;
                        }
                        if (i13 > 0) {
                            d00Var.i(i12, i11, false);
                        }
                        if (i12 == 1) {
                            d00Var.m(i11);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i12];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z11, View.TRANSLATION_Y, z11.getTranslationY(), i11);
                            objectAnimatorArr[i12] = ofFloat;
                            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.p2(d00Var, i12, 3));
                            objectAnimatorArr[i12].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(z11.getTranslationY(), i11);
                        }
                        objectAnimatorArr[i12].start();
                    } else {
                        wm0 y3 = d00Var.y(i12);
                        if (i12 == 1) {
                            f10 = 38.0f;
                        }
                        int dp = AndroidUtilities.dp(f10);
                        s4.d1 K = y3.K(0);
                        if (K != null) {
                            int bottom = K.f47897a.getBottom();
                            int i14 = iArr[i12];
                            float f12 = (bottom - (dp + i14)) / d00Var.f25068b1;
                            if (f12 > 0.0f || f12 < 1.0f) {
                                if (f12 <= 0.5f) {
                                    z10 = false;
                                }
                                d00Var.i(i12, i14, z10);
                            }
                        }
                    }
                }
            }
            if (d00Var.J0) {
                d00Var.J0 = false;
            }
            this.f24782b = false;
            return;
        }
        if (i10 == 1) {
            if (d00Var.J0) {
                d00Var.J0 = false;
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        pzVar = d00Var.f25108o0;
                    } else {
                        throw new IllegalArgumentException(hg.c.i(i12, "Unexpected argument: "));
                    }
                } else {
                    pzVar = d00Var.V;
                }
            } else {
                pzVar = d00Var.G0;
            }
            if (pzVar != null) {
                pzVar.b();
            }
            this.f24782b = false;
        }
        if (!this.f24782b && (objectAnimator = objectAnimatorArr[i12]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i12].cancel();
        }
        if (i12 == 0) {
            if (d00Var.T0 == null) {
                gg.f1 f1Var = new gg.f1(d00Var, d00Var.f25072c1, d00Var.f25126t1.a(), d00Var.f25126t1.f(), 1);
                d00Var.T0 = f1Var;
                f1Var.a();
            }
            d00Var.T0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int dp;
        d00 d00Var = this.f24783c;
        int i12 = this.f24781a;
        d00Var.q(i12);
        d00.e(d00Var, i12, i11);
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    d00.f(d00Var, false);
                }
            } else {
                d00Var.l(false);
            }
        } else {
            d00Var.r(false);
        }
        if (!this.f24782b) {
            float f7 = i11;
            FrameLayout frameLayout = d00Var.f25104n;
            if (SystemClock.elapsedRealtime() - d00Var.E2 >= ViewConfiguration.getTapTimeout()) {
                d00Var.H += f7;
                if (d00Var.h.getCurrentItem() == 0) {
                    dp = AndroidUtilities.dp(38.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                float f10 = d00Var.H;
                if (f10 >= dp) {
                    d00Var.M(false);
                } else if (f10 <= (-dp)) {
                    d00Var.M(true);
                } else if ((frameLayout.getTag() == null && d00Var.H < 0.0f) || (frameLayout.getTag() != null && d00Var.H > 0.0f)) {
                    d00Var.H = 0.0f;
                }
            }
        }
    }
}
