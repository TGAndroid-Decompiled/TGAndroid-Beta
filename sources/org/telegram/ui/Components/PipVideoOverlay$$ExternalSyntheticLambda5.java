package org.telegram.ui.Components;

import android.view.View;
import java.io.FileNotFoundException;

public final class PipVideoOverlay$$ExternalSyntheticLambda5 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public PipVideoOverlay$$ExternalSyntheticLambda5(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void onClick(View view) throws FileNotFoundException {
        switch (this.$r8$classId) {
            case 0:
                ((PipVideoOverlay) this.f$0).lambda$showInternal$10(this.f$1, view);
                break;
            case 1:
                ((ChatActivityEnterView) this.f$0).lambda$onSendLongClick$45(this.f$1, view);
                break;
            default:
                ((ChatAttachAlert) this.f$0).lambda$new$5(this.f$1, view);
                break;
        }
    }
}
