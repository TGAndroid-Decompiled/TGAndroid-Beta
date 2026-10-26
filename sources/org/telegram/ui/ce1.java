package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class ce1 extends s4.c0 {
    public boolean I;
    public final af1 J;

    public ce1(af1 af1Var) {
        this.J = af1Var;
    }

    @Override
    public final void b0(rf.e eVar, s4.b1 b1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, b1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(eVar, b1Var);
        } catch (IndexOutOfBoundsException e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new my0(this, 22));
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
    public final int o0(int r19, rf.e r20, s4.b1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ce1.o0(int, rf.e, s4.b1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.b1 b1Var, int i10) {
        if (this.J.f37779x > 0 && i10 == 1) {
            super.v0(recyclerView, b1Var, i10);
            return;
        }
        mi.n nVar = new mi.n(recyclerView.getContext(), 0);
        nVar.f47680a = i10;
        w0(nVar);
    }
}
