package org.telegram.ui;

import android.view.View;

public final class PhotoViewer$16$$ExternalSyntheticLambda5 implements View.OnClickListener {
    public final int $r8$classId;
    public final boolean[] f$0;

    public PhotoViewer$16$$ExternalSyntheticLambda5(boolean[] zArr, int i) {
        this.$r8$classId = i;
        this.f$0 = zArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer.AnonymousClass16.lambda$onItemClick$15(this.f$0, view);
                break;
            case 1:
                ChatActivity.ChatMessageCellDelegate.lambda$didPressRevealSensitiveContent$53(this.f$0, view);
                break;
            case 2:
                CallLogActivity.lambda$showDeleteAlert$13(this.f$0, view);
                break;
            case 3:
                ChatActivity.lambda$processSelectedOption$326(this.f$0, view);
                break;
            case 4:
                ChatActivity.lambda$processSelectedOption$327(this.f$0, view);
                break;
            case 5:
                PassportActivity.lambda$createDocumentDeleteAlert$39(this.f$0, view);
                break;
            default:
                SessionsActivity.lambda$createView$14(this.f$0, view);
                break;
        }
    }
}
