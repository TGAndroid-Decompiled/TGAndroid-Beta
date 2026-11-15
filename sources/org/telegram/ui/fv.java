package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class fv extends v4.t0 {
    public boolean f47204a;
    public final xw f47205b;
    public final rw f47206c;
    public final yw d;

    public fv(yw ywVar, xw xwVar, rw rwVar) {
        this.d = ywVar;
        this.f47205b = xwVar;
        this.f47206c = rwVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        yw ywVar = this.d;
        if (i7 == 1) {
            this.f47204a = true;
            ywVar.f53681g3 = true;
            a8.xa xaVar = ywVar.f53673f0[0].f53332b;
            ValueAnimator valueAnimator = (ValueAnimator) xaVar.f714c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) xaVar.f714c).cancel();
                xaVar.f714c = null;
            }
            if (ywVar.Y.f40202r.getText().length() == 0 && ywVar.Y.f40202r.hasFocus()) {
                org.telegram.messenger.g0.v1(ywVar.Y.f40202r);
                ywVar.Y.f40202r.clearFocus();
            }
        } else {
            ywVar.f53681g3 = false;
        }
        if (i7 == 0) {
            this.f47204a = false;
            ywVar.f53680g2 = false;
            boolean z10 = ywVar.f53663d1;
            xw xwVar = this.f47205b;
            if (z10) {
                ywVar.f53663d1 = false;
                if (ywVar.f53674f1) {
                    uw uwVar = xwVar.f53331a;
                    int i10 = uw.C3;
                    uwVar.D1();
                    ywVar.f53674f1 = false;
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
        boolean z10;
        Object[] objArr;
        this.f47206c.V();
        xw xwVar = this.f47205b;
        bv bvVar = xwVar.f53341y;
        int i13 = -i10;
        ArrayList arrayList = bvVar.f36603x;
        ArrayList arrayList2 = bvVar.f36595o;
        boolean z11 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view = ((v4.e1) arrayList2.get(i14)).f58535a;
                view.setTranslationY(view.getTranslationY() + i13);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                View view2 = ((v4.e1) arrayList.get(i15)).f58535a;
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
        ywVar.R = true;
        View view3 = ywVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (ywVar.T0 != 10 && this.f47204a && recyclerView.getChildCount() > 0 && i17 != -1) {
            v4.e1 K = recyclerView.K(i17);
            if (!ywVar.l4() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i12 = K.f58535a.getTop();
                } else {
                    i12 = 0;
                }
                int i19 = ywVar.f53647a2;
                if (i19 == i17) {
                    int i20 = ywVar.f53653b2;
                    int i21 = i20 - i12;
                    if (i12 < i20) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(i21) <= 1) {
                        objArr = null;
                        if (objArr != null && ywVar.f53659c2 && (z10 || ywVar.f53681g3)) {
                            ywVar.o4(z10);
                        }
                        ywVar.f53647a2 = i17;
                        ywVar.f53653b2 = i12;
                        ywVar.f53659c2 = true;
                    }
                } else if (i17 > i19) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objArr = 1;
                if (objArr != null) {
                    ywVar.o4(z10);
                }
                ywVar.f53647a2 = i17;
                ywVar.f53653b2 = i12;
                ywVar.f53659c2 = true;
            }
        }
        if (!ywVar.L && recyclerView == ywVar.f53673f0[0].f53331a && !ywVar.f53703l2) {
            kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                if (!kVar2.x() && !ywVar.f53680g2 && !ywVar.H3.c()) {
                    if (i10 > 0 && ywVar.l4() && ywVar.f53673f0[0].f53338s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i10 > 0) {
                            if (top < 0) {
                                i10 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    ywVar.R = true;
                    View view4 = ywVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        uv uvVar = ywVar.H3;
        if (uvVar != null && uvVar.c() && (uwVar = xwVar.f53331a) != null) {
            uwVar.invalidate();
        }
        qv qvVar = ywVar.F0;
        if (qvVar != null && qvVar.getPremiumHint() != null && ywVar.F0.getPremiumHint().W) {
            ywVar.F0.getPremiumHint().f(true);
        }
        ?? l42 = ywVar.l4();
        View childAt2 = xwVar.f53331a.getChildAt(l42 == true ? 1 : 0);
        if (childAt2 != null) {
            i11 = childAt2.getTop();
        } else {
            i11 = 0;
        }
        ywVar.f53666e.a((i17 > l42 || (i11 - ywVar.O) + org.telegram.messenger.g0.L(5.0f) < xwVar.f53331a.getPaddingTop()) ? true : true, true);
        if (i10 != 0 && (gVar = ywVar.f53705l4) != null && Build.VERSION.SDK_INT >= 31) {
            gVar.f(i7, i10);
        }
    }
}
