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

    public final int f39282a = 0;

    public final LaunchActivity f39283b;

    public final TLRPC.TL_error f39284c;
    public final TLObject d;

    public final int f39285e;

    public final String f39286f;
    public final a30 h;

    public j80(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, a30 a30Var) {
        this.f39283b = launchActivity;
        this.d = tLObject;
        this.f39285e = i10;
        this.f39286f = str;
        this.f39284c = tL_error;
        this.h = a30Var;
    }

    @Override
    public final void run() {
        int i10 = this.f39282a;
        a30 a30Var = this.h;
        String str = this.f39286f;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f39284c;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f35496x1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity = this.f39283b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.f39285e).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f22527id);
                    launchActivity.p0(new rn(bundle));
                } else {
                    StringBuilder sbR = a9.p.r("cant import contact token. token=", str, " err=");
                    sbR.append(tL_error == null ? null : tL_error.text);
                    FileLog.e(sbR.toString());
                    org.telegram.messenger.y1.r(R.string.NoUsernameFound, org.telegram.ui.Components.mc.a0((org.telegram.ui.ActionBar.n2) i0.a.i(1, launchActivity.Z)), null);
                }
                try {
                    a30Var.run();
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.f35496x1;
                LaunchActivity launchActivity2 = this.f39283b;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                    if (n2VarU != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            org.telegram.ui.Components.mc.a0(n2VarU).Q(R.raw.fire_on, 36, launchActivity2.getString(R.string.UniqueGiftNotFoundBurned)).j();
                        } else {
                            org.telegram.ui.Components.mc.a0(n2VarU).Q(R.raw.error, 36, launchActivity2.getString(R.string.UniqueGiftNotFound)).j();
                        }
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    MessagesController.getInstance(launchActivity2.K).putUsers(tL_payments_uniqueStarGift.users, false);
                    MessagesController.getInstance(launchActivity2.K).putChats(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        hh.i5 i5Var = new hh.i5(launchActivity2, this.f39285e, 0L, null, null);
                        i5Var.h2(str, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (n2VarU2 == null) {
                            i5Var.show();
                        } else if (n2VarU2.getLastStoryViewer() == null || !n2VarU2.getLastStoryViewer().G0) {
                            n2VarU2.showDialog(i5Var);
                        } else {
                            n2VarU2.getLastStoryViewer().showDialog(i5Var);
                        }
                    }
                }
                try {
                    a30Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                break;
        }
    }

    public j80(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, a30 a30Var) {
        this.f39283b = launchActivity;
        this.f39284c = tL_error;
        this.d = tLObject;
        this.f39285e = i10;
        this.f39286f = str;
        this.h = a30Var;
    }
}
