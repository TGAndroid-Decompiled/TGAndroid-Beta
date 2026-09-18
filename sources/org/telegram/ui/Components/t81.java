package org.telegram.ui.Components;

import android.text.TextPaint;
public final class t81 {
    public int f28354a;
    public CharSequence f28355b;
    public int f28356c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.f4.g(this.f28355b, textPaint));
        this.f28356c = ceil;
        return Math.max(0, ceil);
    }
}
