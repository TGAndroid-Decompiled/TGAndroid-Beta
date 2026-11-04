package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class oe implements ToIntFunction {
    public final int f48276a;
    public final Object f48277b;

    public oe(Object obj, int i3) {
        this.f48276a = i3;
        this.f48277b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        int i3 = this.f48276a;
        Object obj2 = this.f48277b;
        switch (i3) {
            case 0:
                return ((Integer) ((HashMap) obj2).get((View) obj)).intValue();
            default:
                RectF rectF = ProfileActivity.T6;
                return ((Integer) ((ArrayList) obj2).get(((Integer) obj).intValue())).intValue();
        }
    }
}
