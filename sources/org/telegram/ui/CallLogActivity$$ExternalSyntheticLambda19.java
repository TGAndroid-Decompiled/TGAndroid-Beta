package org.telegram.ui;

import android.content.DialogInterface;

public final class CallLogActivity$$ExternalSyntheticLambda19 implements DialogInterface.OnCancelListener {
    public final int $r8$classId;
    public final CallLogActivity f$0;
    public final int f$1;

    public CallLogActivity$$ExternalSyntheticLambda19(CallLogActivity callLogActivity, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = callLogActivity;
        this.f$1 = i;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.getConnectionsManager().cancelRequest(this.f$1, true);
                break;
            default:
                this.f$0.getConnectionsManager().cancelRequest(this.f$1, true);
                break;
        }
    }
}
