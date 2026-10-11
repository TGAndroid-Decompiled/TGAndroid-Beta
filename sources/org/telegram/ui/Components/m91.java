package org.telegram.ui.Components;

import android.text.TextPaint;
public final class m91 {
    public int f28633a;
    public CharSequence f28634b;
    public int f28635c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.d4.g(this.f28634b, textPaint));
        this.f28635c = ceil;
        return Math.max(0, ceil);
    }
}
