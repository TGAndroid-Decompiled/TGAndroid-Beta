package org.telegram.ui.Components;

import android.text.TextPaint;
public final class r61 {
    public int f37511a;
    public CharSequence f37512b;
    public int f37513c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(fi.m3.h(this.f37512b, textPaint));
        this.f37513c = ceil;
        return Math.max(0, ceil);
    }
}
