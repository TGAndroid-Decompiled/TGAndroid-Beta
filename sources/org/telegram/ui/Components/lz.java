package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class lz extends yx0 {
    public final int f28631x3;
    public final mz y3;

    public lz(mz mzVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        super(context, i10, e6Var);
        this.y3 = mzVar;
        this.f28631x3 = i11;
    }

    @Override
    public final boolean B1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final void F1(int i10) {
        boolean z10;
        mx mxVar;
        ey eyVar;
        super.F1(i10);
        mz mzVar = this.y3;
        a00 a00Var = mzVar.G;
        lz lzVar = mzVar.f28978r;
        boolean z11 = true;
        if (lzVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = a00.O2;
        a00Var.M(z10);
        int i12 = this.f28631x3;
        if (i12 == 1 && (eyVar = a00Var.I) != null) {
            if (lzVar.getSelectedCategory() != null) {
                z11 = false;
            }
            eyVar.n(z11);
        } else if (i12 == 0 && (mxVar = a00Var.B0) != null) {
            if (lzVar.getSelectedCategory() != null) {
                z11 = false;
            }
            mxVar.f29537o0 = z11;
            mxVar.invalidate();
        }
        mzVar.g(false);
    }
}
