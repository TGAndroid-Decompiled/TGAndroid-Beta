package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class bx extends s4.s0 {
    public boolean f31459a;
    public final vy f31460b;
    public final py f31461c;
    public final wy d;

    public bx(wy wyVar, vy vyVar, py pyVar) {
        this.d = wyVar;
        this.f31460b = vyVar;
        this.f31461c = pyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        wy wyVar = this.d;
        if (i10 == 1) {
            this.f31459a = true;
            wyVar.f38429d3 = true;
            a5.a aVar = wyVar.f38431e0[0].f37646b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f276c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f276c).cancel();
                aVar.f276c = null;
            }
            if (wyVar.X.f24572r.getText().length() == 0 && wyVar.X.f24572r.hasFocus()) {
                AndroidUtilities.hideKeyboard(wyVar.X.f24572r);
                wyVar.X.f24572r.clearFocus();
            }
        } else {
            wyVar.f38429d3 = false;
        }
        if (i10 == 0) {
            this.f31459a = false;
            wyVar.f38433e2 = false;
            boolean z10 = wyVar.f38416b1;
            vy vyVar = this.f31460b;
            if (z10) {
                wyVar.f38416b1 = false;
                if (wyVar.f38427d1) {
                    sy syVar = vyVar.f37645a;
                    int i11 = sy.f36776v3;
                    syVar.z1();
                    wyVar.f38427d1 = false;
                }
                vyVar.d.l();
            }
            wy.r1(wyVar, vyVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        zg.e eVar;
        sy syVar;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        View childAt;
        int i13;
        boolean z10;
        boolean z11;
        this.f31461c.X();
        vy vyVar = this.f31460b;
        xw xwVar = vyVar.f37653x;
        int i14 = -i11;
        ArrayList arrayList = xwVar.f23429x;
        ArrayList arrayList2 = xwVar.f23421o;
        boolean z12 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((s4.c1) arrayList2.get(i15)).f41610a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((s4.c1) arrayList.get(i16)).f41610a;
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
        wy wyVar = this.d;
        wyVar.r3(vyVar);
        wyVar.Q = true;
        View view3 = wyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (wyVar.R0 != 10 && this.f31459a && recyclerView.getChildCount() > 0 && i18 != -1) {
            s4.c1 K = recyclerView.K(i18);
            if (!wyVar.Z3() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f41610a.getTop();
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
                        if (z11 && wyVar.a2 && (z10 || wyVar.f38429d3)) {
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
        if (!wyVar.K && recyclerView == wyVar.f38431e0[0].f37645a && !wyVar.f38459j2) {
            lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
            if (lVar != null) {
                lVar2 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                if (!lVar2.s() && !wyVar.f38433e2 && !wyVar.F3.c()) {
                    if (i11 > 0 && wyVar.Z3() && wyVar.f38431e0[0].f37651s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
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
        if (qxVar != null && qxVar.c() && (syVar = vyVar.f37645a) != null) {
            syVar.invalidate();
        }
        nx nxVar = wyVar.E0;
        if (nxVar != null && nxVar.getPremiumHint() != null && wyVar.E0.getPremiumHint().V) {
            wyVar.E0.getPremiumHint().e(true);
        }
        ?? Z3 = wyVar.Z3();
        View childAt2 = vyVar.f37645a.getChildAt(Z3 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        wyVar.e.a((i18 > Z3 || (((float) i12) - wyVar.N) + ((float) AndroidUtilities.dp(5.0f)) < ((float) vyVar.f37645a.getPaddingTop())) ? true : true, true);
        if (i11 != 0 && (eVar = wyVar.l4) != null && Build.VERSION.SDK_INT >= 31) {
            eVar.f(i10, i11);
        }
    }
}
