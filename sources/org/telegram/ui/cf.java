package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class cf implements ToIntFunction {
    public final int f35791a;
    public final Object f35792b;

    public cf(Object obj, int i10) {
        this.f35791a = i10;
        this.f35792b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f35791a) {
            case 0:
                return ((Integer) ((HashMap) this.f35792b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f35792b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
