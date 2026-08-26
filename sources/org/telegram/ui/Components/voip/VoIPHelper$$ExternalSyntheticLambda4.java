package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
import org.telegram.ui.ActionBar.AlertDialog;

public final class VoIPHelper$$ExternalSyntheticLambda4 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final Activity f$0;
    public final Intent f$1;

    public VoIPHelper$$ExternalSyntheticLambda4(Activity activity, Intent intent, int i) {
        this.$r8$classId = i;
        this.f$0 = activity;
        this.f$1 = intent;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.startActivity(this.f$1);
                break;
            default:
                this.f$0.startActivity(this.f$1);
                break;
        }
    }
}
