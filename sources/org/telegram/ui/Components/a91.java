package org.telegram.ui.Components;

import android.text.TextPaint;
public final class a91 {
    public int f24555a;
    public CharSequence f24556b;
    public int f24557c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ei.x3.g(this.f24556b, textPaint));
        this.f24557c = ceil;
        return Math.max(0, ceil);
    }
}
