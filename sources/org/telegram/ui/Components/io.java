package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class io implements org.telegram.ui.ActionBar.s6 {
    public boolean f34777a = false;
    public final vo f34778b;

    public io(vo voVar) {
        this.f34778b = voVar;
    }

    @Override
    public final void a(float f10) {
        ArrayList arrayList;
        vo voVar = this.f34778b;
        to toVar = voVar.f39187o1;
        if (f10 == 0.0f && !this.f34777a) {
            if (toVar != null && (arrayList = toVar.d) != null) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((uo) obj).f38834c = voVar.E1 ? 1 : 0;
                }
            }
            if (!voVar.G1) {
                for (int i10 = 0; i10 < toVar.b(); i10++) {
                    ((uo) toVar.d.get(i10)).getClass();
                }
            }
            this.f34777a = true;
        }
        ch0 ch0Var = voVar.f39195w1;
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, voVar.J0);
        voVar.f39183b2 = w02;
        ch0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        voVar.E0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, voVar.J0));
        if (voVar.G1) {
            for (int i12 = 0; i12 < toVar.b(); i12++) {
                ((uo) toVar.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.f34777a) {
            voVar.G1 = false;
            this.f34777a = false;
        }
        voVar.Y0();
        ai.c0 c0Var = voVar.Q1;
        if (c0Var != null) {
            int L = org.telegram.messenger.g0.L(0.0f);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, voVar.J0);
            int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i11, voVar.J0), 76);
            c0Var.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w03, o10, o10));
        }
        h6 h6Var = voVar.R1;
        if (h6Var != null) {
            h6Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, voVar.J0));
        }
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, voVar.J0);
        voVar.c2 = w04;
        voVar.v0(w04);
    }

    @Override
    public final void b() {
        this.f34778b.N0();
    }
}
