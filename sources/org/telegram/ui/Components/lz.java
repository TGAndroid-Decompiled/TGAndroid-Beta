package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public class lz extends f2.a1 {
    public final int f28904a;
    public boolean f28905b;
    public final mz f28906c;

    public lz(mz mzVar, int i10) {
        this.f28906c = mzVar;
        this.f28904a = i10;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        yy yyVar;
        float f10;
        int i11;
        mz mzVar = this.f28906c;
        ObjectAnimator[] objectAnimatorArr = mzVar.O0;
        f2.i1 i1Var = recyclerView.getLayoutManager().f5943e;
        boolean z4 = true;
        if (i1Var != null && i1Var.f5808e) {
            this.f28905b = true;
            return;
        }
        int i12 = this.f28904a;
        if (i10 == 0) {
            if (!this.f28905b) {
                int[] iArr = mzVar.N0;
                my myVar = mzVar.f29317q1;
                if ((myVar == null || !myVar.z()) && i12 != 0) {
                    float f11 = 48.0f;
                    if (i12 == 1) {
                        f10 = 36.0f;
                    } else {
                        f10 = 48.0f;
                    }
                    float dpf2 = AndroidUtilities.dpf2(f10);
                    float f12 = iArr[i12] / (-dpf2);
                    if (f12 > 0.0f && f12 < 1.0f) {
                        HorizontalScrollView y10 = mzVar.y(i12);
                        int i13 = (f12 > 0.5f ? 1 : (f12 == 0.5f ? 0 : -1));
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
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10, View.TRANSLATION_Y, y10.getTranslationY(), i11);
                            objectAnimatorArr[i12] = ofFloat;
                            ofFloat.addUpdateListener(new jh.b(mzVar, i12, 4));
                            objectAnimatorArr[i12].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(y10.getTranslationY(), i11);
                        }
                        objectAnimatorArr[i12].start();
                    } else {
                        sl0 x10 = mzVar.x(i12);
                        if (i12 == 1) {
                            f11 = 38.0f;
                        }
                        int dp = AndroidUtilities.dp(f11);
                        f2.m1 K = x10.K(0);
                        if (K != null) {
                            int bottom = K.f5875a.getBottom();
                            int i14 = iArr[i12];
                            float f13 = (bottom - (dp + i14)) / mzVar.Y0;
                            if (f13 > 0.0f || f13 < 1.0f) {
                                if (f13 <= 0.5f) {
                                    z4 = false;
                                }
                                mzVar.i(i12, i14, z4);
                            }
                        }
                    }
                }
            }
            if (mzVar.G0) {
                mzVar.G0 = false;
            }
            this.f28905b = false;
            return;
        }
        if (i10 == 1) {
            if (mzVar.G0) {
                mzVar.G0 = false;
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        yyVar = mzVar.f29302l0;
                    } else {
                        throw new IllegalArgumentException(l.d.j(i12, "Unexpected argument: "));
                    }
                } else {
                    yyVar = mzVar.S;
                }
            } else {
                yyVar = mzVar.D0;
            }
            if (yyVar != null) {
                yyVar.b();
            }
            this.f28905b = false;
        }
        if (!this.f28905b && (objectAnimator = objectAnimatorArr[i12]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[i12].cancel();
        }
        if (i12 == 0) {
            if (mzVar.Q0 == null) {
                bx bxVar = new bx(mzVar, mzVar.Z0, mzVar.f29317q1.a(), mzVar.f29317q1.f(), 0);
                mzVar.Q0 = bxVar;
                bxVar.a();
            }
            mzVar.Q0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int dp;
        mz mzVar = this.f28906c;
        int i12 = this.f28904a;
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
        if (!this.f28905b) {
            float f10 = i11;
            FrameLayout frameLayout = mzVar.f29306n;
            if (SystemClock.elapsedRealtime() - mzVar.C2 >= ViewConfiguration.getTapTimeout()) {
                mzVar.E += f10;
                if (mzVar.h.getCurrentItem() == 0) {
                    dp = AndroidUtilities.dp(38.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                float f11 = mzVar.E;
                if (f11 >= dp) {
                    mzVar.O(false);
                } else if (f11 <= (-dp)) {
                    mzVar.O(true);
                } else if ((frameLayout.getTag() == null && mzVar.E < 0.0f) || (frameLayout.getTag() != null && mzVar.E > 0.0f)) {
                    mzVar.E = 0.0f;
                }
            }
        }
    }
}
