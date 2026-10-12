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
public final class e6 implements p80, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.lm0 {
    public final b7 f36983a;

    public e6(b7 b7Var) {
        this.f36983a = b7Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.f36983a.f36079b);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        b7 b7Var = this.f36983a;
        ArrayList arrayList = b7Var.f36078a0;
        if (b7Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            w6 w6Var = (w6) arrayList.get(i10);
            int i11 = 0;
            if (w6Var.f16876a == 11 && (view instanceof org.telegram.ui.Cells.a2)) {
                int i12 = w6Var.f43047f;
                if (i12 < 0) {
                    b7Var.M = !b7Var.M;
                    b7Var.w0(true);
                    b7Var.v0();
                    return;
                }
                boolean[] zArr = b7Var.f36084e;
                if (i12 < 0) {
                    b7Var.u0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && b7Var.t0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i15 = w6Var.f43047f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.a2) view).c(z10, true);
                if (w6Var.f43049i) {
                    while (true) {
                        if (i11 >= b7Var.f36079b.getChildCount()) {
                            break;
                        }
                        View childAt = b7Var.f36079b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.a2) {
                            b7Var.f36079b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((w6) arrayList.get(R)).f43047f < 0) {
                                ((org.telegram.ui.Cells.a2) childAt).c(b7Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                b7Var.v0();
            } else if (w6Var.f43045c >= 0) {
                r80 r80Var = new r80(view.getContext(), b7Var);
                org.telegram.ui.ActionBar.m1 P = org.telegram.ui.Components.g5.P(b7Var, r80Var, view, f7, f10);
                int i16 = ((w6) arrayList.get(i10)).f43045c;
                r80Var.f41529c0 = i16;
                FrameLayout frameLayout = r80Var.f41534h0;
                org.telegram.ui.ActionBar.e1 e1Var = r80Var.V;
                org.telegram.ui.ActionBar.e1 e1Var2 = r80Var.W;
                org.telegram.ui.Components.ia0 ia0Var = r80Var.T;
                org.telegram.ui.Components.e10 e10Var = r80Var.f41528b0;
                if (i16 == 3) {
                    e1Var2.setVisibility(0);
                    e1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    e10Var.setVisibility(8);
                    ia0Var.setVisibility(8);
                } else {
                    e1Var2.setVisibility(8);
                    e1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    e10Var.setVisibility(0);
                    ia0Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = r80Var.f41530d0.getKeepMediaExceptions(i16);
                r80Var.f41532f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.m2 m2Var = r80Var.f41533g0;
                if (isEmpty) {
                    org.telegram.ui.Components.m9 m9Var = (org.telegram.ui.Components.m9) e10Var.d;
                    ((org.telegram.ui.ActionBar.h5) e10Var.f25538c).l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.h5) e10Var.f25538c).setRightPadding(AndroidUtilities.dp(8.0f));
                    m9Var.b(0, null, m2Var.getCurrentAccount());
                    m9Var.b(1, null, m2Var.getCurrentAccount());
                    m9Var.b(2, null, m2Var.getCurrentAccount());
                    m9Var.a(false);
                } else {
                    int min = Math.min(3, r80Var.f41532f0.size());
                    org.telegram.ui.Components.m9 m9Var2 = (org.telegram.ui.Components.m9) e10Var.d;
                    ((org.telegram.ui.ActionBar.h5) e10Var.f25538c).setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.h5) e10Var.f25538c).l(LocaleController.formatPluralString("ExceptionShort", r80Var.f41532f0.size(), Integer.valueOf(r80Var.f41532f0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        m9Var2.b(i17, m2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) r80Var.f41532f0.get(i17)).dialogId), m2Var.getCurrentAccount());
                    }
                    m9Var2.a(false);
                }
                r80Var.U.setVisibility(8);
                ia0Var.setVisibility(8);
                r80Var.f();
                r80Var.setParentWindow(P);
                r80Var.setCallback(new e6(b7Var));
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        b7 b7Var = this.f36983a;
        zh.b bVar = b7Var.Y;
        LongSparseArray longSparseArray = bVar.f54926c;
        u6 u6Var = new u6(0L);
        Iterator it = bVar.f54931j.iterator();
        while (it.hasNext()) {
            zh.a aVar = (zh.a) it.next();
            u6Var.a(aVar, aVar.d);
            u6 u6Var2 = (u6) longSparseArray.get(aVar.f54919b);
            if (u6Var2 != null) {
                u6Var2.b(aVar);
                if (u6Var2.f42373c <= 0) {
                    longSparseArray.remove(aVar.f54919b);
                    bVar.f54925b.remove(u6Var2);
                }
                ArrayList e7 = bVar.e(aVar.d);
                if (e7 != null) {
                    e7.remove(aVar);
                }
            }
        }
        if (u6Var.f42373c > 0) {
            b7Var.l0(u6Var, null, null);
        }
        b7Var.Y.d();
        y6 y6Var = b7Var.N;
        if (y6Var != null) {
            y6Var.c();
            b7Var.N.e(false);
        }
        b7Var.w0(true);
        b7Var.v0();
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
