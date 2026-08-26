package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;

public final class PasscodeActivity$$ExternalSyntheticLambda3 implements View.OnClickListener {
    public final int $r8$classId;
    public final Context f$0;

    public PasscodeActivity$$ExternalSyntheticLambda3(Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
    }

    @Override
    public final void onClick(View view) {
        Context context = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                Pattern pattern = AlertsCreator.URL_PATTERN;
                AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
                String string = LocaleController.getString(R.string.ForgotPasscode);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.getString(R.string.ForgotPasscodeInfo);
                builder.setPositiveButton(LocaleController.getString(R.string.Close), null);
                alertDialog.show();
                break;
            default:
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(268435456);
                    }
                    context.startActivity(action);
                    RTMPStreamPipOverlay.instance.dismissInternal$1();
                }
                break;
        }
    }
}
