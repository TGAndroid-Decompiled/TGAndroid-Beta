package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class c6 implements le.d, m80, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.wv0, org.telegram.ui.Components.nl0 {
    public final int f35281a;
    public final a7 f35282b;

    public c6(a7 a7Var, int i10) {
        this.f35281a = i10;
        this.f35282b = a7Var;
    }

    @Override
    public void V(float f7, int i10) {
        int i11 = this.f35281a;
    }

    @Override
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.f35282b.f34679b);
    }

    @Override
    public void a0(int i10, float f7, float f10, le.e eVar) {
        switch (this.f35281a) {
            case 0:
                a7.W(this.f35282b, f7);
                return;
            default:
                a7 a7Var = this.f35282b;
                a7Var.u0();
                a7Var.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public int b() {
        return this.f35282b.R;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        a7 a7Var = this.f35282b;
        ArrayList arrayList = a7Var.f34688g0;
        if (a7Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            w6 w6Var = (w6) arrayList.get(i10);
            int i11 = 0;
            if (w6Var.f17182a == 11 && (view instanceof org.telegram.ui.Cells.a2)) {
                int i12 = w6Var.f41925f;
                if (i12 < 0) {
                    a7Var.L = !a7Var.L;
                    a7Var.v0(true);
                    a7Var.t0();
                    return;
                }
                boolean[] zArr = a7Var.d;
                if (i12 < 0) {
                    a7Var.s0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && a7Var.r0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i15 = w6Var.f41925f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.a2) view).c(z10, true);
                if (w6Var.f41927i) {
                    while (true) {
                        if (i11 >= a7Var.f34679b.getChildCount()) {
                            break;
                        }
                        View childAt = a7Var.f34679b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.a2) {
                            a7Var.f34679b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((w6) arrayList.get(R)).f41925f < 0) {
                                ((org.telegram.ui.Cells.a2) childAt).c(a7Var.o0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                a7Var.t0();
            } else if (w6Var.f41923c >= 0) {
                o80 o80Var = new o80(view.getContext(), a7Var);
                org.telegram.ui.ActionBar.n1 Q = org.telegram.ui.Components.e5.Q(a7Var, o80Var, view, f7, f10);
                int i16 = ((w6) arrayList.get(i10)).f41923c;
                o80Var.f39121c0 = i16;
                FrameLayout frameLayout = o80Var.f39126h0;
                org.telegram.ui.ActionBar.f1 f1Var = o80Var.V;
                org.telegram.ui.ActionBar.f1 f1Var2 = o80Var.W;
                org.telegram.ui.Components.q90 q90Var = o80Var.T;
                org.telegram.ui.Components.o00 o00Var = o80Var.f39120b0;
                if (i16 == 3) {
                    f1Var2.setVisibility(0);
                    f1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    o00Var.setVisibility(8);
                    q90Var.setVisibility(8);
                } else {
                    f1Var2.setVisibility(8);
                    f1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    o00Var.setVisibility(0);
                    q90Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = o80Var.f39122d0.getKeepMediaExceptions(i16);
                o80Var.f39124f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.n2 n2Var = o80Var.f39125g0;
                if (isEmpty) {
                    org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) o00Var.d;
                    ((org.telegram.ui.ActionBar.i5) o00Var.f29175c).l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.i5) o00Var.f29175c).setRightPadding(AndroidUtilities.dp(8.0f));
                    k9Var.b(0, null, n2Var.getCurrentAccount());
                    k9Var.b(1, null, n2Var.getCurrentAccount());
                    k9Var.b(2, null, n2Var.getCurrentAccount());
                    k9Var.a(false);
                } else {
                    int min = Math.min(3, o80Var.f39124f0.size());
                    org.telegram.ui.Components.k9 k9Var2 = (org.telegram.ui.Components.k9) o00Var.d;
                    ((org.telegram.ui.ActionBar.i5) o00Var.f29175c).setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.i5) o00Var.f29175c).l(LocaleController.formatPluralString("ExceptionShort", o80Var.f39124f0.size(), Integer.valueOf(o80Var.f39124f0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        k9Var2.b(i17, n2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) o80Var.f39124f0.get(i17)).dialogId), n2Var.getCurrentAccount());
                    }
                    k9Var2.a(false);
                }
                o80Var.U.setVisibility(8);
                q90Var.setVisibility(8);
                o80Var.f();
                o80Var.setParentWindow(Q);
                o80Var.setCallback(new c6(a7Var, 2));
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        a7 a7Var = this.f35282b;
        zh.b bVar = a7Var.f34685e0;
        LongSparseArray longSparseArray = bVar.f53558c;
        u6 u6Var = new u6(0L);
        Iterator it = bVar.f53563j.iterator();
        while (it.hasNext()) {
            zh.a aVar = (zh.a) it.next();
            u6Var.a(aVar, aVar.d);
            u6 u6Var2 = (u6) longSparseArray.get(aVar.f53551b);
            if (u6Var2 != null) {
                u6Var2.b(aVar);
                if (u6Var2.f41067c <= 0) {
                    longSparseArray.remove(aVar.f53551b);
                    bVar.f53557b.remove(u6Var2);
                }
                ArrayList e7 = bVar.e(aVar.d);
                if (e7 != null) {
                    e7.remove(aVar);
                }
            }
        }
        if (u6Var.f41067c > 0) {
            a7Var.i0(u6Var, null, null);
        }
        a7Var.f34685e0.d();
        k6 k6Var = a7Var.M;
        if (k6Var != null) {
            k6Var.d();
            a7Var.M.f(false);
        }
        a7Var.v0(true);
        a7Var.t0();
    }

    private final void d(float f7, int i10) {
    }

    private final void e(float f7, int i10) {
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
