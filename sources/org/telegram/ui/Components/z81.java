package org.telegram.ui.Components;

import android.text.TextPaint;
public final class z81 {
    public int f32886a;
    public CharSequence f32887b;
    public int f32888c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ei.x3.g(this.f32887b, textPaint));
        this.f32888c = ceil;
        return Math.max(0, ceil);
    }
}
