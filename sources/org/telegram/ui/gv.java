package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class gv extends v4.s0 {
    public boolean f46074a;
    public final xw f46075b;
    public final rw f46076c;
    public final yw d;

    public gv(yw ywVar, xw xwVar, rw rwVar) {
        this.d = ywVar;
        this.f46075b = xwVar;
        this.f46076c = rwVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        yw ywVar = this.d;
        if (i7 == 1) {
            this.f46074a = true;
            ywVar.f52240f3 = true;
            a8.wa waVar = ywVar.f52231e0[0].f51773b;
            ValueAnimator valueAnimator = (ValueAnimator) waVar.f701c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) waVar.f701c).cancel();
                waVar.f701c = null;
            }
            if (ywVar.X.f37857r.getText().length() == 0 && ywVar.X.f37857r.hasFocus()) {
                org.telegram.messenger.g0.v1(ywVar.X.f37857r);
                ywVar.X.f37857r.clearFocus();
            }
        } else {
            ywVar.f52240f3 = false;
        }
        if (i7 == 0) {
            this.f46074a = false;
            ywVar.f52239f2 = false;
            boolean z9 = ywVar.f52222c1;
            xw xwVar = this.f46075b;
            if (z9) {
                ywVar.f52222c1 = false;
                if (ywVar.f52232e1) {
                    uw uwVar = xwVar.f51772a;
                    int i10 = uw.B3;
                    uwVar.D1();
                    ywVar.f52232e1 = false;
                }
                xwVar.d.f();
            }
            yw.v1(ywVar, xwVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        dh.g gVar;
        uw uwVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i12;
        boolean z9;
        Object[] objArr;
        this.f46076c.V();
        xw xwVar = this.f46075b;
        cv cvVar = xwVar.f51782y;
        int i13 = -i10;
        ArrayList arrayList = cvVar.f33489x;
        ArrayList arrayList2 = cvVar.f33481o;
        boolean z10 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view = ((v4.d1) arrayList2.get(i14)).f57056a;
                view.setTranslationY(view.getTranslationY() + i13);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                View view2 = ((v4.d1) arrayList.get(i15)).f57056a;
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
        yw ywVar = this.d;
        ywVar.C3(xwVar);
        ywVar.Q = true;
        View view3 = ywVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (ywVar.S0 != 10 && this.f46074a && recyclerView.getChildCount() > 0 && i17 != -1) {
            v4.d1 K = recyclerView.K(i17);
            if (!ywVar.l4() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i12 = K.f57056a.getTop();
                } else {
                    i12 = 0;
                }
                int i19 = ywVar.Z1;
                if (i19 == i17) {
                    int i20 = ywVar.f52211a2;
                    int i21 = i20 - i12;
                    if (i12 < i20) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (Math.abs(i21) <= 1) {
                        objArr = null;
                        if (objArr != null && ywVar.f52217b2 && (z9 || ywVar.f52240f3)) {
                            ywVar.o4(z9);
                        }
                        ywVar.Z1 = i17;
                        ywVar.f52211a2 = i12;
                        ywVar.f52217b2 = true;
                    }
                } else if (i17 > i19) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objArr = 1;
                if (objArr != null) {
                    ywVar.o4(z9);
                }
                ywVar.Z1 = i17;
                ywVar.f52211a2 = i12;
                ywVar.f52217b2 = true;
            }
        }
        if (!ywVar.K && recyclerView == ywVar.f52231e0[0].f51772a && !ywVar.f52263k2) {
            kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                if (!kVar2.w() && !ywVar.f52239f2 && !ywVar.G3.c()) {
                    if (i10 > 0 && ywVar.l4() && ywVar.f52231e0[0].f51779s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i10 > 0) {
                            if (top < 0) {
                                i10 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    ywVar.Q = true;
                    View view4 = ywVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        uv uvVar = ywVar.G3;
        if (uvVar != null && uvVar.c() && (uwVar = xwVar.f51772a) != null) {
            uwVar.invalidate();
        }
        rv rvVar = ywVar.E0;
        if (rvVar != null && rvVar.getPremiumHint() != null && ywVar.E0.getPremiumHint().V) {
            ywVar.E0.getPremiumHint().f(true);
        }
        ?? l42 = ywVar.l4();
        View childAt2 = xwVar.f51772a.getChildAt(l42 == true ? 1 : 0);
        if (childAt2 != null) {
            i11 = childAt2.getTop();
        } else {
            i11 = 0;
        }
        ywVar.f52230e.a((i17 > l42 || (i11 - ywVar.N) + org.telegram.messenger.g0.L(5.0f) < xwVar.f51772a.getPaddingTop()) ? true : true, true);
        if (i10 != 0 && (gVar = ywVar.f52265k4) != null && Build.VERSION.SDK_INT >= 31) {
            gVar.f(i7, i10);
        }
    }
}
