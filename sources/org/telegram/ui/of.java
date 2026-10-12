package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class of implements ToIntFunction {
    public final int f40703a;
    public final Object f40704b;

    public of(Object obj, int i10) {
        this.f40703a = i10;
        this.f40704b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f40703a) {
            case 0:
                return ((Integer) ((HashMap) this.f40704b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f40704b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
