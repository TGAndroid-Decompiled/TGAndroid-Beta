package org.telegram.ui;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Stories.recorder.HintView2;

public final class PhotoViewer$$ExternalSyntheticLambda127 implements Runnable {
    public final int $r8$classId;
    public final HintView2 f$0;

    public PhotoViewer$$ExternalSyntheticLambda127(HintView2 hintView2, int i) {
        this.$r8$classId = i;
        this.f$0 = hintView2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.removeFromParent(this.f$0);
                break;
            case 1:
                AndroidUtilities.removeFromParent(this.f$0);
                break;
            case 2:
                AndroidUtilities.removeFromParent(this.f$0);
                break;
            case 3:
                this.f$0.hide(true);
                break;
            case 4:
                AndroidUtilities.removeFromParent(this.f$0);
                break;
            case 5:
                AndroidUtilities.removeFromParent(this.f$0);
                break;
            default:
                this.f$0.getClass();
                break;
        }
    }

    public PhotoViewer$$ExternalSyntheticLambda127(HintView2 hintView2, LinkSpanDrawable linkSpanDrawable, ClickableSpan clickableSpan) {
        this.$r8$classId = 6;
        this.f$0 = hintView2;
    }
}
