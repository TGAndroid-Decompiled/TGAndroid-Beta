package org.telegram.ui.Cells;

import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
public interface p4 {
    boolean a();

    void b(boolean z10, boolean z11);

    void e(TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11);

    float getAlpha();

    float getCheckBoxTranslation();

    float getDeltaBottom();

    int getHeight();

    int getMeasuredHeight();

    zi getMessageObject();

    float getPivotX();

    float getScaleX();

    float getScaleY();

    float getSlidingOffsetX();

    float getX();

    float getY();

    boolean j();

    boolean l();

    boolean m();
}
