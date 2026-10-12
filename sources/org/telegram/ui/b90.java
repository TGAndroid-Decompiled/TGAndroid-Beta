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
    public final int f36112a = 0;
    public final LaunchActivity f36113b;
    public final TLRPC.TL_error f36114c;
    public final TLObject d;
    public final int f36115e;
    public final String f36116f;
    public final q70 h;

    public b90(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, q70 q70Var) {
        this.f36113b = launchActivity;
        this.d = tLObject;
        this.f36115e = i10;
        this.f36116f = str;
        this.f36114c = tL_error;
        this.h = q70Var;
    }

    @Override
    public final void run() {
        String str;
        org.telegram.ui.Components.zc a02;
        int i10;
        int i11;
        int i12 = this.f36112a;
        q70 q70Var = this.h;
        String str2 = this.f36116f;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f36114c;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity = this.f36113b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.f36115e).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f19950id);
                    launchActivity.p0(new eo(bundle));
                } else {
                    StringBuilder w10 = a1.g.w("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    w10.append(str);
                    FileLog.e(w10.toString());
                    org.telegram.messenger.am.q(R.string.NoUsernameFound, org.telegram.ui.Components.zc.a0((org.telegram.ui.ActionBar.m2) hg.c.h(1, launchActivity.f33622d0)), null);
                }
                try {
                    q70Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Pattern pattern2 = LaunchActivity.B1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            a02 = org.telegram.ui.Components.zc.a0(U);
                            i10 = R.raw.fire_on;
                            i11 = R.string.UniqueGiftNotFoundBurned;
                        } else {
                            a02 = org.telegram.ui.Components.zc.a0(U);
                            i10 = R.raw.error;
                            i11 = R.string.UniqueGiftNotFound;
                        }
                        org.telegram.messenger.v0.q(i11, a02, i10, 36);
                    } else {
                        return;
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity2 = this.f36113b;
                    MessagesController.getInstance(launchActivity2.O).putUsers(tL_payments_uniqueStarGift.users, false);
                    MessagesController.getInstance(launchActivity2.O).putChats(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        yh.s3 s3Var = new yh.s3(launchActivity2, this.f36115e, 0L, null, null);
                        s3Var.j2(str2, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (U2 != null) {
                            if (U2.getLastStoryViewer() != null && U2.getLastStoryViewer().K0) {
                                U2.getLastStoryViewer().showDialog(s3Var);
                            } else {
                                U2.showDialog(s3Var);
                            }
                        } else {
                            s3Var.show();
                        }
                    }
                }
                try {
                    q70Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    public b90(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, q70 q70Var) {
        this.f36113b = launchActivity;
        this.f36114c = tL_error;
        this.d = tLObject;
        this.f36115e = i10;
        this.f36116f = str;
        this.h = q70Var;
    }
}
