package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

public final class h7 implements pn0 {

    public final b8 f28936a;

    public h7(b8 b8Var) {
        this.f28936a = b8Var;
    }

    @Override
    public final void P(float f10, boolean z10) {
        if (z10) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || !playingMessageObject.isMusic()) {
            return;
        }
        this.f28936a.G0(playingMessageObject, false);
    }

    @Override
    public final int a0() {
        return 0;
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        b8 b8Var = this.f28936a;
        sb2.append(LocaleController.formatPluralString("Minutes", b8Var.f27044z0 / 60, new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", b8Var.f27044z0 % 60, new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb2.toString(), LocaleController.formatPluralString("Minutes", b8Var.A0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", b8Var.A0 % 60, new Object[0]));
    }

    @Override
    public final void r() {
    }
}
