package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.util.Pair;
import android.view.View;
import androidx.collection.LongSparseArray;
import com.google.android.exoplayer2.RendererCapabilities;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Adapters.MessagesSearchAdapter;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.FeaturedStickerSetInfoCell;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.AdminLogFilterAlert2;
import org.telegram.ui.Components.AvatarConstructorFragment;
import org.telegram.ui.Components.BlockingUpdateView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.Bulletin$2$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.CaptionPhotoViewer;
import org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda45;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12;
import org.telegram.ui.Components.ChatGreetingsView;
import org.telegram.ui.Components.ClearHistoryAlert;
import org.telegram.ui.Components.CreateBotAlert$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.DeleteMessagesBottomSheet;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.EmojiTabsStrip;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.FilterGLThread$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.FolderBottomSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.FragmentSearchField;
import org.telegram.ui.Components.GigagroupConvertAlert;
import org.telegram.ui.Components.GroupCallPip;
import org.telegram.ui.Components.GroupCallPipAlertView;
import org.telegram.ui.Components.GuardBotReplaceSheet;
import org.telegram.ui.Components.HashtagActivity;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public final class ChatActivity$16$$ExternalSyntheticLambda4 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public ChatActivity$16$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onClick(View view) {
        int i;
        int i2;
        ChannelAdminLogActivity channelAdminLogActivity;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        TLObject tLObject;
        boolean z;
        DialogsActivity.AnonymousClass47 anonymousClass47;
        int i3 = 10;
        UndoView undoView = null;
        int i4 = 2;
        int i5 = 0;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = ChatActivity.this;
                chatActivity.headerItem.closeSubMenu();
                ChatActivity.AnonymousClass78 anonymousClass78 = chatActivity.chatAttachAlert;
                if (anonymousClass78 != null) {
                    anonymousClass78.setEditingMessageObject(null, 0);
                }
                chatActivity.openAttachMenu();
                break;
            case 1:
                ChatActivity chatActivity2 = ChatActivity.this;
                if (((BaseFragment) chatActivity2).parentLayout != null) {
                    ((ActionBarLayout) ((BaseFragment) chatActivity2).parentLayout).expandPreviewFragment();
                }
                break;
            case 2:
                ChatRightsEditActivity.this.onDonePressed(true);
                break;
            case 3:
                AdminLogFilterAlert2 adminLogFilterAlert2 = (AdminLogFilterAlert2) obj;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = adminLogFilterAlert2.currentFilter;
                if (tL_channelAdminLogEventsFilter.join && tL_channelAdminLogEventsFilter.leave && tL_channelAdminLogEventsFilter.edit_rank && tL_channelAdminLogEventsFilter.invite && tL_channelAdminLogEventsFilter.ban && tL_channelAdminLogEventsFilter.unban && tL_channelAdminLogEventsFilter.kick && tL_channelAdminLogEventsFilter.unkick && tL_channelAdminLogEventsFilter.promote && tL_channelAdminLogEventsFilter.demote && tL_channelAdminLogEventsFilter.info && tL_channelAdminLogEventsFilter.settings && tL_channelAdminLogEventsFilter.pinned && tL_channelAdminLogEventsFilter.edit && tL_channelAdminLogEventsFilter.delete && tL_channelAdminLogEventsFilter.group_call && tL_channelAdminLogEventsFilter.invites) {
                    adminLogFilterAlert2.currentFilter = null;
                }
                LongSparseArray longSparseArray = adminLogFilterAlert2.selectedAdmins;
                if (longSparseArray != null && adminLogFilterAlert2.currentAdmins != null && longSparseArray.size() >= adminLogFilterAlert2.currentAdmins.size()) {
                    adminLogFilterAlert2.selectedAdmins = null;
                }
                ChannelAdminLogActivity$$ExternalSyntheticLambda0 channelAdminLogActivity$$ExternalSyntheticLambda0 = adminLogFilterAlert2.delegate;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = adminLogFilterAlert2.currentFilter;
                LongSparseArray longSparseArray2 = adminLogFilterAlert2.selectedAdmins;
                ChannelAdminLogActivity channelAdminLogActivity2 = channelAdminLogActivity$$ExternalSyntheticLambda0.f$0;
                channelAdminLogActivity2.currentFilter = tL_channelAdminLogEventsFilter2;
                channelAdminLogActivity2.selectedAdmins = longSparseArray2;
                if (tL_channelAdminLogEventsFilter2 == null && longSparseArray2 == null) {
                    channelAdminLogActivity2.avatarContainer.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
                } else {
                    channelAdminLogActivity2.avatarContainer.setSubtitle(LocaleController.getString(R.string.EventLogSelectedEvents));
                }
                channelAdminLogActivity2.loadMessages(true);
                adminLogFilterAlert2.lambda$showGiftOfferSheet$15();
                break;
            case 4:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((CheckBoxCell) view).setChecked(atomicBoolean.get(), true);
                break;
            case 5:
                ((ComposeDrawable$$ExternalSyntheticLambda0) obj).run();
                break;
            case 6:
                ((AvatarConstructorFragment) obj).onDonePressed$1();
                break;
            case 7:
                BlockingUpdateView blockingUpdateView = (BlockingUpdateView) obj;
                int i6 = blockingUpdateView.pressCount + 1;
                blockingUpdateView.pressCount = i6;
                if (i6 >= 10) {
                    blockingUpdateView.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                }
                break;
            case 8:
                ((Bulletin.LottieLayoutWithReactions) ((ContentPreviewViewer.AnonymousClass2) obj).this$0).hideReactionsDialog();
                Bulletin bulletin = Bulletin.visibleBulletin;
                if (bulletin != null) {
                    bulletin.hide();
                }
                break;
            case 9:
                ((Bulletin.UndoButton) obj).undo();
                break;
            case 10:
                CaptionPhotoViewer captionPhotoViewer = (CaptionPhotoViewer) obj;
                MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                AIEditorAlert aIEditorAlert = new AIEditorAlert(captionPhotoViewer.getContext(), new DarkThemeResourceProvider());
                aIEditorAlert.setText(captionPhotoViewer.editText.getText());
                aIEditorAlert.onUseListener = new DialogCell$$ExternalSyntheticLambda6(captionPhotoViewer, 15);
                ChatAttachAlert$$ExternalSyntheticLambda45 chatAttachAlert$$ExternalSyntheticLambda45 = new ChatAttachAlert$$ExternalSyntheticLambda45(captionPhotoViewer, i4);
                aIEditorAlert.dialogId = 0L;
                aIEditorAlert.editing = true;
                aIEditorAlert.onSendListener = chatAttachAlert$$ExternalSyntheticLambda45;
                aIEditorAlert.show();
                break;
            case 11:
                ChatGreetingsView chatGreetingsView = (ChatGreetingsView) obj;
                chatGreetingsView.premiumIconView.setProgress(0.0f);
                chatGreetingsView.premiumIconView.playAnimation();
                break;
            case 12:
                ClearHistoryAlert clearHistoryAlert = (ClearHistoryAlert) obj;
                if (!clearHistoryAlert.dismissedDelayed) {
                    int i7 = clearHistoryAlert.newTimer;
                    if (i7 != clearHistoryAlert.currentTimer) {
                        clearHistoryAlert.dismissedDelayed = true;
                        if (i7 == 3) {
                            i = 2678400;
                        } else if (i7 == 2) {
                            i = 604800;
                        } else {
                            if (i7 == 1) {
                                i = 86400;
                            } else {
                                i = 0;
                                i2 = 71;
                            }
                            ChannelAdminLogActivity.AnonymousClass13 anonymousClass13 = clearHistoryAlert.delegate;
                            MessagesController messagesController = ChannelAdminLogActivity.this.getMessagesController();
                            channelAdminLogActivity = ChannelAdminLogActivity.this;
                            messagesController.setDialogHistoryTTL(-channelAdminLogActivity.currentChat.id, i);
                            MessagesController messagesController2 = channelAdminLogActivity.getMessagesController();
                            chat = channelAdminLogActivity.currentChat;
                            chatFull = messagesController2.getChatFull(chat.id);
                            if (chatFull != null) {
                                channelAdminLogActivity.undoView.showWithAction(-chat.id, i2, (Object) null, Integer.valueOf(chatFull.ttl_period), (Runnable) null, (Runnable) null);
                            }
                        }
                        i2 = 70;
                        ChannelAdminLogActivity.AnonymousClass13 anonymousClass14 = clearHistoryAlert.delegate;
                        MessagesController messagesController3 = ChannelAdminLogActivity.this.getMessagesController();
                        channelAdminLogActivity = ChannelAdminLogActivity.this;
                        messagesController3.setDialogHistoryTTL(-channelAdminLogActivity.currentChat.id, i);
                        MessagesController messagesController4 = channelAdminLogActivity.getMessagesController();
                        chat = channelAdminLogActivity.currentChat;
                        chatFull = messagesController4.getChatFull(chat.id);
                        if (chatFull != null) {
                            channelAdminLogActivity.undoView.showWithAction(-chat.id, i2, (Object) null, Integer.valueOf(chatFull.ttl_period), (Runnable) null, (Runnable) null);
                        }
                    }
                    if (!clearHistoryAlert.dismissedDelayed) {
                        clearHistoryAlert.lambda$showGiftOfferSheet$15();
                    } else {
                        AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(clearHistoryAlert, 22), 200L);
                    }
                    break;
                }
                break;
            case 13:
                ((CreateBotAlert$$ExternalSyntheticLambda2) obj).run();
                break;
            case 14:
                ((DeleteMessagesBottomSheet) obj).proceed(true);
                break;
            case 15:
                EmojiPacksAlert emojiPacksAlert = (EmojiPacksAlert) obj;
                BaseFragment baseFragment = emojiPacksAlert.fragment;
                if (baseFragment != null) {
                    new PremiumFeatureBottomSheet(baseFragment, 11, false).show();
                } else if (emojiPacksAlert.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) emojiPacksAlert.getContext()).presentFragment(new PremiumPreviewFragment(0, null));
                }
                break;
            case 16:
                Runnable runnable = ((EmojiTabsStrip) obj).onSettingsOpenRunnable;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 17:
                EmojiView.EmojiGridAdapter emojiGridAdapter = (EmojiView.EmojiGridAdapter) obj;
                EmojiView emojiView = EmojiView.this;
                ArrayList arrayList = emojiView.featuredEmojiSets;
                if (arrayList != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = emojiView.featuredEmojiSets;
                    if (((TLRPC.StickerSetCovered) arrayList2.get(0)).set != null) {
                        MessagesController.getEmojiSettings(emojiView.currentAccount).edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList2.get(0)).set.id).commit();
                        EmojiView.EmojiGridAdapter emojiGridAdapter2 = emojiView.emojiAdapter;
                        if (emojiGridAdapter2 != null) {
                            emojiGridAdapter2.mObservable.notifyItemRangeRemoved(1, 3);
                        }
                        EmojiView.AnonymousClass10 anonymousClass10 = emojiView.emojiTabs;
                        if (anonymousClass10 != null) {
                            anonymousClass10.updateEmojiPacks(emojiView.getEmojipacks());
                        }
                        emojiGridAdapter.updateRows$2();
                        break;
                    }
                }
                break;
            case 18:
                EmojiView.StickersSearchGridAdapter stickersSearchGridAdapter = (EmojiView.StickersSearchGridAdapter) obj;
                stickersSearchGridAdapter.getClass();
                FeaturedStickerSetInfoCell featuredStickerSetInfoCell = (FeaturedStickerSetInfoCell) view.getParent();
                TLRPC.StickerSetCovered stickerSet = featuredStickerSetInfoCell.getStickerSet();
                EmojiView emojiView2 = EmojiView.this;
                if (emojiView2.installingStickerSets.indexOfKey(stickerSet.set.id) < 0) {
                    android.util.LongSparseArray longSparseArray3 = emojiView2.removingStickerSets;
                    if (longSparseArray3.indexOfKey(stickerSet.set.id) < 0) {
                        if (!featuredStickerSetInfoCell.isInstalled) {
                            featuredStickerSetInfoCell.setAddDrawProgress(true, true);
                            emojiView2.installingStickerSets.put(stickerSet.set.id, stickerSet);
                            emojiView2.delegate.onStickerSetAdd(featuredStickerSetInfoCell.getStickerSet());
                        } else {
                            longSparseArray3.put(stickerSet.set.id, stickerSet);
                            emojiView2.delegate.onStickerSetRemove(featuredStickerSetInfoCell.getStickerSet());
                        }
                        break;
                    }
                }
                break;
            case 19:
                FolderBottomSheet folderBottomSheet = (FolderBottomSheet) obj;
                FolderBottomSheet.Button button = folderBottomSheet.button;
                if (button == null || !button.loading) {
                    ArrayList arrayList3 = folderBottomSheet.peers;
                    if (arrayList3 != null) {
                        boolean zIsEmpty = arrayList3.isEmpty();
                        boolean z2 = folderBottomSheet.deleting;
                        if (zIsEmpty && !z2) {
                            folderBottomSheet.lambda$showGiftOfferSheet$15();
                        } else {
                            ArrayList arrayList4 = folderBottomSheet.selectedPeers;
                            boolean zIsEmpty2 = arrayList4.isEmpty();
                            TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = folderBottomSheet.invite;
                            if (zIsEmpty2 && (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                                FolderBottomSheet.Button button2 = folderBottomSheet.button;
                                int i8 = -folderBottomSheet.shiftDp;
                                folderBottomSheet.shiftDp = i8;
                                AndroidUtilities.shakeViewSpring(button2, i8);
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            } else {
                                ArrayList arrayList5 = new ArrayList();
                                int i9 = 0;
                                while (true) {
                                    int size = arrayList3.size();
                                    BaseFragment baseFragment2 = folderBottomSheet.baseFragment;
                                    if (i9 >= size) {
                                        int i10 = 0;
                                        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = folderBottomSheet.updates;
                                        int i11 = folderBottomSheet.filterId;
                                        if (z2) {
                                            TL_chatlists.TL_chatlists_leaveChatlist tL_chatlists_leaveChatlist = new TL_chatlists.TL_chatlists_leaveChatlist();
                                            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                                            tL_chatlists_leaveChatlist.chatlist = tL_inputChatlistDialogFilter;
                                            tL_inputChatlistDialogFilter.filter_id = i11;
                                            tL_chatlists_leaveChatlist.peers.addAll(arrayList5);
                                            tLObject = tL_chatlists_leaveChatlist;
                                        } else if (tL_chatlists_chatlistUpdates == null) {
                                            if ((chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && arrayList5.isEmpty()) {
                                                folderBottomSheet.lambda$showGiftOfferSheet$15();
                                            } else {
                                                TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                                tL_chatlists_joinChatlistInvite.slug = folderBottomSheet.slug;
                                                tL_chatlists_joinChatlistInvite.peers.addAll(arrayList5);
                                                tLObject = tL_chatlists_joinChatlistInvite;
                                            }
                                        } else if (arrayList5.isEmpty()) {
                                            TL_chatlists.TL_chatlists_hideChatlistUpdates tL_chatlists_hideChatlistUpdates = new TL_chatlists.TL_chatlists_hideChatlistUpdates();
                                            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter2 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                            tL_chatlists_hideChatlistUpdates.chatlist = tL_inputChatlistDialogFilter2;
                                            tL_inputChatlistDialogFilter2.filter_id = i11;
                                            baseFragment2.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                            baseFragment2.getMessagesController().invalidateChatlistFolderUpdate(i11);
                                            folderBottomSheet.lambda$showGiftOfferSheet$15();
                                        } else {
                                            TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                            tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                            tL_inputChatlistDialogFilter3.filter_id = i11;
                                            tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList5);
                                            tLObject = tL_chatlists_joinChatlistUpdates;
                                        }
                                        INavigationLayout parentLayout = baseFragment2.getParentLayout();
                                        if (!z2) {
                                            if (parentLayout != null) {
                                                OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13 = new OAuthSheet$$ExternalSyntheticLambda13(folderBottomSheet, arrayList5);
                                                FolderBottomSheet$$ExternalSyntheticLambda6 folderBottomSheet$$ExternalSyntheticLambda6 = tL_chatlists_chatlistUpdates != null ? new FolderBottomSheet$$ExternalSyntheticLambda6(oAuthSheet$$ExternalSyntheticLambda13, parentLayout) : new FolderBottomSheet$$ExternalSyntheticLambda6(parentLayout, oAuthSheet$$ExternalSyntheticLambda13);
                                                int i12 = 0;
                                                while (i12 < arrayList5.size()) {
                                                    if (!folderBottomSheet.alreadyJoined.contains(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList5.get(i12))))) {
                                                        z = true;
                                                        boolean[] zArr = new boolean[1];
                                                        baseFragment2.getMessagesController().ensureFolderDialogExists(1, zArr);
                                                        if (zArr[i10]) {
                                                            baseFragment2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[i10]);
                                                        }
                                                        folderBottomSheet.button.setLoading(z);
                                                        folderBottomSheet.reqId = baseFragment2.getConnectionsManager().sendRequest(tLObject, new ChatActivity$$ExternalSyntheticLambda208(29, folderBottomSheet, folderBottomSheet$$ExternalSyntheticLambda6));
                                                    } else {
                                                        i12++;
                                                        i10 = 0;
                                                    }
                                                    break;
                                                }
                                                z = true;
                                                folderBottomSheet.button.setLoading(z);
                                                folderBottomSheet.reqId = baseFragment2.getConnectionsManager().sendRequest(tLObject, new ChatActivity$$ExternalSyntheticLambda208(29, folderBottomSheet, folderBottomSheet$$ExternalSyntheticLambda6));
                                            }
                                        } else if (parentLayout != null) {
                                            ActionBarLayout actionBarLayout = (ActionBarLayout) parentLayout;
                                            BaseFragment lastFragment = actionBarLayout.getLastFragment();
                                            if (lastFragment instanceof ChatActivity) {
                                                ChatActivity chatActivity3 = (ChatActivity) lastFragment;
                                                chatActivity3.createUndoView();
                                                undoView = chatActivity3.undoView;
                                            } else if (lastFragment instanceof DialogsActivity) {
                                                undoView = ((DialogsActivity) lastFragment).getUndoView();
                                            } else if (lastFragment instanceof FiltersSetupActivity) {
                                                undoView = ((FiltersSetupActivity) lastFragment).getUndoView();
                                            } else if (lastFragment instanceof FilterCreateActivity) {
                                                List<BaseFragment> fragmentStack = actionBarLayout.getFragmentStack();
                                                if (fragmentStack.size() >= 2 && (RendererCapabilities.CC.m(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                                    FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) RendererCapabilities.CC.m(2, fragmentStack);
                                                    lastFragment.finishFragment();
                                                    undoView = filtersSetupActivity.getUndoView();
                                                }
                                            }
                                            UndoView undoView2 = undoView;
                                            if (undoView2 != null) {
                                                ArrayList<Long> arrayList6 = new ArrayList<>();
                                                while (i10 < arrayList5.size()) {
                                                    arrayList6.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList5.get(i10))));
                                                    i10++;
                                                }
                                                Pair<Runnable, Runnable> pairRemoveFolderTemporarily = baseFragment2.getMessagesController().removeFolderTemporarily(i11, arrayList6);
                                                undoView2.showWithAction(0L, 88, folderBottomSheet.title, Integer.valueOf(arrayList5.size()), new FilterGLThread$$ExternalSyntheticLambda1(folderBottomSheet, tLObject, pairRemoveFolderTemporarily, i3), (Runnable) pairRemoveFolderTemporarily.second);
                                                folderBottomSheet.success = true;
                                                folderBottomSheet.lambda$showGiftOfferSheet$15();
                                                baseFragment2.getMessagesController().invalidateChatlistFolderUpdate(i11);
                                            } else {
                                                folderBottomSheet.button.setLoading(true);
                                                folderBottomSheet.reqId = baseFragment2.getConnectionsManager().sendRequest(tLObject, new BoostsActivity$$ExternalSyntheticLambda7(folderBottomSheet, lastFragment, arrayList5, 16));
                                            }
                                        }
                                    } else {
                                        long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList3.get(i9));
                                        if (arrayList4.contains(Long.valueOf(peerDialogId))) {
                                            arrayList5.add(baseFragment2.getMessagesController().getInputPeer(peerDialogId));
                                        }
                                        i9++;
                                    }
                                }
                            }
                        }
                    } else {
                        folderBottomSheet.lambda$showGiftOfferSheet$15();
                    }
                }
                break;
            case 20:
                FragmentSearchField fragmentSearchField = (FragmentSearchField) obj;
                if (!fragmentSearchField.hasRemovableFilters()) {
                    Runnable runnable2 = fragmentSearchField.onCloseSearch;
                    if (runnable2 == null) {
                        fragmentSearchField.editText.getText().clear();
                    } else {
                        runnable2.run();
                    }
                } else {
                    FragmentSearchField.SearchFiltersListener searchFiltersListener = fragmentSearchField.searchFiltersListener;
                    if (searchFiltersListener != null && (anonymousClass47 = DialogsActivity.this.searchViewPager) != null) {
                        anonymousClass47.showActionMode(false);
                    }
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList7 = fragmentSearchField.currentSearchFilters;
                        if (i13 >= arrayList7.size()) {
                            while (i5 < arrayList7.size()) {
                                if (((FiltersView.MediaFilterData) arrayList7.get(i5)).removable) {
                                    arrayList7.remove(i5);
                                    i5--;
                                }
                                i5++;
                            }
                            fragmentSearchField.onFiltersChanged();
                        } else {
                            if (fragmentSearchField.searchFiltersListener != null && ((FiltersView.MediaFilterData) arrayList7.get(i13)).removable) {
                                ((DialogsActivity.AnonymousClass9) fragmentSearchField.searchFiltersListener).onSearchFilterCleared((FiltersView.MediaFilterData) arrayList7.get(i13));
                            }
                            i13++;
                        }
                    }
                }
                break;
            case 21:
                ((ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12) obj).run();
                break;
            case 22:
                ((ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12) obj).run();
                break;
            case 23:
                GigagroupConvertAlert gigagroupConvertAlert = (GigagroupConvertAlert) obj;
                gigagroupConvertAlert.onCancel();
                gigagroupConvertAlert.lambda$showGiftOfferSheet$15();
                break;
            case 24:
                ((GroupCallPip) obj).showAlert(false);
                break;
            case 25:
                GroupCallPipAlertView groupCallPipAlertView = (GroupCallPipAlertView) obj;
                groupCallPipAlertView.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(groupCallPipAlertView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    groupCallPipAlertView.getContext().startActivity(action);
                }
                break;
            case 26:
                GroupCallActivity.AnonymousClass6.AnonymousClass1 anonymousClass1 = (GroupCallActivity.AnonymousClass6.AnonymousClass1) obj;
                anonymousClass1.onStartRecord(anonymousClass1.currentPage);
                anonymousClass1.lambda$showGiftOfferSheet$15();
                break;
            case 27:
                ((GuardBotReplaceSheet) obj).lambda$new$1$30(view);
                break;
            case 28:
                HashtagActivity hashtagActivity = (HashtagActivity) obj;
                hashtagActivity.transit(!hashtagActivity.storiesVisible, true);
                MessagesSearchAdapter.StoriesView storiesView = hashtagActivity.storiesView;
                boolean z3 = hashtagActivity.storiesVisible;
                ValueAnimator valueAnimator = storiesView.transitionAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(storiesView.transitValue, z3 ? 1.0f : 0.0f);
                storiesView.transitionAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ChatActivity.AnonymousClass133(storiesView, i4));
                storiesView.transitionAnimator.addListener(new ChatActivity.AnonymousClass77(i4, storiesView, z3));
                storiesView.transitionAnimator.setDuration(320L);
                storiesView.transitionAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                storiesView.transitionAnimator.start();
                break;
            default:
                ((HintView) obj).hide(true);
                break;
        }
    }
}
