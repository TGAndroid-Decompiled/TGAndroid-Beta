package org.telegram.ui;

import com.google.android.exoplayer2.RendererCapabilities;
import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;

public final class ProfileActivity$$ExternalSyntheticLambda124 implements MessagesStorage.BooleanCallback, ContactAddActivity.ContactAddActivityDelegate {
    public final ProfileActivity f$0;
    public final TLRPC.User f$1;

    public ProfileActivity$$ExternalSyntheticLambda124(ProfileActivity profileActivity, TLRPC.User user) {
        this.f$0 = profileActivity;
        this.f$1 = user;
    }

    @Override
    public void didAddToContacts() {
        this.f$0.lambda$openAddToContact$119(this.f$1);
    }

    @Override
    public void run(boolean z) {
        ProfileActivity profileActivity = this.f$0;
        if (profileActivity.getParentLayout() != null) {
            List<BaseFragment> fragmentStack = ((ActionBarLayout) profileActivity.getParentLayout()).getFragmentStack();
            if (((fragmentStack == null || fragmentStack.size() < 2) ? null : (BaseFragment) RendererCapabilities.CC.m(2, fragmentStack)) instanceof ChatActivity) {
                ((ActionBarLayout) profileActivity.getParentLayout()).removeFragmentFromStack(fragmentStack.size() - 2);
            }
        }
        profileActivity.disableProfileAnimation = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.dialogId), this.f$1, profileActivity.currentChat, Boolean.valueOf(z));
    }
}
