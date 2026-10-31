package org.telegram.ui.Components;

import android.widget.TextView;
public final class j3 extends TextView {
    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(org.telegram.messenger.k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
    }
}
