package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.blur3.Blur3HashImpl;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;

public final class ChatActivity$$ExternalSyntheticLambda457 implements IBlur3Capture {
    public final int $r8$classId;
    public final ChatActivity.ChatActivityFragmentView f$0;

    public ChatActivity$$ExternalSyntheticLambda457(ChatActivity.ChatActivityFragmentView chatActivityFragmentView, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivityFragmentView;
    }

    @Override
    public final void capture(Canvas canvas, RectF rectF) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.drawList(canvas, rectF);
                break;
            default:
                this.f$0.drawListImpl(canvas, rectF);
                break;
        }
    }

    @Override
    public final void captureCalculateHash(IBlur3Hash iBlur3Hash, RectF rectF) {
        int i = this.$r8$classId;
        ((Blur3HashImpl) iBlur3Hash).unsupported = true;
    }
}
