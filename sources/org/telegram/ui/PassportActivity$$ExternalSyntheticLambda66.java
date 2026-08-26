package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda0;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.TON.TONIntroActivity;

public final class PassportActivity$$ExternalSyntheticLambda66 implements NumberPicker.OnValueChangeListener, OnFailureListener, MediaDataController.KeywordResultCallback, Utilities.Callback2Return, BillingController.ProductDetailsResponseListenerLegacy, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final Object f$3;
    public final Object f$4;

    public PassportActivity$$ExternalSyntheticLambda66(int i, NumberPicker numberPicker, AlertsCreator.AnonymousClass37 anonymousClass37, AlertsCreator.AnonymousClass38 anonymousClass38, TextView textView) {
        this.$r8$classId = 1;
        this.f$2 = i;
        this.f$0 = numberPicker;
        this.f$1 = anonymousClass37;
        this.f$3 = anonymousClass38;
        this.f$4 = textView;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((PassportActivity) this.f$0).lambda$addDocumentView$56((SecureDocument) this.f$1, this.f$2, (PassportActivity.SecureDocumentCell) this.f$3, (String) this.f$4);
                break;
            default:
                StarGiftSheet.ResaleBuyTransferAlert resaleBuyTransferAlert = (StarGiftSheet.ResaleBuyTransferAlert) this.f$0;
                StarGiftSheet.PaymentFormState paymentFormState = (StarGiftSheet.PaymentFormState) resaleBuyTransferAlert.forms.get(resaleBuyTransferAlert.selectedCurrency);
                if (paymentFormState != null) {
                    StarsController starsController = StarsController.getInstance(this.f$2, resaleBuyTransferAlert.selectedCurrency);
                    AmountUtils$Amount amountUtils$AmountOf = starsController.balanceLoaded ? AmountUtils$Amount.of(starsController.getBalance()) : null;
                    if (amountUtils$AmountOf != null) {
                        AmountUtils$Amount amountUtils$Amount = paymentFormState.amount;
                        if (amountUtils$Amount.nanos > amountUtils$AmountOf.nanos) {
                            AmountUtils$Currency amountUtils$Currency = resaleBuyTransferAlert.selectedCurrency;
                            AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.STARS;
                            Context context = (Context) this.f$1;
                            Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$3;
                            if (amountUtils$Currency == amountUtils$Currency2) {
                                new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, amountUtils$Amount.nanos / 1000000000, 14, null, null, 0L).show();
                            } else if (amountUtils$Currency == AmountUtils$Currency.TON) {
                                new TONIntroActivity.StarsNeededSheet(context, resourcesProvider, paymentFormState.amount, true, null).show();
                            }
                        }
                    }
                    Browser.Progress progress = resaleBuyTransferAlert.lastPositiveButtonProgress;
                    if (progress != null) {
                        progress.cancel(false);
                        resaleBuyTransferAlert.lastPositiveButtonProgress = null;
                    }
                    ((Utilities.Callback2) this.f$4).run(paymentFormState, alertDialog.makeButtonLoading(i, true, true));
                    break;
                }
                break;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        StickerMakerView stickerMakerView = (StickerMakerView) this.f$0;
        Bitmap bitmap = (Bitmap) this.f$1;
        int i = this.f$2;
        PhotoViewer$$ExternalSyntheticLambda26 photoViewer$$ExternalSyntheticLambda26 = (PhotoViewer$$ExternalSyntheticLambda26) this.f$3;
        CacheControlActivity$$ExternalSyntheticLambda23 cacheControlActivity$$ExternalSyntheticLambda23 = (CacheControlActivity$$ExternalSyntheticLambda23) this.f$4;
        stickerMakerView.segmentingLoading = false;
        FileLog.e(exc);
        if ((exc instanceof MlKitException) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && stickerMakerView.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda71(stickerMakerView, bitmap, i, photoViewer$$ExternalSyntheticLambda26, 19), 2000L);
        } else {
            cacheControlActivity$$ExternalSyntheticLambda23.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(BillingResult billingResult, List list) {
        LoginActivity.LoginPayView loginPayView = (LoginActivity.LoginPayView) this.f$0;
        loginPayView.getClass();
        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda70(loginPayView, (String) this.f$4, billingResult, list, (String) this.f$1, (String) this.f$3, this.f$2));
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i) {
        long j = this.f$2;
        NumberPicker numberPicker2 = (NumberPicker) this.f$0;
        AlertsCreator.AnonymousClass37 anonymousClass37 = (AlertsCreator.AnonymousClass37) this.f$1;
        AlertsCreator.AnonymousClass38 anonymousClass38 = (AlertsCreator.AnonymousClass38) this.f$3;
        AlertsCreator.checkScheduleDate(null, null, 0L, j, 3, numberPicker2, anonymousClass37, anonymousClass38);
        AlertsCreator.checkPollCloseCustomDeadline((TextView) this.f$4, numberPicker2, anonymousClass37, anonymousClass38);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        StarsController.GiftsCollections giftsCollections;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        SharedMediaLayout.AnonymousClass13 anonymousClass13 = (SharedMediaLayout.AnonymousClass13) this.f$0;
        if (num.intValue() == -1 || num.intValue() == -2 || num.intValue() == 0 || anonymousClass13.reorderingCollections) {
            return Boolean.FALSE;
        }
        int i2 = 0;
        while (true) {
            giftsCollections = anonymousClass13.collections;
            if (i2 >= giftsCollections.getCollections().size()) {
                tL_starGiftCollection = null;
                i = -1;
                break;
            }
            if (((TL_stars.TL_starGiftCollection) giftsCollections.getCollections().get(i2)).collection_id == num.intValue()) {
                tL_starGiftCollection = (TL_stars.TL_starGiftCollection) giftsCollections.getCollections().get(i2);
                i = i2;
                break;
            }
            i2++;
        }
        int i3 = this.f$2;
        String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i3).getUserOrChat(anonymousClass13.dialogId));
        boolean zIsMine = giftsCollections.isMine();
        if (TextUtils.isEmpty(publicUsername) && !zIsMine) {
            return Boolean.FALSE;
        }
        BaseFragment baseFragment = (BaseFragment) this.f$1;
        ItemOptions itemOptions = new ItemOptions(baseFragment, view, false, true);
        itemOptions.setScrimViewBackground(new ProfileGiftsContainer.AnonymousClass3());
        itemOptions.addIf(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new ProfileGiftsContainer$$ExternalSyntheticLambda0(anonymousClass13, 1), zIsMine);
        itemOptions.addIf(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new ArticleViewer$$ExternalSyntheticLambda70(anonymousClass13, i3, publicUsername, tL_starGiftCollection, (Context) this.f$3, (Theme.ResourcesProvider) this.f$4, baseFragment), !TextUtils.isEmpty(publicUsername));
        itemOptions.addIf(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new LaunchActivity$$ExternalSyntheticLambda13(9, anonymousClass13, tL_starGiftCollection), zIsMine);
        itemOptions.addIf(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new ProfileGiftsContainer$$ExternalSyntheticLambda0(anonymousClass13, 2), zIsMine);
        int i4 = R.drawable.msg_delete;
        String string = LocaleController.getString(R.string.Gift2CollectionsDelete);
        PollItemMenu$$ExternalSyntheticLambda17 pollItemMenu$$ExternalSyntheticLambda17 = new PollItemMenu$$ExternalSyntheticLambda17(anonymousClass13, i, tL_starGiftCollection, 19);
        if (zIsMine) {
            itemOptions.add(i4, string, pollItemMenu$$ExternalSyntheticLambda17, true);
        }
        anonymousClass13.currentMenu = itemOptions;
        itemOptions.show();
        return Boolean.TRUE;
    }

    public PassportActivity$$ExternalSyntheticLambda66(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    public PassportActivity$$ExternalSyntheticLambda66(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i, Object obj2, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = notificationCenterDelegate;
        this.f$1 = obj;
        this.f$2 = i;
        this.f$3 = obj2;
        this.f$4 = obj3;
    }

    public PassportActivity$$ExternalSyntheticLambda66(SuggestEmojiView suggestEmojiView, int i, String str, HashSet hashSet, ArrayList arrayList) {
        this.$r8$classId = 3;
        this.f$0 = suggestEmojiView;
        this.f$2 = i;
        this.f$4 = str;
        this.f$1 = hashSet;
        this.f$3 = arrayList;
    }

    public PassportActivity$$ExternalSyntheticLambda66(LoginActivity.LoginPayView loginPayView, String str, String str2, String str3, int i) {
        this.$r8$classId = 5;
        this.f$0 = loginPayView;
        this.f$4 = str;
        this.f$1 = str2;
        this.f$3 = str3;
        this.f$2 = i;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        SuggestEmojiView suggestEmojiView = (SuggestEmojiView) this.f$0;
        if (this.f$2 != suggestEmojiView.lastQueryId) {
            return;
        }
        suggestEmojiView.lastQueryType = 1;
        String str2 = (String) this.f$4;
        suggestEmojiView.lastQuery = str2;
        ArrayList arrayList2 = (ArrayList) this.f$3;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                MediaDataController.KeywordResult keywordResult = (MediaDataController.KeywordResult) obj;
                String str3 = keywordResult.emoji;
                HashSet hashSet = (HashSet) this.f$1;
                if (!hashSet.contains(str3)) {
                    hashSet.add(keywordResult.emoji);
                    arrayList2.add(keywordResult);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            suggestEmojiView.clear = false;
            suggestEmojiView.forceClose = false;
            suggestEmojiView.createListView$1();
            SuggestEmojiView.AnonymousClass2 anonymousClass2 = suggestEmojiView.containerView;
            if (anonymousClass2 != null) {
                anonymousClass2.setVisibility(0);
            }
            suggestEmojiView.lastSpanY = AndroidUtilities.dp(10.0f);
            suggestEmojiView.keywordResults = arrayList;
            suggestEmojiView.arrowToStart = 0;
            suggestEmojiView.arrowToEnd = Integer.valueOf(str2.length());
            SuggestEmojiView.AnonymousClass2 anonymousClass3 = suggestEmojiView.containerView;
            if (anonymousClass3 != null) {
                anonymousClass3.invalidate();
            }
            SuggestEmojiView.Adapter adapter = suggestEmojiView.adapter;
            if (adapter != null) {
                adapter.mObservable.notifyChanged();
                return;
            }
            return;
        }
        suggestEmojiView.keywordResults = null;
        suggestEmojiView.clear = true;
        suggestEmojiView.forceClose();
    }
}
