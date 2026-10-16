package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class dx extends s4.r0 {
    public boolean f35146a;
    public final xy f35147b;
    public final ry f35148c;
    public final yy d;

    public dx(yy yyVar, xy xyVar, ry ryVar) {
        this.d = yyVar;
        this.f35147b = xyVar;
        this.f35148c = ryVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        yy yyVar = this.d;
        if (i10 == 1) {
            this.f35146a = true;
            yyVar.f42007e3 = true;
            a5.a aVar = yyVar.f42004e0[0].f41680b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f282c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f282c).cancel();
                aVar.f282c = null;
            }
            if (yyVar.X.f27510r.getText().length() == 0 && yyVar.X.f27510r.hasFocus()) {
                AndroidUtilities.hideKeyboard(yyVar.X.f27510r);
                yyVar.X.f27510r.clearFocus();
            }
        } else {
            yyVar.f42007e3 = false;
        }
        if (i10 == 0) {
            this.f35146a = false;
            yyVar.f42006e2 = false;
            boolean z10 = yyVar.f41989b1;
            xy xyVar = this.f35147b;
            if (z10) {
                yyVar.f41989b1 = false;
                if (yyVar.f42000d1) {
                    uy uyVar = xyVar.f41679a;
                    int i11 = uy.f40506t3;
                    uyVar.B1();
                    yyVar.f42000d1 = false;
                }
                xyVar.d.l();
            }
            yy.o1(yyVar, xyVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        bh.f fVar;
        uy uyVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i13;
        boolean z10;
        Object[] objArr;
        this.f35148c.X();
        xy xyVar = this.f35147b;
        zw zwVar = xyVar.f41687x;
        int i14 = -i11;
        ArrayList arrayList = zwVar.f27737x;
        ArrayList arrayList2 = zwVar.f27729o;
        boolean z11 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((s4.b1) arrayList2.get(i15)).f44838a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((s4.b1) arrayList.get(i16)).f44838a;
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
        yy yyVar = this.d;
        yyVar.p3(xyVar);
        yyVar.Q = true;
        View view3 = yyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (yyVar.R0 != 10 && this.f35146a && recyclerView.getChildCount() > 0 && i18 != -1) {
            s4.b1 K = recyclerView.K(i18);
            if (!yyVar.X3() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f44838a.getTop();
                } else {
                    i13 = 0;
                }
                int i20 = yyVar.Y1;
                if (i20 == i18) {
                    int i21 = yyVar.Z1;
                    int i22 = i21 - i13;
                    if (i13 < i21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(i22) <= 1) {
                        objArr = null;
                        if (objArr != null && yyVar.a2 && (z10 || yyVar.f42007e3)) {
                            yyVar.a4(z10);
                        }
                        yyVar.Y1 = i18;
                        yyVar.Z1 = i13;
                        yyVar.a2 = true;
                    }
                } else if (i18 > i20) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objArr = 1;
                if (objArr != null) {
                    yyVar.a4(z10);
                }
                yyVar.Y1 = i18;
                yyVar.Z1 = i13;
                yyVar.a2 = true;
            }
        }
        if (!yyVar.K && recyclerView == yyVar.f42004e0[0].f41679a && !yyVar.f42032j2) {
            kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                if (!kVar2.t() && !yyVar.f42006e2 && !yyVar.G3.c()) {
                    if (i11 > 0 && yyVar.X3() && yyVar.f42004e0[0].f41685s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i11 > 0) {
                            if (top < 0) {
                                i11 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    yyVar.Q = true;
                    View view4 = yyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (yyVar.fragmentView != null) {
            yyVar.j3();
        }
        sx sxVar = yyVar.G3;
        if (sxVar != null && sxVar.c() && (uyVar = xyVar.f41679a) != null) {
            uyVar.invalidate();
        }
        px pxVar = yyVar.E0;
        if (pxVar != null && pxVar.getPremiumHint() != null && yyVar.E0.getPremiumHint().V) {
            yyVar.E0.getPremiumHint().e(true);
        }
        ?? X3 = yyVar.X3();
        View childAt2 = xyVar.f41679a.getChildAt(X3 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        yyVar.e.a((i18 > X3 || (i12 - yyVar.N) + AndroidUtilities.dp(5.0f) < xyVar.f41679a.getPaddingTop()) ? true : true, true);
        if (i11 != 0 && (fVar = yyVar.l4) != null && Build.VERSION.SDK_INT >= 31) {
            fVar.f(i10, i11);
        }
    }
}
