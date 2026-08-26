package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

public final class AlertsCreator$$ExternalSyntheticLambda10 implements View.OnClickListener {
    public final int $r8$classId;
    public final TLRPC.User f$0;
    public final BaseFragment f$1;
    public final AlertDialog.Builder f$2;

    public AlertsCreator$$ExternalSyntheticLambda10(TLRPC.User user, BaseFragment baseFragment, AlertDialog.Builder builder, int i) {
        this.$r8$classId = i;
        this.f$0 = user;
        this.f$1 = baseFragment;
        this.f$2 = builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createBotLaunchAlert$56(this.f$0, this.f$1, this.f$2, view);
                break;
            default:
                AlertsCreator.lambda$createBotLaunchAlert$52(this.f$0, this.f$1, this.f$2, view);
                break;
        }
    }
}
