package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public class qz extends s4.r0 {
    public final int f30010a;
    public boolean f30011b;
    public final rz f30012c;

    public qz(rz rzVar, int i10) {
        this.f30012c = rzVar;
        this.f30010a = i10;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        ez ezVar;
        float f7;
        int i11;
        rz rzVar = this.f30012c;
        ObjectAnimator[] objectAnimatorArr = rzVar.R0;
        s4.x0 x0Var = recyclerView.getLayoutManager().e;
        boolean z10 = true;
        if (x0Var != null && x0Var.e) {
            this.f30011b = true;
            return;
        }
        int i12 = this.f30010a;
        if (i10 == 0) {
            if (!this.f30011b) {
                int[] iArr = rzVar.Q0;
                sy syVar = rzVar.f30363t1;
                if ((syVar == null || !syVar.z()) && i12 != 0) {
                    float f10 = 48.0f;
                    if (i12 == 1) {
                        f7 = 36.0f;
                    } else {
                        f7 = 48.0f;
                    }
                    float dpf2 = AndroidUtilities.dpf2(f7);
                    float f11 = iArr[i12] / (-dpf2);
                    if (f11 > 0.0f && f11 < 1.0f) {
                        HorizontalScrollView z11 = rzVar.z(i12);
                        int i13 = (f11 > 0.5f ? 1 : (f11 == 0.5f ? 0 : -1));
                        if (i13 > 0) {
                            i11 = (int) (-Math.ceil(dpf2));
                        } else {
                            i11 = 0;
                        }
                        if (i13 > 0) {
                            rzVar.i(i12, i11, false);
                        }
                        if (i12 == 1) {
                            rzVar.m(i11);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i12];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z11, View.TRANSLATION_Y, z11.getTranslationY(), i11);
                            objectAnimatorArr[i12] = ofFloat;
                            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.r2(rzVar, i12, 3));
                            objectAnimatorArr[i12].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(z11.getTranslationY(), i11);
                        }
                        objectAnimatorArr[i12].start();
                    } else {
                        lm0 y3 = rzVar.y(i12);
                        if (i12 == 1) {
                            f10 = 38.0f;
                        }
                        int dp = AndroidUtilities.dp(f10);
                        s4.b1 K = y3.K(0);
                        if (K != null) {
                            int bottom = K.f46342a.getBottom();
                            int i14 = iArr[i12];
                            float f12 = (bottom - (dp + i14)) / rzVar.f30306b1;
                            if (f12 > 0.0f || f12 < 1.0f) {
                                if (f12 <= 0.5f) {
                                    z10 = false;
                                }
                                rzVar.i(i12, i14, z10);
                            }
                        }
                    }
                }
            }
            if (rzVar.J0) {
                rzVar.J0 = false;
            }
            this.f30011b = false;
            return;
        }
        if (i10 == 1) {
            if (rzVar.J0) {
                rzVar.J0 = false;
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        ezVar = rzVar.f30345o0;
                    } else {
                        throw new IllegalArgumentException(i2.o1.k(i12, "Unexpected argument: "));
                    }
                } else {
                    ezVar = rzVar.V;
                }
            } else {
                ezVar = rzVar.G0;
            }
            if (ezVar != null) {
                ezVar.b();
            }
            this.f30011b = false;
        }
        if (!this.f30011b && (objectAnimator = objectAnimatorArr[i12]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i12].cancel();
        }
        if (i12 == 0) {
            if (rzVar.T0 == null) {
                hg.f1 f1Var = new hg.f1(rzVar, rzVar.f30310c1, rzVar.f30363t1.a(), rzVar.f30363t1.f(), 1);
                rzVar.T0 = f1Var;
                f1Var.a();
            }
            rzVar.T0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int dp;
        rz rzVar = this.f30012c;
        int i12 = this.f30010a;
        rzVar.q(i12);
        rz.e(rzVar, i12, i11);
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    rz.f(rzVar, false);
                }
            } else {
                rzVar.l(false);
            }
        } else {
            rzVar.r(false);
        }
        if (!this.f30011b) {
            float f7 = i11;
            FrameLayout frameLayout = rzVar.f30341n;
            if (SystemClock.elapsedRealtime() - rzVar.F2 >= ViewConfiguration.getTapTimeout()) {
                rzVar.H += f7;
                if (rzVar.h.getCurrentItem() == 0) {
                    dp = AndroidUtilities.dp(38.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                float f10 = rzVar.H;
                if (f10 >= dp) {
                    rzVar.M(false);
                } else if (f10 <= (-dp)) {
                    rzVar.M(true);
                } else if ((frameLayout.getTag() == null && rzVar.H < 0.0f) || (frameLayout.getTag() != null && rzVar.H > 0.0f)) {
                    rzVar.H = 0.0f;
                }
            }
        }
    }
}
