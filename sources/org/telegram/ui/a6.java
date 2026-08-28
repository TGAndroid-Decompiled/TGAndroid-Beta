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
public final class a6 implements s70, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.nk0 {
    public final y6 f36367a;

    public a6(y6 y6Var) {
        this.f36367a = y6Var;
    }

    @Override
    public void a(int i9) {
        AndroidUtilities.updateVisibleRows(this.f36367a.f44738b);
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        y6 y6Var = this.f36367a;
        ArrayList arrayList = y6Var.W;
        if (y6Var.getParentActivity() != null && i9 >= 0 && i9 < arrayList.size()) {
            t6 t6Var = (t6) arrayList.get(i9);
            int i10 = 0;
            if (t6Var.f48814a == 11 && (view instanceof org.telegram.ui.Cells.z1)) {
                int i11 = t6Var.f42865f;
                if (i11 < 0) {
                    y6Var.I = !y6Var.I;
                    y6Var.v0(true);
                    y6Var.u0();
                    return;
                }
                boolean[] zArr = y6Var.f44743e;
                if (i11 < 0) {
                    y6Var.t0(view);
                    return;
                }
                if (zArr[i11]) {
                    int i12 = 0;
                    for (int i13 = 0; i13 < 10; i13++) {
                        if (zArr[i13] && y6Var.s0(i13) > 0) {
                            i12++;
                        }
                    }
                    if (i12 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i14 = t6Var.f42865f;
                boolean z10 = !zArr[i14];
                zArr[i14] = z10;
                ((org.telegram.ui.Cells.z1) view).c(z10, true);
                if (t6Var.f42867i) {
                    while (true) {
                        if (i10 >= y6Var.f44738b.getChildCount()) {
                            break;
                        }
                        View childAt = y6Var.f44738b.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.z1) {
                            y6Var.f44738b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((t6) arrayList.get(R)).f42865f < 0) {
                                ((org.telegram.ui.Cells.z1) childAt).c(y6Var.q0(), true);
                                break;
                            }
                        }
                        i10++;
                    }
                }
                y6Var.u0();
            } else if (t6Var.f42863c >= 0) {
                u70 u70Var = new u70(view.getContext(), y6Var);
                org.telegram.ui.ActionBar.o1 Q = org.telegram.ui.Components.y4.Q(y6Var, u70Var, view, f10, f11);
                int i15 = ((t6) arrayList.get(i9)).f42863c;
                u70Var.V = i15;
                FrameLayout frameLayout = u70Var.f43155d0;
                org.telegram.ui.ActionBar.g1 g1Var = u70Var.R;
                org.telegram.ui.ActionBar.g1 g1Var2 = u70Var.S;
                org.telegram.ui.Components.l80 l80Var = u70Var.P;
                org.telegram.ui.Components.wz wzVar = u70Var.U;
                if (i15 == 3) {
                    g1Var2.setVisibility(0);
                    g1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    wzVar.setVisibility(8);
                    l80Var.setVisibility(8);
                } else {
                    g1Var2.setVisibility(8);
                    g1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    wzVar.setVisibility(0);
                    l80Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = u70Var.W.getKeepMediaExceptions(i15);
                u70Var.f43153b0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.o2 o2Var = u70Var.f43154c0;
                if (isEmpty) {
                    org.telegram.ui.Components.c9 c9Var = (org.telegram.ui.Components.c9) wzVar.d;
                    ((org.telegram.ui.ActionBar.h5) wzVar.f34476c).l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.h5) wzVar.f34476c).setRightPadding(AndroidUtilities.dp(8.0f));
                    c9Var.b(0, null, o2Var.getCurrentAccount());
                    c9Var.b(1, null, o2Var.getCurrentAccount());
                    c9Var.b(2, null, o2Var.getCurrentAccount());
                    c9Var.a(false);
                } else {
                    int min = Math.min(3, u70Var.f43153b0.size());
                    org.telegram.ui.Components.c9 c9Var2 = (org.telegram.ui.Components.c9) wzVar.d;
                    ((org.telegram.ui.ActionBar.h5) wzVar.f34476c).setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.h5) wzVar.f34476c).l(LocaleController.formatPluralString("ExceptionShort", u70Var.f43153b0.size(), Integer.valueOf(u70Var.f43153b0.size())), false);
                    for (int i16 = 0; i16 < min; i16++) {
                        c9Var2.b(i16, o2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) u70Var.f43153b0.get(i16)).dialogId), o2Var.getCurrentAccount());
                    }
                    c9Var2.a(false);
                }
                u70Var.Q.setVisibility(8);
                l80Var.setVisibility(8);
                u70Var.f();
                u70Var.setParentWindow(Q);
                u70Var.setCallback(new a6(y6Var));
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        y6 y6Var = this.f36367a;
        hh.b bVar = y6Var.U;
        LongSparseArray longSparseArray = bVar.f10788c;
        r6 r6Var = new r6(0L);
        Iterator it = bVar.f10793j.iterator();
        while (it.hasNext()) {
            hh.a aVar = (hh.a) it.next();
            r6Var.a(aVar, aVar.d);
            r6 r6Var2 = (r6) longSparseArray.get(aVar.f10781b);
            if (r6Var2 != null) {
                r6Var2.b(aVar);
                if (r6Var2.f42276c <= 0) {
                    longSparseArray.remove(aVar.f10781b);
                    bVar.f10787b.remove(r6Var2);
                }
                ArrayList e10 = bVar.e(aVar.d);
                if (e10 != null) {
                    e10.remove(aVar);
                }
            }
        }
        if (r6Var.f42276c > 0) {
            y6Var.k0(r6Var, null, null);
        }
        y6Var.U.d();
        v6 v6Var = y6Var.J;
        if (v6Var != null) {
            v6Var.c();
            y6Var.J.e(false);
        }
        y6Var.v0(true);
        y6Var.u0();
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }
}
