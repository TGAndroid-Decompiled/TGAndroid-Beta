package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class n7 implements ro0 {
    public final i8 f26601a;

    public n7(i8 i8Var) {
        this.f26601a = i8Var;
    }

    @Override
    public final void X(float f7, boolean z10) {
        if (z10) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f7);
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isMusic()) {
            this.f26601a.G0(playingMessageObject, false);
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        i8 i8Var = this.f26601a;
        sb2.append(LocaleController.formatPluralString("Minutes", i8Var.D0 / 60, new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", i8Var.D0 % 60, new Object[0]));
        String sb3 = sb2.toString();
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, LocaleController.formatPluralString("Minutes", i8Var.E0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", i8Var.E0 % 60, new Object[0]));
    }

    @Override
    public final int l0() {
        return 0;
    }

    @Override
    public final void B() {
    }
}
