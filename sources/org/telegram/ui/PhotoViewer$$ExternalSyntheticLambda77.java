package org.telegram.ui;

import android.text.style.ClickableSpan;
import android.widget.TextView;
import java.io.FileNotFoundException;
import org.telegram.messenger.Utilities;

public final class PhotoViewer$$ExternalSyntheticLambda77 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final PhotoViewer f$0;

    public PhotoViewer$$ExternalSyntheticLambda77(PhotoViewer photoViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = photoViewer;
    }

    @Override
    public final void run(Object obj, Object obj2) throws FileNotFoundException {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setParentActivity$7((Float) obj, (Boolean) obj2);
                break;
            default:
                this.f$0.onLinkClick((ClickableSpan) obj, (TextView) obj2);
                break;
        }
    }
}
