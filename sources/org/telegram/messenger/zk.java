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
public final class zk implements Runnable {
    public final int f20264a;
    public final BaseController f20265b;
    public final Object f20266c;
    public final Object d;
    public final long e;
    public final Object f20267f;

    public zk(BaseController baseController, Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f20264a = i10;
        this.f20265b = baseController;
        this.f20267f = obj;
        this.e = j10;
        this.f20266c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f20264a) {
            case 0:
                ((TranslateController) this.f20265b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f20267f, (TLObject) this.f20266c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 1:
                ((TranslateController) this.f20265b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f20267f, (TLObject) this.f20266c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 2:
                ((MessagesController) this.f20265b).lambda$getSavedReactionTags$488((TLObject) this.f20266c, this.e, (TLRPC.messages_SavedReactionTags) this.f20267f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 3:
                ((MessagesController) this.f20265b).lambda$addUserToChat$305((TLRPC.Updates) this.f20267f, (Utilities.Callback) this.f20266c, (TLRPC.TL_messages_invitedUsers) this.d, this.e);
                return;
            case 4:
                ((MessagesController) this.f20265b).lambda$getSponsoredMessages$442((ArrayList) this.f20267f, this.e, (MessagesController.SponsoredMessagesInfo) this.f20266c, (Integer) this.d);
                return;
            case 5:
                ((SendMessagesHelper) this.f20265b).lambda$prepareImportHistory$113((ArrayList) this.f20267f, this.e, (Uri) this.f20266c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f20265b).lambda$prepareImportHistory$112((HashMap) this.f20267f, this.e, (SendMessagesHelper.ImportingHistory) this.f20266c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public zk(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j10, int i10) {
        this.f20264a = i10;
        this.f20265b = baseController;
        this.f20267f = obj;
        this.f20266c = obj2;
        this.d = tLObject;
        this.e = j10;
    }

    public zk(MessagesController messagesController, TLObject tLObject, long j10, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f20264a = 2;
        this.f20265b = messagesController;
        this.f20266c = tLObject;
        this.e = j10;
        this.f20267f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
