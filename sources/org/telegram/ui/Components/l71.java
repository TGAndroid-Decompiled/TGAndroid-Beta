package org.telegram.ui.Components;

import android.text.TextPaint;

public final class l71 {

    public int f30318a;

    public CharSequence f30319b;

    public int f30320c;

    public final int a(TextPaint textPaint) {
        int iCeil = (int) Math.ceil(lh.w3.g(this.f30319b, textPaint));
        this.f30320c = iCeil;
        return Math.max(0, iCeil);
    }
}
