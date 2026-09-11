package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a90 implements Runnable {
    public final int f34356a = 0;
    public final LaunchActivity f34357b;
    public final TLRPC.TL_error f34358c;
    public final TLObject d;
    public final int f34359e;
    public final String f34360f;
    public final r80 h;

    public a90(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, r80 r80Var) {
        this.f34357b = launchActivity;
        this.d = tLObject;
        this.f34359e = i10;
        this.f34360f = str;
        this.f34358c = tL_error;
        this.h = r80Var;
    }

    @Override
    public final void run() {
        String str;
        org.telegram.ui.Components.yc a02;
        int i10;
        int i11;
        int i12 = this.f34356a;
        r80 r80Var = this.h;
        String str2 = this.f34360f;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f34358c;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity = this.f34357b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.f34359e).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20016id);
                    launchActivity.p0(new co(bundle));
                } else {
                    StringBuilder v = a4.a.v("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    v.append(str);
                    FileLog.e(v.toString());
                    org.telegram.messenger.w1.p(R.string.NoUsernameFound, org.telegram.ui.Components.yc.a0((org.telegram.ui.ActionBar.n2) i2.g.h(1, launchActivity.f33429d0)), null);
                }
                try {
                    r80Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Pattern pattern2 = LaunchActivity.B1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            a02 = org.telegram.ui.Components.yc.a0(U);
                            i10 = R.raw.fire_on;
                            i11 = R.string.UniqueGiftNotFoundBurned;
                        } else {
                            a02 = org.telegram.ui.Components.yc.a0(U);
                            i10 = R.raw.error;
                            i11 = R.string.UniqueGiftNotFound;
                        }
                        org.telegram.messenger.w1.o(i11, a02, i10, 36);
                    } else {
                        return;
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity2 = this.f34357b;
                    MessagesController.getInstance(launchActivity2.O).putUsers(tL_payments_uniqueStarGift.users, false);
                    MessagesController.getInstance(launchActivity2.O).putChats(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        zh.w3 w3Var = new zh.w3(launchActivity2, this.f34359e, 0L, null, null);
                        w3Var.h2(str2, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (U2 != null) {
                            if (U2.getLastStoryViewer() != null && U2.getLastStoryViewer().K0) {
                                U2.getLastStoryViewer().showDialog(w3Var);
                            } else {
                                U2.showDialog(w3Var);
                            }
                        } else {
                            w3Var.show();
                        }
                    }
                }
                try {
                    r80Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    public a90(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, r80 r80Var) {
        this.f34357b = launchActivity;
        this.f34358c = tL_error;
        this.d = tLObject;
        this.f34359e = i10;
        this.f34360f = str;
        this.h = r80Var;
    }
}
