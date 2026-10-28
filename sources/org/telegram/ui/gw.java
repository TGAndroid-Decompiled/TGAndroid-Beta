package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class gw extends s4.u0 {
    public boolean f39698a;
    public final dy f39699b;
    public final wx f39700c;
    public final ey d;

    public gw(ey eyVar, dy dyVar, wx wxVar) {
        this.d = eyVar;
        this.f39699b = dyVar;
        this.f39700c = wxVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        ey eyVar = this.d;
        if (i10 == 1) {
            this.f39698a = true;
            eyVar.f39001e3 = true;
            a8.ng ngVar = eyVar.f38998e0[0].f38703b;
            ValueAnimator valueAnimator = (ValueAnimator) ngVar.f640c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) ngVar.f640c).cancel();
                ngVar.f640c = null;
            }
            if (eyVar.X.f30347r.getText().length() == 0 && eyVar.X.f30347r.hasFocus()) {
                AndroidUtilities.hideKeyboard(eyVar.X.f30347r);
                eyVar.X.f30347r.clearFocus();
            }
        } else {
            eyVar.f39001e3 = false;
        }
        if (i10 == 0) {
            this.f39698a = false;
            eyVar.f39000e2 = false;
            boolean z10 = eyVar.f38983b1;
            dy dyVar = this.f39699b;
            if (z10) {
                eyVar.f38983b1 = false;
                if (eyVar.f38994d1) {
                    zx zxVar = dyVar.f38702a;
                    int i11 = zx.C3;
                    zxVar.G1();
                    eyVar.f38994d1 = false;
                }
                dyVar.d.l();
            }
            ey.s1(eyVar, dyVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ch.f fVar;
        zx zxVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i13;
        boolean z10;
        Object[] objArr;
        this.f39700c.V();
        dy dyVar = this.f39699b;
        cw cwVar = dyVar.f38710x;
        int i14 = -i11;
        ArrayList arrayList = cwVar.f30628x;
        ArrayList arrayList2 = cwVar.f30620o;
        boolean z11 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((s4.e1) arrayList2.get(i15)).f47773a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((s4.e1) arrayList.get(i16)).f47773a;
                view2.setTranslationY(view2.getTranslationY() + i14);
            }
        }
        int i17 = -1;
        int i18 = -1;
        for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
            int R = RecyclerView.R(recyclerView.getChildAt(i19));
            if (R >= 0) {
                if (i17 == -1 || R > i17) {
                    i17 = R;
                }
                if (i18 == -1 || R < i18) {
                    i18 = R;
                }
            }
        }
        ey eyVar = this.d;
        eyVar.z3(dyVar);
        eyVar.Q = true;
        View view3 = eyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (eyVar.R0 != 10 && this.f39698a && recyclerView.getChildCount() > 0 && i18 != -1) {
            s4.e1 K = recyclerView.K(i18);
            if (!eyVar.h4() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f47773a.getTop();
                } else {
                    i13 = 0;
                }
                int i20 = eyVar.Y1;
                if (i20 == i18) {
                    int i21 = eyVar.Z1;
                    int i22 = i21 - i13;
                    if (i13 < i21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(i22) <= 1) {
                        objArr = null;
                        if (objArr != null && eyVar.a2 && (z10 || eyVar.f39001e3)) {
                            eyVar.k4(z10);
                        }
                        eyVar.Y1 = i18;
                        eyVar.Z1 = i13;
                        eyVar.a2 = true;
                    }
                } else if (i18 > i20) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objArr = 1;
                if (objArr != null) {
                    eyVar.k4(z10);
                }
                eyVar.Y1 = i18;
                eyVar.Z1 = i13;
                eyVar.a2 = true;
            }
        }
        if (!eyVar.K && recyclerView == eyVar.f38998e0[0].f38702a && !eyVar.f39026j2) {
            kVar = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
                if (!kVar2.q() && !eyVar.f39000e2 && !eyVar.G3.c()) {
                    if (i11 > 0 && eyVar.h4() && eyVar.f38998e0[0].f38708s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i11 > 0) {
                            if (top < 0) {
                                i11 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    eyVar.Q = true;
                    View view4 = eyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        vw vwVar = eyVar.G3;
        if (vwVar != null && vwVar.c() && (zxVar = dyVar.f38702a) != null) {
            zxVar.invalidate();
        }
        sw swVar = eyVar.E0;
        if (swVar != null && swVar.getPremiumHint() != null && eyVar.E0.getPremiumHint().V) {
            eyVar.E0.getPremiumHint().e(true);
        }
        ?? h42 = eyVar.h4();
        View childAt2 = dyVar.f38702a.getChildAt(h42 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        eyVar.e.a((i18 > h42 || (i12 - eyVar.N) + AndroidUtilities.dp(5.0f) < dyVar.f38702a.getPaddingTop()) ? true : true, true);
        if (i11 != 0 && (fVar = eyVar.f39033k4) != null && Build.VERSION.SDK_INT >= 31) {
            fVar.f(i10, i11);
        }
    }
}
