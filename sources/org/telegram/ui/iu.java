package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;
public final class iu implements org.telegram.ui.Components.cp0, org.telegram.ui.Components.rj0, org.telegram.ui.Components.sj0, sz, org.telegram.ui.ActionBar.q1, ri.m, r0.m, ri.n, org.telegram.ui.Components.gj0 {
    public final int f48920a;
    public final bx f48921b;

    public iu(bx bxVar, int i7) {
        this.f48920a = i7;
        this.f48921b = bxVar;
    }

    @Override
    public boolean U0(View view) {
        switch (this.f48920a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean b(int i7, View view) {
        bx.n0(this.f48921b, i7);
        return false;
    }

    public void e(int i7) {
        mv mvVar = this.f48921b.D1;
        if (mvVar == null) {
            return;
        }
        if (i7 == 0) {
            mvVar.P0(true);
        } else {
            mvVar.e2(true, false);
        }
    }

    @Override
    public void f() {
        bx bxVar = this.f48921b;
        bxVar.R = true;
        bxVar.fragmentView.invalidate();
    }

    @Override
    public void f0(View view, float f10, float f11) {
        int i7 = this.f48920a;
    }

    @Override
    public void g(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iu.g(float, float, int, android.view.View):void");
    }

    public void h(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f48921b.r5(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f48920a) {
            case 6:
                bx.E0(this.f48921b);
                return;
            case 7:
                bx bxVar = this.f48921b;
                bxVar.getMessagesController().l2();
                bxVar.p4(false);
                return;
            case 8:
            case 9:
            default:
                bx bxVar2 = this.f48921b;
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f27013b.getPackageName()));
                try {
                    bxVar2.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 10:
                bx bxVar3 = this.f48921b;
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", org.telegram.messenger.t0.f27013b.getPackageName());
                try {
                    try {
                        bxVar3.getParentActivity().startActivity(intent2);
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                } catch (Exception unused) {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.f27013b.getPackageName()));
                    bxVar3.getParentActivity().startActivity(intent3);
                    return;
                }
        }
    }

    @Override
    public int j() {
        bx bxVar = this.f48921b;
        bxVar.getClass();
        return bxVar.getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6);
    }

    @Override
    public void k(int i7) {
        bx.D0(this.f48921b, i7);
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        UndoView[] undoViewArr;
        bx bxVar = this.f48921b;
        bxVar.f46632w.j(l1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        bxVar.f46572j4 = I0.f15979b;
        bxVar.f46577k4 = I0.d;
        int i7 = l1Var.f56381a.f(8).d;
        if (bxVar.f46581l4 != i7) {
            bxVar.f46581l4 = i7;
            bxVar.fragmentView.requestLayout();
        }
        bxVar.G0.setPadding(0, bxVar.f46572j4, 0, 0);
        bxVar.s5();
        for (UndoView undoView : bxVar.f46650z0) {
            if (undoView != null) {
                int i10 = bxVar.f46577k4 + bxVar.f46585m4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                    marginLayoutParams.bottomMargin = i10;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        wv wvVar = bxVar.H3;
        if (wvVar != null) {
            r0.i0.b(wvVar, l1Var);
        }
        return r0.l1.f56380b;
    }

    private final void a(View view, float f10, float f11) {
    }

    private final void c(View view, float f10, float f11) {
    }

    private final void d(View view, float f10, float f11) {
    }
}
