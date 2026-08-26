package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

public final class EmojiView$23$$ExternalSyntheticLambda1 implements Comparator {
    public final int $r8$classId;
    public final Object f$0;

    public EmojiView$23$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((EmojiView.AnonymousClass23) this.f$0).lambda$stickerSetPositionChanged$0((TLRPC.TL_messages_stickerSet) obj, (TLRPC.TL_messages_stickerSet) obj2);
            default:
                return ChatAttachAlertPhotoLayout.lambda$updateAlbumsDropDown$12((ArrayList) this.f$0, (MediaController.AlbumEntry) obj, (MediaController.AlbumEntry) obj2);
        }
    }
}
