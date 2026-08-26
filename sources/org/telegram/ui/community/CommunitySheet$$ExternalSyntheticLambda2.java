package org.telegram.ui.community;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.FragmentSearchField;

public final class CommunitySheet$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final CommunitySheet f$0;

    public CommunitySheet$$ExternalSyntheticLambda2(CommunitySheet communitySheet, int i) {
        this.$r8$classId = i;
        this.f$0 = communitySheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                CommunitySheet communitySheet = this.f$0;
                communitySheet.communityPage.listView.layoutManager.scrollToPositionWithOffset(1, communitySheet.systemInsets.top);
                communitySheet.animatorSearchMessagesVisible.setValue(false, true);
                communitySheet.setAllowNestedScroll(true);
                FragmentSearchField fragmentSearchField = communitySheet.messagesSearchView;
                AndroidUtilities.hideKeyboard(fragmentSearchField.editText);
                fragmentSearchField.editText.clearFocus();
                break;
            case 1:
                CommunitySheet communitySheet2 = this.f$0;
                communitySheet2.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", communitySheet2.communityId);
                communitySheet2.parentFragment.presentFragment(new CommunityEditActivity(bundle));
                communitySheet2.lambda$showGiftOfferSheet$15();
                break;
            default:
                CommunitySheet communitySheet3 = this.f$0;
                communitySheet3.chatsPage.listView.layoutManager.scrollToPositionWithOffset(1, communitySheet3.systemInsets.top);
                communitySheet3.animatorSearchChatsVisible.setValue(false, true);
                communitySheet3.setAllowNestedScroll(true);
                FragmentSearchField fragmentSearchField2 = communitySheet3.chatsSearchView;
                AndroidUtilities.hideKeyboard(fragmentSearchField2.editText);
                fragmentSearchField2.editText.clearFocus();
                break;
        }
    }
}
