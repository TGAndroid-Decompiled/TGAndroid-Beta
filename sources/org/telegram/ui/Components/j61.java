package org.telegram.ui.Components;

import android.text.TextPaint;
public final class j61 {
    public int f34971a;
    public CharSequence f34972b;
    public int f34973c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(gi.l3.h(this.f34972b, textPaint));
        this.f34973c = ceil;
        return Math.max(0, ceil);
    }
}
