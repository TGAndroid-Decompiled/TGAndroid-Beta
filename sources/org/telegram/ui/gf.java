package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class gf implements ToIntFunction {
    public final int f36685a;
    public final Object f36686b;

    public gf(Object obj, int i10) {
        this.f36685a = i10;
        this.f36686b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f36685a) {
            case 0:
                return ((Integer) ((HashMap) this.f36686b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f36686b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
