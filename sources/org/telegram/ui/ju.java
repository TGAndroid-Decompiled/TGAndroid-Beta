package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;
public final class ju implements org.telegram.ui.Components.dp0, org.telegram.ui.Components.rj0, org.telegram.ui.Components.sj0, tz, org.telegram.ui.ActionBar.q1, ri.m, r0.m, ri.n, org.telegram.ui.Components.gj0 {
    public final int f49093a;
    public final cx f49094b;

    public ju(cx cxVar, int i7) {
        this.f49093a = i7;
        this.f49094b = cxVar;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        UndoView[] undoViewArr;
        cx cxVar = this.f49094b;
        cxVar.f46802w.j(l1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        cxVar.f46742j4 = I0.f15915b;
        cxVar.f46747k4 = I0.d;
        int i7 = l1Var.f56299a.f(8).d;
        if (cxVar.f46751l4 != i7) {
            cxVar.f46751l4 = i7;
            cxVar.fragmentView.requestLayout();
        }
        cxVar.G0.setPadding(0, cxVar.f46742j4, 0, 0);
        cxVar.s5();
        for (UndoView undoView : cxVar.f46820z0) {
            if (undoView != null) {
                int i10 = cxVar.f46747k4 + cxVar.f46755m4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                    marginLayoutParams.bottomMargin = i10;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        xv xvVar = cxVar.H3;
        if (xvVar != null) {
            r0.i0.b(xvVar, l1Var);
        }
        return r0.l1.f56298b;
    }

    @Override
    public boolean b1(View view) {
        switch (this.f49093a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        cx.n0(this.f49094b, i7);
        return false;
    }

    @Override
    public int e() {
        cx cxVar = this.f49094b;
        cxVar.getClass();
        return cxVar.getThemedColor(org.telegram.ui.ActionBar.m6.f29378d6);
    }

    @Override
    public void f(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ju.f(float, float, int, android.view.View):void");
    }

    public void g(int i7) {
        nv nvVar = this.f49094b.D1;
        if (nvVar == null) {
            return;
        }
        if (i7 == 0) {
            nvVar.O0(true);
        } else {
            nvVar.c2(true, false);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f49093a) {
            case 6:
                cx.E0(this.f49094b);
                return;
            case 7:
                cx cxVar = this.f49094b;
                cxVar.getMessagesController().l2();
                cxVar.p4(false);
                return;
            case 8:
            case 9:
            default:
                cx cxVar2 = this.f49094b;
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26941b.getPackageName()));
                try {
                    cxVar2.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 10:
                cx cxVar3 = this.f49094b;
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", org.telegram.messenger.t0.f26941b.getPackageName());
                try {
                    try {
                        cxVar3.getParentActivity().startActivity(intent2);
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                } catch (Exception unused) {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26941b.getPackageName()));
                    cxVar3.getParentActivity().startActivity(intent3);
                    return;
                }
        }
    }

    @Override
    public void i() {
        cx cxVar = this.f49094b;
        cxVar.R = true;
        cxVar.fragmentView.invalidate();
    }

    public void j(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f49094b.r5(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void l(int i7) {
        cx.D0(this.f49094b, i7);
    }

    @Override
    public void s0(View view, float f10, float f11) {
        int i7 = this.f49093a;
    }

    private final void a(View view, float f10, float f11) {
    }

    private final void b(View view, float f10, float f11) {
    }

    private final void d(View view, float f10, float f11) {
    }
}
