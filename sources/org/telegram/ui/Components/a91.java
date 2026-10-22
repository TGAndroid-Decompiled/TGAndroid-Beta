package org.telegram.ui.Components;

import android.text.TextPaint;
public final class a91 {
    public int f24558a;
    public CharSequence f24559b;
    public int f24560c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ei.x3.g(this.f24559b, textPaint));
        this.f24560c = ceil;
        return Math.max(0, ceil);
    }
}
