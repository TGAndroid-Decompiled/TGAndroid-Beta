package org.telegram.ui.Components;

import android.text.TextPaint;
public final class a91 {
    public int f24559a;
    public CharSequence f24560b;
    public int f24561c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ei.x3.g(this.f24560b, textPaint));
        this.f24561c = ceil;
        return Math.max(0, ceil);
    }
}
