package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class gf implements ToIntFunction {
    public final int f33544a;
    public final Object f33545b;

    public gf(Object obj, int i10) {
        this.f33544a = i10;
        this.f33545b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f33544a) {
            case 0:
                return ((Integer) ((HashMap) this.f33545b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f33545b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
