package org.telegram.ui.Components;

import android.view.View;

public final class ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda6 implements AlertsCreator.ScheduleDatePickerDelegate, RecyclerListView.OnItemLongClickListener, ZoomControlView.ZoomControlViewDelegate {
    public final int $r8$classId;
    public final ChatAttachAlertPhotoLayout f$0;

    public ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda6(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertPhotoLayout;
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.lambda$onMenuItemClick$18(z, i, i2);
                break;
            default:
                this.f$0.lambda$onMenuItemClick$20(z, i, i2);
                break;
        }
    }

    @Override
    public void didSetZoom(float f) {
        this.f$0.lambda$new$6(f);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return this.f$0.lambda$new$4(view, i);
    }
}
