package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class ef implements ToIntFunction {
    public final int f37043a;
    public final Object f37044b;

    public ef(Object obj, int i10) {
        this.f37043a = i10;
        this.f37044b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        int i10 = this.f37043a;
        Object obj2 = this.f37044b;
        switch (i10) {
            case 0:
                return ((Integer) ((HashMap) obj2).get((View) obj)).intValue();
            default:
                RectF rectF = ProfileActivity.R6;
                return ((Integer) ((ArrayList) obj2).get(((Integer) obj).intValue())).intValue();
        }
    }
}
