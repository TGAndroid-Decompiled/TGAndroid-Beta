package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class ew extends s4.u0 {
    public boolean f39188a;
    public final ay f39189b;
    public final tx f39190c;
    public final cy d;

    public ew(cy cyVar, ay ayVar, tx txVar) {
        this.d = cyVar;
        this.f39189b = ayVar;
        this.f39190c = txVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        cy cyVar = this.d;
        if (i10 == 1) {
            this.f39188a = true;
            cyVar.f38589e3 = true;
            a8.ng ngVar = cyVar.f38586e0[0].f37914b;
            ValueAnimator valueAnimator = (ValueAnimator) ngVar.f640c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) ngVar.f640c).cancel();
                ngVar.f640c = null;
            }
            if (cyVar.X.f30367r.getText().length() == 0 && cyVar.X.f30367r.hasFocus()) {
                AndroidUtilities.hideKeyboard(cyVar.X.f30367r);
                cyVar.X.f30367r.clearFocus();
            }
        } else {
            cyVar.f38589e3 = false;
        }
        if (i10 == 0) {
            this.f39188a = false;
            cyVar.f38588e2 = false;
            boolean z10 = cyVar.f38571b1;
            ay ayVar = this.f39189b;
            if (z10) {
                cyVar.f38571b1 = false;
                if (cyVar.f38582d1) {
                    wx wxVar = ayVar.f37913a;
                    int i11 = wx.C3;
                    wxVar.G1();
                    cyVar.f38582d1 = false;
                }
                ayVar.d.l();
            }
            cy.s1(cyVar, ayVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ch.f fVar;
        wx wxVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i13;
        boolean z10;
        Object[] objArr;
        this.f39190c.V();
        ay ayVar = this.f39189b;
        aw awVar = ayVar.f37921x;
        int i14 = -i11;
        ArrayList arrayList = awVar.f30749x;
        ArrayList arrayList2 = awVar.f30741o;
        boolean z11 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((s4.e1) arrayList2.get(i15)).f47738a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((s4.e1) arrayList.get(i16)).f47738a;
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
        cy cyVar = this.d;
        cyVar.z3(ayVar);
        cyVar.Q = true;
        View view3 = cyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (cyVar.R0 != 10 && this.f39188a && recyclerView.getChildCount() > 0 && i18 != -1) {
            s4.e1 K = recyclerView.K(i18);
            if (!cyVar.h4() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f47738a.getTop();
                } else {
                    i13 = 0;
                }
                int i20 = cyVar.Y1;
                if (i20 == i18) {
                    int i21 = cyVar.Z1;
                    int i22 = i21 - i13;
                    if (i13 < i21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(i22) <= 1) {
                        objArr = null;
                        if (objArr != null && cyVar.a2 && (z10 || cyVar.f38589e3)) {
                            cyVar.k4(z10);
                        }
                        cyVar.Y1 = i18;
                        cyVar.Z1 = i13;
                        cyVar.a2 = true;
                    }
                } else if (i18 > i20) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objArr = 1;
                if (objArr != null) {
                    cyVar.k4(z10);
                }
                cyVar.Y1 = i18;
                cyVar.Z1 = i13;
                cyVar.a2 = true;
            }
        }
        if (!cyVar.K && recyclerView == cyVar.f38586e0[0].f37913a && !cyVar.f38614j2) {
            kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                if (!kVar2.q() && !cyVar.f38588e2 && !cyVar.G3.c()) {
                    if (i11 > 0 && cyVar.h4() && cyVar.f38586e0[0].f37919s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i11 > 0) {
                            if (top < 0) {
                                i11 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    cyVar.Q = true;
                    View view4 = cyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        tw twVar = cyVar.G3;
        if (twVar != null && twVar.c() && (wxVar = ayVar.f37913a) != null) {
            wxVar.invalidate();
        }
        qw qwVar = cyVar.E0;
        if (qwVar != null && qwVar.getPremiumHint() != null && cyVar.E0.getPremiumHint().V) {
            cyVar.E0.getPremiumHint().e(true);
        }
        ?? h42 = cyVar.h4();
        View childAt2 = ayVar.f37913a.getChildAt(h42 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        cyVar.e.a((i18 > h42 || (i12 - cyVar.N) + AndroidUtilities.dp(5.0f) < ayVar.f37913a.getPaddingTop()) ? true : true, true);
        if (i11 != 0 && (fVar = cyVar.f38621k4) != null && Build.VERSION.SDK_INT >= 31) {
            fVar.f(i10, i11);
        }
    }
}
