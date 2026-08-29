package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class qy extends ow0 {
    public final int f32133v3;
    public final ry f32134w3;

    public qy(ry ryVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, i10, c6Var);
        this.f32134w3 = ryVar;
        this.f32133v3 = i11;
    }

    @Override
    public final boolean A1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final void E1(int i10) {
        boolean z10;
        pw pwVar;
        bw bwVar;
        super.E1(i10);
        ry ryVar = this.f32134w3;
        fz fzVar = ryVar.C;
        qy qyVar = ryVar.f32415r;
        boolean z11 = true;
        if (qyVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = fz.K2;
        fzVar.O(z10);
        int i12 = this.f32133v3;
        if (i12 == 1 && (bwVar = fzVar.E) != null) {
            if (qyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            bwVar.n(z11);
        } else if (i12 == 0 && (pwVar = fzVar.f28650x0) != null) {
            if (qyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            pwVar.f28498k0 = z11;
            pwVar.invalidate();
        }
        ryVar.g(false);
    }
}
