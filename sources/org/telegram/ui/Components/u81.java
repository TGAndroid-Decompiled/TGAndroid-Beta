package org.telegram.ui.Components;

import android.text.TextPaint;
public final class u81 {
    public int f28847a;
    public CharSequence f28848b;
    public int f28849c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.e4.g(this.f28848b, textPaint));
        this.f28849c = ceil;
        return Math.max(0, ceil);
    }
}
