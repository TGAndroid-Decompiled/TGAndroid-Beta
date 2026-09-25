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
public final class b6 implements i80, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.ll0 {
    public final z6 f32337a;

    public b6(z6 z6Var) {
        this.f32337a = z6Var;
    }

    @Override
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.f32337a.f40349b);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        z6 z6Var = this.f32337a;
        ArrayList arrayList = z6Var.f40348a0;
        if (z6Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            t6 t6Var = (t6) arrayList.get(i10);
            int i11 = 0;
            if (t6Var.f15715a == 11 && (view instanceof org.telegram.ui.Cells.a2)) {
                int i12 = t6Var.f37975f;
                if (i12 < 0) {
                    z6Var.M = !z6Var.M;
                    z6Var.w0(true);
                    z6Var.v0();
                    return;
                }
                boolean[] zArr = z6Var.e;
                if (i12 < 0) {
                    z6Var.u0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && z6Var.t0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i15 = t6Var.f37975f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.a2) view).c(z10, true);
                if (t6Var.f37977i) {
                    while (true) {
                        if (i11 >= z6Var.f40349b.getChildCount()) {
                            break;
                        }
                        View childAt = z6Var.f40349b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.a2) {
                            z6Var.f40349b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((t6) arrayList.get(R)).f37975f < 0) {
                                ((org.telegram.ui.Cells.a2) childAt).c(z6Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                z6Var.v0();
            } else if (t6Var.f37974c >= 0) {
                k80 k80Var = new k80(view.getContext(), z6Var);
                org.telegram.ui.ActionBar.m1 Q = org.telegram.ui.Components.e5.Q(z6Var, k80Var, view, f7, f10);
                int i16 = ((t6) arrayList.get(i10)).f37974c;
                k80Var.f34974c0 = i16;
                FrameLayout frameLayout = k80Var.f34979h0;
                org.telegram.ui.ActionBar.e1 e1Var = k80Var.V;
                org.telegram.ui.ActionBar.e1 e1Var2 = k80Var.W;
                org.telegram.ui.Components.n90 n90Var = k80Var.T;
                org.telegram.ui.Components.m00 m00Var = k80Var.f34973b0;
                if (i16 == 3) {
                    e1Var2.setVisibility(0);
                    e1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    m00Var.setVisibility(8);
                    n90Var.setVisibility(8);
                } else {
                    e1Var2.setVisibility(8);
                    e1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    m00Var.setVisibility(0);
                    n90Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = k80Var.f34975d0.getKeepMediaExceptions(i16);
                k80Var.f34977f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.m2 m2Var = k80Var.f34978g0;
                if (isEmpty) {
                    org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) m00Var.d;
                    ((org.telegram.ui.ActionBar.h5) m00Var.f26322c).l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.h5) m00Var.f26322c).setRightPadding(AndroidUtilities.dp(8.0f));
                    k9Var.b(0, null, m2Var.getCurrentAccount());
                    k9Var.b(1, null, m2Var.getCurrentAccount());
                    k9Var.b(2, null, m2Var.getCurrentAccount());
                    k9Var.a(false);
                } else {
                    int min = Math.min(3, k80Var.f34977f0.size());
                    org.telegram.ui.Components.k9 k9Var2 = (org.telegram.ui.Components.k9) m00Var.d;
                    ((org.telegram.ui.ActionBar.h5) m00Var.f26322c).setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.h5) m00Var.f26322c).l(LocaleController.formatPluralString("ExceptionShort", k80Var.f34977f0.size(), Integer.valueOf(k80Var.f34977f0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        k9Var2.b(i17, m2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) k80Var.f34977f0.get(i17)).dialogId), m2Var.getCurrentAccount());
                    }
                    k9Var2.a(false);
                }
                k80Var.U.setVisibility(8);
                n90Var.setVisibility(8);
                k80Var.f();
                k80Var.setParentWindow(Q);
                k80Var.setCallback(new b6(z6Var));
            }
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        z6 z6Var = this.f32337a;
        zh.b bVar = z6Var.Y;
        LongSparseArray longSparseArray = bVar.f49472c;
        r6 r6Var = new r6(0L);
        Iterator it = bVar.f49476j.iterator();
        while (it.hasNext()) {
            zh.a aVar = (zh.a) it.next();
            r6Var.a(aVar, aVar.d);
            r6 r6Var2 = (r6) longSparseArray.get(aVar.f49466b);
            if (r6Var2 != null) {
                r6Var2.b(aVar);
                if (r6Var2.f37189c <= 0) {
                    longSparseArray.remove(aVar.f49466b);
                    bVar.f49471b.remove(r6Var2);
                }
                ArrayList e = bVar.e(aVar.d);
                if (e != null) {
                    e.remove(aVar);
                }
            }
        }
        if (r6Var.f37189c > 0) {
            z6Var.l0(r6Var, null, null);
        }
        z6Var.Y.d();
        w6 w6Var = z6Var.N;
        if (w6Var != null) {
            w6Var.c();
            z6Var.N.e(false);
        }
        z6Var.w0(true);
        z6Var.v0();
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
