package org.telegram.ui.Components;

import android.text.TextPaint;
public final class q91 {
    public int f29784a;
    public CharSequence f29785b;
    public int f29786c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.d4.g(this.f29785b, textPaint));
        this.f29786c = ceil;
        return Math.max(0, ceil);
    }
}
