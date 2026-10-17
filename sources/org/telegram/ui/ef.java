package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class ef implements ToIntFunction {
    public final int f36510a;
    public final Object f36511b;

    public ef(Object obj, int i10) {
        this.f36510a = i10;
        this.f36511b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f36510a) {
            case 0:
                return ((Integer) ((HashMap) this.f36511b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f36511b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
