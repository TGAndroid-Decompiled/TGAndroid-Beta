package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class io implements org.telegram.ui.ActionBar.t6 {
    public boolean f34822a = false;
    public final vo f34823b;

    public io(vo voVar) {
        this.f34823b = voVar;
    }

    @Override
    public final void a(float f10) {
        ArrayList arrayList;
        vo voVar = this.f34823b;
        to toVar = voVar.n1;
        if (f10 == 0.0f && !this.f34822a) {
            if (toVar != null && (arrayList = toVar.d) != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((uo) obj).f38762c = voVar.D1 ? 1 : 0;
                }
            }
            if (!voVar.F1) {
                for (int i10 = 0; i10 < toVar.b(); i10++) {
                    ((uo) toVar.d.get(i10)).getClass();
                }
            }
            this.f34822a = true;
        }
        ah0 ah0Var = voVar.f39154v1;
        int i11 = org.telegram.ui.ActionBar.l6.Ci;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i11, voVar.I0);
        voVar.f39141a2 = w02;
        ah0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        voVar.E0(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27809a7, voVar.I0));
        if (voVar.F1) {
            for (int i12 = 0; i12 < toVar.b(); i12++) {
                ((uo) toVar.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.f34822a) {
            voVar.F1 = false;
            this.f34822a = false;
        }
        voVar.Y0();
        bi.x5 x5Var = voVar.P1;
        if (x5Var != null) {
            int L = org.telegram.messenger.g0.L(0.0f);
            int w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, voVar.I0);
            int o4 = i0.a.o(org.telegram.ui.ActionBar.l6.w0(i11, voVar.I0), 76);
            x5Var.setBackground(org.telegram.ui.ActionBar.l6.k0(L, L, L, L, w03, o4, o4));
        }
        j6 j6Var = voVar.Q1;
        if (j6Var != null) {
            j6Var.setTextColor(org.telegram.ui.ActionBar.l6.w0(i11, voVar.I0));
        }
        int w04 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, voVar.I0);
        voVar.f39142b2 = w04;
        voVar.v0(w04);
    }

    @Override
    public final void b() {
        this.f34823b.N0();
    }
}
