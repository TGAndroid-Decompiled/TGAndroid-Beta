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
public final class b6 implements v70, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.al0 {
    public final x6 f36697a;

    public b6(x6 x6Var) {
        this.f36697a = x6Var;
    }

    @Override
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.f36697a.f44485b);
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        x6 x6Var = this.f36697a;
        ArrayList arrayList = x6Var.W;
        if (x6Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            s6 s6Var = (s6) arrayList.get(i10);
            int i11 = 0;
            if (s6Var.f50845a == 11 && (view instanceof org.telegram.ui.Cells.y1)) {
                int i12 = s6Var.f42284f;
                if (i12 < 0) {
                    x6Var.I = !x6Var.I;
                    x6Var.w0(true);
                    x6Var.v0();
                    return;
                }
                boolean[] zArr = x6Var.f44490e;
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
                int i15 = s6Var.f42284f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.y1) view).c(z10, true);
                if (s6Var.f42286i) {
                    while (true) {
                        if (i11 >= x6Var.f44485b.getChildCount()) {
                            break;
                        }
                        View childAt = x6Var.f44485b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.y1) {
                            x6Var.f44485b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((s6) arrayList.get(R)).f42284f < 0) {
                                ((org.telegram.ui.Cells.y1) childAt).c(x6Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                x6Var.v0();
            } else if (s6Var.f42282c >= 0) {
                x70 x70Var = new x70(view.getContext(), x6Var);
                org.telegram.ui.ActionBar.o1 Q = org.telegram.ui.Components.c5.Q(x6Var, x70Var, view, f9, f10);
                int i16 = ((s6) arrayList.get(i10)).f42282c;
                x70Var.V = i16;
                FrameLayout frameLayout = x70Var.f44512d0;
                org.telegram.ui.ActionBar.g1 g1Var = x70Var.R;
                org.telegram.ui.ActionBar.g1 g1Var2 = x70Var.S;
                org.telegram.ui.Components.y80 y80Var = x70Var.P;
                org.telegram.ui.Components.g00 g00Var = x70Var.U;
                if (i16 == 3) {
                    g1Var2.setVisibility(0);
                    g1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    g00Var.setVisibility(8);
                    y80Var.setVisibility(8);
                } else {
                    g1Var2.setVisibility(8);
                    g1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    g00Var.setVisibility(0);
                    y80Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = x70Var.W.getKeepMediaExceptions(i16);
                x70Var.f44510b0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.o2 o2Var = x70Var.f44511c0;
                if (isEmpty) {
                    org.telegram.ui.Components.h9 h9Var = (org.telegram.ui.Components.h9) g00Var.d;
                    ((org.telegram.ui.ActionBar.h5) g00Var.f28693c).l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.h5) g00Var.f28693c).setRightPadding(AndroidUtilities.dp(8.0f));
                    h9Var.b(0, null, o2Var.getCurrentAccount());
                    h9Var.b(1, null, o2Var.getCurrentAccount());
                    h9Var.b(2, null, o2Var.getCurrentAccount());
                    h9Var.a(false);
                } else {
                    int min = Math.min(3, x70Var.f44510b0.size());
                    org.telegram.ui.Components.h9 h9Var2 = (org.telegram.ui.Components.h9) g00Var.d;
                    ((org.telegram.ui.ActionBar.h5) g00Var.f28693c).setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.h5) g00Var.f28693c).l(LocaleController.formatPluralString("ExceptionShort", x70Var.f44510b0.size(), Integer.valueOf(x70Var.f44510b0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        h9Var2.b(i17, o2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) x70Var.f44510b0.get(i17)).dialogId), o2Var.getCurrentAccount());
                    }
                    h9Var2.a(false);
                }
                x70Var.Q.setVisibility(8);
                y80Var.setVisibility(8);
                x70Var.f();
                x70Var.setParentWindow(Q);
                x70Var.setCallback(new b6(x6Var));
            }
        }
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        x6 x6Var = this.f36697a;
        kh.b bVar = x6Var.U;
        LongSparseArray longSparseArray = bVar.f13897c;
        q6 q6Var = new q6(0L);
        Iterator it = bVar.f13902j.iterator();
        while (it.hasNext()) {
            kh.a aVar = (kh.a) it.next();
            q6Var.a(aVar, aVar.d);
            q6 q6Var2 = (q6) longSparseArray.get(aVar.f13890b);
            if (q6Var2 != null) {
                q6Var2.b(aVar);
                if (q6Var2.f41545c <= 0) {
                    longSparseArray.remove(aVar.f13890b);
                    bVar.f13896b.remove(q6Var2);
                }
                ArrayList e10 = bVar.e(aVar.d);
                if (e10 != null) {
                    e10.remove(aVar);
                }
            }
        }
        if (q6Var.f41545c > 0) {
            x6Var.l0(q6Var, null, null);
        }
        x6Var.U.d();
        u6 u6Var = x6Var.J;
        if (u6Var != null) {
            u6Var.c();
            x6Var.J.e(false);
        }
        x6Var.w0(true);
        x6Var.v0();
    }

    @Override
    public void o0(View view, float f9, float f10) {
    }
}
