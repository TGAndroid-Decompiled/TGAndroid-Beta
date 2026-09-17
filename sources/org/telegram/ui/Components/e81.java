package org.telegram.ui.Components;

import android.text.TextPaint;
public final class e81 {
    public int f25630a;
    public CharSequence f25631b;
    public int f25632c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(di.f4.g(this.f25631b, textPaint));
        this.f25632c = ceil;
        return Math.max(0, ceil);
    }
}
