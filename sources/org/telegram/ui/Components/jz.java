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
    public final int f25467a;
    public boolean f25468b;
    public final kz f25469c;

    public jz(kz kzVar, int i10) {
        this.f25469c = kzVar;
        this.f25467a = i10;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        xy xyVar;
        float f7;
        int i11;
        kz kzVar = this.f25469c;
        ObjectAnimator[] objectAnimatorArr = kzVar.R0;
        s4.y0 y0Var = recyclerView.getLayoutManager().e;
        boolean z10 = true;
        if (y0Var != null && y0Var.e) {
            this.f25468b = true;
            return;
        }
        int i12 = this.f25467a;
        if (i10 == 0) {
            if (!this.f25468b) {
                int[] iArr = kzVar.Q0;
                ky kyVar = kzVar.f25766t1;
                if ((kyVar == null || !kyVar.z()) && i12 != 0) {
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
                            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.r2(kzVar, i12, 3));
                            objectAnimatorArr[i12].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(y3.getTranslationY(), i11);
                        }
                        objectAnimatorArr[i12].start();
                    } else {
                        ml0 x10 = kzVar.x(i12);
                        if (i12 == 1) {
                            f10 = 38.0f;
                        }
                        int dp = AndroidUtilities.dp(f10);
                        s4.c1 L = x10.L(0);
                        if (L != null) {
                            int bottom = L.f42697a.getBottom();
                            int i14 = iArr[i12];
                            float f12 = (bottom - (dp + i14)) / kzVar.f25709b1;
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
            this.f25468b = false;
            return;
        }
        if (i10 == 1) {
            if (kzVar.J0) {
                kzVar.J0 = false;
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        xyVar = kzVar.f25748o0;
                    } else {
                        throw new IllegalArgumentException(hg.k0.i(i12, "Unexpected argument: "));
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
            this.f25468b = false;
        }
        if (!this.f25468b && (objectAnimator = objectAnimatorArr[i12]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i12].cancel();
        }
        if (i12 == 0) {
            if (kzVar.T0 == null) {
                gg.g1 g1Var = new gg.g1(kzVar, kzVar.f25713c1, kzVar.f25766t1.a(), kzVar.f25766t1.f(), 1);
                kzVar.T0 = g1Var;
                g1Var.a();
            }
            kzVar.T0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int dp;
        kz kzVar = this.f25469c;
        int i12 = this.f25467a;
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
        if (!this.f25468b) {
            float f7 = i11;
            FrameLayout frameLayout = kzVar.f25744n;
            if (SystemClock.elapsedRealtime() - kzVar.E2 >= ViewConfiguration.getTapTimeout()) {
                kzVar.H += f7;
                if (kzVar.h.getCurrentItem() == 0) {
                    dp = AndroidUtilities.dp(38.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                float f10 = kzVar.H;
                if (f10 >= dp) {
                    kzVar.N(false);
                } else if (f10 <= (-dp)) {
                    kzVar.N(true);
                } else if ((frameLayout.getTag() == null && kzVar.H < 0.0f) || (frameLayout.getTag() != null && kzVar.H > 0.0f)) {
                    kzVar.H = 0.0f;
                }
            }
        }
    }
}
