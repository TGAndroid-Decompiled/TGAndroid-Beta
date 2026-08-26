package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class ChatActivityEnterView$$ExternalSyntheticLambda88 implements Utilities.Callback {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final String f$2;
    public final Object f$3;
    public final boolean f$4;
    public final int f$5;
    public final int f$6;
    public final Object f$7;
    public final boolean f$8;

    public ChatActivityEnterView$$ExternalSyntheticLambda88(ChatActivityEnterView.AnonymousClass79 anonymousClass79, Object obj, MediaController.PhotoEntry photoEntry, boolean z, int i, int i2, boolean z2, String str, Object obj2) {
        this.f$0 = anonymousClass79;
        this.f$7 = obj;
        this.f$1 = photoEntry;
        this.f$4 = z;
        this.f$5 = i;
        this.f$6 = i2;
        this.f$8 = z2;
        this.f$2 = str;
        this.f$3 = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f$0;
                chatActivityEnterView.getClass();
                Object obj2 = this.f$7;
                ChatActivityEnterView$$ExternalSyntheticLambda103 chatActivityEnterView$$ExternalSyntheticLambda103 = new ChatActivityEnterView$$ExternalSyntheticLambda103(chatActivityEnterView, (TLRPC.Document) this.f$1, this.f$2, (MessageObject.SendAnimationData) this.f$3, this.f$4, this.f$5, this.f$6, obj2, (Long) obj, this.f$8);
                if (!chatActivityEnterView.showConfirmAlert(chatActivityEnterView$$ExternalSyntheticLambda103)) {
                    chatActivityEnterView$$ExternalSyntheticLambda103.run();
                }
                break;
            default:
                ChatActivityEnterView.AnonymousClass79 anonymousClass79 = (ChatActivityEnterView.AnonymousClass79) this.f$0;
                anonymousClass79.getClass();
                ChatActivityEnterView$$ExternalSyntheticLambda103 chatActivityEnterView$$ExternalSyntheticLambda104 = new ChatActivityEnterView$$ExternalSyntheticLambda103(anonymousClass79, this.f$7, (MediaController.PhotoEntry) this.f$1, this.f$4, this.f$5, this.f$6, this.f$8, (Long) obj, this.f$2, this.f$3);
                if (!ChatActivityEnterView.this.showConfirmAlert(chatActivityEnterView$$ExternalSyntheticLambda104)) {
                    chatActivityEnterView$$ExternalSyntheticLambda104.run();
                }
                break;
        }
    }

    public ChatActivityEnterView$$ExternalSyntheticLambda88(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z, int i, int i2, Object obj, boolean z2) {
        this.f$0 = chatActivityEnterView;
        this.f$1 = document;
        this.f$2 = str;
        this.f$3 = sendAnimationData;
        this.f$4 = z;
        this.f$5 = i;
        this.f$6 = i2;
        this.f$7 = obj;
        this.f$8 = z2;
    }
}
