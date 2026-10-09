package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class kf implements ToIntFunction {
    public final int f39262a;
    public final Object f39263b;

    public kf(Object obj, int i10) {
        this.f39262a = i10;
        this.f39263b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f39262a) {
            case 0:
                return ((Integer) ((HashMap) this.f39263b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f39263b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
