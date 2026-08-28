package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public class vy extends f2.d1 {
    public final int f34023a;
    public boolean f34024b;
    public final wy f34025c;

    public vy(wy wyVar, int i9) {
        this.f34025c = wyVar;
        this.f34023a = i9;
    }

    @Override
    public void a(RecyclerView recyclerView, int i9) {
        ObjectAnimator objectAnimator;
        jy jyVar;
        float f10;
        int i10;
        wy wyVar = this.f34025c;
        ObjectAnimator[] objectAnimatorArr = wyVar.N0;
        f2.m1 m1Var = recyclerView.getLayoutManager().f5565e;
        boolean z10 = true;
        if (m1Var != null && m1Var.f5446e) {
            this.f34024b = true;
            return;
        }
        int i11 = this.f34023a;
        if (i9 == 0) {
            if (!this.f34024b) {
                int[] iArr = wyVar.M0;
                wx wxVar = wyVar.f34432p1;
                if ((wxVar == null || !wxVar.z()) && i11 != 0) {
                    float f11 = 48.0f;
                    if (i11 == 1) {
                        f10 = 36.0f;
                    } else {
                        f10 = 48.0f;
                    }
                    float dpf2 = AndroidUtilities.dpf2(f10);
                    float f12 = iArr[i11] / (-dpf2);
                    if (f12 > 0.0f && f12 < 1.0f) {
                        HorizontalScrollView y10 = wyVar.y(i11);
                        int i12 = (f12 > 0.5f ? 1 : (f12 == 0.5f ? 0 : -1));
                        if (i12 > 0) {
                            i10 = (int) (-Math.ceil(dpf2));
                        } else {
                            i10 = 0;
                        }
                        if (i12 > 0) {
                            wyVar.i(i11, i10, false);
                        }
                        if (i11 == 1) {
                            wyVar.m(i10);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10, View.TRANSLATION_Y, y10.getTranslationY(), i10);
                            objectAnimatorArr[i11] = ofFloat;
                            ofFloat.addUpdateListener(new dh.b(wyVar, i11, 4));
                            objectAnimatorArr[i11].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(y10.getTranslationY(), i10);
                        }
                        objectAnimatorArr[i11].start();
                    } else {
                        wk0 x10 = wyVar.x(i11);
                        if (i11 == 1) {
                            f11 = 38.0f;
                        }
                        int dp = AndroidUtilities.dp(f11);
                        f2.q1 K = x10.K(0);
                        if (K != null) {
                            int bottom = K.f5501a.getBottom();
                            int i13 = iArr[i11];
                            float f13 = (bottom - (dp + i13)) / wyVar.X0;
                            if (f13 > 0.0f || f13 < 1.0f) {
                                if (f13 <= 0.5f) {
                                    z10 = false;
                                }
                                wyVar.i(i11, i13, z10);
                            }
                        }
                    }
                }
            }
            if (wyVar.F0) {
                wyVar.F0 = false;
            }
            this.f34024b = false;
            return;
        }
        if (i9 == 1) {
            if (wyVar.F0) {
                wyVar.F0 = false;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        jyVar = wyVar.f34417k0;
                    } else {
                        throw new IllegalArgumentException(j3.r0.l(i11, "Unexpected argument: "));
                    }
                } else {
                    jyVar = wyVar.R;
                }
            } else {
                jyVar = wyVar.C0;
            }
            if (jyVar != null) {
                jyVar.b();
            }
            this.f34024b = false;
        }
        if (!this.f34024b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i11].cancel();
        }
        if (i11 == 0) {
            if (wyVar.P0 == null) {
                of.b1 b1Var = new of.b1(wyVar, wyVar.Y0, wyVar.f34432p1.a(), wyVar.f34432p1.f(), 1);
                wyVar.P0 = b1Var;
                b1Var.a();
            }
            wyVar.P0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i9, int i10) {
        int dp;
        wy wyVar = this.f34025c;
        int i11 = this.f34023a;
        wyVar.p(i11);
        wy.e(wyVar, i11, i10);
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    wy.f(wyVar, false);
                }
            } else {
                wyVar.l(false);
            }
        } else {
            wyVar.q(false);
        }
        if (!this.f34024b) {
            float f10 = i10;
            FrameLayout frameLayout = wyVar.f34424n;
            if (SystemClock.elapsedRealtime() - wyVar.B2 >= ViewConfiguration.getTapTimeout()) {
                wyVar.D += f10;
                if (wyVar.h.getCurrentItem() == 0) {
                    dp = AndroidUtilities.dp(38.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                float f11 = wyVar.D;
                if (f11 >= dp) {
                    wyVar.N(false);
                } else if (f11 <= (-dp)) {
                    wyVar.N(true);
                } else if ((frameLayout.getTag() == null && wyVar.D < 0.0f) || (frameLayout.getTag() != null && wyVar.D > 0.0f)) {
                    wyVar.D = 0.0f;
                }
            }
        }
    }
}
