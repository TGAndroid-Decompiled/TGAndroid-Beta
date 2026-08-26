package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;

public abstract class GroupCallSheet {
    public static void show(LaunchActivity launchActivity, int i, String str, Browser.Progress progress) {
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        tL_inputGroupCallSlug.slug = str;
        show(launchActivity, i, tL_inputGroupCallSlug, progress);
    }

    public static void show(Activity activity, int i, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, Browser.Progress progress) {
        AlertDialog alertDialog;
        ConferenceCall conferenceCall;
        LaunchActivity launchActivity;
        if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null) {
            TLRPC.InputGroupCall inputGroupCall = conferenceCall.inputGroupCall;
            if ((inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug) && TextUtils.equals(inputGroupCall.slug, tL_inputGroupCallSlug.slug) && (launchActivity = LaunchActivity.instance) != null) {
                GroupCallActivity.create(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
        }
        if (progress == null) {
            AlertDialog alertDialog2 = new AlertDialog(activity, 3, null);
            AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog2.showRunnable;
            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 300L);
            alertDialog = alertDialog2;
        } else {
            alertDialog = null;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallSlug;
        getgroupcall.limit = 10;
        int iSendRequest = ConnectionsManager.getInstance(i).sendRequest(getgroupcall, new GroupCallSheet$$ExternalSyntheticLambda0(alertDialog, progress, i, activity, tL_inputGroupCallSlug, 0));
        if (progress != null) {
            progress.onCancelListener = new GroupCallSheet$$ExternalSyntheticLambda1(i, iSendRequest, 0);
            progress.init();
        }
    }
}
