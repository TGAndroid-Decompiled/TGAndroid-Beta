package org.telegram.ui.Components;

import android.text.TextPaint;
public final class q91 {
    public int f31862a;
    public CharSequence f31863b;
    public int f31864c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(fi.v3.g(this.f31863b, textPaint));
        this.f31864c = ceil;
        return Math.max(0, ceil);
    }
}
