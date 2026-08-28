package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class lj extends f2.z {
    public boolean S;
    public final qn T;

    public lj(qn qnVar, boolean z10) {
        super(z10);
        this.T = qnVar;
    }

    @Override
    public final boolean B1(int i9) {
        int i10;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        byte b10;
        qn qnVar = this.T;
        bm bmVar = qnVar.f42114w0;
        int i11 = bmVar.F;
        if (i9 >= i11 && i9 < bmVar.G && (i10 = i9 - i11) >= 0 && i10 < bmVar.L().size() && (X8 = qnVar.X8((messageObject = (MessageObject) qnVar.f42114w0.L().get(i10)))) != null) {
            MessageObject.GroupedMessagePosition position = X8.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = X8.posArray.size();
                for (int i12 = 0; i12 < size; i12++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = X8.posArray.get(i12);
                    if (groupedMessagePosition != position) {
                        byte b11 = groupedMessagePosition.minY;
                        byte b12 = position.minY;
                        if (b11 <= b12 && groupedMessagePosition.maxY >= b12) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            return !((org.telegram.ui.Cells.t1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override
    public final int G() {
        if (this.S) {
            return (int) this.T.o9;
        }
        return 0;
    }

    @Override
    public final int J() {
        if (this.S) {
            return (int) this.T.o9;
        }
        return F();
    }

    @Override
    public final int K() {
        if (this.S) {
            return (int) ((this.f5573n - this.T.o9) - C());
        }
        return super.K();
    }

    @Override
    public final int X0() {
        return (int) this.T.o9;
    }

    @Override
    public final void b0(f2.g1 g1Var, f2.n1 n1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(g1Var, n1Var);
            return;
        }
        try {
            super.b0(g1Var, n1Var);
        } catch (Exception e10) {
            FileLog.e(e10);
            AndroidUtilities.runOnUIThread(new ri(this, 2));
        }
    }

    @Override
    public final void i1(int i9, int i10, boolean z10) {
        if (!z10) {
            i10 = (int) ((i10 - F()) + this.T.o9);
        }
        super.i1(i9, i10, z10);
    }

    @Override
    public final int j(f2.n1 n1Var) {
        this.S = true;
        int B0 = B0(n1Var);
        this.S = false;
        return B0;
    }

    @Override
    public final int k(f2.n1 n1Var) {
        this.S = true;
        int C0 = C0(n1Var);
        this.S = false;
        return C0;
    }

    @Override
    public final int l(f2.n1 n1Var) {
        this.S = true;
        int D0 = D0(n1Var);
        this.S = false;
        return D0;
    }

    @Override
    public final int o0(int r11, f2.g1 r12, f2.n1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lj.o0(int, f2.g1, f2.n1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.n1 n1Var, int i9) {
        this.T.f42023oa = false;
        rh.n nVar = new rh.n(recyclerView.getContext(), 0);
        nVar.f5443a = i9;
        w0(nVar);
    }

    @Override
    public final boolean y0() {
        return true;
    }
}
