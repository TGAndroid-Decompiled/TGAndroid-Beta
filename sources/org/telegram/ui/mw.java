package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class mw extends f2.b1 {

    public boolean f40602a;

    public final fy f40603b;

    public final yx f40604c;
    public final gy d;

    public mw(gy gyVar, fy fyVar, yx yxVar) {
        this.d = gyVar;
        this.f40603b = fyVar;
        this.f40604c = yxVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        gy gyVar = this.d;
        if (i10 == 1) {
            this.f40602a = true;
            gyVar.Z2 = true;
            b6.a aVar = gyVar.f38498a0[0].f38226b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f2033b;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f2033b).cancel();
                aVar.f2033b = null;
            }
            if (gyVar.T.f31468r.getText().length() == 0 && gyVar.T.f31468r.hasFocus()) {
                AndroidUtilities.hideKeyboard(gyVar.T.f31468r);
                gyVar.T.f31468r.clearFocus();
            }
        } else {
            gyVar.Z2 = false;
        }
        if (i10 == 0) {
            this.f40602a = false;
            gyVar.a2 = false;
            boolean z10 = gyVar.X0;
            fy fyVar = this.f40603b;
            if (z10) {
                gyVar.X0 = false;
                if (gyVar.Z0) {
                    cy cyVar = fyVar.f38225a;
                    int i11 = cy.f37191r3;
                    cyVar.A1();
                    gyVar.Z0 = false;
                }
                fyVar.d.l();
            }
            gy.r1(gyVar, fyVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        jg.e eVar;
        cy cyVar;
        View childAt;
        boolean z10;
        boolean z11;
        this.f40604c.X();
        fy fyVar = this.f40603b;
        iw iwVar = fyVar.f38234x;
        int i12 = -i11;
        ArrayList arrayList = iwVar.f31404x;
        ArrayList arrayList2 = iwVar.f31396o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = ((f2.o1) arrayList2.get(i13)).f5789a;
                view.setTranslationY(view.getTranslationY() + i12);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                View view2 = ((f2.o1) arrayList.get(i14)).f5789a;
                view2.setTranslationY(view2.getTranslationY() + i12);
            }
        }
        int i15 = -1;
        int i16 = -1;
        for (int i17 = 0; i17 < recyclerView.getChildCount(); i17++) {
            int iR = RecyclerView.R(recyclerView.getChildAt(i17));
            if (iR >= 0) {
                if (i15 == -1 || iR > i15) {
                    i15 = iR;
                }
                if (i16 == -1 || iR < i16) {
                    i16 = iR;
                }
            }
        }
        gy gyVar = this.d;
        gyVar.r3(fyVar);
        gyVar.M = true;
        View view3 = gyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (gyVar.N0 != 10 && this.f40602a && recyclerView.getChildCount() > 0 && i16 != -1) {
            f2.o1 o1VarK = recyclerView.K(i16);
            if (!gyVar.Z3() || (o1VarK != null && o1VarK.b() >= 0)) {
                int top = o1VarK != null ? o1VarK.f5789a.getTop() : 0;
                int i18 = gyVar.U1;
                if (i18 == i16) {
                    int i19 = gyVar.V1;
                    int i20 = i19 - top;
                    z10 = top < i19;
                    if (Math.abs(i20) <= 1) {
                        z11 = false;
                    }
                    if (z11 && gyVar.W1 && (z10 || gyVar.Z2)) {
                        gyVar.c4(z10);
                    }
                    gyVar.U1 = i16;
                    gyVar.V1 = top;
                    gyVar.W1 = true;
                } else {
                    z10 = i16 > i18;
                }
                z11 = true;
                if (z11) {
                    gyVar.c4(z10);
                }
                gyVar.U1 = i16;
                gyVar.V1 = top;
                gyVar.W1 = true;
            }
        }
        if (!gyVar.G && recyclerView == gyVar.f38498a0[0].f38225a && !gyVar.f38527f2 && ((org.telegram.ui.ActionBar.n2) gyVar).actionBar != null && !((org.telegram.ui.ActionBar.n2) gyVar).actionBar.t() && !gyVar.a2 && !gyVar.B3.c()) {
            if (i11 > 0 && gyVar.Z3() && gyVar.f38498a0[0].f38232s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                if (top2 + i11 > 0) {
                    if (top2 >= 0) {
                        return;
                    } else {
                        i11 = -top2;
                    }
                }
            }
            gyVar.M = true;
            View view4 = gyVar.fragmentView;
            if (view4 != null) {
                view4.invalidate();
            }
        }
        if (gyVar.fragmentView != null) {
            gyVar.m3();
        }
        bx bxVar = gyVar.B3;
        if (bxVar != null && bxVar.c() && (cyVar = fyVar.f38225a) != null) {
            cyVar.invalidate();
        }
        yw ywVar = gyVar.A0;
        if (ywVar != null && ywVar.getPremiumHint() != null && gyVar.A0.getPremiumHint().R) {
            gyVar.A0.getPremiumHint().e(true);
        }
        ?? Z3 = gyVar.Z3();
        View childAt2 = fyVar.f38225a.getChildAt(Z3 == true ? 1 : 0);
        gyVar.f38518e.a(i16 > Z3 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - gyVar.J) + ((float) AndroidUtilities.dp(5.0f)) < ((float) fyVar.f38225a.getPaddingTop()), true);
        if (i11 == 0 || (eVar = gyVar.f38539h4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        eVar.f(i10, i11);
    }
}
