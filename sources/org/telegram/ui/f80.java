package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class f80 implements Runnable {
    public final int f38155a = 0;
    public final LaunchActivity f38156b;
    public final TLRPC.TL_error f38157c;
    public final TLObject d;
    public final int f38158e;
    public final String f38159f;
    public final x20 h;

    public f80(LaunchActivity launchActivity, TLObject tLObject, int i9, String str, TLRPC.TL_error tL_error, x20 x20Var) {
        this.f38156b = launchActivity;
        this.d = tLObject;
        this.f38158e = i9;
        this.f38159f = str;
        this.f38157c = tL_error;
        this.h = x20Var;
    }

    @Override
    public final void run() {
        String str;
        int i9 = this.f38155a;
        x20 x20Var = this.h;
        String str2 = this.f38159f;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f38157c;
        switch (i9) {
            case 0:
                Pattern pattern = LaunchActivity.f35493x1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity = this.f38156b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.f38158e).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f22527id);
                    launchActivity.p0(new qn(bundle));
                } else {
                    StringBuilder t10 = aa.d.t("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    t10.append(str);
                    FileLog.e(t10.toString());
                    org.telegram.messenger.ll.p(R.string.NoUsernameFound, org.telegram.ui.Components.oc.a0((org.telegram.ui.ActionBar.o2) j3.r0.j(1, launchActivity.Z)), null);
                }
                try {
                    x20Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                Pattern pattern2 = LaunchActivity.f35493x1;
                LaunchActivity launchActivity2 = this.f38156b;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            org.telegram.ui.Components.oc.a0(U).Q(R.raw.fire_on, 36, launchActivity2.getString(R.string.UniqueGiftNotFoundBurned)).j();
                        } else {
                            org.telegram.ui.Components.oc.a0(U).Q(R.raw.error, 36, launchActivity2.getString(R.string.UniqueGiftNotFound)).j();
                        }
                    } else {
                        return;
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    MessagesController.getInstance(launchActivity2.K).putUsers(tL_payments_uniqueStarGift.users, false);
                    MessagesController.getInstance(launchActivity2.K).putChats(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        gh.k5 k5Var = new gh.k5(launchActivity2, this.f38158e, 0L, null, null);
                        k5Var.h2(str2, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (U2 != null) {
                            if (U2.getLastStoryViewer() != null && U2.getLastStoryViewer().G0) {
                                U2.getLastStoryViewer().showDialog(k5Var);
                            } else {
                                U2.showDialog(k5Var);
                            }
                        } else {
                            k5Var.show();
                        }
                    }
                }
                try {
                    x20Var.run();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }

    public f80(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i9, String str, x20 x20Var) {
        this.f38156b = launchActivity;
        this.f38157c = tL_error;
        this.d = tLObject;
        this.f38158e = i9;
        this.f38159f = str;
        this.h = x20Var;
    }
}
