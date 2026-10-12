package org.telegram.ui.Components;

import android.text.TextPaint;
public final class g91 {
    public int f25238a;
    public CharSequence f25239b;
    public int f25240c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(di.d4.g(this.f25239b, textPaint));
        this.f25240c = ceil;
        return Math.max(0, ceil);
    }
}
