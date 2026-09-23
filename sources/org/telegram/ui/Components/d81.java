package org.telegram.ui.Components;

import android.text.TextPaint;
public final class d81 {
    public int f23322a;
    public CharSequence f23323b;
    public int f23324c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.e4.g(this.f23323b, textPaint));
        this.f23324c = ceil;
        return Math.max(0, ceil);
    }
}
