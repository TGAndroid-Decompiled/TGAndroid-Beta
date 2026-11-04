package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class lt0 implements Runnable {
    public final int f47436a;
    public final ProfileActivity f47437b;
    public final TLRPC.User f47438c;

    public lt0(ProfileActivity profileActivity, TLRPC.User user, int i3) {
        this.f47436a = i3;
        this.f47437b = profileActivity;
        this.f47438c = user;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f47436a) {
            case 0:
                ProfileActivity profileActivity = this.f47437b;
                TLRPC.User user = this.f47438c;
                RectF rectF = ProfileActivity.T6;
                profileActivity.getClass();
                profileActivity.presentFragment(wm.ra(user.f27150id));
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f47437b;
                TLRPC.User user2 = this.f47438c;
                RectF rectF2 = ProfileActivity.T6;
                if (profileActivity2.getParentActivity() != null) {
                    TLRPC.UserFull userFull = profileActivity2.f41868v2;
                    if (userFull != null && userFull.video_calls_available) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.voip.n1.m(user2, false, z10, profileActivity2.getParentActivity(), profileActivity2.f41868v2, profileActivity2.getAccountInstance());
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity3 = this.f47437b;
                TLRPC.User user3 = this.f47438c;
                RectF rectF3 = ProfileActivity.T6;
                if (profileActivity3.getParentActivity() != null) {
                    TLRPC.UserFull userFull2 = profileActivity3.f41868v2;
                    if (userFull2 != null && userFull2.video_calls_available) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.voip.n1.m(user3, true, z11, profileActivity3.getParentActivity(), profileActivity3.f41868v2, profileActivity3.getAccountInstance());
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity4 = this.f47437b;
                TLRPC.User user4 = this.f47438c;
                RectF rectF4 = ProfileActivity.T6;
                try {
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + user4.phone));
                    intent.addFlags(268435456);
                    profileActivity4.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                ProfileActivity profileActivity5 = this.f47437b;
                TLRPC.User user5 = this.f47438c;
                RectF rectF5 = ProfileActivity.T6;
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "+" + user5.phone));
                    if (org.telegram.messenger.g0.I3()) {
                        org.telegram.ui.Components.fc.a0(profileActivity5).i(org.telegram.messenger.bd.M0(2131747303, null)).j();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
