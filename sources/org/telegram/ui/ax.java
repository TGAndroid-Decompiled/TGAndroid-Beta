package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class ax extends s4.t0 {
    public boolean f35989a;
    public final uy f35990b;
    public final oy f35991c;
    public final vy d;

    public ax(vy vyVar, uy uyVar, oy oyVar) {
        this.d = vyVar;
        this.f35990b = uyVar;
        this.f35991c = oyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        vy vyVar = this.d;
        if (i10 == 1) {
            this.f35989a = true;
            vyVar.f42902d3 = true;
            a5.a aVar = vyVar.f42905e0[0].f42614b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f300c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f300c).cancel();
                aVar.f300c = null;
            }
            if (vyVar.X.f31362r.getText().length() == 0 && vyVar.X.f31362r.hasFocus()) {
                AndroidUtilities.hideKeyboard(vyVar.X.f31362r);
                vyVar.X.f31362r.clearFocus();
            }
        } else {
            vyVar.f42902d3 = false;
        }
        if (i10 == 0) {
            this.f35989a = false;
            vyVar.f42907e2 = false;
            boolean z10 = vyVar.f42889b1;
            uy uyVar = this.f35990b;
            if (z10) {
                vyVar.f42889b1 = false;
                if (vyVar.f42900d1) {
                    ry ryVar = uyVar.f42613a;
                    int i11 = ry.f41749t3;
                    ryVar.B1();
                    vyVar.f42900d1 = false;
                }
                uyVar.d.l();
            }
            vy.o1(vyVar, uyVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.h hVar;
        ry ryVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i13;
        boolean z10;
        Object[] objArr;
        this.f35991c.X();
        uy uyVar = this.f35990b;
        ww wwVar = uyVar.f42622x;
        int i14 = -i11;
        ArrayList arrayList = wwVar.f31259x;
        ArrayList arrayList2 = wwVar.f31251o;
        boolean z11 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((s4.d1) arrayList2.get(i15)).f47897a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((s4.d1) arrayList.get(i16)).f47897a;
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
        vy vyVar = this.d;
        vyVar.o3(uyVar);
        vyVar.Q = true;
        View view3 = vyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (vyVar.R0 != 10 && this.f35989a && recyclerView.getChildCount() > 0 && i18 != -1) {
            s4.d1 K = recyclerView.K(i18);
            if (!vyVar.W3() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f47897a.getTop();
                } else {
                    i13 = 0;
                }
                int i20 = vyVar.Y1;
                if (i20 == i18) {
                    int i21 = vyVar.Z1;
                    int i22 = i21 - i13;
                    if (i13 < i21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(i22) <= 1) {
                        objArr = null;
                        if (objArr != null && vyVar.a2 && (z10 || vyVar.f42902d3)) {
                            vyVar.Z3(z10);
                        }
                        vyVar.Y1 = i18;
                        vyVar.Z1 = i13;
                        vyVar.a2 = true;
                    }
                } else if (i18 > i20) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objArr = 1;
                if (objArr != null) {
                    vyVar.Z3(z10);
                }
                vyVar.Y1 = i18;
                vyVar.Z1 = i13;
                vyVar.a2 = true;
            }
        }
        if (!vyVar.K && recyclerView == vyVar.f42905e0[0].f42613a && !vyVar.f42933j2) {
            kVar = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
                if (!kVar2.u() && !vyVar.f42907e2 && !vyVar.F3.c()) {
                    if (i11 > 0 && vyVar.W3() && vyVar.f42905e0[0].f42620s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i11 > 0) {
                            if (top < 0) {
                                i11 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    vyVar.Q = true;
                    View view4 = vyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (vyVar.fragmentView != null) {
            vyVar.j3();
        }
        px pxVar = vyVar.F3;
        if (pxVar != null && pxVar.c() && (ryVar = uyVar.f42613a) != null) {
            ryVar.invalidate();
        }
        mx mxVar = vyVar.E0;
        if (mxVar != null && mxVar.getPremiumHint() != null && vyVar.E0.getPremiumHint().V) {
            vyVar.E0.getPremiumHint().e(true);
        }
        ?? W3 = vyVar.W3();
        View childAt2 = uyVar.f42613a.getChildAt(W3 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        vyVar.f42904e.a((i18 > W3 || (i12 - vyVar.N) + AndroidUtilities.dp(5.0f) < uyVar.f42613a.getPaddingTop()) ? true : true, true);
        if (i11 != 0 && (hVar = vyVar.f42939k4) != null && Build.VERSION.SDK_INT >= 31) {
            hVar.f(i10, i11);
        }
    }
}
