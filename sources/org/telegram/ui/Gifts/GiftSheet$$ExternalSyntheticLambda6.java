package org.telegram.ui.Gifts;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BotForumHelper$$ExternalSyntheticLambda2;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController$$ExternalSyntheticLambda8;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.CountdownTimer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.Paint.Views.StickerView;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.poll.PollAddOptionFieldLayout;
import org.telegram.ui.Components.quickforward.BlurVisibilityDrawable;
import org.telegram.ui.Components.quickforward.QuickShareSelectorDrawable;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Components.spoilers.SpoilersClickDetector;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Components.voip.RateCallLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.Stars.MessageSuggestionOfferSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftUniqueActionLayout;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.SelfStoryViewsPage;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoryCaptionView;
import org.telegram.ui.Stories.StoryCaptionView$StoryCaptionTextView$TextState$$ExternalSyntheticLambda2;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.TwoStepVerificationSetupActivity;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda10;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda1;
import org.webrtc.GlGenericDrawer;

public final class GiftSheet$$ExternalSyntheticLambda6 implements ImageReceiver.ImageReceiverDelegate, AlertDialog.OnButtonClickListener, RecyclerListView.OnItemClickListenerExtended, FactorAnimator.Target, BlurVisibilityDrawable.DrawRunnable, GlGenericDrawer.TextureCallback, RateCallLayout.StarContainer.AllStarsProvider, CountdownTimer.Callback, OnApplyWindowInsetsListener, BillingController.ProductDetailsResponseListenerLegacy, AlertsCreator.ScheduleDatePickerDelegate, PaymentFormActivity.PaymentFormCallback, Utilities.Callback5, RecyclerListView.OnItemLongClickListener, StoriesListPlaceProvider.LoadNextInterface, StoryViewer.HolderClip, ViewPager.PageTransformer, SpoilersClickDetector.OnSpoilerClickedListener {
    public final int $r8$classId;
    public final Object f$0;

