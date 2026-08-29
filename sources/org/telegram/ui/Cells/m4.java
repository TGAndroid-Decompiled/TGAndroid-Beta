package org.telegram.ui.Cells;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public interface m4 {
    boolean a();

    void b(boolean z10, boolean z11);

    void f(TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10);

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

    boolean j();
}
