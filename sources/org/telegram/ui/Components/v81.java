package org.telegram.ui.Components;

import android.text.TextPaint;
public final class v81 {
    public int f29031a;
    public CharSequence f29032b;
    public int f29033c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.f4.g(this.f29032b, textPaint));
        this.f29033c = ceil;
        return Math.max(0, ceil);
    }
}
