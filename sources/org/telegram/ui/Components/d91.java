package org.telegram.ui.Components;

import android.text.TextPaint;
public final class d91 {
    public int f25731a;
    public CharSequence f25732b;
    public int f25733c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.e4.g(this.f25732b, textPaint));
        this.f25733c = ceil;
        return Math.max(0, ceil);
    }
}
