package org.telegram.ui;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_language_id_common.zzij;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda56;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.StickersDialogs;
import org.telegram.ui.Gifts.AcquiredGiftsSheet;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.Gifts.AuctionJoinSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.bots.BotDownloads;
import org.telegram.ui.bots.BotDownloads.FileDownload;
import org.telegram.ui.web.AddressBarList;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.SearchEngine;

public final class ArticleViewer$$ExternalSyntheticLambda33 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public ArticleViewer$$ExternalSyntheticLambda33(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run(Object obj) {
        Intent intent;
        int i;
        String str;
        int i2;
        boolean z;
        Context context;
        String country;
        List list;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet2;
        StoriesController.BotPreviewsList botPreviewsList;
        String str2;
        int i3 = 23;
        char c = 2;
        int i4 = 9;
        int i5 = 5;
        int i6 = 3;
        BotDownloads.FileDownload fileDownload = null;
        int i7 = 0;
        switch (this.$r8$classId) {
            case 0:
                String strReplace = (String) obj;
                ArticleViewer articleViewer = (ArticleViewer) this.f$0;
                articleViewer.getClass();
                if (!TextUtils.isEmpty(strReplace)) {
                    ArticleViewer.PageLayout pageLayout = (ArticleViewer.PageLayout) this.f$1;
                    if (pageLayout.getWebView() != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strReplace.trim());
                        AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                        int length = spannableStringBuilder.length();
                        int iMax = 0;
                        for (int i8 = 0; i8 < uRLSpanArr.length; i8++) {
                            length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i8]), length);
                            iMax = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i8]), iMax);
                        }
                        articleViewer.actionBar.showAddress(false);
                        Uri uriUriParseSafe = Utilities.uriParseSafe(strReplace);
                        if ((uRLSpanArr.length <= 0 || length != 0 || iMax <= 0) && (uriUriParseSafe == null || uriUriParseSafe.getScheme() == null)) {
                            AddressBarList.pushRecentSearch((Activity) this.f$2, strReplace);
                            BotWebViewContainer.MyWebView webView = pageLayout.getWebView();
                            SearchEngine current = SearchEngine.getCurrent();
                            webView.loadUrl(current.search_url != null ? current.search_url + URLEncoder.encode(strReplace) : null);
                        } else {
                            if (uriUriParseSafe != null && uriUriParseSafe.getScheme() == null && uriUriParseSafe.getHost() == null && uriUriParseSafe.getPath() != null) {
                                strReplace = Browser.replace(uriUriParseSafe, "https", null, uriUriParseSafe.getPath(), "/");
                            }
                            pageLayout.getWebView().loadUrl(strReplace);
                        }
                        break;
                    }
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                ArticleViewer articleViewer2 = (ArticleViewer) this.f$0;
                MessagesController messagesController = MessagesController.getInstance(articleViewer2.currentAccount);
                String str3 = (String) this.f$1;
                messagesController.addWebBrowserException(str3, true);
                String str4 = (String) this.f$2;
                if (!TextUtils.isEmpty(str4) && !TextUtils.equals(str4, str3)) {
                    MessagesController.getInstance(articleViewer2.currentAccount).addWebBrowserException(str4, true);
                }
                if (bool.booleanValue()) {
                    LaunchActivity.whenResumed = new ArticleViewer$$ExternalSyntheticLambda0(articleViewer2, 7);
                } else {
                    articleViewer2.showRestrictedWebsiteToast();
                }
                break;
            case 2:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                TLRPC.User user = (TLRPC.User) this.f$1;
                String strM = (String) this.f$2;
                Boolean bool2 = (Boolean) obj;
                if (chatActivity.getParentActivity() != null) {
                    if (bool2.booleanValue()) {
                        intent = new Intent("android.intent.action.INSERT");
                        intent.setType("vnd.android.cursor.dir/raw_contact");
                    } else {
                        intent = new Intent("android.intent.action.INSERT_OR_EDIT");
                        intent.setType("vnd.android.cursor.item/contact");
                    }
                    if (user != null) {
                        intent.putExtra("name", ContactsController.formatName(user.first_name, user.last_name));
                    }
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
                    if (strM.startsWith("+")) {
                        i = 2;
                    } else {
                        TLRPC.User currentUser = chatActivity.getUserConfig().getCurrentUser();
                        HashMap map = new HashMap();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt")));
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line != null) {
                                    String[] strArrSplit = line.split(";");
                                    CountrySelectActivity.Country country2 = new CountrySelectActivity.Country();
                                    country2.name = strArrSplit[c];
                                    String str5 = strArrSplit[0];
                                    country2.code = str5;
                                    i = 2;
                                    try {
                                        country2.shortname = strArrSplit[1];
                                        List arrayList4 = (List) map.get(str5);
                                        if (arrayList4 == null) {
                                            String str6 = strArrSplit[0];
                                            arrayList4 = new ArrayList();
                                            map.put(str6, arrayList4);
                                        }
                                        arrayList4.add(country2);
                                        c = 2;
                                    } catch (Exception e) {
                                        e = e;
                                    }
                                } else {
                                    i = 2;
                                    bufferedReader.close();
                                    str = currentUser.phone;
                                    i2 = 4;
                                    while (true) {
                                        if (i2 >= 1) {
                                            list = (List) map.get(str.substring(0, i2));
                                            if (list != null || list.size() <= 0) {
                                                i2--;
                                            } else {
                                                String str7 = ((CountrySelectActivity.Country) list.get(0)).code;
                                                if (str7.endsWith("0") && strM.startsWith("0")) {
                                                    strM = strM.substring(1);
                                                }
                                                strM = zzij.m("+", str7, strM);
                                                z = true;
                                            }
                                        } else {
                                            z = false;
                                        }
                                    }
                                    if (!z && Build.VERSION.SDK_INT >= 23) {
                                        context = ApplicationLoader.applicationContext;
                                        if (context != null) {
                                            country = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US);
                                        } else {
                                            country = Locale.getDefault().getCountry();
                                        }
                                        if (country.endsWith("0") && strM.startsWith("0")) {
                                            strM = strM.substring(1);
                                        }
                                        strM = zzij.m("+", country, strM);
                                    }
                                }
                                e = e;
                                FileLog.e(e);
                                str = currentUser.phone;
                                i2 = 4;
                                while (true) {
                                    if (i2 >= 1) {
                                        list = (List) map.get(str.substring(0, i2));
                                        if (list != null) {
                                        }
                                        i2--;
                                    } else {
                                        z = false;
                                    }
                                }
                                if (!z) {
                                    context = ApplicationLoader.applicationContext;
                                    if (context != null) {
                                        country = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US);
                                    } else {
                                        country = Locale.getDefault().getCountry();
                                    }
                                    if (country.endsWith("0")) {
                                        strM = strM.substring(1);
                                    }
                                    strM = zzij.m("+", country, strM);
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = 2;
                        }
                    }
                    contentValues.put("data1", strM);
                    contentValues.put("data2", Integer.valueOf(i));
                    arrayList3.add(contentValues);
                    intent.putExtra("finishActivityOnSaveCompleted", true);
                    intent.putParcelableArrayListExtra("data", arrayList3);
                    chatActivity.getParentActivity().startActivity(intent);
                    break;
                }
                break;
            case 3:
                Long l = (Long) obj;
                ChatActivity chatActivity2 = (ChatActivity) this.f$0;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f$1;
                if (groupedMessages == null) {
                    if (chatActivity2.getSendMessagesHelper().retrySendMessage((MessageObject) this.f$2, false, l.longValue())) {
                        chatActivity2.updateVisibleRows$1(false);
                        if (chatActivity2.chatMode == 0) {
                            chatActivity2.moveScrollToLastMessage(false);
                        }
                    }
                    break;
                } else {
                    chatActivity2.getClass();
                    boolean z2 = true;
                    for (int i9 = 0; i9 < groupedMessages.messages.size(); i9++) {
                        if (!chatActivity2.getSendMessagesHelper().retrySendMessage(groupedMessages.messages.get(i9), false, l.longValue())) {
                            z2 = false;
                        }
                    }
                    if (z2 && chatActivity2.chatMode == 0) {
                        chatActivity2.moveScrollToLastMessage(false);
                        break;
                    }
                }
                break;
            case 4:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = (ChatActivity.ChatMessageCellDelegate) this.f$0;
                chatMessageCellDelegate.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    ((ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda1) this.f$2).run();
                    break;
                } else {
                    MessageObject messageObject = (MessageObject) this.f$1;
                    int diceValue = messageObject.getDiceValue();
                    messageObject.getStakedDiceAmount();
                    ArticleViewer$$ExternalSyntheticLambda21 articleViewer$$ExternalSyntheticLambda21 = new ArticleViewer$$ExternalSyntheticLambda21(16, chatMessageCellDelegate, messageObject);
                    int i10 = StakedDiceSheet.$r8$clinit;
                    ChatActivity chatActivity3 = ChatActivity.this;
                    TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(chatActivity3.getCurrentAccount()).stakeDiceInfo;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(chatActivity3.getParentActivity(), chatActivity3.getResourceProvider());
                        RLottieImageView rLottieImageView = lottieLayout.imageView;
                        rLottieImageView.setScaleX(1.25f);
                        rLottieImageView.setScaleY(1.25f);
                        if (diceValue == 1) {
                            rLottieImageView.setImageResource(R.drawable.dice1);
                        } else if (diceValue == 2) {
                            rLottieImageView.setImageResource(R.drawable.dice2);
                        } else if (diceValue == 3) {
                            rLottieImageView.setImageResource(R.drawable.dice3);
                        } else if (diceValue == 4) {
                            rLottieImageView.setImageResource(R.drawable.dice4);
                        } else if (diceValue == 5) {
                            rLottieImageView.setImageResource(R.drawable.dice5);
                        } else if (diceValue == 6) {
                            rLottieImageView.setImageResource(R.drawable.dice6);
                        } else {
                            rLottieImageView.setScaleX(0.8f);
                            rLottieImageView.setScaleY(0.8f);
                            rLottieImageView.setImageDrawable(Emoji.getEmojiBigDrawable("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceToast));
                        spannableStringBuilder2.append((CharSequence) StarsIntroActivity.formatTON(j));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) ButtonSpan.make(LocaleController.getString(R.string.StakeDiceToastChange), new QrActivity$$ExternalSyntheticLambda17(i3, chatActivity3, articleViewer$$ExternalSyntheticLambda21), chatActivity3.getResourceProvider(), null));
                        AndroidUtilities.removeFromParent(lottieLayout.textView);
                        ButtonSpan.TextViewButtons textViewButtons = new ButtonSpan.TextViewButtons(chatActivity3.getParentActivity(), null);
                        lottieLayout.textView = textViewButtons;
                        textViewButtons.setSingleLine();
                        lottieLayout.textView.setTypeface(Typeface.SANS_SERIF);
                        lottieLayout.textView.setTextSize(1, 15.0f);
                        lottieLayout.textView.setEllipsize(TextUtils.TruncateAt.END);
                        lottieLayout.textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        lottieLayout.addView(lottieLayout.textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        lottieLayout.textView.setText(StarsIntroActivity.replaceDiamond(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        lottieLayout.textView.setLinkTextColor(Theme.getColor(Theme.key_undo_cancelColor, chatActivity3.getResourceProvider()));
                        lottieLayout.setTextColor(Theme.getColor(Theme.key_undo_infoColor, chatActivity3.getResourceProvider()));
                        lottieLayout.textView.setSingleLine(false);
                        lottieLayout.textView.setMaxLines(2);
                        Bulletin.UndoButton undoButton = new Bulletin.UndoButton(chatActivity3.getParentActivity(), chatActivity3.getResourceProvider(), true, false);
                        String string = LocaleController.getString(R.string.StakeDiceToastButton);
                        TextView textView = undoButton.undoTextView;
                        if (textView != null) {
                            textView.setText(string);
                        }
                        undoButton.undoAction = new LinkManager$3$$ExternalSyntheticLambda0(articleViewer$$ExternalSyntheticLambda21, j, 18);
                        lottieLayout.setButton(undoButton);
                        BulletinFactory.of(chatActivity3).create(lottieLayout, 2750).show();
                        break;
                    }
                }
                break;
            case 5:
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate2 = (ChatActivity.ChatMessageCellDelegate) this.f$0;
                chatMessageCellDelegate2.getClass();
                ((AlertDialog) this.f$1).dismissUnless(200L);
                ChatActivity chatActivity4 = ChatActivity.this;
                boolean z3 = chatActivity4.getMessagesController().config.needAgeVideoVerification.get() && !TextUtils.isEmpty(chatActivity4.getMessagesController().verifyAgeBotUsername);
                boolean z4 = (contentsettings == null || !contentsettings.sensitive_can_change) && z3;
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(chatActivity4.getParentActivity());
                if (z3) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    CheckBoxCell checkBoxCell = new CheckBoxCell(chatActivity4.getParentActivity(), 1, 17, false, chatActivity4.getResourceProvider());
                    checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
                    checkBoxCell.setText(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                    checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    checkBoxCell.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda342(3, zArr));
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(chatActivity4.getParentActivity(), 0, chatActivity4.getResourceProvider());
                String string2 = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string2;
                alertDialog.message = LocaleController.getString(z4 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                builder.setView(frameLayout);
                alertDialog.customViewOffset = 9;
                builder.setNegativeButton(LocaleController.getString(z4 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                if (!z4) {
                    builder.setPositiveButton(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new SendMessagesHelper$$ExternalSyntheticLambda56(chatMessageCellDelegate2, (ChatMessageCell) this.f$2, zArr, z3, contentsettings));
                }
                chatActivity4.showDialog(alertDialog);
                break;
            case 6:
                ((AudioPlayerAlert) this.f$0).lambda$onSubItemClick$18((AlertDialog) this.f$1, (TLRPC.Document) this.f$2, (TLRPC.InputFile) obj);
                break;
            case 7:
                Long l2 = (Long) obj;
                ChatAttachAlertPollLayout chatAttachAlertPollLayout = (ChatAttachAlertPollLayout) this.f$0;
                chatAttachAlertPollLayout.getClass();
                ChatActivity chatActivity5 = (ChatActivity) this.f$1;
                boolean zIsInScheduleMode = chatActivity5.isInScheduleMode();
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.f$2;
                if (zIsInScheduleMode) {
                    AlertsCreator.createScheduleDatePickerDialog(chatActivity5.getParentActivity(), chatActivity5.getDialogId(), new ChatActivity$$ExternalSyntheticLambda248(chatAttachAlertPollLayout, tL_messageMediaToDo, l2, 28));
                } else {
                    chatAttachAlertPollLayout.delegate.sendPoll(tL_messageMediaToDo, null, null, null, true, 0, l2.longValue());
                    chatAttachAlertPollLayout.parentAlert.dismiss(true);
                }
                break;
            case 8:
                ArrayList arrayList5 = (ArrayList) obj;
                EmojiView.EmojiSearchAdapter.AnonymousClass5 anonymousClass5 = (EmojiView.EmojiSearchAdapter.AnonymousClass5) this.f$0;
                anonymousClass5.getClass();
                int size = arrayList5.size();
                while (i7 < size) {
                    Object obj2 = arrayList5.get(i7);
                    i7++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet3 != null ? stickerSet3.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        ((ArrayList) this.f$1).add(new EmojiView.EmojiPackInfo(stickerSetCovered, arrayList));
                    }
                }
                ((Runnable) this.f$2).run();
                break;
            case 9:
                ((AlertDialog) this.f$0).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ((AlertDialog) this.f$1).dismiss();
                } else {
                    StickersDialogs.AnonymousClass1 anonymousClass1 = (StickersDialogs.AnonymousClass1) this.f$2;
                    anonymousClass1.setErrorText(".");
                    AndroidUtilities.shakeViewSpring(anonymousClass1, -6.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    AndroidUtilities.showKeyboard(anonymousClass1);
                }
                break;
            case 10:
                Runnable runnable = (Runnable) obj;
                DialogsActivity dialogsActivity = (DialogsActivity) this.f$0;
                dialogsActivity.getClass();
                ((AlertDialog) this.f$1).showDelayed(150L);
                Boolean bool3 = dialogsActivity.requestPeerType.bot_participant;
                if (bool3 == null || !bool3.booleanValue()) {
                    runnable.run();
                } else {
                    dialogsActivity.getMessagesController().addUserToChat(((Long) this.f$2).longValue(), dialogsActivity.getMessagesController().getUser(Long.valueOf(dialogsActivity.requestPeerBotId)), 0, null, dialogsActivity, false, runnable, new ChatActivity$$ExternalSyntheticLambda177(i4, runnable));
                }
                break;
            case 11:
                AuctionBidSheet auctionBidSheet = (AuctionBidSheet) this.f$0;
                auctionBidSheet.getClass();
                ((boolean[]) this.f$1)[0] = false;
                new AcquiredGiftsSheet(auctionBidSheet.getContext(), (Theme.ResourcesProvider) this.f$2, auctionBidSheet.auction, (List) obj).show();
                break;
            case 12:
                List list2 = (List) obj;
                AuctionJoinSheet auctionJoinSheet = (AuctionJoinSheet) this.f$0;
                auctionJoinSheet.getClass();
                ((boolean[]) this.f$1)[0] = false;
                if (auctionJoinSheet.auction != null) {
                    new AcquiredGiftsSheet(auctionJoinSheet.getContext(), (Theme.ResourcesProvider) this.f$2, auctionJoinSheet.auction, list2).show();
                    auctionJoinSheet.lambda$showGiftOfferSheet$15();
                }
                break;
            case 13:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ProfileBirthdayEffect.BirthdayEffectFetcher birthdayEffectFetcher = (ProfileBirthdayEffect.BirthdayEffectFetcher) this.f$0;
                birthdayEffectFetcher.getClass();
                HashMap map2 = new HashMap();
                for (Integer num : (HashSet) this.f$1) {
                    TLRPC.Document documentFindSticker = SelectAnimatedEmojiDialog.findSticker(num + "️⃣", tL_messages_stickerSet);
                    if (documentFindSticker == null) {
                        documentFindSticker = SelectAnimatedEmojiDialog.findSticker(num + "⃣", tL_messages_stickerSet);
                    }
                    if (documentFindSticker == null) {
                        String[] strArr = ProfileBirthdayEffect.interactions;
                        FileLog.e("couldn't find " + num + "️⃣ emoji in FestiveFontEmoji");
                    } else {
                        map2.put(num, documentFindSticker);
                    }
                    break;
                }
                HashMap map3 = new HashMap();
                for (Map.Entry entry : map2.entrySet()) {
                    Integer num2 = (Integer) entry.getKey();
                    num2.getClass();
                    ProfileBirthdayEffect.ImageReceiverAsset imageReceiverAsset = new ProfileBirthdayEffect.ImageReceiverAsset();
                    birthdayEffectFetcher.allAssets.add(imageReceiverAsset);
                    TLRPC.Document document = (TLRPC.Document) entry.getValue();
                    imageReceiverAsset.setDelegate(new ProfileBirthdayEffect.ImageReceiverAsset.AnonymousClass1(new Runnable[]{new QrActivity$$ExternalSyntheticLambda17(10, birthdayEffectFetcher, imageReceiverAsset)}));
                    imageReceiverAsset.setImage(ImageLocation.getForDocument(document), "80_80", null, null, tL_messages_stickerSet, 0);
                    imageReceiverAsset.onAttachedToWindow();
                    map3.put(num2, imageReceiverAsset);
                }
                int i11 = 0;
                while (true) {
                    ArrayList arrayList6 = (ArrayList) this.f$2;
                    if (i11 >= arrayList6.size()) {
                        birthdayEffectFetcher.setsLoaded[0] = true;
                        birthdayEffectFetcher.checkWhenLoaded();
                    } else {
                        Integer num3 = (Integer) arrayList6.get(i11);
                        num3.getClass();
                        birthdayEffectFetcher.digitAssets.add((ProfileBirthdayEffect.ImageReceiverAsset) map3.get(num3));
                        i11++;
                    }
                    break;
                }
                break;
            case 14:
                Runnable runnable2 = (Runnable) obj;
                int i12 = ((SelectAnimatedEmojiDialog) this.f$0).currentAccount;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                HashSet hashSet = new HashSet();
                String strTranslitSafe = AndroidUtilities.translitSafe((String) this.f$1);
                String strM2 = zzil.m(" ", strTranslitSafe);
                ArrayList arrayList7 = (ArrayList) this.f$2;
                if (stickerSets != null) {
                    for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i13);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet.contains(Long.valueOf(stickerSet2.id))) {
                            String strTranslitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title);
                            if (strTranslitSafe2.startsWith(strTranslitSafe) || strTranslitSafe2.contains(strM2)) {
                                arrayList7.add(new SelectAnimatedEmojiDialog.SetTitleDocument(strTranslitSafe2));
                                arrayList7.addAll(tL_messages_stickerSet2.documents);
                                hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                            }
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                if (featuredEmojiSets != null) {
                    while (i7 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered2 = featuredEmojiSets.get(i7);
                        if (stickerSetCovered2 != null && (stickerSet = stickerSetCovered2.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                            String strTranslitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered2.set.title);
                            if (strTranslitSafe3.startsWith(strTranslitSafe) || strTranslitSafe3.contains(strM2)) {
                                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet stickerSet4 = MediaDataController.getInstance(i12).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered2.set), Integer.valueOf(stickerSetCovered2.set.hash), true);
                                    arrayList2 = stickerSet4 != null ? stickerSet4.documents : null;
                                } else {
                                    arrayList2 = stickerSetCovered2 instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered2).documents : stickerSetCovered2.covers;
                                }
                                if (arrayList2 != null && arrayList2.size() != 0) {
                                    arrayList7.add(new SelectAnimatedEmojiDialog.SetTitleDocument(stickerSetCovered2.set.title));
                                    arrayList7.addAll(arrayList2);
                                    hashSet.add(Long.valueOf(stickerSetCovered2.set.id));
                                }
                            }
                        }
                        i7++;
                    }
                }
                runnable2.run();
                break;
            case 15:
                ArrayList arrayList8 = (ArrayList) obj;
                AnimatedEmojiDrawable.getDocumentFetcher(((SelectAnimatedEmojiDialog) this.f$0).currentAccount).putDocuments(arrayList8);
                int size2 = arrayList8.size();
                while (i7 < size2) {
                    Object obj3 = arrayList8.get(i7);
                    i7++;
                    ((LinkedHashSet) this.f$1).add(Long.valueOf(((TLRPC.Document) obj3).id));
                }
                ((Runnable) this.f$2).run();
                break;
            case 16:
                Browser.Progress progress = (Browser.Progress) obj;
                StarGiftSheet starGiftSheet = (StarGiftSheet) this.f$0;
                starGiftSheet.getClass();
                progress.init();
                starGiftSheet.doTransfer(((Long) this.f$1).longValue(), new ArticleViewer$$ExternalSyntheticLambda33(starGiftSheet, progress, (UserSelectorBottomSheet[]) this.f$2, 17));
                break;
            case 17:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                StarGiftSheet starGiftSheet2 = (StarGiftSheet) this.f$0;
                starGiftSheet2.getClass();
                ((Browser.Progress) this.f$1).end();
                ((UserSelectorBottomSheet[]) this.f$2)[0].lambda$showGiftOfferSheet$15();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda17(29, starGiftSheet2, tL_error));
                } else {
                    starGiftSheet2.lambda$showGiftOfferSheet$15();
                }
                break;
            case 18:
                PeerStoriesView.AnonymousClass5 anonymousClass6 = (PeerStoriesView.AnonymousClass5) this.f$0;
                anonymousClass6.getClass();
                ArrayList arrayList9 = new ArrayList(1);
                arrayList9.add((TLRPC.InputStickerSet) obj);
                EmojiPacksAlert emojiPacksAlert = new EmojiPacksAlert(((StoryViewer) this.f$1).fragment, anonymousClass6.getContext(), (DarkThemeResourceProvider) this.f$2, arrayList9);
                PeerStoriesView.Delegate delegate = ((PeerStoriesView) anonymousClass6.this$0).delegate;
                if (delegate != null) {
                    StoryViewer.this.showDialog(emojiPacksAlert);
                }
                break;
            case 19:
                Utilities.Callback callback = (Utilities.Callback) obj;
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
                anonymousClass8.getClass();
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f$1;
                if (!(storyItem instanceof StoriesController.BotPreview) || (botPreviewsList = ((StoriesController.BotPreview) storyItem).list) == null) {
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = anonymousClass8.this$0;
                    tL_stories_getStoriesByID.peer = MessagesController.getInstance(anonymousClass2.currentAccount).getInputPeer(storyItem.dialogId);
                    tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
                    ConnectionsManager.getInstance(anonymousClass2.currentAccount).sendRequest(tL_stories_getStoriesByID, new StarGiftSheet$$ExternalSyntheticLambda7(anonymousClass8, storyItem, callback, i5));
                } else {
                    TodoItemMenu$$ExternalSyntheticLambda8 todoItemMenu$$ExternalSyntheticLambda8 = new TodoItemMenu$$ExternalSyntheticLambda8(botPreviewsList, (TL_stories.StoryItem) this.f$2, callback, i6);
                    if (botPreviewsList.reqId != 0) {
                        ConnectionsManager.getInstance(botPreviewsList.currentAccount).cancelRequest(botPreviewsList.reqId, true);
                        botPreviewsList.reqId = 0;
                    }
                    botPreviewsList.loading = false;
                    botPreviewsList.loaded = false;
                    botPreviewsList.loadInternal(todoItemMenu$$ExternalSyntheticLambda8);
                }
                break;
            case 20:
                StoriesController.StoryAlbum storyAlbum = (StoriesController.StoryAlbum) obj;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass3 = ((PeerStoriesView.AnonymousClass8) this.f$0).this$0;
                StoriesController storiesController = anonymousClass3.storiesController;
                long j2 = anonymousClass3.dialogId;
                int i14 = storyAlbum.album_id;
                storiesController.getClass();
                ArrayList arrayList10 = new ArrayList(1);
                arrayList10.add((TL_stories.StoryItem) this.f$1);
                storiesController.addStoriesToAlbum(i14, j2, arrayList10);
                new BulletinFactory(anonymousClass3.storyContainer, (DarkThemeResourceProvider) this.f$2).createSimpleBulletinWithIconSize(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, storyAlbum.title))).show();
                break;
            case 21:
                TLRPC.User user2 = (TLRPC.User) obj;
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) this.f$0;
                botWebViewContainer.getClass();
                String str8 = (String) this.f$1;
                if (user2 == null) {
                    botWebViewContainer.notifyEvent("requested_chat_failed", BotWebViewContainer.obj(str8, "req_id"));
                } else {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(botWebViewContainer.botUser);
                    tL_messages_sendBotRequestedPeer.webapp_req_id = str8;
                    tL_messages_sendBotRequestedPeer.button_id = ((TL_keyboard.TL_buttonTypeRequestPeer) this.f$2).button_id;
                    tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInputPeer(user2));
                    ConnectionsManager.getInstance(botWebViewContainer.currentAccount).sendRequestTyped(tL_messages_sendBotRequestedPeer, new AiTonesController$$ExternalSyntheticLambda0(), new ChatActivity$$ExternalSyntheticLambda464(botWebViewContainer, str8, user2, 12));
                    botWebViewContainer.notifyEvent("requested_chat_sent", BotWebViewContainer.obj(str8, "req_id"));
                }
                break;
            default:
                BotWebViewContainer botWebViewContainer2 = (BotWebViewContainer) this.f$0;
                botWebViewContainer2.getClass();
                if (((Boolean) obj).booleanValue()) {
                    BotDownloads botDownloads = botWebViewContainer2.downloads;
                    ArrayList arrayList11 = botDownloads.files;
                    int size3 = arrayList11.size();
                    int i15 = 0;
                    while (true) {
                        str2 = (String) this.f$1;
                        if (i15 < size3) {
                            Object obj4 = arrayList11.get(i15);
                            i15++;
                            BotDownloads.FileDownload fileDownload2 = (BotDownloads.FileDownload) obj4;
                            if (TextUtils.equals(fileDownload2.url, str2) && fileDownload2.done) {
                                fileDownload = fileDownload2;
                            }
                        }
                    }
                    int i16 = botDownloads.currentAccount;
                    if (fileDownload != null) {
                        botDownloads.currentFile = fileDownload;
                        fileDownload.resaved = true;
                        NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
                    } else {
                        BotDownloads.FileDownload fileDownload3 = botDownloads.new FileDownload(str2, (String) this.f$2);
                        botDownloads.currentFile = fileDownload3;
                        fileDownload3.shown = false;
                        botDownloads.files.add(fileDownload3);
                        botDownloads.save();
                        NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
                    }
                    botWebViewContainer2.notifyEvent("file_download_requested", BotWebViewContainer.obj("downloading", "status"));
                } else {
                    botWebViewContainer2.notifyEvent("file_download_requested", BotWebViewContainer.obj("cancelled", "status"));
                }
                break;
        }
    }
}
