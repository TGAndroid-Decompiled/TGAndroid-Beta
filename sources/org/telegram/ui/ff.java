package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class ff implements ToIntFunction {
    public final int f33653a;
    public final Object f33654b;

    public ff(Object obj, int i10) {
        this.f33653a = i10;
        this.f33654b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f33653a) {
            case 0:
                return ((Integer) ((HashMap) this.f33654b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f33654b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
