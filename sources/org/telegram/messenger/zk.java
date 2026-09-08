package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zk implements RequestDelegate {
    public final int f19889a;
    public final BaseController f19890b;
    public final long f19891c;
    public final Object d;

    public zk(BaseController baseController, long j3, Object obj, int i10) {
        this.f19889a = i10;
        this.f19890b = baseController;
        this.f19891c = j3;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19889a) {
            case 0:
                ((TranslateController) this.f19890b).lambda$pushPollToTranslate$26((TranslateController.PendingPollTranslation) this.d, this.f19891c, tLObject, tL_error);
                return;
            case 1:
                ((TranslateController) this.f19890b).lambda$pushRichMessageToTranslate$29((TranslateController.PendingRichTranslation) this.d, this.f19891c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f19890b).lambda$loadPinnedMessageInternal$165(this.f19891c, (TLRPC.TL_messages_getMessages) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f19890b).lambda$updateTimerProc$155(this.f19891c, (TLRPC.TL_messages_getMessagesViews) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f19890b).lambda$reloadMentionsCountForChannel$221((TLRPC.InputPeer) this.d, this.f19891c, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f19890b).lambda$getGroupCall$63(this.f19891c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f19890b).lambda$getSponsoredMessages$440(this.f19891c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f19890b).lambda$loadUnknownChannel$330(this.f19891c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f19890b).lambda$setChatReactions$471(this.f19891c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19890b).lambda$checkLastDialogMessage$227((TLRPC.Dialog) this.d, this.f19891c, tLObject, tL_error);
                return;
        }
    }

    public zk(BaseController baseController, Object obj, long j3, int i10) {
        this.f19889a = i10;
        this.f19890b = baseController;
        this.d = obj;
        this.f19891c = j3;
    }
}
