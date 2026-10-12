package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class r7 implements fp0 {
    public final m8 f28772a;

    public r7(m8 m8Var) {
        this.f28772a = m8Var;
    }

    @Override
    public final void X(float f7, boolean z10) {
        if (z10) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f7);
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isMusic()) {
            this.f28772a.G0(playingMessageObject, false);
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        m8 m8Var = this.f28772a;
        sb2.append(LocaleController.formatPluralString("Minutes", m8Var.D0 / 60, new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", m8Var.D0 % 60, new Object[0]));
        String sb3 = sb2.toString();
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, LocaleController.formatPluralString("Minutes", m8Var.E0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", m8Var.E0 % 60, new Object[0]));
    }

    @Override
    public final int k0() {
        return 0;
    }

    @Override
    public final void z() {
    }
}
