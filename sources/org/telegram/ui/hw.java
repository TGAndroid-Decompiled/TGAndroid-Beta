package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class hw extends s4.r0 {
    public boolean f37811a;
    public final ay f37812b;
    public final ux f37813c;
    public final cy d;

    public hw(cy cyVar, ay ayVar, ux uxVar) {
        this.d = cyVar;
        this.f37812b = ayVar;
        this.f37813c = uxVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        cy cyVar = this.d;
        if (i10 == 1) {
            this.f37811a = true;
            cyVar.f36099e3 = true;
            a5.a aVar = cyVar.f36096e0[0].f35448b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f282c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f282c).cancel();
                aVar.f282c = null;
            }
            if (cyVar.X.f27730r.getText().length() == 0 && cyVar.X.f27730r.hasFocus()) {
                AndroidUtilities.hideKeyboard(cyVar.X.f27730r);
                cyVar.X.f27730r.clearFocus();
            }
        } else {
            cyVar.f36099e3 = false;
        }
        if (i10 == 0) {
            this.f37811a = false;
            cyVar.f36098e2 = false;
            boolean z10 = cyVar.f36081b1;
            ay ayVar = this.f37812b;
            if (z10) {
                cyVar.f36081b1 = false;
                if (cyVar.f36092d1) {
                    xx xxVar = ayVar.f35447a;
                    int i11 = xx.f43293t3;
                    xxVar.B1();
                    cyVar.f36092d1 = false;
                }
                ayVar.d.l();
            }
            cy.o1(cyVar, ayVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        bh.f fVar;
        xx xxVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i13;
        boolean z10;
        Object[] objArr;
        this.f37813c.X();
        ay ayVar = this.f37812b;
        dw dwVar = ayVar.f35455x;
        int i14 = -i11;
        ArrayList arrayList = dwVar.f27949x;
        ArrayList arrayList2 = dwVar.f27941o;
        boolean z11 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((s4.b1) arrayList2.get(i15)).f45921a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((s4.b1) arrayList.get(i16)).f45921a;
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
        cyVar.p3(ayVar);
        cyVar.Q = true;
        View view3 = cyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (cyVar.R0 != 10 && this.f37811a && recyclerView.getChildCount() > 0 && i18 != -1) {
            s4.b1 K = recyclerView.K(i18);
            if (!cyVar.X3() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f45921a.getTop();
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
                        if (objArr != null && cyVar.a2 && (z10 || cyVar.f36099e3)) {
                            cyVar.a4(z10);
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
                    cyVar.a4(z10);
                }
                cyVar.Y1 = i18;
                cyVar.Z1 = i13;
                cyVar.a2 = true;
            }
        }
        if (!cyVar.K && recyclerView == cyVar.f36096e0[0].f35447a && !cyVar.f36124j2) {
            kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                if (!kVar2.t() && !cyVar.f36098e2 && !cyVar.G3.c()) {
                    if (i11 > 0 && cyVar.X3() && cyVar.f36096e0[0].f35453s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
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
        if (cyVar.fragmentView != null) {
            cyVar.j3();
        }
        ww wwVar = cyVar.G3;
        if (wwVar != null && wwVar.c() && (xxVar = ayVar.f35447a) != null) {
            xxVar.invalidate();
        }
        tw twVar = cyVar.E0;
        if (twVar != null && twVar.getPremiumHint() != null && cyVar.E0.getPremiumHint().V) {
            cyVar.E0.getPremiumHint().e(true);
        }
        ?? X3 = cyVar.X3();
        View childAt2 = ayVar.f35447a.getChildAt(X3 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        cyVar.e.a((i18 > X3 || (i12 - cyVar.N) + AndroidUtilities.dp(5.0f) < ayVar.f35447a.getPaddingTop()) ? true : true, true);
        if (i11 != 0 && (fVar = cyVar.l4) != null && Build.VERSION.SDK_INT >= 31) {
            fVar.f(i10, i11);
        }
    }
}
