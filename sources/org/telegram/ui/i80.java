package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class i80 implements Runnable {
    public final int f39144a = 0;
    public final LaunchActivity f39145b;
    public final TLRPC.TL_error f39146c;
    public final TLObject d;
    public final int f39147e;
    public final String f39148f;
    public final x60 h;

    public i80(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, x60 x60Var) {
        this.f39145b = launchActivity;
        this.d = tLObject;
        this.f39147e = i10;
        this.f39148f = str;
        this.f39146c = tL_error;
        this.h = x60Var;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f39144a;
        x60 x60Var = this.h;
        String str2 = this.f39148f;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f39146c;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f35560x1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity = this.f39145b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.f39147e).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f22539id);
                    launchActivity.p0(new tn(bundle));
                } else {
                    StringBuilder s10 = a4.w.s("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    s10.append(str);
                    FileLog.e(s10.toString());
                    org.telegram.messenger.x3.s(R.string.NoUsernameFound, org.telegram.ui.Components.tc.a0((org.telegram.ui.ActionBar.o2) j7.l1.i(1, launchActivity.Z)), null);
                }
                try {
                    x60Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                Pattern pattern2 = LaunchActivity.f35560x1;
                LaunchActivity launchActivity2 = this.f39145b;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            org.telegram.ui.Components.tc.a0(U).Q(R.raw.fire_on, 36, launchActivity2.getString(R.string.UniqueGiftNotFoundBurned)).j();
                        } else {
                            org.telegram.ui.Components.tc.a0(U).Q(R.raw.error, 36, launchActivity2.getString(R.string.UniqueGiftNotFound)).j();
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
                        jh.h5 h5Var = new jh.h5(launchActivity2, this.f39147e, 0L, null, null);
                        h5Var.h2(str2, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (U2 != null) {
                            if (U2.getLastStoryViewer() != null && U2.getLastStoryViewer().G0) {
                                U2.getLastStoryViewer().showDialog(h5Var);
                            } else {
                                U2.showDialog(h5Var);
                            }
                        } else {
                            h5Var.show();
                        }
                    }
                }
                try {
                    x60Var.run();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }

    public i80(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, x60 x60Var) {
        this.f39145b = launchActivity;
        this.f39146c = tL_error;
        this.d = tLObject;
        this.f39147e = i10;
        this.f39148f = str;
        this.h = x60Var;
    }
}
