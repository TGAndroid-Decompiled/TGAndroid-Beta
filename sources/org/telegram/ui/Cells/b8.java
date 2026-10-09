package org.telegram.ui.Cells;

import org.telegram.messenger.Emoji;
public final class b8 extends org.telegram.ui.ActionBar.j5 {
    @Override
    public final boolean k(CharSequence charSequence) {
        return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
    }
}
