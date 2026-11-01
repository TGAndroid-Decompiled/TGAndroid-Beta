package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class iw extends s4.s0 {
    public boolean f38199a;
    public final yx f38200b;
    public final sx f38201c;
    public final zx d;

    public iw(zx zxVar, yx yxVar, sx sxVar) {
        this.d = zxVar;
        this.f38200b = yxVar;
        this.f38201c = sxVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        zx zxVar = this.d;
        if (i10 == 1) {
            this.f38199a = true;
            zxVar.f44140e3 = true;
            a5.a aVar = zxVar.f44137e0[0].f43734b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f282c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f282c).cancel();
                aVar.f282c = null;
            }
            if (zxVar.X.f26635r.getText().length() == 0 && zxVar.X.f26635r.hasFocus()) {
                org.telegram.messenger.i0.v1(zxVar.X.f26635r);
                zxVar.X.f26635r.clearFocus();
            }
        } else {
            zxVar.f44140e3 = false;
        }
        if (i10 == 0) {
            this.f38199a = false;
            zxVar.f44139e2 = false;
            boolean z10 = zxVar.f44122b1;
            yx yxVar = this.f38200b;
            if (z10) {
                zxVar.f44122b1 = false;
                if (zxVar.f44133d1) {
                    vx vxVar = yxVar.f43733a;
                    int i11 = vx.B3;
                    vxVar.D1();
                    zxVar.f44133d1 = false;
                }
                yxVar.d.f();
            }
            zx.v1(zxVar, yxVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        tg.f fVar;
        vx vxVar;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        View childAt;
        int i13;
        boolean z10;
        Object[] objArr;
        this.f38201c.V();
        yx yxVar = this.f38200b;
        ew ewVar = yxVar.f43742y;
        int i14 = -i11;
        ArrayList arrayList = ewVar.f29527x;
        ArrayList arrayList2 = ewVar.f29519o;
        boolean z11 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((s4.c1) arrayList2.get(i15)).f47909a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((s4.c1) arrayList.get(i16)).f47909a;
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
        zx zxVar = this.d;
        zxVar.C3(yxVar);
        zxVar.Q = true;
        View view3 = zxVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (zxVar.R0 != 10 && this.f38199a && recyclerView.getChildCount() > 0 && i18 != -1) {
            s4.c1 K = recyclerView.K(i18);
            if (!zxVar.l4() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f47909a.getTop();
                } else {
                    i13 = 0;
                }
                int i20 = zxVar.Y1;
                if (i20 == i18) {
                    int i21 = zxVar.Z1;
                    int i22 = i21 - i13;
                    if (i13 < i21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(i22) <= 1) {
                        objArr = null;
                        if (objArr != null && zxVar.a2 && (z10 || zxVar.f44140e3)) {
                            zxVar.o4(z10);
                        }
                        zxVar.Y1 = i18;
                        zxVar.Z1 = i13;
                        zxVar.a2 = true;
                    }
                } else if (i18 > i20) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objArr = 1;
                if (objArr != null) {
                    zxVar.o4(z10);
                }
                zxVar.Y1 = i18;
                zxVar.Z1 = i13;
                zxVar.a2 = true;
            }
        }
        if (!zxVar.K && recyclerView == zxVar.f44137e0[0].f43733a && !zxVar.f44165j2) {
            lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
            if (lVar != null) {
                lVar2 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                if (!lVar2.u() && !zxVar.f44139e2 && !zxVar.F3.c()) {
                    if (i11 > 0 && zxVar.l4() && zxVar.f44137e0[0].f43739s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i11 > 0) {
                            if (top < 0) {
                                i11 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    zxVar.Q = true;
                    View view4 = zxVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        ww wwVar = zxVar.F3;
        if (wwVar != null && wwVar.c() && (vxVar = yxVar.f43733a) != null) {
            vxVar.invalidate();
        }
        tw twVar = zxVar.E0;
        if (twVar != null && twVar.getPremiumHint() != null && zxVar.E0.getPremiumHint().V) {
            zxVar.E0.getPremiumHint().e(true);
        }
        ?? l4 = zxVar.l4();
        View childAt2 = yxVar.f43733a.getChildAt(l4 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        zxVar.e.a((i18 > l4 || (i12 - zxVar.N) + org.telegram.messenger.i0.L(5.0f) < yxVar.f43733a.getPaddingTop()) ? true : true, true);
        if (i11 != 0 && (fVar = zxVar.f44167j4) != null && Build.VERSION.SDK_INT >= 31) {
            fVar.f(i10, i11);
        }
    }
}
