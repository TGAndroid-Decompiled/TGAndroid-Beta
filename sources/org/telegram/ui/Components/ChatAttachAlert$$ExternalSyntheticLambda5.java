package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;

public final class ChatAttachAlert$$ExternalSyntheticLambda5 implements DialogInterface.OnCancelListener {
    public final int $r8$classId;
    public final KeyEvent.Callback f$0;

    public ChatAttachAlert$$ExternalSyntheticLambda5(KeyEvent.Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatAttachAlert) this.f$0).lambda$dismiss$70(dialogInterface);
                break;
            default:
                ((View) this.f$0).setTag(null);
                break;
        }
    }
}
