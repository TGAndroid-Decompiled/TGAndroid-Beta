package org.telegram.ui.Components;

import android.text.TextPaint;
public final class e81 {
    public int f25602a;
    public CharSequence f25603b;
    public int f25604c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(di.f4.g(this.f25603b, textPaint));
        this.f25604c = ceil;
        return Math.max(0, ceil);
    }
}
