package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class jw extends f2.d1 {
    public boolean f39637a;
    public final cy f39638b;
    public final vx f39639c;
    public final dy d;

    public jw(dy dyVar, cy cyVar, vx vxVar) {
        this.d = dyVar;
        this.f39638b = cyVar;
        this.f39639c = vxVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i9) {
        dy dyVar = this.d;
        if (i9 == 1) {
            this.f39637a = true;
            dyVar.Z2 = true;
            a6.a aVar = dyVar.f37629a0[0].f37351b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f101b;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f101b).cancel();
                aVar.f101b = null;
            }
            if (dyVar.T.f30664r.getText().length() == 0 && dyVar.T.f30664r.hasFocus()) {
                AndroidUtilities.hideKeyboard(dyVar.T.f30664r);
                dyVar.T.f30664r.clearFocus();
            }
        } else {
            dyVar.Z2 = false;
        }
        if (i9 == 0) {
            this.f39637a = false;
            dyVar.a2 = false;
            boolean z10 = dyVar.X0;
            cy cyVar = this.f39638b;
            if (z10) {
                dyVar.X0 = false;
                if (dyVar.Z0) {
                    yx yxVar = cyVar.f37350a;
                    int i10 = yx.f44960r3;
                    yxVar.A1();
                    dyVar.Z0 = false;
                }
                cyVar.d.l();
            }
            dy.r1(dyVar, cyVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        int i11;
        ig.e eVar;
        yx yxVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i12;
        boolean z10;
        boolean z11;
        this.f39639c.X();
        cy cyVar = this.f39638b;
        fw fwVar = cyVar.f37359x;
        int i13 = -i10;
        ArrayList arrayList = fwVar.f31743x;
        ArrayList arrayList2 = fwVar.f31735o;
        boolean z12 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view = ((f2.q1) arrayList2.get(i14)).f5501a;
                view.setTranslationY(view.getTranslationY() + i13);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                View view2 = ((f2.q1) arrayList.get(i15)).f5501a;
                view2.setTranslationY(view2.getTranslationY() + i13);
            }
        }
        int i16 = -1;
        int i17 = -1;
        for (int i18 = 0; i18 < recyclerView.getChildCount(); i18++) {
            int R = RecyclerView.R(recyclerView.getChildAt(i18));
            if (R >= 0) {
                if (i16 == -1 || R > i16) {
                    i16 = R;
                }
                if (i17 == -1 || R < i17) {
                    i17 = R;
                }
            }
        }
        dy dyVar = this.d;
        dyVar.r3(cyVar);
        dyVar.M = true;
        View view3 = dyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (dyVar.N0 != 10 && this.f39637a && recyclerView.getChildCount() > 0 && i17 != -1) {
            f2.q1 K = recyclerView.K(i17);
            if (!dyVar.Z3() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i12 = K.f5501a.getTop();
                } else {
                    i12 = 0;
                }
                int i19 = dyVar.U1;
                if (i19 == i17) {
                    int i20 = dyVar.V1;
                    int i21 = i20 - i12;
                    if (i12 < i20) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(i21) <= 1) {
                        z11 = false;
                        if (z11 && dyVar.W1 && (z10 || dyVar.Z2)) {
                            dyVar.c4(z10);
                        }
                        dyVar.U1 = i17;
                        dyVar.V1 = i12;
                        dyVar.W1 = true;
                    }
                } else if (i17 > i19) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = true;
                if (z11) {
                    dyVar.c4(z10);
                }
                dyVar.U1 = i17;
                dyVar.V1 = i12;
                dyVar.W1 = true;
            }
        }
        if (!dyVar.G && recyclerView == dyVar.f37629a0[0].f37350a && !dyVar.f37658f2) {
            kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                if (!kVar2.s() && !dyVar.a2 && !dyVar.B3.c()) {
                    if (i10 > 0 && dyVar.Z3() && dyVar.f37629a0[0].f37357s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i10 > 0) {
                            if (top < 0) {
                                i10 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    dyVar.M = true;
                    View view4 = dyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (dyVar.fragmentView != null) {
            dyVar.m3();
        }
        yw ywVar = dyVar.B3;
        if (ywVar != null && ywVar.c() && (yxVar = cyVar.f37350a) != null) {
            yxVar.invalidate();
        }
        vw vwVar = dyVar.A0;
        if (vwVar != null && vwVar.getPremiumHint() != null && dyVar.A0.getPremiumHint().R) {
            dyVar.A0.getPremiumHint().e(true);
        }
        ?? Z3 = dyVar.Z3();
        View childAt2 = cyVar.f37350a.getChildAt(Z3 == true ? 1 : 0);
        if (childAt2 != null) {
            i11 = childAt2.getTop();
        } else {
            i11 = 0;
        }
        dyVar.f37649e.a((i17 > Z3 || (((float) i11) - dyVar.J) + ((float) AndroidUtilities.dp(5.0f)) < ((float) cyVar.f37350a.getPaddingTop())) ? true : true, true);
        if (i10 != 0 && (eVar = dyVar.f37670h4) != null && Build.VERSION.SDK_INT >= 31) {
            eVar.f(i9, i10);
        }
    }
}
