package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class dv0 implements Runnable {
    public final int f36685a;
    public final ProfileActivity f36686b;
    public final TLRPC.User f36687c;

    public dv0(ProfileActivity profileActivity, TLRPC.User user, int i10) {
        this.f36685a = i10;
        this.f36686b = profileActivity;
        this.f36687c = user;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f36685a) {
            case 0:
                ProfileActivity profileActivity = this.f36686b;
                TLRPC.User user = this.f36687c;
                RectF rectF = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(un.ma(user.f19943id));
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f36686b;
                TLRPC.User user2 = this.f36687c;
                RectF rectF2 = ProfileActivity.S6;
                if (profileActivity2.getParentActivity() != null) {
                    TLRPC.UserFull userFull = profileActivity2.f33922u2;
                    if (userFull != null && userFull.video_calls_available) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.voip.n1.m(user2, false, z10, profileActivity2.getParentActivity(), profileActivity2.f33922u2, profileActivity2.getAccountInstance());
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity3 = this.f36686b;
                TLRPC.User user3 = this.f36687c;
                RectF rectF3 = ProfileActivity.S6;
                if (profileActivity3.getParentActivity() != null) {
                    TLRPC.UserFull userFull2 = profileActivity3.f33922u2;
                    if (userFull2 != null && userFull2.video_calls_available) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.voip.n1.m(user3, true, z11, profileActivity3.getParentActivity(), profileActivity3.f33922u2, profileActivity3.getAccountInstance());
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity4 = this.f36686b;
                TLRPC.User user4 = this.f36687c;
                RectF rectF4 = ProfileActivity.S6;
                try {
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + user4.phone));
                    intent.addFlags(268435456);
                    profileActivity4.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                ProfileActivity profileActivity5 = this.f36686b;
                TLRPC.User user5 = this.f36687c;
                RectF rectF5 = ProfileActivity.S6;
                try {
                    ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "+" + user5.phone));
                    if (org.telegram.messenger.i0.H3()) {
                        org.telegram.ui.Components.cc.a0(profileActivity5).i(org.telegram.messenger.dd.L0(2131747311, null)).j();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
        }
    }
}
