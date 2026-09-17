package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class jf implements ToIntFunction {
    public final int f34861a;
    public final Object f34862b;

    public jf(Object obj, int i10) {
        this.f34861a = i10;
        this.f34862b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f34861a) {
            case 0:
                return ((Integer) ((HashMap) this.f34862b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f34862b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
