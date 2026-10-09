package org.telegram.ui.Components;

import android.text.TextPaint;
public final class k91 {
    public int f27909a;
    public CharSequence f27910b;
    public int f27911c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.d4.g(this.f27910b, textPaint));
        this.f27911c = ceil;
        return Math.max(0, ceil);
    }
}
