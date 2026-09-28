package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class ff implements ToIntFunction {
    public final int f33655a;
    public final Object f33656b;

    public ff(Object obj, int i10) {
        this.f33655a = i10;
        this.f33656b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f33655a) {
            case 0:
                return ((Integer) ((HashMap) this.f33656b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f33656b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
