package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class b90 implements Runnable {
    public final int f32074a = 0;
    public final LaunchActivity f32075b;
    public final TLRPC.TL_error f32076c;
    public final TLObject d;
    public final int e;
    public final String f32077f;
    public final oa0 h;

    public b90(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, oa0 oa0Var) {
        this.f32075b = launchActivity;
        this.d = tLObject;
        this.e = i10;
        this.f32077f = str;
        this.f32076c = tL_error;
        this.h = oa0Var;
    }

    @Override
    public final void run() {
        String str;
        org.telegram.ui.Components.vc a02;
        int i10;
        int i11;
        int i12 = this.f32074a;
        oa0 oa0Var = this.h;
        String str2 = this.f32077f;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f32076c;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity = this.f32075b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.e).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f18268id);
                    launchActivity.p0(new bo(bundle));
                } else {
                    StringBuilder v = a4.a.v("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    v.append(str);
                    FileLog.e(v.toString());
                    org.telegram.messenger.w1.p(R.string.NoUsernameFound, org.telegram.ui.Components.vc.a0((org.telegram.ui.ActionBar.o2) hg.k0.h(1, launchActivity.f30834d0)), null);
                }
                try {
                    oa0Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                Pattern pattern2 = LaunchActivity.B1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            a02 = org.telegram.ui.Components.vc.a0(U);
                            i10 = R.raw.fire_on;
                            i11 = R.string.UniqueGiftNotFoundBurned;
                        } else {
                            a02 = org.telegram.ui.Components.vc.a0(U);
                            i10 = R.raw.error;
                            i11 = R.string.UniqueGiftNotFound;
                        }
                        org.telegram.messenger.w1.o(i11, a02, i10, 36);
                    } else {
                        return;
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity2 = this.f32075b;
                    MessagesController.getInstance(launchActivity2.O).putUsers(tL_payments_uniqueStarGift.users, false);
                    MessagesController.getInstance(launchActivity2.O).putChats(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        yh.a4 a4Var = new yh.a4(launchActivity2, this.e, 0L, null, null);
                        a4Var.h2(str2, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (U2 != null) {
                            if (U2.getLastStoryViewer() != null && U2.getLastStoryViewer().K0) {
                                U2.getLastStoryViewer().showDialog(a4Var);
                            } else {
                                U2.showDialog(a4Var);
                            }
                        } else {
                            a4Var.show();
                        }
                    }
                }
                try {
                    oa0Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    public b90(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, oa0 oa0Var) {
        this.f32075b = launchActivity;
        this.f32076c = tL_error;
        this.d = tLObject;
        this.e = i10;
        this.f32077f = str;
        this.h = oa0Var;
    }
}
