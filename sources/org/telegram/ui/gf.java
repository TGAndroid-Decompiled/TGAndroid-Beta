package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class gf implements ToIntFunction {
    public final int f36686a;
    public final Object f36687b;

    public gf(Object obj, int i10) {
        this.f36686a = i10;
        this.f36687b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f36686a) {
            case 0:
                return ((Integer) ((HashMap) this.f36687b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f36687b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
