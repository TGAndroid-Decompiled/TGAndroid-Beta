package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.webrtc.TextureViewRenderer;

public final class ChatActivity$$ExternalSyntheticLambda167 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final int f$2;
    public final int f$3;
    public final int f$4;

    public ChatActivity$$ExternalSyntheticLambda167(Object obj, int i, int i2, int i3, int i4, int i5) {
        this.$r8$classId = i5;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = i3;
        this.f$4 = i4;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$checkScrollForLoad$131(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            case 1:
                ((MessagesStorage) this.f$0).lambda$saveDiffParams$35(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            default:
                ((TextureViewRenderer) this.f$0).lambda$onFrameResolutionChanged$0(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
        }
    }
}
