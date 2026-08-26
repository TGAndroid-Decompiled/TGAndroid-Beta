package org.telegram.ui.Stars;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class StarsIntroActivity$$ExternalSyntheticLambda95 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final boolean f$3;
    public final Object f$4;
    public final boolean f$5;
    public final Object f$6;

    public StarsIntroActivity$$ExternalSyntheticLambda95(int i, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, ButtonWithCounterView buttonWithCounterView, boolean z, boolean z2, BottomSheet[] bottomSheetArr) {
        this.f$0 = buttonWithCounterView;
        this.f$1 = bottomSheetArr;
        this.f$2 = i;
        this.f$3 = z;
        this.f$4 = starsSubscription;
        this.f$5 = z2;
        this.f$6 = tLObject;
    }

    @Override
    public final void run() {
        Object obj = this.f$6;
        Object obj2 = this.f$1;
        Object obj3 = this.f$4;
        Object obj4 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((ButtonWithCounterView) obj4).setLoading(false);
                BottomSheet bottomSheet = ((BottomSheet[]) obj2)[0];
                if (bottomSheet != null) {
                    bottomSheet.lambda$showGiftOfferSheet$15();
                }
                StarsController.getInstance(this.f$2, false).invalidateSubscriptions();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                    BulletinFactory.of(safeLastFragment).createUsersBulletin(Collections.singletonList((TLObject) obj), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags((!this.f$3 || TextUtils.isEmpty(starsSubscription.title)) ? (!this.f$5 || TextUtils.isEmpty(starsSubscription.title)) ? LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date)) : LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title) : LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title))).show(false);
                }
                break;
            default:
                ((SendMessagesHelper) obj4).lambda$performSendMessageRequest$95(this.f$3, (TLRPC.Message) obj2, (ArrayList) obj3, this.f$5, (ArrayList) obj, this.f$2);
                break;
        }
    }

    public StarsIntroActivity$$ExternalSyntheticLambda95(SendMessagesHelper sendMessagesHelper, boolean z, TLRPC.Message message, ArrayList arrayList, boolean z2, ArrayList arrayList2, int i) {
        this.f$0 = sendMessagesHelper;
        this.f$3 = z;
        this.f$1 = message;
        this.f$4 = arrayList;
        this.f$5 = z2;
        this.f$6 = arrayList2;
        this.f$2 = i;
    }
}
