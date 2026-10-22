package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class cf implements ToIntFunction {
    public final int f35955a;
    public final Object f35956b;

    public cf(Object obj, int i10) {
        this.f35955a = i10;
        this.f35956b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f35955a) {
            case 0:
                return ((Integer) ((HashMap) this.f35956b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f35956b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
