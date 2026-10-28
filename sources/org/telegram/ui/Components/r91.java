package org.telegram.ui.Components;

import android.text.TextPaint;
public final class r91 {
    public int f32186a;
    public CharSequence f32187b;
    public int f32188c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(fi.v3.g(this.f32187b, textPaint));
        this.f32188c = ceil;
        return Math.max(0, ceil);
    }
}
