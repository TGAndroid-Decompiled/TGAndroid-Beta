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
public final class c6 implements le.d, p80, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.bl0 {
    public final int f32678a;
    public final a7 f32679b;

    public c6(a7 a7Var, int i10) {
        this.f32678a = i10;
        this.f32679b = a7Var;
    }

    @Override
    public void C(float f7, int i10) {
        int i11 = this.f32678a;
    }

    @Override
    public void D(int i10, float f7, float f10, le.e eVar) {
        switch (this.f32678a) {
            case 0:
                a7 a7Var = this.f32679b;
                a7Var.x0();
                a7Var.fragmentView.invalidate();
                return;
            default:
                a7.V(this.f32679b, f7);
                return;
        }
    }

    @Override
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.f32679b.f31734b);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        a7 a7Var = this.f32679b;
        ArrayList arrayList = a7Var.f31739e0;
        if (a7Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            v6 v6Var = (v6) arrayList.get(i10);
            int i11 = 0;
            if (v6Var.f15543a == 11 && (view instanceof org.telegram.ui.Cells.z1)) {
                int i12 = v6Var.f38300f;
                if (i12 < 0) {
                    a7Var.L = !a7Var.L;
                    a7Var.y0(true);
                    a7Var.w0();
                    return;
                }
                boolean[] zArr = a7Var.d;
                if (i12 < 0) {
                    a7Var.v0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && a7Var.u0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i15 = v6Var.f38300f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.z1) view).c(z10, true);
                if (v6Var.f38302i) {
                    while (true) {
                        if (i11 >= a7Var.f31734b.getChildCount()) {
                            break;
                        }
                        View childAt = a7Var.f31734b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.z1) {
                            a7Var.f31734b.getClass();
                            int S = RecyclerView.S(childAt);
                            if (S >= 0 && S < arrayList.size() && ((v6) arrayList.get(S)).f38300f < 0) {
                                ((org.telegram.ui.Cells.z1) childAt).c(a7Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                a7Var.w0();
            } else if (v6Var.f38299c >= 0) {
                r80 r80Var = new r80(view.getContext(), a7Var);
                org.telegram.ui.ActionBar.o1 Q = org.telegram.ui.Components.c5.Q(a7Var, r80Var, view, f7, f10);
                int i16 = ((v6) arrayList.get(i10)).f38299c;
                r80Var.f37117c0 = i16;
                FrameLayout frameLayout = r80Var.f37122h0;
                org.telegram.ui.ActionBar.g1 g1Var = r80Var.V;
                org.telegram.ui.ActionBar.g1 g1Var2 = r80Var.W;
                org.telegram.ui.Components.c90 c90Var = r80Var.T;
                org.telegram.ui.Components.l00 l00Var = r80Var.f37116b0;
                if (i16 == 3) {
                    g1Var2.setVisibility(0);
                    g1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    l00Var.setVisibility(8);
                    c90Var.setVisibility(8);
                } else {
                    g1Var2.setVisibility(8);
                    g1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    l00Var.setVisibility(0);
                    c90Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = r80Var.f37118d0.getKeepMediaExceptions(i16);
                r80Var.f37120f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.o2 o2Var = r80Var.f37121g0;
                if (isEmpty) {
                    org.telegram.ui.Components.i9 i9Var = (org.telegram.ui.Components.i9) l00Var.d;
                    ((org.telegram.ui.ActionBar.k5) l00Var.f25795c).l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.k5) l00Var.f25795c).setRightPadding(AndroidUtilities.dp(8.0f));
                    i9Var.b(0, null, o2Var.getCurrentAccount());
                    i9Var.b(1, null, o2Var.getCurrentAccount());
                    i9Var.b(2, null, o2Var.getCurrentAccount());
                    i9Var.a(false);
                } else {
                    int min = Math.min(3, r80Var.f37120f0.size());
                    org.telegram.ui.Components.i9 i9Var2 = (org.telegram.ui.Components.i9) l00Var.d;
                    ((org.telegram.ui.ActionBar.k5) l00Var.f25795c).setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.k5) l00Var.f25795c).l(LocaleController.formatPluralString("ExceptionShort", r80Var.f37120f0.size(), Integer.valueOf(r80Var.f37120f0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        i9Var2.b(i17, o2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) r80Var.f37120f0.get(i17)).dialogId), o2Var.getCurrentAccount());
                    }
                    i9Var2.a(false);
                }
                r80Var.U.setVisibility(8);
                c90Var.setVisibility(8);
                r80Var.f();
                r80Var.setParentWindow(Q);
                r80Var.setCallback(new c6(a7Var, 1));
            }
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        a7 a7Var = this.f32679b;
        zh.b bVar = a7Var.f31737c0;
        LongSparseArray longSparseArray = bVar.f49224c;
        t6 t6Var = new t6(0L);
        Iterator it = bVar.f49228j.iterator();
        while (it.hasNext()) {
            zh.a aVar = (zh.a) it.next();
            t6Var.a(aVar, aVar.d);
            t6 t6Var2 = (t6) longSparseArray.get(aVar.f49218b);
            if (t6Var2 != null) {
                t6Var2.b(aVar);
                if (t6Var2.f37669c <= 0) {
                    longSparseArray.remove(aVar.f49218b);
                    bVar.f49223b.remove(t6Var2);
                }
                ArrayList e = bVar.e(aVar.d);
                if (e != null) {
                    e.remove(aVar);
                }
            }
        }
        if (t6Var.f37669c > 0) {
            a7Var.l0(t6Var, null, null);
        }
        a7Var.f31737c0.d();
        x6 x6Var = a7Var.M;
        if (x6Var != null) {
            x6Var.d();
            a7Var.M.f(false);
        }
        a7Var.y0(true);
        a7Var.w0();
    }

    private final void b(float f7, int i10) {
    }

    private final void d(float f7, int i10) {
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
