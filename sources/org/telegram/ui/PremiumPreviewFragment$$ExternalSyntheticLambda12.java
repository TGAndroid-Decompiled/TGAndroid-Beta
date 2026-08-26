package org.telegram.ui;

import android.util.Pair;
import com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.Components.MotionBackgroundDrawable;

public final class PremiumPreviewFragment$$ExternalSyntheticLambda12 implements ResultCallback, PurchasesResponseListener {
    public final Object f$0;
    public final boolean f$1;
    public final int f$2;
    public final Object f$3;
    public final Object f$4;

    public PremiumPreviewFragment$$ExternalSyntheticLambda12(BaseFragment baseFragment, boolean z, int i, BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams, PremiumPreviewFragment.SubscriptionTier subscriptionTier) {
        this.f$0 = baseFragment;
        this.f$1 = z;
        this.f$2 = i;
        this.f$3 = billingFlowParams$SubscriptionUpdateParams;
        this.f$4 = subscriptionTier;
    }

    @Override
    public void onComplete(Object obj) {
        ChatActivity.ThemeDelegate themeDelegate = (ChatActivity.ThemeDelegate) this.f$0;
        EmojiThemes emojiThemes = (EmojiThemes) this.f$3;
        MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) this.f$4;
        themeDelegate.lambda$getBackgroundDrawableFromTheme$8(emojiThemes, this.f$1, motionBackgroundDrawable, this.f$2, (Pair) obj);
    }

    @Override
    public void onError(Throwable th) {
        ResultCallback.CC.$default$onError(this, th);
    }

    @Override
    public void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        PremiumPreviewFragment.SubscriptionTier subscriptionTier = (PremiumPreviewFragment.SubscriptionTier) this.f$4;
        PremiumPreviewFragment.lambda$buyPremium$16((BaseFragment) this.f$0, this.f$1, this.f$2, (BillingFlowParams$SubscriptionUpdateParams) this.f$3, subscriptionTier, billingResult, list);
    }

    public PremiumPreviewFragment$$ExternalSyntheticLambda12(ChatActivity.ThemeDelegate themeDelegate, EmojiThemes emojiThemes, boolean z, MotionBackgroundDrawable motionBackgroundDrawable, int i) {
        this.f$0 = themeDelegate;
        this.f$3 = emojiThemes;
        this.f$1 = z;
        this.f$4 = motionBackgroundDrawable;
        this.f$2 = i;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        ResultCallback.CC.$default$onError(this, tL_error);
    }
}
