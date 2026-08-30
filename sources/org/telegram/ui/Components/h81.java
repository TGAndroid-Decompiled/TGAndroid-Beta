package org.telegram.ui.Components;

import android.text.TextPaint;
public final class h81 {
    public int f25354a;
    public CharSequence f25355b;
    public int f25356c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ph.f3.g(this.f25355b, textPaint));
        this.f25356c = ceil;
        return Math.max(0, ceil);
    }
}
