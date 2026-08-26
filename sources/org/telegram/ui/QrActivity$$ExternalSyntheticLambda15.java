package org.telegram.ui;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.common.base.Splitter;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda8;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmojiView$2$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.JoinGroupAlert;
import org.telegram.ui.Components.JoinToSendSettingsView$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.JoinToSendSettingsView$$ExternalSyntheticLambda5;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.PasscodeView$9$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Stars.MessageSuggestionOfferSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichInlineButtonEditor;

public final class QrActivity$$ExternalSyntheticLambda15 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;
    public final Object f$3;

    public QrActivity$$ExternalSyntheticLambda15(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        String[] strArrSplit;
        int i;
        char c;
        QrActivity.AnonymousClass2 anonymousClass2;
        byte[] bArr;
        int i2 = 20;
        int i3 = 7;
        int i4 = 11;
        int i5 = 8;
        int i6 = 3;
        bArr = null;
        byte[] bArr2 = null;
        str = null;
        String str = null;
        int i7 = 1;
        int i8 = 0;
        switch (this.$r8$classId) {
            case 0:
                ((QrActivity) this.f$0).lambda$onItemSelected$14(this.f$1, (EmojiThemes) this.f$2, (INavigationLayout.ThemeAnimationSettings) this.f$3);
                break;
            case 1:
                ((CameraController) this.f$0).lambda$initCamera$3(this.f$1, (Exception) this.f$2, (Runnable) this.f$3);
                break;
            case 2:
                String[] strArr = (String[]) this.f$0;
                Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) this.f$2;
                boolean z = this.f$1;
                try {
                    Theme.themedWallpaperFileOffset = Theme.currentColorsNoAccent.get(Theme.key_wallpaperFileOffset, -1);
                    if (TextUtils.isEmpty(strArr[0])) {
                        try {
                            if (themeInfo.pathToWallpaper != null) {
                                new File(themeInfo.pathToWallpaper).delete();
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        themeInfo.pathToWallpaper = null;
                        Theme.themedWallpaperLink = null;
                    } else {
                        Theme.themedWallpaperLink = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(Theme.themedWallpaperLink) + ".wp").getAbsolutePath();
                        try {
                            String str2 = themeInfo.pathToWallpaper;
                            if (str2 != null && !str2.equals(absolutePath)) {
                                new File(themeInfo.pathToWallpaper).delete();
                            }
                            break;
                        } catch (Exception unused2) {
                        }
                        themeInfo.pathToWallpaper = absolutePath;
                        try {
                            Uri uri = Uri.parse(Theme.themedWallpaperLink);
                            themeInfo.slug = uri.getQueryParameter("slug");
                            String queryParameter = uri.getQueryParameter("mode");
                            if (queryParameter != null && (strArrSplit = queryParameter.toLowerCase().split(" ")) != null && strArrSplit.length > 0) {
                                int i9 = 0;
                                while (i9 < strArrSplit.length) {
                                    if ("blur".equals(strArrSplit[i9])) {
                                        themeInfo.isBlured = true;
                                    } else {
                                        if ("motion".equals(strArrSplit[i9])) {
                                            i = 1;
                                            themeInfo.isMotion = true;
                                        }
                                        i9 += i;
                                    }
                                    i = 1;
                                    i9 += i;
                                }
                            }
                            Utilities.parseInt((CharSequence) uri.getQueryParameter("intensity")).getClass();
                            themeInfo.patternBgGradientRotation = 45;
                            try {
                                String queryParameter2 = uri.getQueryParameter("bg_color");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    themeInfo.patternBgColor = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                    if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                        themeInfo.patternBgGradientColor1 = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                        themeInfo.patternBgGradientColor2 = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                        themeInfo.patternBgGradientColor3 = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                    }
                                }
                                break;
                            } catch (Exception unused3) {
                            }
                            try {
                                String queryParameter3 = uri.getQueryParameter("rotation");
                                if (!TextUtils.isEmpty(queryParameter3)) {
                                    themeInfo.patternBgGradientRotation = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                }
                                break;
                            } catch (Exception unused4) {
                            }
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                    }
                    if (!z && Theme.previousTheme == null) {
                        Theme.currentDayTheme = themeInfo;
                        if (Theme.currentTheme == Theme.currentNightTheme) {
                            Theme.switchNightThemeDelay = 2000;
                            Theme.lastDelayUpdateTime = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda470(3), 2100L);
                        }
                    }
                    Theme.currentTheme = themeInfo;
                    Theme.refreshThemeColors(false, false);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (Theme.previousTheme == null && !Theme.switchingNightTheme) {
                    MessagesController.getInstance(themeInfo.account).saveTheme(themeInfo, themeInfo.getAccent(false), z, false);
                }
                ((Theme$$ExternalSyntheticLambda8) this.f$3).run();
                break;
            case 3:
                DialogsSearchAdapter dialogsSearchAdapter = (DialogsSearchAdapter) this.f$0;
                if (this.f$1) {
                    dialogsSearchAdapter.getClass();
                } else {
                    DialogsSearchAdapter.Filter filter = (DialogsSearchAdapter.Filter) this.f$3;
                    dialogsSearchAdapter.currentMessagesFilter = filter;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(filter.strFromResId));
                    spannableStringBuilder.append((CharSequence) "v");
                    spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.arrows_select), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    GraySectionCell graySectionCell = (GraySectionCell) this.f$2;
                    graySectionCell.setRightText(spannableStringBuilder);
                    graySectionCell.setRightTextMargin(6);
                    dialogsSearchAdapter.searchResultMessages.clear();
                    dialogsSearchAdapter.forceLoadingMessages = true;
                    dialogsSearchAdapter.notifyDataSetChanged();
                    dialogsSearchAdapter.loadMoreSearchMessages();
                }
                break;
            case 4:
                ((ChatActivity) this.f$0).lambda$didLongPressLink$415((String) this.f$2, (MessageObject) this.f$3, this.f$1);
                break;
            case 5:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = (ChatActivity.ChatMessageCellDelegate) this.f$0;
                chatMessageCellDelegate.getClass();
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                int i10 = R.string.SuggestedMessageAcceptInfo;
                ChatActivity chatActivity = ChatActivity.this;
                MessagesController messagesController = chatActivity.getMessagesController();
                TLRPC.Message message = (TLRPC.Message) this.f$2;
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i10, messagesController.getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder2.append((CharSequence) "\n\n");
                AmountUtils$Amount amountUtils$AmountOfSafe = AmountUtils$Amount.ofSafe(message.suggested_post.price);
                int i11 = amountUtils$AmountOfSafe.currency == AmountUtils$Currency.TON ? chatActivity.getMessagesController().config.tonSuggestedPostCommissionPermille.get() : chatActivity.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                boolean z2 = this.f$1;
                if (z2) {
                    c = 1;
                    amountUtils$AmountOfSafe = AmountUtils$Amount.fromNano((amountUtils$AmountOfSafe.nanos / 1000) * ((long) i11), amountUtils$AmountOfSafe.currency);
                } else {
                    c = 1;
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z2) {
                        int i12 = R.string.SuggestedMessageAcceptInfoAnytimeAdmin2;
                        String asDecimalSpaced = amountUtils$AmountOfSafe.formatAsDecimalSpaced();
                        String strPercents = AffiliateProgramFragment.percents(i11);
                        Object[] objArr = new Object[2];
                        objArr[0] = asDecimalSpaced;
                        objArr[c] = strPercents;
                        spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i12, objArr)));
                    } else {
                        spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, amountUtils$AmountOfSafe.formatAsDecimalSpaced())));
                    }
                } else if (z2) {
                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, amountUtils$AmountOfSafe.formatAsDecimalSpaced(), MessageSuggestionOfferSheet.formatDateTime(message.suggested_post.schedule_date), AffiliateProgramFragment.percents(i11))));
                } else {
                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, amountUtils$AmountOfSafe.formatAsDecimalSpaced(), MessageSuggestionOfferSheet.formatDateTime(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder2.append(' ');
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfo3, Long.valueOf(MessagesController.getInstance(((BaseFragment) chatActivity).currentAccount).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                Bulletin[] bulletinArr = new Bulletin[1];
                OAuthSheet$$ExternalSyntheticLambda11 oAuthSheet$$ExternalSyntheticLambda11 = new OAuthSheet$$ExternalSyntheticLambda11(bulletinArr, 8);
                AlertDialog[] alertDialogArr = new AlertDialog[1];
                AlertDialog alertDialogShowSimpleConfirmAlert = AlertsCreator.showSimpleConfirmAlert(chatActivity, LocaleController.getString(R.string.SuggestedPostAcceptTitle), spannableStringBuilder2, LocaleController.getString(message.suggested_post.schedule_date == 0 ? R.string.Next : R.string.SuggestedPostPublish), false, new ChatActivity$$ExternalSyntheticLambda218(chatMessageCellDelegate, message, alertDialogArr, (MessageObject) this.f$3, oAuthSheet$$ExternalSyntheticLambda11, 11));
                alertDialogArr[0] = alertDialogShowSimpleConfirmAlert;
                alertDialogShowSimpleConfirmAlert.setOnDismissListener(oAuthSheet$$ExternalSyntheticLambda11);
                if (z2 && amountUtils$AmountOfSafe.currency == AmountUtils$Currency.STARS) {
                    Bulletin bulletinCreateSimpleBulletin = new BulletinFactory(new Bulletin.BulletinWindow(chatActivity.getParentActivity(), null).container, ((BaseFragment) chatActivity).resourceProvider).createSimpleBulletin(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    bulletinCreateSimpleBulletin.duration = 60000;
                    bulletinCreateSimpleBulletin.show(true);
                    bulletinArr[0] = bulletinCreateSimpleBulletin;
                    break;
                }
                break;
            case 6:
                ChatActivity.ThemeDelegate themeDelegate = (ChatActivity.ThemeDelegate) this.f$0;
                themeDelegate.setupChatTheme((EmojiThemes) this.f$2, (TLRPC.WallPaper) this.f$3, this.f$1);
                themeDelegate.initServiceMessageColors(themeDelegate.backgroundDrawable);
                ChatActivity.ChatActivityFragmentView chatActivityFragmentView = ChatActivity.this.contentView;
                if (chatActivityFragmentView != null && (anonymousClass2 = chatActivityFragmentView.backgroundView) != null) {
                    anonymousClass2.invalidate();
                    break;
                }
                break;
            case 7:
                ChatEditTypeActivity chatEditTypeActivity = (ChatEditTypeActivity) this.f$0;
                if (((TLRPC.TL_error) this.f$2) == null) {
                    chatEditTypeActivity.getClass();
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ((TLObject) this.f$3);
                    chatEditTypeActivity.invite = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = chatEditTypeActivity.info;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (this.f$1) {
                        if (chatEditTypeActivity.getParentActivity() != null) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(chatEditTypeActivity.getParentActivity(), 0, null);
                            String string = LocaleController.getString(R.string.RevokeAlertNewLink);
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.message = string;
                            alertDialog.title = LocaleController.getString(R.string.RevokeLink);
                            builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
                            chatEditTypeActivity.showDialog(alertDialog);
                        }
                    }
                }
                LinkActionView linkActionView = chatEditTypeActivity.permanentLinkView;
                if (linkActionView != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatEditTypeActivity.invite;
                    linkActionView.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    chatEditTypeActivity.permanentLinkView.loadUsers(chatEditTypeActivity.invite, chatEditTypeActivity.chatId);
                }
                break;
            case 8:
                ChatLinkActivity.ListAdapter.AnonymousClass1 anonymousClass1 = (ChatLinkActivity.ListAdapter.AnonymousClass1) this.f$0;
                anonymousClass1.getClass();
                TLRPC.Chat chat = (TLRPC.Chat) this.f$2;
                boolean z3 = this.f$1;
                chat.join_to_send = z3;
                ChatLinkActivity.this.getMessagesController().toggleChatJoinToSend(chat.id, z3, new PhotoViewer$$ExternalSyntheticLambda89(anonymousClass1, z3, chat, i4), new ChatLinkActivity$$ExternalSyntheticLambda9(9, anonymousClass1, (JoinToSendSettingsView$$ExternalSyntheticLambda5) this.f$3));
                break;
            case 9:
                ChatLinkActivity.ListAdapter.AnonymousClass1 anonymousClass3 = (ChatLinkActivity.ListAdapter.AnonymousClass1) this.f$0;
                anonymousClass3.getClass();
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f$2;
                boolean z4 = this.f$1;
                chat2.join_request = z4;
                ChatLinkActivity.this.getMessagesController().toggleChatJoinRequest(chat2.id, z4, new ChatLinkActivity$ListAdapter$1$$ExternalSyntheticLambda3(anonymousClass3, i8), new ChatLinkActivity$$ExternalSyntheticLambda9(i5, anonymousClass3, (JoinToSendSettingsView$$ExternalSyntheticLambda4) this.f$3));
                break;
            case 10:
                if (this.f$1) {
                    TLRPC.Chat chat3 = (TLRPC.Chat) this.f$0;
                    if (ChatObject.isChannel(chat3)) {
                        View button = ((AlertDialog.Builder) this.f$2).alertDialog.getButton(-1);
                        if (button instanceof TextView) {
                            TextView textView = (TextView) button;
                            if (((boolean[]) this.f$3)[0]) {
                                textView.setText(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat3) ? R.string.ChannelDelete : R.string.DeleteMega));
                            } else if (chat3.monoforum) {
                                textView.setText(LocaleController.getString(R.string.LeaveConversationMenu));
                            } else if (chat3.megagroup) {
                                textView.setText(LocaleController.getString(R.string.LeaveMega));
                            } else {
                                textView.setText(LocaleController.getString(R.string.LeaveChannel));
                            }
                        }
                        break;
                    }
                }
                break;
            case 11:
                ChatAttachAlertDocumentLayout.SearchAdapter searchAdapter = (ChatAttachAlertDocumentLayout.SearchAdapter) this.f$0;
                searchAdapter.getClass();
                String lowerCase = ((String) this.f$2).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new EmojiView$2$$ExternalSyntheticLambda1(5, searchAdapter, new ArrayList()));
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                        str = translitString;
                    }
                    int i13 = (str != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i13];
                    strArr2[0] = lowerCase;
                    if (str != null) {
                        strArr2[1] = str;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (!this.f$1) {
                        int i14 = 0;
                        while (true) {
                            ArrayList arrayList2 = (ArrayList) this.f$3;
                            if (i14 < arrayList2.size()) {
                                ChatAttachAlertDocumentLayout.ListItem listItem = (ChatAttachAlertDocumentLayout.ListItem) arrayList2.get(i14);
                                File file = listItem.file;
                                if (file != null && !file.isDirectory()) {
                                    for (int i15 = 0; i15 < i13; i15++) {
                                        String str3 = strArr2[i15];
                                        String str4 = listItem.title;
                                        if (str4 != null ? str4.toLowerCase().contains(str3) : false) {
                                            arrayList.add(listItem);
                                        }
                                        break;
                                    }
                                }
                                i14++;
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new EmojiView$2$$ExternalSyntheticLambda1(5, searchAdapter, arrayList));
                }
                break;
            case 12:
                ((JoinGroupAlert) this.f$0).lambda$new$6((TLRPC.TL_error) this.f$2, this.f$1, (TLRPC.TL_messages_importChatInvite) this.f$3);
                break;
            case 13:
                Splitter splitter = (Splitter) this.f$2;
                Painting painting = (Painting) this.f$0;
                painting.renderView.performInContext(new Painting$$ExternalSyntheticLambda4(painting, splitter, i8));
                painting.renderView.performInContext(new Painting$$ExternalSyntheticLambda4(painting, (Splitter) this.f$3, i8));
                painting.hasBlur = this.f$1;
                break;
            case 14:
                int i16 = R.raw.star_premium_2;
                boolean z5 = this.f$1;
                String string2 = z5 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                TLRPC.Chat chat4 = (TLRPC.Chat) this.f$2;
                Bulletin bulletinCreateSimpleBulletin2 = ((BulletinFactory) this.f$0).createSimpleBulletin(string2, AndroidUtilities.replaceSingleTag(z5 ? LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat4) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup) : LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat4) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup), Theme.key_undo_cancelColor, 0, new PasscodeView$9$$ExternalSyntheticLambda0(chat4, i2), (Theme.ResourcesProvider) this.f$3), i16);
                bulletinCreateSimpleBulletin2.duration = 5000;
                bulletinCreateSimpleBulletin2.show();
                break;
            case 15:
                StickersAlert.AnonymousClass1 anonymousClass4 = (StickersAlert.AnonymousClass1) this.f$0;
                anonymousClass4.getClass();
                TLObject tLObject = (TLObject) this.f$2;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (this.f$1) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject, 0, null, false, false);
                    } else {
                        StickersAlert stickersAlert = StickersAlert.this;
                        stickersAlert.stickerSet = tL_messages_stickerSet;
                        stickersAlert.loadStickerSet();
                        stickersAlert.updateFields();
                    }
                }
                ((AlertDialog) this.f$3).dismiss();
                break;
            case 16:
                GroupCallActivity groupCallActivity = (GroupCallActivity) this.f$0;
                groupCallActivity.getClass();
                TLObject tLObject2 = (TLObject) this.f$2;
                if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                    TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.f$3;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                    } else {
                        groupCallActivity.openShareAlert(null, tL_chatInviteExported3.link, true, this.f$1);
                    }
                }
                break;
            case 17:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f$2;
                BottomSheet bottomSheet = (BottomSheet) this.f$0;
                boolean z6 = this.f$1;
                if (bottomSheet != null && !bottomSheet.isDismissed()) {
                    bottomSheet.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z6) {
                        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda422(i3, editTextBoldCursor));
                    }
                    break;
                } else {
                    AlertDialog alertDialog2 = (AlertDialog) this.f$3;
                    if (alertDialog2 != null && alertDialog2.isShowing()) {
                        alertDialog2.setFocusable(true);
                        editTextBoldCursor.requestFocus();
                        if (z6) {
                            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda422(i5, editTextBoldCursor));
                        }
                        break;
                    }
                }
                break;
            case 18:
                GroupInviteActivity groupInviteActivity = (GroupInviteActivity) this.f$0;
                if (((TLRPC.TL_error) this.f$2) == null) {
                    groupInviteActivity.getClass();
                    groupInviteActivity.invite = (TLRPC.TL_chatInviteExported) ((TLObject) this.f$3);
                    if (this.f$1) {
                        if (groupInviteActivity.getParentActivity() != null) {
                            AlertDialog.Builder builder2 = new AlertDialog.Builder(groupInviteActivity.getParentActivity(), 0, null);
                            String string3 = LocaleController.getString(R.string.RevokeAlertNewLink);
                            AlertDialog alertDialog3 = builder2.alertDialog;
                            alertDialog3.message = string3;
                            alertDialog3.title = LocaleController.getString(R.string.RevokeLink);
                            builder2.setNegativeButton(LocaleController.getString(R.string.OK), null);
                            groupInviteActivity.showDialog(alertDialog3);
                        }
                    }
                }
                groupInviteActivity.loading = false;
                groupInviteActivity.listAdapter.mObservable.notifyChanged();
                break;
            case 19:
                PassportActivity.AnonymousClass8 anonymousClass8 = (PassportActivity.AnonymousClass8) this.f$0;
                String str5 = ((TL_account.passwordSettings) this.f$2).email;
                PassportActivity passportActivity = PassportActivity.this;
                passportActivity.currentEmail = str5;
                boolean z7 = this.f$1;
                if (z7) {
                    passportActivity.saltedPassword = passportActivity.savedSaltedPassword;
                }
                byte[] bArr3 = passportActivity.secureSecret;
                byte[] bArr4 = passportActivity.saltedPassword;
                if (bArr3 != null && bArr3.length == 32) {
                    byte[] bArr5 = new byte[32];
                    System.arraycopy(bArr4, 0, bArr5, 0, 32);
                    byte[] bArr6 = new byte[16];
                    System.arraycopy(bArr4, 32, bArr6, 0, 16);
                    byte[] bArr7 = new byte[32];
                    System.arraycopy(bArr3, 0, bArr7, 0, 32);
                    Utilities.aesCbcEncryptionByteArraySafe(bArr7, bArr5, bArr6, 0, 32, 0, 0);
                    bArr2 = bArr7;
                }
                if (!PassportActivity.checkSecret(bArr2, Long.valueOf(passportActivity.secureSecretId)) || ((byte[]) this.f$3).length == 0 || passportActivity.secureSecretId == 0) {
                    if (z7) {
                        UserConfig.getInstance(((BaseFragment) passportActivity).currentAccount).resetSavedPassword();
                        passportActivity.usingSavedPassword = 0;
                        passportActivity.updatePasswordInterface();
                    } else {
                        TL_account.authorizationForm authorizationform = passportActivity.currentForm;
                        if (authorizationform != null) {
                            authorizationform.values.clear();
                            passportActivity.currentForm.errors.clear();
                        }
                        byte[] bArr8 = passportActivity.secureSecret;
                        if (bArr8 == null || bArr8.length == 0) {
                            Utilities.globalQueue.postRunnable(new LinkManager$$ExternalSyntheticLambda21(anonymousClass8, anonymousClass8.val$x_bytes, anonymousClass8.val$textPassword, 28));
                        } else {
                            anonymousClass8.resetSecret();
                        }
                    }
                } else if (passportActivity.currentBotId == 0) {
                    ConnectionsManager.getInstance(((BaseFragment) passportActivity).currentAccount).sendRequest(new TL_account.getAllSecureValues(), new PassportActivity$8$$ExternalSyntheticLambda0(anonymousClass8, i7));
                } else {
                    anonymousClass8.openRequestInterface();
                }
                break;
            case 20:
                PassportActivity.AnonymousClass8 anonymousClass9 = (PassportActivity.AnonymousClass8) this.f$0;
                if (((TLRPC.TL_error) this.f$2) == null) {
                    TL_account.Password password = (TL_account.Password) ((TLObject) this.f$3);
                    PassportActivity passportActivity2 = PassportActivity.this;
                    passportActivity2.currentPassword = password;
                    TwoStepVerificationActivity.initPasswordNewAlgo(password);
                    passportActivity2.onPasswordDone(this.f$1);
                }
                break;
            case 21:
                PassportActivity.AnonymousClass8 anonymousClass10 = (PassportActivity.AnonymousClass8) this.f$0;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.f$2);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                String str6 = (String) this.f$3;
                PassportActivity passportActivity3 = PassportActivity.this;
                if (tL_secureSecretSettings != null) {
                    passportActivity3.secureSecret = tL_secureSecretSettings.secure_secret;
                    passportActivity3.secureSecretId = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        passportActivity3.saltedPassword = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str6), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        bArr = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        passportActivity3.saltedPassword = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda21(anonymousClass10, i6));
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = passportActivity3.currentPassword.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100001 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        bArr = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100001.salt;
                        passportActivity3.saltedPassword = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100001.salt);
                    } else {
                        bArr = new byte[0];
                    }
                    passportActivity3.secureSecret = null;
                    passportActivity3.secureSecretId = 0L;
                }
                AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda15(anonymousClass10, passwordsettings, this.f$1, bArr, 19));
                break;
            case 22:
                PaymentFormActivity paymentFormActivity = (PaymentFormActivity) this.f$0;
                paymentFormActivity.getClass();
                if (((TLRPC.TL_error) this.f$2) == null) {
                    TL_account.Password password2 = (TL_account.Password) ((TLObject) this.f$3);
                    paymentFormActivity.currentPassword = password2;
                    TwoStepVerificationActivity.initPasswordNewAlgo(password2);
                    paymentFormActivity.sendSavePassword(this.f$1);
                }
                break;
            case 23:
                StarsController.GiftsList giftsList = (StarsController.GiftsList) this.f$0;
                giftsList.getClass();
                if (((int[]) this.f$2)[0] == giftsList.currentRequestId) {
                    giftsList.loading = false;
                    giftsList.currentRequestId = -1;
                    TLObject tLObject3 = (TLObject) this.f$3;
                    boolean z8 = tLObject3 instanceof TL_stars.TL_payments_savedStarGifts;
                    int i17 = giftsList.currentAccount;
                    if (z8) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject3;
                        MessagesController.getInstance(i17).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i17).putChats(tL_payments_savedStarGifts.chats, false);
                        ArrayList arrayList3 = giftsList.gifts;
                        if (this.f$1) {
                            arrayList3.clear();
                        }
                        arrayList3.addAll(tL_payments_savedStarGifts.gifts);
                        giftsList.lastOffset = tL_payments_savedStarGifts.next_offset;
                        giftsList.totalCount = tL_payments_savedStarGifts.count;
                        giftsList.chat_notifications_enabled = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                        giftsList.endReached = arrayList3.size() > giftsList.totalCount || giftsList.lastOffset == null;
                    } else {
                        giftsList.endReached = true;
                    }
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(giftsList.dialogId), giftsList);
                    break;
                }
                break;
            case 24:
                EmojiBottomSheet.GifPage.GifAdapter gifAdapter = (EmojiBottomSheet.GifPage.GifAdapter) this.f$0;
                if (gifAdapter.requesting) {
                    TLObject tLObject4 = (TLObject) this.f$2;
                    boolean z9 = tLObject4 instanceof TLRPC.messages_BotResults;
                    EmojiBottomSheet.GifPage gifPage = EmojiBottomSheet.GifPage.this;
                    if (z9) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject4;
                        MessagesStorage.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).saveBotCache((String) this.f$3, messages_botresults);
                        gifAdapter.offset = messages_botresults.next_offset;
                        ArrayList arrayList4 = gifPage.gifs;
                        if (this.f$1) {
                            arrayList4.clear();
                        }
                        arrayList4.size();
                        arrayList4.addAll(messages_botresults.results);
                        gifAdapter.mObservable.notifyChanged();
                    }
                    gifPage.searchField.showProgress(false);
                    gifAdapter.requesting = false;
                    break;
                }
                break;
            case 25:
                Bitmap bitmap = (Bitmap) this.f$2;
                boolean z10 = this.f$1;
                StoryEntry storyEntry = (StoryEntry) this.f$0;
                storyEntry.getClass();
                try {
                    bitmap.compress(z10 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(storyEntry.filterFile));
                } catch (Exception e2) {
                    FileLog.e((Throwable) e2, false);
                    if (z10) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(storyEntry.filterFile));
                        } catch (Exception e3) {
                            FileLog.e((Throwable) e3, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread((Runnable) this.f$3);
                break;
            case 26:
                ((TwoStepVerificationSetupActivity) this.f$0).lambda$setNewPassword$45((TLObject) this.f$3, (TLRPC.TL_error) this.f$2, this.f$1);
                break;
            default:
                String strTrim = ((EditTextBoldCursor) this.f$0).getText().toString().trim();
                if (!TextUtils.isEmpty(strTrim)) {
                    RichInlineButtonEditor.showUserPicker((BaseFragment) this.f$2, this.f$1, new TodoItemMenu$$ExternalSyntheticLambda19(i4, (RichEditorListView.BlockButtonEdit) this.f$3, strTrim));
                    break;
                }
                break;
        }
    }

    public QrActivity$$ExternalSyntheticLambda15(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = z;
        this.f$3 = obj3;
    }

    public QrActivity$$ExternalSyntheticLambda15(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    public QrActivity$$ExternalSyntheticLambda15(boolean z, TLRPC.Chat chat, AlertDialog.Builder builder, boolean[] zArr) {
        this.$r8$classId = 10;
        this.f$1 = z;
        this.f$0 = chat;
        this.f$2 = builder;
        this.f$3 = zArr;
    }
}
