package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

public final class pq0 implements Utilities.Callback {

    public final org.telegram.ui.Cells.o7 f31651a;

    public final float f31652b;

    public final float f31653c;

    public pq0(org.telegram.ui.Cells.o7 o7Var, float f10, float f11) {
        this.f31651a = o7Var;
        this.f31652b = f10;
        this.f31653c = f11;
    }

    @Override
    public final void run(Object obj) {
        this.f31651a.n(this.f31652b, this.f31653c);
    }
}
