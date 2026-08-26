package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Stars.StarGiftSheet;

public final class LaunchActivity$$ExternalSyntheticLambda119 implements Runnable {
    public final int $r8$classId = 0;
    public final LaunchActivity f$0;
    public final TLObject f$1;
    public final int f$2;
    public final String f$3;
    public final TLRPC.TL_error f$4;
    public final LaunchActivity$$ExternalSyntheticLambda13 f$5;

    public LaunchActivity$$ExternalSyntheticLambda119(LaunchActivity launchActivity, TLObject tLObject, int i, String str, TLRPC.TL_error tL_error, LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13) {
        this.f$0 = launchActivity;
        this.f$1 = tLObject;
        this.f$2 = i;
        this.f$3 = str;
        this.f$4 = tL_error;
        this.f$5 = launchActivity$$ExternalSyntheticLambda13;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13 = this.f$5;
                LaunchActivity launchActivity = this.f$0;
                launchActivity.getClass();
                TLObject tLObject = this.f$1;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.f$2).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    launchActivity.presentFragment(new ChatActivity(bundle));
                } else {
                    StringBuilder sb = new StringBuilder("cant import contact token. token=");
                    sb.append(this.f$3);
                    sb.append(" err=");
                    TLRPC.TL_error tL_error = this.f$4;
                    sb.append(tL_error == null ? null : tL_error.text);
                    FileLog.e(sb.toString());
                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.NoUsernameFound, BulletinFactory.of((BaseFragment) zziq.m(1, launchActivity.mainFragmentsStack)), null);
                }
                try {
                    launchActivity$$ExternalSyntheticLambda13.run();
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            default:
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda14 = this.f$5;
                LaunchActivity launchActivity2 = this.f$0;
                launchActivity2.getClass();
                TLRPC.TL_error tL_error2 = this.f$4;
                if (tL_error2 != null) {
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error2.text)) {
                            BulletinFactory.of(safeLastFragment).createSimpleBulletinWithIconSize(R.raw.fire_on, 36, launchActivity2.getString(R.string.UniqueGiftNotFoundBurned)).show();
                        } else {
                            BulletinFactory.of(safeLastFragment).createSimpleBulletinWithIconSize(R.raw.error, 36, launchActivity2.getString(R.string.UniqueGiftNotFound)).show();
                        }
                    }
                } else {
                    TLObject tLObject2 = this.f$1;
                    if (tLObject2 instanceof TL_stars.TL_payments_uniqueStarGift) {
                        TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject2;
                        MessagesController.getInstance(launchActivity2.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
                        MessagesController.getInstance(launchActivity2.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
                        BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                        TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                            StarGiftSheet starGiftSheet = new StarGiftSheet(this.f$2, launchActivity2, null, 0L, null);
                            starGiftSheet.set(this.f$3, tL_starGiftUnique, null);
                            if (safeLastFragment2 == null) {
                                starGiftSheet.show();
                            } else if (safeLastFragment2.getLastStoryViewer() == null || !safeLastFragment2.getLastStoryViewer().fullyVisible) {
                                safeLastFragment2.showDialog(starGiftSheet);
                            } else {
                                safeLastFragment2.getLastStoryViewer().showDialog(starGiftSheet);
                            }
                        }
                    }
                }
                try {
                    launchActivity$$ExternalSyntheticLambda14.run();
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda119(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i, String str, LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13) {
        this.f$0 = launchActivity;
        this.f$4 = tL_error;
        this.f$1 = tLObject;
        this.f$2 = i;
        this.f$3 = str;
        this.f$5 = launchActivity$$ExternalSyntheticLambda13;
    }
}
