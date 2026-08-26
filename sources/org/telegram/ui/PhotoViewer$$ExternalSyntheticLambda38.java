package org.telegram.ui;

import android.text.style.ClickableSpan;
import android.widget.TextView;
import org.telegram.messenger.Utilities;

public final class PhotoViewer$$ExternalSyntheticLambda38 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final PhotoViewer f$0;

    public PhotoViewer$$ExternalSyntheticLambda38(PhotoViewer photoViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = photoViewer;
    }

    @Override
    public final void run(Object obj, Object obj2) throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = this.f$0;
                photoViewer.getClass();
                photoViewer.chooseSpeed(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.8f) + 0.2f);
                break;
            default:
                this.f$0.onLinkClick((ClickableSpan) obj, (TextView) obj2);
                break;
        }
    }
}
