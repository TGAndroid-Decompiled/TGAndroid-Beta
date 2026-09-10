package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class z9 implements Comparator {
    public final int f17139a;
    public final MessagesController f17140b;

    public z9(MessagesController messagesController, int i10) {
        this.f17139a = i10;
        this.f17140b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$new$9;
        int lambda$new$10;
        int lambda$new$11;
        int lambda$new$12;
        int lambda$processUpdatesQueue$327;
        int lambda$renameSavedReactionTag$484;
        int lambda$updateSavedReactionTags$483;
        switch (this.f17139a) {
            case 0:
                lambda$new$9 = this.f17140b.lambda$new$9((TLRPC.Dialog) obj, (TLRPC.Dialog) obj2);
                return lambda$new$9;
            case 1:
                lambda$new$10 = this.f17140b.lambda$new$10((TLRPC.Dialog) obj, (TLRPC.Dialog) obj2);
                return lambda$new$10;
            case 2:
                lambda$new$11 = this.f17140b.lambda$new$11((MessagesController.CommunityPeerDialog) obj, (MessagesController.CommunityPeerDialog) obj2);
                return lambda$new$11;
            case 3:
                lambda$new$12 = this.f17140b.lambda$new$12((TLRPC.Update) obj, (TLRPC.Update) obj2);
                return lambda$new$12;
            case 4:
                lambda$processUpdatesQueue$327 = this.f17140b.lambda$processUpdatesQueue$327((TLRPC.Updates) obj, (TLRPC.Updates) obj2);
                return lambda$processUpdatesQueue$327;
            case 5:
                lambda$renameSavedReactionTag$484 = this.f17140b.lambda$renameSavedReactionTag$484((TLRPC.TL_savedReactionTag) obj, (TLRPC.TL_savedReactionTag) obj2);
                return lambda$renameSavedReactionTag$484;
            default:
                lambda$updateSavedReactionTags$483 = this.f17140b.lambda$updateSavedReactionTags$483((TLRPC.TL_savedReactionTag) obj, (TLRPC.TL_savedReactionTag) obj2);
                return lambda$updateSavedReactionTags$483;
        }
    }
}
