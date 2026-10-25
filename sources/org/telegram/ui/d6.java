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
public final class d6 implements oe.d, y70, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.hw0, org.telegram.ui.Components.am0 {
    public final int f38737a;
    public final c7 f38738b;

    public d6(c7 c7Var, int i10) {
        this.f38737a = i10;
        this.f38738b = c7Var;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        switch (this.f38737a) {
            case 0:
                c7 c7Var = this.f38738b;
                c7Var.v0();
                c7Var.fragmentView.invalidate();
                return;
            default:
                c7.W(this.f38738b, f7);
                return;
        }
    }

    @Override
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.f38738b.f38344b);
    }

    @Override
    public int c() {
        return this.f38738b.R;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        c7 c7Var = this.f38738b;
        ArrayList arrayList = c7Var.f38352g0;
        if (c7Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            y6 y6Var = (y6) arrayList.get(i10);
            int i11 = 0;
            if (y6Var.f47037a == 11 && (view instanceof org.telegram.ui.Cells.y1)) {
                int i12 = y6Var.f45967f;
                if (i12 < 0) {
                    c7Var.L = !c7Var.L;
                    c7Var.w0(true);
                    c7Var.u0();
                    return;
                }
                boolean[] zArr = c7Var.d;
                if (i12 < 0) {
                    c7Var.t0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && c7Var.s0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i15 = y6Var.f45967f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.y1) view).c(z10, true);
                if (y6Var.f45969i) {
                    while (true) {
                        if (i11 >= c7Var.f38344b.getChildCount()) {
                            break;
                        }
                        View childAt = c7Var.f38344b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.y1) {
                            c7Var.f38344b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((y6) arrayList.get(R)).f45967f < 0) {
                                ((org.telegram.ui.Cells.y1) childAt).c(c7Var.p0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                c7Var.u0();
            } else if (y6Var.f45966c >= 0) {
                b80 b80Var = new b80(view.getContext(), c7Var);
                org.telegram.ui.ActionBar.o1 P = org.telegram.ui.Components.g5.P(c7Var, b80Var, view, f7, f10);
                int i16 = ((y6) arrayList.get(i10)).f45966c;
                b80Var.f37995c0 = i16;
                FrameLayout frameLayout = b80Var.f38000h0;
                org.telegram.ui.ActionBar.g1 g1Var = b80Var.V;
                org.telegram.ui.ActionBar.g1 g1Var2 = b80Var.W;
                org.telegram.ui.Components.z90 z90Var = b80Var.T;
                a80 a80Var = b80Var.f37994b0;
                if (i16 == 3) {
                    g1Var2.setVisibility(0);
                    g1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    a80Var.setVisibility(8);
                    z90Var.setVisibility(8);
                } else {
                    g1Var2.setVisibility(8);
                    g1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    a80Var.setVisibility(0);
                    z90Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = b80Var.f37996d0.getKeepMediaExceptions(i16);
                b80Var.f37998f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.r2 r2Var = b80Var.f37999g0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.b6 b6Var = a80Var.f37661a;
                    org.telegram.ui.Components.m9 m9Var = a80Var.f37662b;
                    b6Var.l(LocaleController.getString(R.string.AddAnException), false);
                    a80Var.f37661a.setRightPadding(AndroidUtilities.dp(8.0f));
                    m9Var.b(0, null, r2Var.getCurrentAccount());
                    m9Var.b(1, null, r2Var.getCurrentAccount());
                    m9Var.b(2, null, r2Var.getCurrentAccount());
                    m9Var.a(false);
                } else {
                    int min = Math.min(3, b80Var.f37998f0.size());
                    org.telegram.ui.ActionBar.b6 b6Var2 = a80Var.f37661a;
                    org.telegram.ui.Components.m9 m9Var2 = a80Var.f37662b;
                    b6Var2.setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    a80Var.f37661a.l(LocaleController.formatPluralString("ExceptionShort", b80Var.f37998f0.size(), Integer.valueOf(b80Var.f37998f0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        m9Var2.b(i17, r2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) b80Var.f37998f0.get(i17)).dialogId), r2Var.getCurrentAccount());
                    }
                    m9Var2.a(false);
                }
                b80Var.U.setVisibility(8);
                z90Var.setVisibility(8);
                b80Var.g();
                b80Var.setParentWindow(P);
                b80Var.setCallback(new d6(c7Var, 1));
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        c7 c7Var = this.f38738b;
        ci.b bVar = c7Var.f38349e0;
        LongSparseArray longSparseArray = bVar.f6371c;
        w6 w6Var = new w6(0L);
        Iterator it = bVar.f6375j.iterator();
        while (it.hasNext()) {
            ci.a aVar = (ci.a) it.next();
            w6Var.a(aVar, aVar.d);
            w6 w6Var2 = (w6) longSparseArray.get(aVar.f6365b);
            if (w6Var2 != null) {
                w6Var2.b(aVar);
                if (w6Var2.f44985c <= 0) {
                    longSparseArray.remove(aVar.f6365b);
                    bVar.f6370b.remove(w6Var2);
                }
                ArrayList e = bVar.e(aVar.d);
                if (e != null) {
                    e.remove(aVar);
                }
            }
        }
        if (w6Var.f44985c > 0) {
            c7Var.k0(w6Var, null, null);
        }
        c7Var.f38349e0.d();
        m6 m6Var = c7Var.M;
        if (m6Var != null) {
            m6Var.d();
            c7Var.M.f(false);
        }
        c7Var.w0(true);
        c7Var.u0();
    }

    @Override
    public void z(float f7, int i10) {
        int i11 = this.f38737a;
    }

    private final void b(float f7, int i10) {
    }

    private final void d(float f7, int i10) {
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
