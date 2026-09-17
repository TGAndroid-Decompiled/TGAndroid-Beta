package org.telegram.ui.Components;

import android.text.TextPaint;
public final class f81 {
    public int f23821a;
    public CharSequence f23822b;
    public int f23823c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.f4.g(this.f23822b, textPaint));
        this.f23823c = ceil;
        return Math.max(0, ceil);
    }
}
