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
public final class b6 implements n80, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.fm0 {
    public final y6 f36144a;

    public b6(y6 y6Var) {
        this.f36144a = y6Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.f36144a.f44249b);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        y6 y6Var = this.f36144a;
        ArrayList arrayList = y6Var.f44248a0;
        if (y6Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            t6 t6Var = (t6) arrayList.get(i10);
            int i11 = 0;
            if (t6Var.f17125a == 11 && (view instanceof org.telegram.ui.Cells.a2)) {
                int i12 = t6Var.f41864f;
                if (i12 < 0) {
                    y6Var.M = !y6Var.M;
                    y6Var.w0(true);
                    y6Var.v0();
                    return;
                }
                boolean[] zArr = y6Var.f44254e;
                if (i12 < 0) {
                    y6Var.u0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && y6Var.t0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i15 = t6Var.f41864f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.a2) view).c(z10, true);
                if (t6Var.f41866i) {
                    while (true) {
                        if (i11 >= y6Var.f44249b.getChildCount()) {
                            break;
                        }
                        View childAt = y6Var.f44249b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.a2) {
                            y6Var.f44249b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((t6) arrayList.get(R)).f41864f < 0) {
                                ((org.telegram.ui.Cells.a2) childAt).c(y6Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                y6Var.v0();
            } else if (t6Var.f41862c >= 0) {
                p80 p80Var = new p80(view.getContext(), y6Var);
                org.telegram.ui.ActionBar.n1 P = org.telegram.ui.Components.g5.P(y6Var, p80Var, view, f7, f10);
                int i16 = ((t6) arrayList.get(i10)).f41862c;
                p80Var.f40698c0 = i16;
                FrameLayout frameLayout = p80Var.f40703h0;
                org.telegram.ui.ActionBar.f1 f1Var = p80Var.V;
                org.telegram.ui.ActionBar.f1 f1Var2 = p80Var.W;
                org.telegram.ui.Components.ea0 ea0Var = p80Var.T;
                org.telegram.ui.Components.b10 b10Var = p80Var.f40697b0;
                if (i16 == 3) {
                    f1Var2.setVisibility(0);
                    f1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    b10Var.setVisibility(8);
                    ea0Var.setVisibility(8);
                } else {
                    f1Var2.setVisibility(8);
                    f1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    b10Var.setVisibility(0);
                    ea0Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = p80Var.f40699d0.getKeepMediaExceptions(i16);
                p80Var.f40701f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.n2 n2Var = p80Var.f40702g0;
                if (isEmpty) {
                    org.telegram.ui.Components.m9 m9Var = (org.telegram.ui.Components.m9) b10Var.d;
                    ((org.telegram.ui.ActionBar.j5) b10Var.f24843c).l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.j5) b10Var.f24843c).setRightPadding(AndroidUtilities.dp(8.0f));
                    m9Var.b(0, null, n2Var.getCurrentAccount());
                    m9Var.b(1, null, n2Var.getCurrentAccount());
                    m9Var.b(2, null, n2Var.getCurrentAccount());
                    m9Var.a(false);
                } else {
                    int min = Math.min(3, p80Var.f40701f0.size());
                    org.telegram.ui.Components.m9 m9Var2 = (org.telegram.ui.Components.m9) b10Var.d;
                    ((org.telegram.ui.ActionBar.j5) b10Var.f24843c).setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.j5) b10Var.f24843c).l(LocaleController.formatPluralString("ExceptionShort", p80Var.f40701f0.size(), Integer.valueOf(p80Var.f40701f0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        m9Var2.b(i17, n2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) p80Var.f40701f0.get(i17)).dialogId), n2Var.getCurrentAccount());
                    }
                    m9Var2.a(false);
                }
                p80Var.U.setVisibility(8);
                ea0Var.setVisibility(8);
                p80Var.f();
                p80Var.setParentWindow(P);
                p80Var.setCallback(new b6(y6Var));
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        y6 y6Var = this.f36144a;
        zh.b bVar = y6Var.Y;
        LongSparseArray longSparseArray = bVar.f54702c;
        r6 r6Var = new r6(0L);
        Iterator it = bVar.f54707j.iterator();
        while (it.hasNext()) {
            zh.a aVar = (zh.a) it.next();
            r6Var.a(aVar, aVar.d);
            r6 r6Var2 = (r6) longSparseArray.get(aVar.f54695b);
            if (r6Var2 != null) {
                r6Var2.b(aVar);
                if (r6Var2.f41283c <= 0) {
                    longSparseArray.remove(aVar.f54695b);
                    bVar.f54701b.remove(r6Var2);
                }
                ArrayList e7 = bVar.e(aVar.d);
                if (e7 != null) {
                    e7.remove(aVar);
                }
            }
        }
        if (r6Var.f41283c > 0) {
            y6Var.l0(r6Var, null, null);
        }
        y6Var.Y.d();
        v6 v6Var = y6Var.N;
        if (v6Var != null) {
            v6Var.c();
            y6Var.N.e(false);
        }
        y6Var.w0(true);
        y6Var.v0();
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
