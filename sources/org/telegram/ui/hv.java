package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class hv extends v4.u0 {
    public boolean f48636a;
    public final ax f48637b;
    public final uw f48638c;
    public final bx d;

    public hv(bx bxVar, ax axVar, uw uwVar) {
        this.d = bxVar;
        this.f48637b = axVar;
        this.f48638c = uwVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        bx bxVar = this.d;
        if (i7 == 1) {
            this.f48636a = true;
            bxVar.f46557g3 = true;
            a8.xa xaVar = bxVar.f46549f0[0].f45823b;
            ValueAnimator valueAnimator = (ValueAnimator) xaVar.f714c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) xaVar.f714c).cancel();
                xaVar.f714c = null;
            }
            if (bxVar.Y.f33883r.getText().length() == 0 && bxVar.Y.f33883r.hasFocus()) {
                org.telegram.messenger.g0.v1(bxVar.Y.f33883r);
                bxVar.Y.f33883r.clearFocus();
            }
        } else {
            bxVar.f46557g3 = false;
        }
        if (i7 == 0) {
            this.f48636a = false;
            bxVar.f46556g2 = false;
            boolean z10 = bxVar.f46539d1;
            ax axVar = this.f48637b;
            if (z10) {
                bxVar.f46539d1 = false;
                if (bxVar.f46550f1) {
                    xw xwVar = axVar.f45822a;
                    int i10 = xw.C3;
                    xwVar.D1();
                    bxVar.f46550f1 = false;
                }
                axVar.d.f();
            }
            bx.w1(bxVar, axVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        dh.g gVar;
        xw xwVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i12;
        boolean z10;
        Object[] objArr;
        this.f48638c.V();
        ax axVar = this.f48637b;
        dv dvVar = axVar.f45832y;
        int i13 = -i10;
        ArrayList arrayList = dvVar.f38992x;
        ArrayList arrayList2 = dvVar.f38984o;
        boolean z11 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view = ((v4.f1) arrayList2.get(i14)).f59245a;
                view.setTranslationY(view.getTranslationY() + i13);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                View view2 = ((v4.f1) arrayList.get(i15)).f59245a;
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
        bx bxVar = this.d;
        bxVar.C3(axVar);
        bxVar.R = true;
        View view3 = bxVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (bxVar.T0 != 10 && this.f48636a && recyclerView.getChildCount() > 0 && i17 != -1) {
            v4.f1 K = recyclerView.K(i17);
            if (!bxVar.n4() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i12 = K.f59245a.getTop();
                } else {
                    i12 = 0;
                }
                int i19 = bxVar.f46523a2;
                if (i19 == i17) {
                    int i20 = bxVar.f46529b2;
                    int i21 = i20 - i12;
                    if (i12 < i20) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(i21) <= 1) {
                        objArr = null;
                        if (objArr != null && bxVar.f46535c2 && (z10 || bxVar.f46557g3)) {
                            bxVar.q4(z10);
                        }
                        bxVar.f46523a2 = i17;
                        bxVar.f46529b2 = i12;
                        bxVar.f46535c2 = true;
                    }
                } else if (i17 > i19) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objArr = 1;
                if (objArr != null) {
                    bxVar.q4(z10);
                }
                bxVar.f46523a2 = i17;
                bxVar.f46529b2 = i12;
                bxVar.f46535c2 = true;
            }
        }
        if (!bxVar.L && recyclerView == bxVar.f46549f0[0].f45822a && !bxVar.f46579l2) {
            kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                if (!kVar2.x() && !bxVar.f46556g2 && !bxVar.H3.c()) {
                    if (i10 > 0 && bxVar.n4() && bxVar.f46549f0[0].f45829s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i10 > 0) {
                            if (top < 0) {
                                i10 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    bxVar.R = true;
                    View view4 = bxVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        wv wvVar = bxVar.H3;
        if (wvVar != null && wvVar.c() && (xwVar = axVar.f45822a) != null) {
            xwVar.invalidate();
        }
        sv svVar = bxVar.F0;
        if (svVar != null && svVar.getPremiumHint() != null && bxVar.F0.getPremiumHint().W) {
            bxVar.F0.getPremiumHint().f(true);
        }
        ?? n42 = bxVar.n4();
        View childAt2 = axVar.f45822a.getChildAt(n42 == true ? 1 : 0);
        if (childAt2 != null) {
            i11 = childAt2.getTop();
        } else {
            i11 = 0;
        }
        bxVar.f46542e.a((i17 > n42 || (i11 - bxVar.O) + org.telegram.messenger.g0.L(5.0f) < axVar.f45822a.getPaddingTop()) ? true : true, true);
        if (i10 != 0 && (gVar = bxVar.o4) != null && Build.VERSION.SDK_INT >= 31) {
            gVar.f(i7, i10);
        }
    }
}
