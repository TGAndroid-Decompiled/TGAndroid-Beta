package org.telegram.ui.Cells;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public interface s4 {
    boolean a();

    void b(boolean z10, boolean z11);

    void d(TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10);

    boolean g();

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

    boolean h();

    boolean i();
}
