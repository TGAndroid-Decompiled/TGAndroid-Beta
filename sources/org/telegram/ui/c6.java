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
public final class c6 implements k80, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.bl0 {
    public final z6 f32262a;

    public c6(z6 z6Var) {
        this.f32262a = z6Var;
    }

    @Override
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.f32262a.f39975b);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        z6 z6Var = this.f32262a;
        ArrayList arrayList = z6Var.f39974a0;
        if (z6Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            u6 u6Var = (u6) arrayList.get(i10);
            int i11 = 0;
            if (u6Var.f15508a == 11 && (view instanceof org.telegram.ui.Cells.z1)) {
                int i12 = u6Var.f37917f;
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
                int i15 = u6Var.f37917f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.z1) view).c(z10, true);
                if (u6Var.f37919i) {
                    while (true) {
                        if (i11 >= z6Var.f39975b.getChildCount()) {
                            break;
                        }
                        View childAt = z6Var.f39975b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.z1) {
                            z6Var.f39975b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((u6) arrayList.get(R)).f37917f < 0) {
                                ((org.telegram.ui.Cells.z1) childAt).c(z6Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                z6Var.v0();
            } else if (u6Var.f37916c >= 0) {
                m80 m80Var = new m80(view.getContext(), z6Var);
                org.telegram.ui.ActionBar.n1 Q = org.telegram.ui.Components.e5.Q(z6Var, m80Var, view, f7, f10);
                int i16 = ((u6) arrayList.get(i10)).f37916c;
                m80Var.f35175c0 = i16;
                FrameLayout frameLayout = m80Var.f35180h0;
                org.telegram.ui.ActionBar.f1 f1Var = m80Var.V;
                org.telegram.ui.ActionBar.f1 f1Var2 = m80Var.W;
                org.telegram.ui.Components.d90 d90Var = m80Var.T;
                org.telegram.ui.Components.m00 m00Var = m80Var.f35174b0;
                if (i16 == 3) {
                    f1Var2.setVisibility(0);
                    f1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    m00Var.setVisibility(8);
                    d90Var.setVisibility(8);
                } else {
                    f1Var2.setVisibility(8);
                    f1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    m00Var.setVisibility(0);
                    d90Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = m80Var.f35176d0.getKeepMediaExceptions(i16);
                m80Var.f35178f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.n2 n2Var = m80Var.f35179g0;
                if (isEmpty) {
                    org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) m00Var.d;
                    ((org.telegram.ui.ActionBar.i5) m00Var.f26053c).l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.i5) m00Var.f26053c).setRightPadding(AndroidUtilities.dp(8.0f));
                    k9Var.b(0, null, n2Var.getCurrentAccount());
                    k9Var.b(1, null, n2Var.getCurrentAccount());
                    k9Var.b(2, null, n2Var.getCurrentAccount());
                    k9Var.a(false);
                } else {
                    int min = Math.min(3, m80Var.f35178f0.size());
                    org.telegram.ui.Components.k9 k9Var2 = (org.telegram.ui.Components.k9) m00Var.d;
                    ((org.telegram.ui.ActionBar.i5) m00Var.f26053c).setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.i5) m00Var.f26053c).l(LocaleController.formatPluralString("ExceptionShort", m80Var.f35178f0.size(), Integer.valueOf(m80Var.f35178f0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        k9Var2.b(i17, n2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) m80Var.f35178f0.get(i17)).dialogId), n2Var.getCurrentAccount());
                    }
                    k9Var2.a(false);
                }
                m80Var.U.setVisibility(8);
                d90Var.setVisibility(8);
                m80Var.f();
                m80Var.setParentWindow(Q);
                m80Var.setCallback(new c6(z6Var));
            }
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        z6 z6Var = this.f32262a;
        zh.b bVar = z6Var.Y;
        LongSparseArray longSparseArray = bVar.f49145c;
        s6 s6Var = new s6(0L);
        Iterator it = bVar.f49149j.iterator();
        while (it.hasNext()) {
            zh.a aVar = (zh.a) it.next();
            s6Var.a(aVar, aVar.d);
            s6 s6Var2 = (s6) longSparseArray.get(aVar.f49139b);
            if (s6Var2 != null) {
                s6Var2.b(aVar);
                if (s6Var2.f37132c <= 0) {
                    longSparseArray.remove(aVar.f49139b);
                    bVar.f49144b.remove(s6Var2);
                }
                ArrayList e = bVar.e(aVar.d);
                if (e != null) {
                    e.remove(aVar);
                }
            }
        }
        if (s6Var.f37132c > 0) {
            z6Var.l0(s6Var, null, null);
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
