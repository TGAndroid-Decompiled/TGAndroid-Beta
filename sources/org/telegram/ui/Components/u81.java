package org.telegram.ui.Components;

import android.text.TextPaint;
public final class u81 {
    public int f28786a;
    public CharSequence f28787b;
    public int f28788c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.e4.g(this.f28787b, textPaint));
        this.f28788c = ceil;
        return Math.max(0, ceil);
    }
}
