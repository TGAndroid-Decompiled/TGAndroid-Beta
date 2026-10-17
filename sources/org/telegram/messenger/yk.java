package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yk implements Runnable {
    public final int f20187a;
    public final BaseController f20188b;
    public final Object f20189c;
    public final Object d;
    public final long e;
    public final Object f20190f;

    public yk(BaseController baseController, Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f20187a = i10;
        this.f20188b = baseController;
        this.f20190f = obj;
        this.e = j10;
        this.f20189c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f20187a) {
            case 0:
                ((TranslateController) this.f20188b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f20190f, (TLObject) this.f20189c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 1:
                ((TranslateController) this.f20188b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f20190f, (TLObject) this.f20189c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 2:
                ((MessagesController) this.f20188b).lambda$getSavedReactionTags$488((TLObject) this.f20189c, this.e, (TLRPC.messages_SavedReactionTags) this.f20190f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 3:
                ((MessagesController) this.f20188b).lambda$addUserToChat$305((TLRPC.Updates) this.f20190f, (Utilities.Callback) this.f20189c, (TLRPC.TL_messages_invitedUsers) this.d, this.e);
                return;
            case 4:
                ((MessagesController) this.f20188b).lambda$getSponsoredMessages$442((ArrayList) this.f20190f, this.e, (MessagesController.SponsoredMessagesInfo) this.f20189c, (Integer) this.d);
                return;
            case 5:
                ((SendMessagesHelper) this.f20188b).lambda$prepareImportHistory$113((ArrayList) this.f20190f, this.e, (Uri) this.f20189c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f20188b).lambda$prepareImportHistory$112((HashMap) this.f20190f, this.e, (SendMessagesHelper.ImportingHistory) this.f20189c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public yk(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j10, int i10) {
        this.f20187a = i10;
        this.f20188b = baseController;
        this.f20190f = obj;
        this.f20189c = obj2;
        this.d = tLObject;
        this.e = j10;
    }

    public yk(MessagesController messagesController, TLObject tLObject, long j10, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f20187a = 2;
        this.f20188b = messagesController;
        this.f20189c = tLObject;
        this.e = j10;
        this.f20190f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
