package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class jf implements ToIntFunction {
    public final int f39058a;
    public final Object f39059b;

    public jf(Object obj, int i10) {
        this.f39058a = i10;
        this.f39059b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f39058a) {
            case 0:
                return ((Integer) ((HashMap) this.f39059b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f39059b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
