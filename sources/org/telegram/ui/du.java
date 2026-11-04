package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;
public final class du implements org.telegram.ui.Components.qo0, org.telegram.ui.Components.gj0, org.telegram.ui.Components.hj0, nz, org.telegram.ui.ActionBar.p1, pi.m, r0.m, pi.n, org.telegram.ui.Components.ui0 {
    public final int f44812a;
    public final uw f44813b;

    public du(uw uwVar, int i3) {
        this.f44812a = i3;
        this.f44813b = uwVar;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        UndoView[] undoViewArr;
        uw uwVar = this.f44813b;
        uwVar.f50313w.j(k1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        uwVar.f50234f4 = I0.f14496b;
        uwVar.f50239g4 = I0.d;
        int i3 = k1Var.f54026a.f(8).d;
        if (uwVar.f50244h4 != i3) {
            uwVar.f50244h4 = i3;
            uwVar.fragmentView.requestLayout();
        }
        uwVar.G0.setPadding(0, uwVar.f50234f4, 0, 0);
        uwVar.k5();
        for (UndoView undoView : uwVar.f50330z0) {
            if (undoView != null) {
                int i10 = uwVar.f50239g4 + uwVar.f50248i4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                    marginLayoutParams.bottomMargin = i10;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        pv pvVar = uwVar.G3;
        if (pvVar != null) {
            r0.i0.b(pvVar, k1Var);
        }
        return r0.k1.f54025b;
    }

    @Override
    public void b(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.du.b(float, float, int, android.view.View):void");
    }

    @Override
    public boolean b1(View view) {
        switch (this.f44812a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int e() {
        uw uwVar = this.f44813b;
        uwVar.getClass();
        return uwVar.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6);
    }

    @Override
    public boolean f(int i3, View view) {
        uw.q0(this.f44813b, i3);
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f44812a) {
            case 6:
                uw.h0(this.f44813b);
                return;
            case 7:
                uw uwVar = this.f44813b;
                uwVar.getMessagesController().j2();
                uwVar.n4(false);
                return;
            case 8:
            case 9:
            default:
                uw uwVar2 = this.f44813b;
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25457b.getPackageName()));
                try {
                    uwVar2.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 10:
                uw uwVar3 = this.f44813b;
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", org.telegram.messenger.t0.f25457b.getPackageName());
                try {
                    try {
                        uwVar3.getParentActivity().startActivity(intent2);
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                } catch (Exception unused) {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25457b.getPackageName()));
                    uwVar3.getParentActivity().startActivity(intent3);
                    return;
                }
        }
    }

    @Override
    public void h() {
        uw uwVar = this.f44813b;
        uwVar.R = true;
        uwVar.fragmentView.invalidate();
    }

    public void i(int i3) {
        gv gvVar = this.f44813b.C1;
        if (gvVar == null) {
            return;
        }
        if (i3 == 0) {
            gvVar.n0(true);
        } else {
            gvVar.x1(true, false);
        }
    }

    public void j(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f44813b.j5(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void l(int i3) {
        uw.C0(this.f44813b, i3);
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i3 = this.f44812a;
    }

    private final void a(View view, float f10, float f11) {
    }

    private final void c(View view, float f10, float f11) {
    }

    private final void d(View view, float f10, float f11) {
    }
}
