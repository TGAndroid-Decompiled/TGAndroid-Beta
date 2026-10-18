package org.telegram.ui.Components;

import android.text.TextPaint;
public final class y81 {
    public int f32578a;
    public CharSequence f32579b;
    public int f32580c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ei.x3.g(this.f32579b, textPaint));
        this.f32580c = ceil;
        return Math.max(0, ceil);
    }
}
