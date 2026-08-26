package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;

public final class AvatarConstructorFragment$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final AvatarConstructorFragment f$0;

    public AvatarConstructorFragment$$ExternalSyntheticLambda2(AvatarConstructorFragment avatarConstructorFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = avatarConstructorFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AvatarConstructorFragment avatarConstructorFragment = this.f$0;
                if (!avatarConstructorFragment.isLandscapeMode) {
                    if (avatarConstructorFragment.keyboardVisibleProgress <= 0.0f) {
                        avatarConstructorFragment.setExpanded(!avatarConstructorFragment.previewView.expanded, true, false);
                    } else {
                        if (avatarConstructorFragment.keyboardVisibilityAnimator != null) {
                            avatarConstructorFragment.progressToExpand = 1.0f;
                            avatarConstructorFragment.expandWithKeyboard = true;
                        }
                        AndroidUtilities.hideKeyboard(avatarConstructorFragment.fragmentView);
                    }
                    break;
                }
                break;
            default:
                AvatarConstructorFragment avatarConstructorFragment2 = this.f$0;
                avatarConstructorFragment2.getClass();
                avatarConstructorFragment2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
