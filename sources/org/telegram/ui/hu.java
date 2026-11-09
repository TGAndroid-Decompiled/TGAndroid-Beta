package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;
public final class hu implements org.telegram.ui.Components.po0, org.telegram.ui.Components.dj0, org.telegram.ui.Components.ej0, rz, org.telegram.ui.ActionBar.r1, oi.m, r0.m, oi.n, org.telegram.ui.Components.ri0 {
    public final int f46408a;
    public final yw f46409b;

    public hu(yw ywVar, int i7) {
        this.f46408a = i7;
        this.f46409b = ywVar;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        UndoView[] undoViewArr;
        yw ywVar = this.f46409b;
        ywVar.f52320w.j(k1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        ywVar.f52241f4 = I0.f15121b;
        ywVar.f52246g4 = I0.d;
        int i7 = k1Var.f54214a.f(8).d;
        if (ywVar.f52251h4 != i7) {
            ywVar.f52251h4 = i7;
            ywVar.fragmentView.requestLayout();
        }
        ywVar.F0.setPadding(0, ywVar.f52241f4, 0, 0);
        ywVar.k5();
        for (UndoView undoView : ywVar.f52333y0) {
            if (undoView != null) {
                int i10 = ywVar.f52246g4 + ywVar.f52256i4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                    marginLayoutParams.bottomMargin = i10;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        uv uvVar = ywVar.G3;
        if (uvVar != null) {
            r0.i0.b(uvVar, k1Var);
        }
        return r0.k1.f54213b;
    }

    @Override
    public boolean c(int i7, View view) {
        yw.q0(this.f46409b, i7);
        return false;
    }

    @Override
    public void e() {
        yw ywVar = this.f46409b;
        ywVar.Q = true;
        ywVar.fragmentView.invalidate();
    }

    @Override
    public void f(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hu.f(float, float, int, android.view.View):void");
    }

    @Override
    public boolean f1(View view) {
        switch (this.f46408a) {
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
        switch (this.f46408a) {
            case 6:
                yw.h0(this.f46409b);
                return;
            case 7:
                yw ywVar = this.f46409b;
                ywVar.getMessagesController().j2();
                ywVar.n4(false);
                return;
            case 8:
            case 9:
            default:
                yw ywVar2 = this.f46409b;
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
                try {
                    ywVar2.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 10:
                yw ywVar3 = this.f46409b;
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", org.telegram.messenger.t0.f25566b.getPackageName());
                try {
                    try {
                        ywVar3.getParentActivity().startActivity(intent2);
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                } catch (Exception unused) {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
                    ywVar3.getParentActivity().startActivity(intent3);
                    return;
                }
        }
    }

    @Override
    public int h() {
        yw ywVar = this.f46409b;
        ywVar.getClass();
        return ywVar.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6);
    }

    public void i(int i7) {
        lv lvVar = this.f46409b.C1;
        if (lvVar == null) {
            return;
        }
        if (i7 == 0) {
            lvVar.o0(true);
        } else {
            lvVar.y1(true, false);
        }
    }

    public void j(boolean z9, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        this.f46409b.j5(z9, arrayList, arrayList2, z10, true);
    }

    @Override
    public void l(int i7) {
        yw.C0(this.f46409b, i7);
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i7 = this.f46408a;
    }

    private final void a(View view, float f10, float f11) {
    }

    private final void b(View view, float f10, float f11) {
    }

    private final void d(View view, float f10, float f11) {
    }
}
