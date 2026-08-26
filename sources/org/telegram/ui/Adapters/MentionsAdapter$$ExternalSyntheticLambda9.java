package org.telegram.ui.Adapters;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MentionsAdapter$$ExternalSyntheticLambda9 implements RequestDelegate {
    public final int $r8$classId = 1;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final Serializable f$1;
    public final boolean f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final Serializable f$6;

    public MentionsAdapter$$ExternalSyntheticLambda9(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z) {
        this.f$0 = sendMessagesHelper;
        this.f$1 = arrayList;
        this.f$4 = tLObject;
        this.f$6 = arrayList2;
        this.f$3 = arrayList3;
        this.f$5 = delayedMessage;
        this.f$2 = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                MentionsAdapter mentionsAdapter = (MentionsAdapter) this.f$0;
                mentionsAdapter.getClass();
                AndroidUtilities.runOnUIThread(new MentionsAdapter$$ExternalSyntheticLambda10(mentionsAdapter, (String) this.f$1, this.f$2, tLObject, (TLRPC.User) this.f$3, (String) this.f$4, (MessagesStorage) this.f$5, (String) this.f$6));
                break;
            default:
                ((SendMessagesHelper) this.f$0).lambda$performSendMessageRequestMulti$74((ArrayList) this.f$1, (TLObject) this.f$4, (ArrayList) this.f$6, (ArrayList) this.f$3, (SendMessagesHelper.DelayedMessage) this.f$5, this.f$2, tLObject, tL_error);
                break;
        }
    }

    public MentionsAdapter$$ExternalSyntheticLambda9(MentionsAdapter mentionsAdapter, String str, boolean z, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f$0 = mentionsAdapter;
        this.f$1 = str;
        this.f$2 = z;
        this.f$3 = user;
        this.f$4 = str2;
        this.f$5 = messagesStorage;
        this.f$6 = str3;
    }
}
