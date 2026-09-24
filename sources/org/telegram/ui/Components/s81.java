package org.telegram.ui.Components;

import android.text.TextPaint;
public final class s81 {
    public int f28196a;
    public CharSequence f28197b;
    public int f28198c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.e4.g(this.f28197b, textPaint));
        this.f28198c = ceil;
        return Math.max(0, ceil);
    }
}
