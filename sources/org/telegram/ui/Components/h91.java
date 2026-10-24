package org.telegram.ui.Components;

import android.text.TextPaint;
public final class h91 {
    public int f26971a;
    public CharSequence f26972b;
    public int f26973c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ei.x3.g(this.f26972b, textPaint));
        this.f26973c = ceil;
        return Math.max(0, ceil);
    }
}
