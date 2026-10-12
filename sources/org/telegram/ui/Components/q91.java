package org.telegram.ui.Components;

import android.text.TextPaint;
public final class q91 {
    public int f29806a;
    public CharSequence f29807b;
    public int f29808c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.d4.g(this.f29807b, textPaint));
        this.f29808c = ceil;
        return Math.max(0, ceil);
    }
}
