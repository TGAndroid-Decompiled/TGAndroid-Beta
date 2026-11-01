package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;
public final class hv implements org.telegram.ui.Components.sp0, org.telegram.ui.Components.ik0, org.telegram.ui.Components.jk0, p00, org.telegram.ui.ActionBar.u1, ei.n, r0.m, ei.o, org.telegram.ui.Components.vj0 {
    public final int f37872a;
    public final zx f37873b;

    public hv(zx zxVar, int i10) {
        this.f37872a = i10;
        this.f37873b = zxVar;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        UndoView[] undoViewArr;
        zx zxVar = this.f37873b;
        zxVar.f44228w.j(j1Var);
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        zxVar.f44141e4 = I0.f7767b;
        zxVar.f44147f4 = I0.d;
        int i10 = j1Var.f46143a.f(8).d;
        if (zxVar.f44152g4 != i10) {
            zxVar.f44152g4 = i10;
            zxVar.fragmentView.requestLayout();
        }
        zxVar.F0.setPadding(0, zxVar.f44141e4, 0, 0);
        zxVar.k5();
        for (UndoView undoView : zxVar.f44240y0) {
            if (undoView != null) {
                int i11 = zxVar.f44147f4 + zxVar.f44157h4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        ww wwVar = zxVar.F3;
        if (wwVar != null) {
            r0.h0.b(wwVar, j1Var);
        }
        return r0.j1.f46142b;
    }

    @Override
    public void b(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hv.b(float, float, int, android.view.View):void");
    }

    @Override
    public int c() {
        zx zxVar = this.f37873b;
        zxVar.getClass();
        return zxVar.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6);
    }

    @Override
    public boolean f(int i10, View view) {
        zx.q0(this.f37873b, i10);
        return false;
    }

    @Override
    public void g() {
        zx zxVar = this.f37873b;
        zxVar.Q = true;
        zxVar.fragmentView.invalidate();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f37872a) {
            case 6:
                zx.h0(this.f37873b);
                return;
            case 7:
                zx zxVar = this.f37873b;
                zxVar.getMessagesController().i2();
                zxVar.n4(false);
                return;
            case 8:
            case 9:
            default:
                zx zxVar2 = this.f37873b;
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f18945b.getPackageName()));
                try {
                    zxVar2.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 10:
                zx zxVar3 = this.f37873b;
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", org.telegram.messenger.w0.f18945b.getPackageName());
                try {
                    try {
                        zxVar3.getParentActivity().startActivity(intent2);
                        return;
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                        return;
                    }
                } catch (Exception unused) {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.w0.f18945b.getPackageName()));
                    zxVar3.getParentActivity().startActivity(intent3);
                    return;
                }
        }
    }

    @Override
    public boolean h1(View view) {
        switch (this.f37872a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    public void i(int i10) {
        nw nwVar = this.f37873b.B1;
        if (nwVar == null) {
            return;
        }
        if (i10 == 0) {
            nwVar.m0(true);
        } else {
            nwVar.v1(true, false);
        }
    }

    @Override
    public void j(int i10) {
        zx.C0(this.f37873b, i10);
    }

    public void k(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f37873b.j5(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void q0(View view, float f7, float f10) {
        int i10 = this.f37872a;
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void d(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }
}
