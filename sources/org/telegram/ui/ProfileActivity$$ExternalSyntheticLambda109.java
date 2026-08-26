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
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.voip.VoIPHelper;

public final class ProfileActivity$$ExternalSyntheticLambda109 implements Runnable {
    public final int $r8$classId;
    public final ProfileActivity f$0;
    public final TLRPC.User f$1;

    public ProfileActivity$$ExternalSyntheticLambda109(ProfileActivity profileActivity, TLRPC.User user, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
        this.f$1 = user;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity profileActivity = this.f$0;
                if (profileActivity.getParentActivity() != null) {
                    TLRPC.UserFull userFull = profileActivity.userInfo;
                    VoIPHelper.startCall(this.f$1, false, userFull != null && userFull.video_calls_available, profileActivity.getParentActivity(), profileActivity.userInfo, profileActivity.getAccountInstance());
                    break;
                }
                break;
            case 1:
                ProfileActivity profileActivity2 = this.f$0;
                if (profileActivity2.getParentActivity() != null) {
                    TLRPC.UserFull userFull2 = profileActivity2.userInfo;
                    VoIPHelper.startCall(this.f$1, true, userFull2 != null && userFull2.video_calls_available, profileActivity2.getParentActivity(), profileActivity2.userInfo, profileActivity2.getAccountInstance());
                    break;
                }
                break;
            case 2:
                TLRPC.User user = this.f$1;
                ProfileActivity profileActivity3 = this.f$0;
                profileActivity3.getClass();
                try {
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + user.phone));
                    intent.addFlags(268435456);
                    profileActivity3.getParentActivity().startActivityForResult(intent, 500);
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 3:
                ProfileActivity profileActivity4 = this.f$0;
                TLRPC.User user2 = this.f$1;
                profileActivity4.getClass();
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "+" + user2.phone));
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        BulletinFactory.of(profileActivity4).createCopyBulletin(LocaleController.getString(R.string.PhoneCopied)).show();
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                    return;
                }
                break;
            default:
                ProfileActivity profileActivity5 = this.f$0;
                profileActivity5.getClass();
                profileActivity5.presentFragment(ChatActivity.of(this.f$1.id));
                break;
        }
    }
}
