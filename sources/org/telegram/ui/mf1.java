package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class mf1 extends s4.b0 {
    public boolean I;
    public final kg1 J;

    public mf1(kg1 kg1Var) {
        this.J = kg1Var;
    }

    @Override
    public final void b0(qf.e eVar, s4.y0 y0Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, y0Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(eVar, y0Var);
        } catch (IndexOutOfBoundsException e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new tz0(this, 19));
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
    public final int o0(int r19, qf.e r20, s4.y0 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mf1.o0(int, qf.e, s4.y0):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        if (this.J.f37422x > 0 && i10 == 1) {
            super.v0(recyclerView, y0Var, i10);
            return;
        }
        ki.o oVar = new ki.o(recyclerView.getContext(), 0);
        oVar.f44979a = i10;
        w0(oVar);
    }
}
