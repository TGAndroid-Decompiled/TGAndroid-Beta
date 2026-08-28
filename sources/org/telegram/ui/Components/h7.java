package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class h7 implements on0 {
    public final c8 f28985a;

    public h7(c8 c8Var) {
        this.f28985a = c8Var;
    }

    @Override
    public final void Q(float f10, boolean z10) {
        if (z10) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isMusic()) {
            this.f28985a.F0(playingMessageObject, false);
        }
    }

    @Override
    public final int c0() {
        return 0;
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        c8 c8Var = this.f28985a;
        sb2.append(LocaleController.formatPluralString("Minutes", c8Var.f27412z0 / 60, new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", c8Var.f27412z0 % 60, new Object[0]));
        String sb3 = sb2.toString();
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, LocaleController.formatPluralString("Minutes", c8Var.A0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", c8Var.A0 % 60, new Object[0]));
    }

    @Override
    public final void n() {
    }
}
