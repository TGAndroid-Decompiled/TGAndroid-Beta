package org.telegram.ui.Components;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BotForumHelper$$ExternalSyntheticLambda2;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.CountdownTimer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell;
import org.telegram.ui.Components.poll.PollAddOptionFieldLayout;
import org.telegram.ui.Components.quickforward.BlurVisibilityDrawable;
import org.telegram.ui.Components.quickforward.QuickShareSelectorDrawable;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Components.voip.RateCallLayout;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.ComposeDrawable$$ExternalSyntheticLambda0;
import org.telegram.ui.ContactAddActivity;
import org.telegram.ui.ContactsWidgetConfigActivity;
import org.telegram.ui.CreateGroupCallSheet;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.EditWidgetActivity;
import org.telegram.ui.EnableTopicsActivity;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.FilterChatlistActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.Gifts.ActiveAuctionsSheet;
import org.telegram.ui.Gifts.GiftMessageBottomSheet;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.GroupInviteActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda37;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda12;
import org.webrtc.GlGenericDrawer;

public final class VideoEditTextureView$$ExternalSyntheticLambda1 implements SlideChooseView.Callback, Utilities.Callback5, ImageReceiver.ImageReceiverDelegate, FactorAnimator.Target, BlurVisibilityDrawable.DrawRunnable, GlGenericDrawer.TextureCallback, RateCallLayout.StarContainer.AllStarsProvider, EditWidgetActivity.EditWidgetActivityDelegate, RecyclerListView.OnItemClickListenerExtended, AlertDialog.OnButtonClickListener, MessagesController.ErrorDelegate, PopupSwipeBackLayout.IntCallback, PasscodeView.PasscodeViewDelegate, ActionBarPopupWindow.OnDispatchKeyEventListener, RecyclerListView.IntReturnCallback, CountdownTimer.Callback, OnApplyWindowInsetsListener, BillingController.ProductDetailsResponseListenerLegacy, SearchAdapterHelper.SearchAdapterHelperDelegate, RecyclerListView.OnItemLongClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public VideoEditTextureView$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    private final void onDoubleTap$org$telegram$ui$CreateGroupCallSheet$$ExternalSyntheticLambda2(View view, float f, float f2) {
    }

    private final void onDoubleTap$org$telegram$ui$DataAutoDownloadActivity$$ExternalSyntheticLambda1(View view, float f, float f2) {
    }

    private final void onTouchEnd$org$telegram$ui$Components$UniversalAdapter$$ExternalSyntheticLambda2() {
    }

    private final void onTouchEnd$org$telegram$ui$DataAutoDownloadActivity$ListAdapter$$ExternalSyntheticLambda0() {
    }

    @Override
    public boolean canApplySearchResults(int i) {
        return true;
    }

    @Override
    public void didAcceptedPassword(PasscodeView passcodeView) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f$0;
        externalActionActivity.getClass();
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.passcodeSaveIntent;
        if (intent != null) {
            externalActionActivity.handleIntent$1(externalActionActivity.passcodeSaveIntentAccount, intent, externalActionActivity.passcodeSaveIntentIsNew, externalActionActivity.passcodeSaveIntentIsRestore, true, externalActionActivity.passcodeSaveIntentState);
            externalActionActivity.passcodeSaveIntent = null;
        }
        externalActionActivity.actionBarLayout.showLastFragment();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.layersActionBarLayout.showLastFragment();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, passcodeView);
    }

    @Override
    public void didSelectDialogs() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.f$0;
        contactsWidgetConfigActivity.getClass();
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", contactsWidgetConfigActivity.creatingAppWidgetId);
        contactsWidgetConfigActivity.setResult(-1, intent);
        contactsWidgetConfigActivity.finish();
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        boolean z4;
        VideoSeekPreviewImage.StoryBoardFrame storyBoardFrame;
        int i;
        int iMin;
        int iCeil;
        double dCeil;
        VideoSeekPreviewImage videoSeekPreviewImage = (VideoSeekPreviewImage) this.f$0;
        if (!z) {
            videoSeekPreviewImage.getClass();
            return;
        }
        if (videoSeekPreviewImage.webView == null && videoSeekPreviewImage.storyBoardMap == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(150.0f);
        PhotoViewer.AnonymousClass79 anonymousClass79 = videoSeekPreviewImage.webView;
        if (anonymousClass79 != null) {
            int i2 = (int) videoSeekPreviewImage.lastPosition;
            ArrayList arrayList = anonymousClass79.youtubeStoryboards;
            int iIndexOf = arrayList.indexOf(anonymousClass79.getYoutubeStoryboard(i2));
            if (iIndexOf == -1) {
                iMin = 0;
            } else if (iIndexOf == arrayList.size() - 1) {
                int videoDuration = anonymousClass79.getVideoDuration() / 1000;
                if (videoDuration <= 100) {
                    dCeil = Math.ceil(videoDuration);
                } else if (videoDuration <= 250) {
                    dCeil = Math.ceil(videoDuration / 2.0f);
                } else if (videoDuration <= 500) {
                    dCeil = Math.ceil(videoDuration / 4.0f);
                } else {
                    dCeil = videoDuration <= 1000 ? Math.ceil(videoDuration / 5.0f) : Math.ceil(videoDuration / 10.0f);
                }
                iMin = Math.min(25, (((int) dCeil) - ((arrayList.size() - 1) * 25)) + 1);
            } else {
                iMin = 25;
            }
            int iCeil2 = (int) Math.ceil(iMin / 5.0f);
            int iMin2 = Math.min(iMin, 5);
            ImageReceiver imageReceiver2 = videoSeekPreviewImage.storyBoardsReceiver;
            float bitmapWidth = imageReceiver2.getBitmapWidth() / iMin2;
            float bitmapHeight = imageReceiver2.getBitmapHeight() / iCeil2;
            PhotoViewer.AnonymousClass79 anonymousClass710 = videoSeekPreviewImage.webView;
            z4 = true;
            int i3 = (int) videoSeekPreviewImage.lastPosition;
            int videoDuration2 = anonymousClass710.getVideoDuration() / 1000;
            if (videoDuration2 <= 100) {
                iCeil = ((int) Math.ceil(i3)) % 25;
            } else if (videoDuration2 <= 250) {
                iCeil = ((int) Math.ceil(i3 / 2.0f)) % 25;
            } else if (videoDuration2 <= 500) {
                iCeil = ((int) Math.ceil(i3 / 4.0f)) % 25;
            } else {
                iCeil = videoDuration2 <= 1000 ? ((int) Math.ceil(i3 / 5.0f)) % 25 : ((int) Math.ceil(i3 / 10.0f)) % 25;
            }
            int iMin3 = Math.min(iCeil, iMin - 1);
            videoSeekPreviewImage.ytImageX = (int) ((iMin3 % 5) * bitmapWidth);
            videoSeekPreviewImage.ytImageY = (int) ((iMin3 / 5) * bitmapHeight);
            videoSeekPreviewImage.ytImageWidth = (int) bitmapWidth;
            videoSeekPreviewImage.ytImageHeight = (int) bitmapHeight;
        } else {
            z4 = true;
            int i4 = 0;
            while (true) {
                if (i4 >= videoSeekPreviewImage.storyBoardMap.size()) {
                    storyBoardFrame = null;
                    break;
                }
                storyBoardFrame = (VideoSeekPreviewImage.StoryBoardFrame) videoSeekPreviewImage.storyBoardMap.get(i4);
                double d = i4 == 0 ? 0.0d : storyBoardFrame.pts;
                double d2 = i4 == videoSeekPreviewImage.storyBoardMap.size() - 1 ? 9.9999999E7d : ((VideoSeekPreviewImage.StoryBoardFrame) videoSeekPreviewImage.storyBoardMap.get(i4 + 1)).pts;
                double d3 = videoSeekPreviewImage.lastPosition;
                if (d3 >= d && d3 <= d2) {
                    break;
                } else {
                    i4++;
                }
            }
            if (storyBoardFrame == null) {
                return;
            }
            videoSeekPreviewImage.ytImageX = storyBoardFrame.left;
            videoSeekPreviewImage.ytImageY = storyBoardFrame.top;
            videoSeekPreviewImage.ytImageWidth = videoSeekPreviewImage.storyBoardFrameWidth;
            videoSeekPreviewImage.ytImageHeight = videoSeekPreviewImage.storyBoardFrameHeight;
        }
        videoSeekPreviewImage.drawStoryBoard = z4;
        float f = videoSeekPreviewImage.ytImageWidth / videoSeekPreviewImage.ytImageHeight;
        if (f > 1.0f) {
            i = (int) (iDp / f);
        } else {
            int i5 = (int) (iDp * f);
            i = iDp;
            iDp = i5;
        }
        ViewGroup.LayoutParams layoutParams = videoSeekPreviewImage.getLayoutParams();
        if (videoSeekPreviewImage.getVisibility() == 0 && layoutParams.width == iDp && layoutParams.height == i) {
            return;
        }
        layoutParams.width = iDp;
        layoutParams.height = i;
        videoSeekPreviewImage.setVisibility(0);
        videoSeekPreviewImage.requestLayout();
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
    public LongSparseArray getExcludeCallParticipants() {
        return null;
    }

    @Override
    public void getExcludeUsers() {
    }

    @Override
    public boolean hasDoubleTap(View view) {
        switch (this.$r8$classId) {
        }
        return false;
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
            case 14:
                ((PollItemMenu$$ExternalSyntheticLambda12) this.f$0).run();
                break;
            case 24:
                ((BotForumHelper$$ExternalSyntheticLambda2) this.f$0).run();
                break;
            default:
                ((GroupInviteActivity) this.f$0).generateLink$1(true);
                break;
        }
    }

    @Override
    public void onDataSetChanged(int i) {
        GroupCreateActivity.GroupCreateAdapter groupCreateAdapter = (GroupCreateActivity.GroupCreateAdapter) this.f$0;
        int i2 = groupCreateAdapter.currentItemsCount;
        GroupCreateActivity groupCreateActivity = GroupCreateActivity.this;
        groupCreateActivity.showItemsAnimated$1(i2);
        if (groupCreateAdapter.searchRunnable == null && !groupCreateAdapter.searchAdapterHelper.isSearchInProgress() && groupCreateAdapter.getItemCount() == 0) {
            groupCreateActivity.emptyView.showProgress(false, true);
        }
        groupCreateAdapter.notifyDataSetChanged();
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        FilterChatlistActivity.InviteLinkCell inviteLinkCell = (FilterChatlistActivity.InviteLinkCell) this.f$0;
        inviteLinkCell.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && inviteLinkCell.actionBarPopupWindow.isShowing()) {
            inviteLinkCell.actionBarPopupWindow.dismiss(true);
        }
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
        int i = this.$r8$classId;
    }

    @Override
    public void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        PollAddOptionFieldLayout pollAddOptionFieldLayout = (PollAddOptionFieldLayout) this.f$0;
        SimpleTextView simpleTextView = pollAddOptionFieldLayout.limitTextView;
        FragmentFloatingButton.setAnimatedVisibility(simpleTextView, pollAddOptionFieldLayout.animatorTextWarnVisibility.floatValue);
        int i2 = Theme.key_windowBackgroundWhiteGrayText3;
        ChatActivity chatActivity = pollAddOptionFieldLayout.fragment;
        simpleTextView.setTextColor(ColorUtils.blendARGB(pollAddOptionFieldLayout.animatorTextErrorVisibility.floatValue, Theme.getColor(i2, chatActivity.getResourceProvider()), Theme.getColor(Theme.key_text_RedRegular, chatActivity.getResourceProvider())));
    }

    @Override
    public boolean onItemClick(int i, View view) {
        return ((LanguageSelectActivity) this.f$0).lambda$createView$6$1(i, view);
    }

    @Override
    public void onOptionSelected(int i) {
        switch (this.$r8$classId) {
            case 1:
                Utilities.Callback callback = ((UItem) this.f$0).intCallback;
                if (callback != null) {
                    callback.run(Integer.valueOf(i));
                }
                break;
            default:
                DataAutoDownloadActivity dataAutoDownloadActivity = DataAutoDownloadActivity.this;
                DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.presets.get(i);
                if (preset == dataAutoDownloadActivity.lowPreset) {
                    dataAutoDownloadActivity.currentPresetNum = 0;
                } else if (preset == dataAutoDownloadActivity.mediumPreset) {
                    dataAutoDownloadActivity.currentPresetNum = 1;
                } else if (preset == dataAutoDownloadActivity.highPreset) {
                    dataAutoDownloadActivity.currentPresetNum = 2;
                } else {
                    dataAutoDownloadActivity.currentPresetNum = 3;
                }
                int i2 = dataAutoDownloadActivity.currentType;
                if (i2 == 0) {
                    DownloadController.getInstance(((BaseFragment) dataAutoDownloadActivity).currentAccount).currentMobilePreset = dataAutoDownloadActivity.currentPresetNum;
                } else if (i2 == 1) {
                    DownloadController.getInstance(((BaseFragment) dataAutoDownloadActivity).currentAccount).currentWifiPreset = dataAutoDownloadActivity.currentPresetNum;
                } else {
                    DownloadController.getInstance(((BaseFragment) dataAutoDownloadActivity).currentAccount).currentRoamingPreset = dataAutoDownloadActivity.currentPresetNum;
                }
                SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(((BaseFragment) dataAutoDownloadActivity).currentAccount).edit();
                editorEdit.putInt(dataAutoDownloadActivity.key2, dataAutoDownloadActivity.currentPresetNum);
                editorEdit.commit();
                DownloadController.getInstance(((BaseFragment) dataAutoDownloadActivity).currentAccount).checkAutodownloadSettings();
                for (int i3 = 0; i3 < 4; i3++) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = dataAutoDownloadActivity.listView.findViewHolderForAdapterPosition(dataAutoDownloadActivity.photosRow + i3);
                    if (viewHolderFindViewHolderForAdapterPosition != null) {
                        dataAutoDownloadActivity.listAdapter.onBindViewHolder(viewHolderFindViewHolderForAdapterPosition, dataAutoDownloadActivity.photosRow + i3);
                    }
                }
                dataAutoDownloadActivity.wereAnyChanges = true;
                break;
        }
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
        AndroidUtilities.runOnUIThread(new ComposeDrawable$$ExternalSyntheticLambda0(giftSheet, 28));
    }

    @Override
    public void onSetHashtags(ArrayList arrayList) {
    }

    @Override
    public void onTimerUpdate(long j) {
        ActiveAuctionsSheet.ActiveAuctionCell activeAuctionCell = (ActiveAuctionsSheet.ActiveAuctionCell) this.f$0;
        activeAuctionCell.getClass();
        String durationNoHours = AndroidUtilities.formatDurationNoHours((int) j, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(activeAuctionCell.cs, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActiveAuctionsActiveRaiseBid));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) durationNoHours);
        activeAuctionCell.buttonView.setText(spannableStringBuilder, true, true);
    }

    @Override
    public void onTouchEnd() {
        int i = this.$r8$classId;
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f$0).folderTagsPosition;
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        UItem item;
        Object obj;
        long j;
        switch (this.$r8$classId) {
            case 11:
                CreateGroupCallSheet createGroupCallSheet = (CreateGroupCallSheet) this.f$0;
                if (!createGroupCallSheet.creatingCall && (item = createGroupCallSheet.adapter.getItem(i - 1)) != null && (obj = item.object) != null) {
                    if (obj instanceof TLRPC.User) {
                        j = ((TLRPC.User) obj).id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j = ((TLRPC.Chat) obj).id;
                    }
                    HashSet hashSet = createGroupCallSheet.selectedParticipants;
                    if (hashSet.contains(Long.valueOf(j))) {
                        hashSet.remove(Long.valueOf(j));
                    } else {
                        hashSet.add(Long.valueOf(j));
                    }
                    if (view instanceof SelectorUserCell) {
                        ((SelectorUserCell) view).setChecked(hashSet.contains(Long.valueOf(j)), true);
                    }
                }
                break;
            default:
                ((DataAutoDownloadActivity) this.f$0).lambda$createView$4(view, f, i);
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
        AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda8(11, groupCallMiniTextureView, bitmap));
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$r8$classId) {
            case 2:
                RecyclerListView.drawBackgroundRect((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((UniversalRecyclerView) this.f$0).resourcesProvider);
                break;
            case 9:
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ContactAddActivity contactAddActivity = (ContactAddActivity) this.f$0;
                int i = ((UItem) obj).id;
                if (i != 1) {
                    if (i == 2) {
                        boolean z = !contactAddActivity.checkShare;
                        contactAddActivity.checkShare = z;
                        ((TextCheckCell) view).setChecked(z);
                    }
                    break;
                } else {
                    TLRPC.User user = contactAddActivity.getMessagesController().getUser(Long.valueOf(contactAddActivity.user_id));
                    if (user != null && contactAddActivity.getParentActivity() != null) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(contactAddActivity.getParentActivity(), 0, contactAddActivity.resourcesProvider);
                        String string = LocaleController.getString(R.string.DeleteContact);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string;
                        alertDialog.message = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new RateCallLayout$$ExternalSyntheticLambda1(24, contactAddActivity, user));
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        builder.makeRed(-1);
                        builder.show();
                        break;
                    }
                }
                break;
            default:
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                EnableTopicsActivity enableTopicsActivity = (EnableTopicsActivity) this.f$0;
                if (((UItem) obj).id == 1 && enableTopicsActivity.currentChat != null) {
                    boolean z2 = !enableTopicsActivity.forum;
                    enableTopicsActivity.forum = z2;
                    OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18 = enableTopicsActivity.onForumChanged;
                    if (oAuthSheet$$ExternalSyntheticLambda18 != null) {
                        oAuthSheet$$ExternalSyntheticLambda18.run(Boolean.valueOf(z2), Boolean.valueOf(enableTopicsActivity.isTabs));
                    }
                    ((TextCheckCell) view2).setChecked(enableTopicsActivity.forum);
                    enableTopicsActivity.listView.adapter.update(true);
                    break;
                }
                break;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((LaunchActivity$$ExternalSyntheticLambda37) this.f$0).run();
        return true;
    }
}
