package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class m7 implements zn0 {
    public final g8 f30583a;

    public m7(g8 g8Var) {
        this.f30583a = g8Var;
    }

    @Override
    public final void W(float f9, boolean z10) {
        if (z10) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f9);
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isMusic()) {
            this.f30583a.G0(playingMessageObject, false);
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        g8 g8Var = this.f30583a;
        sb2.append(LocaleController.formatPluralString("Minutes", g8Var.f28810z0 / 60, new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", g8Var.f28810z0 % 60, new Object[0]));
        String sb3 = sb2.toString();
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, LocaleController.formatPluralString("Minutes", g8Var.A0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", g8Var.A0 % 60, new Object[0]));
    }

    @Override
    public final int k0() {
        return 0;
    }

    @Override
    public final void v() {
    }
}
