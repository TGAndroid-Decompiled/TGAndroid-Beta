package org.telegram.ui;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda102;

public final class DialogsActivity$$ExternalSyntheticLambda34 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final boolean f$1;
    public final boolean f$2;
    public final boolean f$3;
    public final Object f$4;

    public DialogsActivity$$ExternalSyntheticLambda34(ContactsController contactsController, HashMap map, boolean z, boolean z2, boolean z3) {
        this.f$0 = contactsController;
        this.f$4 = map;
        this.f$1 = z;
        this.f$2 = z2;
        this.f$3 = z3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                DialogsActivity dialogsActivity = (DialogsActivity) this.f$0;
                if (dialogsActivity.getParentActivity() != null) {
                    dialogsActivity.afterSignup = false;
                    boolean z = this.f$1;
                    boolean z2 = this.f$2;
                    boolean z3 = this.f$3;
                    if (z || z2 || z3) {
                        dialogsActivity.askingForPermissions = true;
                        Activity activity = (Activity) this.f$4;
                        if (z && NotificationPermissionDialog.shouldAsk(activity)) {
                            PermissionRequest.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, new StarGiftSheet$$ExternalSyntheticLambda102(2, new OAuthSheet$$ExternalSyntheticLambda13(7, dialogsActivity, activity)));
                        } else if (z2 && dialogsActivity.askAboutContacts && dialogsActivity.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            AlertDialog alertDialog = AlertsCreator.createContactsPermissionDialog(activity, new DialogsActivity$$ExternalSyntheticLambda40(dialogsActivity, 1)).alertDialog;
                            dialogsActivity.permissionDialog = alertDialog;
                            dialogsActivity.showDialog(alertDialog);
                        } else if (!z3 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            dialogsActivity.askForPermissons$1(true);
                        } else if (activity instanceof BasePermissionsActivity) {
                            AlertDialog alertDialogCreatePermissionErrorAlert = ((BasePermissionsActivity) activity).createPermissionErrorAlert(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                            dialogsActivity.permissionDialog = alertDialogCreatePermissionErrorAlert;
                            dialogsActivity.showDialog(alertDialogCreatePermissionErrorAlert);
                        }
                    }
                    break;
                }
                break;
            default:
                ((ContactsController) this.f$0).lambda$syncPhoneBookByAlert$7((HashMap) this.f$4, this.f$1, this.f$2, this.f$3);
                break;
        }
    }

    public DialogsActivity$$ExternalSyntheticLambda34(DialogsActivity dialogsActivity, boolean z, boolean z2, boolean z3, Activity activity) {
        this.f$0 = dialogsActivity;
        this.f$1 = z;
        this.f$2 = z2;
        this.f$3 = z3;
        this.f$4 = activity;
    }
}
