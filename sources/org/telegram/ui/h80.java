package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class h80 implements Runnable {
    public final int f37542a = 1;
    public final LaunchActivity f37543b;
    public final TLObject f37544c;
    public final int d;
    public final String e;
    public final TLRPC.TL_error f37545f;
    public final z70 h;

    public h80(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, z70 z70Var) {
        this.f37543b = launchActivity;
        this.f37544c = tLObject;
        this.d = i10;
        this.e = str;
        this.f37545f = tL_error;
        this.h = z70Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xc a02;
        int i10;
        int i11;
        String str;
        int i12 = this.f37542a;
        z70 z70Var = this.h;
        TLRPC.TL_error tL_error = this.f37545f;
        String str2 = this.e;
        TLObject tLObject = this.f37544c;
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
                    LaunchActivity launchActivity = this.f37543b;
                    MessagesController.getInstance(launchActivity.O).putUsers(tL_payments_uniqueStarGift.users, false);
                    MessagesController.getInstance(launchActivity.O).putChats(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        ai.l7 l7Var = new ai.l7(launchActivity, this.d, 0L, null, null);
                        l7Var.K2(str2, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (U2 != null) {
                            if (U2.getLastStoryViewer() != null && U2.getLastStoryViewer().K0) {
                                U2.getLastStoryViewer().showDialog(l7Var);
                            } else {
                                U2.showDialog(l7Var);
                            }
                        } else {
                            l7Var.show();
                        }
                    }
                }
                try {
                    z70Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                Pattern pattern2 = LaunchActivity.C1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity2 = this.f37543b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.d).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20426id);
                    launchActivity2.t0(new qn(bundle));
                } else {
                    StringBuilder v = a1.g.v("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    v.append(str);
                    FileLog.e(v.toString());
                    org.telegram.messenger.ok.q(R.string.NoUsernameFound, org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.n2) i2.e.h(1, launchActivity2.f33165d0)), null);
                }
                try {
                    z70Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    public h80(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, z70 z70Var) {
        this.f37543b = launchActivity;
        this.f37545f = tL_error;
        this.f37544c = tLObject;
        this.d = i10;
        this.e = str;
        this.h = z70Var;
    }
}
