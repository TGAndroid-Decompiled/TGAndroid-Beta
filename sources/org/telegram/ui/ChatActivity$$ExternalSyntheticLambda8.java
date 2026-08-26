package org.telegram.ui;

import org.telegram.ui.Components.ScrimOptions;

public final class ChatActivity$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final ScrimOptions f$0;

    public ChatActivity$$ExternalSyntheticLambda8(ScrimOptions scrimOptions, int i) {
        this.$r8$classId = i;
        this.f$0 = scrimOptions;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.dismissFast();
                break;
            default:
                this.f$0.dismiss();
                break;
        }
    }
}
