package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ev extends v4.s0 {
    public boolean f45374a;
    public final vw f45375b;
    public final pw f45376c;
    public final ww d;

    public ev(ww wwVar, vw vwVar, pw pwVar) {
        this.d = wwVar;
        this.f45375b = vwVar;
        this.f45376c = pwVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        ww wwVar = this.d;
        if (i7 == 1) {
            this.f45374a = true;
            wwVar.f51559e3 = true;
            a8.wa waVar = wwVar.f51556e0[0].f50783b;
            ValueAnimator valueAnimator = (ValueAnimator) waVar.f701c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) waVar.f701c).cancel();
                waVar.f701c = null;
            }
            if (wwVar.X.f37824r.getText().length() == 0 && wwVar.X.f37824r.hasFocus()) {
                org.telegram.messenger.g0.v1(wwVar.X.f37824r);
                wwVar.X.f37824r.clearFocus();
            }
        } else {
            wwVar.f51559e3 = false;
        }
        if (i7 == 0) {
            this.f45374a = false;
            wwVar.f51558e2 = false;
            boolean z9 = wwVar.f51541b1;
            vw vwVar = this.f45375b;
            if (z9) {
                wwVar.f51541b1 = false;
                if (wwVar.f51552d1) {
                    sw swVar = vwVar.f50782a;
                    int i10 = sw.B3;
                    swVar.D1();
                    wwVar.f51552d1 = false;
                }
                vwVar.d.f();
            }
            ww.v1(wwVar, vwVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        dh.g gVar;
        sw swVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i12;
        boolean z9;
        Object[] objArr;
        this.f45376c.V();
        vw vwVar = this.f45375b;
        av avVar = vwVar.f50792y;
        int i13 = -i10;
        ArrayList arrayList = avVar.f33374x;
        ArrayList arrayList2 = avVar.f33366o;
        boolean z10 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view = ((v4.d1) arrayList2.get(i14)).f57043a;
                view.setTranslationY(view.getTranslationY() + i13);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                View view2 = ((v4.d1) arrayList.get(i15)).f57043a;
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
        ww wwVar = this.d;
        wwVar.C3(vwVar);
        wwVar.Q = true;
        View view3 = wwVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (wwVar.R0 != 10 && this.f45374a && recyclerView.getChildCount() > 0 && i17 != -1) {
            v4.d1 K = recyclerView.K(i17);
            if (!wwVar.l4() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i12 = K.f57043a.getTop();
                } else {
                    i12 = 0;
                }
                int i19 = wwVar.Y1;
                if (i19 == i17) {
                    int i20 = wwVar.Z1;
                    int i21 = i20 - i12;
                    if (i12 < i20) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (Math.abs(i21) <= 1) {
                        objArr = null;
                        if (objArr != null && wwVar.f51536a2 && (z9 || wwVar.f51559e3)) {
                            wwVar.o4(z9);
                        }
                        wwVar.Y1 = i17;
                        wwVar.Z1 = i12;
                        wwVar.f51536a2 = true;
                    }
                } else if (i17 > i19) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objArr = 1;
                if (objArr != null) {
                    wwVar.o4(z9);
                }
                wwVar.Y1 = i17;
                wwVar.Z1 = i12;
                wwVar.f51536a2 = true;
            }
        }
        if (!wwVar.K && recyclerView == wwVar.f51556e0[0].f50782a && !wwVar.f51584j2) {
            kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                if (!kVar2.v() && !wwVar.f51558e2 && !wwVar.F3.c()) {
                    if (i10 > 0 && wwVar.l4() && wwVar.f51556e0[0].f50789s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i10 > 0) {
                            if (top < 0) {
                                i10 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    wwVar.Q = true;
                    View view4 = wwVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        sv svVar = wwVar.F3;
        if (svVar != null && svVar.c() && (swVar = vwVar.f50782a) != null) {
            swVar.invalidate();
        }
        pv pvVar = wwVar.E0;
        if (pvVar != null && pvVar.getPremiumHint() != null && wwVar.E0.getPremiumHint().V) {
            wwVar.E0.getPremiumHint().f(true);
        }
        ?? l42 = wwVar.l4();
        View childAt2 = vwVar.f50782a.getChildAt(l42 == true ? 1 : 0);
        if (childAt2 != null) {
            i11 = childAt2.getTop();
        } else {
            i11 = 0;
        }
        wwVar.f51555e.a((i17 > l42 || (i11 - wwVar.N) + org.telegram.messenger.g0.L(5.0f) < vwVar.f50782a.getPaddingTop()) ? true : true, true);
        if (i10 != 0 && (gVar = wwVar.f51585j4) != null && Build.VERSION.SDK_INT >= 31) {
            gVar.f(i7, i10);
        }
    }
}
