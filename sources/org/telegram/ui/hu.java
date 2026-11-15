package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;
public final class hu implements org.telegram.ui.Components.so0, org.telegram.ui.Components.hj0, org.telegram.ui.Components.ij0, qz, org.telegram.ui.ActionBar.q1, ri.m, r0.m, ri.n, org.telegram.ui.Components.vi0 {
    public final int f47812a;
    public final yw f47813b;

    public hu(yw ywVar, int i7) {
        this.f47812a = i7;
        this.f47813b = ywVar;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        UndoView[] undoViewArr;
        yw ywVar = this.f47813b;
        ywVar.f53721w.j(k1Var);
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        ywVar.f53647g4 = I0.f15575b;
        ywVar.f53652h4 = I0.d;
        int i7 = k1Var.f55682a.f(8).d;
        if (ywVar.f53657i4 != i7) {
            ywVar.f53657i4 = i7;
            ywVar.fragmentView.requestLayout();
        }
        ywVar.G0.setPadding(0, ywVar.f53647g4, 0, 0);
        ywVar.k5();
        for (UndoView undoView : ywVar.f53739z0) {
            if (undoView != null) {
                int i10 = ywVar.f53652h4 + ywVar.f53661j4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                    marginLayoutParams.bottomMargin = i10;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        uv uvVar = ywVar.H3;
        if (uvVar != null) {
            r0.i0.b(uvVar, k1Var);
        }
        return r0.k1.f55681b;
    }

    @Override
    public boolean b(int i7, View view) {
        yw.q0(this.f47813b, i7);
        return false;
    }

    @Override
    public boolean c1(View view) {
        switch (this.f47812a) {
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
        yw ywVar = this.f47813b;
        ywVar.getClass();
        return ywVar.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6);
    }

    @Override
    public void f(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hu.f(float, float, int, android.view.View):void");
    }

    public void g(int i7) {
        kv kvVar = this.f47813b.D1;
        if (kvVar == null) {
            return;
        }
        if (i7 == 0) {
            kvVar.C0(true);
        } else {
            kvVar.Q1(true, false);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f47812a) {
            case 6:
                yw.h0(this.f47813b);
                return;
            case 7:
                yw ywVar = this.f47813b;
                ywVar.getMessagesController().j2();
                ywVar.n4(false);
                return;
            case 8:
            case 9:
            default:
                yw ywVar2 = this.f47813b;
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26609b.getPackageName()));
                try {
                    ywVar2.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 10:
                yw ywVar3 = this.f47813b;
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", org.telegram.messenger.t0.f26609b.getPackageName());
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
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26609b.getPackageName()));
                    ywVar3.getParentActivity().startActivity(intent3);
                    return;
                }
        }
    }

    @Override
    public void i() {
        yw ywVar = this.f47813b;
        ywVar.R = true;
        ywVar.fragmentView.invalidate();
    }

    public void j(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f47813b.j5(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void l(int i7) {
        yw.C0(this.f47813b, i7);
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i7 = this.f47812a;
    }

    private final void a(View view, float f10, float f11) {
    }

    private final void c(View view, float f10, float f11) {
    }

    private final void d(View view, float f10, float f11) {
    }
}
