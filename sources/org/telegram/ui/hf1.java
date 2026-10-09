package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class hf1 extends s4.d0 {
    public boolean I;
    public final fg1 J;

    public hf1(fg1 fg1Var) {
        this.J = fg1Var;
    }

    @Override
    public final void b0(pf.e eVar, s4.a1 a1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, a1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(eVar, a1Var);
        } catch (IndexOutOfBoundsException e7) {
            FileLog.e(e7);
            AndroidUtilities.runOnUIThread(new nz0(this, 19));
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
    public final int o0(int r19, pf.e r20, s4.a1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hf1.o0(int, pf.e, s4.a1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.a1 a1Var, int i10) {
        if (this.J.f37599x > 0 && i10 == 1) {
            super.v0(recyclerView, a1Var, i10);
            return;
        }
        ji.o oVar = new ji.o(recyclerView.getContext(), 0);
        oVar.f47825a = i10;
        w0(oVar);
    }
}