    public GiftSheet$$ExternalSyntheticLambda6(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    private final void onFactorChangeFinished$org$telegram$ui$Components$poll$PollAddOptionFieldLayout$$ExternalSyntheticLambda1(int i, float f, FactorAnimator factorAnimator) {
    }

    private final void onFactorChangeFinished$org$telegram$ui$Stars$StarGiftUniqueActionLayout$$ExternalSyntheticLambda0(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public void clip(Canvas canvas, RectF rectF, float f, boolean z) {
        if (z) {
            return;
        }
        Path path = (Path) this.f$0;
        path.rewind();
        float fPow = (float) Math.pow(f, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * fPow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * fPow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        MessageSuggestionOfferSheet messageSuggestionOfferSheet = (MessageSuggestionOfferSheet) this.f$0;
        if (!z) {
            messageSuggestionOfferSheet.getClass();
            return;
        }
        long j = i;
        if (messageSuggestionOfferSheet.selectedTime != j) {
            messageSuggestionOfferSheet.selectedTime = j;
            messageSuggestionOfferSheet.publishingTimeField.setText(MessageSuggestionOfferSheet.formatDateTime(j));
        }
        messageSuggestionOfferSheet.checkButtonEnabled$1(true);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        RLottieDrawable lottieAnimation;
        StickerView stickerView = (StickerView) this.f$0;
        stickerView.getClass();
        if (!z || z2 || (lottieAnimation = imageReceiver.getLottieAnimation()) == null) {
            return;
        }
        stickerView.didSetAnimatedSticker(lottieAnimation);
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public void draw(Canvas canvas, int i) {
        QuickShareSelectorDrawable quickShareSelectorDrawable = (QuickShareSelectorDrawable) this.f$0;
        quickShareSelectorDrawable.getClass();
        canvas.save();
        RectF rectF = quickShareSelectorDrawable.bubbleCurrent;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        quickShareSelectorDrawable.draw(canvas, true, i);
        canvas.restore();
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    @Override
    public void loadNext(boolean z) {
        SelfStoryViewsPage.ViewsModel viewsModel = (SelfStoryViewsPage.ViewsModel) this.f$0;
        if (viewsModel != null) {
            viewsModel.loadNext();
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        ((GiftMessageBottomSheet) this.f$0).windowInsetsStateHolder.setInsets(windowInsetsCompat);
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 2:
                ((MediaController$$ExternalSyntheticLambda8) this.f$0).run();
                break;
            case 3:
                ((SelectorBottomSheet$$ExternalSyntheticLambda0) this.f$0).run();
                break;
            case 4:
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment != null) {
                    GiftInfoBottomSheet.show(lastFragment, ((TLRPC.TL_payments_giveawayInfoResults) this.f$0).gift_code_slug, null);
                    break;
                }
                break;
            case 5:
                ((SelectorBottomSheet$$ExternalSyntheticLambda0) this.f$0).run();
                break;
            case 6:
                ((LimitReachedBottomSheet) this.f$0).lambda$showGiftOfferSheet$15();
                UserSelectorBottomSheet.open(0, null);
                break;
            case 13:
                ((BotForumHelper$$ExternalSyntheticLambda2) this.f$0).run();
                break;
            case 16:
                ((Utilities.Callback) this.f$0).run(alertDialog.makeButtonLoading(i, true, true));
                break;
            default:
                ((StarGiftSheet) this.f$0).getClass();
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(6, null);
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    safeLastFragment.showAsSheet(twoStepVerificationSetupActivity, bottomSheetParams);
                    break;
                }
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        int i2 = this.$r8$classId;
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        switch (this.$r8$classId) {
            case 8:
                PollAddOptionFieldLayout pollAddOptionFieldLayout = (PollAddOptionFieldLayout) this.f$0;
                SimpleTextView simpleTextView = pollAddOptionFieldLayout.limitTextView;
                FragmentFloatingButton.setAnimatedVisibility(simpleTextView, pollAddOptionFieldLayout.animatorTextWarnVisibility.floatValue);
                int i2 = Theme.key_windowBackgroundWhiteGrayText3;
                ChatActivity chatActivity = pollAddOptionFieldLayout.fragment;
                simpleTextView.setTextColor(ColorUtils.blendARGB(pollAddOptionFieldLayout.animatorTextErrorVisibility.floatValue, Theme.getColor(i2, chatActivity.getResourceProvider()), Theme.getColor(Theme.key_text_RedRegular, chatActivity.getResourceProvider())));
                break;
            default:
                View view = ((StarGiftUniqueActionLayout) this.f$0).view;
                if (!(view instanceof ChatActionCell)) {
                    view.invalidate();
                } else {
                    ((ChatActionCell) view).invalidateOutbounds();
                }
                break;
        }
    }

    @Override
    public void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
        switch (this.$r8$classId) {
            case 20:
                PaymentFormActivity.InvoiceStatus invoiceStatus2 = PaymentFormActivity.InvoiceStatus.PAID;
                BotBiometry$$ExternalSyntheticLambda10 botBiometry$$ExternalSyntheticLambda10 = (BotBiometry$$ExternalSyntheticLambda10) this.f$0;
                if (invoiceStatus == invoiceStatus2) {
                    botBiometry$$ExternalSyntheticLambda10.run(Boolean.TRUE, null);
                } else if (invoiceStatus != PaymentFormActivity.InvoiceStatus.PENDING) {
                    botBiometry$$ExternalSyntheticLambda10.run(Boolean.FALSE, null);
                }
                break;
            case 21:
                PaymentFormActivity.InvoiceStatus invoiceStatus3 = PaymentFormActivity.InvoiceStatus.PAID;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f$0;
                if (invoiceStatus == invoiceStatus3) {
                    if (callback2 != null) {
                        callback2.run(Boolean.TRUE, null);
                    }
                    break;
                } else if (invoiceStatus != PaymentFormActivity.InvoiceStatus.PENDING && callback2 != null) {
                    callback2.run(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                PaymentFormActivity.InvoiceStatus invoiceStatus4 = PaymentFormActivity.InvoiceStatus.PAID;
                StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4 starsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4 = (StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4) this.f$0;
                if (invoiceStatus == invoiceStatus4) {
                    starsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4.run(Boolean.TRUE, null);
                } else if (invoiceStatus != PaymentFormActivity.InvoiceStatus.PENDING) {
                    starsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4.run(Boolean.FALSE, null);
                }
                break;
        }
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        ((SelectorBottomSheet) this.f$0).lambda$new$5$1(view);
    }

    @Override
    public void onProductDetailsResponse(BillingResult billingResult, List list) {
        ArrayList arrayList;
        int i;
        String str;
        GiftSheet giftSheet = (GiftSheet) this.f$0;
        giftSheet.getClass();
        Iterator it = list.iterator();
        long pricePerMonth = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = giftSheet.premiumTiers;
            i = 0;
            if (!zHasNext) {
                break;
            }
            ProductDetails productDetails = (ProductDetails) it.next();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = (GiftPremiumBottomSheet$GiftTier) obj;
                TLRPC.TL_premiumGiftOption tL_premiumGiftOption = giftPremiumBottomSheet$GiftTier.giftOption;
                String str2 = null;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = giftPremiumBottomSheet$GiftTier.giftCodeOption;
                if (tL_premiumGiftOption != null) {
                    str = tL_premiumGiftOption.store_product;
                } else {
                    str = tL_premiumGiftCodeOption != null ? tL_premiumGiftCodeOption.store_product : null;
                }
                if (str != null) {
                    if (tL_premiumGiftOption != null) {
                        str2 = tL_premiumGiftOption.store_product;
                    } else if (tL_premiumGiftCodeOption != null) {
                        str2 = tL_premiumGiftCodeOption.store_product;
                    }
                    if (str2.equals(productDetails.zzc)) {
                        giftPremiumBottomSheet$GiftTier.googlePlayProductDetails = productDetails;
                        if (giftPremiumBottomSheet$GiftTier.getPricePerMonth() <= pricePerMonth) {
                            break;
                        }
                        pricePerMonth = giftPremiumBottomSheet$GiftTier.getPricePerMonth();
                        break;
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            ((GiftPremiumBottomSheet$GiftTier) obj2).pricePerMonthRegular = pricePerMonth;
        }
        AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda9(giftSheet, 0));
    }

    @Override
    public void onSpoilerClicked(SpoilerEffect spoilerEffect, float f, float f2) {
        StoryCaptionView.StoryCaptionTextView.TextState textState = (StoryCaptionView.StoryCaptionTextView.TextState) this.f$0;
        StoryCaptionView.StoryCaptionTextView storyCaptionTextView = StoryCaptionView.StoryCaptionTextView.this;
        if (storyCaptionTextView.isSpoilersRevealed) {
            return;
        }
        spoilerEffect.onRippleEndCallback = new StoryCaptionView$StoryCaptionTextView$TextState$$ExternalSyntheticLambda2(textState, 2);
        float fSqrt = (float) Math.sqrt(Math.pow(storyCaptionTextView.getHeight(), 2.0d) + Math.pow(storyCaptionTextView.getWidth(), 2.0d));
        ArrayList arrayList = textState.spoilers;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((SpoilerEffect) obj).startRipple(f, f2, fSqrt, false);
        }
    }

    @Override
    public void onTimerUpdate(long j) {
        switch (this.$r8$classId) {
            case 12:
                ActiveAuctionsSheet.ActiveAuctionCell activeAuctionCell = (ActiveAuctionsSheet.ActiveAuctionCell) this.f$0;
                activeAuctionCell.getClass();
                String durationNoHours = AndroidUtilities.formatDurationNoHours((int) j, false);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
                spannableStringBuilder.setSpan(activeAuctionCell.cs, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "  ");
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActiveAuctionsActiveRaiseBid));
                spannableStringBuilder.append((CharSequence) "  ");
                spannableStringBuilder.append((CharSequence) durationNoHours);
                activeAuctionCell.buttonView.setText(spannableStringBuilder, true);
                break;
            default:
                ((StarGiftSheet.StarGiftDrawableIcon) this.f$0).updateCountdownText();
                break;
        }
    }

    @Override
    public void run(Bitmap bitmap, int i) {
        GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) this.f$0;
        groupCallMiniTextureView.getClass();
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
        AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda26(18, groupCallMiniTextureView, bitmap));
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return ((DialogStoriesCell) this.f$0).lambda$new$2(view, i);
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$r8$classId) {
            case 23:
                StarsController starsController = (StarsController) this.f$0;
                int i = starsController.currentAccount;
                MessagesController.getInstance(i).putUsers((ArrayList) obj4, true);
                MessagesController.getInstance(i).putChats((ArrayList) obj5, true);
                starsController.giftsCacheLoaded = true;
                ArrayList arrayList = starsController.gifts;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                ArrayList arrayList2 = starsController.birthdaySortedGifts;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                Collections.sort(arrayList2, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(6)), new TableModel$$ExternalSyntheticLambda1(7)));
                ArrayList arrayList3 = starsController.sortedGifts;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                Collections.sort(arrayList3, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(8)));
                starsController.giftsHash = ((Integer) obj2).intValue();
                starsController.giftsRemoteTime = ((Long) obj3).longValue();
                starsController.giftsLoading = false;
                NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
                starsController.loadStarGifts();
                break;
            default:
                UItem uItem = (UItem) obj;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                StarsIntroActivity.StarsTransactionsLayout.Page page = (StarsIntroActivity.StarsTransactionsLayout.Page) this.f$0;
                page.getClass();
                if (uItem.object instanceof TL_stars.StarsTransaction) {
                    StarsIntroActivity.showTransactionSheet(page.getContext(), false, 0L, page.currentAccount, (TL_stars.StarsTransaction) uItem.object, page.resourcesProvider);
                }
                break;
        }
    }
}
