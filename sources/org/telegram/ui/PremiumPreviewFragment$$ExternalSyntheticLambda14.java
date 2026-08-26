package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.blur3.Blur3HashImpl;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;

public final class PremiumPreviewFragment$$ExternalSyntheticLambda14 implements IBlur3Capture {
    public final int $r8$classId;
    public final Object f$0;

    public PremiumPreviewFragment$$ExternalSyntheticLambda14(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void capture(Canvas canvas, RectF rectF) {
        switch (this.$r8$classId) {
            case 0:
                ((PremiumPreviewFragment) this.f$0).lambda$createView$0(canvas, rectF);
                break;
            default:
                ((ChannelAdminLogActivity.ChatActivityFragmentView) this.f$0).drawList(canvas, rectF);
                break;
        }
    }

    @Override
    public final void captureCalculateHash(IBlur3Hash iBlur3Hash, RectF rectF) {
        int i = this.$r8$classId;
        ((Blur3HashImpl) iBlur3Hash).unsupported = true;
    }
}
