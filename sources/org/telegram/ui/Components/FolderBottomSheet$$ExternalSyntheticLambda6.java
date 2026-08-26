package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda13;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.MainTabsActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda13;

public final class FolderBottomSheet$$ExternalSyntheticLambda6 implements Utilities.Callback {
    public final int $r8$classId = 1;
    public final OAuthSheet$$ExternalSyntheticLambda13 f$0;
    public final INavigationLayout f$1;

    public FolderBottomSheet$$ExternalSyntheticLambda6(INavigationLayout iNavigationLayout, OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13) {
        this.f$1 = iNavigationLayout;
        this.f$0 = oAuthSheet$$ExternalSyntheticLambda13;
    }

    @Override
    public final void run(Object obj) {
        BaseFragment baseFragment;
        BaseFragment baseFragment2;
        boolean z;
        OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run(((ActionBarLayout) this.f$1).getLastFragment());
                break;
            default:
                Integer num = (Integer) obj;
                List<BaseFragment> fragmentStack = ((ActionBarLayout) this.f$1).getFragmentStack();
                boolean z2 = true;
                BaseFragment baseFragment3 = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    baseFragment3 = fragmentStack.get(size);
                    if ((baseFragment3 instanceof DialogsActivity) || (baseFragment3 instanceof MainTabsActivity)) {
                        baseFragment = baseFragment3;
                        if (baseFragment instanceof MainTabsActivity) {
                            baseFragment2 = ((MainTabsActivity) baseFragment).dialogsActivity;
                        } else {
                            baseFragment2 = baseFragment;
                        }
                        z = baseFragment2 instanceof DialogsActivity;
                        oAuthSheet$$ExternalSyntheticLambda13 = this.f$0;
                        if (z) {
                            DialogsActivity dialogsActivity = (DialogsActivity) baseFragment2;
                            dialogsActivity.closeSearching();
                            AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda13(dialogsActivity, num, oAuthSheet$$ExternalSyntheticLambda13, baseFragment, 11), 80L);
                        } else {
                            oAuthSheet$$ExternalSyntheticLambda13.run(baseFragment);
                        }
                    } else {
                        if (z2) {
                            baseFragment3.finishFragment();
                            z2 = false;
                        } else {
                            baseFragment3.removeSelfFromStack();
                        }
                    }
                    break;
                }
                baseFragment = baseFragment3;
                if (baseFragment instanceof MainTabsActivity) {
                    baseFragment2 = ((MainTabsActivity) baseFragment).dialogsActivity;
                } else {
                    baseFragment2 = baseFragment;
                }
                z = baseFragment2 instanceof DialogsActivity;
                oAuthSheet$$ExternalSyntheticLambda13 = this.f$0;
                if (z) {
                    DialogsActivity dialogsActivity2 = (DialogsActivity) baseFragment2;
                    dialogsActivity2.closeSearching();
                    AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda13(dialogsActivity2, num, oAuthSheet$$ExternalSyntheticLambda13, baseFragment, 11), 80L);
                } else {
                    oAuthSheet$$ExternalSyntheticLambda13.run(baseFragment);
                }
                break;
        }
    }

    public FolderBottomSheet$$ExternalSyntheticLambda6(OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13, INavigationLayout iNavigationLayout) {
        this.f$0 = oAuthSheet$$ExternalSyntheticLambda13;
        this.f$1 = iNavigationLayout;
    }
}
