package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class gf implements ToIntFunction {
    public final int f33827a;
    public final Object f33828b;

    public gf(Object obj, int i10) {
        this.f33827a = i10;
        this.f33828b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f33827a) {
            case 0:
                return ((Integer) ((HashMap) this.f33828b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f33828b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
