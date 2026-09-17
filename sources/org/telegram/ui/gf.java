package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class gf implements ToIntFunction {
    public final int f36659a;
    public final Object f36660b;

    public gf(Object obj, int i10) {
        this.f36659a = i10;
        this.f36660b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f36659a) {
            case 0:
                return ((Integer) ((HashMap) this.f36660b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f36660b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
