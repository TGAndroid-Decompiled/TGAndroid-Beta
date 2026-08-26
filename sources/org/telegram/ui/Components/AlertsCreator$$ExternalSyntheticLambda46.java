package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Base64;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda53;
import org.telegram.ui.ChatActivity;

public final class AlertsCreator$$ExternalSyntheticLambda46 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final BaseFragment f$0;

    public AlertsCreator$$ExternalSyntheticLambda46(int i, BaseFragment baseFragment) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        TLRPC.User user;
        String string;
        switch (this.$r8$classId) {
            case 0:
                BaseFragment baseFragment = this.f$0;
                MessagesController.getInstance(baseFragment.getCurrentAccount()).openByUserName("spambot", baseFragment, 1);
                break;
            default:
                BaseFragment baseFragment2 = this.f$0;
                int currentAccount = baseFragment2.getCurrentAccount();
                SharedPreferences mainSettings = MessagesController.getMainSettings(currentAccount);
                long prefIntOrLong = AndroidUtilities.getPrefIntOrLong(mainSettings, "support_id2", 0L);
                if (prefIntOrLong != 0) {
                    user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(prefIntOrLong));
                    if (user == null && (string = mainSettings.getString("support_user", null)) != null) {
                        try {
                            byte[] bArrDecode = Base64.decode(string, 0);
                            if (bArrDecode != null) {
                                SerializedData serializedData = new SerializedData(bArrDecode);
                                TLRPC.User userTLdeserialize = TLRPC.User.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                                if (userTLdeserialize != null && userTLdeserialize.id == 333000) {
                                    userTLdeserialize = null;
                                }
                                serializedData.cleanup();
                                user = userTLdeserialize;
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                            user = null;
                        }
                    }
                } else {
                    user = null;
                }
                if (user != null) {
                    MessagesController.getInstance(currentAccount).putUser(user, true);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    baseFragment2.presentFragment(new ChatActivity(bundle));
                } else {
                    AlertDialog alertDialog2 = new AlertDialog(baseFragment2.getParentActivity(), 3, null);
                    alertDialog2.canCacnel = false;
                    alertDialog2.show();
                    ConnectionsManager.getInstance(currentAccount).sendRequest(new TLRPC.TL_help_getSupport(), new ArticleViewer$$ExternalSyntheticLambda53(mainSettings, alertDialog2, currentAccount, baseFragment2, 1));
                }
                break;
        }
    }
}
