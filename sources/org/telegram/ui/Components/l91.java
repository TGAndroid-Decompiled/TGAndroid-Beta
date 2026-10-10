package org.telegram.ui.Components;

import android.text.TextPaint;
public final class l91 {
    public int f28275a;
    public CharSequence f28276b;
    public int f28277c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.d4.g(this.f28276b, textPaint));
        this.f28277c = ceil;
        return Math.max(0, ceil);
    }
}
