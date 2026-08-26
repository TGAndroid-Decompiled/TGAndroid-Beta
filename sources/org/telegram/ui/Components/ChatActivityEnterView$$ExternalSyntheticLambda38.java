package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class ChatActivityEnterView$$ExternalSyntheticLambda38 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final String f$2;
    public final Object f$3;
    public final boolean f$4;
    public final int f$5;
    public final int f$6;
    public final Object f$7;
    public final Long f$8;
    public final boolean f$9;

    public ChatActivityEnterView$$ExternalSyntheticLambda38(int i, int i2, Long l, Object obj, Object obj2, String str, MediaController.PhotoEntry photoEntry, ChatActivityEnterView.AnonymousClass79 anonymousClass79, boolean z, boolean z2) {
        this.f$0 = anonymousClass79;
        this.f$7 = obj;
        this.f$1 = photoEntry;
        this.f$4 = z;
        this.f$5 = i;
        this.f$6 = i2;
        this.f$9 = z2;
        this.f$8 = l;
        this.f$2 = str;
        this.f$3 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivityEnterView) this.f$0).lambda$onStickerSelected$98((TLRPC.Document) this.f$1, this.f$2, (MessageObject.SendAnimationData) this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9);
                break;
            default:
                ((ChatActivityEnterView.AnonymousClass79) this.f$0).lambda$onGifSelected$2(this.f$7, (MediaController.PhotoEntry) this.f$1, this.f$4, this.f$5, this.f$6, this.f$9, this.f$8, this.f$2, this.f$3);
                break;
        }
    }

    public ChatActivityEnterView$$ExternalSyntheticLambda38(int i, int i2, Long l, Object obj, String str, MessageObject.SendAnimationData sendAnimationData, TLRPC.Document document, ChatActivityEnterView chatActivityEnterView, boolean z, boolean z2) {
        this.f$0 = chatActivityEnterView;
        this.f$1 = document;
        this.f$2 = str;
        this.f$3 = sendAnimationData;
        this.f$4 = z;
        this.f$5 = i;
        this.f$6 = i2;
        this.f$7 = obj;
        this.f$8 = l;
        this.f$9 = z2;
    }
}
