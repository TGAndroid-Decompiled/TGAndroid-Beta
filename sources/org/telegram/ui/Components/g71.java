package org.telegram.ui.Components;

import android.text.TextPaint;
public final class g71 {
    public int f35349a;
    public CharSequence f35350b;
    public int f35351c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(hi.u3.h(this.f35350b, textPaint));
        this.f35351c = ceil;
        return Math.max(0, ceil);
    }
}
