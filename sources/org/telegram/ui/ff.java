package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class ff implements ToIntFunction {
    public final int f33639a;
    public final Object f33640b;

    public ff(Object obj, int i10) {
        this.f33639a = i10;
        this.f33640b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f33639a) {
            case 0:
                return ((Integer) ((HashMap) this.f33640b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f33640b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
