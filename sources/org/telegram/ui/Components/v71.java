package org.telegram.ui.Components;

import android.text.TextPaint;
public final class v71 {
    public int f33488a;
    public CharSequence f33489b;
    public int f33490c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(nh.t3.g(this.f33489b, textPaint));
        this.f33490c = ceil;
        return Math.max(0, ceil);
    }
}
