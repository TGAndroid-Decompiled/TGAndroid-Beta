package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class ef implements ToIntFunction {
    public final int f36514a;
    public final Object f36515b;

    public ef(Object obj, int i10) {
        this.f36514a = i10;
        this.f36515b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f36514a) {
            case 0:
                return ((Integer) ((HashMap) this.f36515b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f36515b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
