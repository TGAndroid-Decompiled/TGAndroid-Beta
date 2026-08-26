package org.telegram.ui;

import org.telegram.ui.Components.AnimatedEmojiSpan;

public final class GroupCallActivity$EmojiSlot$$ExternalSyntheticLambda1 implements AnimatedEmojiSpan.InvalidateHolder {
    public final int $r8$classId;
    public final Object f$0;

    public GroupCallActivity$EmojiSlot$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.$r8$classId) {
            case 0:
                ((GroupCallActivity.EmojiSlot) this.f$0).lambda$new$0();
                break;
            default:
                ((SelectAnimatedEmojiDialog.ImageViewEmoji) this.f$0).lambda$new$0();
                break;
        }
    }
}
