package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class qo implements org.telegram.ui.ActionBar.b7 {
    public boolean f29763a = false;
    public final dp f29764b;

    public qo(dp dpVar) {
        this.f29764b = dpVar;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        dp dpVar = this.f29764b;
        bp bpVar = dpVar.f25543n1;
        if (f7 == 0.0f && !this.f29763a) {
            if (bpVar != null && (arrayList = bpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((cp) obj).f25199c = dpVar.D1 ? 1 : 0;
                }
            }
            if (!dpVar.F1) {
                for (int i11 = 0; i11 < bpVar.b(); i11++) {
                    ((cp) bpVar.d.get(i11)).getClass();
                }
            }
            this.f29763a = true;
        }
        ci0 ci0Var = dpVar.f25551v1;
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i12, dpVar.I0);
        dpVar.a2 = w02;
        ci0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        dpVar.E0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, dpVar.I0));
        if (dpVar.F1) {
            for (int i13 = 0; i13 < bpVar.b(); i13++) {
                ((cp) bpVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.f29763a) {
            dpVar.F1 = false;
            this.f29763a = false;
        }
        dpVar.Y0();
        fg.i iVar = dpVar.P1;
        if (iVar != null) {
            int L = org.telegram.messenger.i0.L(0.0f);
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, dpVar.I0);
            int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(i12, dpVar.I0), 76);
            iVar.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w03, o10, o10));
        }
        f6 f6Var = dpVar.Q1;
        if (f6Var != null) {
            f6Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(i12, dpVar.I0));
        }
        int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, dpVar.I0);
        dpVar.f25538b2 = w04;
        dpVar.v0(w04);
    }

    @Override
    public final void b() {
        this.f29764b.N0();
    }
}
