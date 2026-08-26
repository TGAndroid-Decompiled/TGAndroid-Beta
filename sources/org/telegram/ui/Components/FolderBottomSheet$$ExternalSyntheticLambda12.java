package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.INavigationLayout;

public final class FolderBottomSheet$$ExternalSyntheticLambda12 implements Utilities.Callback {
    public final int $r8$classId = 1;
    public final ScrimOptions$$ExternalSyntheticLambda8 f$0;
    public final INavigationLayout f$1;

    public FolderBottomSheet$$ExternalSyntheticLambda12(INavigationLayout iNavigationLayout, ScrimOptions$$ExternalSyntheticLambda8 scrimOptions$$ExternalSyntheticLambda8) {
        this.f$1 = iNavigationLayout;
        this.f$0 = scrimOptions$$ExternalSyntheticLambda8;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                FolderBottomSheet.lambda$onJoinButtonClicked$12(this.f$0, this.f$1, (Integer) obj);
                break;
            default:
                FolderBottomSheet.lambda$onJoinButtonClicked$15(this.f$1, this.f$0, (Integer) obj);
                break;
        }
    }

    public FolderBottomSheet$$ExternalSyntheticLambda12(ScrimOptions$$ExternalSyntheticLambda8 scrimOptions$$ExternalSyntheticLambda8, INavigationLayout iNavigationLayout) {
        this.f$0 = scrimOptions$$ExternalSyntheticLambda8;
        this.f$1 = iNavigationLayout;
    }
}
