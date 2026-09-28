package org.telegram.ui.Components;

import android.text.TextPaint;
public final class u81 {
    public int f28787a;
    public CharSequence f28788b;
    public int f28789c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.e4.g(this.f28788b, textPaint));
        this.f28789c = ceil;
        return Math.max(0, ceil);
    }
}
