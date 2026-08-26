package org.telegram.ui.Stars;

import android.content.Context;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import java.util.Calendar;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda54;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.LaunchActivity;

public final class StarsController$$ExternalSyntheticLambda53 implements Runnable {
    public final int $r8$classId = 1;
    public final StarsController f$0;
    public final TLObject f$1;
    public final long f$10;
    public final TLRPC.TL_error f$2;
    public final Utilities.Callback2 f$3;
    public final Context f$4;
    public final Theme.ResourcesProvider f$5;
    public final long f$6;
    public final String f$7;
    public final TLObject f$8;
    public final TLObject f$9;

    public StarsController$$ExternalSyntheticLambda53(StarsController starsController, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, Theme.ResourcesProvider resourcesProvider, long j, String str, long j2, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f$0 = starsController;
        this.f$1 = tLObject;
        this.f$2 = tL_error;
        this.f$3 = callback2;
        this.f$4 = context;
        this.f$5 = resourcesProvider;
        this.f$6 = j;
        this.f$7 = str;
        this.f$10 = j2;
        this.f$8 = tLObject2;
        this.f$9 = tL_textWithEntities;
    }

    @Override
    public final void run() {
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
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.f$8;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f$9;
                long j2 = this.f$10;
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
                            StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, j, 6, str, new ChatActivity$$ExternalSyntheticLambda54(starsController, zArr, tL_payments_paymentFormStarGift, tL_starGiftUnique, j2, callback2), 0L);
                            starsNeededSheet.setOnDismissListener(new StarsController$$ExternalSyntheticLambda16(callback2, zArr, 2));
                            starsNeededSheet.show();
                        }
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        callback2.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                    } else {
                        callback2.run(Boolean.FALSE, null);
                        zzkh.m(R.string.UnknownErrorCode, new Object[]{tL_error != null ? tL_error.text : "FAILED_SEND_STARS"}, bulletinFactoryGlobal, R.raw.error);
                    }
                    break;
                } else {
                    Utilities.stageQueue.postRunnable(new StarsController$$ExternalSyntheticLambda12(starsController, (TLRPC.TL_payments_paymentResult) tLObject, 4));
                    starsController.giftsLoaded = false;
                    starsController.giftsCacheLoaded = true;
                    starsController.giftsRemoteTime = 0L;
                    starsController.loadStarGifts();
                    starsController.invalidateProfileGifts(j2);
                    starsController.invalidateTransactions(true);
                    callback2.run(Boolean.TRUE, null);
                    if (BirthdayController.getInstance(starsController.currentAccount).contains(j2)) {
                        MessagesController.getInstance(starsController.currentAccount).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j2, false).apply();
                    }
                    MessagesController.getInstance(starsController.currentAccount).getMainSettings().edit().putBoolean("show_gift_for_" + j2, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j2, true).apply();
                    LaunchActivity launchActivity = LaunchActivity.instance;
                    if (launchActivity != null && launchActivity.getFireworksOverlay() != null) {
                        LaunchActivity.instance.getFireworksOverlay().start(true);
                        break;
                    }
                }
                break;
            default:
                StarsController starsController2 = this.f$0;
                TLObject tLObject2 = this.f$1;
                TLRPC.TL_error tL_error2 = this.f$2;
                Utilities.Callback2 callback3 = this.f$3;
                Context context2 = this.f$4;
                Theme.ResourcesProvider resourcesProvider2 = this.f$5;
                long j3 = this.f$6;
                String str2 = this.f$7;
                long j4 = this.f$10;
                TLObject tLObject3 = this.f$8;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f$9;
                starsController2.getClass();
                BaseFragment lastFragment2 = LaunchActivity.getLastFragment();
                BulletinFactory bulletinFactoryGlobal2 = (lastFragment2 == null || lastFragment2.visibleDialog != null) ? BulletinFactory.global() : BulletinFactory.of(lastFragment2);
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(starsController2.currentAccount).starsPurchaseAvailable()) {
                            callback3.run(Boolean.FALSE, null);
                            StarsController.showNoSupportDialog(context2, resourcesProvider2);
                        } else {
                            boolean[] zArr2 = {false};
                            StarsIntroActivity.StarsNeededSheet starsNeededSheet2 = new StarsIntroActivity.StarsNeededSheet(context2, resourcesProvider2, j3, 6, str2, new ChatActivity$$ExternalSyntheticLambda54(starsController2, zArr2, j4, tLObject3, tL_textWithEntities, callback3, 4), 0L);
                            starsNeededSheet2.setOnDismissListener(new StarsController$$ExternalSyntheticLambda16(callback3, zArr2, 0));
                            starsNeededSheet2.show();
                        }
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        callback3.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                    } else {
                        callback3.run(Boolean.FALSE, null);
                        zzkh.m(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, bulletinFactoryGlobal2, R.raw.error);
                    }
                    break;
                } else {
                    Utilities.stageQueue.postRunnable(new StarsController$$ExternalSyntheticLambda12(starsController2, (TLRPC.TL_payments_paymentResult) tLObject2, 3));
                    starsController2.invalidateTransactions(true);
                    callback3.run(Boolean.TRUE, null);
                    if (BirthdayController.getInstance(starsController2.currentAccount).contains(j4)) {
                        MessagesController.getInstance(starsController2.currentAccount).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j4, false).apply();
                    }
                    MessagesController.getInstance(starsController2.currentAccount).getMainSettings().edit().putBoolean("show_gift_for_" + j4, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j4, true).apply();
                    LaunchActivity launchActivity2 = LaunchActivity.instance;
                    if (launchActivity2 != null && launchActivity2.getFireworksOverlay() != null) {
                        LaunchActivity.instance.getFireworksOverlay().start(true);
                        break;
                    }
                }
                break;
        }
    }

    public StarsController$$ExternalSyntheticLambda53(StarsController starsController, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, Theme.ResourcesProvider resourcesProvider, long j, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j2) {
        this.f$0 = starsController;
        this.f$1 = tLObject;
        this.f$2 = tL_error;
        this.f$3 = callback2;
        this.f$4 = context;
        this.f$5 = resourcesProvider;
        this.f$6 = j;
        this.f$7 = str;
        this.f$8 = tL_payments_paymentFormStarGift;
        this.f$9 = tL_starGiftUnique;
        this.f$10 = j2;
    }
}
