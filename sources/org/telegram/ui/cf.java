package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class cf implements ToIntFunction {
    public final int f35783a;
    public final Object f35784b;

    public cf(Object obj, int i10) {
        this.f35783a = i10;
        this.f35784b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f35783a) {
            case 0:
                return ((Integer) ((HashMap) this.f35784b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f35784b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
