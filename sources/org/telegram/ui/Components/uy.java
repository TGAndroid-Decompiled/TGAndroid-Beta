package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
public class uy extends s4.s0 {
    public final int f31110a;
    public boolean f31111b;
    public final vy f31112c;

    public uy(vy vyVar, int i10) {
        this.f31112c = vyVar;
        this.f31110a = i10;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        iy iyVar;
        float f7;
        int i11;
        vy vyVar = this.f31112c;
        ObjectAnimator[] objectAnimatorArr = vyVar.R0;
        s4.y0 y0Var = recyclerView.getLayoutManager().e;
        boolean z10 = true;
        if (y0Var != null && y0Var.e) {
            this.f31111b = true;
            return;
        }
        int i12 = this.f31110a;
        if (i10 == 0) {
            if (!this.f31111b) {
                int[] iArr = vyVar.Q0;
                vx vxVar = vyVar.f31996t1;
                if ((vxVar == null || !vxVar.z()) && i12 != 0) {
                    float f10 = 48.0f;
                    if (i12 == 1) {
                        f7 = 36.0f;
                    } else {
                        f7 = 48.0f;
                    }
                    float N = org.telegram.messenger.i0.N(f7);
                    float f11 = iArr[i12] / (-N);
                    if (f11 > 0.0f && f11 < 1.0f) {
                        HorizontalScrollView z11 = vyVar.z(i12);
                        int i13 = (f11 > 0.5f ? 1 : (f11 == 0.5f ? 0 : -1));
                        if (i13 > 0) {
                            i11 = (int) (-Math.ceil(N));
                        } else {
                            i11 = 0;
                        }
                        if (i13 > 0) {
                            vyVar.i(i12, i11, false);
                        }
                        if (i12 == 1) {
                            vyVar.m(i11);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i12];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z11, View.TRANSLATION_Y, z11.getTranslationY(), i11);
                            objectAnimatorArr[i12] = ofFloat;
                            ofFloat.addUpdateListener(new nh.b(vyVar, i12, 4));
                            objectAnimatorArr[i12].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(z11.getTranslationY(), i11);
                        }
                        objectAnimatorArr[i12].start();
                    } else {
                        uk0 y3 = vyVar.y(i12);
                        if (i12 == 1) {
                            f10 = 38.0f;
                        }
                        int L = org.telegram.messenger.i0.L(f10);
                        s4.c1 K = y3.K(0);
                        if (K != null) {
                            int bottom = K.f47909a.getBottom();
                            int i14 = iArr[i12];
                            float f12 = (bottom - (L + i14)) / vyVar.f31939b1;
                            if (f12 > 0.0f || f12 < 1.0f) {
                                if (f12 <= 0.5f) {
                                    z10 = false;
                                }
                                vyVar.i(i12, i14, z10);
                            }
                        }
                    }
                }
            }
            if (vyVar.J0) {
                vyVar.J0 = false;
            }
            this.f31111b = false;
            return;
        }
        if (i10 == 1) {
            if (vyVar.J0) {
                vyVar.J0 = false;
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        iyVar = vyVar.f31978o0;
                    } else {
                        throw new IllegalArgumentException(i0.a.i(i12, "Unexpected argument: "));
                    }
                } else {
                    iyVar = vyVar.V;
                }
            } else {
                iyVar = vyVar.G0;
            }
            if (iyVar != null) {
                iyVar.b();
            }
            this.f31111b = false;
        }
        if (!this.f31111b && (objectAnimator = objectAnimatorArr[i12]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i12].cancel();
        }
        if (i12 == 0) {
            if (vyVar.T0 == null) {
                mw mwVar = new mw(vyVar, vyVar.f31943c1, vyVar.f31996t1.a(), vyVar.f31996t1.f(), 0);
                vyVar.T0 = mwVar;
                mwVar.a();
            }
            vyVar.T0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int L;
        vy vyVar = this.f31112c;
        int i12 = this.f31110a;
        vyVar.p(i12);
        vy.e(vyVar, i12, i11);
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    vy.f(vyVar, false);
                }
            } else {
                vyVar.l(false);
            }
        } else {
            vyVar.q(false);
        }
        if (!this.f31111b) {
            float f7 = i11;
            FrameLayout frameLayout = vyVar.f31974n;
            if (SystemClock.elapsedRealtime() - vyVar.D2 >= ViewConfiguration.getTapTimeout()) {
                vyVar.H += f7;
                if (vyVar.h.getCurrentItem() == 0) {
                    L = org.telegram.messenger.i0.L(38.0f);
                } else {
                    L = org.telegram.messenger.i0.L(48.0f);
                }
                float f10 = vyVar.H;
                if (f10 >= L) {
                    vyVar.N(false);
                } else if (f10 <= (-L)) {
                    vyVar.N(true);
                } else if ((frameLayout.getTag() == null && vyVar.H < 0.0f) || (frameLayout.getTag() != null && vyVar.H > 0.0f)) {
                    vyVar.H = 0.0f;
                }
            }
        }
    }
}
