package org.telegram.ui.Cells;

import org.telegram.ui.Components.AnimatedEmojiSpan;

public final class ChatMessageCell$$ExternalSyntheticLambda12 implements AnimatedEmojiSpan.InvalidateHolder {
    public final ChatMessageCell f$0;

    public ChatMessageCell$$ExternalSyntheticLambda12(ChatMessageCell chatMessageCell) {
        this.f$0 = chatMessageCell;
    }

    @Override
    public final void invalidate() {
        this.f$0.invalidateOutbounds();
    }
}
