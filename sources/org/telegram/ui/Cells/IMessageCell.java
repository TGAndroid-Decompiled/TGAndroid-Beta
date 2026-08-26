package org.telegram.ui.Cells;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public interface IMessageCell {
    void didPressReactionFromLayout(TLRPC.ReactionCount reactionCount, boolean z, float f, float f2);

    boolean drawPinnedBottom();

    boolean drawPinnedTop();

    float getAlpha();

    float getCheckBoxTranslation();

    float getDeltaBottom();

    int getHeight();

    int getMeasuredHeight();

    MessageObject getMessageObject();

    float getPivotX();

    float getScaleX();

    float getScaleY();

    float getSlidingOffsetX();

    float getX();

    float getY();

    void setAnimationRunning(boolean z, boolean z2);

    boolean shouldDrawAlphaLayer();

    boolean willRemovedAfterAnimation();
}
