package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public class rz extends s4.u0 {
    public final int f32346a;
    public boolean f32347b;
    public final sz f32348c;

    public rz(sz szVar, int i10) {
        this.f32348c = szVar;
        this.f32346a = i10;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        fz fzVar;
        float f7;
        int i11;
        sz szVar = this.f32348c;
        ObjectAnimator[] objectAnimatorArr = szVar.R0;
        s4.a1 a1Var = recyclerView.getLayoutManager().e;
        boolean z10 = true;
        if (a1Var != null && a1Var.e) {
            this.f32347b = true;
            return;
        }
        int i12 = this.f32346a;
        if (i10 == 0) {
            if (!this.f32347b) {
                int[] iArr = szVar.Q0;
                ty tyVar = szVar.f32769t1;
                if ((tyVar == null || !tyVar.z()) && i12 != 0) {
                    float f10 = 48.0f;
                    if (i12 == 1) {
                        f7 = 36.0f;
                    } else {
                        f7 = 48.0f;
                    }
                    float dpf2 = AndroidUtilities.dpf2(f7);
                    float f11 = iArr[i12] / (-dpf2);
                    if (f11 > 0.0f && f11 < 1.0f) {
                        HorizontalScrollView y3 = szVar.y(i12);
                        int i13 = (f11 > 0.5f ? 1 : (f11 == 0.5f ? 0 : -1));
                        if (i13 > 0) {
                            i11 = (int) (-Math.ceil(dpf2));
                        } else {
                            i11 = 0;
                        }
                        if (i13 > 0) {
                            szVar.i(i12, i11, false);
                        }
                        if (i12 == 1) {
                            szVar.m(i11);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[i12];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y3, View.TRANSLATION_Y, y3.getTranslationY(), i11);
                            objectAnimatorArr[i12] = ofFloat;
                            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.u2(szVar, i12, 3));
                            objectAnimatorArr[i12].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(y3.getTranslationY(), i11);
                        }
                        objectAnimatorArr[i12].start();
                    } else {
                        mm0 x9 = szVar.x(i12);
                        if (i12 == 1) {
                            f10 = 38.0f;
                        }
                        int dp = AndroidUtilities.dp(f10);
                        s4.e1 K = x9.K(0);
                        if (K != null) {
                            int bottom = K.f47735a.getBottom();
                            int i14 = iArr[i12];
                            float f12 = (bottom - (dp + i14)) / szVar.f32712b1;
                            if (f12 > 0.0f || f12 < 1.0f) {
                                if (f12 <= 0.5f) {
                                    z10 = false;
                                }
                                szVar.i(i12, i14, z10);
                            }
                        }
                    }
                }
            }
            if (szVar.J0) {
                szVar.J0 = false;
            }
            this.f32347b = false;
            return;
        }
        if (i10 == 1) {
            if (szVar.J0) {
                szVar.J0 = false;
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        fzVar = szVar.f32751o0;
                    } else {
                        throw new IllegalArgumentException(ic.a.i(i12, "Unexpected argument: "));
                    }
                } else {
                    fzVar = szVar.V;
                }
            } else {
                fzVar = szVar.G0;
            }
            if (fzVar != null) {
                fzVar.b();
            }
            this.f32347b = false;
        }
        if (!this.f32347b && (objectAnimator = objectAnimatorArr[i12]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i12].cancel();
        }
        if (i12 == 0) {
            if (szVar.T0 == null) {
                ig.f1 f1Var = new ig.f1(szVar, szVar.f32716c1, szVar.f32769t1.a(), szVar.f32769t1.f(), 1);
                szVar.T0 = f1Var;
                f1Var.a();
            }
            szVar.T0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int dp;
        sz szVar = this.f32348c;
        int i12 = this.f32346a;
        szVar.p(i12);
        sz.e(szVar, i12, i11);
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    sz.f(szVar, false);
                }
            } else {
                szVar.l(false);
            }
        } else {
            szVar.q(false);
        }
        if (!this.f32347b) {
            float f7 = i11;
            FrameLayout frameLayout = szVar.f32747n;
            if (SystemClock.elapsedRealtime() - szVar.D2 >= ViewConfiguration.getTapTimeout()) {
                szVar.H += f7;
                if (szVar.h.getCurrentItem() == 0) {
                    dp = AndroidUtilities.dp(38.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                float f10 = szVar.H;
                if (f10 >= dp) {
                    szVar.M(false);
                } else if (f10 <= (-dp)) {
                    szVar.M(true);
                } else if ((frameLayout.getTag() == null && szVar.H < 0.0f) || (frameLayout.getTag() != null && szVar.H > 0.0f)) {
                    szVar.H = 0.0f;
                }
            }
        }
    }
}
