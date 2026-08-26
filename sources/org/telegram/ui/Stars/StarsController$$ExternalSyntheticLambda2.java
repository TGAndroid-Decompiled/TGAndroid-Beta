package org.telegram.ui.Stars;

import android.content.Context;
import com.google.android.gms.internal.mlkit_vision_common.zzks;
import java.util.Calendar;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda136;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.LaunchActivity;

public final class StarsController$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId = 0;
    public final StarsController f$0;
    public final TLObject f$1;
    public final TLObject f$10;
    public final TLRPC.TL_error f$2;
    public final Utilities.Callback2 f$3;
    public final Context f$4;
    public final Theme.ResourcesProvider f$5;
    public final long f$6;
    public final String f$7;
    public final long f$8;
    public final TLObject f$9;

    public StarsController$$ExternalSyntheticLambda2(StarsController starsController, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, Theme.ResourcesProvider resourcesProvider, long j, String str, long j2, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f$0 = starsController;
        this.f$1 = tLObject;
        this.f$2 = tL_error;
        this.f$3 = callback2;
        this.f$4 = context;
        this.f$5 = resourcesProvider;
        this.f$6 = j;
        this.f$7 = str;
        this.f$8 = j2;
        this.f$9 = tLObject2;
        this.f$10 = tL_textWithEntities;
    }

    @Override
    public final void run() {
        LaunchActivity.AnonymousClass5 anonymousClass5;
        LaunchActivity.AnonymousClass5 anonymousClass6;
        switch (this.$r8$classId) {
            case 0:
                StarsController starsController = this.f$0;
                TLObject tLObject = this.f$1;
                TLRPC.TL_error tL_error = this.f$2;
                Utilities.Callback2 callback2 = this.f$3;
                Context context = this.f$4;
                Theme.ResourcesProvider resourcesProvider = this.f$5;
                long j = this.f$6;
                String str = this.f$7;
                long j2 = this.f$8;
                TLObject tLObject2 = this.f$9;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f$10;
                starsController.getClass();
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                BulletinFactory bulletinFactoryGlobal = (lastFragment == null || lastFragment.visibleDialog != null) ? BulletinFactory.global() : BulletinFactory.of(lastFragment);
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(starsController.currentAccount).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            StarsController.showNoSupportDialog(context, resourcesProvider);
                        } else {
                            boolean[] zArr = {false};
                            StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, j, 6, str, new ChatActivity$$ExternalSyntheticLambda136(starsController, zArr, j2, tLObject2, tL_textWithEntities, callback2, 4), 0L);
                            starsNeededSheet.setOnDismissListener(new StarsController$$ExternalSyntheticLambda5(callback2, zArr, 2));
                            starsNeededSheet.show();
                        }
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        callback2.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                    } else {
                        callback2.run(Boolean.FALSE, null);
                        zzks.m(R.string.UnknownErrorCode, new Object[]{tL_error != null ? tL_error.text : "FAILED_SEND_STARS"}, bulletinFactoryGlobal, R.raw.error);
                    }
                    break;
                } else {
                    Utilities.stageQueue.postRunnable(new StarsController$$ExternalSyntheticLambda6(starsController, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                    starsController.invalidateTransactions(true);
                    callback2.run(Boolean.TRUE, null);
                    if (BirthdayController.getInstance(starsController.currentAccount).contains(j2)) {
                        AiTonesController$$ExternalSyntheticOutline0.m(starsController.currentAccount).putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j2, false).apply();
                    }
                    AiTonesController$$ExternalSyntheticOutline0.m(starsController.currentAccount).putBoolean("show_gift_for_" + j2, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j2, true).apply();
                    LaunchActivity launchActivity = LaunchActivity.instance;
                    if (launchActivity != null && (anonymousClass5 = launchActivity.fireworksOverlay) != null) {
                        anonymousClass5.start(true);
                        break;
                    }
                }
                break;
            default:
                StarsController starsController2 = this.f$0;
                TLObject tLObject3 = this.f$1;
                TLRPC.TL_error tL_error2 = this.f$2;
                Utilities.Callback2 callback3 = this.f$3;
                Context context2 = this.f$4;
                Theme.ResourcesProvider resourcesProvider2 = this.f$5;
                long j3 = this.f$6;
                String str2 = this.f$7;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.f$9;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f$10;
                long j4 = this.f$8;
                starsController2.getClass();
                BaseFragment lastFragment2 = LaunchActivity.getLastFragment();
                BulletinFactory bulletinFactoryGlobal2 = (lastFragment2 == null || lastFragment2.visibleDialog != null) ? BulletinFactory.global() : BulletinFactory.of(lastFragment2);
                if (!(tLObject3 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(starsController2.currentAccount).starsPurchaseAvailable()) {
                            callback3.run(Boolean.FALSE, null);
                            StarsController.showNoSupportDialog(context2, resourcesProvider2);
                        } else {
                            boolean[] zArr2 = {false};
                            StarsIntroActivity.StarsNeededSheet starsNeededSheet2 = new StarsIntroActivity.StarsNeededSheet(context2, resourcesProvider2, j3, 6, str2, new ChatActivity$$ExternalSyntheticLambda136(starsController2, zArr2, tL_payments_paymentFormStarGift, tL_starGiftUnique, j4, callback3), 0L);
                            starsNeededSheet2.setOnDismissListener(new StarsController$$ExternalSyntheticLambda5(callback3, zArr2, 0));
                            starsNeededSheet2.show();
                        }
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        callback3.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                    } else {
                        callback3.run(Boolean.FALSE, null);
                        zzks.m(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, bulletinFactoryGlobal2, R.raw.error);
                    }
                    break;
                } else {
                    Utilities.stageQueue.postRunnable(new StarsController$$ExternalSyntheticLambda6(starsController2, (TLRPC.TL_payments_paymentResult) tLObject3, 0));
                    starsController2.giftsLoaded = false;
                    starsController2.giftsCacheLoaded = true;
                    starsController2.giftsRemoteTime = 0L;
                    starsController2.loadStarGifts();
                    starsController2.invalidateProfileGifts(j4);
                    starsController2.invalidateTransactions(true);
                    callback3.run(Boolean.TRUE, null);
                    if (BirthdayController.getInstance(starsController2.currentAccount).contains(j4)) {
                        AiTonesController$$ExternalSyntheticOutline0.m(starsController2.currentAccount).putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j4, false).apply();
                    }
                    AiTonesController$$ExternalSyntheticOutline0.m(starsController2.currentAccount).putBoolean("show_gift_for_" + j4, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j4, true).apply();
                    LaunchActivity launchActivity2 = LaunchActivity.instance;
                    if (launchActivity2 != null && (anonymousClass6 = launchActivity2.fireworksOverlay) != null) {
                        anonymousClass6.start(true);
                        break;
                    }
                }
                break;
        }
    }

    public StarsController$$ExternalSyntheticLambda2(StarsController starsController, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, Theme.ResourcesProvider resourcesProvider, long j, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j2) {
        this.f$0 = starsController;
        this.f$1 = tLObject;
        this.f$2 = tL_error;
        this.f$3 = callback2;
        this.f$4 = context;
        this.f$5 = resourcesProvider;
        this.f$6 = j;
        this.f$7 = str;
        this.f$9 = tL_payments_paymentFormStarGift;
        this.f$10 = tL_starGiftUnique;
        this.f$8 = j2;
    }
}
