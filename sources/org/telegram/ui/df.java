package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class df implements ToIntFunction {
    public final int f36593a;
    public final Object f36594b;

    public df(Object obj, int i10) {
        this.f36593a = i10;
        this.f36594b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        int i10 = this.f36593a;
        Object obj2 = this.f36594b;
        switch (i10) {
            case 0:
                return ((Integer) ((HashMap) obj2).get((View) obj)).intValue();
            default:
                RectF rectF = ProfileActivity.S6;
                return ((Integer) ((ArrayList) obj2).get(((Integer) obj).intValue())).intValue();
        }
    }
}
