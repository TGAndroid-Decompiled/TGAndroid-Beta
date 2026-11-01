package org.telegram.ui.Components;

import android.text.TextPaint;
public final class t71 {
    public int f30548a;
    public CharSequence f30549b;
    public int f30550c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(vh.p2.g(this.f30549b, textPaint));
        this.f30550c = ceil;
        return Math.max(0, ceil);
    }
}
