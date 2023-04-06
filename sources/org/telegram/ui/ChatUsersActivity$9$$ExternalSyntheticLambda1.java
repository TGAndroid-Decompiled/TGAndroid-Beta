package org.telegram.ui;

import androidx.core.util.Consumer;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ChatUsersActivity;
public final class ChatUsersActivity$9$$ExternalSyntheticLambda1 implements Consumer {
    public static final ChatUsersActivity$9$$ExternalSyntheticLambda1 INSTANCE = new ChatUsersActivity$9$$ExternalSyntheticLambda1();

    private ChatUsersActivity$9$$ExternalSyntheticLambda1() {
    }

    @Override
    public final void accept(Object obj) {
        ChatUsersActivity.AnonymousClass9.lambda$didSelectUsers$1((TLRPC$User) obj);
    }
}
