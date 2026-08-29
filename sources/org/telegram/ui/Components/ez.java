package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public class ez extends f2.a1 {
    public final int f28209a;
    public boolean f28210b;
    public final fz f28211c;

    public ez(fz fzVar, int i10) {
        this.f28211c = fzVar;
        this.f28209a = i10;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        ry ryVar;
        float f9;
        int i11;
        fz fzVar = this.f28211c;
        ObjectAnimator[] objectAnimatorArr = fzVar.N0;
        f2.j1 j1Var = recyclerView.getLayoutManager().f6499e;
        boolean z10 = true;
        if (j1Var != null && j1Var.f6376e) {
            this.f28210b = true;
            return;
        }
        int i12 = this.f28209a;
        if (i10 == 0) {
            if (!this.f28210b) {
                int[] iArr = fzVar.M0;
                fy fyVar = fzVar.f28623p1;
                if ((fyVar == null || !fyVar.z()) && i12 != 0) {
                    float f10 = 48.0f;
                    if (i12 == 1) {
                        f9 = 36.0f;
                    } else {
                        f9 = 48.0f;
                    }
                    float dpf2 = AndroidUtilities.dpf2(f9);
                    float f11 = iArr[i12] / (-dpf2);
                    if (f11 > 0.0f && f11 < 1.0f) {
                        HorizontalScrollView y8 = fzVar.y(i12);
                        int i13 = (f11 > 0.5f ? 1 : (f11 == 0.5f ? 0 : -1));
                        if (i13 > 0) {
                            i11 = (int) (-Math.ceil(dpf2));
                        } else {
                            i11 = 0;
                        }
                        if (i13 > 0) {
                            fzVar.i(i12, i11, false);
                        }
                        if (i12 == 1) {
                            fzVar.m(i11);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i12];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y8, View.TRANSLATION_Y, y8.getTranslationY(), i11);
                            objectAnimatorArr[i12] = ofFloat;
                            ofFloat.addUpdateListener(new gh.b(fzVar, i12, 4));
                            objectAnimatorArr[i12].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(y8.getTranslationY(), i11);
                        }
                        objectAnimatorArr[i12].start();
                    } else {
                        jl0 x4 = fzVar.x(i12);
                        if (i12 == 1) {
                            f10 = 38.0f;
                        }
                        int dp = AndroidUtilities.dp(f10);
                        f2.n1 K = x4.K(0);
                        if (K != null) {
                            int bottom = K.f6432a.getBottom();
                            int i14 = iArr[i12];
                            float f12 = (bottom - (dp + i14)) / fzVar.X0;
                            if (f12 > 0.0f || f12 < 1.0f) {
                                if (f12 <= 0.5f) {
                                    z10 = false;
                                }
                                fzVar.i(i12, i14, z10);
                            }
                        }
                    }
                }
            }
            if (fzVar.F0) {
                fzVar.F0 = false;
            }
            this.f28210b = false;
            return;
        }
        if (i10 == 1) {
            if (fzVar.F0) {
                fzVar.F0 = false;
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        ryVar = fzVar.f28608k0;
                    } else {
                        throw new IllegalArgumentException(j7.l1.k(i12, "Unexpected argument: "));
                    }
                } else {
                    ryVar = fzVar.R;
                }
            } else {
                ryVar = fzVar.C0;
            }
            if (ryVar != null) {
                ryVar.b();
            }
            this.f28210b = false;
        }
        if (!this.f28210b && (objectAnimator = objectAnimatorArr[i12]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i12].cancel();
        }
        if (i12 == 0) {
            if (fzVar.P0 == null) {
                vw vwVar = new vw(fzVar, fzVar.Y0, fzVar.f28623p1.a(), fzVar.f28623p1.f(), 0);
                fzVar.P0 = vwVar;
                vwVar.a();
            }
            fzVar.P0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int dp;
        fz fzVar = this.f28211c;
        int i12 = this.f28209a;
        fzVar.p(i12);
        fz.e(fzVar, i12, i11);
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    fz.f(fzVar, false);
                }
            } else {
                fzVar.l(false);
            }
        } else {
            fzVar.q(false);
        }
        if (!this.f28210b) {
            float f9 = i11;
            FrameLayout frameLayout = fzVar.f28615n;
            if (SystemClock.elapsedRealtime() - fzVar.B2 >= ViewConfiguration.getTapTimeout()) {
                fzVar.D += f9;
                if (fzVar.h.getCurrentItem() == 0) {
                    dp = AndroidUtilities.dp(38.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                float f10 = fzVar.D;
                if (f10 >= dp) {
                    fzVar.O(false);
                } else if (f10 <= (-dp)) {
                    fzVar.O(true);
                } else if ((frameLayout.getTag() == null && fzVar.D < 0.0f) || (frameLayout.getTag() != null && fzVar.D > 0.0f)) {
                    fzVar.D = 0.0f;
                }
            }
        }
    }
}
