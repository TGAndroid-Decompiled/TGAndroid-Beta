package org.telegram.ui.Cells;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public interface IMessageCell {
    void didPressReactionFromLayout(TLRPC.ReactionCount reactionCount, boolean z, float f, float f2);

    boolean drawPinnedBottom();

    boolean drawPinnedTop();

    float getAlpha();

    ImageReceiver getAvatarImage();

    float getCheckBoxTranslation();

    MessageObject.GroupedMessagePosition getCurrentPosition();

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

    public abstract class CC {
        public static boolean $default$drawPinnedBottom(IMessageCell iMessageCell) {
            return false;
        }

        public static boolean $default$drawPinnedTop(IMessageCell iMessageCell) {
            return false;
        }

        public static ImageReceiver $default$getAvatarImage(IMessageCell iMessageCell) {
            return null;
        }

        public static float $default$getCheckBoxTranslation(IMessageCell iMessageCell) {
            return 0.0f;
        }

        public static MessageObject.GroupedMessagePosition $default$getCurrentPosition(IMessageCell iMessageCell) {
            return null;
        }

        public static float $default$getSlidingOffsetX(IMessageCell iMessageCell) {
            return 0.0f;
        }

        public static void $default$setAnimationRunning(IMessageCell iMessageCell, boolean z, boolean z2) {
        }

        public static boolean $default$shouldDrawAlphaLayer(IMessageCell iMessageCell) {
            return false;
        }

        public static boolean $default$willRemovedAfterAnimation(IMessageCell iMessageCell) {
            return false;
        }
    }
}
