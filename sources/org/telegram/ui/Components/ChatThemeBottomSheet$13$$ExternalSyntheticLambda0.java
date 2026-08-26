package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ThemePreviewActivity;

public final class ChatThemeBottomSheet$13$$ExternalSyntheticLambda0 implements ThemePreviewActivity.WallpaperActivityDelegate, ChatAttachAlertAudioLayout.AudioSelectDelegate {
    public final int $r8$classId;
    public final ChatAttachAlert f$0;
    public final Utilities.Callback f$1;

    public ChatThemeBottomSheet$13$$ExternalSyntheticLambda0(Utilities.Callback callback, ChatAttachAlert chatAttachAlert) {
        this.$r8$classId = 2;
        this.f$1 = callback;
        this.f$0 = chatAttachAlert;
    }

    @Override
    public void didSelectAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
        ChatAttachAlertPollLayout.lambda$openPollAttachMenu$22(this.f$1, this.f$0, arrayList, charSequence, z, i, i2, j, z2, j2);
    }

    @Override
    public void didSetNewBackground(TLRPC.WallPaper wallPaper) {
        switch (this.$r8$classId) {
            case 0:
                ChatThemeBottomSheet.AnonymousClass13.lambda$didPressedButton$0(this.f$0, this.f$1, wallPaper);
                break;
            default:
                ChatThemeBottomSheet.AnonymousClass13.lambda$onWallpaperSelected$1(this.f$0, this.f$1, wallPaper);
                break;
        }
    }

    public ChatThemeBottomSheet$13$$ExternalSyntheticLambda0(ChatAttachAlert chatAttachAlert, Utilities.Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlert;
        this.f$1 = callback;
    }
}
