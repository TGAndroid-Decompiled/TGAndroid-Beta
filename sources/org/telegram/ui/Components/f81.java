package org.telegram.ui.Components;

import android.text.TextPaint;
public final class f81 {
    public int f23824a;
    public CharSequence f23825b;
    public int f23826c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.f4.g(this.f23825b, textPaint));
        this.f23826c = ceil;
        return Math.max(0, ceil);
    }
}
