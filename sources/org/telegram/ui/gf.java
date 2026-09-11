package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class gf implements ToIntFunction {
    public final int f36658a;
    public final Object f36659b;

    public gf(Object obj, int i10) {
        this.f36658a = i10;
        this.f36659b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f36658a) {
            case 0:
                return ((Integer) ((HashMap) this.f36659b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f36659b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
