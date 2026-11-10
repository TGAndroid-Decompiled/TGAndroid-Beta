package org.telegram.ui.Components;

import android.text.TextPaint;
public final class r61 {
    public int f37523a;
    public CharSequence f37524b;
    public int f37525c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(fi.m3.h(this.f37524b, textPaint));
        this.f37525c = ceil;
        return Math.max(0, ceil);
    }
}
