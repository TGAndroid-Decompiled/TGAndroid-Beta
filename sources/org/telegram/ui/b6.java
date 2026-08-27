package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class b6 implements w70, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.qk0 {

    public final z6 f36706a;

    public b6(z6 z6Var) {
        this.f36706a = z6Var;
    }

    @Override
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.f36706a.f45039b);
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        z6 z6Var = this.f36706a;
        ArrayList arrayList = z6Var.W;
        if (z6Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            u6 u6Var = (u6) arrayList.get(i10);
            if (u6Var.f49413a == 11 && (view instanceof org.telegram.ui.Cells.y1)) {
                int i11 = u6Var.f43129f;
                if (i11 < 0) {
                    z6Var.I = !z6Var.I;
                    z6Var.w0(true);
                    z6Var.v0();
                    return;
                }
                boolean[] zArr = z6Var.f45044e;
                if (i11 < 0) {
                    z6Var.u0(view);
                    return;
                }
                if (zArr[i11]) {
                    int i12 = 0;
                    for (int i13 = 0; i13 < 10; i13++) {
                        if (zArr[i13] && z6Var.t0(i13) > 0) {
                            i12++;
                        }
                    }
                    if (i12 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i14 = u6Var.f43129f;
                boolean z10 = !zArr[i14];
                zArr[i14] = z10;
                ((org.telegram.ui.Cells.y1) view).c(z10, true);
                if (u6Var.f43131i) {
                    for (int i15 = 0; i15 < z6Var.f45039b.getChildCount(); i15++) {
                        View childAt = z6Var.f45039b.getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.y1) {
                            z6Var.f45039b.getClass();
                            int iR = RecyclerView.R(childAt);
                            if (iR >= 0 && iR < arrayList.size() && ((u6) arrayList.get(iR)).f43129f < 0) {
                                ((org.telegram.ui.Cells.y1) childAt).c(z6Var.r0(), true);
                                break;
                            }
                        }
                    }
                }
                z6Var.v0();
                return;
            }
            if (u6Var.f43127c >= 0) {
                y70 y70Var = new y70(view.getContext(), z6Var);
                org.telegram.ui.ActionBar.n1 n1VarQ = org.telegram.ui.Components.y4.Q(z6Var, y70Var, view, f10, f11);
                int i16 = ((u6) arrayList.get(i10)).f43127c;
                y70Var.V = i16;
                FrameLayout frameLayout = y70Var.f44722d0;
                org.telegram.ui.ActionBar.f1 f1Var = y70Var.R;
                org.telegram.ui.ActionBar.f1 f1Var2 = y70Var.S;
                org.telegram.ui.Components.p80 p80Var = y70Var.P;
                org.telegram.ui.Components.zz zzVar = y70Var.U;
                if (i16 == 3) {
                    f1Var2.setVisibility(0);
                    f1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    zzVar.setVisibility(8);
                    p80Var.setVisibility(8);
                } else {
                    f1Var2.setVisibility(8);
                    f1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    zzVar.setVisibility(0);
                    p80Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = y70Var.W.getKeepMediaExceptions(i16);
                y70Var.f44720b0 = keepMediaExceptions;
                boolean zIsEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.n2 n2Var = y70Var.f44721c0;
                if (zIsEmpty) {
                    org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) zzVar.f35412c;
                    org.telegram.ui.Components.b9 b9Var = (org.telegram.ui.Components.b9) zzVar.d;
                    h5Var.l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.h5) zzVar.f35412c).setRightPadding(AndroidUtilities.dp(8.0f));
                    b9Var.b(0, null, n2Var.getCurrentAccount());
                    b9Var.b(1, null, n2Var.getCurrentAccount());
                    b9Var.b(2, null, n2Var.getCurrentAccount());
                    b9Var.a(false);
                } else {
                    int iMin = Math.min(3, y70Var.f44720b0.size());
                    org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) zzVar.f35412c;
                    org.telegram.ui.Components.b9 b9Var2 = (org.telegram.ui.Components.b9) zzVar.d;
                    h5Var2.setRightPadding(AndroidUtilities.dp((Math.max(0, iMin - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.h5) zzVar.f35412c).l(LocaleController.formatPluralString("ExceptionShort", y70Var.f44720b0.size(), Integer.valueOf(y70Var.f44720b0.size())), false);
                    for (int i17 = 0; i17 < iMin; i17++) {
                        b9Var2.b(i17, n2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) y70Var.f44720b0.get(i17)).dialogId), n2Var.getCurrentAccount());
                    }
                    b9Var2.a(false);
                }
                y70Var.Q.setVisibility(8);
                p80Var.setVisibility(8);
                y70Var.f();
                y70Var.setParentWindow(n1VarQ);
                y70Var.setCallback(new b6(z6Var));
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        z6 z6Var = this.f36706a;
        ih.b bVar = z6Var.U;
        LongSparseArray longSparseArray = bVar.f11484c;
        s6 s6Var = new s6(0L);
        for (ih.a aVar : bVar.f11489j) {
            s6Var.a(aVar, aVar.d);
            s6 s6Var2 = (s6) longSparseArray.get(aVar.f11477b);
            if (s6Var2 != null) {
                s6Var2.b(aVar);
                if (s6Var2.f42524c <= 0) {
                    longSparseArray.remove(aVar.f11477b);
                    bVar.f11483b.remove(s6Var2);
                }
                ArrayList arrayListE = bVar.e(aVar.d);
                if (arrayListE != null) {
                    arrayListE.remove(aVar);
                }
            }
        }
        if (s6Var.f42524c > 0) {
            z6Var.l0(s6Var, null, null);
        }
        z6Var.U.d();
        w6 w6Var = z6Var.J;
        if (w6Var != null) {
            w6Var.c();
            z6Var.J.e(false);
        }
        z6Var.w0(true);
        z6Var.v0();
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void c0(View view, float f10, float f11) {
    }
}
