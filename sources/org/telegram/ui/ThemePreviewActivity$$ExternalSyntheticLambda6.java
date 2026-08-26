package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ThemePreviewActivity$$ExternalSyntheticLambda6 implements RequestDelegate {
    public final int $r8$classId;
    public final ThemePreviewActivity f$0;

    public ThemePreviewActivity$$ExternalSyntheticLambda6(ThemePreviewActivity themePreviewActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = themePreviewActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didReceivedNotification$31(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$didReceivedNotification$29(tLObject, tL_error);
                break;
        }
    }
}
