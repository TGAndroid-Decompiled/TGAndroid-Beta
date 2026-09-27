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
public final class d6 implements le.e, l80, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.nl0 {
    public final int f32868a;
    public final b7 f32869b;

    public d6(b7 b7Var, int i10) {
        this.f32868a = i10;
        this.f32869b = b7Var;
    }

    @Override
    public void C(float f7, int i10) {
        int i11 = this.f32868a;
    }

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
        switch (this.f32868a) {
            case 0:
                b7 b7Var = this.f32869b;
                b7Var.x0();
                b7Var.fragmentView.invalidate();
                return;
            default:
                b7.V(this.f32869b, f7);
                return;
        }
    }

    @Override
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.f32869b.f32257b);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        b7 b7Var = this.f32869b;
        ArrayList arrayList = b7Var.f32262e0;
        if (b7Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            w6 w6Var = (w6) arrayList.get(i10);
            int i11 = 0;
            if (w6Var.f15754a == 11 && (view instanceof org.telegram.ui.Cells.a2)) {
                int i12 = w6Var.f38821f;
                if (i12 < 0) {
                    b7Var.L = !b7Var.L;
                    b7Var.y0(true);
                    b7Var.w0();
                    return;
                }
                boolean[] zArr = b7Var.d;
                if (i12 < 0) {
                    b7Var.v0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && b7Var.u0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i15 = w6Var.f38821f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.a2) view).c(z10, true);
                if (w6Var.f38823i) {
                    while (true) {
                        if (i11 >= b7Var.f32257b.getChildCount()) {
                            break;
                        }
                        View childAt = b7Var.f32257b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.a2) {
                            b7Var.f32257b.getClass();
                            int S = RecyclerView.S(childAt);
                            if (S >= 0 && S < arrayList.size() && ((w6) arrayList.get(S)).f38821f < 0) {
                                ((org.telegram.ui.Cells.a2) childAt).c(b7Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                b7Var.w0();
            } else if (w6Var.f38820c >= 0) {
                n80 n80Var = new n80(view.getContext(), b7Var);
                org.telegram.ui.ActionBar.o1 Q = org.telegram.ui.Components.e5.Q(b7Var, n80Var, view, f7, f10);
                int i16 = ((w6) arrayList.get(i10)).f38820c;
                n80Var.f35842c0 = i16;
                FrameLayout frameLayout = n80Var.f35847h0;
                org.telegram.ui.ActionBar.g1 g1Var = n80Var.V;
                org.telegram.ui.ActionBar.g1 g1Var2 = n80Var.W;
                org.telegram.ui.Components.p90 p90Var = n80Var.T;
                org.telegram.ui.Components.n00 n00Var = n80Var.f35841b0;
                if (i16 == 3) {
                    g1Var2.setVisibility(0);
                    g1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    n00Var.setVisibility(8);
                    p90Var.setVisibility(8);
                } else {
                    g1Var2.setVisibility(8);
                    g1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    n00Var.setVisibility(0);
                    p90Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = n80Var.f35843d0.getKeepMediaExceptions(i16);
                n80Var.f35845f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.o2 o2Var = n80Var.f35846g0;
                if (isEmpty) {
                    org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) n00Var.d;
                    ((org.telegram.ui.ActionBar.j5) n00Var.f26677c).l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.j5) n00Var.f26677c).setRightPadding(AndroidUtilities.dp(8.0f));
                    k9Var.b(0, null, o2Var.getCurrentAccount());
                    k9Var.b(1, null, o2Var.getCurrentAccount());
                    k9Var.b(2, null, o2Var.getCurrentAccount());
                    k9Var.a(false);
                } else {
                    int min = Math.min(3, n80Var.f35845f0.size());
                    org.telegram.ui.Components.k9 k9Var2 = (org.telegram.ui.Components.k9) n00Var.d;
                    ((org.telegram.ui.ActionBar.j5) n00Var.f26677c).setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.j5) n00Var.f26677c).l(LocaleController.formatPluralString("ExceptionShort", n80Var.f35845f0.size(), Integer.valueOf(n80Var.f35845f0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        k9Var2.b(i17, o2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) n80Var.f35845f0.get(i17)).dialogId), o2Var.getCurrentAccount());
                    }
                    k9Var2.a(false);
                }
                n80Var.U.setVisibility(8);
                p90Var.setVisibility(8);
                n80Var.f();
                n80Var.setParentWindow(Q);
                n80Var.setCallback(new d6(b7Var, 1));
            }
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        b7 b7Var = this.f32869b;
        zh.b bVar = b7Var.f32260c0;
        LongSparseArray longSparseArray = bVar.f49517c;
        u6 u6Var = new u6(0L);
        Iterator it = bVar.f49521j.iterator();
        while (it.hasNext()) {
            zh.a aVar = (zh.a) it.next();
            u6Var.a(aVar, aVar.d);
            u6 u6Var2 = (u6) longSparseArray.get(aVar.f49511b);
            if (u6Var2 != null) {
                u6Var2.b(aVar);
                if (u6Var2.f38130c <= 0) {
                    longSparseArray.remove(aVar.f49511b);
                    bVar.f49516b.remove(u6Var2);
                }
                ArrayList e = bVar.e(aVar.d);
                if (e != null) {
                    e.remove(aVar);
                }
            }
        }
        if (u6Var.f38130c > 0) {
            b7Var.l0(u6Var, null, null);
        }
        b7Var.f32260c0.d();
        y6 y6Var = b7Var.M;
        if (y6Var != null) {
            y6Var.d();
            b7Var.M.f(false);
        }
        b7Var.y0(true);
        b7Var.w0();
    }

    private final void b(float f7, int i10) {
    }

    private final void d(float f7, int i10) {
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
