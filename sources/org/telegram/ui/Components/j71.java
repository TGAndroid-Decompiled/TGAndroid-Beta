package org.telegram.ui.Components;

import android.text.TextPaint;
public final class j71 {
    public int f29664a;
    public CharSequence f29665b;
    public int f29666c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(kh.x3.g(this.f29665b, textPaint));
        this.f29666c = ceil;
        return Math.max(0, ceil);
    }
}
