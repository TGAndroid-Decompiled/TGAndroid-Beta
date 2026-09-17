package org.telegram.ui.Components;

import android.text.TextPaint;
public final class e81 {
    public int f25603a;
    public CharSequence f25604b;
    public int f25605c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(di.f4.g(this.f25604b, textPaint));
        this.f25605c = ceil;
        return Math.max(0, ceil);
    }
}
