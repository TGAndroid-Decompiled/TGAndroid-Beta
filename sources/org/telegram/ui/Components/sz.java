package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public class sz extends s4.r0 {
    public final int f30379a;
    public boolean f30380b;
    public final tz f30381c;

    public sz(tz tzVar, int i10) {
        this.f30381c = tzVar;
        this.f30379a = i10;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        gz gzVar;
        float f7;
        int i11;
        tz tzVar = this.f30381c;
        ObjectAnimator[] objectAnimatorArr = tzVar.R0;
        s4.x0 x0Var = recyclerView.getLayoutManager().e;
        boolean z10 = true;
        if (x0Var != null && x0Var.e) {
            this.f30380b = true;
            return;
        }
        int i12 = this.f30379a;
        if (i10 == 0) {
            if (!this.f30380b) {
                int[] iArr = tzVar.Q0;
                uy uyVar = tzVar.f30780t1;
                if ((uyVar == null || !uyVar.z()) && i12 != 0) {
                    float f10 = 48.0f;
                    if (i12 == 1) {
                        f7 = 36.0f;
                    } else {
                        f7 = 48.0f;
                    }
                    float dpf2 = AndroidUtilities.dpf2(f7);
                    float f11 = iArr[i12] / (-dpf2);
                    if (f11 > 0.0f && f11 < 1.0f) {
                        HorizontalScrollView z11 = tzVar.z(i12);
                        int i13 = (f11 > 0.5f ? 1 : (f11 == 0.5f ? 0 : -1));
                        if (i13 > 0) {
                            i11 = (int) (-Math.ceil(dpf2));
                        } else {
                            i11 = 0;
                        }
                        if (i13 > 0) {
                            tzVar.i(i12, i11, false);
                        }
                        if (i12 == 1) {
                            tzVar.m(i11);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i12];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z11, View.TRANSLATION_Y, z11.getTranslationY(), i11);
                            objectAnimatorArr[i12] = ofFloat;
                            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(tzVar, i12, 3));
                            objectAnimatorArr[i12].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(z11.getTranslationY(), i11);
                        }
                        objectAnimatorArr[i12].start();
                    } else {
                        jm0 y3 = tzVar.y(i12);
                        if (i12 == 1) {
                            f10 = 38.0f;
                        }
                        int dp = AndroidUtilities.dp(f10);
                        s4.b1 K = y3.K(0);
                        if (K != null) {
                            int bottom = K.f45921a.getBottom();
                            int i14 = iArr[i12];
                            float f12 = (bottom - (dp + i14)) / tzVar.f30723b1;
                            if (f12 > 0.0f || f12 < 1.0f) {
                                if (f12 <= 0.5f) {
                                    z10 = false;
                                }
                                tzVar.i(i12, i14, z10);
                            }
                        }
                    }
                }
            }
            if (tzVar.J0) {
                tzVar.J0 = false;
            }
            this.f30380b = false;
            return;
        }
        if (i10 == 1) {
            if (tzVar.J0) {
                tzVar.J0 = false;
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        gzVar = tzVar.f30762o0;
                    } else {
                        throw new IllegalArgumentException(i2.e.j(i12, "Unexpected argument: "));
                    }
                } else {
                    gzVar = tzVar.V;
                }
            } else {
                gzVar = tzVar.G0;
            }
            if (gzVar != null) {
                gzVar.b();
            }
            this.f30380b = false;
        }
        if (!this.f30380b && (objectAnimator = objectAnimatorArr[i12]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i12].cancel();
        }
        if (i12 == 0) {
            if (tzVar.T0 == null) {
                hg.f1 f1Var = new hg.f1(tzVar, tzVar.f30727c1, tzVar.f30780t1.a(), tzVar.f30780t1.f(), 1);
                tzVar.T0 = f1Var;
                f1Var.a();
            }
            tzVar.T0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int dp;
        tz tzVar = this.f30381c;
        int i12 = this.f30379a;
        tzVar.p(i12);
        tz.e(tzVar, i12, i11);
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    tz.f(tzVar, false);
                }
            } else {
                tzVar.l(false);
            }
        } else {
            tzVar.q(false);
        }
        if (!this.f30380b) {
            float f7 = i11;
            FrameLayout frameLayout = tzVar.f30758n;
            if (SystemClock.elapsedRealtime() - tzVar.E2 >= ViewConfiguration.getTapTimeout()) {
                tzVar.H += f7;
                if (tzVar.h.getCurrentItem() == 0) {
                    dp = AndroidUtilities.dp(38.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                float f10 = tzVar.H;
                if (f10 >= dp) {
                    tzVar.M(false);
                } else if (f10 <= (-dp)) {
                    tzVar.M(true);
                } else if ((frameLayout.getTag() == null && tzVar.H < 0.0f) || (frameLayout.getTag() != null && tzVar.H > 0.0f)) {
                    tzVar.H = 0.0f;
                }
            }
        }
    }
}
