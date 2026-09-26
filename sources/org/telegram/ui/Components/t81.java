package org.telegram.ui.Components;

import android.text.TextPaint;
public final class t81 {
    public int f28507a;
    public CharSequence f28508b;
    public int f28509c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.e4.g(this.f28508b, textPaint));
        this.f28509c = ceil;
        return Math.max(0, ceil);
    }
}
