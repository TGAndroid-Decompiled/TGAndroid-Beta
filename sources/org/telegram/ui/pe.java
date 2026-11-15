package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class pe implements ToIntFunction {
    public final int f50272a;
    public final Object f50273b;

    public pe(Object obj, int i7) {
        this.f50272a = i7;
        this.f50273b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        int i7 = this.f50272a;
        Object obj2 = this.f50273b;
        switch (i7) {
            case 0:
                return ((Integer) ((HashMap) obj2).get((View) obj)).intValue();
            default:
                RectF rectF = ProfileActivity.X6;
                return ((Integer) ((ArrayList) obj2).get(((Integer) obj).intValue())).intValue();
        }
    }
}
