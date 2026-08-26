package org.telegram.ui.Stars;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import java.io.File;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.web.BotWebViewContainer;

public final class StarsController$$ExternalSyntheticLambda67 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;

    public StarsController$$ExternalSyntheticLambda67(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$4 = obj3;
        this.f$2 = obj4;
        this.f$3 = obj5;
        this.f$5 = obj6;
        this.f$6 = obj7;
    }

    @Override
    public final void run() {
        PaymentFormActivity paymentFormActivity;
        PaymentFormActivity paymentFormActivity2;
        LiveCommentsView.LiveCommentView liveCommentView;
        LiveCommentsView.Message message;
        LiveCommentsView.LiveCommentView liveCommentView2 = null;
        Object obj = this.f$2;
        Object obj2 = this.f$3;
        Object obj3 = this.f$4;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        Object obj6 = this.f$6;
        Object obj7 = this.f$5;
        switch (this.$r8$classId) {
            case 0:
                StarsController starsController = (StarsController) obj5;
                starsController.getClass();
                ((boolean[]) obj4)[0] = true;
                starsController.payAfterConfirmed((String) obj, (TLRPC.ChatInvite) obj2, new StarsController$$ExternalSyntheticLambda69((boolean[]) obj3, (Utilities.Callback2) obj7, (Utilities.Callback) obj6));
                break;
            case 1:
                BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13 boostViaGiftsBottomSheet$$ExternalSyntheticLambda13 = (BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                if (tL_error != null) {
                    boostViaGiftsBottomSheet$$ExternalSyntheticLambda13.run(tL_error);
                } else {
                    TLObject tLObject = (TLObject) obj3;
                    if (tLObject instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                        paymentForm.invoice.recurring = true;
                        ((MessagesController) obj).putUsers(paymentForm.users, false);
                        paymentFormActivity = new PaymentFormActivity(paymentForm, (TLRPC.TL_inputInvoicePremiumGiftCode) obj2, (BaseFragment) obj7);
                    } else {
                        paymentFormActivity = tLObject instanceof TLRPC.PaymentReceipt ? new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject) : null;
                    }
                    if (paymentFormActivity != null) {
                        paymentFormActivity.setPaymentFormCallback(new RateCallLayout$$ExternalSyntheticLambda1(4, (BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) obj6, boostViaGiftsBottomSheet$$ExternalSyntheticLambda13));
                        LaunchActivity.getLastFragment().showAsSheet(paymentFormActivity, new BaseFragment.BottomSheetParams());
                    } else {
                        boostViaGiftsBottomSheet$$ExternalSyntheticLambda13.run(null);
                    }
                }
                break;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) obj6;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                } else {
                    TLObject tLObject2 = (TLObject) obj4;
                    if (tLObject2 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                        paymentForm2.invoice.recurring = true;
                        ((MessagesController) obj3).putUsers(paymentForm2.users, false);
                        paymentFormActivity2 = new PaymentFormActivity(paymentForm2, (TLRPC.TL_inputInvoicePremiumGiftCode) obj, (BaseFragment) obj2);
                    } else {
                        paymentFormActivity2 = tLObject2 instanceof TLRPC.PaymentReceipt ? new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject2) : null;
                    }
                    if (paymentFormActivity2 != null) {
                        paymentFormActivity2.setPaymentFormCallback(new RateCallLayout$$ExternalSyntheticLambda1(5, (Utilities.Callback) obj7, callback));
                        LaunchActivity.getLastFragment().showAsSheet(paymentFormActivity2, new BaseFragment.BottomSheetParams());
                    } else {
                        callback.run(null);
                    }
                }
                break;
            case 3:
                StarsController starsController2 = (StarsController) obj5;
                List list = (List) obj4;
                StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4 starsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4 = (StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4) obj3;
                if (list.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda9(starsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4, 1));
                } else {
                    ProductDetails productDetails = (ProductDetails) list.get(0);
                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                    if (oneTimePurchaseOfferDetails == null) {
                        AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda9(starsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4, 2));
                    } else {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj;
                        tL_inputStorePaymentStarsGift.currency = oneTimePurchaseOfferDetails.zzc;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TL_stars.TL_starsGiftOption) obj2).currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(starsController2.currentAccount).sendRequest(tL_payments_canPurchaseStore, new StarsController$$ExternalSyntheticLambda113(productDetails, (BillingResult) obj7, starsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4, (Activity) obj6, tL_inputStorePaymentStarsGift, list, 3));
                    }
                }
                break;
            case 4:
                StarsController starsController3 = (StarsController) obj5;
                starsController3.getClass();
                TLObject tLObject3 = (TLObject) obj4;
                Utilities.Callback callback2 = (Utilities.Callback) obj6;
                if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                    starsController3.payAfterConfirmed((MessageObject) obj3, (TLRPC.InputInvoice) obj, (TLRPC.TL_payments_paymentFormStars) tLObject3, callback2);
                } else {
                    if (callback2 != null) {
                        callback2.run(Boolean.FALSE);
                    }
                    TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj7;
                    zzkh.m(R.string.UnknownErrorCode, new Object[]{tL_error3 != null ? tL_error3.text : "FAILED_GETTING_FORM"}, (BulletinFactory) obj2, R.raw.error);
                }
                break;
            case 5:
                StarsReactionsSheet starsReactionsSheet = (StarsReactionsSheet) obj5;
                int[] iArr = (int[]) obj3;
                RectF rectF = (RectF) obj;
                if (starsReactionsSheet.liveStories) {
                    LiveCommentsView.LiveCommentView[] liveCommentViewArr = (LiveCommentsView.LiveCommentView[]) obj4;
                    LiveCommentsView.LiveCommentView liveCommentView3 = liveCommentViewArr[0];
                    if (liveCommentView3 == null) {
                        PeerStoriesView.AnonymousClass10 anonymousClass10 = starsReactionsSheet.commentsView;
                        int i = starsReactionsSheet.sentMessageId;
                        for (int i2 = 0; i2 < anonymousClass10.listView.getChildCount(); i2++) {
                            View childAt = anonymousClass10.listView.getChildAt(i2);
                            if ((childAt instanceof LiveCommentsView.LiveCommentView) && (message = (liveCommentView = (LiveCommentsView.LiveCommentView) childAt).message) != null && message.id == i) {
                                liveCommentView2 = liveCommentView;
                                liveCommentViewArr[0] = liveCommentView2;
                                liveCommentView3 = liveCommentView2;
                            }
                        }
                        liveCommentViewArr[0] = liveCommentView2;
                        liveCommentView3 = liveCommentView2;
                    }
                    if (liveCommentView3 != null) {
                        liveCommentView3.setDrawStar(false);
                        liveCommentView3.getLocationInWindow(iArr);
                        ColoredImageSpan[] coloredImageSpanArr = liveCommentView3.starsViewCache;
                        if (coloredImageSpanArr[0] != null) {
                            TextView textView = liveCommentView3.starsView;
                            if (textView.getLayout() != null) {
                                float x = textView.getX() + textView.getPaddingLeft() + coloredImageSpanArr[0].translateX;
                                float y = textView.getY() + textView.getPaddingTop();
                                ColoredImageSpan coloredImageSpan = coloredImageSpanArr[0];
                                float f = y + coloredImageSpan.translateY;
                                rectF.set(x, f, coloredImageSpan.drawable.getBounds().width() + x, coloredImageSpanArr[0].drawable.getBounds().height() + f);
                            }
                        }
                        rectF.offset(iArr[0], iArr[1]);
                    }
                } else {
                    ((View) obj2).getLocationInWindow(iArr);
                    ReactionsLayoutInBubble reactionsLayoutInBubble = (ReactionsLayoutInBubble) obj7;
                    ReactionsLayoutInBubble.ReactionButton reactionButton = (ReactionsLayoutInBubble.ReactionButton) obj6;
                    rectF.set(AndroidUtilities.dp(4.0f) + iArr[0] + reactionsLayoutInBubble.x + reactionButton.x, ((reactionButton.height - AndroidUtilities.dp(22.0f)) / 2.0f) + iArr[1] + reactionsLayoutInBubble.y + reactionButton.y, AndroidUtilities.dp(26.0f) + iArr[0] + reactionsLayoutInBubble.x + reactionButton.x, ((AndroidUtilities.dp(22.0f) + reactionButton.height) / 2.0f) + iArr[1] + reactionsLayoutInBubble.y + reactionButton.y);
                }
                break;
            default:
                ((BotWebViewContainer) obj5).lambda$onEventReceived$33((int[]) obj4, (File) obj3, (AlertDialog) obj2, (String) obj, (String) obj7, (String) obj6);
                break;
        }
    }

    public StarsController$$ExternalSyntheticLambda67(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, BaseFragment baseFragment, Utilities.Callback callback2) {
        this.$r8$classId = 2;
        this.f$0 = tL_error;
        this.f$6 = callback;
        this.f$1 = tLObject;
        this.f$4 = messagesController;
        this.f$2 = tL_inputInvoicePremiumGiftCode;
        this.f$3 = baseFragment;
        this.f$5 = callback2;
    }

    public StarsController$$ExternalSyntheticLambda67(StarsController starsController, TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, BulletinFactory bulletinFactory, TLRPC.TL_error tL_error) {
        this.$r8$classId = 4;
        this.f$0 = starsController;
        this.f$1 = tLObject;
        this.f$4 = messageObject;
        this.f$2 = inputInvoice;
        this.f$6 = callback;
        this.f$3 = bulletinFactory;
        this.f$5 = tL_error;
    }

    public StarsController$$ExternalSyntheticLambda67(StarsController starsController, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, Utilities.Callback2 callback2, Utilities.Callback callback) {
        this.$r8$classId = 0;
        this.f$0 = starsController;
        this.f$1 = zArr;
        this.f$2 = str;
        this.f$3 = chatInvite;
        this.f$4 = zArr2;
        this.f$5 = callback2;
        this.f$6 = callback;
    }

    public StarsController$$ExternalSyntheticLambda67(BotWebViewContainer botWebViewContainer, int[] iArr, File file, AlertDialog alertDialog, String str, String str2, String str3) {
        this.$r8$classId = 6;
        this.f$0 = botWebViewContainer;
        this.f$1 = iArr;
        this.f$4 = file;
        this.f$3 = alertDialog;
        this.f$2 = str;
        this.f$5 = str2;
        this.f$6 = str3;
    }
}
