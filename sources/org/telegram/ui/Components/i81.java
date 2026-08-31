package org.telegram.ui.Components;

import android.text.TextPaint;
public final class i81 {
    public int f27698a;
    public CharSequence f27699b;
    public int f27700c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(qh.f3.g(this.f27699b, textPaint));
        this.f27700c = ceil;
        return Math.max(0, ceil);
    }
}
