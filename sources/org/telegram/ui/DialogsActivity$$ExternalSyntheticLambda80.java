package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;

public final class DialogsActivity$$ExternalSyntheticLambda80 implements Utilities.Callback {
    public final int $r8$classId;
    public final Activity f$0;

    public DialogsActivity$$ExternalSyntheticLambda80(Activity activity, int i) {
        this.$r8$classId = i;
        this.f$0 = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                DialogsActivity.lambda$askForPermissons$117(this.f$0, (Boolean) obj);
                break;
            default:
                DialogsActivity.lambda$onResume$79(this.f$0, (Boolean) obj);
                break;
        }
    }
}
