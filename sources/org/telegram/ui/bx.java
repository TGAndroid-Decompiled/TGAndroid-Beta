package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class bx extends s4.s0 {
    public boolean f32596a;
    public final vy f32597b;
    public final py f32598c;
    public final wy d;

    public bx(wy wyVar, vy vyVar, py pyVar) {
        this.d = wyVar;
        this.f32597b = vyVar;
        this.f32598c = pyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        wy wyVar = this.d;
        if (i10 == 1) {
            this.f32596a = true;
            wyVar.f39219d3 = true;
            a5.a aVar = wyVar.f39221e0[0].f38528b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f278c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f278c).cancel();
                aVar.f278c = null;
            }
            if (wyVar.X.f22546r.getText().length() == 0 && wyVar.X.f22546r.hasFocus()) {
                AndroidUtilities.hideKeyboard(wyVar.X.f22546r);
                wyVar.X.f22546r.clearFocus();
            }
        } else {
            wyVar.f39219d3 = false;
        }
        if (i10 == 0) {
            this.f32596a = false;
            wyVar.f39223e2 = false;
            boolean z10 = wyVar.f39206b1;
            vy vyVar = this.f32597b;
            if (z10) {
                wyVar.f39206b1 = false;
                if (wyVar.f39217d1) {
                    sy syVar = vyVar.f38527a;
                    int i11 = sy.f37572v3;
                    syVar.B1();
                    wyVar.f39217d1 = false;
                }
                vyVar.d.l();
            }
            wy.r1(wyVar, vyVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.i iVar;
        sy syVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i13;
        boolean z10;
        boolean z11;
        this.f32598c.X();
        vy vyVar = this.f32597b;
        xw xwVar = vyVar.f38535x;
        int i14 = -i11;
        ArrayList arrayList = xwVar.f22482x;
        ArrayList arrayList2 = xwVar.f22474o;
        boolean z12 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((s4.c1) arrayList2.get(i15)).f42702a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((s4.c1) arrayList.get(i16)).f42702a;
                view2.setTranslationY(view2.getTranslationY() + i14);
            }
        }
        int i17 = -1;
        int i18 = -1;
        for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
            int S = RecyclerView.S(recyclerView.getChildAt(i19));
            if (S >= 0) {
                if (i17 == -1 || S > i17) {
                    i17 = S;
                }
                if (i18 == -1 || S < i18) {
                    i18 = S;
                }
            }
        }
        wy wyVar = this.d;
        wyVar.r3(vyVar);
        wyVar.Q = true;
        View view3 = wyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (wyVar.R0 != 10 && this.f32596a && recyclerView.getChildCount() > 0 && i18 != -1) {
            s4.c1 L = recyclerView.L(i18);
            if (!wyVar.Z3() || (L != null && L.b() >= 0)) {
                if (L != null) {
                    i13 = L.f42702a.getTop();
                } else {
                    i13 = 0;
                }
                int i20 = wyVar.Y1;
                if (i20 == i18) {
                    int i21 = wyVar.Z1;
                    int i22 = i21 - i13;
                    if (i13 < i21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(i22) <= 1) {
                        z11 = false;
                        if (z11 && wyVar.a2 && (z10 || wyVar.f39219d3)) {
                            wyVar.c4(z10);
                        }
                        wyVar.Y1 = i18;
                        wyVar.Z1 = i13;
                        wyVar.a2 = true;
                    }
                } else if (i18 > i20) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = true;
                if (z11) {
                    wyVar.c4(z10);
                }
                wyVar.Y1 = i18;
                wyVar.Z1 = i13;
                wyVar.a2 = true;
            }
        }
        if (!wyVar.K && recyclerView == wyVar.f39221e0[0].f38527a && !wyVar.f39249j2) {
            kVar = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
                if (!kVar2.s() && !wyVar.f39223e2 && !wyVar.F3.c()) {
                    if (i11 > 0 && wyVar.Z3() && wyVar.f39221e0[0].f38533s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.U(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i11 > 0) {
                            if (top < 0) {
                                i11 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    wyVar.Q = true;
                    View view4 = wyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (wyVar.fragmentView != null) {
            wyVar.m3();
        }
        qx qxVar = wyVar.F3;
        if (qxVar != null && qxVar.c() && (syVar = vyVar.f38527a) != null) {
            syVar.invalidate();
        }
        nx nxVar = wyVar.E0;
        if (nxVar != null && nxVar.getPremiumHint() != null && wyVar.E0.getPremiumHint().V) {
            wyVar.E0.getPremiumHint().e(true);
        }
        ?? Z3 = wyVar.Z3();
        View childAt2 = vyVar.f38527a.getChildAt(Z3 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        wyVar.e.a((i18 > Z3 || (((float) i12) - wyVar.N) + ((float) AndroidUtilities.dp(5.0f)) < ((float) vyVar.f38527a.getPaddingTop())) ? true : true, true);
        if (i11 != 0 && (iVar = wyVar.f39255k4) != null && Build.VERSION.SDK_INT >= 31) {
            iVar.f(i10, i11);
        }
    }
}
