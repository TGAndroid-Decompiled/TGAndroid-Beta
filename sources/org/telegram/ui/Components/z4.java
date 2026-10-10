package org.telegram.ui.Components;

import android.widget.TextView;
import org.telegram.messenger.Emoji;
public final class z4 extends fa0 {
    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
    }
}
