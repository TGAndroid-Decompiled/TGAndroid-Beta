package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class hv extends v4.s0 {
    public boolean f46429a;
    public final yw f46430b;
    public final sw f46431c;
    public final zw d;

    public hv(zw zwVar, yw ywVar, sw swVar) {
        this.d = zwVar;
        this.f46430b = ywVar;
        this.f46431c = swVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        zw zwVar = this.d;
        if (i7 == 1) {
            this.f46429a = true;
            zwVar.f52586f3 = true;
            a8.wa waVar = zwVar.f52577e0[0].f52126b;
            ValueAnimator valueAnimator = (ValueAnimator) waVar.f701c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) waVar.f701c).cancel();
                waVar.f701c = null;
            }
            if (zwVar.X.f37446r.getText().length() == 0 && zwVar.X.f37446r.hasFocus()) {
                org.telegram.messenger.g0.v1(zwVar.X.f37446r);
                zwVar.X.f37446r.clearFocus();
            }
        } else {
            zwVar.f52586f3 = false;
        }
        if (i7 == 0) {
            this.f46429a = false;
            zwVar.f52585f2 = false;
            boolean z9 = zwVar.f52568c1;
            yw ywVar = this.f46430b;
            if (z9) {
                zwVar.f52568c1 = false;
                if (zwVar.f52578e1) {
                    vw vwVar = ywVar.f52125a;
                    int i10 = vw.B3;
                    vwVar.D1();
                    zwVar.f52578e1 = false;
                }
                ywVar.d.f();
            }
            zw.v1(zwVar, ywVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        dh.g gVar;
        vw vwVar;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        View childAt;
        int i12;
        boolean z9;
        Object[] objArr;
        this.f46431c.V();
        yw ywVar = this.f46430b;
        dv dvVar = ywVar.f52135y;
        int i13 = -i10;
        ArrayList arrayList = dvVar.f33069x;
        ArrayList arrayList2 = dvVar.f33061o;
        boolean z10 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view = ((v4.d1) arrayList2.get(i14)).f57052a;
                view.setTranslationY(view.getTranslationY() + i13);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                View view2 = ((v4.d1) arrayList.get(i15)).f57052a;
                view2.setTranslationY(view2.getTranslationY() + i13);
            }
        }
        int i16 = -1;
        int i17 = -1;
        for (int i18 = 0; i18 < recyclerView.getChildCount(); i18++) {
            int R = RecyclerView.R(recyclerView.getChildAt(i18));
            if (R >= 0) {
                if (i16 == -1 || R > i16) {
                    i16 = R;
                }
                if (i17 == -1 || R < i17) {
                    i17 = R;
                }
            }
        }
        zw zwVar = this.d;
        zwVar.C3(ywVar);
        zwVar.Q = true;
        View view3 = zwVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (zwVar.S0 != 10 && this.f46429a && recyclerView.getChildCount() > 0 && i17 != -1) {
            v4.d1 K = recyclerView.K(i17);
            if (!zwVar.l4() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i12 = K.f57052a.getTop();
                } else {
                    i12 = 0;
                }
                int i19 = zwVar.Z1;
                if (i19 == i17) {
                    int i20 = zwVar.f52557a2;
                    int i21 = i20 - i12;
                    if (i12 < i20) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (Math.abs(i21) <= 1) {
                        objArr = null;
                        if (objArr != null && zwVar.f52563b2 && (z9 || zwVar.f52586f3)) {
                            zwVar.o4(z9);
                        }
                        zwVar.Z1 = i17;
                        zwVar.f52557a2 = i12;
                        zwVar.f52563b2 = true;
                    }
                } else if (i17 > i19) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objArr = 1;
                if (objArr != null) {
                    zwVar.o4(z9);
                }
                zwVar.Z1 = i17;
                zwVar.f52557a2 = i12;
                zwVar.f52563b2 = true;
            }
        }
        if (!zwVar.K && recyclerView == zwVar.f52577e0[0].f52125a && !zwVar.f52609k2) {
            lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
            if (lVar != null) {
                lVar2 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                if (!lVar2.x() && !zwVar.f52585f2 && !zwVar.G3.c()) {
                    if (i10 > 0 && zwVar.l4() && zwVar.f52577e0[0].f52132s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i10 > 0) {
                            if (top < 0) {
                                i10 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    zwVar.Q = true;
                    View view4 = zwVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        vv vvVar = zwVar.G3;
        if (vvVar != null && vvVar.c() && (vwVar = ywVar.f52125a) != null) {
            vwVar.invalidate();
        }
        sv svVar = zwVar.E0;
        if (svVar != null && svVar.getPremiumHint() != null && zwVar.E0.getPremiumHint().V) {
            zwVar.E0.getPremiumHint().f(true);
        }
        ?? l42 = zwVar.l4();
        View childAt2 = ywVar.f52125a.getChildAt(l42 == true ? 1 : 0);
        if (childAt2 != null) {
            i11 = childAt2.getTop();
        } else {
            i11 = 0;
        }
        zwVar.f52576e.a((i17 > l42 || (i11 - zwVar.N) + org.telegram.messenger.g0.L(5.0f) < ywVar.f52125a.getPaddingTop()) ? true : true, true);
        if (i10 != 0 && (gVar = zwVar.f52611k4) != null && Build.VERSION.SDK_INT >= 31) {
            gVar.f(i7, i10);
        }
    }
}
