package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import com.google.android.gms.internal.mlkit_vision_common.zzlt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AlertsCreator$$ExternalSyntheticLambda18;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.EmojiView$$ExternalSyntheticLambda21;
import org.telegram.ui.Components.EmojiView$2$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.GroupVoipInviteAlert;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.JoinGroupAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.MediaActivity;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.SenderSelectPopup;
import org.telegram.ui.Components.SenderSelectView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda29;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SimpleAvatarView;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.TermsOfServiceView;
import org.telegram.ui.Components.TopicsTabsView;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class ChatUsersActivity$$ExternalSyntheticLambda13 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public ChatUsersActivity$$ExternalSyntheticLambda13(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    private final void run$org$telegram$ui$Components$StickersAlert$$ExternalSyntheticLambda28() {
        StickersAlert stickersAlert = (StickersAlert) this.f$0;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$2;
        stickersAlert.lambda$loadStickerSet$7((MediaDataController) this.f$3, (TLObject) this.f$1, tL_error);
    }

    private final void run$org$telegram$ui$Components$StickersAlert$$ExternalSyntheticLambda42() {
        ((PhotoViewer.AnonymousClass16.AnonymousClass2) this.f$0).lambda$new$2((TLRPC.TL_error) this.f$2, (TLObject) this.f$1, (TLRPC.TL_messages_getAttachedStickers) this.f$3);
    }

    private final void run$org$telegram$ui$Components$TermsOfServiceView$$ExternalSyntheticLambda7() {
        AlertDialog alertDialog = (AlertDialog) this.f$2;
        TermsOfServiceView termsOfServiceView = (TermsOfServiceView) this.f$0;
        termsOfServiceView.getClass();
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (((TLObject) this.f$1) instanceof TLRPC.TL_boolTrue) {
            MessagesController.getInstance(termsOfServiceView.currentAccount).performLogout(0);
            return;
        }
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$3;
        if (tL_error == null || tL_error.code != -1000) {
            String string = LocaleController.getString(R.string.ErrorOccurred);
            if (tL_error != null) {
                StringBuilder sbM = Log.m(string, "\n");
                sbM.append(tL_error.text);
                string = sbM.toString();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(termsOfServiceView.getContext(), 0, null);
            String string2 = LocaleController.getString(R.string.AppName);
            AlertDialog alertDialog2 = builder.alertDialog;
            alertDialog2.title = string2;
            alertDialog2.message = string;
            builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
            builder.show();
        }
    }

    private final void run$org$telegram$ui$Components$TopicsTabsView$$ExternalSyntheticLambda12() {
        TopicsTabsView topicsTabsView = (TopicsTabsView) this.f$0;
        topicsTabsView.getClass();
        ((ItemOptions) this.f$1).dismiss();
        TopicsController topicsController = ((MessagesController) this.f$2).getTopicsController();
        long j = -topicsTabsView.dialogId;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f$3;
        topicsController.pinTopic(j, tL_forumTopic.id, !tL_forumTopic.pinned, topicsTabsView.fragment);
    }

    private final void run$org$telegram$ui$Components$TranslateAlert2$$ExternalSyntheticLambda12() {
        ((TranslateAlert2) this.f$0).lambda$translate$4((TLRPC.TL_error) this.f$2, (TLObject) this.f$1, (TLRPC.TL_textWithEntities) this.f$3);
    }

    private final void run$org$telegram$ui$Gifts$ProfileGiftsContainer$Page$$ExternalSyntheticLambda18() {
        final ProfileGiftsContainer.Page page = (ProfileGiftsContainer.Page) this.f$0;
        page.getClass();
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.f$1;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            ((GiftSheet.GiftCell) this.f$2).setStarsGift(savedStarGift, true, false);
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = page.list.getInput(savedStarGift);
            savestargift.unsave = savedStarGift.unsaved;
            ConnectionsManager.getInstance(page.currentAccount).sendRequest(savestargift, null, 64);
        }
        boolean z = savedStarGift.pinned_to_top;
        final boolean z2 = !z;
        boolean z3 = page.list.togglePinned(savedStarGift, z2, false);
        final View view = (View) this.f$3;
        SharedMediaLayout.AnonymousClass13 anonymousClass13 = page.parent;
        if (z3) {
            new ProfileGiftsContainer.UnpinSheet(page.getContext(), anonymousClass13.dialogId, savedStarGift, page.resourcesProvider, new Utilities.Callback0Return() {
                @Override
                public final Object run() {
                    ProfileGiftsContainer.Page page2 = page;
                    page2.getClass();
                    ((GiftSheet.GiftCell) view).setPinned(z2, true);
                    page2.listView.scrollToPosition(0);
                    return BulletinFactory.of(page2.parent.fragment);
                }
            }).show();
            return;
        }
        if (z) {
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.Gift2Unpinned, BulletinFactory.of(anonymousClass13.fragment), R.raw.ic_unpin, 36);
        } else {
            BulletinFactory.of(anonymousClass13.fragment).createSimpleBulletin(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).show();
        }
        ((GiftSheet.GiftCell) view).setPinned(z2, true);
        page.listView.scrollToPosition(0);
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        String[] strArr;
        Object obj;
        long peerId;
        int i;
        ChatUsersActivity.SearchAdapter searchAdapter;
        ChatUsersActivity chatUsersActivity;
        String lowerCase;
        String publicUsername;
        String str;
        String str2;
        float f;
        SpringAnimation springAnimation;
        char c;
        float f2;
        SpringAnimation springAnimation2;
        BottomSheet bottomSheet;
        int i2 = 18;
        int i3 = 13;
        int i4 = 12;
        int i5 = 2;
        int i6 = -1;
        int i7 = 0;
        Object obj2 = this.f$3;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        int i8 = 1;
        switch (this.$r8$classId) {
            case 0:
                ChatUsersActivity chatUsersActivity2 = (ChatUsersActivity) obj5;
                chatUsersActivity2.getClass();
                TLObject tLObject = (TLObject) obj4;
                ChatUsersActivity$$ExternalSyntheticLambda11 chatUsersActivity$$ExternalSyntheticLambda11 = (ChatUsersActivity$$ExternalSyntheticLambda11) obj2;
                if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(chatUsersActivity2.getParentActivity(), 0, null);
                    String string = LocaleController.getString("AppName", R.string.AppName);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string;
                    alertDialog.message = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName((TLRPC.User) obj3));
                    builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), new ChatActivity$$ExternalSyntheticLambda356(chatUsersActivity$$ExternalSyntheticLambda11, 19));
                    builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                    chatUsersActivity2.showDialog(alertDialog);
                } else {
                    chatUsersActivity$$ExternalSyntheticLambda11.run(1);
                }
                break;
            case 1:
                ChatRightsEditActivity chatRightsEditActivity = (ChatRightsEditActivity) obj5;
                chatRightsEditActivity.getClass();
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) ((TLObject) obj4);
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                    twoStepVerificationActivity.currentPassword = password;
                    TwoStepVerificationActivity.initPasswordNewAlgo(password);
                    chatRightsEditActivity.initTransfer(twoStepVerificationActivity, twoStepVerificationActivity.getNewSrpPassword());
                }
                break;
            case 2:
                ChatUsersActivity.SearchAdapter searchAdapter2 = (ChatUsersActivity.SearchAdapter) obj5;
                searchAdapter2.getClass();
                String lowerCase2 = ((String) obj4).trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(searchAdapter2, new ArrayList(), new LongSparseArray(), new ArrayList(), new ArrayList(), 14));
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i9 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i9];
                    strArr2[0] = lowerCase2;
                    if (translitString != null) {
                        strArr2[1] = translitString;
                    }
                    String[] strArr3 = strArr2;
                    ArrayList arrayList2 = new ArrayList();
                    LongSparseArray longSparseArray = new LongSparseArray();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ChatUsersActivity chatUsersActivity3 = ChatUsersActivity.this;
                    ArrayList arrayList5 = (ArrayList) obj3;
                    if (arrayList5 != null) {
                        int i10 = 0;
                        for (int size = arrayList5.size(); i10 < size; size = i) {
                            TLObject tLObject2 = (TLObject) arrayList5.get(i10);
                            if (tLObject2 instanceof TLRPC.ChatParticipant) {
                                arrayList = arrayList5;
                                strArr = strArr3;
                                peerId = ((TLRPC.ChatParticipant) tLObject2).user_id;
                            } else {
                                arrayList = arrayList5;
                                strArr = strArr3;
                                if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                                    peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer);
                                } else {
                                    obj = obj2;
                                }
                                chatUsersActivity = chatUsersActivity3;
                                searchAdapter = searchAdapter2;
                                i = size;
                                i10++;
                                obj2 = obj;
                                strArr3 = strArr;
                                arrayList5 = arrayList;
                                chatUsersActivity3 = chatUsersActivity;
                                searchAdapter2 = searchAdapter;
                            }
                            if (peerId > 0) {
                                TLRPC.User user = chatUsersActivity3.getMessagesController().getUser(Long.valueOf(peerId));
                                obj = obj2;
                                if (user.id == chatUsersActivity3.getUserConfig().getClientUserId()) {
                                    chatUsersActivity = chatUsersActivity3;
                                    searchAdapter = searchAdapter2;
                                    i = size;
                                } else {
                                    String lowerCase3 = UserObject.getUserName(user).toLowerCase();
                                    publicUsername = UserObject.getPublicUsername(user);
                                    String str3 = user.first_name;
                                    ChatUsersActivity chatUsersActivity4 = chatUsersActivity3;
                                    str2 = user.last_name;
                                    str = str3;
                                    lowerCase = lowerCase3;
                                    chatUsersActivity = chatUsersActivity4;
                                }
                                i10++;
                                obj2 = obj;
                                strArr3 = strArr;
                                arrayList5 = arrayList;
                                chatUsersActivity3 = chatUsersActivity;
                                searchAdapter2 = searchAdapter;
                            } else {
                                obj = obj2;
                                TLRPC.Chat chat = chatUsersActivity3.getMessagesController().getChat(Long.valueOf(-peerId));
                                lowerCase = chat.title.toLowerCase();
                                publicUsername = ChatObject.getPublicUsername(chat);
                                str = chat.title;
                                chatUsersActivity = chatUsersActivity3;
                                str2 = null;
                            }
                            searchAdapter = searchAdapter2;
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                            if (lowerCase.equals(translitString2)) {
                                translitString2 = null;
                            }
                            i = size;
                            int i11 = 0;
                            char c2 = 0;
                            while (i11 < i9) {
                                int i12 = i11;
                                String str4 = strArr[i12];
                                char c3 = (lowerCase.startsWith(str4) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str4, lowerCase) || (translitString2 != null && (translitString2.startsWith(str4) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str4, translitString2)))) ? (char) 1 : (publicUsername == null || !publicUsername.startsWith(str4)) ? c2 : (char) 2;
                                if (c3 != 0) {
                                    if (c3 == 1) {
                                        arrayList3.add(AndroidUtilities.generateSearchName(str, str2, str4));
                                    } else {
                                        arrayList3.add(AndroidUtilities.generateSearchName(zzil.m("@", publicUsername), null, "@" + str4));
                                    }
                                    arrayList4.add(tLObject2);
                                    i10++;
                                    obj2 = obj;
                                    strArr3 = strArr;
                                    arrayList5 = arrayList;
                                    chatUsersActivity3 = chatUsersActivity;
                                    searchAdapter2 = searchAdapter;
                                } else {
                                    i11 = i12 + 1;
                                    c2 = c3;
                                    lowerCase = lowerCase;
                                    translitString2 = translitString2;
                                }
                            }
                            i10++;
                            obj2 = obj;
                            strArr3 = strArr;
                            arrayList5 = arrayList;
                            chatUsersActivity3 = chatUsersActivity;
                            searchAdapter2 = searchAdapter;
                        }
                    }
                    String[] strArr4 = strArr3;
                    ChatUsersActivity chatUsersActivity5 = chatUsersActivity3;
                    ChatUsersActivity.SearchAdapter searchAdapter3 = searchAdapter2;
                    ArrayList arrayList6 = (ArrayList) obj2;
                    if (arrayList6 != null) {
                        for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                            TLRPC.User user2 = chatUsersActivity5.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList6.get(i13)).user_id));
                            if (user2.id != chatUsersActivity5.getUserConfig().getClientUserId()) {
                                String lowerCase4 = UserObject.getUserName(user2).toLowerCase();
                                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase4);
                                if (lowerCase4.equals(translitString3)) {
                                    translitString3 = null;
                                }
                                char c4 = 0;
                                for (int i14 = 0; i14 < i9; i14++) {
                                    String str5 = strArr4[i14];
                                    if (lowerCase4.startsWith(str5) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str5, lowerCase4) || (translitString3 != null && (translitString3.startsWith(str5) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str5, translitString3)))) {
                                        c4 = 1;
                                    } else {
                                        String publicUsername2 = UserObject.getPublicUsername(user2);
                                        if (publicUsername2 != null && publicUsername2.startsWith(str5)) {
                                            c4 = 2;
                                        }
                                    }
                                    if (c4 != 0) {
                                        if (c4 == 1) {
                                            arrayList3.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str5));
                                        } else {
                                            arrayList3.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user2), null, "@" + str5));
                                        }
                                        arrayList2.add(user2);
                                        longSparseArray.put(user2, user2.id);
                                    }
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(searchAdapter3, arrayList2, longSparseArray, arrayList3, arrayList4, 14));
                }
                break;
            case 3:
                final AIEditorAlert aIEditorAlert = (AIEditorAlert) obj5;
                aIEditorAlert.getClass();
                final String str6 = "https://t.me/addstyle/" + ((TL_aicompose.TL_aiComposeTone) obj4).slug;
                final Context context = (Context) obj3;
                final Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) obj2;
                new ShareAlert(context, str6, str6, resourcesProvider) {
                    @Override
                    public final void onSend(LongSparseArray longSparseArray2, int i15, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                        if (z) {
                            AIEditorAlert aIEditorAlert2 = AIEditorAlert.this;
                            BulletinFactory bulletinFactory = new BulletinFactory(aIEditorAlert2.bulletinContainer, this.resourcesProvider);
                            if (longSparseArray2.size() == 1) {
                                long jKeyAt = longSparseArray2.keyAt(0);
                                if (jKeyAt == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                    Bulletin bulletinCreateSimpleBulletin = bulletinFactory.createSimpleBulletin(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AIEditorStyleSharedToSavedMessages, new Object[0])));
                                    bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
                                    bulletinCreateSimpleBulletin.show();
                                } else if (jKeyAt < 0) {
                                    Bulletin bulletinCreateSimpleBulletin2 = bulletinFactory.createSimpleBulletin(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AIEditorStyleSharedTo, tL_forumTopic != null ? tL_forumTopic.title : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-jKeyAt)).title)));
                                    bulletinCreateSimpleBulletin2.hideAfterBottomSheet = false;
                                    bulletinCreateSimpleBulletin2.show();
                                } else {
                                    Bulletin bulletinCreateSimpleBulletin3 = bulletinFactory.createSimpleBulletin(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AIEditorStyleSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(jKeyAt)).first_name)));
                                    bulletinCreateSimpleBulletin3.hideAfterBottomSheet = false;
                                    bulletinCreateSimpleBulletin3.show();
                                }
                            } else {
                                Bulletin bulletinCreateSimpleBulletinWithIconSize = bulletinFactory.createSimpleBulletinWithIconSize(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("AIEditorStyleSharedToManyChats", longSparseArray2.size(), Integer.valueOf(longSparseArray2.size()))));
                                bulletinCreateSimpleBulletinWithIconSize.hideAfterBottomSheet = false;
                                bulletinCreateSimpleBulletinWithIconSize.show();
                            }
                            try {
                                aIEditorAlert2.bulletinContainer.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }.show();
                break;
            case 4:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj5;
                String strTrim = editTextBoldCursor.getText().toString().trim();
                Uri uri = Uri.parse(strTrim);
                if (uri == null || uri.getHost() == null) {
                    uri = Uri.parse("https://" + strTrim);
                }
                if (uri == null || uri.getHost() == null) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                } else {
                    String lowerCase5 = uri.getHost().toLowerCase();
                    if (lowerCase5.startsWith("www.")) {
                        lowerCase5 = lowerCase5.substring(4);
                    }
                    ((ProfileActivity$6$$ExternalSyntheticLambda7) obj4).run(lowerCase5);
                    AlertDialog alertDialog2 = ((AlertDialog[]) obj3)[0];
                    if (alertDialog2 != null) {
                        alertDialog2.dismiss();
                    }
                    View view = (View) obj2;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                break;
            case 5:
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MessageScheduledRepeatOption));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i15 = 0;
                while (true) {
                    int[] iArr = (int[]) obj5;
                    if (i15 < iArr.length) {
                        if (((int[]) obj4)[0] == iArr[i15]) {
                            spannableStringBuilder.append((CharSequence) ((String[]) obj3)[i15]);
                            spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i15++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.arrows_select);
                    coloredImageSpan.spaceScaleX = 0.7f;
                    coloredImageSpan.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    coloredImageSpan.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(coloredImageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.mini_switch_lock);
                    coloredImageSpan2.spaceScaleX = 0.7f;
                    coloredImageSpan2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    coloredImageSpan2.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(coloredImageSpan2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                ((TextView) obj2).setText(spannableStringBuilder);
                break;
            case 6:
                final ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj5;
                if (chatActivityEnterView.senderSelectPopupWindow != null) {
                    final Dialog dialog = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
                    FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
                    final SimpleAvatarView simpleAvatarView = (SimpleAvatarView) obj4;
                    frameLayout.addView(simpleAvatarView, LayoutHelper.createFrame(40, 40, 3));
                    dialog.setContentView(frameLayout);
                    dialog.getWindow().setLayout(-1, -1);
                    dialog.getWindow().clearFlags(1024);
                    dialog.getWindow().clearFlags(67108864);
                    dialog.getWindow().clearFlags(134217728);
                    dialog.getWindow().addFlags(Integer.MIN_VALUE);
                    dialog.getWindow().addFlags(512);
                    dialog.getWindow().addFlags(131072);
                    dialog.getWindow().getAttributes().windowAnimations = 0;
                    dialog.getWindow().getDecorView().setSystemUiVisibility(1792);
                    dialog.getWindow().setStatusBarColor(0);
                    dialog.getWindow().setNavigationBarColor(0);
                    AndroidUtilities.setLightStatusBar(dialog, Theme.getColor(null, Theme.key_actionBarDefault, true) == -1);
                    int i16 = Build.VERSION.SDK_INT;
                    if (i16 >= 26) {
                        AndroidUtilities.setLightNavigationBar(dialog, AndroidUtilities.computePerceivedBrightness(Theme.getColor(null, Theme.key_windowBackgroundGray, true)) >= 0.721f);
                    }
                    if (i16 >= 23) {
                        chatActivityEnterView.popupX = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.popupX;
                    }
                    SenderSelectView senderSelectView = chatActivityEnterView.senderSelectView;
                    int[] iArr2 = chatActivityEnterView.location;
                    senderSelectView.getLocationInWindow(iArr2);
                    final float f3 = iArr2[0];
                    final float f4 = iArr2[1];
                    float fDp = AndroidUtilities.dp(5.0f);
                    int[] iArr3 = (int[]) obj3;
                    float fDp2 = iArr3[0] + chatActivityEnterView.popupX + fDp + AndroidUtilities.dp(4.0f) + 0.0f;
                    float f5 = iArr3[1] + chatActivityEnterView.popupY + fDp + 0.0f;
                    simpleAvatarView.setTranslationX(fDp2);
                    simpleAvatarView.setTranslationY(f5);
                    float scaleX = (chatActivityEnterView.senderSelectView.getLayoutParams().width * (chatActivityEnterView.isLiveComment ? chatActivityEnterView.senderSelectView.getScaleX() : 1.0f)) / AndroidUtilities.dp(40.0f);
                    simpleAvatarView.setPivotX(0.0f);
                    simpleAvatarView.setPivotY(0.0f);
                    simpleAvatarView.setScaleX(0.75f);
                    simpleAvatarView.setScaleY(0.75f);
                    final SenderSelectPopup.SenderView senderView = (SenderSelectPopup.SenderView) obj2;
                    simpleAvatarView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserver.OnDrawListener() {
                        @Override
                        public final void onDraw() {
                            SimpleAvatarView simpleAvatarView2 = simpleAvatarView;
                            simpleAvatarView2.post(new FilterGLThread$$ExternalSyntheticLambda1(this, simpleAvatarView2, senderView, 2));
                        }
                    });
                    dialog.show();
                    if (chatActivityEnterView.isLiveComment) {
                        f = 1.0f;
                    } else {
                        f = 1.0f;
                        chatActivityEnterView.senderSelectView.setScaleX(1.0f);
                        chatActivityEnterView.senderSelectView.setScaleY(1.0f);
                    }
                    chatActivityEnterView.senderSelectView.setAlpha(f);
                    ChatActivityEnterView.AnonymousClass37 anonymousClass37 = chatActivityEnterView.senderSelectPopupWindow;
                    boolean z = chatActivityEnterView.isLiveComment;
                    DynamicAnimation.AnonymousClass1 anonymousClass1 = DynamicAnimation.SCALE_X;
                    if (z) {
                        springAnimation = null;
                        f2 = 0.5f;
                        c = 2;
                    } else {
                        c = 2;
                        springAnimation = new SpringAnimation(chatActivityEnterView.senderSelectView, anonymousClass1);
                        f2 = 0.5f;
                        zzlt.m(0.5f, 750.0f, f, springAnimation);
                    }
                    boolean z2 = chatActivityEnterView.isLiveComment;
                    DynamicAnimation.AnonymousClass1 anonymousClass2 = DynamicAnimation.SCALE_Y;
                    if (z2) {
                        springAnimation2 = null;
                    } else {
                        springAnimation2 = new SpringAnimation(chatActivityEnterView.senderSelectView, anonymousClass2);
                        zzlt.m(f2, 750.0f, f, springAnimation2);
                    }
                    SpringAnimation springAnimation3 = new SpringAnimation(chatActivityEnterView.senderSelectView, DynamicAnimation.ALPHA);
                    zzlt.m(0.0f, 750.0f, f, springAnimation3);
                    final int i17 = 0;
                    springAnimation3.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                        @Override
                        public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z3, float f6, float f7) {
                            switch (i17) {
                                case 0:
                                    final ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                                    chatActivityEnterView2.getClass();
                                    final Dialog dialog2 = dialog;
                                    if (dialog2.isShowing()) {
                                        SimpleAvatarView simpleAvatarView2 = simpleAvatarView;
                                        simpleAvatarView2.setTranslationX(f3);
                                        simpleAvatarView2.setTranslationY(f4);
                                        SenderSelectView senderSelectView2 = chatActivityEnterView2.senderSelectView;
                                        senderSelectView2.getClass();
                                        senderSelectView2.setProgress(false, false, 0.0f);
                                        if (!chatActivityEnterView2.isLiveComment) {
                                            chatActivityEnterView2.senderSelectView.setScaleX(1.0f);
                                            chatActivityEnterView2.senderSelectView.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.senderSelectView.setAlpha(1.0f);
                                        final int i18 = 0;
                                        chatActivityEnterView2.senderSelectView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                                            @Override
                                            public final boolean onPreDraw() {
                                                switch (i18) {
                                                    case 0:
                                                        ChatActivityEnterView chatActivityEnterView3 = chatActivityEnterView2;
                                                        chatActivityEnterView3.senderSelectView.getViewTreeObserver().removeOnPreDrawListener(this);
                                                        chatActivityEnterView3.senderSelectView.postDelayed(new Bulletin$2$$ExternalSyntheticLambda1(dialog2, 9), 100L);
                                                        break;
                                                    default:
                                                        ChatActivityEnterView chatActivityEnterView4 = chatActivityEnterView2;
                                                        chatActivityEnterView4.senderSelectView.getViewTreeObserver().removeOnPreDrawListener(this);
                                                        chatActivityEnterView4.senderSelectView.postDelayed(new Bulletin$2$$ExternalSyntheticLambda1(dialog2, 9), 100L);
                                                        break;
                                                }
                                                return true;
                                            }
                                        });
                                    }
                                    break;
                                default:
                                    final ChatActivityEnterView chatActivityEnterView3 = chatActivityEnterView;
                                    chatActivityEnterView3.getClass();
                                    final Dialog dialog3 = dialog;
                                    if (dialog3.isShowing()) {
                                        SimpleAvatarView simpleAvatarView3 = simpleAvatarView;
                                        simpleAvatarView3.setTranslationX(f3);
                                        simpleAvatarView3.setTranslationY(f4);
                                        SenderSelectView senderSelectView3 = chatActivityEnterView3.senderSelectView;
                                        senderSelectView3.getClass();
                                        senderSelectView3.setProgress(false, false, 0.0f);
                                        if (!chatActivityEnterView3.isLiveComment) {
                                            chatActivityEnterView3.senderSelectView.setScaleX(1.0f);
                                            chatActivityEnterView3.senderSelectView.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView3.senderSelectView.setAlpha(1.0f);
                                        final int i19 = 1;
                                        chatActivityEnterView3.senderSelectView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                                            @Override
                                            public final boolean onPreDraw() {
                                                switch (i19) {
                                                    case 0:
                                                        ChatActivityEnterView chatActivityEnterView4 = chatActivityEnterView3;
                                                        chatActivityEnterView4.senderSelectView.getViewTreeObserver().removeOnPreDrawListener(this);
                                                        chatActivityEnterView4.senderSelectView.postDelayed(new Bulletin$2$$ExternalSyntheticLambda1(dialog3, 9), 100L);
                                                        break;
                                                    default:
                                                        ChatActivityEnterView chatActivityEnterView5 = chatActivityEnterView3;
                                                        chatActivityEnterView5.senderSelectView.getViewTreeObserver().removeOnPreDrawListener(this);
                                                        chatActivityEnterView5.senderSelectView.postDelayed(new Bulletin$2$$ExternalSyntheticLambda1(dialog3, 9), 100L);
                                                        break;
                                                }
                                                return true;
                                            }
                                        });
                                    }
                                    break;
                            }
                        }
                    });
                    SpringAnimation springAnimation4 = new SpringAnimation(simpleAvatarView, DynamicAnimation.TRANSLATION_X);
                    springAnimation4.mValue = MathUtils.clamp(fDp2, f3 - AndroidUtilities.dp(6.0f), fDp2);
                    springAnimation4.mStartValueIsSet = true;
                    zzlt.m(f3, 700.0f, 0.75f, springAnimation4);
                    springAnimation4.mMinValue = f3 - AndroidUtilities.dp(6.0f);
                    SpringAnimation springAnimation5 = new SpringAnimation(simpleAvatarView, DynamicAnimation.TRANSLATION_Y);
                    springAnimation5.mValue = MathUtils.clamp(f5, f5, AndroidUtilities.dp(6.0f) + f4);
                    springAnimation5.mStartValueIsSet = true;
                    zzlt.m(f4, 700.0f, 0.75f, springAnimation5);
                    springAnimation5.mMaxValue = AndroidUtilities.dp(6.0f) + f4;
                    springAnimation5.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                        public boolean performedHapticFeedback = false;

                        @Override
                        public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f6, float f7) {
                            if (this.performedHapticFeedback || f6 < f4) {
                                return;
                            }
                            this.performedHapticFeedback = true;
                            try {
                                simpleAvatarView.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                    });
                    final int i18 = 1;
                    springAnimation5.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                        @Override
                        public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z3, float f6, float f7) {
                            switch (i18) {
                                case 0:
                                    final ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                                    chatActivityEnterView2.getClass();
                                    final Dialog dialog2 = dialog;
                                    if (dialog2.isShowing()) {
                                        SimpleAvatarView simpleAvatarView2 = simpleAvatarView;
                                        simpleAvatarView2.setTranslationX(f3);
                                        simpleAvatarView2.setTranslationY(f4);
                                        SenderSelectView senderSelectView2 = chatActivityEnterView2.senderSelectView;
                                        senderSelectView2.getClass();
                                        senderSelectView2.setProgress(false, false, 0.0f);
                                        if (!chatActivityEnterView2.isLiveComment) {
                                            chatActivityEnterView2.senderSelectView.setScaleX(1.0f);
                                            chatActivityEnterView2.senderSelectView.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.senderSelectView.setAlpha(1.0f);
                                        final int i19 = 0;
                                        chatActivityEnterView2.senderSelectView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                                            @Override
                                            public final boolean onPreDraw() {
                                                switch (i19) {
                                                    case 0:
                                                        ChatActivityEnterView chatActivityEnterView4 = chatActivityEnterView2;
                                                        chatActivityEnterView4.senderSelectView.getViewTreeObserver().removeOnPreDrawListener(this);
                                                        chatActivityEnterView4.senderSelectView.postDelayed(new Bulletin$2$$ExternalSyntheticLambda1(dialog2, 9), 100L);
                                                        break;
                                                    default:
                                                        ChatActivityEnterView chatActivityEnterView5 = chatActivityEnterView2;
                                                        chatActivityEnterView5.senderSelectView.getViewTreeObserver().removeOnPreDrawListener(this);
                                                        chatActivityEnterView5.senderSelectView.postDelayed(new Bulletin$2$$ExternalSyntheticLambda1(dialog2, 9), 100L);
                                                        break;
                                                }
                                                return true;
                                            }
                                        });
                                    }
                                    break;
                                default:
                                    final ChatActivityEnterView chatActivityEnterView3 = chatActivityEnterView;
                                    chatActivityEnterView3.getClass();
                                    final Dialog dialog3 = dialog;
                                    if (dialog3.isShowing()) {
                                        SimpleAvatarView simpleAvatarView3 = simpleAvatarView;
                                        simpleAvatarView3.setTranslationX(f3);
                                        simpleAvatarView3.setTranslationY(f4);
                                        SenderSelectView senderSelectView3 = chatActivityEnterView3.senderSelectView;
                                        senderSelectView3.getClass();
                                        senderSelectView3.setProgress(false, false, 0.0f);
                                        if (!chatActivityEnterView3.isLiveComment) {
                                            chatActivityEnterView3.senderSelectView.setScaleX(1.0f);
                                            chatActivityEnterView3.senderSelectView.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView3.senderSelectView.setAlpha(1.0f);
                                        final int i110 = 1;
                                        chatActivityEnterView3.senderSelectView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                                            @Override
                                            public final boolean onPreDraw() {
                                                switch (i110) {
                                                    case 0:
                                                        ChatActivityEnterView chatActivityEnterView4 = chatActivityEnterView3;
                                                        chatActivityEnterView4.senderSelectView.getViewTreeObserver().removeOnPreDrawListener(this);
                                                        chatActivityEnterView4.senderSelectView.postDelayed(new Bulletin$2$$ExternalSyntheticLambda1(dialog3, 9), 100L);
                                                        break;
                                                    default:
                                                        ChatActivityEnterView chatActivityEnterView5 = chatActivityEnterView3;
                                                        chatActivityEnterView5.senderSelectView.getViewTreeObserver().removeOnPreDrawListener(this);
                                                        chatActivityEnterView5.senderSelectView.postDelayed(new Bulletin$2$$ExternalSyntheticLambda1(dialog3, 9), 100L);
                                                        break;
                                                }
                                                return true;
                                            }
                                        });
                                    }
                                    break;
                            }
                        }
                    });
                    SpringAnimation springAnimation6 = new SpringAnimation(simpleAvatarView, anonymousClass1);
                    zzlt.m(scaleX, 1000.0f, 1.0f, springAnimation6);
                    SpringAnimation springAnimation7 = new SpringAnimation(simpleAvatarView, anonymousClass2);
                    zzlt.m(scaleX, 1000.0f, 1.0f, springAnimation7);
                    SpringAnimation[] springAnimationArr = new SpringAnimation[7];
                    springAnimationArr[0] = springAnimation;
                    springAnimationArr[1] = springAnimation2;
                    springAnimationArr[c] = springAnimation3;
                    springAnimationArr[3] = springAnimation4;
                    springAnimationArr[4] = springAnimation5;
                    springAnimationArr[5] = springAnimation6;
                    springAnimationArr[6] = springAnimation7;
                    anonymousClass37.startDismissAnimation(springAnimationArr);
                    break;
                }
                break;
            case 7:
                ChatAttachAlertPollLayout chatAttachAlertPollLayout = (ChatAttachAlertPollLayout) obj5;
                long j = chatAttachAlertPollLayout.pollLimitDeadline;
                final RateCallLayout$$ExternalSyntheticLambda1 rateCallLayout$$ExternalSyntheticLambda1 = new RateCallLayout$$ExternalSyntheticLambda1(i5, chatAttachAlertPollLayout, (View) obj3);
                ChatActivity$$ExternalSyntheticLambda470 chatActivity$$ExternalSyntheticLambda470 = new ChatActivity$$ExternalSyntheticLambda470(i2);
                Theme.ResourcesProvider resourcesProvider2 = (Theme.ResourcesProvider) obj2;
                int colorOrDefault = resourcesProvider2 != null ? resourcesProvider2.getColorOrDefault(Theme.key_dialogTextBlack) : Theme.getColor(null, Theme.key_dialogTextBlack, false);
                int colorOrDefault2 = resourcesProvider2 != null ? resourcesProvider2.getColorOrDefault(Theme.key_dialogBackground) : Theme.getColor(null, Theme.key_dialogBackground, false);
                if (resourcesProvider2 != null) {
                    resourcesProvider2.getColorOrDefault(Theme.key_sheet_other);
                } else {
                    Theme.getColor(null, Theme.key_sheet_other, false);
                }
                if (resourcesProvider2 != null) {
                    resourcesProvider2.getColorOrDefault(Theme.key_player_actionBarSelector);
                } else {
                    Theme.getColor(null, Theme.key_player_actionBarSelector, false);
                }
                if (resourcesProvider2 != null) {
                    resourcesProvider2.getColorOrDefault(Theme.key_actionBarDefaultSubmenuItem);
                } else {
                    Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false);
                }
                if (resourcesProvider2 != null) {
                    resourcesProvider2.getColorOrDefault(Theme.key_actionBarDefaultSubmenuBackground);
                } else {
                    Theme.getColor(null, Theme.key_actionBarDefaultSubmenuBackground, false);
                }
                if (resourcesProvider2 != null) {
                    resourcesProvider2.getColorOrDefault(Theme.key_listSelector);
                } else {
                    Theme.getColor(null, Theme.key_listSelector, false);
                }
                int colorOrDefault3 = resourcesProvider2 != null ? resourcesProvider2.getColorOrDefault(Theme.key_featuredStickers_buttonText) : Theme.getColor(null, Theme.key_featuredStickers_buttonText, false);
                int colorOrDefault4 = resourcesProvider2 != null ? resourcesProvider2.getColorOrDefault(Theme.key_featuredStickers_addButton) : Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
                if (resourcesProvider2 != null) {
                    resourcesProvider2.getColorOrDefault(Theme.key_featuredStickers_addButtonPressed);
                } else {
                    Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
                }
                Pattern pattern = AlertsCreator.URL_PATTERN;
                Context context2 = (Context) obj4;
                if (context2 != null) {
                    final int i19 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
                    final BottomSheet.Builder builder2 = new BottomSheet.Builder(context2, resourcesProvider2);
                    BottomSheet bottomSheet2 = builder2.bottomSheet;
                    bottomSheet2.applyBottomPadding = false;
                    final NumberPicker numberPicker = new NumberPicker(context2, 18, resourcesProvider2);
                    numberPicker.setTextColor(colorOrDefault);
                    numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
                    numberPicker.setItemCount(5);
                    final AlertsCreator.AnonymousClass37 anonymousClass38 = new AlertsCreator.AnonymousClass37(context2, 18, resourcesProvider2);
                    anonymousClass38.setWrapSelectorWheel(true);
                    anonymousClass38.setAllItemsCount(24);
                    anonymousClass38.setItemCount(5);
                    anonymousClass38.setTextColor(colorOrDefault);
                    anonymousClass38.setTextOffset(-AndroidUtilities.dp(10.0f));
                    final AlertsCreator.AnonymousClass38 anonymousClass39 = new AlertsCreator.AnonymousClass38(context2, 18, resourcesProvider2);
                    anonymousClass39.setWrapSelectorWheel(true);
                    anonymousClass39.setAllItemsCount(60);
                    anonymousClass39.setItemCount(5);
                    anonymousClass39.setTextColor(colorOrDefault);
                    anonymousClass39.setTextOffset(-AndroidUtilities.dp(34.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context2);
                    AlertsCreator.AnonymousClass27 anonymousClass27 = new AlertsCreator.AnonymousClass27(context2, numberPicker, anonymousClass38, anonymousClass39, 2);
                    anonymousClass27.setOrientation(1);
                    frameLayout2.addView(anonymousClass27, LayoutHelper.createFrame(-1.0f, -1));
                    frameLayout2.addView(new FrameLayout(context2), LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout3 = new FrameLayout(context2);
                    anonymousClass27.addView(frameLayout3, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView = new TextView(context2);
                    textView.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
                    FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(20.0f, colorOrDefault, 1, textView);
                    frameLayout3.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(9));
                    LinearLayout linearLayout = new LinearLayout(context2);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    anonymousClass27.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView2 = new TextView(context2);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, resourcesProvider2));
                    textView2.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    AlertsCreator.AnonymousClass40 anonymousClass40 = new AlertsCreator.AnonymousClass40(context2);
                    anonymousClass40.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    ScaleStateListAnimator.apply(anonymousClass40, 0.02f, 1.2f);
                    linearLayout.addView(numberPicker, LayoutHelper.createLinear(0.5f, 0, 270));
                    numberPicker.setMinValue(0);
                    numberPicker.setMaxValue(365);
                    numberPicker.setWrapSelectorWheel(false);
                    numberPicker.setFormatter(new EmojiView$$ExternalSyntheticLambda21(6));
                    PassportActivity$$ExternalSyntheticLambda66 passportActivity$$ExternalSyntheticLambda66 = new PassportActivity$$ExternalSyntheticLambda66(i19, numberPicker, anonymousClass38, anonymousClass39, textView2);
                    numberPicker.setOnValueChangedListener(passportActivity$$ExternalSyntheticLambda66);
                    anonymousClass38.setMinValue(0);
                    anonymousClass38.setMaxValue(23);
                    int i20 = colorOrDefault2;
                    linearLayout.addView(anonymousClass38, LayoutHelper.createLinear(0.2f, 0, 270));
                    anonymousClass38.setFormatter(new EmojiView$$ExternalSyntheticLambda21(7));
                    anonymousClass38.setOnValueChangedListener(passportActivity$$ExternalSyntheticLambda66);
                    anonymousClass39.setMinValue(0);
                    anonymousClass39.setMaxValue(59);
                    anonymousClass39.setValue(0);
                    anonymousClass39.setFormatter(new EmojiView$$ExternalSyntheticLambda21(8));
                    linearLayout.addView(anonymousClass39, LayoutHelper.createLinear(0.3f, 0, 270));
                    anonymousClass39.setOnValueChangedListener(passportActivity$$ExternalSyntheticLambda66);
                    if (j <= 0 || j == 2147483646) {
                        bottomSheet = bottomSheet2;
                    } else {
                        long j2 = 1000 * j;
                        bottomSheet = bottomSheet2;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        int timeInMillis = (int) ((j2 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j2);
                        if (timeInMillis >= 0) {
                            anonymousClass39.setValue(calendar.get(12));
                            anonymousClass38.setValue(calendar.get(11));
                            numberPicker.setValue(timeInMillis);
                        }
                    }
                    final boolean[] zArr = {true};
                    AlertsCreator.checkScheduleDate(null, null, 0L, i19, 3, numberPicker, anonymousClass38, anonymousClass39);
                    AlertsCreator.checkPollCloseCustomDeadline(textView2, numberPicker, anonymousClass38, anonymousClass39);
                    anonymousClass40.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    anonymousClass40.setGravity(17);
                    anonymousClass40.setTextColor(colorOrDefault3);
                    anonymousClass40.setTextSize(1, 14.0f);
                    anonymousClass40.setTypeface(AndroidUtilities.bold());
                    anonymousClass40.setBackground(Theme.AdaptiveRipple.createRect(new float[]{24.0f}, colorOrDefault4, Theme.AdaptiveRipple.calcRippleColor(colorOrDefault4)));
                    anonymousClass27.addView(anonymousClass40, LayoutHelper.createLinear(-1, 48, 83, 14, 15, 14, 16));
                    anonymousClass40.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            zArr[0] = false;
                            long j3 = i19;
                            NumberPicker numberPicker2 = numberPicker;
                            AlertsCreator.AnonymousClass37 anonymousClass310 = anonymousClass38;
                            AlertsCreator.AnonymousClass38 anonymousClass311 = anonymousClass39;
                            boolean zCheckScheduleDate = AlertsCreator.checkScheduleDate(null, null, 0L, j3, 3, numberPicker2, anonymousClass310, anonymousClass311);
                            AlertsCreator.checkPollCloseCustomDeadline(textView2, numberPicker2, anonymousClass310, anonymousClass311);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(jCurrentTimeMillis);
                            calendar2.add(6, numberPicker2.getValue());
                            calendar2.set(11, anonymousClass310.getValue());
                            calendar2.set(12, anonymousClass311.getValue());
                            if (zCheckScheduleDate) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            rateCallLayout$$ExternalSyntheticLambda1.didSelectDate((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            builder2.bottomSheet.dismissRunnable.run();
                        }
                    });
                    anonymousClass27.addView(textView2, LayoutHelper.createLinear(-1, -2, 83, 14, 0, 14, 16));
                    bottomSheet.customView = frameLayout2;
                    bottomSheet.show();
                    bottomSheet.setOnDismissListener(new AlertsCreator$$ExternalSyntheticLambda18(1, chatActivity$$ExternalSyntheticLambda470, zArr));
                    bottomSheet.setBackgroundColor(i20);
                    bottomSheet.fixNavigationBar(i20);
                    break;
                }
                break;
            case 8:
                AlertDialog[] alertDialogArr = (AlertDialog[]) obj3;
                EmojiView.EmojiSearchAdapter.AnonymousClass4.AnonymousClass1 anonymousClass3 = (EmojiView.EmojiSearchAdapter.AnonymousClass4.AnonymousClass1) obj5;
                anonymousClass3.getClass();
                try {
                    alertDialogArr[0].dismiss();
                    break;
                } catch (Throwable unused) {
                }
                alertDialogArr[0] = null;
                TLObject tLObject3 = (TLObject) obj4;
                if (tLObject3 instanceof TLRPC.TL_emojiURL) {
                    Browser.openUrl(EmojiView.this.getContext(), ((TLRPC.TL_emojiURL) tLObject3).url);
                    ((BottomSheet.Builder) obj2).bottomSheet.dismissRunnable.run();
                }
                break;
            case 9:
                EmojiView.StickersSearchGridAdapter.AnonymousClass1 anonymousClass4 = (EmojiView.StickersSearchGridAdapter.AnonymousClass1) obj5;
                EmojiView.StickersSearchGridAdapter stickersSearchGridAdapter = EmojiView.StickersSearchGridAdapter.this;
                if (stickersSearchGridAdapter.emojiSearchId == anonymousClass4.lastId) {
                    stickersSearchGridAdapter.reqId2 = 0;
                    Runnable runnable = (Runnable) obj2;
                    if (((TLRPC.TL_messages_getStickers) obj3).emoticon.equals(anonymousClass4.query)) {
                        TLObject tLObject4 = (TLObject) obj4;
                        if (!(tLObject4 instanceof TLRPC.TL_messages_stickers)) {
                            runnable.run();
                        } else {
                            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject4;
                            ArrayList arrayList7 = anonymousClass4.emojiStickersArray2;
                            int size2 = arrayList7.size();
                            int size3 = tL_messages_stickers.stickers.size();
                            while (i7 < size3) {
                                TLRPC.Document document = tL_messages_stickers.stickers.get(i7);
                                if (anonymousClass4.emojiStickersMap.indexOfKey(document.id) < 0) {
                                    arrayList7.add(document);
                                }
                                i7++;
                            }
                            if (size2 != arrayList7.size()) {
                                anonymousClass4.emojiStickers.put(arrayList7, stickersSearchGridAdapter.searchQuery);
                                if (size2 == 0) {
                                    anonymousClass4.emojiArrays.add(arrayList7);
                                }
                            }
                        }
                    }
                    runnable.run();
                    break;
                }
                break;
            case 10:
                FolderBottomSheet folderBottomSheet = (FolderBottomSheet) obj5;
                folderBottomSheet.reqId = -1;
                BaseFragment baseFragment = folderBottomSheet.baseFragment;
                FilterCreateActivity.processErrors((TLRPC.TL_error) obj3, baseFragment, BulletinFactory.of(baseFragment));
                TLObject tLObject5 = (TLObject) obj4;
                if (tLObject5 != null) {
                    if (tLObject5 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject5;
                        ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                        if (arrayList8.isEmpty()) {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i6 = ((TL_update.TL_updateDialogFilter) update).id;
                            }
                        } else {
                            while (i7 < arrayList8.size()) {
                                if (arrayList8.get(i7) instanceof TL_update.TL_updateDialogFilter) {
                                    i6 = ((TL_update.TL_updateDialogFilter) arrayList8.get(i7)).id;
                                } else {
                                    i7++;
                                }
                            }
                        }
                    }
                    Utilities.Callback callback = (Utilities.Callback) obj2;
                    if (folderBottomSheet.invite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        baseFragment.getMessagesController().loadRemoteFilters(true, new CacheControlActivity$$ExternalSyntheticLambda23(folderBottomSheet, callback, i6, i8));
                    } else {
                        if (folderBottomSheet.updates != null) {
                            baseFragment.getMessagesController().checkChatlistFolderUpdate(folderBottomSheet.filterId, true);
                        }
                        folderBottomSheet.success = true;
                        folderBottomSheet.lambda$showGiftOfferSheet$15();
                        callback.run(Integer.valueOf(i6));
                    }
                } else {
                    folderBottomSheet.button.setLoading(false);
                }
                break;
            case 11:
                ((DialogsActivity) obj5).scrollToFolder(((Integer) obj4).intValue());
                AndroidUtilities.runOnUIThread(new EmojiView$2$$ExternalSyntheticLambda1(29, (OAuthSheet$$ExternalSyntheticLambda13) obj3, (BaseFragment) obj2), 200L);
                break;
            case 12:
                ((GroupVoipInviteAlert) obj5).lambda$loadChatParticipants$3((TLRPC.TL_error) obj3, (TLObject) obj4, (TLRPC.TL_channels_getParticipants) obj2);
                break;
            case 13:
                ((JoinGroupAlert) obj5).lambda$new$10((TLRPC.TL_error) obj4, (TLRPC.Updates) obj3, (TLRPC.TL_messages_importChatInvite) obj2);
                break;
            case 14:
                LinkActionView linkActionView = (LinkActionView) obj5;
                linkActionView.loadingImporters = false;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                linkActionView.loadedInviteLink = tL_chatInviteExported.link;
                if (((TLRPC.TL_error) obj2) == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) ((TLObject) obj4);
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    while (i7 < tL_messages_chatInviteImporters.users.size()) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                        i7++;
                    }
                    linkActionView.setUsers(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                }
                break;
            case 15:
                MediaActivity mediaActivity = (MediaActivity) obj5;
                ((boolean[]) obj4)[0] = true;
                AndroidUtilities.cancelRunOnUIThread(mediaActivity.applyBulletin);
                int i21 = 0;
                while (true) {
                    ArrayList arrayList9 = (ArrayList) obj3;
                    if (i21 >= arrayList9.size()) {
                        mediaActivity.getMessagesController().getStoriesController().updateStoriesInLists(mediaActivity.dialogId, arrayList9, false);
                    } else {
                        ((TL_stories.StoryItem) arrayList9.get(i21)).pinned = ((boolean[]) obj2)[i21];
                        i21++;
                    }
                    break;
                }
                break;
            case 16:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                if (tL_error != null) {
                    BulletinFactory.global().showForError(false, tL_error);
                } else {
                    ((ButtonWithCounterView) obj4).setLoading(false);
                    ((BottomSheet) obj3).lambda$showGiftOfferSheet$15();
                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.PremiumLastSeenSet, BulletinFactory.global(), R.raw.chats_infotip, 36);
                    Runnable runnable2 = (Runnable) obj2;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
                break;
            case 17:
                StickerMakerView stickerMakerView = (StickerMakerView) obj5;
                stickerMakerView.empty = true;
                stickerMakerView.objects = (StickerMakerView.SegmentedObject[]) ((ArrayList) obj4).toArray(new StickerMakerView.SegmentedObject[0]);
                ((PhotoViewer$$ExternalSyntheticLambda26) obj3).run((StickerMakerView.SegmentedObject) obj2);
                break;
            case 18:
                StickerMakerView stickerMakerView2 = (StickerMakerView) obj5;
                stickerMakerView2.getClass();
                TLObject tLObject6 = (TLObject) obj4;
                if (tLObject6 instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject6;
                    StickerMakerView.StickerUploader stickerUploader = (StickerMakerView.StickerUploader) obj3;
                    stickerUploader.tlInputStickerSetItem = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, stickerUploader.emoji);
                    stickerUploader.mediaDocument = tL_messageMediaDocument;
                    stickerMakerView2.afterUploadingMedia();
                } else {
                    stickerMakerView2.hideLoadingDialog();
                    stickerMakerView2.showError((TLRPC.TL_error) obj2);
                }
                break;
            case 19:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                if (tL_error2 != null) {
                    ((Utilities.Callback) obj3).run(tL_error2);
                } else {
                    TLObject tLObject7 = (TLObject) obj4;
                    if (tLObject7 instanceof TLRPC.payments_GiveawayInfo) {
                        ((Utilities.Callback) obj2).run((TLRPC.payments_GiveawayInfo) tLObject7);
                    }
                }
                break;
            case 20:
                DialogsActivity dialogsActivity = (DialogsActivity) obj4;
                dialogsActivity.showDialog(new SearchAdsInfoBottomSheet((Activity) obj3, dialogsActivity.getResourceProvider(), new ShareAlert$$ExternalSyntheticLambda29(i3, (SearchViewPager.AnonymousClass1) obj5, dialogsActivity)));
                ((ItemOptions) obj2).dismiss();
                break;
            case 21:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj3;
                byte[] bArr = tL_sponsoredPeer.random_id;
                DialogsActivity dialogsActivity2 = (DialogsActivity) obj4;
                Theme.ResourcesProvider resourceProvider = dialogsActivity2.getResourceProvider();
                ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda29 = new ShareAlert$$ExternalSyntheticLambda29(i4, (SearchViewPager.AnonymousClass1) obj5, tL_sponsoredPeer);
                int i22 = ReportBottomSheet.$r8$clinit;
                int currentAccount = dialogsActivity2.getCurrentAccount();
                Activity parentActivity = dialogsActivity2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new ArticleViewer$$ExternalSyntheticLambda61(parentActivity, resourceProvider, bArr, dialogsActivity2, shareAlert$$ExternalSyntheticLambda29, currentAccount));
                }
                ((ItemOptions) obj2).dismiss();
                break;
            case 22:
                ((ShareAlert) obj5).lambda$selectDialog$21((AtomicReference) obj4, (ShareAlert.AnonymousClass27) obj3, (TLRPC.Dialog) obj2);
                break;
            case 23:
                run$org$telegram$ui$Components$StickersAlert$$ExternalSyntheticLambda28();
                break;
            case 24:
                run$org$telegram$ui$Components$StickersAlert$$ExternalSyntheticLambda42();
                break;
            case 25:
                run$org$telegram$ui$Components$TermsOfServiceView$$ExternalSyntheticLambda7();
                break;
            case 26:
                run$org$telegram$ui$Components$TopicsTabsView$$ExternalSyntheticLambda12();
                break;
            case 27:
                run$org$telegram$ui$Components$TranslateAlert2$$ExternalSyntheticLambda12();
                break;
            case 28:
                run$org$telegram$ui$Gifts$ProfileGiftsContainer$Page$$ExternalSyntheticLambda18();
                break;
            default:
                GroupCallActivity groupCallActivity = (GroupCallActivity) obj5;
                groupCallActivity.getClass();
                ChatObject.Call call = new ChatObject.Call();
                groupCallActivity.call = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = groupCallActivity.call;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj4;
                call2.chatId = chat2 == null ? 0L : chat2.id;
                groupCall.schedule_date = groupCallActivity.scheduleStartAt;
                groupCall.flags |= 128;
                AccountInstance accountInstance = groupCallActivity.accountInstance;
                call2.currentAccount = accountInstance;
                call2.setSelfPeer((TLRPC.InputPeer) obj3);
                ChatObject.Call call3 = groupCallActivity.call;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = ((TL_update.TL_updateGroupCall) obj2).call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.id = groupCall3.id;
                call3.createNoVideoParticipant();
                ChatObject.Call call4 = groupCallActivity.call;
                groupCallActivity.fullscreenAdapter.groupCall = call4;
                groupCallActivity.renderersContainer.setGroupCall(call4);
                groupCallActivity.tabletGridAdapter.groupCall = groupCallActivity.call;
                groupCallActivity.groupCallMessagesListView.setGroupCall(accountInstance.getCurrentAccount(), groupCallActivity.call.getInputGroupCall(false));
                MessagesController messagesController = accountInstance.getMessagesController();
                ChatObject.Call call5 = groupCallActivity.call;
                messagesController.putGroupCall(call5.chatId, call5);
                break;
        }
    }

    public ChatUsersActivity$$ExternalSyntheticLambda13(Object obj, Object obj2, TLObject tLObject, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = tLObject;
        this.f$3 = obj3;
    }

    public ChatUsersActivity$$ExternalSyntheticLambda13(LinkActionView linkActionView, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.$r8$classId = 14;
        this.f$0 = linkActionView;
        this.f$2 = tL_chatInviteExported;
        this.f$3 = tL_error;
        this.f$1 = tLObject;
    }
}
