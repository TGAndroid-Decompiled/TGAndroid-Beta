package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;

public final class ProfileActivity$$ExternalSyntheticLambda12 implements View.OnClickListener {
    public final int $r8$classId;
    public final ProfileActivity f$0;

    public ProfileActivity$$ExternalSyntheticLambda12(ProfileActivity profileActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
    }

    @Override
    public final void onClick(View view) throws Throwable {
        ProfileActivity profileActivity = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                profileActivity.showStarRatingBottomSheet();
                break;
            case 1:
                if (profileActivity.writeButton.getTag() == null) {
                    profileActivity.onWriteButtonClick();
                    break;
                }
                break;
            case 2:
                profileActivity.lambda$createView$42$1(view);
                break;
            case 3:
                profileActivity.stopTabsReorder();
                break;
            case 4:
                profileActivity.lambda$createView$12$5$1();
                break;
            case 5:
                profileActivity.lambda$createView$37$1$1();
                break;
            case 6:
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.chatId);
                bundle.putLong("user_id", profileActivity.userId);
                profileActivity.presentFragment(new QrActivity(bundle));
                break;
            case 7:
                profileActivity.lambda$updateProfileData$103();
                break;
            case 8:
                profileActivity.showStatusSelect();
                break;
            case 9:
                profileActivity.showStatusSelect();
                break;
            case 10:
                if (profileActivity.getParentLayout() != null && ((ActionBarLayout) profileActivity.getParentLayout()).getFragmentStack() != null) {
                    int i = 0;
                    while (i < ((ActionBarLayout) profileActivity.getParentLayout()).getFragmentStack().size()) {
                        BaseFragment baseFragment = ((ActionBarLayout) profileActivity.getParentLayout()).getFragmentStack().get(i);
                        if (baseFragment instanceof DialogsActivity) {
                            DialogsActivity dialogsActivity = (DialogsActivity) baseFragment;
                            DialogsActivity.AnonymousClass27 anonymousClass27 = dialogsActivity.rightSlidingDialogContainer;
                            if (anonymousClass27 != null) {
                                BaseFragment fragment = anonymousClass27.getFragment();
                                if ((fragment instanceof TopicsFragment) && (-((TopicsFragment) fragment).chatId) == profileActivity.getDialogId()) {
                                    dialogsActivity.rightSlidingDialogContainer.finishPreview();
                                }
                            }
                        } else if (baseFragment instanceof ChatActivity) {
                            if (((ChatActivity) baseFragment).getDialogId() == profileActivity.getDialogId()) {
                                INavigationLayout parentLayout = profileActivity.getParentLayout();
                                parentLayout.getClass();
                                ((ActionBarLayout) parentLayout).removeFragmentFromStack(baseFragment, false);
                                i--;
                            }
                        } else if (baseFragment instanceof TopicsFragment) {
                            if ((-((TopicsFragment) baseFragment).chatId) == profileActivity.getDialogId()) {
                                INavigationLayout parentLayout2 = profileActivity.getParentLayout();
                                parentLayout2.getClass();
                                ((ActionBarLayout) parentLayout2).removeFragmentFromStack(baseFragment, false);
                                i--;
                            }
                        } else if ((baseFragment instanceof ProfileActivity) && baseFragment != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) baseFragment;
                            if (profileActivity2.getDialogId() == profileActivity.getDialogId() && profileActivity2.isTopic) {
                                INavigationLayout parentLayout3 = profileActivity.getParentLayout();
                                parentLayout3.getClass();
                                ((ActionBarLayout) parentLayout3).removeFragmentFromStack(baseFragment, false);
                                i--;
                            }
                        }
                        i++;
                    }
                }
                profileActivity.playProfileAnimation = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.chatId);
                HashSet hashSet = TopicsFragment.settingsPreloaded;
                profileActivity.presentFragment(TopicsFragment.getTopicsOrChat(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                break;
            case 11:
                profileActivity.onTextDetailCellImageClicked(view);
                break;
            default:
                profileActivity.onTextDetailCellImageClicked(view);
                break;
        }
    }
}
