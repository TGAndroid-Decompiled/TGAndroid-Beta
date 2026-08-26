package org.telegram.ui;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Gifts.AcquiredGiftsSheet;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Stories.recorder.DominantColors;

public final class LaunchActivity$$ExternalSyntheticLambda13 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public LaunchActivity$$ExternalSyntheticLambda13(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        TLObject tLObject;
        int i = 20;
        int i2 = 0;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                if (!((LaunchActivity) obj2).finished && LaunchActivity.isResumed) {
                    ((Bulletin) obj).show();
                    break;
                }
                break;
            case 1:
                FilterCreateActivity filterCreateActivity = (FilterCreateActivity) obj2;
                filterCreateActivity.loadingInvites = false;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject2;
                    filterCreateActivity.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    filterCreateActivity.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    ArrayList arrayList = filterCreateActivity.invites;
                    arrayList.clear();
                    arrayList.addAll(tL_chatlists_exportedInvites.invites);
                    filterCreateActivity.updateRows$12();
                }
                filterCreateActivity.requestingInvitesReqId = 0;
                break;
            case 2:
                FilterCreateActivity filterCreateActivity2 = (FilterCreateActivity) obj2;
                filterCreateActivity2.getClass();
                AlertDialog alertDialog = (AlertDialog) obj;
                if (alertDialog != null) {
                    try {
                        alertDialog.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                MessagesController messagesController = filterCreateActivity2.getMessagesController();
                MessagesController.DialogFilter dialogFilter = filterCreateActivity2.filter;
                messagesController.removeFilter(dialogFilter);
                filterCreateActivity2.getMessagesStorage().deleteDialogFilter(dialogFilter);
                filterCreateActivity2.finishFragment();
                break;
            case 3:
                FilterCreateActivity filterCreateActivity3 = (FilterCreateActivity) obj2;
                filterCreateActivity3.getClass();
                filterCreateActivity3.onEdit(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                filtersSetupActivity.getClass();
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.loadedColors) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.loadedColors = true;
                    break;
                }
                break;
            case 5:
                FiltersSetupActivity filtersSetupActivity2 = FiltersSetupActivity.this;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 6:
                AcquiredGiftsSheet.AcquiredGiftsCell acquiredGiftsCell = (AcquiredGiftsSheet.AcquiredGiftsCell) obj2;
                acquiredGiftsCell.getClass();
                ((View.OnClickListener) obj).onClick(acquiredGiftsCell);
                break;
            case 7:
                ((GiftSheet.AnonymousClass8) obj2).getBulletinFactory().showForError(false, (TLRPC.TL_error) obj);
                break;
            case 8:
                GiftSheet.GiftCell giftCell = (GiftSheet.GiftCell) obj2;
                giftCell.getClass();
                if (!((TL_stars.SavedStarGift) obj).unsaved) {
                    giftCell.lockView.setVisibility(8);
                }
                break;
            case 9:
                SharedMediaLayout.AnonymousClass13 anonymousClass13 = (SharedMediaLayout.AnonymousClass13) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                anonymousClass13.openEnterNameAlert(tL_starGiftCollection.title, new OAuthSheet$$ExternalSyntheticLambda13(11, anonymousClass13, tL_starGiftCollection));
                break;
            case 10:
                ProfileGiftsContainer.Page page = (ProfileGiftsContainer.Page) obj2;
                page.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                BulletinFactory.of(page.parent.fragment).createCopyLinkBulletin(false).show();
                break;
            case 11:
                int i3 = 0;
                while (true) {
                    ArrayList arrayList2 = ((GroupCallActivity) obj2).attachedRenderers;
                    ArrayList arrayList3 = (ArrayList) obj;
                    if (i3 >= arrayList2.size()) {
                        while (i2 < arrayList3.size()) {
                            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList3.get(i2);
                            if (videoParticipant.participant.self) {
                                if (VoIPService.getSharedInstance() != null) {
                                    VoIPService.getSharedInstance().setLocalSink(null, videoParticipant.presentation);
                                }
                            } else if (VoIPService.getSharedInstance() != null) {
                                VoIPService.getSharedInstance().removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
                            }
                            i2++;
                        }
                    } else {
                        if (((GroupCallMiniTextureView) arrayList2.get(i3)).participant != null) {
                            arrayList3.remove(((GroupCallMiniTextureView) arrayList2.get(i3)).participant);
                        }
                        i3++;
                    }
                    break;
                }
                break;
            case 12:
                GroupCallActivity groupCallActivity = (GroupCallActivity) obj2;
                groupCallActivity.accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                groupCallActivity.lambda$showGiftOfferSheet$15();
                break;
            case 13:
                LaunchActivity.AnonymousClass18 anonymousClass18 = (LaunchActivity.AnonymousClass18) obj2;
                try {
                    Bitmap bitmap = ((GroupCallMiniTextureView.AnonymousClass1) obj).blurRenderer.getBitmap(100, 100);
                    if (bitmap != null) {
                        AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda13(14, anonymousClass18, DominantColors.getColorsSync(bitmap, true)));
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                    return;
                }
                break;
            case 14:
                ((GroupCallActivity) ((LaunchActivity.AnonymousClass18) obj2).this$0).textureLightningView.setNewColors((int[]) obj);
                break;
            case 15:
                ((GroupStickersActivity) obj2).lambda$saveStickerSet$1((TLRPC.TL_error) obj);
                break;
            case 16:
                GroupStickersActivity.AddEmojiCell.AnonymousClass1 anonymousClass1 = (GroupStickersActivity.AddEmojiCell.AnonymousClass1) obj2;
                String str = (String) obj;
                GroupStickersActivity.AddEmojiCell addEmojiCell = GroupStickersActivity.AddEmojiCell.this;
                addEmojiCell.lastQuery = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                addEmojiCell.reqId = GroupStickersActivity.this.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new LinkManager$$ExternalSyntheticLambda8(i, anonymousClass1, str), 66);
                break;
            case 17:
                GroupStickersActivity.AddEmojiCell addEmojiCell2 = GroupStickersActivity.AddEmojiCell.this;
                TLObject tLObject3 = (TLObject) obj;
                if (tLObject3 != null) {
                    GroupStickersActivity.access$3100(GroupStickersActivity.this, (TLRPC.TL_messages_stickerSet) tLObject3);
                } else {
                    GroupStickersActivity.access$3100(GroupStickersActivity.this, null);
                }
                break;
            case 18:
                GroupStickersActivity.SearchAdapter searchAdapter = (GroupStickersActivity.SearchAdapter) obj2;
                String str2 = (String) obj;
                searchAdapter.lastQuery = str2;
                GroupStickersActivity groupStickersActivity = GroupStickersActivity.this;
                if (groupStickersActivity.isEmoji) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tLObject = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets.q = str2;
                    tLObject = tL_messages_searchStickerSets;
                }
                searchAdapter.reqId = groupStickersActivity.getConnectionsManager().sendRequest(tLObject, new LinkManager$$ExternalSyntheticLambda0((Object) searchAdapter, str2, (Object) str2, 4), 66);
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda8(18, (KeepMediaPopupView.AnonymousClass1) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                break;
            case 20:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.searchResult = (ArrayList) obj;
                languageSelectActivity.searchListViewAdapter.mObservable.notifyChanged();
                break;
            case 21:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda13(i, languageSelectActivity2, new ArrayList()));
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList4 = new ArrayList();
                    int size = languageSelectActivity2.unofficialLanguages.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.unofficialLanguages.get(i4);
                        if (localeInfo.name.toLowerCase().startsWith(str3) || localeInfo.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList4.add(localeInfo);
                        }
                    }
                    int size2 = languageSelectActivity2.sortedLanguages.size();
                    while (i2 < size2) {
                        LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.sortedLanguages.get(i2);
                        if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList4.add(localeInfo2);
                        }
                        i2++;
                    }
                    AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda13(i, languageSelectActivity2, arrayList4));
                }
                break;
            case 22:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                launchActivity.getClass();
                TLObject tLObject4 = (TLObject) obj;
                if (tLObject4 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject4;
                    MessagesController.getInstance(launchActivity.currentAccount).putUsers(resolvedbusinesschatlinks.users, false);
                    MessagesController.getInstance(launchActivity.currentAccount).putChats(resolvedbusinesschatlinks.chats, false);
                    MessagesStorage.getInstance(launchActivity.currentAccount).putUsersAndChats(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    ChatActivity chatActivity = new ChatActivity(bundle);
                    chatActivity.resolvedChatLink = resolvedbusinesschatlinks;
                    ((ActionBarLayout) launchActivity.getActionBarLayout()).presentFragment$1(chatActivity, false, true);
                } else {
                    launchActivity.showAlertDialog(AlertsCreator.createSimpleAlert(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                }
                break;
            case 23:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) obj;
                MessagesController.getInstance(launchActivity2.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.currentAccount);
                long j = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j, j, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 24:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb = new StringBuilder();
                zzlf.m(R.string.ErrorOccurred, "\n", sb);
                sb.append(((TLRPC.TL_error) obj).text);
                AlertsCreator.showSimpleAlert((ActionIntroActivity) obj2, string, sb.toString(), null);
                break;
            case 25:
                LaunchActivity launchActivity3 = (LaunchActivity) obj2;
                if (!launchActivity3.actionBarLayout.getFragmentStack().isEmpty()) {
                    launchActivity3.actionBarLayout.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse((String) obj).getQueryParameter("ref")));
                }
                break;
            case 26:
                ((LaunchActivity) obj2).openEmailSettings((TL_account.Password) obj);
                break;
            case 27:
                ((LaunchActivity) obj2).presentFragment((ThemePreviewActivity) obj);
                break;
            case 28:
                LaunchActivity launchActivity4 = (LaunchActivity) obj2;
                launchActivity4.loadingThemeFileName = null;
                launchActivity4.loadingThemeWallpaperName = null;
                launchActivity4.loadingThemeWallpaper = null;
                launchActivity4.loadingThemeInfo = null;
                launchActivity4.loadingThemeProgressDialog = null;
                launchActivity4.loadingTheme = null;
                Browser.Progress progress = (Browser.Progress) obj;
                if (progress != null) {
                    progress.end();
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.PREFIX_T_ME_PATTERN;
                Browser.Progress progress2 = (Browser.Progress) obj2;
                if (progress2 != null) {
                    progress2.end();
                }
                AlertDialog alertDialog2 = (AlertDialog) obj;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                break;
        }
    }
}
