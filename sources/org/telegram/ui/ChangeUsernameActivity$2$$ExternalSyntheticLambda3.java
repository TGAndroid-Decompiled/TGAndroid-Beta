package org.telegram.ui;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

public final class ChangeUsernameActivity$2$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Serializable f$1;
    public final TLObject f$2;
    public final int f$3;
    public final boolean f$4;
    public final Object f$5;
    public final Object f$6;
    public final boolean f$7;

    public ChangeUsernameActivity$2$$ExternalSyntheticLambda3(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z, boolean z2, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i) {
        this.f$0 = sendMessagesHelper;
        this.f$1 = arrayList;
        this.f$4 = z;
        this.f$7 = z2;
        this.f$2 = message;
        this.f$5 = arrayList2;
        this.f$6 = arrayList3;
        this.f$3 = i;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        TLRPC.TL_username tL_username;
        switch (this.$r8$classId) {
            case 0:
                ChangeUsernameActivity.AnonymousClass2 anonymousClass2 = (ChangeUsernameActivity.AnonymousClass2) this.f$0;
                ChangeUsernameActivity changeUsernameActivity = ChangeUsernameActivity.this;
                changeUsernameActivity.loadingUsernames.remove((String) this.f$1);
                boolean z = this.f$2 instanceof TLRPC.TL_boolTrue;
                int i = this.f$3;
                boolean z2 = this.f$4;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.f$6;
                if (z) {
                    changeUsernameActivity.toggleUsername(i, z2, false);
                } else {
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$5;
                    boolean z3 = this.f$7;
                    if (tL_error == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        changeUsernameActivity.toggleUsername(tL_username2, z3, true);
                    } else {
                        tL_username2.active = z2;
                        changeUsernameActivity.toggleUsername(i, z2, false);
                        AlertDialog.Builder builder = new AlertDialog.Builder(changeUsernameActivity.getParentActivity(), 0, changeUsernameActivity.getResourceProvider());
                        String string = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string;
                        alertDialog.message = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), new LoginActivity$$ExternalSyntheticLambda31(anonymousClass2, tL_username2, z3, 6));
                        builder.show();
                    }
                }
                TLRPC.User user = MessagesController.getInstance(((BaseFragment) changeUsernameActivity).currentAccount).getUser(Long.valueOf(changeUsernameActivity.getUserId()));
                changeUsernameActivity.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (changeUsernameActivity.botId != 0 && (arrayList = changeUsernameActivity.usernames) != null) {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if (((TLRPC.TL_username) obj).active) {
                            break;
                        }
                    }
                    int size2 = arrayList.size();
                    int i3 = 0;
                    do {
                        if (i3 < size2) {
                            Object obj2 = arrayList.get(i3);
                            i3++;
                            tL_username = (TLRPC.TL_username) obj2;
                        } else {
                            tL_username = null;
                        }
                        if (tL_username != null) {
                            changeUsernameActivity.toggleUsername(tL_username, true, false);
                            changeUsernameActivity.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                        }
                        break;
                    } while (!tL_username.editable);
                    if (tL_username != null) {
                        changeUsernameActivity.toggleUsername(tL_username, true, false);
                        changeUsernameActivity.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                    }
                    break;
                }
                break;
            default:
                ((SendMessagesHelper) this.f$0).lambda$performSendMessageRequest$96((ArrayList) this.f$1, this.f$4, this.f$7, (TLRPC.Message) this.f$2, (ArrayList) this.f$5, (ArrayList) this.f$6, this.f$3);
                break;
        }
    }

    public ChangeUsernameActivity$2$$ExternalSyntheticLambda3(ChangeUsernameActivity.AnonymousClass2 anonymousClass2, String str, TLObject tLObject, int i, boolean z, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z2) {
        this.f$0 = anonymousClass2;
        this.f$1 = str;
        this.f$2 = tLObject;
        this.f$3 = i;
        this.f$4 = z;
        this.f$5 = tL_error;
        this.f$6 = tL_username;
        this.f$7 = z2;
    }
}
