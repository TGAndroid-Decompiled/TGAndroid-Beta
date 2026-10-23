package org.telegram.ui.Components;

import android.text.TextPaint;
public final class h91 {
    public int f26867a;
    public CharSequence f26868b;
    public int f26869c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ei.x3.g(this.f26868b, textPaint));
        this.f26869c = ceil;
        return Math.max(0, ceil);
    }
}
