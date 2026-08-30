package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class le1 extends f2.i0 {
    public boolean I;
    public final kf1 J;

    public le1(kf1 kf1Var) {
        this.J = kf1Var;
    }

    @Override
    public final void b0(bf.f fVar, f2.i1 i1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(fVar, i1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(fVar, i1Var);
        } catch (IndexOutOfBoundsException e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new vy0(this, 20));
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
            i11 -= this.J.K.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    @Override
    public final int o0(int r19, bf.f r20, f2.i1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.le1.o0(int, bf.f, f2.i1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.i1 i1Var, int i10) {
        if (this.J.f35708x > 0 && i10 == 1) {
            super.v0(recyclerView, i1Var, i10);
            return;
        }
        wh.o oVar = new wh.o(recyclerView.getContext(), 0);
        oVar.f5723a = i10;
        w0(oVar);
    }
}
