package org.telegram.ui.Cells;

import android.view.View;
import java.util.Iterator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.Reactions.HwEmojis;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.SelectAnimatedEmojiDialog;

public final class ChatMessageCell$$ExternalSyntheticLambda10 implements AnimatedEmojiSpan.InvalidateHolder {
    public final int $r8$classId;
    public final Object f$0;

    public ChatMessageCell$$ExternalSyntheticLambda10(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatMessageCell) this.f$0).invalidateOutbounds();
                break;
            case 1:
                Iterator it = ((GroupCallActivity.EmojiSlot) this.f$0).parents.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji = (SelectAnimatedEmojiDialog.ImageViewEmoji) this.f$0;
                imageViewEmoji.getClass();
                if (!HwEmojis.hwEnabled && imageViewEmoji.getParent() != null) {
                    ((View) imageViewEmoji.getParent()).invalidate();
                }
                break;
        }
    }
}
