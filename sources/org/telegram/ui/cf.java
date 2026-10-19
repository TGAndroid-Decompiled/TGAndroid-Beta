package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class cf implements ToIntFunction {
    public final int f35945a;
    public final Object f35946b;

    public cf(Object obj, int i10) {
        this.f35945a = i10;
        this.f35946b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f35945a) {
            case 0:
                return ((Integer) ((HashMap) this.f35946b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f35946b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
