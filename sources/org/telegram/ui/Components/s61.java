package org.telegram.ui.Components;

import android.text.TextPaint;
public final class s61 {
    public int f39188a;
    public CharSequence f39189b;
    public int f39190c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(hi.l3.h(this.f39189b, textPaint));
        this.f39190c = ceil;
        return Math.max(0, ceil);
    }
}
