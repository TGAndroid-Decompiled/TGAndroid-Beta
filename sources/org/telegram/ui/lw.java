package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class lw extends f2.a1 {
    public boolean f40316a;
    public final ey f40317b;
    public final xx f40318c;
    public final fy d;

    public lw(fy fyVar, ey eyVar, xx xxVar) {
        this.d = fyVar;
        this.f40317b = eyVar;
        this.f40318c = xxVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        fy fyVar = this.d;
        if (i10 == 1) {
            this.f40316a = true;
            fyVar.Z2 = true;
            ag.j2 j2Var = fyVar.f38256a0[0].f37922b;
            ValueAnimator valueAnimator = (ValueAnimator) j2Var.f559c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) j2Var.f559c).cancel();
                j2Var.f559c = null;
            }
            if (fyVar.T.f34546r.getText().length() == 0 && fyVar.T.f34546r.hasFocus()) {
                AndroidUtilities.hideKeyboard(fyVar.T.f34546r);
                fyVar.T.f34546r.clearFocus();
            }
        } else {
            fyVar.Z2 = false;
        }
        if (i10 == 0) {
            this.f40316a = false;
            fyVar.a2 = false;
            boolean z10 = fyVar.X0;
            ey eyVar = this.f40317b;
            if (z10) {
                fyVar.X0 = false;
                if (fyVar.Z0) {
                    ay ayVar = eyVar.f37921a;
                    int i11 = ay.f36618r3;
                    ayVar.A1();
                    fyVar.Z0 = false;
                }
                eyVar.d.l();
            }
            fy.r1(fyVar, eyVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        lg.e eVar;
        ay ayVar;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        View childAt;
        int i13;
        boolean z10;
        boolean z11;
        this.f40318c.X();
        ey eyVar = this.f40317b;
        hw hwVar = eyVar.f37930x;
        int i14 = -i11;
        ArrayList arrayList = hwVar.f33312x;
        ArrayList arrayList2 = hwVar.f33304o;
        boolean z12 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((f2.n1) arrayList2.get(i15)).f6432a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((f2.n1) arrayList.get(i16)).f6432a;
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
        fy fyVar = this.d;
        fyVar.r3(eyVar);
        fyVar.M = true;
        View view3 = fyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (fyVar.N0 != 10 && this.f40316a && recyclerView.getChildCount() > 0 && i18 != -1) {
            f2.n1 K = recyclerView.K(i18);
            if (!fyVar.Z3() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f6432a.getTop();
                } else {
                    i13 = 0;
                }
                int i20 = fyVar.U1;
                if (i20 == i18) {
                    int i21 = fyVar.V1;
                    int i22 = i21 - i13;
                    if (i13 < i21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(i22) <= 1) {
                        z11 = false;
                        if (z11 && fyVar.W1 && (z10 || fyVar.Z2)) {
                            fyVar.c4(z10);
                        }
                        fyVar.U1 = i18;
                        fyVar.V1 = i13;
                        fyVar.W1 = true;
                    }
                } else if (i18 > i20) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = true;
                if (z11) {
                    fyVar.c4(z10);
                }
                fyVar.U1 = i18;
                fyVar.V1 = i13;
                fyVar.W1 = true;
            }
        }
        if (!fyVar.G && recyclerView == fyVar.f38256a0[0].f37921a && !fyVar.f38285f2) {
            lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
            if (lVar != null) {
                lVar2 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                if (!lVar2.s() && !fyVar.a2 && !fyVar.B3.c()) {
                    if (i11 > 0 && fyVar.Z3() && fyVar.f38256a0[0].f37928s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i11 > 0) {
                            if (top < 0) {
                                i11 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    fyVar.M = true;
                    View view4 = fyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (fyVar.fragmentView != null) {
            fyVar.m3();
        }
        ax axVar = fyVar.B3;
        if (axVar != null && axVar.c() && (ayVar = eyVar.f37921a) != null) {
            ayVar.invalidate();
        }
        xw xwVar = fyVar.A0;
        if (xwVar != null && xwVar.getPremiumHint() != null && fyVar.A0.getPremiumHint().R) {
            fyVar.A0.getPremiumHint().e(true);
        }
        ?? Z3 = fyVar.Z3();
        View childAt2 = eyVar.f37921a.getChildAt(Z3 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        fyVar.f38276e.a((i18 > Z3 || (((float) i12) - fyVar.J) + ((float) AndroidUtilities.dp(5.0f)) < ((float) eyVar.f37921a.getPaddingTop())) ? true : true, true);
        if (i11 != 0 && (eVar = fyVar.f38297h4) != null && Build.VERSION.SDK_INT >= 31) {
            eVar.f(i10, i11);
        }
    }
}
