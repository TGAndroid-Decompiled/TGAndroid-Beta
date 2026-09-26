package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public class lz extends s4.s0 {
    public final int f26199a;
    public boolean f26200b;
    public final mz f26201c;

    public lz(mz mzVar, int i10) {
        this.f26201c = mzVar;
        this.f26199a = i10;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        zy zyVar;
        float f7;
        int i11;
        mz mzVar = this.f26201c;
        ObjectAnimator[] objectAnimatorArr = mzVar.R0;
        s4.y0 y0Var = recyclerView.getLayoutManager().e;
        boolean z10 = true;
        if (y0Var != null && y0Var.e) {
            this.f26200b = true;
            return;
        }
        int i12 = this.f26199a;
        if (i10 == 0) {
            if (!this.f26200b) {
                int[] iArr = mzVar.Q0;
                ny nyVar = mzVar.f26601t1;
                if ((nyVar == null || !nyVar.z()) && i12 != 0) {
                    float f10 = 48.0f;
                    if (i12 == 1) {
                        f7 = 36.0f;
                    } else {
                        f7 = 48.0f;
                    }
                    float dpf2 = AndroidUtilities.dpf2(f7);
                    float f11 = iArr[i12] / (-dpf2);
                    if (f11 > 0.0f && f11 < 1.0f) {
                        HorizontalScrollView y3 = mzVar.y(i12);
                        int i13 = (f11 > 0.5f ? 1 : (f11 == 0.5f ? 0 : -1));
                        if (i13 > 0) {
                            i11 = (int) (-Math.ceil(dpf2));
                        } else {
                            i11 = 0;
                        }
                        if (i13 > 0) {
                            mzVar.i(i12, i11, false);
                        }
                        if (i12 == 1) {
                            mzVar.m(i11);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i12];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y3, View.TRANSLATION_Y, y3.getTranslationY(), i11);
                            objectAnimatorArr[i12] = ofFloat;
                            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.p2(mzVar, i12, 3));
                            objectAnimatorArr[i12].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(y3.getTranslationY(), i11);
                        }
                        objectAnimatorArr[i12].start();
                    } else {
                        xl0 x10 = mzVar.x(i12);
                        if (i12 == 1) {
                            f10 = 38.0f;
                        }
                        int dp = AndroidUtilities.dp(f10);
                        s4.c1 K = x10.K(0);
                        if (K != null) {
                            int bottom = K.f42959a.getBottom();
                            int i14 = iArr[i12];
                            float f12 = (bottom - (dp + i14)) / mzVar.f26544b1;
                            if (f12 > 0.0f || f12 < 1.0f) {
                                if (f12 <= 0.5f) {
                                    z10 = false;
                                }
                                mzVar.i(i12, i14, z10);
                            }
                        }
                    }
                }
            }
            if (mzVar.J0) {
                mzVar.J0 = false;
            }
            this.f26200b = false;
            return;
        }
        if (i10 == 1) {
            if (mzVar.J0) {
                mzVar.J0 = false;
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        zyVar = mzVar.f26583o0;
                    } else {
                        throw new IllegalArgumentException(hg.c.h(i12, "Unexpected argument: "));
                    }
                } else {
                    zyVar = mzVar.V;
                }
            } else {
                zyVar = mzVar.G0;
            }
            if (zyVar != null) {
                zyVar.b();
            }
            this.f26200b = false;
        }
        if (!this.f26200b && (objectAnimator = objectAnimatorArr[i12]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i12].cancel();
        }
        if (i12 == 0) {
            if (mzVar.T0 == null) {
                gg.g1 g1Var = new gg.g1(mzVar, mzVar.f26548c1, mzVar.f26601t1.a(), mzVar.f26601t1.f(), 1);
                mzVar.T0 = g1Var;
                g1Var.a();
            }
            mzVar.T0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int dp;
        mz mzVar = this.f26201c;
        int i12 = this.f26199a;
        mzVar.p(i12);
        mz.e(mzVar, i12, i11);
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    mz.f(mzVar, false);
                }
            } else {
                mzVar.l(false);
            }
        } else {
            mzVar.q(false);
        }
        if (!this.f26200b) {
            float f7 = i11;
            FrameLayout frameLayout = mzVar.f26579n;
            if (SystemClock.elapsedRealtime() - mzVar.E2 >= ViewConfiguration.getTapTimeout()) {
                mzVar.H += f7;
                if (mzVar.h.getCurrentItem() == 0) {
                    dp = AndroidUtilities.dp(38.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                float f10 = mzVar.H;
                if (f10 >= dp) {
                    mzVar.M(false);
                } else if (f10 <= (-dp)) {
                    mzVar.M(true);
                } else if ((frameLayout.getTag() == null && mzVar.H < 0.0f) || (frameLayout.getTag() != null && mzVar.H > 0.0f)) {
                    mzVar.H = 0.0f;
                }
            }
        }
    }
}
