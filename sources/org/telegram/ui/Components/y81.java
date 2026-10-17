package org.telegram.ui.Components;

import android.text.TextPaint;
public final class y81 {
    public int f32571a;
    public CharSequence f32572b;
    public int f32573c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ei.x3.g(this.f32572b, textPaint));
        this.f32573c = ceil;
        return Math.max(0, ceil);
    }
}
