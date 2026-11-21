package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
public class sy extends v4.u0 {
    public final int f39728a;
    public boolean f39729b;
    public final ty f39730c;

    public sy(ty tyVar, int i7) {
        this.f39730c = tyVar;
        this.f39728a = i7;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        ObjectAnimator objectAnimator;
        gy gyVar;
        float f10;
        int i10;
        ty tyVar = this.f39730c;
        ObjectAnimator[] objectAnimatorArr = tyVar.S0;
        v4.b1 b1Var = recyclerView.getLayoutManager().f59248e;
        boolean z10 = true;
        if (b1Var != null && b1Var.f59108e) {
            this.f39729b = true;
            return;
        }
        int i11 = this.f39728a;
        if (i7 == 0) {
            if (!this.f39729b) {
                int[] iArr = tyVar.R0;
                tx txVar = tyVar.f40151u1;
                if ((txVar == null || !txVar.z()) && i11 != 0) {
                    float f11 = 48.0f;
                    if (i11 == 1) {
                        f10 = 36.0f;
                    } else {
                        f10 = 48.0f;
                    }
                    float N = org.telegram.messenger.g0.N(f10);
                    float f12 = iArr[i11] / (-N);
                    if (f12 > 0.0f && f12 < 1.0f) {
                        HorizontalScrollView y10 = tyVar.y(i11);
                        int i12 = (f12 > 0.5f ? 1 : (f12 == 0.5f ? 0 : -1));
                        if (i12 > 0) {
                            i10 = (int) (-Math.ceil(N));
                        } else {
                            i10 = 0;
                        }
                        if (i12 > 0) {
                            tyVar.i(i11, i10, false);
                        }
                        if (i11 == 1) {
                            tyVar.m(i10);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10, View.TRANSLATION_Y, y10.getTranslationY(), i10);
                            objectAnimatorArr[i11] = ofFloat;
                            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.j2(tyVar, i11, 3));
                            objectAnimatorArr[i11].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(y10.getTranslationY(), i10);
                        }
                        objectAnimatorArr[i11].start();
                    } else {
                        ek0 x10 = tyVar.x(i11);
                        if (i11 == 1) {
                            f11 = 38.0f;
                        }
                        int L = org.telegram.messenger.g0.L(f11);
                        v4.f1 K = x10.K(0);
                        if (K != null) {
                            int bottom = K.f59161a.getBottom();
                            int i13 = iArr[i11];
                            float f13 = (bottom - (L + i13)) / tyVar.f40096c1;
                            if (f13 > 0.0f || f13 < 1.0f) {
                                if (f13 <= 0.5f) {
                                    z10 = false;
                                }
                                tyVar.i(i11, i13, z10);
                            }
                        }
                    }
                }
            }
            if (tyVar.K0) {
                tyVar.K0 = false;
            }
            this.f39729b = false;
            return;
        }
        if (i7 == 1) {
            if (tyVar.K0) {
                tyVar.K0 = false;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        gyVar = tyVar.f40133p0;
                    } else {
                        throw new IllegalArgumentException(i5.c.i(i11, "Unexpected argument: "));
                    }
                } else {
                    gyVar = tyVar.W;
                }
            } else {
                gyVar = tyVar.H0;
            }
            if (gyVar != null) {
                gyVar.b();
            }
            this.f39729b = false;
        }
        if (!this.f39729b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i11].cancel();
        }
        if (i11 == 0) {
            if (tyVar.U0 == null) {
                jg.d1 d1Var = new jg.d1(tyVar, tyVar.f40099d1, tyVar.f40151u1.a(), tyVar.f40151u1.f(), 1);
                tyVar.U0 = d1Var;
                d1Var.a();
            }
            tyVar.U0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        int L;
        ty tyVar = this.f39730c;
        int i11 = this.f39728a;
        tyVar.p(i11);
        ty.e(tyVar, i11, i10);
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ty.f(tyVar, false);
                }
            } else {
                tyVar.l(false);
            }
        } else {
            tyVar.q(false);
        }
        if (!this.f39729b) {
            float f10 = i10;
            FrameLayout frameLayout = tyVar.f40127n;
            if (SystemClock.elapsedRealtime() - tyVar.E2 >= ViewConfiguration.getTapTimeout()) {
                tyVar.I += f10;
                if (tyVar.h.getCurrentItem() == 0) {
                    L = org.telegram.messenger.g0.L(38.0f);
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                float f11 = tyVar.I;
                if (f11 >= L) {
                    tyVar.N(false);
                } else if (f11 <= (-L)) {
                    tyVar.N(true);
                } else if ((frameLayout.getTag() == null && tyVar.I < 0.0f) || (frameLayout.getTag() != null && tyVar.I > 0.0f)) {
                    tyVar.I = 0.0f;
                }
            }
        }
    }
}
