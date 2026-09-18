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
public final class b6 implements le.d, n80, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ll0 {
    public final int f32251a;
    public final z6 f32252b;

    public b6(z6 z6Var, int i10) {
        this.f32251a = i10;
        this.f32252b = z6Var;
    }

    @Override
    public void C(float f7, int i10) {
        int i11 = this.f32251a;
    }

    @Override
    public void D(int i10, float f7, float f10, le.e eVar) {
        switch (this.f32251a) {
            case 0:
                z6 z6Var = this.f32252b;
                z6Var.x0();
                z6Var.fragmentView.invalidate();
                return;
            default:
                z6.V(this.f32252b, f7);
                return;
        }
    }

    @Override
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.f32252b.f39984b);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        z6 z6Var = this.f32252b;
        ArrayList arrayList = z6Var.f39989e0;
        if (z6Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            u6 u6Var = (u6) arrayList.get(i10);
            int i11 = 0;
            if (u6Var.f15672a == 11 && (view instanceof org.telegram.ui.Cells.a2)) {
                int i12 = u6Var.f37886f;
                if (i12 < 0) {
                    z6Var.L = !z6Var.L;
                    z6Var.y0(true);
                    z6Var.w0();
                    return;
                }
                boolean[] zArr = z6Var.d;
                if (i12 < 0) {
                    z6Var.v0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && z6Var.u0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i15 = u6Var.f37886f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.a2) view).c(z10, true);
                if (u6Var.f37888i) {
                    while (true) {
                        if (i11 >= z6Var.f39984b.getChildCount()) {
                            break;
                        }
                        View childAt = z6Var.f39984b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.a2) {
                            z6Var.f39984b.getClass();
                            int S = RecyclerView.S(childAt);
                            if (S >= 0 && S < arrayList.size() && ((u6) arrayList.get(S)).f37886f < 0) {
                                ((org.telegram.ui.Cells.a2) childAt).c(z6Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                z6Var.w0();
            } else if (u6Var.f37885c >= 0) {
                p80 p80Var = new p80(view.getContext(), z6Var);
                org.telegram.ui.ActionBar.n1 Q = org.telegram.ui.Components.e5.Q(z6Var, p80Var, view, f7, f10);
                int i16 = ((u6) arrayList.get(i10)).f37885c;
                p80Var.f36378c0 = i16;
                FrameLayout frameLayout = p80Var.f36383h0;
                org.telegram.ui.ActionBar.f1 f1Var = p80Var.V;
                org.telegram.ui.ActionBar.f1 f1Var2 = p80Var.W;
                org.telegram.ui.Components.l90 l90Var = p80Var.T;
                org.telegram.ui.Components.l00 l00Var = p80Var.f36377b0;
                if (i16 == 3) {
                    f1Var2.setVisibility(0);
                    f1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    l00Var.setVisibility(8);
                    l90Var.setVisibility(8);
                } else {
                    f1Var2.setVisibility(8);
                    f1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    l00Var.setVisibility(0);
                    l90Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = p80Var.f36379d0.getKeepMediaExceptions(i16);
                p80Var.f36381f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.n2 n2Var = p80Var.f36382g0;
                if (isEmpty) {
                    org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) l00Var.d;
                    ((org.telegram.ui.ActionBar.j5) l00Var.f25977c).l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.j5) l00Var.f25977c).setRightPadding(AndroidUtilities.dp(8.0f));
                    k9Var.b(0, null, n2Var.getCurrentAccount());
                    k9Var.b(1, null, n2Var.getCurrentAccount());
                    k9Var.b(2, null, n2Var.getCurrentAccount());
                    k9Var.a(false);
                } else {
                    int min = Math.min(3, p80Var.f36381f0.size());
                    org.telegram.ui.Components.k9 k9Var2 = (org.telegram.ui.Components.k9) l00Var.d;
                    ((org.telegram.ui.ActionBar.j5) l00Var.f25977c).setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.j5) l00Var.f25977c).l(LocaleController.formatPluralString("ExceptionShort", p80Var.f36381f0.size(), Integer.valueOf(p80Var.f36381f0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        k9Var2.b(i17, n2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) p80Var.f36381f0.get(i17)).dialogId), n2Var.getCurrentAccount());
                    }
                    k9Var2.a(false);
                }
                p80Var.U.setVisibility(8);
                l90Var.setVisibility(8);
                p80Var.f();
                p80Var.setParentWindow(Q);
                p80Var.setCallback(new b6(z6Var, 1));
            }
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        z6 z6Var = this.f32252b;
        zh.b bVar = z6Var.f39987c0;
        LongSparseArray longSparseArray = bVar.f49452c;
        s6 s6Var = new s6(0L);
        Iterator it = bVar.f49456j.iterator();
        while (it.hasNext()) {
            zh.a aVar = (zh.a) it.next();
            s6Var.a(aVar, aVar.d);
            s6 s6Var2 = (s6) longSparseArray.get(aVar.f49446b);
            if (s6Var2 != null) {
                s6Var2.b(aVar);
                if (s6Var2.f37203c <= 0) {
                    longSparseArray.remove(aVar.f49446b);
                    bVar.f49451b.remove(s6Var2);
                }
                ArrayList e = bVar.e(aVar.d);
                if (e != null) {
                    e.remove(aVar);
                }
            }
        }
        if (s6Var.f37203c > 0) {
            z6Var.l0(s6Var, null, null);
        }
        z6Var.f39987c0.d();
        w6 w6Var = z6Var.M;
        if (w6Var != null) {
            w6Var.d();
            z6Var.M.f(false);
        }
        z6Var.y0(true);
        z6Var.w0();
    }

    private final void b(float f7, int i10) {
    }

    private final void d(float f7, int i10) {
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
