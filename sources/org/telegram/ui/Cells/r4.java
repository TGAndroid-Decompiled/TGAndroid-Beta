package org.telegram.ui.Cells;

import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
public interface r4 {
    boolean a();

    void b(boolean z10, boolean z11);

    void e(TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10);

    boolean g();

    float getAlpha();

    float getCheckBoxTranslation();

    float getDeltaBottom();

    int getHeight();

    int getMeasuredHeight();

    kj getMessageObject();

    float getPivotX();

    float getScaleX();

    float getScaleY();

    float getSlidingOffsetX();

    float getX();

    float getY();

    boolean k();

    boolean l();
}
