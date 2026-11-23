package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class iv extends v4.u0 {
    public boolean f48832a;
    public final bx f48833b;
    public final vw f48834c;
    public final cx d;

    public iv(cx cxVar, bx bxVar, vw vwVar) {
        this.d = cxVar;
        this.f48833b = bxVar;
        this.f48834c = vwVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        cx cxVar = this.d;
        if (i7 == 1) {
            this.f48832a = true;
            cxVar.f46730g3 = true;
            a8.xa xaVar = cxVar.f46722f0[0].f46326b;
            ValueAnimator valueAnimator = (ValueAnimator) xaVar.f714c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) xaVar.f714c).cancel();
                xaVar.f714c = null;
            }
            if (cxVar.Y.f34642r.getText().length() == 0 && cxVar.Y.f34642r.hasFocus()) {
                org.telegram.messenger.g0.v1(cxVar.Y.f34642r);
                cxVar.Y.f34642r.clearFocus();
            }
        } else {
            cxVar.f46730g3 = false;
        }
        if (i7 == 0) {
            this.f48832a = false;
            cxVar.f46729g2 = false;
            boolean z10 = cxVar.f46712d1;
            bx bxVar = this.f48833b;
            if (z10) {
                cxVar.f46712d1 = false;
                if (cxVar.f46723f1) {
                    yw ywVar = bxVar.f46325a;
                    int i10 = yw.C3;
                    ywVar.D1();
                    cxVar.f46723f1 = false;
                }
                bxVar.d.f();
            }
            cx.w1(cxVar, bxVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        dh.g gVar;
        yw ywVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i12;
        boolean z10;
        Object[] objArr;
        this.f48834c.V();
        bx bxVar = this.f48833b;
        ev evVar = bxVar.f46335y;
        int i13 = -i10;
        ArrayList arrayList = evVar.f40030x;
        ArrayList arrayList2 = evVar.f40022o;
        boolean z11 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view = ((v4.f1) arrayList2.get(i14)).f59165a;
                view.setTranslationY(view.getTranslationY() + i13);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                View view2 = ((v4.f1) arrayList.get(i15)).f59165a;
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
        cx cxVar = this.d;
        cxVar.C3(bxVar);
        cxVar.R = true;
        View view3 = cxVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (cxVar.T0 != 10 && this.f48832a && recyclerView.getChildCount() > 0 && i17 != -1) {
            v4.f1 K = recyclerView.K(i17);
            if (!cxVar.n4() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i12 = K.f59165a.getTop();
                } else {
                    i12 = 0;
                }
                int i19 = cxVar.f46696a2;
                if (i19 == i17) {
                    int i20 = cxVar.f46702b2;
                    int i21 = i20 - i12;
                    if (i12 < i20) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(i21) <= 1) {
                        objArr = null;
                        if (objArr != null && cxVar.f46708c2 && (z10 || cxVar.f46730g3)) {
                            cxVar.q4(z10);
                        }
                        cxVar.f46696a2 = i17;
                        cxVar.f46702b2 = i12;
                        cxVar.f46708c2 = true;
                    }
                } else if (i17 > i19) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objArr = 1;
                if (objArr != null) {
                    cxVar.q4(z10);
                }
                cxVar.f46696a2 = i17;
                cxVar.f46702b2 = i12;
                cxVar.f46708c2 = true;
            }
        }
        if (!cxVar.L && recyclerView == cxVar.f46722f0[0].f46325a && !cxVar.f46752l2) {
            kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                if (!kVar2.x() && !cxVar.f46729g2 && !cxVar.H3.c()) {
                    if (i10 > 0 && cxVar.n4() && cxVar.f46722f0[0].f46332s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i10 > 0) {
                            if (top < 0) {
                                i10 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    cxVar.R = true;
                    View view4 = cxVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        xv xvVar = cxVar.H3;
        if (xvVar != null && xvVar.c() && (ywVar = bxVar.f46325a) != null) {
            ywVar.invalidate();
        }
        tv tvVar = cxVar.F0;
        if (tvVar != null && tvVar.getPremiumHint() != null && cxVar.F0.getPremiumHint().W) {
            cxVar.F0.getPremiumHint().f(true);
        }
        ?? n42 = cxVar.n4();
        View childAt2 = bxVar.f46325a.getChildAt(n42 == true ? 1 : 0);
        if (childAt2 != null) {
            i11 = childAt2.getTop();
        } else {
            i11 = 0;
        }
        cxVar.f46715e.a((i17 > n42 || (i11 - cxVar.O) + org.telegram.messenger.g0.L(5.0f) < bxVar.f46325a.getPaddingTop()) ? true : true, true);
        if (i10 != 0 && (gVar = cxVar.o4) != null && Build.VERSION.SDK_INT >= 31) {
            gVar.f(i7, i10);
        }
    }
}
