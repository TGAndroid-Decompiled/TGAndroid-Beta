package org.telegram.ui.Components;

import android.text.TextPaint;
public final class t81 {
    public int f28348a;
    public CharSequence f28349b;
    public int f28350c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.f4.g(this.f28349b, textPaint));
        this.f28350c = ceil;
        return Math.max(0, ceil);
    }
}
