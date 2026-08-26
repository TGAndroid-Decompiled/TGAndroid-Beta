package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;

public final class PollItemMenu$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final Object f$2;

    public PollItemMenu$$ExternalSyntheticLambda10(Object obj, long j, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((PollItemMenu) this.f$0).lambda$setCell$9(this.f$1, (BaseFragment) this.f$2);
                break;
            case 1:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$sendMessageFromQuickShare$2((ArrayList) this.f$2, this.f$1);
                break;
            case 2:
                ((ChatActivity) this.f$0).lambda$sendSecretMediaDelete$149(this.f$1, (MessageObject) this.f$2);
                break;
            case 3:
                ((ChatUsersActivity) this.f$0).lambda$createMenuForParticipant$14((TLRPC.User) this.f$2, this.f$1);
                break;
            case 4:
                ((DialogsActivity) this.f$0).lambda$didSelectResult$136(this.f$1, (DialogsActivity$$ExternalSyntheticLambda46) this.f$2);
                break;
            case 5:
                ((GroupCallActivity) this.f$0).lambda$new$17((TLRPC.Updates) this.f$2, this.f$1);
                break;
            case 6:
                ((LaunchActivity) this.f$0).lambda$processAttachedMenuBotFromShortcut$123(this.f$1, (LaunchActivity$$ExternalSyntheticLambda66) this.f$2);
                break;
            case 7:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$84((Long) this.f$2, this.f$1);
                break;
            case 8:
                LaunchActivity.lambda$runLinkRequest$83((ChatActivity) this.f$0, this.f$1, (TLRPC.Chat) this.f$2);
                break;
            default:
                ((LocationActivity) this.f$0).lambda$getRecentLocations$45((TLObject) this.f$2, this.f$1);
                break;
        }
    }

    public PollItemMenu$$ExternalSyntheticLambda10(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = j;
    }
}
