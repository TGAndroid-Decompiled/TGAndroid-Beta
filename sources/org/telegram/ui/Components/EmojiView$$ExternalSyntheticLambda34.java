package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;

public final class EmojiView$$ExternalSyntheticLambda34 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;
    public final boolean f$2;

    public EmojiView$$ExternalSyntheticLambda34(Object obj, boolean z, boolean z2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = z2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((EmojiView) this.f$0).showStickerBanHint(false, this.f$1, this.f$2);
                break;
            case 1:
                ((VideoPlayerHolderBase) this.f$0).lambda$setAudioEnabled$8(this.f$1, this.f$2);
                break;
            case 2:
                ((NativeInstance) this.f$0).lambda$onNetworkStateUpdated$0(this.f$1, this.f$2);
                break;
            default:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$1((Utilities.Callback2) this.f$0, this.f$1, this.f$2);
                break;
        }
    }
}
