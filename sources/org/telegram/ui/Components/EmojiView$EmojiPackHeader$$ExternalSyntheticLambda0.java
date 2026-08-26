package org.telegram.ui.Components;

import android.view.View;

public final class EmojiView$EmojiPackHeader$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final EmojiView.EmojiPackHeader f$0;

    public EmojiView$EmojiPackHeader$$ExternalSyntheticLambda0(EmojiView.EmojiPackHeader emojiPackHeader, int i) {
        this.$r8$classId = i;
        this.f$0 = emojiPackHeader;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$0(view);
                break;
            case 1:
                this.f$0.lambda$new$1(view);
                break;
            case 2:
                this.f$0.lambda$new$2(view);
                break;
            case 3:
                this.f$0.lambda$new$3(view);
                break;
            case 4:
                this.f$0.lambda$new$4(view);
                break;
            case 5:
                this.f$0.lambda$setStickerSet$5(view);
                break;
            default:
                this.f$0.lambda$setStickerSet$6(view);
                break;
        }
    }
}
