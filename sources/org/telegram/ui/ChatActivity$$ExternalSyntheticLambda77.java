package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Business.ChatbotSheet;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.DialogsHintCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.RadioButtonCell;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.SmoothScroller;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda0;
import org.telegram.ui.web.AddressBarList;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.WebActionBar;

public final class ChatActivity$$ExternalSyntheticLambda77 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ChatActivity$$ExternalSyntheticLambda77(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onClick(View view) {
        String strDecode;
        View.OnClickListener onClickListener;
        int i = 0;
        int i2 = 1;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) obj2).lambda$createView$78((Context) obj);
                break;
            case 1:
                ((VideoAds) obj2).lambda$show$2((VideoAds.CloseDrawable) obj, view);
                break;
            case 2:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                break;
            case 3:
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) obj2;
                ArrayList arrayList = actionBarMenuItem.currentSearchFilters;
                ActionBarMenuItem.SearchFilterView searchFilterView = (ActionBarMenuItem.SearchFilterView) obj;
                int iIndexOf = arrayList.indexOf(searchFilterView.getFilter());
                if (actionBarMenuItem.selectedFilterIndex != iIndexOf) {
                    actionBarMenuItem.selectedFilterIndex = iIndexOf;
                    actionBarMenuItem.onFiltersChanged();
                } else if (searchFilterView.getFilter().removable) {
                    if (searchFilterView.animatorIsSelected.value) {
                        FiltersView.MediaFilterData filter = searchFilterView.getFilter();
                        if (filter.removable) {
                            arrayList.remove(filter);
                            int i3 = actionBarMenuItem.selectedFilterIndex;
                            if (i3 < 0 || i3 > arrayList.size() - 1) {
                                actionBarMenuItem.selectedFilterIndex = arrayList.size() - 1;
                            }
                            actionBarMenuItem.onFiltersChanged();
                            actionBarMenuItem.searchField.hideActionMode();
                        }
                        OKLCH oklch = actionBarMenuItem.listener;
                        if (oklch != null) {
                            oklch.onSearchFilterCleared(filter);
                            actionBarMenuItem.listener.onTextChanged(actionBarMenuItem.searchField);
                        }
                    } else {
                        searchFilterView.setSelectedForDelete(true);
                    }
                }
                break;
            case 4:
                ActionBarMenuItem.Item item = (ActionBarMenuItem.Item) obj2;
                ActionBarMenuItem actionBarMenuItem2 = (ActionBarMenuItem) obj;
                ActionBarPopupWindow actionBarPopupWindow = actionBarMenuItem2.popupWindow;
                if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing() && item.dismiss) {
                    if (!actionBarMenuItem2.processedPopupClick) {
                        actionBarMenuItem2.processedPopupClick = true;
                        actionBarMenuItem2.popupWindow.dismiss(actionBarMenuItem2.allowCloseAnimation);
                    }
                }
                ActionBarMenu actionBarMenu = actionBarMenuItem2.parentMenu;
                if (actionBarMenu != null) {
                    actionBarMenu.onItemClick(((Integer) view.getTag()).intValue());
                } else {
                    ActionBarMenuItem.ActionBarMenuItemDelegate actionBarMenuItemDelegate = actionBarMenuItem2.delegate;
                    if (actionBarMenuItemDelegate != null) {
                        actionBarMenuItemDelegate.onItemClick(((Integer) view.getTag()).intValue());
                    }
                }
                break;
            case 5:
                AlertDialog alertDialog = (AlertDialog) obj2;
                alertDialog.getClass();
                if (!((AlertDialog.AnonymousClass5) obj).loading) {
                    AlertDialog.OnButtonClickListener onButtonClickListener = alertDialog.positiveButtonListener;
                    if (onButtonClickListener != null) {
                        onButtonClickListener.onClick(alertDialog, -1);
                    }
                    if (alertDialog.dismissDialogByButtons) {
                        alertDialog.dismiss();
                    }
                    break;
                }
                break;
            case 6:
                AlertDialog alertDialog2 = (AlertDialog) obj2;
                alertDialog2.getClass();
                if (!((AlertDialog.AnonymousClass6) obj).loading) {
                    AlertDialog.OnButtonClickListener onButtonClickListener2 = alertDialog2.negativeButtonListener;
                    if (onButtonClickListener2 != null) {
                        onButtonClickListener2.onClick(alertDialog2, -2);
                    }
                    if (alertDialog2.dismissDialogByButtons) {
                        alertDialog2.cancel();
                    }
                    break;
                }
                break;
            case 7:
                AlertDialog alertDialog3 = (AlertDialog) obj2;
                alertDialog3.getClass();
                if (!((AlertDialog.AnonymousClass7) obj).loading) {
                    AlertDialog.OnButtonClickListener onButtonClickListener3 = alertDialog3.neutralButtonListener;
                    if (onButtonClickListener3 != null) {
                        onButtonClickListener3.onClick(alertDialog3, -2);
                    }
                    if (alertDialog3.dismissDialogByButtons) {
                        alertDialog3.dismiss();
                    }
                    break;
                }
                break;
            case 8:
                AlertDialog alertDialog4 = (AlertDialog) obj2;
                alertDialog4.getClass();
                if (!((AlertDialog.AnonymousClass8) obj).loading) {
                    RichInlineButtonEditor$$ExternalSyntheticLambda0 richInlineButtonEditor$$ExternalSyntheticLambda0 = alertDialog4.negative2ButtonListener;
                    if (richInlineButtonEditor$$ExternalSyntheticLambda0 != null) {
                        richInlineButtonEditor$$ExternalSyntheticLambda0.onClick(alertDialog4, -2);
                    }
                    if (alertDialog4.dismissDialogByButtons) {
                        alertDialog4.cancel();
                    }
                    break;
                }
                break;
            case 9:
                ArticleViewer articleViewer = (ArticleViewer) obj2;
                if (!articleViewer.actionBar.longClicked) {
                    ArticleViewer.PageLayout pageLayout = articleViewer.pages[0];
                    Activity activity = (Activity) obj;
                    if (!pageLayout.isWeb()) {
                        if (articleViewer.sheet != null) {
                            SmoothScroller smoothScroller = new SmoothScroller(activity);
                            smoothScroller.mTargetPosition = 1;
                            smoothScroller.offset = -AndroidUtilities.dp(32.0f);
                            pageLayout.layoutManager.startSmoothScroll(smoothScroller);
                        } else {
                            pageLayout.listView.smoothScrollToPosition(0);
                        }
                        break;
                    } else if (pageLayout.getWebView() != null && !articleViewer.actionBar.addressing) {
                        if (articleViewer.addressBarList != null) {
                            BotWebViewContainer.MyWebView webView = pageLayout.getWebView();
                            String title = webView != null ? webView.getTitle() : null;
                            String strMagic2tonsite = BotWebViewContainer.magic2tonsite(webView != null ? webView.getUrl() : null);
                            AddressBarList addressBarList = articleViewer.addressBarList;
                            Bitmap favicon = webView != null ? webView.getFavicon() : null;
                            if (TextUtils.isEmpty(title)) {
                                title = LocaleController.getString(R.string.WebEmpty);
                            }
                            String strReplace = TextUtils.isEmpty(strMagic2tonsite) ? "about:blank" : strMagic2tonsite;
                            ArticleViewer$$ExternalSyntheticLambda32 articleViewer$$ExternalSyntheticLambda32 = new ArticleViewer$$ExternalSyntheticLambda32(articleViewer, strMagic2tonsite, i);
                            ArticleViewer$$ExternalSyntheticLambda33 articleViewer$$ExternalSyntheticLambda33 = new ArticleViewer$$ExternalSyntheticLambda33(articleViewer, pageLayout, activity, i);
                            ArticleViewer$$ExternalSyntheticLambda10 articleViewer$$ExternalSyntheticLambda10 = new ArticleViewer$$ExternalSyntheticLambda10(articleViewer, i2);
                            ArticleViewer$$ExternalSyntheticLambda10 articleViewer$$ExternalSyntheticLambda11 = new ArticleViewer$$ExternalSyntheticLambda10(articleViewer, 2);
                            ChatActivity$$ExternalSyntheticLambda62 chatActivity$$ExternalSyntheticLambda62 = new ChatActivity$$ExternalSyntheticLambda62(articleViewer, strMagic2tonsite, pageLayout, i2);
                            ImageView imageView = addressBarList.currentIconView;
                            if (favicon == null) {
                                imageView.setImageResource(R.drawable.msg_language);
                                imageView.setColorFilter(new PorterDuffColorFilter(addressBarList.textColor, PorterDuff.Mode.SRC_IN));
                            } else {
                                imageView.setImageDrawable(new BitmapDrawable(addressBarList.getContext().getResources(), favicon));
                                imageView.setColorFilter((ColorFilter) null);
                            }
                            TextView textView = addressBarList.currentTitleView;
                            textView.setText(Emoji.replaceEmoji(title, textView.getPaint().getFontMetricsInt(), false));
                            try {
                                try {
                                    Uri uri = Uri.parse(strReplace);
                                    strReplace = Browser.replace(uri, null, null, Browser.IDN_toUnicode(uri.getHost()), null);
                                } catch (Exception e) {
                                    FileLog.e((Throwable) e, false);
                                }
                                strDecode = URLDecoder.decode(strReplace.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e2) {
                                FileLog.e(e2);
                                strDecode = strReplace;
                            }
                            TextView textView2 = addressBarList.currentLinkView;
                            textView2.setText(Emoji.replaceEmoji(strDecode, textView2.getPaint().getFontMetricsInt(), false));
                            addressBarList.onQueryClick = articleViewer$$ExternalSyntheticLambda33;
                            addressBarList.onQueryInsertClick = articleViewer$$ExternalSyntheticLambda10;
                            addressBarList.onURLClick = articleViewer$$ExternalSyntheticLambda11;
                            addressBarList.currentView.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda28(9, addressBarList, articleViewer$$ExternalSyntheticLambda32));
                            addressBarList.currentCopyView.setOnClickListener(chatActivity$$ExternalSyntheticLambda62);
                            addressBarList.hideCurrent = false;
                            addressBarList.setInput(null);
                            AddressBarList.AnonymousClass1 anonymousClass1 = addressBarList.listView;
                            anonymousClass1.adapter.update(true);
                            anonymousClass1.scrollToPosition(0);
                        }
                        ArticleViewer.AnonymousClass15 anonymousClass15 = articleViewer.actionBar;
                        ArticleViewer$$ExternalSyntheticLambda21 articleViewer$$ExternalSyntheticLambda21 = new ArticleViewer$$ExternalSyntheticLambda21(5, pageLayout, activity);
                        WebActionBar.AnonymousClass4 anonymousClass4 = anonymousClass15.addressEditText;
                        anonymousClass4.setText("");
                        anonymousClass4.setSelection(0, anonymousClass4.getText().length());
                        anonymousClass4.setScrollX(0);
                        anonymousClass15.urlCallback = articleViewer$$ExternalSyntheticLambda21;
                        anonymousClass15.showAddress(true);
                        break;
                    }
                }
                break;
            case 10:
                ArticleViewer.BlockChannelCell blockChannelCell = (ArticleViewer.BlockChannelCell) obj2;
                if (blockChannelCell.currentState == 0) {
                    blockChannelCell.setState(1, true);
                    IArticleViewer iArticleViewer = (IArticleViewer) obj;
                    int i4 = ((ArticleViewer) iArticleViewer).currentAccount;
                    TLRPC.Chat chat = iArticleViewer.loadedChannel;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i4).sendRequestTyped(tL_channels_joinChannel, new ArticleViewer$$ExternalSyntheticLambda57(blockChannelCell, i4, tL_channels_joinChannel, chat));
                    break;
                }
                break;
            case 11:
                AvatarPreviewer.Layout layout = (AvatarPreviewer.Layout) obj2;
                layout.setShowing$1(false);
                layout.callback.onMenuClick((AvatarPreviewer.MenuItem) obj);
                break;
            case 12:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) obj).link);
                BulletinFactory.of((ChatActivity) obj2).createCopyLinkBulletin(false).show();
                break;
            case 13:
                ((ChatbotSheet) obj2).lambda$new$7((TL_account.TL_connectedBot) obj);
                break;
            case 14:
                CacheControlActivity.this.toggleOtherSelected((CheckBoxCell) obj);
                break;
            case 15:
                CachedMediaLayout.AnonymousClass1 anonymousClass2 = (CachedMediaLayout.AnonymousClass1) obj2;
                CachedMediaLayout.Delegate delegate = CachedMediaLayout.this.delegate;
                if (delegate != null) {
                    CachedMediaLayout.ItemInner itemInner = (CachedMediaLayout.ItemInner) obj;
                    delegate.onItemSelected(itemInner.entities, itemInner.file, true);
                }
                ActionBarPopupWindow actionBarPopupWindow2 = anonymousClass2.popupWindow;
                if (actionBarPopupWindow2 != null) {
                    actionBarPopupWindow2.dismiss(true);
                }
                break;
            case 16:
                CallLogActivity callLogActivity = (CallLogActivity) obj2;
                CallLogActivity.CallLogRow callLogRow = (CallLogActivity.CallLogRow) obj;
                int size = callLogRow.users.size();
                ArrayList arrayList2 = callLogRow.users;
                if (size == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList2.get(0);
                    TLRPC.UserFull userFull = callLogActivity.getMessagesController().getUserFull(user.id);
                    callLogActivity.lastCallUser = user;
                    boolean z = callLogRow.video;
                    VoIPHelper.startCall(user, z, z || (userFull != null && userFull.video_calls_available), callLogActivity.getParentActivity(), null, callLogActivity.getAccountInstance());
                } else {
                    boolean z2 = callLogRow.video;
                    HashSet hashSet = new HashSet();
                    int size2 = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj3 = arrayList2.get(i5);
                        i5++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj3).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) callLogRow.calls.get(0)).id;
                    AlertDialog alertDialog5 = new AlertDialog(callLogActivity.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = callLogActivity.getMessagesController().conferenceCallSizeLimit;
                    alertDialog5.setOnCancelListener(new CallLogActivity$$ExternalSyntheticLambda19(callLogActivity, callLogActivity.getConnectionsManager().sendRequest(getgroupcall, new CallLogActivity$$ExternalSyntheticLambda18(callLogActivity, alertDialog5, hashSet, tL_inputGroupCallInviteMessage, z2, 1)), i2));
                    AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog5.showRunnable;
                    AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                    AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 600L);
                }
                break;
            case 17:
                if (((DialogsHintCell) obj2).getAlpha() > 0.5f && (onClickListener = (View.OnClickListener) obj) != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 18:
                ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) obj2;
                if (buttonWithCounterView.timerSeconds > 0) {
                    AndroidUtilities.shakeViewSpring(buttonWithCounterView, 3.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                } else {
                    ((BottomSheet) obj).lambda$showGiftOfferSheet$15();
                }
                break;
            case 19:
                ChannelMonetizationLayout channelMonetizationLayout = (ChannelMonetizationLayout) obj2;
                channelMonetizationLayout.getClass();
                if (view.isEnabled()) {
                    ButtonWithCounterView buttonWithCounterView2 = channelMonetizationLayout.balanceButton;
                    if (!buttonWithCounterView2.loading) {
                        ChannelMonetizationLayout.AnonymousClass6 anonymousClass6 = channelMonetizationLayout.starsBalanceButton;
                        if (anonymousClass6 == null || !anonymousClass6.loading) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            ChannelMonetizationLayout$$ExternalSyntheticLambda21 channelMonetizationLayout$$ExternalSyntheticLambda21 = new ChannelMonetizationLayout$$ExternalSyntheticLambda21(channelMonetizationLayout, twoStepVerificationActivity, i);
                            twoStepVerificationActivity.delegateType = 1;
                            twoStepVerificationActivity.delegate = channelMonetizationLayout$$ExternalSyntheticLambda21;
                            buttonWithCounterView2.setLoading(true);
                            twoStepVerificationActivity.preload(new ChannelMonetizationLayout$$ExternalSyntheticLambda22(channelMonetizationLayout, (StatisticActivity) obj, twoStepVerificationActivity, i));
                        }
                    }
                }
                break;
            case 20:
                Browser.openUrl((Context) obj, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj2).transaction_url);
                break;
            case 21:
                ((ChatActivity) obj2).lambda$updatePinnedMessageView$226((String) obj);
                break;
            case 22:
                ChatActivity chatActivity = (ChatActivity) obj2;
                if (chatActivity.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    chatActivity.createUndoView();
                    UndoView undoView = chatActivity.undoView;
                    if (undoView != null) {
                        long j = chatActivity.dialog_id;
                        int i6 = UndoView.$r8$clinit;
                        undoView.showWithAction(j, 83, (Object) null, (Object) null, new ChatActivity.AnonymousClass111(chatActivity, i), (Runnable) null);
                    }
                }
                chatActivity.closeMenu(true);
                break;
            case 23:
                ((ChatActivity) obj2).lambda$updateTopPanel$228((ItemOptions) obj);
                break;
            case 24:
                CheckBoxCell checkBoxCell = (CheckBoxCell) obj2;
                boolean z3 = !checkBoxCell.isChecked();
                checkBoxCell.setChecked(z3, true);
                ((AtomicBoolean) obj).set(z3);
                break;
            case 25:
                ChatEditActivity chatEditActivity = (ChatEditActivity) obj2;
                Context context = (Context) obj;
                BottomSheet.Builder builder = new BottomSheet.Builder(context, null);
                BottomSheet bottomSheet = builder.bottomSheet;
                bottomSheet.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                HeaderCell headerCell = new HeaderCell(context, Theme.key_dialogTextBlue2, 23, 15, false);
                headerCell.setHeight(47);
                headerCell.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(headerCell);
                LinearLayout linearLayoutM = zzkf.m(context, 1);
                linearLayout.addView(linearLayoutM, LayoutHelper.createLinear(-1, -2));
                RadioButtonCell[] radioButtonCellArr = new RadioButtonCell[2];
                int i7 = 0;
                for (int i8 = 2; i7 < i8; i8 = 2) {
                    RadioButtonCell radioButtonCell = new RadioButtonCell(context, true);
                    radioButtonCellArr[i7] = radioButtonCell;
                    radioButtonCell.setTag(Integer.valueOf(i7));
                    radioButtonCellArr[i7].setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    if (i7 == 0) {
                        radioButtonCellArr[i7].setTextAndValue(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !chatEditActivity.historyHidden);
                    } else if (ChatObject.isChannel(chatEditActivity.currentChat)) {
                        radioButtonCellArr[i7].setTextAndValue(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, chatEditActivity.historyHidden);
                    } else {
                        radioButtonCellArr[i7].setTextAndValue(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, chatEditActivity.historyHidden);
                    }
                    linearLayoutM.addView(radioButtonCellArr[i7], LayoutHelper.createLinear(-1, -2));
                    radioButtonCellArr[i7].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62(chatEditActivity, radioButtonCellArr, builder, 10));
                    i7++;
                }
                bottomSheet.customView = linearLayout;
                chatEditActivity.showDialog(bottomSheet);
                break;
            case 26:
                ((ChatEditActivity) obj2).lambda$createView$27((FrameLayout) obj, view);
                break;
            case 27:
                ((ChatRightsEditActivity) obj2).lambda$createView$5((BottomSheet.Builder) obj, view);
                break;
            case 28:
                new PremiumFeatureBottomSheet(((AIEditorAlert) obj2).getContext(), 42, (Theme.ResourcesProvider) obj).show();
                break;
            default:
                ((AIEditorAlert.CreateAiStyleAlert) obj2).lambda$new$8$1((Theme.ResourcesProvider) obj);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda77(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = obj2;
    }
}
