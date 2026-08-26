package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessIntroActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TopicSearchCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.TextPaintView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.ThemeSmallPreviewView;
import org.telegram.ui.Components.Tooltip$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.CollageLayout;
import org.telegram.ui.Stories.recorder.CollageLayoutButton;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;

public final class TopicsFragment$$ExternalSyntheticLambda9 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public TopicsFragment$$ExternalSyntheticLambda9(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onItemClick(int i, View view) {
        Tooltip$$ExternalSyntheticLambda0 tooltip$$ExternalSyntheticLambda0;
        TLRPC.Document document;
        AnimatedEmojiDrawable animatedEmojiDrawable;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        TLRPC.BotInlineResult botInlineResult = null;
        int iDp = 0;
        int i2 = 1;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((TopicsFragment) obj).lambda$createView$3$1(view);
                break;
            case 1:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                ArrayList arrayList = proxyListActivity.proxyList;
                if (i == 0) {
                    if (SharedConfig.currentProxy == null) {
                        if (arrayList.isEmpty()) {
                            proxyListActivity.presentFragment(new ProxySettingsActivity());
                        } else {
                            SharedConfig.currentProxy = (SharedConfig.ProxyInfo) arrayList.get(0);
                            if (!proxyListActivity.useProxySettings) {
                                MessagesController.getGlobalMainSettings();
                                SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                                editorEdit.putString("proxy_ip", SharedConfig.currentProxy.address);
                                editorEdit.putString("proxy_pass", SharedConfig.currentProxy.password);
                                editorEdit.putString("proxy_user", SharedConfig.currentProxy.username);
                                editorEdit.putInt("proxy_port", SharedConfig.currentProxy.port);
                                editorEdit.putString("proxy_secret", SharedConfig.currentProxy.secret);
                                editorEdit.commit();
                            }
                        }
                    }
                    proxyListActivity.useProxySettings = !proxyListActivity.useProxySettings;
                    proxyListActivity.updateRows$7(true);
                    MessagesController.getGlobalMainSettings();
                    ((TextCheckCell) view).setChecked(proxyListActivity.useProxySettings);
                    if (!proxyListActivity.useProxySettings) {
                        RecyclerListView.Holder holder = (RecyclerListView.Holder) proxyListActivity.listView.findViewHolderForAdapterPosition(proxyListActivity.callsRow);
                        if (holder != null) {
                            ((TextCheckCell) holder.itemView).setChecked(false);
                        }
                        proxyListActivity.useProxyForCalls = false;
                    }
                    SharedPreferences.Editor editorEdit2 = MessagesController.getGlobalMainSettings().edit();
                    editorEdit2.putBoolean("proxy_enabled", proxyListActivity.useProxySettings);
                    editorEdit2.commit();
                    boolean z = proxyListActivity.useProxySettings;
                    SharedConfig.ProxyInfo proxyInfo = SharedConfig.currentProxy;
                    ConnectionsManager.setProxySettings(z, proxyInfo.address, proxyInfo.port, proxyInfo.username, proxyInfo.password, proxyInfo.secret);
                    NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                    int i3 = NotificationCenter.proxySettingsChanged;
                    globalInstance.removeObserver(proxyListActivity, i3);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i3, new Object[0]);
                    NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i3);
                    for (int i4 = proxyListActivity.proxyStartRow; i4 < proxyListActivity.proxyEndRow; i4++) {
                        RecyclerListView.Holder holder2 = (RecyclerListView.Holder) proxyListActivity.listView.findViewHolderForAdapterPosition(i4);
                        if (holder2 != null) {
                            ((ProxyListActivity.TextDetailProxyCell) holder2.itemView).updateStatus();
                        }
                    }
                } else if (i == proxyListActivity.rotationRow) {
                    boolean z2 = !SharedConfig.proxyRotationEnabled;
                    SharedConfig.proxyRotationEnabled = z2;
                    ((TextCheckCell) view).setChecked(z2);
                    SharedConfig.saveConfig();
                    proxyListActivity.updateRows$7(true);
                } else if (i == proxyListActivity.callsRow) {
                    boolean z3 = !proxyListActivity.useProxyForCalls;
                    proxyListActivity.useProxyForCalls = z3;
                    ((TextCheckCell) view).setChecked(z3);
                    SharedPreferences.Editor editorEdit3 = MessagesController.getGlobalMainSettings().edit();
                    editorEdit3.putBoolean("proxy_enabled_calls", proxyListActivity.useProxyForCalls);
                    editorEdit3.commit();
                } else if (i < proxyListActivity.proxyStartRow || i >= proxyListActivity.proxyEndRow) {
                    if (i == proxyListActivity.proxyAddRow) {
                        proxyListActivity.presentFragment(new ProxySettingsActivity());
                    } else if (i == proxyListActivity.deleteAllRow) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(proxyListActivity.getParentActivity(), 0, null);
                        String string = LocaleController.getString(R.string.DeleteAllProxiesConfirm);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.message = string;
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        alertDialog.title = LocaleController.getString(R.string.DeleteProxyTitle);
                        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new ProxyListActivity$$ExternalSyntheticLambda2(proxyListActivity));
                        proxyListActivity.showDialog(alertDialog);
                        TextView textView = (TextView) alertDialog.getButton(-1);
                        if (textView != null) {
                            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                        }
                    }
                } else if (proxyListActivity.selectedItems.isEmpty()) {
                    SharedConfig.ProxyInfo proxyInfo2 = (SharedConfig.ProxyInfo) arrayList.get(i - proxyListActivity.proxyStartRow);
                    proxyListActivity.useProxySettings = true;
                    SharedPreferences.Editor editorEdit4 = MessagesController.getGlobalMainSettings().edit();
                    editorEdit4.putString("proxy_ip", proxyInfo2.address);
                    editorEdit4.putString("proxy_pass", proxyInfo2.password);
                    editorEdit4.putString("proxy_user", proxyInfo2.username);
                    editorEdit4.putInt("proxy_port", proxyInfo2.port);
                    editorEdit4.putString("proxy_secret", proxyInfo2.secret);
                    editorEdit4.putBoolean("proxy_enabled", proxyListActivity.useProxySettings);
                    if (!proxyInfo2.secret.isEmpty()) {
                        proxyListActivity.useProxyForCalls = false;
                        editorEdit4.putBoolean("proxy_enabled_calls", false);
                    }
                    editorEdit4.commit();
                    SharedConfig.currentProxy = proxyInfo2;
                    for (int i5 = proxyListActivity.proxyStartRow; i5 < proxyListActivity.proxyEndRow; i5++) {
                        RecyclerListView.Holder holder3 = (RecyclerListView.Holder) proxyListActivity.listView.findViewHolderForAdapterPosition(i5);
                        if (holder3 != null) {
                            ProxyListActivity.TextDetailProxyCell textDetailProxyCell = (ProxyListActivity.TextDetailProxyCell) holder3.itemView;
                            textDetailProxyCell.setChecked(textDetailProxyCell.currentInfo == proxyInfo2);
                            textDetailProxyCell.updateStatus();
                        }
                    }
                    proxyListActivity.updateRows$7(false);
                    RecyclerListView.Holder holder4 = (RecyclerListView.Holder) proxyListActivity.listView.findViewHolderForAdapterPosition(0);
                    if (holder4 != null) {
                        ((TextCheckCell) holder4.itemView).setChecked(true);
                    }
                    boolean z4 = proxyListActivity.useProxySettings;
                    SharedConfig.ProxyInfo proxyInfo3 = SharedConfig.currentProxy;
                    ConnectionsManager.setProxySettings(z4, proxyInfo3.address, proxyInfo3.port, proxyInfo3.username, proxyInfo3.password, proxyInfo3.secret);
                } else {
                    proxyListActivity.listAdapter.toggleSelected(i);
                }
                break;
            case 2:
                QrActivity.ThemeListViewController themeListViewController = (QrActivity.ThemeListViewController) obj;
                ChatThemeBottomSheet.Adapter adapter = themeListViewController.adapter;
                if (adapter.items.get(i) != themeListViewController.selectedItem && themeListViewController.changeDayNightView == null) {
                    themeListViewController.isLightDarkChangeAnimation = false;
                    themeListViewController.selectedItem = (ChatThemeBottomSheet.ChatThemeItem) adapter.items.get(i);
                    adapter.setSelectedItem(i);
                    themeListViewController.rootLayout.postDelayed(new OAuthSheet$$ExternalSyntheticLambda17(themeListViewController, i, 23), 100L);
                    while (true) {
                        RecyclerListView recyclerListView = themeListViewController.recyclerView;
                        if (iDp >= recyclerListView.getChildCount()) {
                            if (!((ChatThemeBottomSheet.ChatThemeItem) adapter.items.get(i)).chatTheme.showAsDefaultStub) {
                                ((ThemeSmallPreviewView) view).playEmojiAnimation();
                            }
                            QrActivity$$ExternalSyntheticLambda1 qrActivity$$ExternalSyntheticLambda1 = themeListViewController.itemSelectedListener;
                            if (qrActivity$$ExternalSyntheticLambda1 != null) {
                                qrActivity$$ExternalSyntheticLambda1.f$0.onItemSelected(i, themeListViewController.selectedItem.chatTheme, true);
                            }
                        } else {
                            ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) recyclerListView.getChildAt(iDp);
                            if (themeSmallPreviewView != view && (tooltip$$ExternalSyntheticLambda0 = themeSmallPreviewView.animationCancelRunnable) != null) {
                                AndroidUtilities.cancelRunOnUIThread(tooltip$$ExternalSyntheticLambda0);
                                themeSmallPreviewView.animationCancelRunnable.run();
                            }
                            iDp++;
                        }
                        break;
                    }
                }
                break;
            case 3:
                ((ReactionsDoubleTapManageActivity) obj).lambda$createView$0$4(view);
                break;
            case 4:
                ((RestrictedLanguagesSelectActivity) obj).lambda$createView$1$5(i, view);
                break;
            case 5:
                SelectChatUserSheet selectChatUserSheet = (SelectChatUserSheet) obj;
                UItem item = selectChatUserSheet.adapter.getItem(i - 1);
                if (item != null) {
                    Object obj2 = item.object;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((ProfileSearchCell) view).setChecked(true, true);
                        selectChatUserSheet.selectedOwner = (TLObject) item.object;
                        selectChatUserSheet.updateButton$2(true);
                        selectChatUserSheet.adapter.update(true);
                    }
                    break;
                }
                break;
            case 6:
                ((SelectStoriesBottomSheet) obj).onItemClick(i, view);
                break;
            case 7:
                ((SessionsActivity) obj).lambda$createView$20(i);
                break;
            case 8:
                ((StarsIntroActivity) obj).lambda$createView$1$6(i);
                break;
            case 9:
                ((StarsIntroActivity.GiftStarsSheet) obj).lambda$new$0$5(i);
                break;
            case 10:
                ((StarsIntroActivity.StarsNeededSheet) obj).lambda$new$0$6(i);
                break;
            case 11:
                ((StarsIntroActivity.StarsOptionsSheet) obj).lambda$new$0$7(i);
                break;
            case 12:
                StatisticActivity statisticActivity = (StatisticActivity) obj;
                StatisticActivity.Adapter adapter2 = statisticActivity.adapter;
                int i6 = adapter2.recentPostsStartRow;
                if (i < i6 || i > adapter2.recentPostsEndRow) {
                    int i7 = adapter2.topAdminsStartRow;
                    if (i < i7 || i > adapter2.topAdminsEndRow) {
                        int i8 = adapter2.topMembersStartRow;
                        ArrayList arrayList2 = statisticActivity.topMembersVisible;
                        if (i < i8 || i > adapter2.topMembersEndRow) {
                            int i9 = adapter2.topInviterStartRow;
                            if (i >= i9 && i <= adapter2.topInviterEndRow) {
                                ((StatisticActivity.MemberData) statisticActivity.topInviters.get(i - i9)).onClick(statisticActivity);
                            } else if (i == adapter2.expandTopMembersRow) {
                                ArrayList arrayList3 = statisticActivity.topMembersAll;
                                int size = arrayList3.size() - arrayList2.size();
                                int i10 = statisticActivity.adapter.expandTopMembersRow;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList3);
                                StatisticActivity.Adapter adapter3 = statisticActivity.adapter;
                                if (adapter3 != null) {
                                    adapter3.update();
                                    statisticActivity.recyclerListView.setItemAnimator(statisticActivity.animator);
                                    statisticActivity.adapter.mObservable.notifyItemRangeInserted(i10 + 1, size);
                                    statisticActivity.adapter.mObservable.notifyItemRangeRemoved(i10, 1);
                                }
                            }
                        } else {
                            ((StatisticActivity.MemberData) arrayList2.get(i - i8)).onClick(statisticActivity);
                        }
                    } else {
                        ((StatisticActivity.MemberData) statisticActivity.topAdmins.get(i - i7)).onClick(statisticActivity);
                    }
                } else {
                    StatisticActivity.RecentPostInfo recentPostInfo = (StatisticActivity.RecentPostInfo) statisticActivity.recentAllSortedDataLoaded.get(i - i6);
                    MessageStatisticActivity messageStatisticActivity = new MessageStatisticActivity(recentPostInfo.message, true, statisticActivity.chatId);
                    messageStatisticActivity.recentPostInfo = recentPostInfo;
                    statisticActivity.presentFragment(messageStatisticActivity);
                }
                break;
            case 13:
                ((DialogsActivity.AnonymousClass25) obj).openStoryForCell((DialogStoriesCell.StoryCell) view, false);
                break;
            case 14:
                BotPreviewsEditContainer.BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditContainer.BotPreviewsEditLangContainer) obj;
                botPreviewsEditLangContainer.getClass();
                if (view instanceof SharedPhotoVideoCell2) {
                    MessageObject messageObject = ((SharedPhotoVideoCell2) view).getMessageObject();
                    SharedMediaLayout.AnonymousClass12 anonymousClass12 = botPreviewsEditLangContainer.this$0;
                    if (!SharedMediaLayout.this.isActionModeShowed) {
                        BaseFragment baseFragment = anonymousClass12.fragment;
                        StoryViewer orCreateStoryViewer = baseFragment.getOrCreateStoryViewer();
                        Context context = botPreviewsEditLangContainer.getContext();
                        int id = messageObject.getId();
                        StoriesController.BotPreviewsList botPreviewsList = botPreviewsEditLangContainer.list;
                        StoriesListPlaceProvider storiesListPlaceProvider = new StoriesListPlaceProvider(botPreviewsEditLangContainer.listView, false);
                        if ((baseFragment instanceof ProfileActivity) && ((ProfileActivity) baseFragment).myProfile) {
                            iDp = AndroidUtilities.dp(68.0f);
                        }
                        storiesListPlaceProvider.addBottomClip += iDp;
                        orCreateStoryViewer.open(context, id, botPreviewsList, storiesListPlaceProvider);
                    } else if (anonymousClass12.isSelected(messageObject)) {
                        anonymousClass12.unselect(messageObject);
                    } else {
                        anonymousClass12.select(messageObject);
                    }
                }
                break;
            case 15:
                Utilities.Callback callback = ((CollageLayoutButton.CollageLayoutListView) obj).onLayoutClick;
                if (callback != null) {
                    callback.run((CollageLayout) CollageLayout.getLayouts().get(i));
                }
                break;
            case 16:
                EmojiBottomSheet.GifPage gifPage = (EmojiBottomSheet.GifPage) obj;
                Object item2 = gifPage.adapter.getItem(i);
                if (item2 instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) item2;
                    document = botInlineResult.document;
                } else if (item2 instanceof TLRPC.Document) {
                    document = (TLRPC.Document) item2;
                }
                EmojiBottomSheet emojiBottomSheet = EmojiBottomSheet.this;
                Utilities.Callback3Return callback3Return = emojiBottomSheet.onDocumentSelected;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                emojiBottomSheet.lambda$showGiftOfferSheet$15();
                break;
            case 17:
                EmojiBottomSheet.Page page = (EmojiBottomSheet.Page) obj;
                if (i < 0) {
                    page.getClass();
                    break;
                } else {
                    page.layoutManager.getClass();
                    if (RecyclerView.getChildViewHolderInt(view).mItemViewType != 4) {
                        EmojiBottomSheet.Page.Adapter adapter4 = page.adapter;
                        TLRPC.Document documentFindDocument = i < adapter4.documents.size() ? (TLRPC.Document) adapter4.documents.get(i) : null;
                        EmojiBottomSheet emojiBottomSheet2 = EmojiBottomSheet.this;
                        if (documentFindDocument == emojiBottomSheet2.plus) {
                            BusinessIntroActivity$$ExternalSyntheticLambda3 businessIntroActivity$$ExternalSyntheticLambda3 = emojiBottomSheet2.onPlusSelected;
                            if (businessIntroActivity$$ExternalSyntheticLambda3 != null) {
                                businessIntroActivity$$ExternalSyntheticLambda3.run();
                            }
                            emojiBottomSheet2.lambda$showGiftOfferSheet$15();
                            break;
                        } else {
                            ArrayList arrayList4 = adapter4.documentIds;
                            long jLongValue = i >= arrayList4.size() ? 0L : ((Long) arrayList4.get(i)).longValue();
                            if (documentFindDocument == null && (view instanceof EmojiBottomSheet.EmojiListView.EmojiImageView) && (animatedEmojiDrawable = ((EmojiBottomSheet.EmojiListView.EmojiImageView) view).drawable) != null) {
                                documentFindDocument = animatedEmojiDrawable.document;
                            }
                            if (documentFindDocument == null && jLongValue != 0) {
                                documentFindDocument = AnimatedEmojiDrawable.findDocument(((BottomSheet) emojiBottomSheet2).currentAccount, jLongValue);
                            }
                            if (documentFindDocument != null) {
                                Utilities.Callback3Return callback3Return2 = emojiBottomSheet2.onDocumentSelected;
                                if (callback3Return2 != null) {
                                    callback3Return2.run(adapter4.setByDocumentId.get(Long.valueOf(documentFindDocument.id)), documentFindDocument, Boolean.FALSE);
                                }
                                emojiBottomSheet2.lambda$showGiftOfferSheet$15();
                                break;
                            }
                        }
                    }
                }
                break;
            case 18:
                StoryRecorder.AnonymousClass24 anonymousClass24 = (StoryRecorder.AnonymousClass24) obj;
                PaintTypeface paintTypeface = (PaintTypeface) PaintTypeface.get().get(i);
                anonymousClass24.textOptionsView.setTypeface(paintTypeface.key);
                PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(anonymousClass24.currentAccount);
                String str = paintTypeface.key;
                persistColorPalette.currentTypeface = str;
                persistColorPalette.mConfig.edit().putString("typeface", str).apply();
                EntityView entityView = anonymousClass24.currentEntityView;
                if (entityView instanceof TextPaintView) {
                    ((TextPaintView) entityView).setTypeface(paintTypeface);
                }
                anonymousClass24.showTypefaceMenu$1(false);
                break;
            case 19:
                ((TONIntroActivity) obj).lambda$createView$1$7(i);
                break;
            case 20:
                UniversalAdapter universalAdapter = ((TONIntroActivity.StarsNeededSheet) obj).adapter;
                if (universalAdapter != null) {
                    universalAdapter.getItem(i - 1);
                    break;
                }
                break;
            case 21:
                ThemePreviewActivity themePreviewActivity = (ThemePreviewActivity) obj;
                boolean z5 = themePreviewActivity.selectedPattern != null;
                themePreviewActivity.selectPattern(i);
                if (z5 == (themePreviewActivity.selectedPattern == null)) {
                    themePreviewActivity.animateMotionChange();
                    themePreviewActivity.updateMotionButton();
                }
                themePreviewActivity.updateSelectedPattern();
                themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, true);
                themePreviewActivity.patternsListView.invalidateViews();
                int left = view.getLeft();
                int right = view.getRight();
                int iDp2 = AndroidUtilities.dp(52.0f);
                int i11 = left - iDp2;
                if (i11 < 0) {
                    themePreviewActivity.patternsListView.smoothScrollBy(i11, 0, null);
                } else {
                    int i12 = right + iDp2;
                    if (i12 > themePreviewActivity.patternsListView.getMeasuredWidth()) {
                        MessageSeenView.AnonymousClass1 anonymousClass1 = themePreviewActivity.patternsListView;
                        anonymousClass1.smoothScrollBy(i12 - anonymousClass1.getMeasuredWidth(), 0, null);
                    }
                }
                break;
            case 22:
                TooManyCommunitiesActivity tooManyCommunitiesActivity = (TooManyCommunitiesActivity) obj;
                tooManyCommunitiesActivity.getClass();
                if (view instanceof GroupCreateUserCell) {
                    GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
                    TLRPC.Chat chat = (TLRPC.Chat) groupCreateUserCell.getObject();
                    HashSet hashSet = tooManyCommunitiesActivity.selectedIds;
                    if (hashSet.contains(Long.valueOf(chat.id))) {
                        hashSet.remove(Long.valueOf(chat.id));
                        groupCreateUserCell.setChecked(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.id));
                        groupCreateUserCell.setChecked(true, true);
                    }
                    boolean zIsEmpty = hashSet.isEmpty();
                    int i13 = tooManyCommunitiesActivity.buttonHeight;
                    if (zIsEmpty && tooManyCommunitiesActivity.buttonAnimation != -1 && tooManyCommunitiesActivity.buttonLayout.getVisibility() == 0) {
                        tooManyCommunitiesActivity.buttonAnimation = -1;
                        tooManyCommunitiesActivity.buttonLayout.animate().setListener(null).cancel();
                        tooManyCommunitiesActivity.buttonLayout.animate().translationY(i13).setDuration(200L).setListener(new TooManyCommunitiesActivity.AnonymousClass6(tooManyCommunitiesActivity, iDp)).start();
                        RecyclerListView recyclerListView2 = tooManyCommunitiesActivity.searchViewContainer.getVisibility() == 0 ? tooManyCommunitiesActivity.searchListView : tooManyCommunitiesActivity.listView;
                        recyclerListView2.hideSelector(false);
                        int iFindLastVisibleItemPosition = ((LinearLayoutManager) recyclerListView2.getLayoutManager()).findLastVisibleItemPosition();
                        if ((iFindLastVisibleItemPosition == recyclerListView2.getAdapter().getItemCount() - 1 || (iFindLastVisibleItemPosition == recyclerListView2.getAdapter().getItemCount() - 2 && recyclerListView2 == tooManyCommunitiesActivity.listView)) && (viewHolderFindViewHolderForAdapterPosition = recyclerListView2.findViewHolderForAdapterPosition(iFindLastVisibleItemPosition)) != null) {
                            int bottom = viewHolderFindViewHolderForAdapterPosition.itemView.getBottom();
                            if (iFindLastVisibleItemPosition == tooManyCommunitiesActivity.adapter.rowCount - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (recyclerListView2.getMeasuredHeight() - bottom <= i13) {
                                recyclerListView2.setTranslationY(-(recyclerListView2.getMeasuredHeight() - bottom));
                                recyclerListView2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        tooManyCommunitiesActivity.listView.setPadding(0, 0, 0, 0);
                        tooManyCommunitiesActivity.searchListView.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && tooManyCommunitiesActivity.buttonLayout.getVisibility() == 8 && tooManyCommunitiesActivity.buttonAnimation != 1) {
                        tooManyCommunitiesActivity.buttonAnimation = 1;
                        tooManyCommunitiesActivity.buttonLayout.setVisibility(0);
                        tooManyCommunitiesActivity.buttonLayout.setTranslationY(i13);
                        tooManyCommunitiesActivity.buttonLayout.animate().setListener(null).cancel();
                        tooManyCommunitiesActivity.buttonLayout.animate().translationY(0.0f).setDuration(200L).setListener(new TooManyCommunitiesActivity.AnonymousClass6(tooManyCommunitiesActivity, i2)).start();
                        tooManyCommunitiesActivity.listView.setPadding(0, 0, 0, i13 - AndroidUtilities.dp(12.0f));
                        tooManyCommunitiesActivity.searchListView.setPadding(0, 0, 0, i13);
                    }
                    if (!hashSet.isEmpty()) {
                        tooManyCommunitiesActivity.buttonTextView.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        RecyclerListView recyclerListView3 = tooManyCommunitiesActivity.searchViewContainer.getVisibility() == 0 ? tooManyCommunitiesActivity.searchListView : tooManyCommunitiesActivity.listView;
                        int height = recyclerListView3.getHeight() - view.getBottom();
                        if (height < i13) {
                            recyclerListView3.smoothScrollBy(0, i13 - height, null);
                        }
                    }
                }
                break;
            case 23:
                TopicsFragment.MessagesSearchContainer messagesSearchContainer = (TopicsFragment.MessagesSearchContainer) obj;
                messagesSearchContainer.getClass();
                boolean z6 = view instanceof TopicSearchCell;
                TopicsFragment topicsFragment = TopicsFragment.this;
                if (z6) {
                    ForumUtilities.openTopic(topicsFragment, topicsFragment.chatId, ((TopicSearchCell) view).getTopic(), 0);
                } else if (view instanceof TopicsFragment.TopicDialogCell) {
                    TopicsFragment.TopicDialogCell topicDialogCell = (TopicsFragment.TopicDialogCell) view;
                    ForumUtilities.openTopic(topicsFragment, topicsFragment.chatId, topicDialogCell.forumTopic, topicDialogCell.getMessageId());
                }
                break;
            case 24:
                ((TwoStepVerificationActivity) obj).lambda$createView$7$1(i);
                break;
            case 25:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                if (wallpapersListActivity.getParentActivity() != null && wallpapersListActivity.listView.getAdapter() != wallpapersListActivity.searchAdapter) {
                    if (i == wallpapersListActivity.uploadImageRow) {
                        wallpapersListActivity.updater.openGallery();
                    } else if (i == wallpapersListActivity.setColorRow) {
                        WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
                        wallpapersListActivity2.patterns = wallpapersListActivity.patterns;
                        wallpapersListActivity.presentFragment(wallpapersListActivity2);
                    } else if (i == wallpapersListActivity.resetRow) {
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(wallpapersListActivity.getParentActivity(), 0, null);
                        String string2 = LocaleController.getString(R.string.ResetChatBackgroundsAlertTitle);
                        AlertDialog alertDialog2 = builder2.alertDialog;
                        alertDialog2.title = string2;
                        alertDialog2.message = LocaleController.getString(R.string.ResetChatBackgroundsAlert);
                        builder2.setPositiveButton(LocaleController.getString(R.string.Reset), new WallpapersListActivity$$ExternalSyntheticLambda5(wallpapersListActivity));
                        builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        wallpapersListActivity.showDialog(alertDialog2);
                        TextView textView2 = (TextView) alertDialog2.getButton(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                        }
                    }
                    break;
                }
                break;
            case 26:
                WallpapersListActivity.SearchAdapter searchAdapter = (WallpapersListActivity.SearchAdapter) obj;
                searchAdapter.getClass();
                String string3 = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder sbM = Log.m(string3, " ");
                String[] strArr = WallpapersListActivity.searchColorsNames;
                sbM.append(LocaleController.getString(strArr[i], WallpapersListActivity.searchColorsNamesR[i]));
                SpannableString spannableString = new SpannableString(sbM.toString());
                spannableString.setSpan(new ForegroundColorSpan(Theme.getColor(null, Theme.key_actionBarDefaultSubtitle, false)), string3.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity3 = WallpapersListActivity.this;
                wallpapersListActivity3.searchItem.setSearchFieldCaption(spannableString);
                wallpapersListActivity3.searchItem.setSearchFieldHint(null);
                wallpapersListActivity3.searchItem.setSearchFieldText("", true);
                searchAdapter.selectedColor = strArr[i];
                searchAdapter.processSearch("", true);
                break;
            case 27:
                ((AffiliateProgramFragment) obj).lambda$createView$5$2(i);
                break;
            default:
                CommunityAddOptionsSheet communityAddOptionsSheet = (CommunityAddOptionsSheet) obj;
                int i14 = communityAddOptionsSheet.adapter.getItem(i - 1).id;
                if (i14 == 151) {
                    communityAddOptionsSheet.setIsHidden(false);
                } else if (i14 == 150) {
                    communityAddOptionsSheet.setIsHidden(true);
                }
                break;
        }
    }
}
