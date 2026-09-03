package org.telegram.ui.Components;

import android.text.TextPaint;
public final class h81 {
    public int f25336a;
    public CharSequence f25337b;
    public int f25338c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ph.f3.g(this.f25337b, textPaint));
        this.f25338c = ceil;
        return Math.max(0, ceil);
    }
}
