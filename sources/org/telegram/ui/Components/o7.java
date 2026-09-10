package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class o7 implements no0 {
    public final j8 f25686a;

    public o7(j8 j8Var) {
        this.f25686a = j8Var;
    }

    @Override
    public final void W(float f7, boolean z10) {
        if (z10) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f7);
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isMusic()) {
            this.f25686a.G0(playingMessageObject, false);
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        j8 j8Var = this.f25686a;
        sb2.append(LocaleController.formatPluralString("Minutes", j8Var.D0 / 60, new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", j8Var.D0 % 60, new Object[0]));
        String sb3 = sb2.toString();
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, LocaleController.formatPluralString("Minutes", j8Var.E0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", j8Var.E0 % 60, new Object[0]));
    }

    @Override
    public final int k0() {
        return 0;
    }

    @Override
    public final void y() {
    }
}
