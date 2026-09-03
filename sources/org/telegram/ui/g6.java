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
public final class g6 implements g80, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.il0 {
    public final d7 f34329a;

    public g6(d7 d7Var) {
        this.f34329a = d7Var;
    }

    @Override
    public boolean Z0(View view) {
        return false;
    }

    @Override
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.f34329a.f33349b);
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        d7 d7Var = this.f34329a;
        ArrayList arrayList = d7Var.X;
        if (d7Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            y6 y6Var = (y6) arrayList.get(i10);
            int i11 = 0;
            if (y6Var.f1830a == 11 && (view instanceof org.telegram.ui.Cells.y1)) {
                int i12 = y6Var.f40153f;
                if (i12 < 0) {
                    d7Var.J = !d7Var.J;
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
                int i15 = y6Var.f40153f;
                boolean z4 = !zArr[i15];
                zArr[i15] = z4;
                ((org.telegram.ui.Cells.y1) view).c(z4, true);
                if (y6Var.f40155i) {
                    while (true) {
                        if (i11 >= d7Var.f33349b.getChildCount()) {
                            break;
                        }
                        View childAt = d7Var.f33349b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.y1) {
                            d7Var.f33349b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((y6) arrayList.get(R)).f40153f < 0) {
                                ((org.telegram.ui.Cells.y1) childAt).c(d7Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                d7Var.v0();
            } else if (y6Var.f40152c >= 0) {
                i80 i80Var = new i80(view.getContext(), d7Var);
                org.telegram.ui.ActionBar.p1 Q = org.telegram.ui.Components.z4.Q(d7Var, i80Var, view, f10, f11);
                int i16 = ((y6) arrayList.get(i10)).f40152c;
                i80Var.W = i16;
                FrameLayout frameLayout = i80Var.f34841e0;
                org.telegram.ui.ActionBar.g1 g1Var = i80Var.S;
                org.telegram.ui.ActionBar.g1 g1Var2 = i80Var.T;
                org.telegram.ui.Components.f90 f90Var = i80Var.Q;
                org.telegram.ui.Components.l00 l00Var = i80Var.V;
                if (i16 == 3) {
                    g1Var2.setVisibility(0);
                    g1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    l00Var.setVisibility(8);
                    f90Var.setVisibility(8);
                } else {
                    g1Var2.setVisibility(8);
                    g1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    l00Var.setVisibility(0);
                    f90Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = i80Var.f34837a0.getKeepMediaExceptions(i16);
                i80Var.f34839c0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.p2 p2Var = i80Var.f34840d0;
                if (isEmpty) {
                    org.telegram.ui.Components.d9 d9Var = (org.telegram.ui.Components.d9) l00Var.d;
                    ((org.telegram.ui.ActionBar.k5) l00Var.f26515c).l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.k5) l00Var.f26515c).setRightPadding(AndroidUtilities.dp(8.0f));
                    d9Var.b(0, null, p2Var.getCurrentAccount());
                    d9Var.b(1, null, p2Var.getCurrentAccount());
                    d9Var.b(2, null, p2Var.getCurrentAccount());
                    d9Var.a(false);
                } else {
                    int min = Math.min(3, i80Var.f34839c0.size());
                    org.telegram.ui.Components.d9 d9Var2 = (org.telegram.ui.Components.d9) l00Var.d;
                    ((org.telegram.ui.ActionBar.k5) l00Var.f26515c).setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.k5) l00Var.f26515c).l(LocaleController.formatPluralString("ExceptionShort", i80Var.f34839c0.size(), Integer.valueOf(i80Var.f34839c0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        d9Var2.b(i17, p2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) i80Var.f34839c0.get(i17)).dialogId), p2Var.getCurrentAccount());
                    }
                    d9Var2.a(false);
                }
                i80Var.R.setVisibility(8);
                f90Var.setVisibility(8);
                i80Var.f();
                i80Var.setParentWindow(Q);
                i80Var.setCallback(new g6(d7Var));
            }
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        d7 d7Var = this.f34329a;
        mh.b bVar = d7Var.V;
        LongSparseArray longSparseArray = bVar.f14164c;
        w6 w6Var = new w6(0L);
        Iterator it = bVar.f14168j.iterator();
        while (it.hasNext()) {
            mh.a aVar = (mh.a) it.next();
            w6Var.a(aVar, aVar.d);
            w6 w6Var2 = (w6) longSparseArray.get(aVar.f14158b);
            if (w6Var2 != null) {
                w6Var2.b(aVar);
                if (w6Var2.f39279c <= 0) {
                    longSparseArray.remove(aVar.f14158b);
                    bVar.f14163b.remove(w6Var2);
                }
                ArrayList e = bVar.e(aVar.d);
                if (e != null) {
                    e.remove(aVar);
                }
            }
        }
        if (w6Var.f39279c > 0) {
            d7Var.l0(w6Var, null, null);
        }
        d7Var.V.d();
        a7 a7Var = d7Var.K;
        if (a7Var != null) {
            a7Var.c();
            d7Var.K.e(false);
        }
        d7Var.w0(true);
        d7Var.v0();
    }

    @Override
    public void n0(View view, float f10, float f11) {
    }
}
