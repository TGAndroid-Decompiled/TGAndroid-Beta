package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class kf1 extends s4.c0 {
    public boolean I;
    public final ig1 J;

    public kf1(ig1 ig1Var) {
        this.J = ig1Var;
    }

    @Override
    public final void b0(of.e eVar, s4.z0 z0Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, z0Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(eVar, z0Var);
        } catch (IndexOutOfBoundsException e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new k01(this, 18));
        }
    }

    @Override
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.J.N.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    @Override
    public final int o0(int r19, of.e r20, s4.z0 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kf1.o0(int, of.e, s4.z0):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        if (this.J.f33723x > 0 && i10 == 1) {
            super.v0(recyclerView, z0Var, i10);
            return;
        }
        ii.o oVar = new ii.o(recyclerView.getContext(), 0);
        oVar.f41760a = i10;
        w0(oVar);
    }
}
