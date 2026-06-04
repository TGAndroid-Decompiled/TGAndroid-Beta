package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;

public final class ChatActivity$$ExternalSyntheticLambda256 implements IBlur3Capture {
    public final ChatActivity.ChatActivityFragmentView f$0;

    @Override
    public final void capture(Canvas canvas, RectF rectF) {
        this.f$0.drawList(canvas, rectF);
    }

    @Override
    public void captureCalculateHash(IBlur3Hash iBlur3Hash, RectF rectF) {
        iBlur3Hash.unsupported();
    }
}
