package org.telegram.ui.Components;

import android.content.Context;

public final class gu0 {

    public final int f28825a;

    public final int f28826b;

    public final fu0 f28827c;
    public final eu0 d;

    public final hu0 f28828e;

    public gu0(hu0 hu0Var, Context context, int i10) {
        this.f28828e = hu0Var;
        this.f28826b = i10;
        int i11 = hu0Var.W1;
        hu0Var.W1 = i11 + 1;
        this.f28825a = (i11 & 65535) | 65536;
        this.f28827c = new fu0(this, context, i10);
        this.d = new eu0(hu0Var, context, i10, false);
    }
}
