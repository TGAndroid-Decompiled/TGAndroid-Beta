package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public class a00 extends s4.t0 {
    public final int f24420a;
    public boolean f24421b;
    public final b00 f24422c;

    public a00(b00 b00Var, int i10) {
        this.f24422c = b00Var;
        this.f24420a = i10;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        nz nzVar;
        float f7;
        int i11;
        b00 b00Var = this.f24422c;
        ObjectAnimator[] objectAnimatorArr = b00Var.R0;
        s4.z0 z0Var = recyclerView.getLayoutManager().f47890e;
        boolean z10 = true;
        if (z0Var != null && z0Var.f47954e) {
            this.f24421b = true;
            return;
        }
        int i12 = this.f24420a;
        if (i10 == 0) {
            if (!this.f24421b) {
                int[] iArr = b00Var.Q0;
                bz bzVar = b00Var.f24785t1;
                if ((bzVar == null || !bzVar.z()) && i12 != 0) {
                    float f10 = 48.0f;
                    if (i12 == 1) {
                        f7 = 36.0f;
                    } else {
                        f7 = 48.0f;
                    }
                    float dpf2 = AndroidUtilities.dpf2(f7);
                    float f11 = iArr[i12] / (-dpf2);
                    if (f11 > 0.0f && f11 < 1.0f) {
                        HorizontalScrollView z11 = b00Var.z(i12);
                        int i13 = (f11 > 0.5f ? 1 : (f11 == 0.5f ? 0 : -1));
                        if (i13 > 0) {
                            i11 = (int) (-Math.ceil(dpf2));
                        } else {
                            i11 = 0;
                        }
                        if (i13 > 0) {
                            b00Var.i(i12, i11, false);
                        }
                        if (i12 == 1) {
                            b00Var.m(i11);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i12];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z11, View.TRANSLATION_Y, z11.getTranslationY(), i11);
                            objectAnimatorArr[i12] = ofFloat;
                            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.p2(b00Var, i12, 3));
                            objectAnimatorArr[i12].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(z11.getTranslationY(), i11);
                        }
                        objectAnimatorArr[i12].start();
                    } else {
                        rm0 y3 = b00Var.y(i12);
                        if (i12 == 1) {
                            f10 = 38.0f;
                        }
                        int dp = AndroidUtilities.dp(f10);
                        s4.d1 K = y3.K(0);
                        if (K != null) {
                            int bottom = K.f47782a.getBottom();
                            int i14 = iArr[i12];
                            float f12 = (bottom - (dp + i14)) / b00Var.f24727b1;
                            if (f12 > 0.0f || f12 < 1.0f) {
                                if (f12 <= 0.5f) {
                                    z10 = false;
                                }
                                b00Var.i(i12, i14, z10);
                            }
                        }
                    }
                }
            }
            if (b00Var.J0) {
                b00Var.J0 = false;
            }
            this.f24421b = false;
            return;
        }
        if (i10 == 1) {
            if (b00Var.J0) {
                b00Var.J0 = false;
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        nzVar = b00Var.f24767o0;
                    } else {
                        throw new IllegalArgumentException(hg.c.h(i12, "Unexpected argument: "));
                    }
                } else {
                    nzVar = b00Var.V;
                }
            } else {
                nzVar = b00Var.G0;
            }
            if (nzVar != null) {
                nzVar.b();
            }
            this.f24421b = false;
        }
        if (!this.f24421b && (objectAnimator = objectAnimatorArr[i12]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i12].cancel();
        }
        if (i12 == 0) {
            if (b00Var.T0 == null) {
                gg.f1 f1Var = new gg.f1(b00Var, b00Var.f24731c1, b00Var.f24785t1.a(), b00Var.f24785t1.f(), 1);
                b00Var.T0 = f1Var;
                f1Var.a();
            }
            b00Var.T0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int dp;
        b00 b00Var = this.f24422c;
        int i12 = this.f24420a;
        b00Var.q(i12);
        b00.e(b00Var, i12, i11);
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    b00.f(b00Var, false);
                }
            } else {
                b00Var.l(false);
            }
        } else {
            b00Var.r(false);
        }
        if (!this.f24421b) {
            float f7 = i11;
            FrameLayout frameLayout = b00Var.f24763n;
            if (SystemClock.elapsedRealtime() - b00Var.E2 >= ViewConfiguration.getTapTimeout()) {
                b00Var.H += f7;
                if (b00Var.h.getCurrentItem() == 0) {
                    dp = AndroidUtilities.dp(38.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                float f10 = b00Var.H;
                if (f10 >= dp) {
                    b00Var.M(false);
                } else if (f10 <= (-dp)) {
                    b00Var.M(true);
                } else if ((frameLayout.getTag() == null && b00Var.H < 0.0f) || (frameLayout.getTag() != null && b00Var.H > 0.0f)) {
                    b00Var.H = 0.0f;
                }
            }
        }
    }
}
