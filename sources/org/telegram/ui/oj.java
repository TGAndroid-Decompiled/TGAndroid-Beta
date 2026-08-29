package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class oj extends f2.x {
    public boolean S;
    public final tn T;

    public oj(tn tnVar, boolean z10) {
        super(z10);
        this.T = tnVar;
    }

    @Override
    public final boolean B1(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        byte b10;
        tn tnVar = this.T;
        em emVar = tnVar.f43013w0;
        int i12 = emVar.F;
        if (i10 >= i12 && i10 < emVar.G && (i11 = i10 - i12) >= 0 && i11 < emVar.L().size() && (X8 = tnVar.X8((messageObject = (MessageObject) tnVar.f43013w0.L().get(i11)))) != null) {
            MessageObject.GroupedMessagePosition position = X8.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = X8.posArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = X8.posArray.get(i13);
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
        if (view instanceof org.telegram.ui.Cells.s1) {
            return !((org.telegram.ui.Cells.s1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override
    public final int G() {
        if (this.S) {
            return (int) this.T.f42921o9;
        }
        return 0;
    }

    @Override
    public final int J() {
        if (this.S) {
            return (int) this.T.f42921o9;
        }
        return F();
    }

    @Override
    public final int K() {
        if (this.S) {
            return (int) ((this.f6507n - this.T.f42921o9) - C());
        }
        return super.K();
    }

    @Override
    public final int X0() {
        return (int) this.T.f42921o9;
    }

    @Override
    public final void b0(f2.d1 d1Var, f2.k1 k1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(d1Var, k1Var);
            return;
        }
        try {
            super.b0(d1Var, k1Var);
        } catch (Exception e10) {
            FileLog.e(e10);
            AndroidUtilities.runOnUIThread(new ui(this, 2));
        }
    }

    @Override
    public final void i1(int i10, int i11, boolean z10) {
        if (!z10) {
            i11 = (int) ((i11 - F()) + this.T.f42921o9);
        }
        super.i1(i10, i11, z10);
    }

    @Override
    public final int j(f2.k1 k1Var) {
        this.S = true;
        int B0 = B0(k1Var);
        this.S = false;
        return B0;
    }

    @Override
    public final int k(f2.k1 k1Var) {
        this.S = true;
        int C0 = C0(k1Var);
        this.S = false;
        return C0;
    }

    @Override
    public final int l(f2.k1 k1Var) {
        this.S = true;
        int D0 = D0(k1Var);
        this.S = false;
        return D0;
    }

    @Override
    public final int o0(int r11, f2.d1 r12, f2.k1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oj.o0(int, f2.d1, f2.k1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.k1 k1Var, int i10) {
        this.T.f42922oa = false;
        uh.n nVar = new uh.n(recyclerView.getContext(), 0);
        nVar.f6373a = i10;
        w0(nVar);
    }

    @Override
    public final boolean y0() {
        return true;
    }
}
