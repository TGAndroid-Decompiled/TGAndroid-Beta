package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;
public final class fu implements org.telegram.ui.Components.oo0, org.telegram.ui.Components.cj0, org.telegram.ui.Components.dj0, pz, org.telegram.ui.ActionBar.r1, oi.m, r0.m, oi.n, org.telegram.ui.Components.qi0 {
    public final int f45705a;
    public final ww f45706b;

    public fu(ww wwVar, int i7) {
        this.f45705a = i7;
        this.f45706b = wwVar;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        UndoView[] undoViewArr;
        ww wwVar = this.f45706b;
        wwVar.f51645w.j(k1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        wwVar.f51560e4 = I0.f15121b;
        wwVar.f51566f4 = I0.d;
        int i7 = k1Var.f54202a.f(8).d;
        if (wwVar.f51571g4 != i7) {
            wwVar.f51571g4 = i7;
            wwVar.fragmentView.requestLayout();
        }
        wwVar.F0.setPadding(0, wwVar.f51560e4, 0, 0);
        wwVar.k5();
        for (UndoView undoView : wwVar.f51657y0) {
            if (undoView != null) {
                int i10 = wwVar.f51566f4 + wwVar.f51576h4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                    marginLayoutParams.bottomMargin = i10;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        sv svVar = wwVar.F3;
        if (svVar != null) {
            r0.i0.b(svVar, k1Var);
        }
        return r0.k1.f54201b;
    }

    @Override
    public boolean c(int i7, View view) {
        ww.q0(this.f45706b, i7);
        return false;
    }

    @Override
    public void e() {
        ww wwVar = this.f45706b;
        wwVar.Q = true;
        wwVar.fragmentView.invalidate();
    }

    @Override
    public void f(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fu.f(float, float, int, android.view.View):void");
    }

    @Override
    public boolean f1(View view) {
        switch (this.f45705a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f45705a) {
            case 6:
                ww.h0(this.f45706b);
                return;
            case 7:
                ww wwVar = this.f45706b;
                wwVar.getMessagesController().j2();
                wwVar.n4(false);
                return;
            case 8:
            case 9:
            default:
                ww wwVar2 = this.f45706b;
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
                try {
                    wwVar2.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 10:
                ww wwVar3 = this.f45706b;
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", org.telegram.messenger.t0.f25566b.getPackageName());
                try {
                    try {
                        wwVar3.getParentActivity().startActivity(intent2);
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                } catch (Exception unused) {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
                    wwVar3.getParentActivity().startActivity(intent3);
                    return;
                }
        }
    }

    @Override
    public int h() {
        ww wwVar = this.f45706b;
        wwVar.getClass();
        return wwVar.getThemedColor(org.telegram.ui.ActionBar.k6.f27852d6);
    }

    public void i(int i7) {
        jv jvVar = this.f45706b.B1;
        if (jvVar == null) {
            return;
        }
        if (i7 == 0) {
            jvVar.o0(true);
        } else {
            jvVar.y1(true, false);
        }
    }

    public void j(boolean z9, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        this.f45706b.j5(z9, arrayList, arrayList2, z10, true);
    }

    @Override
    public void l(int i7) {
        ww.C0(this.f45706b, i7);
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i7 = this.f45705a;
    }

    private final void a(View view, float f10, float f11) {
    }

    private final void b(View view, float f10, float f11) {
    }

    private final void d(View view, float f10, float f11) {
    }
}
