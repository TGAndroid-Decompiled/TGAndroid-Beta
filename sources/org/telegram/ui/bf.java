package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class bf implements ToIntFunction {
    public final int f38022a;
    public final Object f38023b;

    public bf(Object obj, int i10) {
        this.f38022a = i10;
        this.f38023b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        int i10 = this.f38022a;
        Object obj2 = this.f38023b;
        switch (i10) {
            case 0:
                return ((Integer) ((HashMap) obj2).get((View) obj)).intValue();
            default:
                int i11 = ProfileActivity.R6;
                return ((Integer) ((ArrayList) obj2).get(((Integer) obj).intValue())).intValue();
        }
    }
}
