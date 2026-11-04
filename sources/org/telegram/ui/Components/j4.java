package org.telegram.ui.Components;

import android.widget.TextView;
public final class j4 extends s70 {
    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
    }
}
