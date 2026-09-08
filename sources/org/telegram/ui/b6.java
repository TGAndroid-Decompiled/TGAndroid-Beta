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
public final class b6 implements n80, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.al0 {
    public final z6 f34664a;

    public b6(z6 z6Var) {
        this.f34664a = z6Var;
    }

    @Override
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.f34664a.f43332b);
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        z6 z6Var = this.f34664a;
        ArrayList arrayList = z6Var.f43331a0;
        if (z6Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            u6 u6Var = (u6) arrayList.get(i10);
            int i11 = 0;
            if (u6Var.f44098a == 11 && (view instanceof org.telegram.ui.Cells.z1)) {
                int i12 = u6Var.f40970f;
                if (i12 < 0) {
                    z6Var.M = !z6Var.M;
                    z6Var.w0(true);
                    z6Var.v0();
                    return;
                }
                boolean[] zArr = z6Var.f43337e;
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
                int i15 = u6Var.f40970f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.z1) view).c(z10, true);
                if (u6Var.f40972i) {
                    while (true) {
                        if (i11 >= z6Var.f43332b.getChildCount()) {
                            break;
                        }
                        View childAt = z6Var.f43332b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.z1) {
                            z6Var.f43332b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((u6) arrayList.get(R)).f40970f < 0) {
                                ((org.telegram.ui.Cells.z1) childAt).c(z6Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                z6Var.v0();
            } else if (u6Var.f40968c >= 0) {
                p80 p80Var = new p80(view.getContext(), z6Var);
                org.telegram.ui.ActionBar.n1 Q = org.telegram.ui.Components.e5.Q(z6Var, p80Var, view, f7, f10);
                int i16 = ((u6) arrayList.get(i10)).f40968c;
                p80Var.f39454c0 = i16;
                FrameLayout frameLayout = p80Var.f39459h0;
                org.telegram.ui.ActionBar.f1 f1Var = p80Var.V;
                org.telegram.ui.ActionBar.f1 f1Var2 = p80Var.W;
                org.telegram.ui.Components.d90 d90Var = p80Var.T;
                org.telegram.ui.Components.l00 l00Var = p80Var.f39453b0;
                if (i16 == 3) {
                    f1Var2.setVisibility(0);
                    f1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    l00Var.setVisibility(8);
                    d90Var.setVisibility(8);
                } else {
                    f1Var2.setVisibility(8);
                    f1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    l00Var.setVisibility(0);
                    d90Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = p80Var.f39455d0.getKeepMediaExceptions(i16);
                p80Var.f39457f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.n2 n2Var = p80Var.f39458g0;
                if (isEmpty) {
                    org.telegram.ui.Components.l9 l9Var = (org.telegram.ui.Components.l9) l00Var.d;
                    ((org.telegram.ui.ActionBar.j5) l00Var.f28047c).l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.j5) l00Var.f28047c).setRightPadding(AndroidUtilities.dp(8.0f));
                    l9Var.b(0, null, n2Var.getCurrentAccount());
                    l9Var.b(1, null, n2Var.getCurrentAccount());
                    l9Var.b(2, null, n2Var.getCurrentAccount());
                    l9Var.a(false);
                } else {
                    int min = Math.min(3, p80Var.f39457f0.size());
                    org.telegram.ui.Components.l9 l9Var2 = (org.telegram.ui.Components.l9) l00Var.d;
                    ((org.telegram.ui.ActionBar.j5) l00Var.f28047c).setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.j5) l00Var.f28047c).l(LocaleController.formatPluralString("ExceptionShort", p80Var.f39457f0.size(), Integer.valueOf(p80Var.f39457f0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        l9Var2.b(i17, n2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) p80Var.f39457f0.get(i17)).dialogId), n2Var.getCurrentAccount());
                    }
                    l9Var2.a(false);
                }
                p80Var.U.setVisibility(8);
                d90Var.setVisibility(8);
                p80Var.f();
                p80Var.setParentWindow(Q);
                p80Var.setCallback(new b6(z6Var));
            }
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        z6 z6Var = this.f34664a;
        ai.c cVar = z6Var.Y;
        LongSparseArray longSparseArray = cVar.f758c;
        s6 s6Var = new s6(0L);
        Iterator it = cVar.f763j.iterator();
        while (it.hasNext()) {
            ai.b bVar = (ai.b) it.next();
            s6Var.a(bVar, bVar.d);
            s6 s6Var2 = (s6) longSparseArray.get(bVar.f751b);
            if (s6Var2 != null) {
                s6Var2.b(bVar);
                if (s6Var2.f40341c <= 0) {
                    longSparseArray.remove(bVar.f751b);
                    cVar.f757b.remove(s6Var2);
                }
                ArrayList e7 = cVar.e(bVar.d);
                if (e7 != null) {
                    e7.remove(bVar);
                }
            }
        }
        if (s6Var.f40341c > 0) {
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
    public void q0(View view, float f7, float f10) {
    }
}
