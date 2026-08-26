package org.telegram.ui.bots;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TopicsFragment;

public final class BotVerifySheet$$ExternalSyntheticLambda1 implements Utilities.Callback {
    public final TopicsFragment f$0;
    public final DialogsActivity f$1;
    public final long f$2;
    public final int f$3;

    public BotVerifySheet$$ExternalSyntheticLambda1(TopicsFragment topicsFragment, DialogsActivity dialogsActivity, long j, int i) {
        this.f$0 = topicsFragment;
        this.f$1 = dialogsActivity;
        this.f$2 = j;
        this.f$3 = i;
    }

    @Override
    public final void run(Object obj) {
        String forcedFirstName;
        TLObject tLObject;
        Boolean bool = (Boolean) obj;
        TopicsFragment topicsFragment = this.f$0;
        DialogsActivity dialogsActivity = this.f$1;
        if (topicsFragment != null) {
            topicsFragment.finishFragment();
            dialogsActivity.removeSelfFromStack();
        } else {
            dialogsActivity.finishFragment();
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        long j = this.f$2;
        int i = this.f$3;
        if (j >= 0) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            forcedFirstName = UserObject.getForcedFirstName(user);
            tLObject = user;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
            if (chat == null) {
                forcedFirstName = "";
                tLObject = chat;
            } else {
                forcedFirstName = chat.title;
                tLObject = chat;
            }
        }
        BulletinFactory.of(safeLastFragment).createUsersBulletin(tLObject, AndroidUtilities.replaceTags(LocaleController.formatString(bool.booleanValue() ? R.string.BotSentRevokeVerifyRequest : R.string.BotSentVerifyRequest, forcedFirstName))).show(false);
    }
}
