package org.telegram.ui.Components;

import android.text.TextPaint;
public final class f71 {
    public int f35106a;
    public CharSequence f35107b;
    public int f35108c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(hi.l3.h(this.f35107b, textPaint));
        this.f35108c = ceil;
        return Math.max(0, ceil);
    }
}
