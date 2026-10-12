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
public final class f6 implements r80, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.bm0 {
    public final d7 f35744a;

    public f6(d7 d7Var) {
        this.f35744a = d7Var;
    }

    @Override
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.f35744a.f35163b);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        d7 d7Var = this.f35744a;
        ArrayList arrayList = d7Var.f35162a0;
        if (d7Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            y6 y6Var = (y6) arrayList.get(i10);
            int i11 = 0;
            if (y6Var.f43203a == 11 && (view instanceof org.telegram.ui.Cells.a2)) {
                int i12 = y6Var.f42046f;
                if (i12 < 0) {
                    d7Var.M = !d7Var.M;
                    d7Var.w0(true);
                    d7Var.v0();
                    return;
                }
                boolean[] zArr = d7Var.e;
                if (i12 < 0) {
                    d7Var.u0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && d7Var.t0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i15 = y6Var.f42046f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.a2) view).c(z10, true);
                if (y6Var.f42048i) {
                    while (true) {
                        if (i11 >= d7Var.f35163b.getChildCount()) {
                            break;
                        }
                        View childAt = d7Var.f35163b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.a2) {
                            d7Var.f35163b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((y6) arrayList.get(R)).f42046f < 0) {
                                ((org.telegram.ui.Cells.a2) childAt).c(d7Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                d7Var.v0();
            } else if (y6Var.f42045c >= 0) {
                t80 t80Var = new t80(view.getContext(), d7Var);
                org.telegram.ui.ActionBar.m1 P = org.telegram.ui.Components.g5.P(d7Var, t80Var, view, f7, f10);
                int i16 = ((y6) arrayList.get(i10)).f42045c;
                t80Var.f40308c0 = i16;
                FrameLayout frameLayout = t80Var.f40313h0;
                org.telegram.ui.ActionBar.e1 e1Var = t80Var.V;
                org.telegram.ui.ActionBar.e1 e1Var2 = t80Var.W;
                org.telegram.ui.Components.da0 da0Var = t80Var.T;
                org.telegram.ui.Components.x00 x00Var = t80Var.f40307b0;
                if (i16 == 3) {
                    e1Var2.setVisibility(0);
                    e1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    x00Var.setVisibility(8);
                    da0Var.setVisibility(8);
                } else {
                    e1Var2.setVisibility(8);
                    e1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    x00Var.setVisibility(0);
                    da0Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = t80Var.f40309d0.getKeepMediaExceptions(i16);
                t80Var.f40311f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.m2 m2Var = t80Var.f40312g0;
                if (isEmpty) {
                    org.telegram.ui.Components.n9 n9Var = (org.telegram.ui.Components.n9) x00Var.d;
                    ((org.telegram.ui.ActionBar.h5) x00Var.f31095c).l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.h5) x00Var.f31095c).setRightPadding(AndroidUtilities.dp(8.0f));
                    n9Var.b(0, null, m2Var.getCurrentAccount());
                    n9Var.b(1, null, m2Var.getCurrentAccount());
                    n9Var.b(2, null, m2Var.getCurrentAccount());
                    n9Var.a(false);
                } else {
                    int min = Math.min(3, t80Var.f40311f0.size());
                    org.telegram.ui.Components.n9 n9Var2 = (org.telegram.ui.Components.n9) x00Var.d;
                    ((org.telegram.ui.ActionBar.h5) x00Var.f31095c).setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.h5) x00Var.f31095c).l(LocaleController.formatPluralString("ExceptionShort", t80Var.f40311f0.size(), Integer.valueOf(t80Var.f40311f0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        n9Var2.b(i17, m2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) t80Var.f40311f0.get(i17)).dialogId), m2Var.getCurrentAccount());
                    }
                    n9Var2.a(false);
                }
                t80Var.U.setVisibility(8);
                da0Var.setVisibility(8);
                t80Var.f();
                t80Var.setParentWindow(P);
                t80Var.setCallback(new f6(d7Var));
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        d7 d7Var = this.f35744a;
        ai.c cVar = d7Var.Y;
        LongSparseArray longSparseArray = cVar.f922c;
        w6 w6Var = new w6(0L);
        Iterator it = cVar.f926j.iterator();
        while (it.hasNext()) {
            ai.b bVar = (ai.b) it.next();
            w6Var.a(bVar, bVar.d);
            w6 w6Var2 = (w6) longSparseArray.get(bVar.f916b);
            if (w6Var2 != null) {
                w6Var2.b(bVar);
                if (w6Var2.f41165c <= 0) {
                    longSparseArray.remove(bVar.f916b);
                    cVar.f921b.remove(w6Var2);
                }
                ArrayList e = cVar.e(bVar.d);
                if (e != null) {
                    e.remove(bVar);
                }
            }
        }
        if (w6Var.f41165c > 0) {
            d7Var.l0(w6Var, null, null);
        }
        d7Var.Y.d();
        a7 a7Var = d7Var.N;
        if (a7Var != null) {
            a7Var.c();
            d7Var.N.e(false);
        }
        d7Var.w0(true);
        d7Var.v0();
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
