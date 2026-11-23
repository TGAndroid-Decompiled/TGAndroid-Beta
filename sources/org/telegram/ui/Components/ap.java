package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class ap implements org.telegram.ui.ActionBar.u6 {
    public boolean f33544a = false;
    public final np f33545b;

    public ap(np npVar) {
        this.f33545b = npVar;
    }

    @Override
    public final void a(float f10) {
        ArrayList arrayList;
        np npVar = this.f33545b;
        lp lpVar = npVar.f37887r1;
        if (f10 == 0.0f && !this.f33544a) {
            if (lpVar != null && (arrayList = lpVar.d) != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((mp) obj).f37550c = npVar.H1 ? 1 : 0;
                }
            }
            if (!npVar.J1) {
                for (int i10 = 0; i10 < lpVar.b(); i10++) {
                    ((mp) lpVar.d.get(i10)).getClass();
                }
            }
            this.f33544a = true;
        }
        oh0 oh0Var = npVar.f37895z1;
        int i11 = org.telegram.ui.ActionBar.m6.Fi;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i11, npVar.J0);
        npVar.f37881e2 = w02;
        oh0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        npVar.E0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29290a7, npVar.J0));
        if (npVar.J1) {
            for (int i12 = 0; i12 < lpVar.b(); i12++) {
                ((mp) lpVar.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.f33544a) {
            npVar.J1 = false;
            this.f33544a = false;
        }
        npVar.Z0();
        ai.g0 g0Var = npVar.T1;
        if (g0Var != null) {
            int L = org.telegram.messenger.g0.L(0.0f);
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, npVar.J0);
            int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(i11, npVar.J0), 76);
            g0Var.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w03, o4, o4));
        }
        o6 o6Var = npVar.U1;
        if (o6Var != null) {
            o6Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(i11, npVar.J0));
        }
        int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29420h5, npVar.J0);
        npVar.f37882f2 = w04;
        npVar.v0(w04);
    }

    @Override
    public final void b() {
        this.f33545b.O0();
    }
}
