package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class kf implements ToIntFunction {
    public final int f39306a;
    public final Object f39307b;

    public kf(Object obj, int i10) {
        this.f39306a = i10;
        this.f39307b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f39306a) {
            case 0:
                return ((Integer) ((HashMap) this.f39307b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f39307b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
