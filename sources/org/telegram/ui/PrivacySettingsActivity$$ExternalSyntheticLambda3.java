package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;

public final class PrivacySettingsActivity$$ExternalSyntheticLambda3 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final PrivacySettingsActivity f$0;

    public PrivacySettingsActivity$$ExternalSyntheticLambda3(PrivacySettingsActivity privacySettingsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = privacySettingsActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        String string;
        switch (this.$r8$classId) {
            case 1:
                PrivacySettingsActivity privacySettingsActivity = this.f$0;
                privacySettingsActivity.getClass();
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(privacySettingsActivity.getParentActivity(), 0, null);
                String string2 = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                AlertDialog alertDialog2 = builder.alertDialog;
                alertDialog2.title = string2;
                alertDialog2.message = LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert);
                builder.setPositiveButton(LocaleController.getString("ClearButton", R.string.ClearButton), new PrivacySettingsActivity$$ExternalSyntheticLambda3(privacySettingsActivity, 2));
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                privacySettingsActivity.showDialog(alertDialog2);
                privacySettingsActivity.showDialog(alertDialog2);
                TextView textView = (TextView) alertDialog2.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                }
                break;
            case 2:
                PrivacySettingsActivity privacySettingsActivity2 = this.f$0;
                privacySettingsActivity2.getClass();
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity2.clear;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity2.getUserConfig().tmpPassword = null;
                privacySettingsActivity2.getUserConfig().saveConfig(false);
                privacySettingsActivity2.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new PassportActivity$$ExternalSyntheticLambda1(1));
                boolean z = zArr[0];
                if (z && zArr[1]) {
                    string = LocaleController.getString("PrivacyPaymentsPaymentShippingCleared", R.string.PrivacyPaymentsPaymentShippingCleared);
                } else if (z) {
                    string = LocaleController.getString("PrivacyPaymentsShippingInfoCleared", R.string.PrivacyPaymentsShippingInfoCleared);
                } else if (zArr[1]) {
                    string = LocaleController.getString("PrivacyPaymentsPaymentInfoCleared", R.string.PrivacyPaymentsPaymentInfoCleared);
                }
                BulletinFactory.of(privacySettingsActivity2).createSimpleBulletinWithIconSize(R.raw.chats_infotip, 36, string).show();
                break;
            case 3:
            default:
                PrivacySettingsActivity privacySettingsActivity3 = this.f$0;
                AlertDialog alertDialogShow = new AlertDialog.Builder(privacySettingsActivity3.getParentActivity(), 3, null).show();
                privacySettingsActivity3.progressDialog = alertDialogShow;
                alertDialogShow.canCacnel = false;
                if (privacySettingsActivity3.currentSync != privacySettingsActivity3.newSync) {
                    UserConfig userConfig = privacySettingsActivity3.getUserConfig();
                    boolean z2 = privacySettingsActivity3.newSync;
                    userConfig.syncContacts = z2;
                    privacySettingsActivity3.currentSync = z2;
                    privacySettingsActivity3.getUserConfig().saveConfig(false);
                }
                privacySettingsActivity3.getContactsController().deleteAllContacts(new PrivacySettingsActivity$$ExternalSyntheticLambda10(privacySettingsActivity3, 1));
                break;
            case 4:
                PrivacySettingsActivity privacySettingsActivity4 = this.f$0;
                privacySettingsActivity4.getClass();
                LoginActivity loginActivity = new LoginActivity();
                PrivacySettingsActivity$$ExternalSyntheticLambda10 privacySettingsActivity$$ExternalSyntheticLambda10 = new PrivacySettingsActivity$$ExternalSyntheticLambda10(privacySettingsActivity4, 2);
                loginActivity.activityMode = 3;
                loginActivity.currentViewNum = 12;
                loginActivity.emailChangeFinishCallback = privacySettingsActivity$$ExternalSyntheticLambda10;
                privacySettingsActivity4.presentFragment(loginActivity);
                break;
        }
    }

    public void sessionsLoaded() {
        int i;
        switch (this.$r8$classId) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f$0;
                PrivacySettingsActivity.ListAdapter listAdapter = privacySettingsActivity.listAdapter;
                if (listAdapter != null && (i = privacySettingsActivity.sessionsRow) >= 0) {
                    listAdapter.notifyItemChanged(i);
                    break;
                }
                break;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f$0;
                if (privacySettingsActivity2.listAdapter != null) {
                    int sessionsCount = privacySettingsActivity2.webSessionsActivityPreload.getSessionsCount();
                    if (privacySettingsActivity2.webSessionsRow < 0 && sessionsCount > 0) {
                        privacySettingsActivity2.updateRows(true);
                        break;
                    }
                }
                break;
        }
    }
}
