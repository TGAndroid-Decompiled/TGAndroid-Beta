package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public class kz extends s4.s0 {
    public final int f25907a;
    public boolean f25908b;
    public final lz f25909c;

    public kz(lz lzVar, int i10) {
        this.f25909c = lzVar;
        this.f25907a = i10;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        yy yyVar;
        float f7;
        int i11;
        lz lzVar = this.f25909c;
        ObjectAnimator[] objectAnimatorArr = lzVar.R0;
        s4.y0 y0Var = recyclerView.getLayoutManager().e;
        boolean z10 = true;
        if (y0Var != null && y0Var.e) {
            this.f25908b = true;
            return;
        }
        int i12 = this.f25907a;
        if (i10 == 0) {
            if (!this.f25908b) {
                int[] iArr = lzVar.Q0;
                my myVar = lzVar.f26289t1;
                if ((myVar == null || !myVar.z()) && i12 != 0) {
                    float f10 = 48.0f;
                    if (i12 == 1) {
                        f7 = 36.0f;
                    } else {
                        f7 = 48.0f;
                    }
                    float dpf2 = AndroidUtilities.dpf2(f7);
                    float f11 = iArr[i12] / (-dpf2);
                    if (f11 > 0.0f && f11 < 1.0f) {
                        HorizontalScrollView y3 = lzVar.y(i12);
                        int i13 = (f11 > 0.5f ? 1 : (f11 == 0.5f ? 0 : -1));
                        if (i13 > 0) {
                            i11 = (int) (-Math.ceil(dpf2));
                        } else {
                            i11 = 0;
                        }
                        if (i13 > 0) {
                            lzVar.i(i12, i11, false);
                        }
                        if (i12 == 1) {
                            lzVar.m(i11);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i12];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y3, View.TRANSLATION_Y, y3.getTranslationY(), i11);
                            objectAnimatorArr[i12] = ofFloat;
                            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.p2(lzVar, i12, 3));
                            objectAnimatorArr[i12].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(y3.getTranslationY(), i11);
                        }
                        objectAnimatorArr[i12].start();
                    } else {
                        wl0 x10 = lzVar.x(i12);
                        if (i12 == 1) {
                            f10 = 38.0f;
                        }
                        int dp = AndroidUtilities.dp(f10);
                        s4.c1 K = x10.K(0);
                        if (K != null) {
                            int bottom = K.f42960a.getBottom();
                            int i14 = iArr[i12];
                            float f12 = (bottom - (dp + i14)) / lzVar.f26232b1;
                            if (f12 > 0.0f || f12 < 1.0f) {
                                if (f12 <= 0.5f) {
                                    z10 = false;
                                }
                                lzVar.i(i12, i14, z10);
                            }
                        }
                    }
                }
            }
            if (lzVar.J0) {
                lzVar.J0 = false;
            }
            this.f25908b = false;
            return;
        }
        if (i10 == 1) {
            if (lzVar.J0) {
                lzVar.J0 = false;
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        yyVar = lzVar.f26271o0;
                    } else {
                        throw new IllegalArgumentException(hg.c.h(i12, "Unexpected argument: "));
                    }
                } else {
                    yyVar = lzVar.V;
                }
            } else {
                yyVar = lzVar.G0;
            }
            if (yyVar != null) {
                yyVar.b();
            }
            this.f25908b = false;
        }
        if (!this.f25908b && (objectAnimator = objectAnimatorArr[i12]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i12].cancel();
        }
        if (i12 == 0) {
            if (lzVar.T0 == null) {
                gg.g1 g1Var = new gg.g1(lzVar, lzVar.f26236c1, lzVar.f26289t1.a(), lzVar.f26289t1.f(), 1);
                lzVar.T0 = g1Var;
                g1Var.a();
            }
            lzVar.T0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int dp;
        lz lzVar = this.f25909c;
        int i12 = this.f25907a;
        lzVar.p(i12);
        lz.e(lzVar, i12, i11);
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    lz.f(lzVar, false);
                }
            } else {
                lzVar.l(false);
            }
        } else {
            lzVar.q(false);
        }
        if (!this.f25908b) {
            float f7 = i11;
            FrameLayout frameLayout = lzVar.f26267n;
            if (SystemClock.elapsedRealtime() - lzVar.E2 >= ViewConfiguration.getTapTimeout()) {
                lzVar.H += f7;
                if (lzVar.h.getCurrentItem() == 0) {
                    dp = AndroidUtilities.dp(38.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                float f10 = lzVar.H;
                if (f10 >= dp) {
                    lzVar.M(false);
                } else if (f10 <= (-dp)) {
                    lzVar.M(true);
                } else if ((frameLayout.getTag() == null && lzVar.H < 0.0f) || (frameLayout.getTag() != null && lzVar.H > 0.0f)) {
                    lzVar.H = 0.0f;
                }
            }
        }
    }
}
