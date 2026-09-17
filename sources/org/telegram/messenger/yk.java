package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yk implements RequestDelegate {
    public final int f19779a;
    public final BaseController f19780b;
    public final long f19781c;
    public final Object d;

    public yk(BaseController baseController, long j3, Object obj, int i10) {
        this.f19779a = i10;
        this.f19780b = baseController;
        this.f19781c = j3;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19779a) {
            case 0:
                ((TranslateController) this.f19780b).lambda$pushPollToTranslate$26((TranslateController.PendingPollTranslation) this.d, this.f19781c, tLObject, tL_error);
                return;
            case 1:
                ((TranslateController) this.f19780b).lambda$pushRichMessageToTranslate$29((TranslateController.PendingRichTranslation) this.d, this.f19781c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f19780b).lambda$loadPinnedMessageInternal$165(this.f19781c, (TLRPC.TL_messages_getMessages) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f19780b).lambda$updateTimerProc$155(this.f19781c, (TLRPC.TL_messages_getMessagesViews) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f19780b).lambda$reloadMentionsCountForChannel$221((TLRPC.InputPeer) this.d, this.f19781c, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f19780b).lambda$getGroupCall$63(this.f19781c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f19780b).lambda$getSponsoredMessages$440(this.f19781c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f19780b).lambda$loadUnknownChannel$330(this.f19781c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f19780b).lambda$setChatReactions$471(this.f19781c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19780b).lambda$checkLastDialogMessage$227((TLRPC.Dialog) this.d, this.f19781c, tLObject, tL_error);
                return;
        }
    }

    public yk(BaseController baseController, Object obj, long j3, int i10) {
        this.f19779a = i10;
        this.f19780b = baseController;
        this.d = obj;
        this.f19781c = j3;
    }
}
