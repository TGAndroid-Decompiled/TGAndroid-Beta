package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class q7 implements lp0 {
    public final l8 f30044a;

    public q7(l8 l8Var) {
        this.f30044a = l8Var;
    }

    @Override
    public final void X(float f7, boolean z10) {
        if (z10) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f7);
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isMusic()) {
            this.f30044a.G0(playingMessageObject, false);
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        l8 l8Var = this.f30044a;
        sb2.append(LocaleController.formatPluralString("Minutes", l8Var.D0 / 60, new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", l8Var.D0 % 60, new Object[0]));
        String sb3 = sb2.toString();
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, LocaleController.formatPluralString("Minutes", l8Var.E0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", l8Var.E0 % 60, new Object[0]));
    }

    @Override
    public final int i0() {
        return 0;
    }

    @Override
    public final void z() {
    }
}
