package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class jf implements ToIntFunction {
    public final int f34729a;
    public final Object f34730b;

    public jf(Object obj, int i10) {
        this.f34729a = i10;
        this.f34730b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f34729a) {
            case 0:
                return ((Integer) ((HashMap) this.f34730b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f34730b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
