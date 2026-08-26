package org.telegram.ui;

import androidx.core.util.Consumer;
import com.android.billingclient.api.BillingResult;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.JoinGroupAlert$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.PasscodeView$9$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public final class AvatarPreviewer$Layout$$ExternalSyntheticLambda2 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public AvatarPreviewer$Layout$$ExternalSyntheticLambda2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                AvatarPreviewer.Layout layout = (AvatarPreviewer.Layout) this.f$0;
                if (!layout.recycled) {
                    boolean z = obj instanceof TLRPC.UserFull;
                    AvatarPreviewer.Data data = (AvatarPreviewer.Data) this.f$1;
                    AvatarPreviewer.MenuItem[] menuItemArr = data.menuItems;
                    AvatarPreviewer.InfoLoadTask infoLoadTask = data.infoLoadTask;
                    if (z) {
                        layout.setData(AvatarPreviewer.Data.of((TLRPC.User) infoLoadTask.argument, (TLRPC.UserFull) obj, menuItemArr));
                    } else if (obj instanceof TLRPC.ChatFull) {
                        layout.setData(AvatarPreviewer.Data.of((TLRPC.Chat) infoLoadTask.argument, (TLRPC.ChatFull) obj, menuItemArr));
                    }
                }
                break;
            case 1:
                if (((BillingResult) this.f$0).zza == 0) {
                    AndroidUtilities.runOnUIThread(new CacheControlActivity$$ExternalSyntheticLambda3(2, (Utilities.Callback) this.f$1));
                }
                break;
            case 2:
                if (((BillingResult) this.f$0).zza == 0) {
                    AndroidUtilities.runOnUIThread(new PasscodeView$9$$ExternalSyntheticLambda0((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$1, 23));
                }
                break;
            case 3:
                int i = ((BillingResult) this.f$0).zza;
                boolean z2 = i == 0;
                AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda8((JoinGroupAlert$$ExternalSyntheticLambda3) this.f$1, z2, z2 ? null : BillingController.getResponseCodeString(i), 5));
                break;
            case 4:
                int i2 = ((BillingResult) this.f$0).zza;
                boolean z3 = i2 == 0;
                AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda8((OAuthSheet$$ExternalSyntheticLambda18) this.f$1, z3, z3 ? null : BillingController.getResponseCodeString(i2), 6));
                break;
            default:
                ((StoryRecorder.AnonymousClass24) this.f$0).lambda$new$10((PersistColorPalette) this.f$1, (Integer) obj);
                break;
        }
    }
}
