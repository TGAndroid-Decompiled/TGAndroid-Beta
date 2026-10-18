package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class ef implements ToIntFunction {
    public final int f36477a;
    public final Object f36478b;

    public ef(Object obj, int i10) {
        this.f36477a = i10;
        this.f36478b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f36477a) {
            case 0:
                return ((Integer) ((HashMap) this.f36478b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f36478b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
