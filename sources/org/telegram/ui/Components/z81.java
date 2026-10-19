package org.telegram.ui.Components;

import android.text.TextPaint;
public final class z81 {
    public int f32888a;
    public CharSequence f32889b;
    public int f32890c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ei.x3.g(this.f32889b, textPaint));
        this.f32890c = ceil;
        return Math.max(0, ceil);
    }
}
