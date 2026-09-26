package org.telegram.ui.Components;

import android.text.TextPaint;
public final class s81 {
    public int f28203a;
    public CharSequence f28204b;
    public int f28205c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.e4.g(this.f28204b, textPaint));
        this.f28205c = ceil;
        return Math.max(0, ceil);
    }
}
