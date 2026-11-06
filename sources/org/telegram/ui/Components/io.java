package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class io implements org.telegram.ui.ActionBar.s6 {
    public boolean f34703a = false;
    public final vo f34704b;

    public io(vo voVar) {
        this.f34704b = voVar;
    }

    @Override
    public final void a(float f10) {
        ArrayList arrayList;
        vo voVar = this.f34704b;
        to toVar = voVar.n1;
        if (f10 == 0.0f && !this.f34703a) {
            if (toVar != null && (arrayList = toVar.d) != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((uo) obj).f38690c = voVar.D1 ? 1 : 0;
                }
            }
            if (!voVar.F1) {
                for (int i10 = 0; i10 < toVar.b(); i10++) {
                    ((uo) toVar.d.get(i10)).getClass();
                }
            }
            this.f34703a = true;
        }
        zg0 zg0Var = voVar.f39007v1;
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, voVar.I0);
        voVar.f38994a2 = w02;
        zg0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        voVar.E0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27792a7, voVar.I0));
        if (voVar.F1) {
            for (int i12 = 0; i12 < toVar.b(); i12++) {
                ((uo) toVar.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.f34703a) {
            voVar.F1 = false;
            this.f34703a = false;
        }
        voVar.Y0();
        bi.x5 x5Var = voVar.P1;
        if (x5Var != null) {
            int L = org.telegram.messenger.g0.L(0.0f);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27848d6, voVar.I0);
            int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i11, voVar.I0), 76);
            x5Var.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w03, o4, o4));
        }
        j6 j6Var = voVar.Q1;
        if (j6Var != null) {
            j6Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, voVar.I0));
        }
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, voVar.I0);
        voVar.f38995b2 = w04;
        voVar.v0(w04);
    }

    @Override
    public final void b() {
        this.f34704b.N0();
    }
}
