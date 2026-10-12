package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public class vz extends s4.r0 {
    public final int f30680a;
    public boolean f30681b;
    public final wz f30682c;

    public vz(wz wzVar, int i10) {
        this.f30682c = wzVar;
        this.f30680a = i10;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        iz izVar;
        float f7;
        int i11;
        wz wzVar = this.f30682c;
        ObjectAnimator[] objectAnimatorArr = wzVar.R0;
        s4.x0 x0Var = recyclerView.getLayoutManager().e;
        boolean z10 = true;
        if (x0Var != null && x0Var.e) {
            this.f30681b = true;
            return;
        }
        int i12 = this.f30680a;
        if (i10 == 0) {
            if (!this.f30681b) {
                int[] iArr = wzVar.Q0;
                wy wyVar = wzVar.f31067t1;
                if ((wyVar == null || !wyVar.z()) && i12 != 0) {
                    float f10 = 48.0f;
                    if (i12 == 1) {
                        f7 = 36.0f;
                    } else {
                        f7 = 48.0f;
                    }
                    float dpf2 = AndroidUtilities.dpf2(f7);
                    float f11 = iArr[i12] / (-dpf2);
                    if (f11 > 0.0f && f11 < 1.0f) {
                        HorizontalScrollView z11 = wzVar.z(i12);
                        int i13 = (f11 > 0.5f ? 1 : (f11 == 0.5f ? 0 : -1));
                        if (i13 > 0) {
                            i11 = (int) (-Math.ceil(dpf2));
                        } else {
                            i11 = 0;
                        }
                        if (i13 > 0) {
                            wzVar.i(i12, i11, false);
                        }
                        if (i12 == 1) {
                            wzVar.m(i11);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i12];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z11, View.TRANSLATION_Y, z11.getTranslationY(), i11);
                            objectAnimatorArr[i12] = ofFloat;
                            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.p2(wzVar, i12, 3));
                            objectAnimatorArr[i12].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(z11.getTranslationY(), i11);
                        }
                        objectAnimatorArr[i12].start();
                    } else {
                        mm0 y3 = wzVar.y(i12);
                        if (i12 == 1) {
                            f10 = 38.0f;
                        }
                        int dp = AndroidUtilities.dp(f10);
                        s4.b1 K = y3.K(0);
                        if (K != null) {
                            int bottom = K.f44838a.getBottom();
                            int i14 = iArr[i12];
                            float f12 = (bottom - (dp + i14)) / wzVar.f31010b1;
                            if (f12 > 0.0f || f12 < 1.0f) {
                                if (f12 <= 0.5f) {
                                    z10 = false;
                                }
                                wzVar.i(i12, i14, z10);
                            }
                        }
                    }
                }
            }
            if (wzVar.J0) {
                wzVar.J0 = false;
            }
            this.f30681b = false;
            return;
        }
        if (i10 == 1) {
            if (wzVar.J0) {
                wzVar.J0 = false;
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        izVar = wzVar.f31049o0;
                    } else {
                        throw new IllegalArgumentException(i2.d.i(i12, "Unexpected argument: "));
                    }
                } else {
                    izVar = wzVar.V;
                }
            } else {
                izVar = wzVar.G0;
            }
            if (izVar != null) {
                izVar.b();
            }
            this.f30681b = false;
        }
        if (!this.f30681b && (objectAnimator = objectAnimatorArr[i12]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i12].cancel();
        }
        if (i12 == 0) {
            if (wzVar.T0 == null) {
                hg.f1 f1Var = new hg.f1(wzVar, wzVar.f31014c1, wzVar.f31067t1.a(), wzVar.f31067t1.f(), 1);
                wzVar.T0 = f1Var;
                f1Var.a();
            }
            wzVar.T0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int dp;
        wz wzVar = this.f30682c;
        int i12 = this.f30680a;
        wzVar.q(i12);
        wz.e(wzVar, i12, i11);
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    wz.f(wzVar, false);
                }
            } else {
                wzVar.l(false);
            }
        } else {
            wzVar.r(false);
        }
        if (!this.f30681b) {
            float f7 = i11;
            FrameLayout frameLayout = wzVar.f31045n;
            if (SystemClock.elapsedRealtime() - wzVar.E2 >= ViewConfiguration.getTapTimeout()) {
                wzVar.H += f7;
                if (wzVar.h.getCurrentItem() == 0) {
                    dp = AndroidUtilities.dp(38.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                float f10 = wzVar.H;
                if (f10 >= dp) {
                    wzVar.M(false);
                } else if (f10 <= (-dp)) {
                    wzVar.M(true);
                } else if ((frameLayout.getTag() == null && wzVar.H < 0.0f) || (frameLayout.getTag() != null && wzVar.H > 0.0f)) {
                    wzVar.H = 0.0f;
                }
            }
        }
    }
}
