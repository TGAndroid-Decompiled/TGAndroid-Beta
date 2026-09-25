package org.telegram.ui.Components;

import android.text.TextPaint;
public final class s81 {
    public int f28204a;
    public CharSequence f28205b;
    public int f28206c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.e4.g(this.f28205b, textPaint));
        this.f28206c = ceil;
        return Math.max(0, ceil);
    }
}
