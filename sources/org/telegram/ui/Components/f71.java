package org.telegram.ui.Components;

import android.text.TextPaint;
public final class f71 {
    public int f35108a;
    public CharSequence f35109b;
    public int f35110c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(hi.l3.h(this.f35109b, textPaint));
        this.f35110c = ceil;
        return Math.max(0, ceil);
    }
}
