package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class jf implements ToIntFunction {
    public final int f37675a;
    public final Object f37676b;

    public jf(Object obj, int i10) {
        this.f37675a = i10;
        this.f37676b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f37675a) {
            case 0:
                return ((Integer) ((HashMap) this.f37676b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f37676b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
