package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class ho implements org.telegram.ui.ActionBar.u6 {
    public boolean f34422a = false;
    public final vo f34423b;

    public ho(vo voVar) {
        this.f34423b = voVar;
    }

    @Override
    public final void a(float f10) {
        ArrayList arrayList;
        vo voVar = this.f34423b;
        to toVar = voVar.f39067q1;
        if (f10 == 0.0f && !this.f34422a) {
            if (toVar != null && (arrayList = toVar.d) != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((uo) obj).f38727c = voVar.G1 ? 1 : 0;
                }
            }
            if (!voVar.I1) {
                for (int i10 = 0; i10 < toVar.b(); i10++) {
                    ((uo) toVar.d.get(i10)).getClass();
                }
            }
            this.f34422a = true;
        }
        zg0 zg0Var = voVar.f39075y1;
        int i11 = org.telegram.ui.ActionBar.m6.Ci;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i11, voVar.I0);
        voVar.d2 = w02;
        zg0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        voVar.E0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, voVar.I0));
        if (voVar.I1) {
            for (int i12 = 0; i12 < toVar.b(); i12++) {
                ((uo) toVar.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.f34422a) {
            voVar.I1 = false;
            this.f34422a = false;
        }
        voVar.Y0();
        bi.x5 x5Var = voVar.S1;
        if (x5Var != null) {
            int L = org.telegram.messenger.g0.L(0.0f);
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, voVar.I0);
            int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(i11, voVar.I0), 76);
            x5Var.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w03, o4, o4));
        }
        i6 i6Var = voVar.T1;
        if (i6Var != null) {
            i6Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(i11, voVar.I0));
        }
        int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, voVar.I0);
        voVar.f39063e2 = w04;
        voVar.v0(w04);
    }

    @Override
    public final void b() {
        this.f34423b.N0();
    }
}
