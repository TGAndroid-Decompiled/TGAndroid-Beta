package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class iy extends ew0 {
    public final int f29542v3;
    public final jy f29543w3;

    public iy(jy jyVar, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        super(context, i9, b6Var);
        this.f29543w3 = jyVar;
        this.f29542v3 = i10;
    }

    @Override
    public final boolean A1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final void E1(int i9) {
        boolean z10;
        jw jwVar;
        vv vvVar;
        super.E1(i9);
        jy jyVar = this.f29543w3;
        wy wyVar = jyVar.C;
        iy iyVar = jyVar.f29882r;
        boolean z11 = true;
        if (iyVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = wy.K2;
        wyVar.N(z10);
        int i11 = this.f29542v3;
        if (i11 == 1 && (vvVar = wyVar.E) != null) {
            if (iyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            vvVar.n(z11);
        } else if (i11 == 0 && (jwVar = wyVar.f34459x0) != null) {
            if (iyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            jwVar.f32508k0 = z11;
            jwVar.invalidate();
        }
        jyVar.g(false);
    }
}
