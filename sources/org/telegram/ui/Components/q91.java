package org.telegram.ui.Components;

import android.text.TextPaint;
public final class q91 {
    public int f31864a;
    public CharSequence f31865b;
    public int f31866c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(fi.v3.g(this.f31865b, textPaint));
        this.f31866c = ceil;
        return Math.max(0, ceil);
    }
}
