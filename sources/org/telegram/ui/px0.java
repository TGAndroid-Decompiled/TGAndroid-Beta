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
public final class px0 implements Runnable {
    public final int f40172a;
    public final ProfileActivity f40173b;
    public final TLRPC.User f40174c;

    public px0(ProfileActivity profileActivity, TLRPC.User user, int i10) {
        this.f40172a = i10;
        this.f40173b = profileActivity;
        this.f40174c = user;
    }

    @Override
    public final void run() {
        boolean z4;
        boolean z10;
        switch (this.f40172a) {
            case 0:
                ProfileActivity profileActivity = this.f40173b;
                TLRPC.User user = this.f40174c;
                profileActivity.getClass();
                profileActivity.presentFragment(xn.R9(user.f20990id));
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f40173b;
                TLRPC.User user2 = this.f40174c;
                if (profileActivity2.getParentActivity() != null) {
                    TLRPC.UserFull userFull = profileActivity2.f34691s2;
                    if (userFull != null && userFull.video_calls_available) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    org.telegram.ui.Components.voip.g2.n(user2, false, z4, profileActivity2.getParentActivity(), profileActivity2.f34691s2, profileActivity2.getAccountInstance());
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity3 = this.f40173b;
                TLRPC.User user3 = this.f40174c;
                if (profileActivity3.getParentActivity() != null) {
                    TLRPC.UserFull userFull2 = profileActivity3.f34691s2;
                    if (userFull2 != null && userFull2.video_calls_available) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.voip.g2.n(user3, true, z10, profileActivity3.getParentActivity(), profileActivity3.f34691s2, profileActivity3.getAccountInstance());
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity4 = this.f40173b;
                TLRPC.User user4 = this.f40174c;
                profileActivity4.getClass();
                try {
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + user4.phone));
                    intent.addFlags(268435456);
                    profileActivity4.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                ProfileActivity profileActivity5 = this.f40173b;
                TLRPC.User user5 = this.f40174c;
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "+" + user5.phone));
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        org.telegram.ui.Components.qc.a0(profileActivity5).i(LocaleController.getString(R.string.PhoneCopied)).j();
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
