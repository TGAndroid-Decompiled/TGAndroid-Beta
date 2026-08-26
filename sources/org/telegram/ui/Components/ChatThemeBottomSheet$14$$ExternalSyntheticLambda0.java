package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ThemePreviewActivity;

public final class ChatThemeBottomSheet$14$$ExternalSyntheticLambda0 implements ThemePreviewActivity.WallpaperActivityDelegate {
    public final int $r8$classId;
    public final ChatThemeBottomSheet.AnonymousClass14 f$0;

    public ChatThemeBottomSheet$14$$ExternalSyntheticLambda0(ChatThemeBottomSheet.AnonymousClass14 anonymousClass14, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass14;
    }

    @Override
    public final void didSetNewBackground(TLRPC.WallPaper wallPaper) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onWallpaperSelected$1(wallPaper);
                break;
            default:
                this.f$0.lambda$didPressedButton$0(wallPaper);
                break;
        }
    }
}
