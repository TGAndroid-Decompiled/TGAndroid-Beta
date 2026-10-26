package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class m80 implements Runnable {
    public final int f41491a = 1;
    public final LaunchActivity f41492b;
    public final TLObject f41493c;
    public final int d;
    public final String e;
    public final TLRPC.TL_error f41494f;
    public final sz h;

    public m80(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, sz szVar) {
        this.f41492b = launchActivity;
        this.f41493c = tLObject;
        this.d = i10;
        this.e = str;
        this.f41494f = tL_error;
        this.h = szVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.wc b02;
        int i10;
        int i11;
        String str;
        int i12 = this.f41491a;
        sz szVar = this.h;
        TLRPC.TL_error tL_error = this.f41494f;
        String str2 = this.e;
        TLObject tLObject = this.f41493c;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            b02 = org.telegram.ui.Components.wc.b0(U);
                            i10 = R.raw.fire_on;
                            i11 = R.string.UniqueGiftNotFoundBurned;
                        } else {
                            b02 = org.telegram.ui.Components.wc.b0(U);
                            i10 = R.raw.error;
                            i11 = R.string.UniqueGiftNotFound;
                        }
                        org.telegram.messenger.t.q(i11, b02, i10, 36);
                    } else {
                        return;
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity = this.f41492b;
                    MessagesController.getInstance(launchActivity.O).putUsers(tL_payments_uniqueStarGift.users, false);
                    MessagesController.getInstance(launchActivity.O).putChats(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        bi.h7 h7Var = new bi.h7(launchActivity, this.d, 0L, null, null);
                        h7Var.J2(str2, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (U2 != null) {
                            if (U2.getLastStoryViewer() != null && U2.getLastStoryViewer().K0) {
                                U2.getLastStoryViewer().showDialog(h7Var);
                            } else {
                                U2.showDialog(h7Var);
                            }
                        } else {
                            h7Var.show();
                        }
                    }
                }
                try {
                    szVar.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                Pattern pattern2 = LaunchActivity.D1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity2 = this.f41492b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.d).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f22176id);
                    launchActivity2.u0(new un(bundle));
                } else {
                    StringBuilder v = a1.g.v("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    v.append(str);
                    FileLog.e(v.toString());
                    org.telegram.messenger.vh.n(R.string.NoUsernameFound, org.telegram.ui.Components.wc.b0((org.telegram.ui.ActionBar.r2) ic.a.g(1, launchActivity2.f35529d0)), null);
                }
                try {
                    szVar.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    public m80(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, sz szVar) {
        this.f41492b = launchActivity;
        this.f41494f = tL_error;
        this.f41493c = tLObject;
        this.d = i10;
        this.e = str;
        this.h = szVar;
    }
}
