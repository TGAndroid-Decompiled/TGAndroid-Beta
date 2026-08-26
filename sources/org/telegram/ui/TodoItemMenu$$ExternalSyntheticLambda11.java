package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class TodoItemMenu$$ExternalSyntheticLambda11 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public TodoItemMenu$$ExternalSyntheticLambda11(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((TodoItemMenu) this.f$0).lambda$setCell$3((ChatActivity) this.f$1, (TLRPC.TodoItem) this.f$2);
                break;
            case 1:
                ((SecretMediaViewer) this.f$0).lambda$openMedia$4((Runnable) this.f$1, (MessageObject) this.f$2);
                break;
            case 2:
                ((ThemeSetUrlActivity) this.f$0).lambda$saveTheme$11((TLRPC.TL_error) this.f$1, (TL_account.updateTheme) this.f$2);
                break;
            case 3:
                ((ThemeSetUrlActivity) this.f$0).lambda$checkUrl$6((String) this.f$1, (TLRPC.TL_error) this.f$2);
                break;
            case 4:
                ((TooManyCommunitiesActivity) this.f$0).lambda$loadInactiveChannels$4((ArrayList) this.f$1, (TLRPC.TL_messages_inactiveChats) this.f$2);
                break;
            case 5:
                ((TopicsFragment) this.f$0).lambda$deleteTopics$13((ArrayList) this.f$1, (Runnable) this.f$2);
                break;
            default:
                ((UsersSelectActivity.GroupCreateAdapter) this.f$0).lambda$updateSearchResults$4((ArrayList) this.f$1, (ArrayList) this.f$2);
                break;
        }
    }
}
