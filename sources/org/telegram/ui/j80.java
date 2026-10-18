package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class j80 implements Runnable {
    public final int f38078a = 1;
    public final LaunchActivity f38079b;
    public final TLObject f38080c;
    public final int d;
    public final String e;
    public final TLRPC.TL_error f38081f;
    public final b80 h;

    public j80(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, b80 b80Var) {
        this.f38079b = launchActivity;
        this.f38080c = tLObject;
        this.d = i10;
        this.e = str;
        this.f38081f = tL_error;
        this.h = b80Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xc a02;
        int i10;
        int i11;
        String str;
        int i12 = this.f38078a;
        b80 b80Var = this.h;
        TLRPC.TL_error tL_error = this.f38081f;
        String str2 = this.e;
        TLObject tLObject = this.f38080c;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.C1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            a02 = org.telegram.ui.Components.xc.a0(U);
                            i10 = R.raw.fire_on;
                            i11 = R.string.UniqueGiftNotFoundBurned;
                        } else {
                            a02 = org.telegram.ui.Components.xc.a0(U);
                            i10 = R.raw.error;
                            i11 = R.string.UniqueGiftNotFound;
                        }
                        org.telegram.messenger.g0.q(i11, a02, i10, 36);
                    } else {
                        return;
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity = this.f38079b;
                    MessagesController.getInstance(launchActivity.O).putUsers(tL_payments_uniqueStarGift.users, false);
                    MessagesController.getInstance(launchActivity.O).putChats(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        ai.k7 k7Var = new ai.k7(launchActivity, this.d, 0L, null, null);
                        k7Var.D2(str2, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (U2 != null) {
                            if (U2.getLastStoryViewer() != null && U2.getLastStoryViewer().K0) {
                                U2.getLastStoryViewer().showDialog(k7Var);
                            } else {
                                U2.showDialog(k7Var);
                            }
                        } else {
                            k7Var.show();
                        }
                    }
                }
                try {
                    b80Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                Pattern pattern2 = LaunchActivity.C1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity2 = this.f38079b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.d).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20419id);
                    launchActivity2.t0(new sn(bundle));
                } else {
                    StringBuilder v = a1.g.v("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    v.append(str);
                    FileLog.e(v.toString());
                    org.telegram.messenger.lk.q(R.string.NoUsernameFound, org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.n2) i2.d.h(1, launchActivity2.f33149d0)), null);
                }
                try {
                    b80Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    public j80(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, b80 b80Var) {
        this.f38079b = launchActivity;
        this.f38081f = tL_error;
        this.f38080c = tLObject;
        this.d = i10;
        this.e = str;
        this.h = b80Var;
    }
}
