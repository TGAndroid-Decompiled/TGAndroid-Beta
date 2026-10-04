package org.telegram.ui.Components;

import android.text.TextPaint;
public final class c91 {
    public int f25282a;
    public CharSequence f25283b;
    public int f25284c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.e4.g(this.f25283b, textPaint));
        this.f25284c = ceil;
        return Math.max(0, ceil);
    }
}
