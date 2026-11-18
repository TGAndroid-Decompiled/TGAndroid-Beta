package org.telegram.ui.Components;

import android.text.TextPaint;
public final class c71 {
    public int f33908a;
    public CharSequence f33909b;
    public int f33910c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(hi.m3.h(this.f33909b, textPaint));
        this.f33910c = ceil;
        return Math.max(0, ceil);
    }
}
