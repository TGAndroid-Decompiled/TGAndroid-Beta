package org.telegram.ui.Components;

import android.widget.TextView;
public final class v4 extends j80 {
    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(org.telegram.messenger.j6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
    }
}
