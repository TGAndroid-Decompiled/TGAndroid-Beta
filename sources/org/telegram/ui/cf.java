package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class cf implements ToIntFunction {
    public final int f33360a;
    public final Object f33361b;

    public cf(Object obj, int i10) {
        this.f33360a = i10;
        this.f33361b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f33360a) {
            case 0:
                return ((Integer) ((HashMap) this.f33361b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f33361b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
