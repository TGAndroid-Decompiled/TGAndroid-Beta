package org.telegram.ui.Components;

import android.text.TextPaint;
public final class h81 {
    public int f27413a;
    public CharSequence f27414b;
    public int f27415c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(qh.e3.g(this.f27414b, textPaint));
        this.f27415c = ceil;
        return Math.max(0, ceil);
    }
}
