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
public final class e6 implements f80, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.kl0 {
    public final b7 f36408a;

    public e6(b7 b7Var) {
        this.f36408a = b7Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.f36408a.f35354b);
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        b7 b7Var = this.f36408a;
        ArrayList arrayList = b7Var.X;
        if (b7Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            w6 w6Var = (w6) arrayList.get(i10);
            int i11 = 0;
            if (w6Var.f2505a == 11 && (view instanceof org.telegram.ui.Cells.z1)) {
                int i12 = w6Var.f42388f;
                if (i12 < 0) {
                    b7Var.J = !b7Var.J;
                    b7Var.w0(true);
                    b7Var.v0();
                    return;
                }
                boolean[] zArr = b7Var.f35359e;
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
                int i15 = w6Var.f42388f;
                boolean z4 = !zArr[i15];
                zArr[i15] = z4;
                ((org.telegram.ui.Cells.z1) view).c(z4, true);
                if (w6Var.f42390i) {
                    while (true) {
                        if (i11 >= b7Var.f35354b.getChildCount()) {
                            break;
                        }
                        View childAt = b7Var.f35354b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.z1) {
                            b7Var.f35354b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((w6) arrayList.get(R)).f42388f < 0) {
                                ((org.telegram.ui.Cells.z1) childAt).c(b7Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                b7Var.v0();
            } else if (w6Var.f42386c >= 0) {
                h80 h80Var = new h80(view.getContext(), b7Var);
                org.telegram.ui.ActionBar.p1 Q = org.telegram.ui.Components.z4.Q(b7Var, h80Var, view, f10, f11);
                int i16 = ((w6) arrayList.get(i10)).f42386c;
                h80Var.W = i16;
                FrameLayout frameLayout = h80Var.f37367e0;
                org.telegram.ui.ActionBar.g1 g1Var = h80Var.S;
                org.telegram.ui.ActionBar.g1 g1Var2 = h80Var.T;
                org.telegram.ui.Components.g90 g90Var = h80Var.Q;
                org.telegram.ui.Components.m00 m00Var = h80Var.V;
                if (i16 == 3) {
                    g1Var2.setVisibility(0);
                    g1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    m00Var.setVisibility(8);
                    g90Var.setVisibility(8);
                } else {
                    g1Var2.setVisibility(8);
                    g1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    m00Var.setVisibility(0);
                    g90Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = h80Var.f37363a0.getKeepMediaExceptions(i16);
                h80Var.f37365c0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.p2 p2Var = h80Var.f37366d0;
                if (isEmpty) {
                    org.telegram.ui.Components.d9 d9Var = (org.telegram.ui.Components.d9) m00Var.d;
                    ((org.telegram.ui.ActionBar.l5) m00Var.f28874c).l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.l5) m00Var.f28874c).setRightPadding(AndroidUtilities.dp(8.0f));
                    d9Var.b(0, null, p2Var.getCurrentAccount());
                    d9Var.b(1, null, p2Var.getCurrentAccount());
                    d9Var.b(2, null, p2Var.getCurrentAccount());
                    d9Var.a(false);
                } else {
                    int min = Math.min(3, h80Var.f37365c0.size());
                    org.telegram.ui.Components.d9 d9Var2 = (org.telegram.ui.Components.d9) m00Var.d;
                    ((org.telegram.ui.ActionBar.l5) m00Var.f28874c).setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.l5) m00Var.f28874c).l(LocaleController.formatPluralString("ExceptionShort", h80Var.f37365c0.size(), Integer.valueOf(h80Var.f37365c0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        d9Var2.b(i17, p2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) h80Var.f37365c0.get(i17)).dialogId), p2Var.getCurrentAccount());
                    }
                    d9Var2.a(false);
                }
                h80Var.R.setVisibility(8);
                g90Var.setVisibility(8);
                h80Var.f();
                h80Var.setParentWindow(Q);
                h80Var.setCallback(new e6(b7Var));
            }
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        b7 b7Var = this.f36408a;
        nh.b bVar = b7Var.V;
        LongSparseArray longSparseArray = bVar.f16251c;
        u6 u6Var = new u6(0L);
        Iterator it = bVar.f16256j.iterator();
        while (it.hasNext()) {
            nh.a aVar = (nh.a) it.next();
            u6Var.a(aVar, aVar.d);
            u6 u6Var2 = (u6) longSparseArray.get(aVar.f16244b);
            if (u6Var2 != null) {
                u6Var2.b(aVar);
                if (u6Var2.f41799c <= 0) {
                    longSparseArray.remove(aVar.f16244b);
                    bVar.f16250b.remove(u6Var2);
                }
                ArrayList e6 = bVar.e(aVar.d);
                if (e6 != null) {
                    e6.remove(aVar);
                }
            }
        }
        if (u6Var.f41799c > 0) {
            b7Var.l0(u6Var, null, null);
        }
        b7Var.V.d();
        y6 y6Var = b7Var.K;
        if (y6Var != null) {
            y6Var.c();
            b7Var.K.e(false);
        }
        b7Var.w0(true);
        b7Var.v0();
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
