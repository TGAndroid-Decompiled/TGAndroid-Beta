package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

public final class AudioPlayerAlert$$ExternalSyntheticLambda50 implements Runnable {
    public final int $r8$classId;
    public final AudioPlayerAlert f$0;
    public final TLRPC.TL_error f$1;

    public AudioPlayerAlert$$ExternalSyntheticLambda50(AudioPlayerAlert audioPlayerAlert, TLRPC.TL_error tL_error, int i) {
        this.$r8$classId = i;
        this.f$0 = audioPlayerAlert;
        this.f$1 = tL_error;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$saveToProfile$22(this.f$1);
                break;
            case 1:
                this.f$0.lambda$saveToProfile$29(this.f$1);
                break;
            case 2:
                this.f$0.lambda$saveToProfile$27(this.f$1);
                break;
            default:
                this.f$0.lambda$saveToProfile$24(this.f$1);
                break;
        }
    }
}
