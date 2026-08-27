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

public final class dx0 implements Runnable {

    public final int f37566a;

    public final ProfileActivity f37567b;

    public final TLRPC.User f37568c;

    public dx0(ProfileActivity profileActivity, TLRPC.User user, int i10) {
        this.f37566a = i10;
        this.f37567b = profileActivity;
        this.f37568c = user;
    }

    @Override
    public final void run() {
        switch (this.f37566a) {
            case 0:
                ProfileActivity profileActivity = this.f37567b;
                TLRPC.User user = this.f37568c;
                profileActivity.getClass();
                profileActivity.presentFragment(rn.R9(user.f22527id));
                break;
            case 1:
                ProfileActivity profileActivity2 = this.f37567b;
                TLRPC.User user2 = this.f37568c;
                if (profileActivity2.getParentActivity() != null) {
                    TLRPC.UserFull userFull = profileActivity2.f36043r2;
                    org.telegram.ui.Components.voip.e2.n(user2, false, userFull != null && userFull.video_calls_available, profileActivity2.getParentActivity(), profileActivity2.f36043r2, profileActivity2.getAccountInstance());
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity3 = this.f37567b;
                TLRPC.User user3 = this.f37568c;
                if (profileActivity3.getParentActivity() != null) {
                    TLRPC.UserFull userFull2 = profileActivity3.f36043r2;
                    org.telegram.ui.Components.voip.e2.n(user3, true, userFull2 != null && userFull2.video_calls_available, profileActivity3.getParentActivity(), profileActivity3.f36043r2, profileActivity3.getAccountInstance());
                    break;
                }
                break;
            case 3:
                ProfileActivity profileActivity4 = this.f37567b;
                TLRPC.User user4 = this.f37568c;
                profileActivity4.getClass();
                try {
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + user4.phone));
                    intent.addFlags(268435456);
                    profileActivity4.getParentActivity().startActivityForResult(intent, 500);
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            default:
                ProfileActivity profileActivity5 = this.f37567b;
                TLRPC.User user5 = this.f37568c;
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "+" + user5.phone));
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        org.telegram.ui.Components.mc.a0(profileActivity5).i(LocaleController.getString(R.string.PhoneCopied)).j();
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                break;
        }
    }
}
