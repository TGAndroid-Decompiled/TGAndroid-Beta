package org.telegram.ui.Components;

import android.text.TextPaint;
public final class l61 {
    public int f35530a;
    public CharSequence f35531b;
    public int f35532c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(fi.m3.h(this.f35531b, textPaint));
        this.f35532c = ceil;
        return Math.max(0, ceil);
    }
}
