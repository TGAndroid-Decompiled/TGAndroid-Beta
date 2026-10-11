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
public final class a6 implements m80, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.hm0 {
    public final x6 f35890a;

    public a6(x6 x6Var) {
        this.f35890a = x6Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.f35890a.f43975b);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        x6 x6Var = this.f35890a;
        ArrayList arrayList = x6Var.f43974a0;
        if (x6Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            s6 s6Var = (s6) arrayList.get(i10);
            int i11 = 0;
            if (s6Var.f17175a == 11 && (view instanceof org.telegram.ui.Cells.a2)) {
                int i12 = s6Var.f41594f;
                if (i12 < 0) {
                    x6Var.M = !x6Var.M;
                    x6Var.w0(true);
                    x6Var.v0();
                    return;
                }
                boolean[] zArr = x6Var.f43980e;
                if (i12 < 0) {
                    x6Var.u0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && x6Var.t0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i15 = s6Var.f41594f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.a2) view).c(z10, true);
                if (s6Var.f41596i) {
                    while (true) {
                        if (i11 >= x6Var.f43975b.getChildCount()) {
                            break;
                        }
                        View childAt = x6Var.f43975b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.a2) {
                            x6Var.f43975b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((s6) arrayList.get(R)).f41594f < 0) {
                                ((org.telegram.ui.Cells.a2) childAt).c(x6Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                x6Var.v0();
            } else if (s6Var.f41592c >= 0) {
                o80 o80Var = new o80(view.getContext(), x6Var);
                org.telegram.ui.ActionBar.m1 P = org.telegram.ui.Components.g5.P(x6Var, o80Var, view, f7, f10);
                int i16 = ((s6) arrayList.get(i10)).f41592c;
                o80Var.f40440c0 = i16;
                FrameLayout frameLayout = o80Var.f40445h0;
                org.telegram.ui.ActionBar.e1 e1Var = o80Var.V;
                org.telegram.ui.ActionBar.e1 e1Var2 = o80Var.W;
                org.telegram.ui.Components.fa0 fa0Var = o80Var.T;
                org.telegram.ui.Components.c10 c10Var = o80Var.f40439b0;
                if (i16 == 3) {
                    e1Var2.setVisibility(0);
                    e1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    c10Var.setVisibility(8);
                    fa0Var.setVisibility(8);
                } else {
                    e1Var2.setVisibility(8);
                    e1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    c10Var.setVisibility(0);
                    fa0Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = o80Var.f40441d0.getKeepMediaExceptions(i16);
                o80Var.f40443f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.m2 m2Var = o80Var.f40444g0;
                if (isEmpty) {
                    org.telegram.ui.Components.m9 m9Var = (org.telegram.ui.Components.m9) c10Var.d;
                    ((org.telegram.ui.ActionBar.h5) c10Var.f25059c).l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.h5) c10Var.f25059c).setRightPadding(AndroidUtilities.dp(8.0f));
                    m9Var.b(0, null, m2Var.getCurrentAccount());
                    m9Var.b(1, null, m2Var.getCurrentAccount());
                    m9Var.b(2, null, m2Var.getCurrentAccount());
                    m9Var.a(false);
                } else {
                    int min = Math.min(3, o80Var.f40443f0.size());
                    org.telegram.ui.Components.m9 m9Var2 = (org.telegram.ui.Components.m9) c10Var.d;
                    ((org.telegram.ui.ActionBar.h5) c10Var.f25059c).setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.h5) c10Var.f25059c).l(LocaleController.formatPluralString("ExceptionShort", o80Var.f40443f0.size(), Integer.valueOf(o80Var.f40443f0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        m9Var2.b(i17, m2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) o80Var.f40443f0.get(i17)).dialogId), m2Var.getCurrentAccount());
                    }
                    m9Var2.a(false);
                }
                o80Var.U.setVisibility(8);
                fa0Var.setVisibility(8);
                o80Var.f();
                o80Var.setParentWindow(P);
                o80Var.setCallback(new a6(x6Var));
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        x6 x6Var = this.f35890a;
        zh.b bVar = x6Var.Y;
        LongSparseArray longSparseArray = bVar.f54789c;
        q6 q6Var = new q6(0L);
        Iterator it = bVar.f54794j.iterator();
        while (it.hasNext()) {
            zh.a aVar = (zh.a) it.next();
            q6Var.a(aVar, aVar.d);
            q6 q6Var2 = (q6) longSparseArray.get(aVar.f54782b);
            if (q6Var2 != null) {
                q6Var2.b(aVar);
                if (q6Var2.f41048c <= 0) {
                    longSparseArray.remove(aVar.f54782b);
                    bVar.f54788b.remove(q6Var2);
                }
                ArrayList e7 = bVar.e(aVar.d);
                if (e7 != null) {
                    e7.remove(aVar);
                }
            }
        }
        if (q6Var.f41048c > 0) {
            x6Var.l0(q6Var, null, null);
        }
        x6Var.Y.d();
        u6 u6Var = x6Var.N;
        if (u6Var != null) {
            u6Var.c();
            x6Var.N.e(false);
        }
        x6Var.w0(true);
        x6Var.v0();
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
