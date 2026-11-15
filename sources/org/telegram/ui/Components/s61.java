package org.telegram.ui.Components;

import android.text.TextPaint;
public final class s61 {
    public int f39185a;
    public CharSequence f39186b;
    public int f39187c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(hi.l3.h(this.f39186b, textPaint));
        this.f39187c = ceil;
        return Math.max(0, ceil);
    }
}
