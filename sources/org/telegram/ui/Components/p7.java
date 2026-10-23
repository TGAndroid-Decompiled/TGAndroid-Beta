package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class p7 implements cp0 {
    public final k8 f29254a;

    public p7(k8 k8Var) {
        this.f29254a = k8Var;
    }

    @Override
    public final void L(float f7, boolean z10) {
        if (z10) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f7);
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isMusic()) {
            this.f29254a.G0(playingMessageObject, false);
        }
    }

    @Override
    public final int Y() {
        return 0;
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        k8 k8Var = this.f29254a;
        sb2.append(LocaleController.formatPluralString("Minutes", k8Var.D0 / 60, new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", k8Var.D0 % 60, new Object[0]));
        String sb3 = sb2.toString();
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, LocaleController.formatPluralString("Minutes", k8Var.E0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", k8Var.E0 % 60, new Object[0]));
    }

    @Override
    public final void v() {
    }
}
