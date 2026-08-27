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

public final class n2 implements org.telegram.ui.ActionBar.a2 {

    public final int f30816a;

    public final org.telegram.ui.ActionBar.n2 f30817b;

    public n2(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f30816a = i10;
        this.f30817b = n2Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        TLRPC.User user;
        String string;
        switch (this.f30816a) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2Var = this.f30817b;
                MessagesController.getInstance(n2Var.getCurrentAccount()).openByUserName("spambot", n2Var, 1);
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f30817b;
                int currentAccount = n2Var2.getCurrentAccount();
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
                                if (userTLdeserialize != null && userTLdeserialize.f22527id == 333000) {
                                    userTLdeserialize = null;
                                }
                                serializedData.cleanup();
                                user = userTLdeserialize;
                            }
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            user = null;
                        }
                    }
                } else {
                    user = null;
                }
                if (user != null) {
                    MessagesController.getInstance(currentAccount).putUser(user, true);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f22527id);
                    n2Var2.presentFragment(new org.telegram.ui.rn(bundle));
                } else {
                    org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(n2Var2.getParentActivity(), 3, null);
                    b2Var2.f22747c0 = false;
                    b2Var2.show();
                    ConnectionsManager.getInstance(currentAccount).sendRequest(new TLRPC.TL_help_getSupport(), new jh.b8(mainSettings, b2Var2, currentAccount, n2Var2, 3));
                }
                break;
        }
    }
}
