package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

public final class ChatAttachAlertPhotoLayout$10$$ExternalSyntheticLambda2 implements Utilities.Callback {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final boolean f$2;

    public ChatAttachAlertPhotoLayout$10$$ExternalSyntheticLambda2(ChatAttachAlertPhotoLayout.AnonymousClass10 anonymousClass10, File file, boolean z) {
        this.f$0 = anonymousClass10;
        this.f$1 = file;
        this.f$2 = z;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatAttachAlertPhotoLayout.AnonymousClass10) this.f$0).lambda$shutterReleased$3((File) this.f$1, this.f$2, (Integer) obj);
                break;
            default:
                ((EmojiView.StickersSearchGridAdapter.AnonymousClass1) this.f$0).lambda$searchStickerSets$2(this.f$2, (Runnable) this.f$1, (ArrayList) obj);
                break;
        }
    }

    public ChatAttachAlertPhotoLayout$10$$ExternalSyntheticLambda2(EmojiView.StickersSearchGridAdapter.AnonymousClass1 anonymousClass1, boolean z, Runnable runnable) {
        this.f$0 = anonymousClass1;
        this.f$2 = z;
        this.f$1 = runnable;
    }
}
