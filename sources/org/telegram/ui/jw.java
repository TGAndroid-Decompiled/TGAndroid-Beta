package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class jw extends s4.s0 {
    public boolean f38616a;
    public final zx f38617b;
    public final tx f38618c;
    public final ay d;

    public jw(ay ayVar, zx zxVar, tx txVar) {
        this.d = ayVar;
        this.f38617b = zxVar;
        this.f38618c = txVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        ay ayVar = this.d;
        if (i10 == 1) {
            this.f38616a = true;
            ayVar.f35797e3 = true;
            a5.a aVar = ayVar.f35794e0[0].f44240b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f282c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f282c).cancel();
                aVar.f282c = null;
            }
            if (ayVar.X.f26588r.getText().length() == 0 && ayVar.X.f26588r.hasFocus()) {
                org.telegram.messenger.i0.v1(ayVar.X.f26588r);
                ayVar.X.f26588r.clearFocus();
            }
        } else {
            ayVar.f35797e3 = false;
        }
        if (i10 == 0) {
            this.f38616a = false;
            ayVar.f35796e2 = false;
            boolean z10 = ayVar.f35779b1;
            zx zxVar = this.f38617b;
            if (z10) {
                ayVar.f35779b1 = false;
                if (ayVar.f35790d1) {
                    wx wxVar = zxVar.f44239a;
                    int i11 = wx.B3;
                    wxVar.D1();
                    ayVar.f35790d1 = false;
                }
                zxVar.d.f();
            }
            ay.u1(ayVar, zxVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        tg.f fVar;
        wx wxVar;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        View childAt;
        int i13;
        boolean z10;
        Object[] objArr;
        this.f38618c.V();
        zx zxVar = this.f38617b;
        fw fwVar = zxVar.f44248y;
        int i14 = -i11;
        ArrayList arrayList = fwVar.f29417x;
        ArrayList arrayList2 = fwVar.f29409o;
        boolean z11 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((s4.c1) arrayList2.get(i15)).f47898a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((s4.c1) arrayList.get(i16)).f47898a;
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
        ay ayVar = this.d;
        ayVar.B3(zxVar);
        ayVar.Q = true;
        View view3 = ayVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (ayVar.R0 != 10 && this.f38616a && recyclerView.getChildCount() > 0 && i18 != -1) {
            s4.c1 K = recyclerView.K(i18);
            if (!ayVar.k4() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f47898a.getTop();
                } else {
                    i13 = 0;
                }
                int i20 = ayVar.Y1;
                if (i20 == i18) {
                    int i21 = ayVar.Z1;
                    int i22 = i21 - i13;
                    if (i13 < i21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(i22) <= 1) {
                        objArr = null;
                        if (objArr != null && ayVar.a2 && (z10 || ayVar.f35797e3)) {
                            ayVar.n4(z10);
                        }
                        ayVar.Y1 = i18;
                        ayVar.Z1 = i13;
                        ayVar.a2 = true;
                    }
                } else if (i18 > i20) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objArr = 1;
                if (objArr != null) {
                    ayVar.n4(z10);
                }
                ayVar.Y1 = i18;
                ayVar.Z1 = i13;
                ayVar.a2 = true;
            }
        }
        if (!ayVar.K && recyclerView == ayVar.f35794e0[0].f44239a && !ayVar.f35822j2) {
            lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
            if (lVar != null) {
                lVar2 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                if (!lVar2.u() && !ayVar.f35796e2 && !ayVar.F3.c()) {
                    if (i11 > 0 && ayVar.k4() && ayVar.f35794e0[0].f44245s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i11 > 0) {
                            if (top < 0) {
                                i11 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    ayVar.Q = true;
                    View view4 = ayVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        xw xwVar = ayVar.F3;
        if (xwVar != null && xwVar.c() && (wxVar = zxVar.f44239a) != null) {
            wxVar.invalidate();
        }
        uw uwVar = ayVar.E0;
        if (uwVar != null && uwVar.getPremiumHint() != null && ayVar.E0.getPremiumHint().V) {
            ayVar.E0.getPremiumHint().e(true);
        }
        ?? k42 = ayVar.k4();
        View childAt2 = zxVar.f44239a.getChildAt(k42 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        ayVar.e.a((i18 > k42 || (i12 - ayVar.N) + org.telegram.messenger.i0.L(5.0f) < zxVar.f44239a.getPaddingTop()) ? true : true, true);
        if (i11 != 0 && (fVar = ayVar.f35824j4) != null && Build.VERSION.SDK_INT >= 31) {
            fVar.f(i10, i11);
        }
    }
}
