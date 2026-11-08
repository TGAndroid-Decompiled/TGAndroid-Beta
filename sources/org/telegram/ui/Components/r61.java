package org.telegram.ui.Components;

import android.text.TextPaint;
public final class r61 {
    public int f37532a;
    public CharSequence f37533b;
    public int f37534c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(fi.m3.h(this.f37533b, textPaint));
        this.f37534c = ceil;
        return Math.max(0, ceil);
    }
}
