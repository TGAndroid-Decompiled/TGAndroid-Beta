package org.telegram.ui;

import com.android.billingclient.api.AccountIdentifiers;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.HashtagsSearchAdapter;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.Premium.boosts.BoostRepository$$ExternalSyntheticLambda11;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.ShareTopView;
import org.telegram.ui.web.BotWebViewContainer;

public final class ProfileActivity$$ExternalSyntheticLambda75 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;

    public ProfileActivity$$ExternalSyntheticLambda75(int i, HashSet hashSet, BaseFragment baseFragment) {
        this.$r8$classId = 5;
        this.f$2 = i;
        this.f$0 = hashSet;
        this.f$1 = baseFragment;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                profileActivity.getClass();
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda127(profileActivity, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f$1, 0), this.f$2);
                break;
            case 1:
                ((VoIPService) this.f$0).lambda$editCallMember$90(this.f$2, (Runnable) this.f$1, tLObject, tL_error);
                break;
            case 2:
                ((VoIPService) this.f$0).lambda$startConferenceGroupCall$34(this.f$2, (String) this.f$1, tLObject, tL_error);
                break;
            case 3:
                SearchViewPager.AnonymousClass1 anonymousClass1 = (SearchViewPager.AnonymousClass1) this.f$0;
                anonymousClass1.getClass();
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda71(anonymousClass1, this.f$2, tLObject, (String) this.f$1, 5));
                break;
            case 4:
                CallLogActivity.AnonymousClass9 anonymousClass9 = (CallLogActivity.AnonymousClass9) this.f$0;
                anonymousClass9.getClass();
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda71(anonymousClass9, tLObject, this.f$2, (TLRPC.User) this.f$1, 8));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new WearAuthSheet$$ExternalSyntheticLambda3(tLObject, this.f$2, (HashSet) this.f$0, tL_error, (BaseFragment) this.f$1, 11));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda71((BaseFragment) this.f$0, tLObject, this.f$2, (Utilities.Callback) this.f$1, 15));
                break;
            case 7:
                HashtagsSearchAdapter hashtagsSearchAdapter = (HashtagsSearchAdapter) this.f$0;
                hashtagsSearchAdapter.getClass();
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda71(hashtagsSearchAdapter, this.f$2, tLObject, (String) this.f$1, 17));
                break;
            case 8:
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < vector.objects.size(); i++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str = tL_premiumGiftCodeOption.store_product;
                        if (str != null) {
                            AccountIdentifiers accountIdentifiers = new AccountIdentifiers();
                            accountIdentifiers.zzb = "inapp";
                            accountIdentifiers.zza = str;
                            arrayList2.add(accountIdentifiers.build());
                        }
                    }
                    boolean zIsEmpty = arrayList2.isEmpty();
                    Utilities.Callback callback = (Utilities.Callback) this.f$1;
                    TLRPC.Chat chat = (TLRPC.Chat) this.f$0;
                    int i2 = this.f$2;
                    if (zIsEmpty || !BoostRepository.isGoogleBillingAvailable()) {
                        AndroidUtilities.runOnUIThread(new BoostRepository$$ExternalSyntheticLambda11(chat, i2, arrayList, callback, 0));
                    } else {
                        BillingController.getInstance().queryProductDetails(arrayList2, new VoIPFragment$$ExternalSyntheticLambda37(arrayList, chat, i2, callback, 5));
                    }
                }
                break;
            case 9:
                ShareTopView shareTopView = (ShareTopView) this.f$0;
                shareTopView.getClass();
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda71(shareTopView, this.f$2, tLObject, (String) this.f$1, 22));
                break;
            default:
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) this.f$0;
                botWebViewContainer.getClass();
                AndroidUtilities.runOnUIThread(new WearAuthSheet$$ExternalSyntheticLambda3(botWebViewContainer, tLObject, this.f$2, (BotWebViewContainer.MyWebView) this.f$1, tL_error, 29));
                break;
        }
    }

    public ProfileActivity$$ExternalSyntheticLambda75(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = obj2;
    }

    public ProfileActivity$$ExternalSyntheticLambda75(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i) {
        this.$r8$classId = 0;
        this.f$0 = profileActivity;
        this.f$1 = tL_channels_getParticipants;
        this.f$2 = i;
    }
}
