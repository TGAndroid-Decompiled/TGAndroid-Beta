package org.telegram.ui.Components;

import android.text.TextPaint;
public final class c91 {
    public int f25277a;
    public CharSequence f25278b;
    public int f25279c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.e4.g(this.f25278b, textPaint));
        this.f25279c = ceil;
        return Math.max(0, ceil);
    }
}
