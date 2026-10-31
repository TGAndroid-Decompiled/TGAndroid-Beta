package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;
public final class iv implements org.telegram.ui.Components.rp0, org.telegram.ui.Components.hk0, org.telegram.ui.Components.ik0, q00, org.telegram.ui.ActionBar.u1, ei.n, r0.m, ei.o, org.telegram.ui.Components.uj0 {
    public final int f38354a;
    public final ay f38355b;

    public iv(ay ayVar, int i10) {
        this.f38354a = i10;
        this.f38355b = ayVar;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        UndoView[] undoViewArr;
        ay ayVar = this.f38355b;
        ayVar.f35885w.j(j1Var);
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        ayVar.f35798e4 = I0.f7766b;
        ayVar.f35804f4 = I0.d;
        int i10 = j1Var.f46132a.f(8).d;
        if (ayVar.f35809g4 != i10) {
            ayVar.f35809g4 = i10;
            ayVar.fragmentView.requestLayout();
        }
        ayVar.F0.setPadding(0, ayVar.f35798e4, 0, 0);
        ayVar.j5();
        for (UndoView undoView : ayVar.f35897y0) {
            if (undoView != null) {
                int i11 = ayVar.f35804f4 + ayVar.f35814h4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        xw xwVar = ayVar.F3;
        if (xwVar != null) {
            r0.h0.b(xwVar, j1Var);
        }
        return r0.j1.f46131b;
    }

    @Override
    public void b(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.b(float, float, int, android.view.View):void");
    }

    @Override
    public int c() {
        ay ayVar = this.f38355b;
        ayVar.getClass();
        return ayVar.getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6);
    }

    @Override
    public boolean f(int i10, View view) {
        ay.p0(this.f38355b, i10);
        return false;
    }

    @Override
    public void g() {
        ay ayVar = this.f38355b;
        ayVar.Q = true;
        ayVar.fragmentView.invalidate();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f38354a) {
            case 6:
                ay.g0(this.f38355b);
                return;
            case 7:
                ay ayVar = this.f38355b;
                ayVar.getMessagesController().i2();
                ayVar.m4(false);
                return;
            case 8:
            case 9:
            default:
                ay ayVar2 = this.f38355b;
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f19025b.getPackageName()));
                try {
                    ayVar2.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 10:
                ay ayVar3 = this.f38355b;
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", org.telegram.messenger.w0.f19025b.getPackageName());
                try {
                    try {
                        ayVar3.getParentActivity().startActivity(intent2);
                        return;
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                        return;
                    }
                } catch (Exception unused) {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.w0.f19025b.getPackageName()));
                    ayVar3.getParentActivity().startActivity(intent3);
                    return;
                }
        }
    }

    @Override
    public boolean h1(View view) {
        switch (this.f38354a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    public void i(int i10) {
        ow owVar = this.f38355b.B1;
        if (owVar == null) {
            return;
        }
        if (i10 == 0) {
            owVar.m0(true);
        } else {
            owVar.v1(true, false);
        }
    }

    @Override
    public void j(int i10) {
        ay.B0(this.f38355b, i10);
    }

    public void k(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f38355b.i5(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void q0(View view, float f7, float f10) {
        int i10 = this.f38354a;
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void d(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }
}
