package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class pf implements ToIntFunction {
    public final int f39209a;
    public final Object f39210b;

    public pf(Object obj, int i10) {
        this.f39209a = i10;
        this.f39210b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f39209a) {
            case 0:
                return ((Integer) ((HashMap) this.f39210b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f39210b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
