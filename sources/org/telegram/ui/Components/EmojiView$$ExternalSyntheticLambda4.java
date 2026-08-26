package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.emojiview.FoundStickerPackButton;

public final class EmojiView$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final TLObject f$2;
    public final Object f$3;
    public final Object f$4;
    public final boolean f$5;

    public EmojiView$$ExternalSyntheticLambda4(EmojiView.GifSearchPreloader gifSearchPreloader, String str, String str2, boolean z, String str3, TLObject tLObject) {
        this.f$0 = gifSearchPreloader;
        this.f$1 = str;
        this.f$3 = str2;
        this.f$5 = z;
        this.f$4 = str3;
        this.f$2 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((EmojiView) this.f$0).lambda$setFoundPackButtonText$29((FoundStickerPackButton) this.f$1, this.f$2, (TLRPC.StickerSet) this.f$3, (TLRPC.Document) this.f$4, this.f$5);
                break;
            default:
                ((EmojiView.GifSearchPreloader) this.f$0).lambda$preload$0((String) this.f$1, (String) this.f$3, this.f$5, (String) this.f$4, this.f$2);
                break;
        }
    }

    public EmojiView$$ExternalSyntheticLambda4(EmojiView emojiView, FoundStickerPackButton foundStickerPackButton, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z) {
        this.f$0 = emojiView;
        this.f$1 = foundStickerPackButton;
        this.f$2 = tLObject;
        this.f$3 = stickerSet;
        this.f$4 = document;
        this.f$5 = z;
    }
}
