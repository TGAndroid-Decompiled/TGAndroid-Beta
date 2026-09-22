package org.telegram.ui.Components;

import android.text.TextPaint;
public final class e81 {
    public int f23580a;
    public CharSequence f23581b;
    public int f23582c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.f4.g(this.f23581b, textPaint));
        this.f23582c = ceil;
        return Math.max(0, ceil);
    }
}
