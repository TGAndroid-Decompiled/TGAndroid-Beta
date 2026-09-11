package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class iy0 implements Runnable {
    public final int f37454a;
    public final ProfileActivity f37455b;
    public final TLRPC.User f37456c;

    public iy0(ProfileActivity profileActivity, TLRPC.User user, int i10) {
        this.f37454a = i10;
        this.f37455b = profileActivity;
        this.f37456c = user;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f37454a) {
            case 0:
                ProfileActivity profileActivity = this.f37455b;
                TLRPC.User user = this.f37456c;
                profileActivity.getClass();
                profileActivity.presentFragment(co.R9(user.f20016id));
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f37455b;
                TLRPC.User user2 = this.f37456c;
                if (profileActivity2.getParentActivity() != null) {
                    TLRPC.UserFull userFull = profileActivity2.f34006v2;
                    if (userFull != null && userFull.video_calls_available) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.voip.d2.m(user2, false, z10, profileActivity2.getParentActivity(), profileActivity2.f34006v2, profileActivity2.getAccountInstance());
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity3 = this.f37455b;
                TLRPC.User user3 = this.f37456c;
                if (profileActivity3.getParentActivity() != null) {
                    TLRPC.UserFull userFull2 = profileActivity3.f34006v2;
                    if (userFull2 != null && userFull2.video_calls_available) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.voip.d2.m(user3, true, z11, profileActivity3.getParentActivity(), profileActivity3.f34006v2, profileActivity3.getAccountInstance());
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity4 = this.f37455b;
                TLRPC.User user4 = this.f37456c;
                profileActivity4.getClass();
                try {
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + user4.phone));
                    intent.addFlags(268435456);
                    profileActivity4.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                ProfileActivity profileActivity5 = this.f37455b;
                TLRPC.User user5 = this.f37456c;
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "+" + user5.phone));
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        org.telegram.ui.Components.yc.a0(profileActivity5).i(LocaleController.getString(R.string.PhoneCopied)).j();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
