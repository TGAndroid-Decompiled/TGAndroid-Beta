package org.telegram.ui.Components;

import android.text.TextPaint;
public final class e81 {
    public int f23583a;
    public CharSequence f23584b;
    public int f23585c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.f4.g(this.f23584b, textPaint));
        this.f23585c = ceil;
        return Math.max(0, ceil);
    }
}
