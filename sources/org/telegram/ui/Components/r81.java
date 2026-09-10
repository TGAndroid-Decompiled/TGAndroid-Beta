package org.telegram.ui.Components;

import android.text.TextPaint;
public final class r81 {
    public int f26629a;
    public CharSequence f26630b;
    public int f26631c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(bi.x4.g(this.f26630b, textPaint));
        this.f26631c = ceil;
        return Math.max(0, ceil);
    }
}
