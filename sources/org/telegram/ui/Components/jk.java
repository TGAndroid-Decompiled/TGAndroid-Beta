package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jk extends s4.d0 {
    public final gg.j0 f24431r;

    public jk(gg.j0 j0Var, Context context) {
        super(context);
        this.f24431r = j0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.a2.z(56.0f, ((tk) this.f24431r.V).f27428r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
