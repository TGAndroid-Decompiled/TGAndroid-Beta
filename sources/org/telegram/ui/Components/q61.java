package org.telegram.ui.Components;

import android.text.TextPaint;
public final class q61 {
    public int f37165a;
    public CharSequence f37166b;
    public int f37167c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(fi.m3.h(this.f37166b, textPaint));
        this.f37167c = ceil;
        return Math.max(0, ceil);
    }
}
