package org.telegram.ui.Stars;

import androidx.core.util.Consumer;
import com.android.billingclient.api.BillingResult;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Business.ChatbotSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Premium.boosts.BoostRepository$$ExternalSyntheticLambda47;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda10;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public final class StarsController$$ExternalSyntheticLambda140 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public StarsController$$ExternalSyntheticLambda140(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                int i = ((BillingResult) this.f$0).zza;
                boolean z = i == 0;
                AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda8((BotBiometry$$ExternalSyntheticLambda10) this.f$1, z, z ? null : BillingController.getResponseCodeString(i), 9));
                break;
            case 1:
                if (((BillingResult) this.f$0).zza == 0) {
                    AndroidUtilities.runOnUIThread(new BoostRepository$$ExternalSyntheticLambda47(1, (Utilities.Callback) this.f$1));
                }
                break;
            case 2:
                if (((BillingResult) this.f$0).zza == 0) {
                    AndroidUtilities.runOnUIThread(new ChatbotSheet$$ExternalSyntheticLambda0((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$1, 29));
                }
                break;
            case 3:
                int i2 = ((BillingResult) this.f$0).zza;
                boolean z2 = i2 == 0;
                AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda8((StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4) this.f$1, z2, z2 ? null : BillingController.getResponseCodeString(i2), 10));
                break;
            default:
                ((StoryRecorder.AnonymousClass24) this.f$0).lambda$new$10((PersistColorPalette) this.f$1, (Integer) obj);
                break;
        }
    }
}
