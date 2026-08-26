package org.telegram.ui.Components;

import android.view.View;
import java.io.FileNotFoundException;

public final class ShareAlert$$ExternalSyntheticLambda7 implements View.OnClickListener {
    public final int $r8$classId;
    public final ShareAlert f$0;

    public ShareAlert$$ExternalSyntheticLambda7(ShareAlert shareAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = shareAlert;
    }

    @Override
    public final void onClick(View view) throws FileNotFoundException {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onSendLongClick$28(view);
                break;
            case 1:
                this.f$0.lambda$new$10(view);
                break;
            case 2:
                this.f$0.lambda$new$11(view);
                break;
            case 3:
                this.f$0.lambda$new$13(view);
                break;
            case 4:
                this.f$0.lambda$new$16(view);
                break;
            case 5:
                this.f$0.lambda$new$18(view);
                break;
            default:
                this.f$0.lambda$onSendLongClick$29(view);
                break;
        }
    }
}
