package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
public final class a6 implements qe.b, v50, org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.ct0, org.telegram.ui.Components.gj0 {
    public final int f43635a;
    public final z6 f43636b;

    public a6(z6 z6Var, int i3) {
        this.f43635a = i3;
        this.f43636b = z6Var;
    }

    @Override
    public void F(float f10, int i3) {
        int i10 = this.f43635a;
    }

    @Override
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        switch (this.f43635a) {
            case 0:
                z6 z6Var = this.f43636b;
                z6Var.z0();
                z6Var.fragmentView.invalidate();
                return;
            default:
                z6.a0(this.f43636b, f10);
                return;
        }
    }

    @Override
    public void a(int i3) {
        org.telegram.messenger.g0.b4(this.f43636b.f52547b);
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        z6 z6Var = this.f43636b;
        ArrayList arrayList = z6Var.f52556g0;
        if (z6Var.getParentActivity() != null && i3 >= 0 && i3 < arrayList.size()) {
            v6 v6Var = (v6) arrayList.get(i3);
            int i10 = 0;
            if (v6Var.f54715a == 11 && (view instanceof org.telegram.ui.Cells.c2)) {
                int i11 = v6Var.f50401f;
                if (i11 < 0) {
                    z6Var.M = !z6Var.M;
                    z6Var.A0(true);
                    z6Var.y0();
                    return;
                }
                boolean[] zArr = z6Var.d;
                if (i11 < 0) {
                    z6Var.x0(view);
                    return;
                }
                if (zArr[i11]) {
                    int i12 = 0;
                    for (int i13 = 0; i13 < 10; i13++) {
                        if (zArr[i13] && z6Var.w0(i13) > 0) {
                            i12++;
                        }
                    }
                    if (i12 <= 1) {
                        org.telegram.messenger.p2.APP_ERROR.a();
                        org.telegram.messenger.g0.G3(-3.0f, view, null);
                        return;
                    }
                }
                int i14 = v6Var.f50401f;
                boolean z10 = !zArr[i14];
                zArr[i14] = z10;
                ((org.telegram.ui.Cells.c2) view).c(z10, true);
                if (v6Var.f50403i) {
                    while (true) {
                        if (i10 >= z6Var.f52547b.getChildCount()) {
                            break;
                        }
                        View childAt = z6Var.f52547b.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.c2) {
                            z6Var.f52547b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((v6) arrayList.get(R)).f50401f < 0) {
                                ((org.telegram.ui.Cells.c2) childAt).c(z6Var.t0(), true);
                                break;
                            }
                        }
                        i10++;
                    }
                }
                z6Var.y0();
            } else if (v6Var.f50399c >= 0) {
                y50 y50Var = new y50(view.getContext(), z6Var);
                org.telegram.ui.ActionBar.f1 P = org.telegram.ui.Components.t4.P(z6Var, y50Var, view, f10, f11);
                int i15 = ((v6) arrayList.get(i3)).f50399c;
                y50Var.f52197d0 = i15;
                FrameLayout frameLayout = y50Var.f52202i0;
                org.telegram.ui.ActionBar.y0 y0Var = y50Var.W;
                org.telegram.ui.ActionBar.y0 y0Var2 = y50Var.f52194a0;
                org.telegram.ui.Components.s70 s70Var = y50Var.U;
                x50 x50Var = y50Var.f52196c0;
                if (i15 == 3) {
                    y0Var2.setVisibility(0);
                    y0Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    x50Var.setVisibility(8);
                    s70Var.setVisibility(8);
                } else {
                    y0Var2.setVisibility(8);
                    y0Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    x50Var.setVisibility(0);
                    s70Var.setVisibility(0);
                }
                ArrayList d = y50Var.f52198e0.d(i15);
                y50Var.f52200g0 = d;
                boolean isEmpty = d.isEmpty();
                org.telegram.ui.ActionBar.d2 d2Var = y50Var.f52201h0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.k5 k5Var = x50Var.f51829a;
                    org.telegram.ui.Components.x8 x8Var = x50Var.f51830b;
                    k5Var.l(org.telegram.messenger.bd.M0(2131754475, null), false);
                    x50Var.f51829a.setRightPadding(org.telegram.messenger.g0.L(8.0f));
                    x8Var.b(0, d2Var.getCurrentAccount(), null);
                    x8Var.b(1, d2Var.getCurrentAccount(), null);
                    x8Var.b(2, d2Var.getCurrentAccount(), null);
                    x8Var.a(false);
                } else {
                    int min = Math.min(3, y50Var.f52200g0.size());
                    org.telegram.ui.ActionBar.k5 k5Var2 = x50Var.f51829a;
                    org.telegram.ui.Components.x8 x8Var2 = x50Var.f51830b;
                    k5Var2.setRightPadding(org.telegram.messenger.g0.L((Math.max(0, min - 1) * 12) + 64));
                    x50Var.f51829a.l(org.telegram.messenger.bd.G(y50Var.f52200g0.size(), "ExceptionShort", Integer.valueOf(y50Var.f52200g0.size())), false);
                    for (int i16 = 0; i16 < min; i16++) {
                        x8Var2.b(i16, d2Var.getCurrentAccount(), d2Var.getMessagesController().e2(((org.telegram.messenger.s2) y50Var.f52200g0.get(i16)).f25268a));
                    }
                    x8Var2.a(false);
                }
                y50Var.V.setVisibility(8);
                s70Var.setVisibility(8);
                y50Var.g();
                y50Var.setParentWindow(P);
                y50Var.setCallback(new a6(z6Var, 1));
            }
        }
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public int c() {
        return this.f43636b.S;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        z6 z6Var = this.f43636b;
        di.c cVar = z6Var.f52553e0;
        LongSparseArray longSparseArray = cVar.f9188c;
        t6 t6Var = new t6(0L);
        Iterator it = cVar.f9193j.iterator();
        while (it.hasNext()) {
            di.b bVar = (di.b) it.next();
            t6Var.a(bVar, bVar.d);
            t6 t6Var2 = (t6) longSparseArray.get(bVar.f9181b);
            if (t6Var2 != null) {
                t6Var2.b(bVar);
                if (t6Var2.f49715c <= 0) {
                    longSparseArray.remove(bVar.f9181b);
                    cVar.f9187b.remove(t6Var2);
                }
                ArrayList e10 = cVar.e(bVar.d);
                if (e10 != null) {
                    e10.remove(bVar);
                }
            }
        }
        if (t6Var.f49715c > 0) {
            z6Var.o0(t6Var, null, null);
        }
        z6Var.f52553e0.d();
        k6 k6Var = z6Var.N;
        if (k6Var != null) {
            k6Var.d();
            z6Var.N.f(false);
        }
        z6Var.A0(true);
        z6Var.y0();
    }

    private final void d(float f10, int i3) {
    }

    private final void e(float f10, int i3) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
