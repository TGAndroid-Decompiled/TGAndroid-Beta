package org.telegram.ui.Components;

import android.text.TextPaint;
public final class s71 {
    public int f30173a;
    public CharSequence f30174b;
    public int f30175c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(vh.p2.g(this.f30174b, textPaint));
        this.f30175c = ceil;
        return Math.max(0, ceil);
    }
}
