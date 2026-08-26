package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Cells.ActiveGiftAuctionsHintCell;
import org.telegram.ui.Cells.DialogsHintCell;
import org.telegram.ui.Cells.UnconfirmedAuthHintCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.voip.VoIPStatusTextView;
import org.telegram.ui.Components.voip.VoIPTimerView;
import org.telegram.ui.Components.voip.VoIpBitmapTextView;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.Gifts.AuctionWearingSheet;
import org.telegram.ui.Gifts.GiftSheet;

public final class ComposeDrawable$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public ComposeDrawable$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        int i = 2;
        int i2 = 0;
        switch (this.$r8$classId) {
            case 0:
                ComposeDrawable composeDrawable = (ComposeDrawable) this.f$0;
                ArrayList arrayList = composeDrawable.views;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((View) obj).invalidate();
                }
                composeDrawable.invalidateSelf();
                break;
            case 1:
                TextView[] textViewArr = ((VoIPStatusTextView) this.f$0).textView;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 2:
                TextView[] textViewArr2 = ((VoIPStatusTextView) ((ProfileActivity.AnonymousClass47) this.f$0).this$0).textView;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                break;
            case 3:
                VoIPTimerView voIPTimerView = (VoIPTimerView) this.f$0;
                if (voIPTimerView.getVisibility() == 0) {
                    voIPTimerView.updateTimer();
                }
                break;
            case 4:
                VoIpBitmapTextView voIpBitmapTextView = (VoIpBitmapTextView) this.f$0;
                voIpBitmapTextView.bitmap = Bitmap.createBitmap(voIpBitmapTextView.getMeasuredWidth(), voIpBitmapTextView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(voIpBitmapTextView.bitmap).drawText(voIpBitmapTextView.text, voIpBitmapTextView.getMeasuredWidth() / 2, (int) ((voIpBitmapTextView.getMeasuredHeight() / 2) - ((voIpBitmapTextView.textPaint.ascent() + voIpBitmapTextView.textPaint.descent()) / 2.0f)), voIpBitmapTextView.textPaint);
                voIpBitmapTextView.postInvalidate();
                break;
            case 5:
                ContactsActivity contactsActivity = ContactsActivity.this;
                contactsActivity.searchField.editText.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.searchField.editText);
                break;
            case 6:
                ContentPreviewViewer.this.dismissPopupWindow();
                break;
            case 7:
                MemberRequestsDelegate.PreviewDialog previewDialog = (MemberRequestsDelegate.PreviewDialog) this.f$0;
                previewDialog.updateBackgroundBitmap();
                previewDialog.runAnimation(true);
                break;
            case 8:
                BottomSheet[] bottomSheetArr = (BottomSheet[]) this.f$0;
                BottomSheet bottomSheet = bottomSheetArr[0];
                if (bottomSheet != null) {
                    bottomSheet.lambda$showGiftOfferSheet$15();
                    bottomSheetArr[0] = null;
                }
                break;
            case 9:
                ((AccountInstance) this.f$0).getDownloadController().loadDownloadingFiles();
                break;
            case 10:
                ((DialogsHintCell) this.f$0).updateColors();
                break;
            case 11:
                ((UnconfirmedAuthHintCell) this.f$0).updateColors();
                break;
            case 12:
                ((ActiveGiftAuctionsHintCell) this.f$0).updateColors$1();
                break;
            case 13:
                DialogsActivity.AnonymousClass10 anonymousClass10 = (DialogsActivity.AnonymousClass10) this.f$0;
                anonymousClass10.getClass();
                DialogsActivity dialogsActivity = DialogsActivity.this;
                dialogsActivity.showDialog(new PremiumFeatureBottomSheet(dialogsActivity, dialogsActivity.getParentActivity(), dialogsActivity.getCurrentAccount(), false, 9, true, null));
                dialogsActivity.filterTabsView.setIsEditing(false);
                dialogsActivity.showDoneItem(false);
                break;
            case 14:
                DialogsActivity dialogsActivity2 = DialogsActivity.this;
                dialogsActivity2.filterTabsView.setIsEditing(true);
                dialogsActivity2.showDoneItem(true);
                break;
            case 15:
                DialogsActivity.this.passcodeItem.setAlpha(1.0f);
                break;
            case 16:
                DialogsActivity.AnonymousClass50 anonymousClass50 = (DialogsActivity.AnonymousClass50) this.f$0;
                anonymousClass50.getClass();
                Bundle bundle = new Bundle();
                DialogsActivity dialogsActivity3 = DialogsActivity.this;
                bundle.putLong("user_id", UserConfig.getInstance(((BaseFragment) dialogsActivity3).currentAccount).getClientUserId());
                bundle.putBoolean("my_profile", true);
                dialogsActivity3.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 17:
                ((EditWidgetActivity) this.f$0).removeSelfFromStack();
                break;
            case 18:
                EmojiAnimationsOverlay emojiAnimationsOverlay = (EmojiAnimationsOverlay) this.f$0;
                ArrayList arrayList2 = emojiAnimationsOverlay.animationIndexes;
                ArrayList arrayList3 = emojiAnimationsOverlay.timeIntervals;
                if (emojiAnimationsOverlay.lastTappedMsgId != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = emojiAnimationsOverlay.lastTappedMsgId;
                    tL_sendMessageEmojiInteraction.emoticon = emojiAnimationsOverlay.lastTappedEmoji;
                    tL_sendMessageEmojiInteraction.interaction = new TLRPC.TL_dataJSON();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("v", 1);
                        JSONArray jSONArray = new JSONArray();
                        for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("i", ((Integer) arrayList2.get(i3)).intValue() + 1);
                                jSONObject2.put("t", ((Long) arrayList3.get(i3)).longValue() / 1000.0f);
                                jSONArray.put(i3, jSONObject2);
                            } catch (JSONException e) {
                                e = e;
                                emojiAnimationsOverlay.lastTappedMsgId = 0;
                                emojiAnimationsOverlay.lastTappedEmoji = null;
                                emojiAnimationsOverlay.lastTappedTime = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                emojiAnimationsOverlay.sentInteractionsRunnable = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j = emojiAnimationsOverlay.threadMsgId;
                        if (j != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(emojiAnimationsOverlay.currentAccount).getInputPeer(emojiAnimationsOverlay.dialogId);
                        ConnectionsManager.getInstance(emojiAnimationsOverlay.currentAccount).sendRequest(tL_messages_setTyping, null);
                        emojiAnimationsOverlay.lastTappedMsgId = 0;
                        emojiAnimationsOverlay.lastTappedEmoji = null;
                        emojiAnimationsOverlay.lastTappedTime = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e2) {
                        e = e2;
                    }
                }
                emojiAnimationsOverlay.sentInteractionsRunnable = null;
                break;
            case 19:
                ((FilterChatlistActivity) this.f$0).updateDoneProgress$2(true);
                break;
            case 20:
                ((FilterChatlistActivity.InviteLinkCell) this.f$0).linkBox.getBackground().setState(new int[0]);
                break;
            case 21:
                FilteredSearchView filteredSearchView = (FilteredSearchView) this.f$0;
                AndroidUtilities.cancelRunOnUIThread(filteredSearchView.hideFloatingDateRunnable);
                filteredSearchView.animatorFloatingDataVisible.setValue(false, true);
                break;
            case 22:
                FilteredSearchView filteredSearchView2 = FilteredSearchView.this;
                filteredSearchView2.search(filteredSearchView2.currentSearchDialogId, filteredSearchView2.currentSearchCommunityId, filteredSearchView2.currentSearchMinDate, filteredSearchView2.currentSearchMaxDate, filteredSearchView2.currentSearchFilter, filteredSearchView2.currentIncludeFolder, filteredSearchView2.lastMessagesSearchString, false);
                break;
            case 23:
                ((FiltersSetupActivity) ((ChatActivity.AnonymousClass34) this.f$0).this$0).getMessagesController().lockFiltersInternal();
                break;
            case 24:
                FiltersSetupActivity.FilterCell filterCell = (FiltersSetupActivity.FilterCell) this.f$0;
                filterCell.shareLoadingDrawable.disappear();
                filterCell.shareImageView.invalidate();
                FiltersSetupActivity.this.updateRows$3(true);
                break;
            case 25:
                FiltersSetupActivity.TouchHelperCallback touchHelperCallback = (FiltersSetupActivity.TouchHelperCallback) this.f$0;
                touchHelperCallback.getClass();
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    FiltersSetupActivity filtersSetupActivity = FiltersSetupActivity.this;
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i4 = 0; i4 < dialogFilters.size(); i4++) {
                        if (dialogFilters.get(i4).isDefault() && i4 != 0) {
                            FiltersSetupActivity.ListAdapter listAdapter = filtersSetupActivity.adapter;
                            ArrayList<MessagesController.DialogFilter> arrayList4 = FiltersSetupActivity.this.getMessagesController().dialogFilters;
                            if (i4 >= 0 && i4 < arrayList4.size()) {
                                arrayList4.add(0, arrayList4.remove(i4));
                                for (int i5 = 0; i5 <= i4; i5++) {
                                    arrayList4.get(i5).order = i5;
                                }
                                FiltersSetupActivity filtersSetupActivity2 = FiltersSetupActivity.this;
                                filtersSetupActivity2.orderChanged = true;
                                filtersSetupActivity2.updateRows$3(true);
                            }
                            filtersSetupActivity.listView.scrollToPosition(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, 1);
                                break;
                            } catch (Exception unused) {
                            }
                            BulletinFactory.of(filtersSetupActivity).createSimpleBulletin(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new FiltersSetupActivity$$ExternalSyntheticLambda1(filtersSetupActivity, i)).show();
                        }
                        break;
                    }
                    break;
                }
                break;
            case 26:
                AuctionBidSheet auctionBidSheet = (AuctionBidSheet) this.f$0;
                auctionBidSheet.selfBidderFutureGift.setTranslationX(auctionBidSheet.selfBidderHeader.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                break;
            case 27:
                ((AuctionWearingSheet) this.f$0).lambda$openCrafting$8();
                break;
            case 28:
                UniversalAdapter universalAdapter = ((GiftSheet) this.f$0).adapter;
                if (universalAdapter != null) {
                    universalAdapter.update(false);
                }
                break;
            default:
                ((GiftSheet.CardBackground) this.f$0).invalidate();
                break;
        }
    }
}
