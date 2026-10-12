package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class dx extends s4.r0 {
    public boolean f35397a;
    public final xy f35398b;
    public final ry f35399c;
    public final yy d;

    public dx(yy yyVar, xy xyVar, ry ryVar) {
        this.d = yyVar;
        this.f35398b = xyVar;
        this.f35399c = ryVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        yy yyVar = this.d;
        if (i10 == 1) {
            this.f35397a = true;
            yyVar.f42323d3 = true;
            a5.a aVar = yyVar.f42325e0[0].f41981b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f280c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f280c).cancel();
                aVar.f280c = null;
            }
            if (yyVar.X.f27815r.getText().length() == 0 && yyVar.X.f27815r.hasFocus()) {
                AndroidUtilities.hideKeyboard(yyVar.X.f27815r);
                yyVar.X.f27815r.clearFocus();
            }
        } else {
            yyVar.f42323d3 = false;
        }
        if (i10 == 0) {
            this.f35397a = false;
            yyVar.f42327e2 = false;
            boolean z10 = yyVar.f42310b1;
            xy xyVar = this.f35398b;
            if (z10) {
                yyVar.f42310b1 = false;
                if (yyVar.f42321d1) {
                    uy uyVar = xyVar.f41980a;
                    int i11 = uy.f40814t3;
                    uyVar.B1();
                    yyVar.f42321d1 = false;
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
        this.f35399c.X();
        xy xyVar = this.f35398b;
        zw zwVar = xyVar.f41988x;
        int i14 = -i11;
        ArrayList arrayList = zwVar.f28053x;
        ArrayList arrayList2 = zwVar.f28045o;
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
        yyVar.o3(xyVar);
        yyVar.Q = true;
        View view3 = yyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (yyVar.R0 != 10 && this.f35397a && recyclerView.getChildCount() > 0 && i18 != -1) {
            s4.b1 K = recyclerView.K(i18);
            if (!yyVar.W3() || (K != null && K.b() >= 0)) {
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
                        if (objArr != null && yyVar.a2 && (z10 || yyVar.f42323d3)) {
                            yyVar.Z3(z10);
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
                    yyVar.Z3(z10);
                }
                yyVar.Y1 = i18;
                yyVar.Z1 = i13;
                yyVar.a2 = true;
            }
        }
        if (!yyVar.K && recyclerView == yyVar.f42325e0[0].f41980a && !yyVar.f42353j2) {
            kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                if (!kVar2.t() && !yyVar.f42327e2 && !yyVar.F3.c()) {
                    if (i11 > 0 && yyVar.W3() && yyVar.f42325e0[0].f41986s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
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
        sx sxVar = yyVar.F3;
        if (sxVar != null && sxVar.c() && (uyVar = xyVar.f41980a) != null) {
            uyVar.invalidate();
        }
        px pxVar = yyVar.E0;
        if (pxVar != null && pxVar.getPremiumHint() != null && yyVar.E0.getPremiumHint().V) {
            yyVar.E0.getPremiumHint().e(true);
        }
        ?? W3 = yyVar.W3();
        View childAt2 = xyVar.f41980a.getChildAt(W3 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        yyVar.e.a((i18 > W3 || (i12 - yyVar.N) + AndroidUtilities.dp(5.0f) < xyVar.f41980a.getPaddingTop()) ? true : true, true);
        if (i11 != 0 && (fVar = yyVar.f42360k4) != null && Build.VERSION.SDK_INT >= 31) {
            fVar.f(i10, i11);
        }
    }
}
