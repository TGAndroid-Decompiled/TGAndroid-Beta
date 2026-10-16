package org.telegram.ui.Components;

import android.text.TextPaint;
public final class h91 {
    public int f25223a;
    public CharSequence f25224b;
    public int f25225c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(di.d4.g(this.f25224b, textPaint));
        this.f25225c = ceil;
        return Math.max(0, ceil);
    }
}
