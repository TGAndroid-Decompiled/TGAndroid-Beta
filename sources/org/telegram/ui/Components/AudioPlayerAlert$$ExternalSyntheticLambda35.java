package org.telegram.ui.Components;

import android.view.View;

public final class AudioPlayerAlert$$ExternalSyntheticLambda35 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;

    public AudioPlayerAlert$$ExternalSyntheticLambda35(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void onItemClick(View view, int i) {
        switch (this.$r8$classId) {
            case 0:
                AudioPlayerAlert.lambda$new$9(view, i);
                break;
            default:
                ChatAttachAlertPhotoLayout.lambda$new$9(view, i);
                break;
        }
    }
}
