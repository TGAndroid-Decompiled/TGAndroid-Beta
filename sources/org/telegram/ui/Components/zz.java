package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public class zz extends s4.t0 {
    public final int f33685a;
    public boolean f33686b;
    public final a00 f33687c;

    public zz(a00 a00Var, int i10) {
        this.f33687c = a00Var;
        this.f33685a = i10;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        mz mzVar;
        float f7;
        int i11;
        a00 a00Var = this.f33687c;
        ObjectAnimator[] objectAnimatorArr = a00Var.R0;
        s4.z0 z0Var = recyclerView.getLayoutManager().f47764e;
        boolean z10 = true;
        if (z0Var != null && z0Var.f47828e) {
            this.f33686b = true;
            return;
        }
        int i12 = this.f33685a;
        if (i10 == 0) {
            if (!this.f33686b) {
                int[] iArr = a00Var.Q0;
                az azVar = a00Var.f24455t1;
                if ((azVar == null || !azVar.z()) && i12 != 0) {
                    float f10 = 48.0f;
                    if (i12 == 1) {
                        f7 = 36.0f;
                    } else {
                        f7 = 48.0f;
                    }
                    float dpf2 = AndroidUtilities.dpf2(f7);
                    float f11 = iArr[i12] / (-dpf2);
                    if (f11 > 0.0f && f11 < 1.0f) {
                        HorizontalScrollView z11 = a00Var.z(i12);
                        int i13 = (f11 > 0.5f ? 1 : (f11 == 0.5f ? 0 : -1));
                        if (i13 > 0) {
                            i11 = (int) (-Math.ceil(dpf2));
                        } else {
                            i11 = 0;
                        }
                        if (i13 > 0) {
                            a00Var.i(i12, i11, false);
                        }
                        if (i12 == 1) {
                            a00Var.m(i11);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i12];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z11, View.TRANSLATION_Y, z11.getTranslationY(), i11);
                            objectAnimatorArr[i12] = ofFloat;
                            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(a00Var, i12, 3));
                            objectAnimatorArr[i12].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(z11.getTranslationY(), i11);
                        }
                        objectAnimatorArr[i12].start();
                    } else {
                        qm0 y3 = a00Var.y(i12);
                        if (i12 == 1) {
                            f10 = 38.0f;
                        }
                        int dp = AndroidUtilities.dp(f10);
                        s4.d1 K = y3.K(0);
                        if (K != null) {
                            int bottom = K.f47656a.getBottom();
                            int i14 = iArr[i12];
                            float f12 = (bottom - (dp + i14)) / a00Var.f24397b1;
                            if (f12 > 0.0f || f12 < 1.0f) {
                                if (f12 <= 0.5f) {
                                    z10 = false;
                                }
                                a00Var.i(i12, i14, z10);
                            }
                        }
                    }
                }
            }
            if (a00Var.J0) {
                a00Var.J0 = false;
            }
            this.f33686b = false;
            return;
        }
        if (i10 == 1) {
            if (a00Var.J0) {
                a00Var.J0 = false;
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        mzVar = a00Var.f24437o0;
                    } else {
                        throw new IllegalArgumentException(hg.c.h(i12, "Unexpected argument: "));
                    }
                } else {
                    mzVar = a00Var.V;
                }
            } else {
                mzVar = a00Var.G0;
            }
            if (mzVar != null) {
                mzVar.b();
            }
            this.f33686b = false;
        }
        if (!this.f33686b && (objectAnimator = objectAnimatorArr[i12]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i12].cancel();
        }
        if (i12 == 0) {
            if (a00Var.T0 == null) {
                gg.f1 f1Var = new gg.f1(a00Var, a00Var.f24401c1, a00Var.f24455t1.a(), a00Var.f24455t1.f(), 1);
                a00Var.T0 = f1Var;
                f1Var.a();
            }
            a00Var.T0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int dp;
        a00 a00Var = this.f33687c;
        int i12 = this.f33685a;
        a00Var.q(i12);
        a00.e(a00Var, i12, i11);
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    a00.f(a00Var, false);
                }
            } else {
                a00Var.l(false);
            }
        } else {
            a00Var.r(false);
        }
        if (!this.f33686b) {
            float f7 = i11;
            FrameLayout frameLayout = a00Var.f24433n;
            if (SystemClock.elapsedRealtime() - a00Var.E2 >= ViewConfiguration.getTapTimeout()) {
                a00Var.H += f7;
                if (a00Var.h.getCurrentItem() == 0) {
                    dp = AndroidUtilities.dp(38.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                float f10 = a00Var.H;
                if (f10 >= dp) {
                    a00Var.M(false);
                } else if (f10 <= (-dp)) {
                    a00Var.M(true);
                } else if ((frameLayout.getTag() == null && a00Var.H < 0.0f) || (frameLayout.getTag() != null && a00Var.H > 0.0f)) {
                    a00Var.H = 0.0f;
                }
            }
        }
    }
}
