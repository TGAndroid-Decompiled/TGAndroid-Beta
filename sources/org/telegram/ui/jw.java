package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class jw extends s4.r0 {
    public boolean f38694a;
    public final dy f38695b;
    public final wx f38696c;
    public final ey d;

    public jw(ey eyVar, dy dyVar, wx wxVar) {
        this.d = eyVar;
        this.f38695b = dyVar;
        this.f38696c = wxVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        ey eyVar = this.d;
        if (i10 == 1) {
            this.f38694a = true;
            eyVar.f37037e3 = true;
            a5.a aVar = eyVar.f37034e0[0].f36738b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f282c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f282c).cancel();
                aVar.f282c = null;
            }
            if (eyVar.X.f27258r.getText().length() == 0 && eyVar.X.f27258r.hasFocus()) {
                AndroidUtilities.hideKeyboard(eyVar.X.f27258r);
                eyVar.X.f27258r.clearFocus();
            }
        } else {
            eyVar.f37037e3 = false;
        }
        if (i10 == 0) {
            this.f38694a = false;
            eyVar.f37036e2 = false;
            boolean z10 = eyVar.f37019b1;
            dy dyVar = this.f38695b;
            if (z10) {
                eyVar.f37019b1 = false;
                if (eyVar.f37030d1) {
                    zx zxVar = dyVar.f36737a;
                    int i11 = zx.f44222w3;
                    zxVar.G1();
                    eyVar.f37030d1 = false;
                }
                dyVar.d.l();
            }
            ey.n1(eyVar, dyVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        bh.f fVar;
        zx zxVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i13;
        boolean z10;
        Object[] objArr;
        this.f38696c.W();
        dy dyVar = this.f38695b;
        fw fwVar = dyVar.f36745x;
        int i14 = -i11;
        ArrayList arrayList = fwVar.f27168x;
        ArrayList arrayList2 = fwVar.f27160o;
        boolean z11 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((s4.b1) arrayList2.get(i15)).f46342a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((s4.b1) arrayList.get(i16)).f46342a;
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
        ey eyVar = this.d;
        eyVar.p3(dyVar);
        eyVar.Q = true;
        View view3 = eyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (eyVar.R0 != 10 && this.f38694a && recyclerView.getChildCount() > 0 && i18 != -1) {
            s4.b1 K = recyclerView.K(i18);
            if (!eyVar.X3() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f46342a.getTop();
                } else {
                    i13 = 0;
                }
                int i20 = eyVar.Y1;
                if (i20 == i18) {
                    int i21 = eyVar.Z1;
                    int i22 = i21 - i13;
                    if (i13 < i21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(i22) <= 1) {
                        objArr = null;
                        if (objArr != null && eyVar.a2 && (z10 || eyVar.f37037e3)) {
                            eyVar.a4(z10);
                        }
                        eyVar.Y1 = i18;
                        eyVar.Z1 = i13;
                        eyVar.a2 = true;
                    }
                } else if (i18 > i20) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objArr = 1;
                if (objArr != null) {
                    eyVar.a4(z10);
                }
                eyVar.Y1 = i18;
                eyVar.Z1 = i13;
                eyVar.a2 = true;
            }
        }
        if (!eyVar.K && recyclerView == eyVar.f37034e0[0].f36737a && !eyVar.f37062j2) {
            kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                if (!kVar2.s() && !eyVar.f37036e2 && !eyVar.G3.c()) {
                    if (i11 > 0 && eyVar.X3() && eyVar.f37034e0[0].f36743s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i11 > 0) {
                            if (top < 0) {
                                i11 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    eyVar.Q = true;
                    View view4 = eyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (eyVar.fragmentView != null) {
            eyVar.i3();
        }
        yw ywVar = eyVar.G3;
        if (ywVar != null && ywVar.c() && (zxVar = dyVar.f36737a) != null) {
            zxVar.invalidate();
        }
        vw vwVar = eyVar.E0;
        if (vwVar != null && vwVar.getPremiumHint() != null && eyVar.E0.getPremiumHint().V) {
            eyVar.E0.getPremiumHint().e(true);
        }
        ?? X3 = eyVar.X3();
        View childAt2 = dyVar.f36737a.getChildAt(X3 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        eyVar.e.a((i18 > X3 || (i12 - eyVar.N) + AndroidUtilities.dp(5.0f) < dyVar.f36737a.getPaddingTop()) ? true : true, true);
        if (i11 != 0 && (fVar = eyVar.l4) != null && Build.VERSION.SDK_INT >= 31) {
            fVar.f(i10, i11);
        }
    }
}
