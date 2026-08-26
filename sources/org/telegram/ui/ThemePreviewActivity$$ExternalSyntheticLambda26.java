package org.telegram.ui;

import org.telegram.tgnet.TLObject;

public final class ThemePreviewActivity$$ExternalSyntheticLambda26 implements Runnable {
    public final int $r8$classId;
    public final ThemePreviewActivity f$0;
    public final TLObject f$1;

    public ThemePreviewActivity$$ExternalSyntheticLambda26(ThemePreviewActivity themePreviewActivity, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = themePreviewActivity;
        this.f$1 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didReceivedNotification$28(this.f$1);
                break;
            default:
                this.f$0.lambda$didReceivedNotification$30(this.f$1);
                break;
        }
    }
}
