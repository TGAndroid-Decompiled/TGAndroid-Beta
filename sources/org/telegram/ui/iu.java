package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;
public final class iu implements org.telegram.ui.Components.oo0, org.telegram.ui.Components.cj0, org.telegram.ui.Components.dj0, sz, org.telegram.ui.ActionBar.r1, oi.m, r0.m, oi.n, org.telegram.ui.Components.qi0 {
    public final int f46752a;
    public final zw f46753b;

    public iu(zw zwVar, int i7) {
        this.f46752a = i7;
        this.f46753b = zwVar;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        UndoView[] undoViewArr;
        zw zwVar = this.f46753b;
        zwVar.f52666w.j(k1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        zwVar.f52587f4 = I0.f15123b;
        zwVar.f52592g4 = I0.d;
        int i7 = k1Var.f54213a.f(8).d;
        if (zwVar.f52597h4 != i7) {
            zwVar.f52597h4 = i7;
            zwVar.fragmentView.requestLayout();
        }
        zwVar.F0.setPadding(0, zwVar.f52587f4, 0, 0);
        zwVar.k5();
        for (UndoView undoView : zwVar.f52679y0) {
            if (undoView != null) {
                int i10 = zwVar.f52592g4 + zwVar.f52602i4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                    marginLayoutParams.bottomMargin = i10;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        vv vvVar = zwVar.G3;
        if (vvVar != null) {
            r0.i0.b(vvVar, k1Var);
        }
        return r0.k1.f54212b;
    }

    @Override
    public boolean c(int i7, View view) {
        zw.q0(this.f46753b, i7);
        return false;
    }

    @Override
    public void e() {
        zw zwVar = this.f46753b;
        zwVar.Q = true;
        zwVar.fragmentView.invalidate();
    }

    @Override
    public void f(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iu.f(float, float, int, android.view.View):void");
    }

    @Override
    public boolean f1(View view) {
        switch (this.f46752a) {
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
        switch (this.f46752a) {
            case 6:
                zw.h0(this.f46753b);
                return;
            case 7:
                zw zwVar = this.f46753b;
                zwVar.getMessagesController().j2();
                zwVar.n4(false);
                return;
            case 8:
            case 9:
            default:
                zw zwVar2 = this.f46753b;
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25570b.getPackageName()));
                try {
                    zwVar2.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 10:
                zw zwVar3 = this.f46753b;
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", org.telegram.messenger.t0.f25570b.getPackageName());
                try {
                    try {
                        zwVar3.getParentActivity().startActivity(intent2);
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                } catch (Exception unused) {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25570b.getPackageName()));
                    zwVar3.getParentActivity().startActivity(intent3);
                    return;
                }
        }
    }

    @Override
    public int h() {
        zw zwVar = this.f46753b;
        zwVar.getClass();
        return zwVar.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6);
    }

    public void i(int i7) {
        mv mvVar = this.f46753b.C1;
        if (mvVar == null) {
            return;
        }
        if (i7 == 0) {
            mvVar.o0(true);
        } else {
            mvVar.y1(true, false);
        }
    }

    public void j(boolean z9, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        this.f46753b.j5(z9, arrayList, arrayList2, z10, true);
    }

    @Override
    public void l(int i7) {
        zw.C0(this.f46753b, i7);
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i7 = this.f46752a;
    }

    private final void a(View view, float f10, float f11) {
    }

    private final void b(View view, float f10, float f11) {
    }

    private final void d(View view, float f10, float f11) {
    }
}
