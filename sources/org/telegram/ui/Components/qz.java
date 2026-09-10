package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public class qz extends s4.s0 {
    public final int f26496a;
    public boolean f26497b;
    public final rz f26498c;

    public qz(rz rzVar, int i10) {
        this.f26498c = rzVar;
        this.f26496a = i10;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        ez ezVar;
        float f7;
        int i11;
        rz rzVar = this.f26498c;
        ObjectAnimator[] objectAnimatorArr = rzVar.R0;
        s4.y0 y0Var = recyclerView.getLayoutManager().e;
        boolean z10 = true;
        if (y0Var != null && y0Var.e) {
            this.f26497b = true;
            return;
        }
        int i12 = this.f26496a;
        if (i10 == 0) {
            if (!this.f26497b) {
                int[] iArr = rzVar.Q0;
                sy syVar = rzVar.f26858t1;
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
                        HorizontalScrollView y3 = rzVar.y(i12);
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
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y3, View.TRANSLATION_Y, y3.getTranslationY(), i11);
                            objectAnimatorArr[i12] = ofFloat;
                            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.s2(rzVar, i12, 3));
                            objectAnimatorArr[i12].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(y3.getTranslationY(), i11);
                        }
                        objectAnimatorArr[i12].start();
                    } else {
                        vl0 x10 = rzVar.x(i12);
                        if (i12 == 1) {
                            f10 = 38.0f;
                        }
                        int dp = AndroidUtilities.dp(f10);
                        s4.c1 K = x10.K(0);
                        if (K != null) {
                            int bottom = K.f41610a.getBottom();
                            int i14 = iArr[i12];
                            float f12 = (bottom - (dp + i14)) / rzVar.f26801b1;
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
            this.f26497b = false;
            return;
        }
        if (i10 == 1) {
            if (rzVar.J0) {
                rzVar.J0 = false;
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        ezVar = rzVar.f26840o0;
                    } else {
                        throw new IllegalArgumentException(hc.b.j(i12, "Unexpected argument: "));
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
            this.f26497b = false;
        }
        if (!this.f26497b && (objectAnimator = objectAnimatorArr[i12]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i12].cancel();
        }
        if (i12 == 0) {
            if (rzVar.T0 == null) {
                fg.h1 h1Var = new fg.h1(rzVar, rzVar.f26805c1, rzVar.f26858t1.a(), rzVar.f26858t1.f(), 1);
                rzVar.T0 = h1Var;
                h1Var.a();
            }
            rzVar.T0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int dp;
        rz rzVar = this.f26498c;
        int i12 = this.f26496a;
        rzVar.p(i12);
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
            rzVar.q(false);
        }
        if (!this.f26497b) {
            float f7 = i11;
            FrameLayout frameLayout = rzVar.f26836n;
            if (SystemClock.elapsedRealtime() - rzVar.F2 >= ViewConfiguration.getTapTimeout()) {
                rzVar.H += f7;
                if (rzVar.h.getCurrentItem() == 0) {
                    dp = AndroidUtilities.dp(38.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                float f10 = rzVar.H;
                if (f10 >= dp) {
                    rzVar.O(false);
                } else if (f10 <= (-dp)) {
                    rzVar.O(true);
                } else if ((frameLayout.getTag() == null && rzVar.H < 0.0f) || (frameLayout.getTag() != null && rzVar.H > 0.0f)) {
                    rzVar.H = 0.0f;
                }
            }
        }
    }
}
