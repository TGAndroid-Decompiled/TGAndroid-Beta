package org.telegram.ui.Components;

import android.text.TextPaint;
public final class u81 {
    public int f28799a;
    public CharSequence f28800b;
    public int f28801c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.e4.g(this.f28800b, textPaint));
        this.f28801c = ceil;
        return Math.max(0, ceil);
    }
}
