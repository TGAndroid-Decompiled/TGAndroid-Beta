package org.telegram.ui.Components;

import android.text.TextPaint;
public final class c91 {
    public int f25276a;
    public CharSequence f25277b;
    public int f25278c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.e4.g(this.f25277b, textPaint));
        this.f25278c = ceil;
        return Math.max(0, ceil);
    }
}
