package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class of implements ToIntFunction {
    public final int f40700a;
    public final Object f40701b;

    public of(Object obj, int i10) {
        this.f40700a = i10;
        this.f40701b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f40700a) {
            case 0:
                return ((Integer) ((HashMap) this.f40701b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f40701b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
