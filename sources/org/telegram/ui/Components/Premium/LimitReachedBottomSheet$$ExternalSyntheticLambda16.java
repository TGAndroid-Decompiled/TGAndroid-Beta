package org.telegram.ui.Components.Premium;

import android.content.DialogInterface;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Stars.StarsReactionsSheet;

public final class LimitReachedBottomSheet$$ExternalSyntheticLambda16 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final BottomSheetWithRecyclerListView f$0;

    public LimitReachedBottomSheet$$ExternalSyntheticLambda16(BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheetWithRecyclerListView;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                ((LimitReachedBottomSheet) this.f$0).lambda$onViewCreated$9(dialogInterface);
                break;
            default:
                PremiumPreviewBottomSheet premiumPreviewBottomSheet = (PremiumPreviewBottomSheet) this.f$0;
                StarsReactionsSheet.AnonymousClass6 anonymousClass6 = premiumPreviewBottomSheet.iconTextureView;
                if (anonymousClass6 != null) {
                    anonymousClass6.setDialogVisible(false);
                }
                premiumPreviewBottomSheet.starParticlesView.setPaused(false);
                break;
        }
    }
}
