package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.ThemePreviewActivity;

public final class ChatThemeBottomSheet$13$$ExternalSyntheticLambda0 implements ThemePreviewActivity.WallpaperActivityDelegate {
    public final int $r8$classId;
    public final ChatAttachAlert f$0;
    public final DialogCell$$ExternalSyntheticLambda6 f$1;

    public ChatThemeBottomSheet$13$$ExternalSyntheticLambda0(ChatAttachAlert chatAttachAlert, DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda6, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlert;
        this.f$1 = dialogCell$$ExternalSyntheticLambda6;
    }

    @Override
    public final void didSetNewBackground(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.dismissInternal();
                this.f$1.run(tL_wallPaper);
                break;
            default:
                this.f$0.dismissInternal();
                this.f$1.run(tL_wallPaper);
                break;
        }
    }
}
