package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class ef implements ToIntFunction {
    public final int f33799a;
    public final Object f33800b;

    public ef(Object obj, int i10) {
        this.f33799a = i10;
        this.f33800b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f33799a) {
            case 0:
                return ((Integer) ((HashMap) this.f33800b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f33800b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
