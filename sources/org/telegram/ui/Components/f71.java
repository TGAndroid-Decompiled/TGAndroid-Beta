package org.telegram.ui.Components;

import android.text.TextPaint;
public final class f71 {
    public int f35083a;
    public CharSequence f35084b;
    public int f35085c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(hi.l3.h(this.f35084b, textPaint));
        this.f35085c = ceil;
        return Math.max(0, ceil);
    }
}
