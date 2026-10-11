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
public final class a6 implements m80, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.gm0 {
    public final x6 f35924a;

    public a6(x6 x6Var) {
        this.f35924a = x6Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.f35924a.f44009b);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        x6 x6Var = this.f35924a;
        ArrayList arrayList = x6Var.f44008a0;
        if (x6Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            s6 s6Var = (s6) arrayList.get(i10);
            int i11 = 0;
            if (s6Var.f17211a == 11 && (view instanceof org.telegram.ui.Cells.a2)) {
                int i12 = s6Var.f41628f;
                if (i12 < 0) {
                    x6Var.M = !x6Var.M;
                    x6Var.w0(true);
                    x6Var.v0();
                    return;
                }
                boolean[] zArr = x6Var.f44014e;
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
                int i15 = s6Var.f41628f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.a2) view).c(z10, true);
                if (s6Var.f41630i) {
                    while (true) {
                        if (i11 >= x6Var.f44009b.getChildCount()) {
                            break;
                        }
                        View childAt = x6Var.f44009b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.a2) {
                            x6Var.f44009b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((s6) arrayList.get(R)).f41628f < 0) {
                                ((org.telegram.ui.Cells.a2) childAt).c(x6Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                x6Var.v0();
            } else if (s6Var.f41626c >= 0) {
                o80 o80Var = new o80(view.getContext(), x6Var);
                org.telegram.ui.ActionBar.m1 P = org.telegram.ui.Components.g5.P(x6Var, o80Var, view, f7, f10);
                int i16 = ((s6) arrayList.get(i10)).f41626c;
                o80Var.f40474c0 = i16;
                FrameLayout frameLayout = o80Var.f40479h0;
                org.telegram.ui.ActionBar.e1 e1Var = o80Var.V;
                org.telegram.ui.ActionBar.e1 e1Var2 = o80Var.W;
                org.telegram.ui.Components.ea0 ea0Var = o80Var.T;
                org.telegram.ui.Components.c10 c10Var = o80Var.f40473b0;
                if (i16 == 3) {
                    e1Var2.setVisibility(0);
                    e1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    c10Var.setVisibility(8);
                    ea0Var.setVisibility(8);
                } else {
                    e1Var2.setVisibility(8);
                    e1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    c10Var.setVisibility(0);
                    ea0Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = o80Var.f40475d0.getKeepMediaExceptions(i16);
                o80Var.f40477f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.m2 m2Var = o80Var.f40478g0;
                if (isEmpty) {
                    org.telegram.ui.Components.m9 m9Var = (org.telegram.ui.Components.m9) c10Var.d;
                    ((org.telegram.ui.ActionBar.h5) c10Var.f25166c).l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.h5) c10Var.f25166c).setRightPadding(AndroidUtilities.dp(8.0f));
                    m9Var.b(0, null, m2Var.getCurrentAccount());
                    m9Var.b(1, null, m2Var.getCurrentAccount());
                    m9Var.b(2, null, m2Var.getCurrentAccount());
                    m9Var.a(false);
                } else {
                    int min = Math.min(3, o80Var.f40477f0.size());
                    org.telegram.ui.Components.m9 m9Var2 = (org.telegram.ui.Components.m9) c10Var.d;
                    ((org.telegram.ui.ActionBar.h5) c10Var.f25166c).setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.h5) c10Var.f25166c).l(LocaleController.formatPluralString("ExceptionShort", o80Var.f40477f0.size(), Integer.valueOf(o80Var.f40477f0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        m9Var2.b(i17, m2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) o80Var.f40477f0.get(i17)).dialogId), m2Var.getCurrentAccount());
                    }
                    m9Var2.a(false);
                }
                o80Var.U.setVisibility(8);
                ea0Var.setVisibility(8);
                o80Var.f();
                o80Var.setParentWindow(P);
                o80Var.setCallback(new a6(x6Var));
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        x6 x6Var = this.f35924a;
        zh.b bVar = x6Var.Y;
        LongSparseArray longSparseArray = bVar.f54823c;
        q6 q6Var = new q6(0L);
        Iterator it = bVar.f54828j.iterator();
        while (it.hasNext()) {
            zh.a aVar = (zh.a) it.next();
            q6Var.a(aVar, aVar.d);
            q6 q6Var2 = (q6) longSparseArray.get(aVar.f54816b);
            if (q6Var2 != null) {
                q6Var2.b(aVar);
                if (q6Var2.f41082c <= 0) {
                    longSparseArray.remove(aVar.f54816b);
                    bVar.f54822b.remove(q6Var2);
                }
                ArrayList e7 = bVar.e(aVar.d);
                if (e7 != null) {
                    e7.remove(aVar);
                }
            }
        }
        if (q6Var.f41082c > 0) {
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
