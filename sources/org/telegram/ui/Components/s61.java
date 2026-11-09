package org.telegram.ui.Components;

import android.text.TextPaint;
public final class s61 {
    public int f37938a;
    public CharSequence f37939b;
    public int f37940c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(fi.m3.h(this.f37939b, textPaint));
        this.f37940c = ceil;
        return Math.max(0, ceil);
    }
}
