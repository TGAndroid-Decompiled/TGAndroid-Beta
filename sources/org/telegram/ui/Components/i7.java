package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class i7 implements jo0 {
    public final c8 f27727a;

    public i7(c8 c8Var) {
        this.f27727a = c8Var;
    }

    @Override
    public final void X(float f10, boolean z4) {
        if (z4) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isMusic()) {
            this.f27727a.G0(playingMessageObject, false);
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb = new StringBuilder();
        c8 c8Var = this.f27727a;
        sb.append(LocaleController.formatPluralString("Minutes", c8Var.A0 / 60, new Object[0]));
        sb.append(' ');
        sb.append(LocaleController.formatPluralString("Seconds", c8Var.A0 % 60, new Object[0]));
        String sb2 = sb.toString();
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb2, LocaleController.formatPluralString("Minutes", c8Var.B0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", c8Var.B0 % 60, new Object[0]));
    }

    @Override
    public final int m0() {
        return 0;
    }

    @Override
    public final void A() {
    }
}
