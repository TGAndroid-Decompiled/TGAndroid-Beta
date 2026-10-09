package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zk implements RequestDelegate {
    public final int f20031a;
    public final BaseController f20032b;
    public final long f20033c;
    public final Object d;

    public zk(BaseController baseController, long j3, Object obj, int i10) {
        this.f20031a = i10;
        this.f20032b = baseController;
        this.f20033c = j3;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20031a) {
            case 0:
                ((TranslateController) this.f20032b).lambda$pushPollToTranslate$26((TranslateController.PendingPollTranslation) this.d, this.f20033c, tLObject, tL_error);
                return;
            case 1:
                ((TranslateController) this.f20032b).lambda$pushRichMessageToTranslate$29((TranslateController.PendingRichTranslation) this.d, this.f20033c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f20032b).lambda$loadPinnedMessageInternal$165(this.f20033c, (TLRPC.TL_messages_getMessages) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f20032b).lambda$updateTimerProc$154(this.f20033c, (TLRPC.TL_messages_getMessagesViews) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f20032b).lambda$reloadMentionsCountForChannel$220((TLRPC.InputPeer) this.d, this.f20033c, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f20032b).lambda$getGroupCall$62(this.f20033c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f20032b).lambda$getSponsoredMessages$443(this.f20033c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f20032b).lambda$loadUnknownChannel$329(this.f20033c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f20032b).lambda$setChatReactions$474(this.f20033c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f20032b).lambda$checkLastDialogMessage$226((TLRPC.Dialog) this.d, this.f20033c, tLObject, tL_error);
                return;
        }
    }

    public zk(BaseController baseController, Object obj, long j3, int i10) {
        this.f20031a = i10;
        this.f20032b = baseController;
        this.d = obj;
        this.f20033c = j3;
    }
}
