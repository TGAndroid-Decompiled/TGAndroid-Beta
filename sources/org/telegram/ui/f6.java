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
public final class f6 implements t70, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.yl0 {
    public final c7 f36900a;

    public f6(c7 c7Var) {
        this.f36900a = c7Var;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.f36900a.f35833b);
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        c7 c7Var = this.f36900a;
        ArrayList arrayList = c7Var.f35832a0;
        if (c7Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            x6 x6Var = (x6) arrayList.get(i10);
            int i11 = 0;
            if (x6Var.f44296a == 11 && (view instanceof org.telegram.ui.Cells.a2)) {
                int i12 = x6Var.f43104f;
                if (i12 < 0) {
                    c7Var.M = !c7Var.M;
                    c7Var.w0(true);
                    c7Var.v0();
                    return;
                }
                boolean[] zArr = c7Var.e;
                if (i12 < 0) {
                    c7Var.u0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && c7Var.t0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i15 = x6Var.f43104f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.a2) view).c(z10, true);
                if (x6Var.f43106i) {
                    while (true) {
                        if (i11 >= c7Var.f35833b.getChildCount()) {
                            break;
                        }
                        View childAt = c7Var.f35833b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.a2) {
                            c7Var.f35833b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((x6) arrayList.get(R)).f43104f < 0) {
                                ((org.telegram.ui.Cells.a2) childAt).c(c7Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                c7Var.v0();
            } else if (x6Var.f43103c >= 0) {
                v70 v70Var = new v70(view.getContext(), c7Var);
                org.telegram.ui.ActionBar.m1 P = org.telegram.ui.Components.f5.P(c7Var, v70Var, view, f7, f10);
                int i16 = ((x6) arrayList.get(i10)).f43103c;
                v70Var.f42132c0 = i16;
                FrameLayout frameLayout = v70Var.f42137h0;
                org.telegram.ui.ActionBar.e1 e1Var = v70Var.V;
                org.telegram.ui.ActionBar.e1 e1Var2 = v70Var.W;
                org.telegram.ui.Components.x90 x90Var = v70Var.T;
                org.telegram.ui.Components.t00 t00Var = v70Var.f42131b0;
                if (i16 == 3) {
                    e1Var2.setVisibility(0);
                    e1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    t00Var.setVisibility(8);
                    x90Var.setVisibility(8);
                } else {
                    e1Var2.setVisibility(8);
                    e1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    t00Var.setVisibility(0);
                    x90Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = v70Var.f42133d0.getKeepMediaExceptions(i16);
                v70Var.f42135f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.n2 n2Var = v70Var.f42136g0;
                if (isEmpty) {
                    org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) t00Var.d;
                    ((org.telegram.ui.ActionBar.j5) t00Var.f30384c).l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.j5) t00Var.f30384c).setRightPadding(AndroidUtilities.dp(8.0f));
                    k9Var.b(0, null, n2Var.getCurrentAccount());
                    k9Var.b(1, null, n2Var.getCurrentAccount());
                    k9Var.b(2, null, n2Var.getCurrentAccount());
                    k9Var.a(false);
                } else {
                    int min = Math.min(3, v70Var.f42135f0.size());
                    org.telegram.ui.Components.k9 k9Var2 = (org.telegram.ui.Components.k9) t00Var.d;
                    ((org.telegram.ui.ActionBar.j5) t00Var.f30384c).setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.j5) t00Var.f30384c).l(LocaleController.formatPluralString("ExceptionShort", v70Var.f42135f0.size(), Integer.valueOf(v70Var.f42135f0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        k9Var2.b(i17, n2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) v70Var.f42135f0.get(i17)).dialogId), n2Var.getCurrentAccount());
                    }
                    k9Var2.a(false);
                }
                v70Var.U.setVisibility(8);
                x90Var.setVisibility(8);
                v70Var.f();
                v70Var.setParentWindow(P);
                v70Var.setCallback(new f6(c7Var));
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        c7 c7Var = this.f36900a;
        bi.c cVar = c7Var.Y;
        LongSparseArray longSparseArray = cVar.f4431c;
        v6 v6Var = new v6(0L);
        Iterator it = cVar.f4435j.iterator();
        while (it.hasNext()) {
            bi.b bVar = (bi.b) it.next();
            v6Var.a(bVar, bVar.d);
            v6 v6Var2 = (v6) longSparseArray.get(bVar.f4425b);
            if (v6Var2 != null) {
                v6Var2.b(bVar);
                if (v6Var2.f42116c <= 0) {
                    longSparseArray.remove(bVar.f4425b);
                    cVar.f4430b.remove(v6Var2);
                }
                ArrayList e = cVar.e(bVar.d);
                if (e != null) {
                    e.remove(bVar);
                }
            }
        }
        if (v6Var.f42116c > 0) {
            c7Var.l0(v6Var, null, null);
        }
        c7Var.Y.d();
        z6 z6Var = c7Var.N;
        if (z6Var != null) {
            z6Var.c();
            c7Var.N.e(false);
        }
        c7Var.w0(true);
        c7Var.v0();
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
