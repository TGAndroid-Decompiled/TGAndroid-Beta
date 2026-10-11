package org.telegram.ui.Components;

import android.text.TextPaint;
public final class l91 {
    public int f28314a;
    public CharSequence f28315b;
    public int f28316c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.d4.g(this.f28315b, textPaint));
        this.f28316c = ceil;
        return Math.max(0, ceil);
    }
}
