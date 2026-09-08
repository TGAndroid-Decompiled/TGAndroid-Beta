package org.telegram.ui.Components;

import android.text.TextPaint;
public final class e81 {
    public int f25629a;
    public CharSequence f25630b;
    public int f25631c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(di.f4.g(this.f25630b, textPaint));
        this.f25631c = ceil;
        return Math.max(0, ceil);
    }
}
