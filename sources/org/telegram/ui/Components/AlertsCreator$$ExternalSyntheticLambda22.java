package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ProfileActivity;

public final class AlertsCreator$$ExternalSyntheticLambda22 implements View.OnClickListener {
    public final int $r8$classId;
    public final TLRPC.User f$0;
    public final BaseFragment f$1;
    public final AlertDialog.Builder f$2;

    public AlertsCreator$$ExternalSyntheticLambda22(TLRPC.User user, BaseFragment baseFragment, AlertDialog.Builder builder, int i) {
        this.$r8$classId = i;
        this.f$0 = user;
        this.f$1 = baseFragment;
        this.f$2 = builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f$0.id);
                BaseFragment baseFragment = this.f$1;
                if (baseFragment.getMessagesController().checkCanOpenChat(bundle, baseFragment)) {
                    baseFragment.presentFragment(new ProfileActivity(bundle, null));
                }
                this.f$2.alertDialog.dismissRunnable.run();
                break;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f$0.id);
                BaseFragment baseFragment2 = this.f$1;
                if (baseFragment2.getMessagesController().checkCanOpenChat(bundle2, baseFragment2)) {
                    baseFragment2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.f$2.alertDialog.dismissRunnable.run();
                break;
        }
    }
}
