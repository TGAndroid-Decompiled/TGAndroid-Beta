package org.telegram.ui.Components;

import android.view.View;
import com.google.android.exoplayer2.util.Consumer;

public final class StickersAlert$$ExternalSyntheticLambda31 implements Consumer {
    public final int $r8$classId;

    public StickersAlert$$ExternalSyntheticLambda31(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.$r8$classId) {
            case 0:
                StickersAlert.lambda$disableEditMode$51(view);
                break;
            case 1:
                FiltersListBottomSheet.lambda$didReceivedNotification$1(view);
                break;
            case 2:
                MentionsContainerView.lambda$didReceivedNotification$6(view);
                break;
            default:
                StickersAlert.lambda$enableEditMode$49(view);
                break;
        }
    }
}
