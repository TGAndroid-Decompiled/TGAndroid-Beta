package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.LongSparseArray;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarsDrawable;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.JoinGroupAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda29;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;

public final class ArticleViewer$$ExternalSyntheticLambda70 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;

    public ArticleViewer$$ExternalSyntheticLambda70(int i, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.$r8$classId = 1;
        this.f$1 = i;
        this.f$0 = arrayList;
        this.f$2 = arrayList2;
        this.f$3 = num;
        this.f$4 = albumEntry;
        this.f$5 = albumEntry2;
        this.f$6 = albumEntry3;
    }

    @Override
    public final void run() {
        BaseFragment safeLastFragment;
        ConferenceCall conferenceCall;
        TLRPC.GroupCall groupCall;
        LaunchActivity launchActivity;
        LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13;
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing;
        String str;
        PaymentFormActivity paymentFormActivity;
        int i = this.f$1;
        Object obj = this.f$6;
        Object obj2 = this.f$5;
        Object obj3 = this.f$3;
        Object obj4 = this.f$4;
        Object obj5 = this.f$2;
        Object obj6 = this.f$0;
        int i2 = 0;
        int i3 = 1;
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer articleViewer = (ArticleViewer) obj6;
                if (articleViewer.openUrlReqId != 0 && i == articleViewer.lastReqId) {
                    ArticleViewer.AnonymousClass13 anonymousClass13 = (ArticleViewer.AnonymousClass13) obj5;
                    if (anonymousClass13 != null) {
                        anonymousClass13.end();
                    }
                    articleViewer.openUrlReqId = 0;
                    articleViewer.showProgressView(false);
                    if (articleViewer.isVisible) {
                        TLObject tLObject = (TLObject) obj3;
                        boolean z = tLObject instanceof TLRPC.TL_messages_webPage;
                        ArrayList arrayList = articleViewer.pagesStack;
                        ArticleViewer$$ExternalSyntheticLambda60 articleViewer$$ExternalSyntheticLambda60 = (ArticleViewer$$ExternalSyntheticLambda60) obj2;
                        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = (TLRPC.TL_messages_getWebPage) obj;
                        String str2 = (String) obj4;
                        if (z) {
                            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                            MessagesController.getInstance(articleViewer.currentAccount).putUsers(tL_messages_webPage.users, false);
                            MessagesController.getInstance(articleViewer.currentAccount).putChats(tL_messages_webPage.chats, false);
                            TLRPC.WebPage webPage = tL_messages_webPage.webpage;
                            if (webPage != null && (webPage.cached_page instanceof TL_iv.TL_page)) {
                                articleViewer.saveCurrentPagePosition();
                                arrayList.add(webPage);
                                articleViewer.actionBar.showSearch(false);
                                articleViewer.updateInterfaceForCurrentPage(1, webPage, false);
                                articleViewer.scrollToAnchor(str2, false);
                            } else if (!((Boolean) articleViewer$$ExternalSyntheticLambda60.run()).booleanValue()) {
                                if (MessagesController.getInstance(articleViewer.currentAccount).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                                    String str3 = tL_messages_getWebPage.url;
                                    articleViewer.saveCurrentPagePosition();
                                    ArticleViewer.CachedWeb cachedWeb = new ArticleViewer.CachedWeb(str3);
                                    arrayList.add(cachedWeb);
                                    articleViewer.actionBar.showSearch(false);
                                    articleViewer.updateInterfaceForCurrentPage(1, cachedWeb, false);
                                } else {
                                    Browser.openUrl(articleViewer.parentActivity, tL_messages_getWebPage.url);
                                }
                            }
                        } else {
                            if (tLObject instanceof TLRPC.TL_webPage) {
                                TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                                if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                                    articleViewer.saveCurrentPagePosition();
                                    arrayList.add(tL_webPage);
                                    articleViewer.actionBar.showSearch(false);
                                    articleViewer.updateInterfaceForCurrentPage(1, tL_webPage, false);
                                    articleViewer.scrollToAnchor(str2, false);
                                }
                            }
                            if (!((Boolean) articleViewer$$ExternalSyntheticLambda60.run()).booleanValue()) {
                                if (MessagesController.getInstance(articleViewer.currentAccount).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                                    String str4 = tL_messages_getWebPage.url;
                                    articleViewer.saveCurrentPagePosition();
                                    ArticleViewer.CachedWeb cachedWeb2 = new ArticleViewer.CachedWeb(str4);
                                    arrayList.add(cachedWeb2);
                                    articleViewer.actionBar.showSearch(false);
                                    articleViewer.updateInterfaceForCurrentPage(1, cachedWeb2, false);
                                } else {
                                    Browser.openUrl(articleViewer.parentActivity, tL_messages_getWebPage.url);
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            case 1:
                MediaController.lambda$broadcastNewPhotos$58(this.f$1, (ArrayList) obj6, (ArrayList) obj5, (Integer) obj3, (MediaController.AlbumEntry) obj4, (MediaController.AlbumEntry) obj2, (MediaController.AlbumEntry) obj);
                break;
            case 2:
                ((SendMessagesHelper) obj6).lambda$performSendDelayedMessage$53((TLObject) obj3, (TLRPC.InputFile) obj5, (TLRPC.InputMedia) obj2, (SendMessagesHelper.DelayedMessage) obj, this.f$1, (String) obj4);
                break;
            case 3:
                MentionsAdapter mentionsAdapter = MentionsAdapter.this;
                if (mentionsAdapter.channelReqId != 0 && i == mentionsAdapter.channelLastReqId && mentionsAdapter.searchResultUsernamesMap != null && mentionsAdapter.searchResultUsernames != null) {
                    mentionsAdapter.showUsersResult((LongSparseArray) obj4, (ArrayList) obj5, false);
                    if (((TLRPC.TL_error) obj2) == null) {
                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) ((TLObject) obj3);
                        MessagesController messagesController = (MessagesController) obj;
                        messagesController.putUsers(tL_channels_channelParticipants.users, false);
                        messagesController.putChats(tL_channels_channelParticipants.chats, false);
                        mentionsAdapter.searchResultUsernames.isEmpty();
                        if (!tL_channels_channelParticipants.participants.isEmpty()) {
                            long clientUserId = UserConfig.getInstance(mentionsAdapter.currentAccount).getClientUserId();
                            for (int i4 = 0; i4 < tL_channels_channelParticipants.participants.size(); i4++) {
                                long peerId = MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i4).peer);
                                if (mentionsAdapter.searchResultUsernamesMap.indexOfKey(peerId) < 0 && ((peerId != 0 || mentionsAdapter.searchResultUsernamesMap.indexOfKey(clientUserId) < 0) && (mentionsAdapter.isSearchingMentions || (peerId != clientUserId && peerId != 0)))) {
                                    if (peerId >= 0) {
                                        TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                                        if (user != null) {
                                            mentionsAdapter.searchResultUsernames.add(user);
                                        }
                                    } else {
                                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                                        if (chat != null) {
                                            mentionsAdapter.searchResultUsernames.add(chat);
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    mentionsAdapter.notifyDataSetChanged();
                    mentionsAdapter.delegate.needChangePanelVisibility(!mentionsAdapter.searchResultUsernames.isEmpty());
                }
                mentionsAdapter.channelReqId = 0;
                break;
            case 4:
                TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                togglegroupcallsettings.call = inputGroupCall;
                togglegroupcallsettings.reset_invite_hash = true;
                int i5 = this.f$1;
                ConnectionsManager.getInstance(i5).sendRequest(togglegroupcallsettings, new CallLogActivity$$ExternalSyntheticLambda46(i5, inputGroupCall, (String[]) obj5, (FrameLayout) obj3, (LinkSpanDrawable.LinksTextView) obj4, (BottomSheet) obj2, (Theme.ResourcesProvider) obj));
                break;
            case 5:
                TLObject tLObject2 = (TLObject) obj3;
                AlertDialog alertDialog = (AlertDialog) obj6;
                if (tLObject2 instanceof TL_phone.exportedGroupCallInvite) {
                    alertDialog.dismiss();
                    CallLogActivity.showCallLinkSheet((Context) obj5, this.f$1, ((TL_phone.exportGroupCallInvite) obj4).call, ((TL_phone.exportedGroupCallInvite) tLObject2).link, (Theme.ResourcesProvider) obj2, true, true);
                } else {
                    alertDialog.dismiss();
                }
                AndroidUtilities.runOnUIThread((GroupCreateActivity$$ExternalSyntheticLambda7) obj);
                break;
            case 6:
                if (((TLRPC.TL_error) obj6) == null) {
                    TLObject tLObject3 = (TLObject) obj3;
                    if (tLObject3 instanceof TLRPC.TL_channels_channelParticipants) {
                        ((ArrayList) obj5).set(i, (TLRPC.TL_channels_channelParticipants) tLObject3);
                    }
                }
                AtomicInteger atomicInteger = (AtomicInteger) obj4;
                atomicInteger.getAndIncrement();
                if (atomicInteger.get() == ((ArrayList) obj2).size()) {
                    ((ChatActivity$$ExternalSyntheticLambda102) obj).run();
                }
                break;
            case 7:
                ((AlertDialog) obj6).dismiss();
                TLObject tLObject4 = (TLObject) obj3;
                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject4;
                    MediaDataController.getInstance(i).putStickerSet(tL_messages_stickerSet);
                    if (!MediaDataController.getInstance(i).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                        MediaDataController.getInstance(i).toggleStickerSet(null, tLObject4, 2, null, false, false);
                    }
                    AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda29(tLObject4, (TLRPC.Document) obj5), 250L);
                } else {
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                    if (tL_error != null) {
                        if (FileRefController.isFileRefError(tL_error.text)) {
                            FileRefController.getInstance(i).requestReference(obj2, (TLRPC.TL_stickers_addStickerToSet) obj);
                        } else {
                            BulletinFactory.showError(tL_error);
                        }
                    }
                }
                break;
            case 8:
                final SharedMediaLayout.AnonymousClass13 anonymousClass14 = (SharedMediaLayout.AnonymousClass13) obj6;
                String str5 = MessagesController.getInstance(i).linkPrefix + "/" + ((String) obj4) + "/c/" + ((TL_stars.TL_starGiftCollection) obj5).collection_id;
                final BaseFragment baseFragment = (BaseFragment) obj;
                new ShareAlert((Context) obj3, str5, str5, (Theme.ResourcesProvider) obj2) {
                    public final BaseFragment val$fragment;

                    public AnonymousClass4(Context context, String str6, String str7, Theme.ResourcesProvider resourcesProvider) {
                        super(context, str7, str7, resourcesProvider);
                        baseFragment = baseFragment;
                    }

                    @Override
                    public final void onSend(LongSparseArray longSparseArray, int i6, TLRPC.TL_forumTopic tL_forumTopic, boolean z2) {
                        BulletinFactory bulletinFactoryOf;
                        if (z2 && (bulletinFactoryOf = BulletinFactory.of(baseFragment)) != null) {
                            if (longSparseArray.size() == 1) {
                                long jKeyAt = longSparseArray.keyAt(0);
                                if (jKeyAt == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                    Bulletin bulletinCreateSimpleBulletin = bulletinFactoryOf.createSimpleBulletin(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedToSavedMessages, new Object[0])));
                                    bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
                                    bulletinCreateSimpleBulletin.show();
                                } else if (jKeyAt < 0) {
                                    Bulletin bulletinCreateSimpleBulletin2 = bulletinFactoryOf.createSimpleBulletin(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedTo, tL_forumTopic != null ? tL_forumTopic.title : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-jKeyAt)).title)));
                                    bulletinCreateSimpleBulletin2.hideAfterBottomSheet = false;
                                    bulletinCreateSimpleBulletin2.show();
                                } else {
                                    Bulletin bulletinCreateSimpleBulletin3 = bulletinFactoryOf.createSimpleBulletin(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(jKeyAt)).first_name)));
                                    bulletinCreateSimpleBulletin3.hideAfterBottomSheet = false;
                                    bulletinCreateSimpleBulletin3.show();
                                }
                            } else {
                                Bulletin bulletinCreateSimpleBulletinWithIconSize = bulletinFactoryOf.createSimpleBulletinWithIconSize(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCollectionSharedToManyChats", longSparseArray.size(), Integer.valueOf(longSparseArray.size()))));
                                bulletinCreateSimpleBulletinWithIconSize.hideAfterBottomSheet = false;
                                bulletinCreateSimpleBulletinWithIconSize.show();
                            }
                            try {
                                anonymousClass13.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }.show();
                break;
            case 9:
                AlertDialog alertDialog2 = (AlertDialog) obj6;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                Browser.Progress progress = (Browser.Progress) obj5;
                if (progress != null) {
                    progress.end();
                }
                TLObject tLObject5 = (TLObject) obj3;
                if (tLObject5 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject5;
                    final int i6 = this.f$1;
                    MessagesController.getInstance(i6).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i6).putChats(groupcall.chats, false);
                    if (VoIPService.getSharedInstance() == null || (conferenceCall = VoIPService.getSharedInstance().conference) == null || (groupCall = conferenceCall.groupCall) == null || groupcall.call.id != groupCall.id || (launchActivity = LaunchActivity.instance) == null) {
                        ArrayList<TLRPC.GroupCallParticipant> arrayList2 = groupcall.participants;
                        DarkThemeResourceProvider darkThemeResourceProvider = new DarkThemeResourceProvider();
                        Activity activity = (Activity) obj4;
                        BottomSheet bottomSheet = new BottomSheet(activity, darkThemeResourceProvider, false, false);
                        bottomSheet.fixNavigationBar();
                        LinearLayout linearLayoutM = zzkf.m(activity, 1);
                        linearLayoutM.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f));
                        FrameLayout frameLayout = new FrameLayout(activity);
                        frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), darkThemeResourceProvider.getColor(Theme.key_featuredStickers_addButton)));
                        ImageView imageView = new ImageView(activity);
                        imageView.setImageResource(R.drawable.filled_calls_users);
                        frameLayout.addView(imageView, LayoutHelper.createFrame(56, 56, 17));
                        linearLayoutM.addView(frameLayout, LayoutHelper.createLinear(80, 80, 1, 2, 21, 2, 13));
                        int i7 = Theme.key_windowBackgroundWhiteBlackText;
                        LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView = TextHelper.makeLinkTextView(activity, 20.0f, i7, true, darkThemeResourceProvider);
                        linksTextViewMakeLinkTextView.setText(LocaleController.getString(R.string.GroupCallLinkTitle));
                        linksTextViewMakeLinkTextView.setGravity(17);
                        linearLayoutM.addView(linksTextViewMakeLinkTextView, LayoutHelper.createLinear(-1, -2, 1, 2, 0, 2, 4));
                        List list = (List) Collection.EL.stream(arrayList2).map(new GroupCallSheet$$ExternalSyntheticLambda3(i2)).filter(new Predicate() {
                            public final Predicate and(Predicate predicate) {
                                return Predicate$CC.$default$and(this, predicate);
                            }

                            public final Predicate negate() {
                                return Predicate$CC.$default$negate(this);
                            }

                            public final Predicate or(Predicate predicate) {
                                return Predicate$CC.$default$or(this, predicate);
                            }

                            @Override
                            public final boolean test(Object obj7) {
                                Long l = (Long) obj7;
                                return (l.longValue() == UserConfig.getInstance(i6).getClientUserId() || l.longValue() == 0) ? false : true;
                            }
                        }).collect(Collectors.toList());
                        boolean zIsEmpty = list.isEmpty();
                        LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView2 = TextHelper.makeLinkTextView(activity, 14.0f, i7, false, darkThemeResourceProvider);
                        linksTextViewMakeLinkTextView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallLinkText)));
                        linksTextViewMakeLinkTextView2.setGravity(17);
                        linksTextViewMakeLinkTextView2.setMaxWidth(HintView2.cutInFancyHalf(linksTextViewMakeLinkTextView2.getText(), linksTextViewMakeLinkTextView2.getPaint()));
                        linearLayoutM.addView(linksTextViewMakeLinkTextView2, LayoutHelper.createLinear(-1, -2, 1, 2, 0, 2, 23));
                        if (!zIsEmpty) {
                            View view = new View(activity);
                            view.setBackgroundColor(-14012362);
                            linearLayoutM.addView(view, LayoutHelper.createLinear(-1, 7, 0, 0, 0, 0.66f, 0));
                            AvatarsImageView avatarsImageView = new AvatarsImageView(activity, false);
                            avatarsImageView.setCentered(true);
                            avatarsImageView.setSize(AndroidUtilities.dp(38.0f));
                            int iMin = Math.min(3, list.size());
                            avatarsImageView.setCount(iMin);
                            int i8 = 0;
                            while (true) {
                                AvatarsDrawable avatarsDrawable = avatarsImageView.avatarsDrawable;
                                if (i8 < iMin) {
                                    avatarsDrawable.setObject(i8, MessagesController.getInstance(i6).getUser((Long) list.get(i8)), i6);
                                    i8++;
                                } else {
                                    avatarsDrawable.commitTransition(false, true);
                                    linearLayoutM.addView(avatarsImageView, LayoutHelper.createLinear(2.0f, 11.0f, 5.0f, 0.0f, -1, 58));
                                    LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView3 = TextHelper.makeLinkTextView(activity, 14.0f, Theme.key_windowBackgroundWhiteBlackText, false, darkThemeResourceProvider);
                                    linksTextViewMakeLinkTextView3.setGravity(17);
                                    if (list.size() == 1) {
                                        linksTextViewMakeLinkTextView3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2One, DialogObject.getShortName(i6, ((Long) list.get(0)).longValue()))));
                                    } else if (list.size() == 2) {
                                        linksTextViewMakeLinkTextView3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2Two, DialogObject.getShortName(i6, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i6, ((Long) list.get(1)).longValue()))));
                                    } else {
                                        linksTextViewMakeLinkTextView3.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GroupCallLinkText2Many", arrayList2.size() - 2, DialogObject.getShortName(i6, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i6, ((Long) list.get(1)).longValue()))));
                                    }
                                    linksTextViewMakeLinkTextView3.setMaxWidth(HintView2.cutInFancyHalf(linksTextViewMakeLinkTextView3.getText(), linksTextViewMakeLinkTextView3.getPaint()));
                                    linearLayoutM.addView(linksTextViewMakeLinkTextView3, LayoutHelper.createLinear(-1, -2, 1, 2, 0, 2, 25));
                                }
                            }
                        }
                        LinearLayout linearLayout = new LinearLayout(activity);
                        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
                        linearLayout.setClipToPadding(false);
                        linearLayout.setOrientation(0);
                        linearLayout.setBackground(Theme.createRadSelectorDrawable(darkThemeResourceProvider.getColor(Theme.key_listSelector), 20, 20));
                        CheckBox2 checkBox2 = new CheckBox2(activity, 24, darkThemeResourceProvider);
                        int i9 = Theme.key_radioBackgroundChecked;
                        int i10 = Theme.key_checkboxDisabled;
                        int i11 = Theme.key_checkboxCheck;
                        CheckBoxBase checkBoxBase = checkBox2.checkBoxBase;
                        checkBoxBase.setColor(i9, i10, i11);
                        checkBox2.setDrawUnchecked(true);
                        checkBoxBase.setChecked(-1, MessagesController.getGlobalMainSettings().getBoolean("callmiconstart", true), false);
                        checkBox2.setDrawBackgroundAsArc(10);
                        linearLayout.addView(checkBox2, LayoutHelper.createLinear(26, 26, 16, 0, 0, 0, 0));
                        TextView textView = new TextView(activity);
                        textView.setTextColor(darkThemeResourceProvider.getColor(Theme.key_dialogTextBlack));
                        textView.setTextSize(1, 14.0f);
                        textView.setText(LocaleController.getString(R.string.GroupCallLinkMicrophone));
                        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
                        linearLayoutM.addView(linearLayout, LayoutHelper.createLinear(-2, 38, 1, 0, 4, 0, 12));
                        ScaleStateListAnimator.apply(linearLayout, 0.025f, 1.5f);
                        linearLayout.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(checkBox2, 0));
                        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(activity, darkThemeResourceProvider, true);
                        buttonWithCounterView.setRoundRadius(24);
                        buttonWithCounterView.setText(LocaleController.getString(R.string.GroupCallLinkJoin), false, true);
                        linearLayoutM.addView(buttonWithCounterView, LayoutHelper.createLinear(2.0f, 0.0f, 2.0f, 0.0f, -1, 48));
                        bottomSheet.customView = linearLayoutM;
                        buttonWithCounterView.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda6(bottomSheet, activity, checkBox2, i6, (TLRPC.TL_inputGroupCallSlug) obj2, 0));
                        bottomSheet.fixNavigationBar();
                        bottomSheet.show();
                    } else {
                        GroupCallActivity.create(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                    }
                    break;
                } else {
                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                    if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment2 != null) {
                            FactCheckController$$ExternalSyntheticOutline0.m(R.string.LinkIsNoActive, BulletinFactory.of(safeLastFragment2), R.raw.error, 36);
                        }
                        break;
                    } else if (tL_error2 != null && (safeLastFragment = LaunchActivity.getSafeLastFragment()) != null) {
                        BulletinFactory.of(safeLastFragment).showForError(false, tL_error2);
                        break;
                    }
                }
                break;
            case 10:
                final LaunchActivity launchActivity2 = (LaunchActivity) obj6;
                if (!launchActivity2.isFinishing()) {
                    final LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda14 = (LaunchActivity$$ExternalSyntheticLambda13) obj;
                    TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj5;
                    if (tL_error3 == null && launchActivity2.actionBarLayout != null) {
                        final TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) ((TLObject) obj3);
                        TLRPC.Chat chat2 = chatInvite.chat;
                        ArrayList arrayList3 = launchActivity2.mainFragmentsStack;
                        if (chat2 != null) {
                            if (ChatObject.isLeftFromChat(chat2)) {
                                TLRPC.Chat chat3 = chatInvite.chat;
                                if (chat3.kicked || (!ChatObject.isPublic(chat3) && !(chatInvite instanceof TLRPC.TL_chatInvitePeek) && !chatInvite.chat.has_geo)) {
                                    launchActivity$$ExternalSyntheticLambda13 = launchActivity$$ExternalSyntheticLambda14;
                                    tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                                    str = (String) obj4;
                                    if (tL_starsSubscriptionPricing != null) {
                                        BaseFragment baseFragment2 = (BaseFragment) zziq.m(1, arrayList3);
                                        baseFragment2.showDialog(new JoinGroupAlert(launchActivity2, chatInvite, str, baseFragment2, baseFragment2 instanceof ChatActivity ? ((ChatActivity) baseFragment2).themeDelegate : null));
                                    } else {
                                        BaseFragment baseFragment3 = (BaseFragment) zziq.m(1, arrayList3);
                                        baseFragment3.showDialog(new JoinGroupAlert(launchActivity2, chatInvite, str, baseFragment3, baseFragment3 instanceof ChatActivity ? ((ChatActivity) baseFragment3).themeDelegate : null));
                                    }
                                }
                            }
                            MessagesController.getInstance(i).putChat(chatInvite.chat, false);
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(chatInvite.chat);
                            MessagesStorage.getInstance(i).putUsersAndChats(null, arrayList4, false, true);
                            final Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatInvite.chat.id);
                            if (arrayList3.isEmpty() || MessagesController.getInstance(i).checkCanOpenChat(bundle, (BaseFragment) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList3))) {
                                final boolean[] zArr = new boolean[1];
                                ((AlertDialog) obj2).setOnCancelListener(new ChatActivity$$ExternalSyntheticLambda413(i3, zArr));
                                if (!chatInvite.chat.forum) {
                                    MessagesController.getInstance(i).ensureMessagesLoaded(-chatInvite.chat.id, 0, new MessagesController.MessagesLoadedCallback() {
                                        public final Bundle val$args;
                                        public final boolean[] val$canceled;
                                        public final LaunchActivity$$ExternalSyntheticLambda13 val$dismissLoading;
                                        public final TLRPC.ChatInvite val$invite;

                                        public AnonymousClass15() {
                                            launchActivity$$ExternalSyntheticLambda13 = launchActivity$$ExternalSyntheticLambda14;
                                            zArr = zArr;
                                            bundle = bundle;
                                            chatInvite = chatInvite;
                                        }

                                        @Override
                                        public final void onError() {
                                            LaunchActivity launchActivity3 = LaunchActivity.this;
                                            if (!launchActivity3.isFinishing()) {
                                                AlertsCreator.showSimpleAlert((BaseFragment) zziq.m(1, launchActivity3.mainFragmentsStack), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
                                            }
                                            try {
                                                launchActivity$$ExternalSyntheticLambda13.run();
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                        }

                                        @Override
                                        public final void onMessagesLoaded(boolean z2) {
                                            try {
                                                launchActivity$$ExternalSyntheticLambda13.run();
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                            if (zArr[0]) {
                                                return;
                                            }
                                            ChatActivity chatActivity = new ChatActivity(bundle);
                                            TLRPC.ChatInvite chatInvite2 = chatInvite;
                                            if (chatInvite2 instanceof TLRPC.TL_chatInvitePeek) {
                                                chatActivity.chatInvite = (TLRPC.TL_chatInvitePeek) chatInvite2;
                                            }
                                            INavigationLayout actionBarLayout = LaunchActivity.this.getActionBarLayout();
                                            actionBarLayout.getClass();
                                            ((ActionBarLayout) actionBarLayout).presentFragment(new INavigationLayout.NavigationParams(chatActivity));
                                        }
                                    });
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", chatInvite.chat.id);
                                    HashSet hashSet = TopicsFragment.settingsPreloaded;
                                    launchActivity2.presentFragment(TopicsFragment.getTopicsOrChat(MessagesController.getInstance(launchActivity2.currentAccount), MessagesStorage.getInstance(launchActivity2.currentAccount), bundle2));
                                }
                            }
                            launchActivity$$ExternalSyntheticLambda13 = launchActivity$$ExternalSyntheticLambda14;
                            break;
                        } else {
                            launchActivity$$ExternalSyntheticLambda13 = launchActivity$$ExternalSyntheticLambda14;
                            tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                            str = (String) obj4;
                            if (tL_starsSubscriptionPricing != null || chatInvite.can_refulfill_subscription) {
                                BaseFragment baseFragment4 = (BaseFragment) zziq.m(1, arrayList3);
                                baseFragment4.showDialog(new JoinGroupAlert(launchActivity2, chatInvite, str, baseFragment4, baseFragment4 instanceof ChatActivity ? ((ChatActivity) baseFragment4).themeDelegate : null));
                            } else {
                                long j = tL_starsSubscriptionPricing.amount;
                                MessagesController.getInstance(i).putChat(chatInvite.chat, false);
                                StarsController.getInstance(launchActivity2.currentAccount, false).subscribeTo(str, chatInvite, new LaunchActivity$$ExternalSyntheticLambda149(launchActivity2, j, i2));
                            }
                        }
                    } else {
                        launchActivity$$ExternalSyntheticLambda13 = launchActivity$$ExternalSyntheticLambda14;
                        AlertDialog.Builder builder = new AlertDialog.Builder(launchActivity2, 0, null);
                        String string = LocaleController.getString(R.string.AppName);
                        AlertDialog alertDialog3 = builder.alertDialog;
                        alertDialog3.title = string;
                        if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                            alertDialog3.message = LocaleController.getString(R.string.FloodWait);
                        } else if (tL_error3.text.startsWith("INVITE_HASH_EXPIRED")) {
                            alertDialog3.title = LocaleController.getString(R.string.ExpiredLink);
                            alertDialog3.message = LocaleController.getString(R.string.InviteExpired);
                        } else {
                            alertDialog3.message = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                        }
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                        launchActivity2.showAlertDialog(builder);
                    }
                    try {
                        launchActivity$$ExternalSyntheticLambda13.run();
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 11:
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda15 = (LaunchActivity$$ExternalSyntheticLambda13) obj;
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj5;
                if (tL_error4 == null) {
                    if (!launchActivity3.isFinishing()) {
                        TLObject tLObject6 = (TLObject) obj3;
                        if (tLObject6 instanceof TLRPC.TL_payments_paymentFormStars) {
                            SendGiftSheet$$ExternalSyntheticLambda3 sendGiftSheet$$ExternalSyntheticLambda3 = launchActivity3.navigateToPremiumGiftCallback;
                            launchActivity3.navigateToPremiumGiftCallback = null;
                            StarsController.getInstance(launchActivity3.currentAccount, false).openPaymentForm(new LaunchActivity$$ExternalSyntheticLambda82(launchActivity$$ExternalSyntheticLambda15, 2), null, (TLRPC.TL_inputInvoiceSlug) obj2, (TLRPC.TL_payments_paymentFormStars) tLObject6, new LinkManager$$ExternalSyntheticLambda24(sendGiftSheet$$ExternalSyntheticLambda3, i3));
                        } else {
                            if (tLObject6 instanceof TLRPC.PaymentForm) {
                                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject6;
                                MessagesController.getInstance(i).putUsers(paymentForm.users, false);
                                paymentFormActivity = new PaymentFormActivity(paymentForm, null, (String) obj4, ((ActionBarLayout) launchActivity3.getActionBarLayout()).getLastFragment());
                            } else {
                                paymentFormActivity = tLObject6 instanceof TLRPC.PaymentReceipt ? new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject6) : null;
                            }
                            if (paymentFormActivity != null) {
                                SendGiftSheet$$ExternalSyntheticLambda3 sendGiftSheet$$ExternalSyntheticLambda4 = launchActivity3.navigateToPremiumGiftCallback;
                                if (sendGiftSheet$$ExternalSyntheticLambda4 != null) {
                                    launchActivity3.navigateToPremiumGiftCallback = null;
                                    paymentFormActivity.paymentFormCallback = new LinkManager$$ExternalSyntheticLambda25(sendGiftSheet$$ExternalSyntheticLambda4, i3);
                                }
                                launchActivity3.presentFragment(paymentFormActivity);
                            }
                        }
                    }
                    break;
                } else {
                    launchActivity3.getClass();
                    boolean zEqualsIgnoreCase = "SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error4.text);
                    ArrayList arrayList5 = launchActivity3.mainFragmentsStack;
                    if (zEqualsIgnoreCase) {
                        UserNameResolver$$ExternalSyntheticOutline0.m(R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid, BulletinFactory.of((BaseFragment) zziq.m(1, arrayList5)), null);
                    } else {
                        UserNameResolver$$ExternalSyntheticOutline0.m(R.string.PaymentInvoiceLinkInvalid, BulletinFactory.of((BaseFragment) zziq.m(1, arrayList5)), null);
                    }
                }
                try {
                    launchActivity$$ExternalSyntheticLambda15.run();
                } catch (Exception e2) {
                    FileLog.e(e2);
                    return;
                }
                break;
            case 12:
                LaunchActivity launchActivity4 = (LaunchActivity) obj6;
                launchActivity4.getClass();
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i).loadAttachMenuBots(false, true, new LinkManager$$ExternalSyntheticLambda20(launchActivity4, (DialogsActivity) obj5, (BaseFragment) obj2, (TLRPC.User) obj, (String) obj4, 1));
                }
                break;
            case 13:
                LoginActivity.LoginPayView loginPayView = (LoginActivity.LoginPayView) obj6;
                loginPayView.getClass();
                StringBuilder sb = new StringBuilder("LoginBilling queried \"");
                String str6 = (String) obj4;
                sb.append(str6);
                sb.append("\" product: ");
                BillingResult billingResult = (BillingResult) obj5;
                sb.append(BillingController.getResponseCodeString(billingResult.zza));
                FileLog.d(sb.toString());
                int i12 = billingResult.zza;
                LoginActivity loginActivity = LoginActivity.this;
                if (i12 != 0) {
                    loginPayView.lastError = "BILLING_" + BillingController.getResponseCodeString(billingResult.zza);
                    new BulletinFactory(loginActivity.slideViewsContainer, null).createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, BillingController.getResponseCodeString(billingResult.zza)));
                } else {
                    List list2 = (List) obj3;
                    if (list2 == null || list2.isEmpty()) {
                        loginPayView.lastError = "PRODUCT_NOT_FOUND";
                        new BulletinFactory(loginActivity.slideViewsContainer, null).createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "PRODUCT_NOT_FOUND"));
                    } else {
                        ProductDetails productDetails = (ProductDetails) list2.get(0);
                        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                        TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                        tL_inputStorePaymentAuthCode.currency = oneTimePurchaseOfferDetails.zzc;
                        tL_inputStorePaymentAuthCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_inputStorePaymentAuthCode.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                        String str7 = (String) obj2;
                        tL_inputStorePaymentAuthCode.phone_code_hash = TextUtils.isEmpty(str7) ? "" : str7;
                        String str8 = (String) obj;
                        tL_inputStorePaymentAuthCode.phone_number = str8;
                        int i13 = this.f$1;
                        tL_inputStorePaymentAuthCode.premium_days = i13;
                        StringBuilder sbM4m = SurfaceContainer$$ExternalSyntheticOutline0.m4m("LoginBilling found \"", str6, "\" product, with currency=");
                        sbM4m.append(tL_inputStorePaymentAuthCode.currency);
                        sbM4m.append(" amount=");
                        sbM4m.append(tL_inputStorePaymentAuthCode.amount);
                        sbM4m.append("; phone=");
                        sbM4m.append(str8);
                        sbM4m.append(", phone_code_hash=");
                        sbM4m.append(str7);
                        FileLog.d(sbM4m.toString());
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentAuthCode;
                        ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(tL_payments_canPurchaseStore, new CallLogActivity$$ExternalSyntheticLambda46(loginPayView, oneTimePurchaseOfferDetails, i13, productDetails, tL_inputStorePaymentAuthCode, str6, tL_payments_canPurchaseStore, 3), 10);
                    }
                }
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj6;
                if (profileActivity.getParentActivity() != null) {
                    View view2 = (View) obj5;
                    ItemOptions itemOptions = new ItemOptions(profileActivity, view2, false, true);
                    itemOptions.setScrimViewBackground(profileActivity.listView.getClipBackground(view2, false));
                    itemOptions.longPressSelectionEnabled = false;
                    String str9 = (String) obj4;
                    itemOptions.add(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new PollItemMenu$$ExternalSyntheticLambda17(profileActivity, str9, i, 28), false);
                    itemOptions.addIf(R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), new ProfileActivity$$ExternalSyntheticLambda149(profileActivity, (String[]) obj2, (String) obj, str9, 0), ((boolean[]) obj3)[0]);
                    itemOptions.show();
                    break;
                }
                break;
        }
    }

    public ArticleViewer$$ExternalSyntheticLambda70(Object obj, int i, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$5 = obj5;
        this.f$6 = obj6;
    }

    public ArticleViewer$$ExternalSyntheticLambda70(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i, String str) {
        this.$r8$classId = 2;
        this.f$0 = sendMessagesHelper;
        this.f$3 = tLObject;
        this.f$2 = inputFile;
        this.f$5 = inputMedia;
        this.f$6 = delayedMessage;
        this.f$1 = i;
        this.f$4 = str;
    }

    public ArticleViewer$$ExternalSyntheticLambda70(TLObject tLObject, AlertDialog alertDialog, Context context, int i, TL_phone.exportGroupCallInvite exportgroupcallinvite, Theme.ResourcesProvider resourcesProvider, GroupCreateActivity$$ExternalSyntheticLambda7 groupCreateActivity$$ExternalSyntheticLambda7) {
        this.$r8$classId = 5;
        this.f$3 = tLObject;
        this.f$0 = alertDialog;
        this.f$2 = context;
        this.f$1 = i;
        this.f$4 = exportgroupcallinvite;
        this.f$5 = resourcesProvider;
        this.f$6 = groupCreateActivity$$ExternalSyntheticLambda7;
    }

    public ArticleViewer$$ExternalSyntheticLambda70(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i, AtomicInteger atomicInteger, ArrayList arrayList2, ChatActivity$$ExternalSyntheticLambda102 chatActivity$$ExternalSyntheticLambda102) {
        this.$r8$classId = 6;
        this.f$0 = tL_error;
        this.f$3 = tLObject;
        this.f$2 = arrayList;
        this.f$1 = i;
        this.f$4 = atomicInteger;
        this.f$5 = arrayList2;
        this.f$6 = chatActivity$$ExternalSyntheticLambda102;
    }

    public ArticleViewer$$ExternalSyntheticLambda70(AlertDialog alertDialog, Browser.Progress progress, TLObject tLObject, int i, Activity activity, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.$r8$classId = 9;
        this.f$0 = alertDialog;
        this.f$2 = progress;
        this.f$3 = tLObject;
        this.f$1 = i;
        this.f$4 = activity;
        this.f$5 = tL_inputGroupCallSlug;
        this.f$6 = tL_error;
    }

    public ArticleViewer$$ExternalSyntheticLambda70(AlertDialog alertDialog, TLObject tLObject, int i, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.$r8$classId = 7;
        this.f$0 = alertDialog;
        this.f$3 = tLObject;
        this.f$1 = i;
        this.f$2 = document;
        this.f$4 = tL_error;
        this.f$5 = obj;
        this.f$6 = tL_stickers_addStickerToSet;
    }

    public ArticleViewer$$ExternalSyntheticLambda70(MentionsAdapter.AnonymousClass7 anonymousClass7, int i, ArrayList arrayList, LongSparseArray longSparseArray, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController) {
        this.$r8$classId = 3;
        this.f$0 = anonymousClass7;
        this.f$1 = i;
        this.f$2 = arrayList;
        this.f$4 = longSparseArray;
        this.f$5 = tL_error;
        this.f$3 = tLObject;
        this.f$6 = messagesController;
    }

    public ArticleViewer$$ExternalSyntheticLambda70(SharedMediaLayout.AnonymousClass13 anonymousClass13, int i, String str, TL_stars.TL_starGiftCollection tL_starGiftCollection, Context context, Theme.ResourcesProvider resourcesProvider, BaseFragment baseFragment) {
        this.$r8$classId = 8;
        this.f$0 = anonymousClass13;
        this.f$1 = i;
        this.f$4 = str;
        this.f$2 = tL_starGiftCollection;
        this.f$3 = context;
        this.f$5 = resourcesProvider;
        this.f$6 = baseFragment;
    }

    public ArticleViewer$$ExternalSyntheticLambda70(LaunchActivity launchActivity, TLObject tLObject, int i, DialogsActivity dialogsActivity, BaseFragment baseFragment, TLRPC.User user, String str) {
        this.$r8$classId = 12;
        this.f$0 = launchActivity;
        this.f$3 = tLObject;
        this.f$1 = i;
        this.f$2 = dialogsActivity;
        this.f$5 = baseFragment;
        this.f$6 = user;
        this.f$4 = str;
    }

    public ArticleViewer$$ExternalSyntheticLambda70(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i, AlertDialog alertDialog, LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13, String str) {
        this.$r8$classId = 10;
        this.f$0 = launchActivity;
        this.f$2 = tL_error;
        this.f$3 = tLObject;
        this.f$1 = i;
        this.f$5 = alertDialog;
        this.f$6 = launchActivity$$ExternalSyntheticLambda13;
        this.f$4 = str;
    }

    public ArticleViewer$$ExternalSyntheticLambda70(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13, int i, String str) {
        this.$r8$classId = 11;
        this.f$0 = launchActivity;
        this.f$2 = tL_error;
        this.f$3 = tLObject;
        this.f$5 = tL_inputInvoiceSlug;
        this.f$6 = launchActivity$$ExternalSyntheticLambda13;
        this.f$1 = i;
        this.f$4 = str;
    }

    public ArticleViewer$$ExternalSyntheticLambda70(LoginActivity.LoginPayView loginPayView, String str, BillingResult billingResult, List list, String str2, String str3, int i) {
        this.$r8$classId = 13;
        this.f$0 = loginPayView;
        this.f$4 = str;
        this.f$2 = billingResult;
        this.f$3 = list;
        this.f$5 = str2;
        this.f$6 = str3;
        this.f$1 = i;
    }

    public ArticleViewer$$ExternalSyntheticLambda70(ProfileActivity profileActivity, View view, String str, int i, boolean[] zArr, String[] strArr, String str2) {
        this.$r8$classId = 14;
        this.f$0 = profileActivity;
        this.f$2 = view;
        this.f$4 = str;
        this.f$1 = i;
        this.f$3 = zArr;
        this.f$5 = strArr;
        this.f$6 = str2;
    }
}
