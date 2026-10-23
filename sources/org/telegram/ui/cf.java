package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class cf implements ToIntFunction {
    public final int f36347a;
    public final Object f36348b;

    public cf(Object obj, int i10) {
        this.f36347a = i10;
        this.f36348b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f36347a) {
            case 0:
                return ((Integer) ((HashMap) this.f36348b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f36348b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
