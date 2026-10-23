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
public final class e6 implements z70, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.bm0 {
    public final c7 f36826a;

    public e6(c7 c7Var) {
        this.f36826a = c7Var;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.f36826a.f36257b);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        c7 c7Var = this.f36826a;
        ArrayList arrayList = c7Var.f36256a0;
        if (c7Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            x6 x6Var = (x6) arrayList.get(i10);
            int i11 = 0;
            if (x6Var.f44713a == 11 && (view instanceof org.telegram.ui.Cells.z1)) {
                int i12 = x6Var.f43510f;
                if (i12 < 0) {
                    c7Var.M = !c7Var.M;
                    c7Var.x0(true);
                    c7Var.w0();
                    return;
                }
                boolean[] zArr = c7Var.e;
                if (i12 < 0) {
                    c7Var.v0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && c7Var.u0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i15 = x6Var.f43510f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.z1) view).c(z10, true);
                if (x6Var.f43512i) {
                    while (true) {
                        if (i11 >= c7Var.f36257b.getChildCount()) {
                            break;
                        }
                        View childAt = c7Var.f36257b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.z1) {
                            c7Var.f36257b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((x6) arrayList.get(R)).f43510f < 0) {
                                ((org.telegram.ui.Cells.z1) childAt).c(c7Var.s0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                c7Var.w0();
            } else if (x6Var.f43509c >= 0) {
                c80 c80Var = new c80(view.getContext(), c7Var);
                org.telegram.ui.ActionBar.m1 Q = org.telegram.ui.Components.f5.Q(c7Var, c80Var, view, f7, f10);
                int i16 = ((x6) arrayList.get(i10)).f43509c;
                c80Var.f36284c0 = i16;
                FrameLayout frameLayout = c80Var.f36289h0;
                org.telegram.ui.ActionBar.e1 e1Var = c80Var.V;
                org.telegram.ui.ActionBar.e1 e1Var2 = c80Var.W;
                org.telegram.ui.Components.y90 y90Var = c80Var.T;
                b80 b80Var = c80Var.f36283b0;
                if (i16 == 3) {
                    e1Var2.setVisibility(0);
                    e1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    b80Var.setVisibility(8);
                    y90Var.setVisibility(8);
                } else {
                    e1Var2.setVisibility(8);
                    e1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    b80Var.setVisibility(0);
                    y90Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = c80Var.f36285d0.getKeepMediaExceptions(i16);
                c80Var.f36287f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.o2 o2Var = c80Var.f36288g0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.n5 n5Var = b80Var.f35960a;
                    org.telegram.ui.Components.k9 k9Var = b80Var.f35961b;
                    n5Var.l(LocaleController.getString(R.string.AddAnException), false);
                    b80Var.f35960a.setRightPadding(AndroidUtilities.dp(8.0f));
                    k9Var.b(0, null, o2Var.getCurrentAccount());
                    k9Var.b(1, null, o2Var.getCurrentAccount());
                    k9Var.b(2, null, o2Var.getCurrentAccount());
                    k9Var.a(false);
                } else {
                    int min = Math.min(3, c80Var.f36287f0.size());
                    org.telegram.ui.ActionBar.n5 n5Var2 = b80Var.f35960a;
                    org.telegram.ui.Components.k9 k9Var2 = b80Var.f35961b;
                    n5Var2.setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    b80Var.f35960a.l(LocaleController.formatPluralString("ExceptionShort", c80Var.f36287f0.size(), Integer.valueOf(c80Var.f36287f0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        k9Var2.b(i17, o2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) c80Var.f36287f0.get(i17)).dialogId), o2Var.getCurrentAccount());
                    }
                    k9Var2.a(false);
                }
                c80Var.U.setVisibility(8);
                y90Var.setVisibility(8);
                c80Var.f();
                c80Var.setParentWindow(Q);
                c80Var.setCallback(new e6(c7Var));
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        c7 c7Var = this.f36826a;
        bi.c cVar = c7Var.Y;
        LongSparseArray longSparseArray = cVar.f4435c;
        v6 v6Var = new v6(0L);
        Iterator it = cVar.f4439j.iterator();
        while (it.hasNext()) {
            bi.b bVar = (bi.b) it.next();
            v6Var.a(bVar, bVar.d);
            v6 v6Var2 = (v6) longSparseArray.get(bVar.f4429b);
            if (v6Var2 != null) {
                v6Var2.b(bVar);
                if (v6Var2.f42618c <= 0) {
                    longSparseArray.remove(bVar.f4429b);
                    cVar.f4434b.remove(v6Var2);
                }
                ArrayList e = cVar.e(bVar.d);
                if (e != null) {
                    e.remove(bVar);
                }
            }
        }
        if (v6Var.f42618c > 0) {
            c7Var.m0(v6Var, null, null);
        }
        c7Var.Y.d();
        z6 z6Var = c7Var.N;
        if (z6Var != null) {
            z6Var.c();
            c7Var.N.e(false);
        }
        c7Var.x0(true);
        c7Var.w0();
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
