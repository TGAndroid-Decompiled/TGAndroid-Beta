package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class bv extends u4.t0 {
    public boolean f44150a;
    public final tw f44151b;
    public final mw f44152c;
    public final uw d;

    public bv(uw uwVar, tw twVar, mw mwVar) {
        this.d = uwVar;
        this.f44151b = twVar;
        this.f44152c = mwVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i3) {
        uw uwVar = this.d;
        if (i3 == 1) {
            this.f44150a = true;
            uwVar.f50233f3 = true;
            b8.kg kgVar = uwVar.f50230f0[0].f49898b;
            ValueAnimator valueAnimator = (ValueAnimator) kgVar.f2723c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) kgVar.f2723c).cancel();
                kgVar.f2723c = null;
            }
            if (uwVar.Y.f36302r.getText().length() == 0 && uwVar.Y.f36302r.hasFocus()) {
                org.telegram.messenger.g0.v1(uwVar.Y.f36302r);
                uwVar.Y.f36302r.clearFocus();
            }
        } else {
            uwVar.f50233f3 = false;
        }
        if (i3 == 0) {
            this.f44150a = false;
            uwVar.f50232f2 = false;
            boolean z10 = uwVar.f50215c1;
            tw twVar = this.f44151b;
            if (z10) {
                uwVar.f50215c1 = false;
                if (uwVar.f50225e1) {
                    pw pwVar = twVar.f49897a;
                    int i10 = pw.C3;
                    pwVar.D1();
                    uwVar.f50225e1 = false;
                }
                twVar.d.f();
            }
            uw.v1(uwVar, twVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        int i11;
        eh.g gVar;
        pw pwVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i12;
        boolean z10;
        Object[] objArr;
        this.f44152c.V();
        tw twVar = this.f44151b;
        xu xuVar = twVar.f49907y;
        int i13 = -i10;
        ArrayList arrayList = xuVar.f33461x;
        ArrayList arrayList2 = xuVar.f33453o;
        boolean z11 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view = ((u4.d1) arrayList2.get(i14)).f55540a;
                view.setTranslationY(view.getTranslationY() + i13);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                View view2 = ((u4.d1) arrayList.get(i15)).f55540a;
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
        uw uwVar = this.d;
        uwVar.C3(twVar);
        uwVar.R = true;
        View view3 = uwVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (uwVar.S0 != 10 && this.f44150a && recyclerView.getChildCount() > 0 && i17 != -1) {
            u4.d1 K = recyclerView.K(i17);
            if (!uwVar.l4() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i12 = K.f55540a.getTop();
                } else {
                    i12 = 0;
                }
                int i19 = uwVar.Z1;
                if (i19 == i17) {
                    int i20 = uwVar.f50204a2;
                    int i21 = i20 - i12;
                    if (i12 < i20) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(i21) <= 1) {
                        objArr = null;
                        if (objArr != null && uwVar.f50210b2 && (z10 || uwVar.f50233f3)) {
                            uwVar.o4(z10);
                        }
                        uwVar.Z1 = i17;
                        uwVar.f50204a2 = i12;
                        uwVar.f50210b2 = true;
                    }
                } else if (i17 > i19) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objArr = 1;
                if (objArr != null) {
                    uwVar.o4(z10);
                }
                uwVar.Z1 = i17;
                uwVar.f50204a2 = i12;
                uwVar.f50210b2 = true;
            }
        }
        if (!uwVar.L && recyclerView == uwVar.f50230f0[0].f49897a && !uwVar.f50255k2) {
            kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                if (!kVar2.v() && !uwVar.f50232f2 && !uwVar.G3.c()) {
                    if (i10 > 0 && uwVar.l4() && uwVar.f50230f0[0].f49904s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i10 > 0) {
                            if (top < 0) {
                                i10 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    uwVar.R = true;
                    View view4 = uwVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        pv pvVar = uwVar.G3;
        if (pvVar != null && pvVar.c() && (pwVar = twVar.f49897a) != null) {
            pwVar.invalidate();
        }
        mv mvVar = uwVar.F0;
        if (mvVar != null && mvVar.getPremiumHint() != null && uwVar.F0.getPremiumHint().W) {
            uwVar.F0.getPremiumHint().f(true);
        }
        ?? l42 = uwVar.l4();
        View childAt2 = twVar.f49897a.getChildAt(l42 == true ? 1 : 0);
        if (childAt2 != null) {
            i11 = childAt2.getTop();
        } else {
            i11 = 0;
        }
        uwVar.f50223e.a((i17 > l42 || (i11 - uwVar.O) + org.telegram.messenger.g0.L(5.0f) < twVar.f49897a.getPaddingTop()) ? true : true, true);
        if (i10 != 0 && (gVar = uwVar.f50257k4) != null && Build.VERSION.SDK_INT >= 31) {
            gVar.f(i3, i10);
        }
    }
}
