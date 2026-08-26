package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Business.AwayMessagesActivity;
import org.telegram.ui.Business.BusinessIntroActivity;
import org.telegram.ui.Business.BusinessRecipientsHelper;
import org.telegram.ui.Business.ChatbotSheet;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Business.GreetMessagesActivity;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Business.OpeningHoursDayActivity;
import org.telegram.ui.Business.TimezoneSelector;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.SharedAudioCell;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.AIEditorAlert$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.AdminLogFilterAlert2;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertAudioLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CreateRtmpStreamBottomSheet;
import org.telegram.ui.Components.DialogsBotsAdapter;
import org.telegram.ui.Components.DialogsChannelsAdapter;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.FilterGLThread$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.TranslateAlert3;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.web.WebActionBar$$ExternalSyntheticLambda9;

public final class CallLogActivity$$ExternalSyntheticLambda3 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;

    public CallLogActivity$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    private final void run$org$telegram$ui$ChatUsersActivity$$ExternalSyntheticLambda30(Object obj, Object obj2) {
        ChatUsersActivity chatUsersActivity = (ChatUsersActivity) this.f$0;
        chatUsersActivity.getClass();
        AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda0(chatUsersActivity, 1), 1000L);
    }

    private final void run$org$telegram$ui$ChooseSpeedLayout$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        float fFloatValue = (((Float) obj).floatValue() * 2.3f) + 0.2f;
        ((PhotoViewer.AnonymousClass14) this.f$0).onSpeedSelected(((Boolean) obj2).booleanValue(), false, fFloatValue);
    }

    private final void run$org$telegram$ui$Components$AIEditorAlert$$ExternalSyntheticLambda18(Object obj, Object obj2) {
        UItem uItemOf;
        TL_iv.RichMessage richMessage;
        UItem uItemOf2;
        TL_iv.RichMessage richMessage2;
        UItem uItemOf3;
        String strSubstring;
        String strSubstring2;
        UItem uItemOf4;
        TL_iv.RichMessage richMessage3;
        String strSubstring3;
        String str;
        ArrayList arrayList = (ArrayList) obj;
        UniversalAdapter universalAdapter = (UniversalAdapter) obj2;
        AIEditorAlert aIEditorAlert = (AIEditorAlert) this.f$0;
        aIEditorAlert.getClass();
        UItem uItem = new UItem(7);
        uItem.text = null;
        arrayList.add(uItem);
        arrayList.add(UItem.asCustomShadow(aIEditorAlert.tabsContainer));
        UItem uItem2 = new UItem(7);
        uItem2.text = null;
        arrayList.add(uItem2);
        universalAdapter.itemsOffset = 1;
        universalAdapter.whiteSectionStart();
        AIEditorAlert.Tabs tabs = aIEditorAlert.tabs;
        int selectedTab = tabs != null ? tabs.getSelectedTab() : 0;
        if (selectedTab == 0) {
            String str2 = aIEditorAlert.from_lang;
            if (str2 == null || str2.equalsIgnoreCase("und")) {
                arrayList.add(TranslateAlert3.Header.Factory.of(3, LocaleController.getString(R.string.AIEditorOriginalText), null, null, null, false, null, null));
            } else {
                String str3 = aIEditorAlert.from_lang;
                boolean[] zArr = aIEditorAlert.genitive;
                String strLanguageName = TranslateAlert2.languageName(str3, null, zArr);
                String string = LocaleController.getString((zArr == null || !zArr[0]) ? R.string.AIEditorFromOther : R.string.AIEditorFrom);
                int iIndexOf = string.indexOf("%s");
                if (iIndexOf < 0) {
                    str = "";
                    strSubstring3 = str;
                } else {
                    String strSubstring4 = string.substring(0, iIndexOf);
                    strSubstring3 = string.substring(iIndexOf + 2);
                    str = strSubstring4;
                }
                if (TextUtils.isEmpty(str)) {
                    strLanguageName = TranslateAlert2.capitalFirst(strLanguageName);
                }
                arrayList.add(TranslateAlert3.Header.Factory.of(3, str, strLanguageName, strSubstring3, null, false, null, null));
            }
            arrayList.add(aIEditorAlert.isRich() ? aIEditorAlert.previewItem(4, aIEditorAlert.textRich, false) : TranslateAlert3.Text.Factory.of(4, aIEditorAlert.text, aIEditorAlert.collapsed, new AIEditorAlert$$ExternalSyntheticLambda0(aIEditorAlert, 3), null, null));
            String str4 = aIEditorAlert.to_lang;
            boolean[] zArr2 = aIEditorAlert.accusative;
            String strLanguageName2 = TranslateAlert2.languageName(str4, zArr2, null);
            String string2 = LocaleController.getString((zArr2 == null || !zArr2[0]) ? R.string.AIEditorToOther : R.string.AIEditorTo);
            int iIndexOf2 = string2.indexOf("%s");
            if (iIndexOf2 < 0) {
                strSubstring = "";
                strSubstring2 = strSubstring;
            } else {
                strSubstring = string2.substring(0, iIndexOf2);
                strSubstring2 = string2.substring(iIndexOf2 + 2);
            }
            if (TextUtils.isEmpty(strSubstring)) {
                strLanguageName2 = TranslateAlert2.capitalFirst(strLanguageName2);
            }
            arrayList.add(TranslateAlert3.Header.Factory.of(5, strSubstring, zzhr.m(strLanguageName2, ""), strSubstring2, new AIEditorAlert$$ExternalSyntheticLambda0(aIEditorAlert, 4), aIEditorAlert.emojify, new AIEditorAlert$$ExternalSyntheticLambda0(aIEditorAlert, 5), null));
            if (aIEditorAlert.isRich()) {
                boolean z = aIEditorAlert.translatedTextLoading;
                if (z || (richMessage3 = aIEditorAlert.translatedTextRich) == null) {
                    richMessage3 = aIEditorAlert.textRich;
                }
                uItemOf4 = aIEditorAlert.previewItem(6, richMessage3, z);
            } else {
                boolean z2 = aIEditorAlert.translatedTextLoading;
                uItemOf4 = TranslateAlert3.Text.Factory.of(z2 ? 7 : 6, aIEditorAlert.translatedText, false, null, null, !z2 ? new AIEditorAlert$$ExternalSyntheticLambda0(aIEditorAlert, 6) : null);
            }
            arrayList.add(uItemOf4);
        } else if (selectedTab == 1) {
            AIEditorAlert.Tabs tabs2 = aIEditorAlert.styleTabs;
            arrayList.add(UItem.asCustom(tabs2));
            if (tabs2.getSelectedTone() instanceof AIEditorAlert.PromptTone) {
                arrayList.add(UItem.asCustom(10, aIEditorAlert.promptBox));
                universalAdapter.whiteSectionEnd();
                arrayList.add(UItem.asShadow(11, null));
                universalAdapter.whiteSectionStart();
            }
            if ((tabs2.getSelectedTab() >= 0 || aIEditorAlert.emojify) && (!(tabs2.getSelectedTone() instanceof AIEditorAlert.PromptTone) || TextUtils.equals(aIEditorAlert.promptCell.getText().toString(), aIEditorAlert.promptText))) {
                arrayList.add(TranslateAlert3.Header.Factory.of(7, LocaleController.getString(R.string.AIEditorResult), null, null, null, aIEditorAlert.emojify, new AIEditorAlert$$ExternalSyntheticLambda0(aIEditorAlert, 5), null));
                if (aIEditorAlert.isRich()) {
                    boolean z3 = aIEditorAlert.styledTextLoading;
                    if (z3 || (richMessage2 = aIEditorAlert.styledTextRich) == null) {
                        richMessage2 = aIEditorAlert.textRich;
                    }
                    uItemOf2 = aIEditorAlert.previewItem(8, richMessage2, z3);
                } else {
                    boolean z4 = aIEditorAlert.styledTextLoading;
                    uItemOf2 = TranslateAlert3.Text.Factory.of(z4 ? 7 : 6, aIEditorAlert.styledText, false, null, null, !z4 ? new AIEditorAlert$$ExternalSyntheticLambda0(aIEditorAlert, 6) : null);
                }
                arrayList.add(uItemOf2);
            } else {
                arrayList.add(TranslateAlert3.Header.Factory.of(5, LocaleController.getString(R.string.AIEditorOriginal), null, null, null, aIEditorAlert.emojify, new AIEditorAlert$$ExternalSyntheticLambda0(aIEditorAlert, 5), null));
                if (aIEditorAlert.isRich()) {
                    uItemOf3 = aIEditorAlert.previewItem(6, aIEditorAlert.textRich, false);
                } else {
                    uItemOf3 = TranslateAlert3.Text.Factory.of(aIEditorAlert.styledTextLoading ? 7 : 6, aIEditorAlert.text, false, null, null, null);
                }
                arrayList.add(uItemOf3);
            }
        } else if (selectedTab == 2) {
            arrayList.add(TranslateAlert3.Header.Factory.of(3, LocaleController.getString(R.string.AIEditorOriginal), null, null, null, false, null, null));
            arrayList.add(aIEditorAlert.isRich() ? aIEditorAlert.previewItem(4, aIEditorAlert.textRich, false) : TranslateAlert3.Text.Factory.of(4, aIEditorAlert.text, aIEditorAlert.collapsed, new AIEditorAlert$$ExternalSyntheticLambda0(aIEditorAlert, 3), null, null));
            arrayList.add(TranslateAlert3.Header.Factory.of(5, LocaleController.getString(R.string.AIEditorResult), null, null, null, false, null, null));
            if (aIEditorAlert.isRich()) {
                boolean z5 = aIEditorAlert.fixedTextLoading;
                if (z5 || (richMessage = aIEditorAlert.fixedTextRich) == null) {
                    richMessage = aIEditorAlert.textRich;
                }
                uItemOf = aIEditorAlert.previewItem(6, richMessage, z5);
            } else {
                boolean z6 = aIEditorAlert.fixedTextLoading;
                uItemOf = TranslateAlert3.Text.Factory.of(z6 ? 7 : 6, aIEditorAlert.fixedText, false, null, null, !z6 ? new AIEditorAlert$$ExternalSyntheticLambda0(aIEditorAlert, 6) : null);
            }
            arrayList.add(uItemOf);
        }
        universalAdapter.whiteSectionEnd();
        UItem uItem3 = new UItem(7);
        uItem3.text = null;
        arrayList.add(uItem3);
    }

    private final void run$org$telegram$ui$Components$AIEditorAlert$CreateAiStyleAlert$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        AIEditorAlert.CreateAiStyleAlert createAiStyleAlert = (AIEditorAlert.CreateAiStyleAlert) this.f$0;
        createAiStyleAlert.getClass();
        UItem uItem = new UItem(7);
        uItem.text = null;
        arrayList.add(uItem);
        arrayList.add(UItem.asCustomShadow(createAiStyleAlert.iconCell));
        UItem uItem2 = new UItem(7);
        uItem2.text = null;
        arrayList.add(uItem2);
        arrayList.add(UItem.asCustom(createAiStyleAlert.titleCell));
        UItem uItem3 = new UItem(7);
        uItem3.text = null;
        arrayList.add(uItem3);
        arrayList.add(UItem.asCustom(createAiStyleAlert.promptCell));
        UItem uItem4 = new UItem(7);
        uItem4.text = null;
        arrayList.add(uItem4);
        if (createAiStyleAlert.editing != null) {
            UItem uItemAsButton = UItem.asButton(1, LocaleController.getString(R.string.AIEditorDeleteStyle));
            uItemAsButton.red = true;
            UItem uItemM = ArticleViewer.IBlock.CC.m(arrayList, uItemAsButton, 7);
            uItemM.text = null;
            arrayList.add(uItemM);
        }
        arrayList.add(UItem.asCustomShadow(createAiStyleAlert.checkboxCell));
    }

    private final void run$org$telegram$ui$Components$AdminLogFilterAlert2$$ExternalSyntheticLambda2(Object obj, Object obj2) {
        ((AdminLogFilterAlert2) this.f$0).fillItems$1((ArrayList) obj, (UniversalAdapter) obj2);
    }

    private final void run$org$telegram$ui$Components$ChatActivityEnterView$$ExternalSyntheticLambda61(Object obj, Object obj2) {
        ((ChatActivityEnterView) this.f$0).drawMessageEditText((Canvas) obj, (Utilities.Callback0Return) obj2);
    }

    private final void run$org$telegram$ui$Components$ChatAttachAlertAudioLayout$$ExternalSyntheticLambda6(Object obj, Object obj2) {
        boolean z;
        int i;
        MediaController.AudioEntry audioEntry;
        int i2 = 1;
        ArrayList arrayList = (ArrayList) obj;
        UniversalAdapter universalAdapter = (UniversalAdapter) obj2;
        ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = (ChatAttachAlertAudioLayout) this.f$0;
        chatAttachAlertAudioLayout.getClass();
        arrayList.add(UItem.asSpace(-100, AndroidUtilities.dp(1.0f)));
        int size = arrayList.size();
        boolean zIsEmpty = TextUtils.isEmpty(chatAttachAlertAudioLayout.query);
        HashSet hashSet = chatAttachAlertAudioLayout.selectedAudios;
        ArrayList arrayList2 = chatAttachAlertAudioLayout.foundInChats;
        int i3 = chatAttachAlertAudioLayout.LOAD_MORE_SEARCH_CHATS;
        if (zIsEmpty) {
            universalAdapter.whiteSectionStart();
            for (int i4 = 0; i4 < chatAttachAlertAudioLayout.audioEntries.size(); i4++) {
                MediaController.AudioEntry audioEntry2 = (MediaController.AudioEntry) chatAttachAlertAudioLayout.audioEntries.get(i4);
                audioEntry2.messageObject.setQuery(null);
                WebActionBar$$ExternalSyntheticLambda9 webActionBar$$ExternalSyntheticLambda9 = new WebActionBar$$ExternalSyntheticLambda9(chatAttachAlertAudioLayout, i2);
                int i5 = SharedAudioCell.Factory.$r8$clinit;
                UItem uItemOfFactory = UItem.ofFactory(SharedAudioCell.Factory.class);
                uItemOfFactory.object = audioEntry2;
                uItemOfFactory.object2 = webActionBar$$ExternalSyntheticLambda9;
                uItemOfFactory.setChecked(hashSet.contains(audioEntry2));
                uItemOfFactory.id = -1;
                arrayList.add(uItemOfFactory);
            }
            if (chatAttachAlertAudioLayout.loadingAudio) {
                arrayList.add(UItem.asFlicker(11, 4));
                arrayList.add(UItem.asFlicker(12, 4));
                arrayList.add(UItem.asFlicker(13, 4));
            }
            universalAdapter.whiteSectionEnd();
            ArrayList arrayList3 = chatAttachAlertAudioLayout.profileEntries;
            MessagesController.SavedMusicList savedMusicList = chatAttachAlertAudioLayout.savedMusicList;
            if (savedMusicList != null) {
                int size2 = savedMusicList.list.size();
                if (size2 < arrayList3.size()) {
                    arrayList3.subList(size2, arrayList3.size()).clear();
                }
                int i6 = 0;
                while (i6 < size2) {
                    if (i6 >= arrayList3.size()) {
                        audioEntry = new MediaController.AudioEntry();
                        arrayList3.add(audioEntry);
                    } else {
                        audioEntry = (MediaController.AudioEntry) arrayList3.get(i6);
                    }
                    if (audioEntry.messageObject != savedMusicList.list.get(i6)) {
                        MessageObject messageObject = savedMusicList.list.get(i6);
                        int i7 = chatAttachAlertAudioLayout.globalAudioMessageId;
                        chatAttachAlertAudioLayout.globalAudioMessageId = i7 - 1;
                        audioEntry.id = i7;
                        audioEntry.messageObject = messageObject;
                    }
                    i6++;
                    universalAdapter = universalAdapter;
                }
            }
            UniversalAdapter universalAdapter2 = universalAdapter;
            if (savedMusicList != null && arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList.size() > size) {
                    arrayList.add(UItem.asShadow(-98, null));
                }
                universalAdapter2.whiteSectionStart();
                arrayList.add(UItem.asHeader(45, LocaleController.getString(R.string.AudioSearchProfile)));
                for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                    MediaController.AudioEntry audioEntry3 = (MediaController.AudioEntry) arrayList3.get(i8);
                    WebActionBar$$ExternalSyntheticLambda9 webActionBar$$ExternalSyntheticLambda10 = new WebActionBar$$ExternalSyntheticLambda9(chatAttachAlertAudioLayout, 1);
                    int i9 = SharedAudioCell.Factory.$r8$clinit;
                    UItem uItemOfFactory2 = UItem.ofFactory(SharedAudioCell.Factory.class);
                    uItemOfFactory2.object = audioEntry3;
                    uItemOfFactory2.object2 = webActionBar$$ExternalSyntheticLambda10;
                    uItemOfFactory2.setChecked(hashSet.contains(audioEntry3));
                    arrayList.add(uItemOfFactory2);
                }
                if (savedMusicList.loading) {
                    arrayList.add(UItem.asFlicker(41, 4));
                    arrayList.add(UItem.asFlicker(42, 4));
                    arrayList.add(UItem.asFlicker(43, 4));
                }
                if (!savedMusicList.loading && !savedMusicList.endReached) {
                    UItem uItemAsButton = UItem.asButton(chatAttachAlertAudioLayout.LOAD_MORE_SEARCH_PROFILE, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                    uItemAsButton.accent = true;
                    arrayList.add(uItemAsButton);
                }
                universalAdapter2.whiteSectionEnd();
            }
            if (arrayList2 != null && (!arrayList2.isEmpty() || chatAttachAlertAudioLayout.searchChatsRequestId >= 0 || chatAttachAlertAudioLayout.loadingSearchChats)) {
                if (arrayList.size() > size) {
                    arrayList.add(UItem.asShadow(-98, null));
                }
                universalAdapter2.whiteSectionStart();
                arrayList.add(UItem.asHeader(((chatAttachAlertAudioLayout.searchChatsRequestId >= 0 || chatAttachAlertAudioLayout.loadingSearchChats) && arrayList2.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    MediaController.AudioEntry audioEntry4 = (MediaController.AudioEntry) arrayList2.get(i10);
                    audioEntry4.messageObject.setQuery(chatAttachAlertAudioLayout.query);
                    WebActionBar$$ExternalSyntheticLambda9 webActionBar$$ExternalSyntheticLambda11 = new WebActionBar$$ExternalSyntheticLambda9(chatAttachAlertAudioLayout, 1);
                    int i11 = SharedAudioCell.Factory.$r8$clinit;
                    UItem uItemOfFactory3 = UItem.ofFactory(SharedAudioCell.Factory.class);
                    uItemOfFactory3.object = audioEntry4;
                    uItemOfFactory3.object2 = webActionBar$$ExternalSyntheticLambda11;
                    uItemOfFactory3.setChecked(hashSet.contains(audioEntry4));
                    arrayList.add(uItemOfFactory3);
                }
                if (chatAttachAlertAudioLayout.searchChatsRequestId >= 0 || chatAttachAlertAudioLayout.loadingSearchChats) {
                    arrayList.add(UItem.asFlicker(21, 4));
                    arrayList.add(UItem.asFlicker(22, 4));
                    arrayList.add(UItem.asFlicker(23, 4));
                }
                if (chatAttachAlertAudioLayout.searchChatsHasMore) {
                    UItem uItemAsButton2 = UItem.asButton(i3, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                    uItemAsButton2.accent = true;
                    arrayList.add(uItemAsButton2);
                }
                universalAdapter2.whiteSectionEnd();
            }
        } else {
            String lowerCase = chatAttachAlertAudioLayout.query.toLowerCase();
            String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
            boolean z2 = false;
            int i12 = 0;
            while (i12 < chatAttachAlertAudioLayout.audioEntries.size()) {
                MediaController.AudioEntry audioEntry5 = (MediaController.AudioEntry) chatAttachAlertAudioLayout.audioEntries.get(i12);
                String str = audioEntry5.author;
                if (str != null) {
                    String lowerCase2 = str.toLowerCase();
                    String strTranslitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (lowerCase2.startsWith(lowerCase) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", lowerCase, lowerCase2) || strTranslitSafe2.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, strTranslitSafe2)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                String str2 = audioEntry5.title;
                if (str2 != null) {
                    String lowerCase3 = str2.toLowerCase();
                    String strTranslitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                    z = z || lowerCase3.startsWith(lowerCase) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", lowerCase, lowerCase3) || strTranslitSafe3.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, strTranslitSafe3);
                }
                if (z) {
                    if (!z2) {
                        if (arrayList.size() > size) {
                            arrayList.add(UItem.asShadow(-97, null));
                        }
                        universalAdapter.whiteSectionStart();
                        arrayList.add(UItem.asHeader(10, LocaleController.getString(R.string.AudioSearchLocal)));
                        z2 = true;
                    }
                    audioEntry5.messageObject.setQuery(chatAttachAlertAudioLayout.query);
                    i = 1;
                    WebActionBar$$ExternalSyntheticLambda9 webActionBar$$ExternalSyntheticLambda12 = new WebActionBar$$ExternalSyntheticLambda9(chatAttachAlertAudioLayout, i);
                    int i13 = SharedAudioCell.Factory.$r8$clinit;
                    UItem uItemOfFactory4 = UItem.ofFactory(SharedAudioCell.Factory.class);
                    uItemOfFactory4.object = audioEntry5;
                    uItemOfFactory4.object2 = webActionBar$$ExternalSyntheticLambda12;
                    uItemOfFactory4.setChecked(hashSet.contains(audioEntry5));
                    uItemOfFactory4.id = 10;
                    arrayList.add(uItemOfFactory4);
                } else {
                    i = 1;
                }
                i12 += i;
            }
            universalAdapter.whiteSectionEnd();
            if (arrayList2 != null && (!arrayList2.isEmpty() || chatAttachAlertAudioLayout.searchChatsRequestId >= 0 || chatAttachAlertAudioLayout.loadingSearchChats)) {
                if (arrayList.size() > size) {
                    arrayList.add(UItem.asShadow(-98, null));
                }
                universalAdapter.whiteSectionStart();
                arrayList.add(UItem.asHeader(((chatAttachAlertAudioLayout.searchChatsRequestId >= 0 || chatAttachAlertAudioLayout.loadingSearchChats) && arrayList2.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    MediaController.AudioEntry audioEntry6 = (MediaController.AudioEntry) arrayList2.get(i14);
                    audioEntry6.messageObject.setQuery(chatAttachAlertAudioLayout.query);
                    WebActionBar$$ExternalSyntheticLambda9 webActionBar$$ExternalSyntheticLambda13 = new WebActionBar$$ExternalSyntheticLambda9(chatAttachAlertAudioLayout, 1);
                    int i15 = SharedAudioCell.Factory.$r8$clinit;
                    UItem uItemOfFactory5 = UItem.ofFactory(SharedAudioCell.Factory.class);
                    uItemOfFactory5.object = audioEntry6;
                    uItemOfFactory5.object2 = webActionBar$$ExternalSyntheticLambda13;
                    uItemOfFactory5.setChecked(hashSet.contains(audioEntry6));
                    arrayList.add(uItemOfFactory5);
                }
                if (chatAttachAlertAudioLayout.searchChatsRequestId >= 0 || chatAttachAlertAudioLayout.loadingSearchChats) {
                    arrayList.add(UItem.asFlicker(21, 4));
                    arrayList.add(UItem.asFlicker(22, 4));
                    arrayList.add(UItem.asFlicker(23, 4));
                }
                if (chatAttachAlertAudioLayout.searchChatsHasMore) {
                    UItem uItemAsButton3 = UItem.asButton(i3, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                    uItemAsButton3.accent = true;
                    arrayList.add(uItemAsButton3);
                }
                universalAdapter.whiteSectionEnd();
            }
            ArrayList arrayList4 = chatAttachAlertAudioLayout.foundGlobal;
            if (arrayList4 != null && (!arrayList4.isEmpty() || chatAttachAlertAudioLayout.searchGlobalRequestId >= 0 || chatAttachAlertAudioLayout.loadingSearchGlobal)) {
                if (arrayList.size() > size) {
                    arrayList.add(UItem.asShadow(-96, null));
                }
                universalAdapter.whiteSectionStart();
                arrayList.add(UItem.asHeader(((chatAttachAlertAudioLayout.searchGlobalRequestId >= 0 || chatAttachAlertAudioLayout.loadingSearchGlobal) && arrayList4.isEmpty()) ? 35 : 30, LocaleController.getString(R.string.AudioSearchGlobal)));
                int size3 = arrayList4.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    MediaController.AudioEntry audioEntry7 = (MediaController.AudioEntry) arrayList4.get(i16);
                    audioEntry7.messageObject.setQuery(chatAttachAlertAudioLayout.query);
                    WebActionBar$$ExternalSyntheticLambda9 webActionBar$$ExternalSyntheticLambda14 = new WebActionBar$$ExternalSyntheticLambda9(chatAttachAlertAudioLayout, 1);
                    int i17 = SharedAudioCell.Factory.$r8$clinit;
                    UItem uItemOfFactory6 = UItem.ofFactory(SharedAudioCell.Factory.class);
                    uItemOfFactory6.object = audioEntry7;
                    uItemOfFactory6.object2 = webActionBar$$ExternalSyntheticLambda14;
                    uItemOfFactory6.setChecked(hashSet.contains(audioEntry7));
                    arrayList.add(uItemOfFactory6);
                }
                if (chatAttachAlertAudioLayout.searchGlobalRequestId >= 0 || chatAttachAlertAudioLayout.loadingSearchGlobal) {
                    arrayList.add(UItem.asFlicker(31, 4));
                    arrayList.add(UItem.asFlicker(32, 4));
                    arrayList.add(UItem.asFlicker(33, 4));
                }
                if (chatAttachAlertAudioLayout.searchGlobalHasMore) {
                    UItem uItemAsButton4 = UItem.asButton(chatAttachAlertAudioLayout.LOAD_MORE_SEARCH_GLOBAL, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                    uItemAsButton4.accent = true;
                    arrayList.add(uItemAsButton4);
                }
                universalAdapter.whiteSectionEnd();
            }
        }
        if (arrayList.size() <= size && !chatAttachAlertAudioLayout.loadingAudio) {
            if (TextUtils.isEmpty(chatAttachAlertAudioLayout.query)) {
                String string = LocaleController.getString(R.string.NoAudioFiles);
                String string2 = LocaleController.getString(R.string.NoAudioFilesInfo);
                int i18 = ChatAttachAlertAudioLayout.EmptyView.Factory.$r8$clinit;
                UItem uItemOfFactory7 = UItem.ofFactory(ChatAttachAlertAudioLayout.EmptyView.Factory.class);
                uItemOfFactory7.text = string;
                uItemOfFactory7.subtext = string2;
                arrayList.add(uItemOfFactory7);
            } else {
                String string3 = LocaleController.getString(R.string.NoAudioFound);
                SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(chatAttachAlertAudioLayout.query.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, chatAttachAlertAudioLayout.query));
                int i19 = ChatAttachAlertAudioLayout.EmptyView.Factory.$r8$clinit;
                UItem uItemOfFactory8 = UItem.ofFactory(ChatAttachAlertAudioLayout.EmptyView.Factory.class);
                uItemOfFactory8.text = string3;
                uItemOfFactory8.subtext = spannableStringBuilderReplaceTags;
                arrayList.add(uItemOfFactory8);
            }
        }
        arrayList.add(UItem.asShadow(-99, null));
    }

    private final void run$org$telegram$ui$Components$ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda21(Object obj, Object obj2) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f$0;
        chatAttachAlertPhotoLayout.getClass();
        ((Runnable) obj2).run();
        chatAttachAlertPhotoLayout.setStarsPrice(((Long) obj).longValue());
    }

    private final void run$org$telegram$ui$Components$CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda3(Object obj, Object obj2) {
        ((CreateRtmpStreamBottomSheet) this.f$0).fillItems$26((ArrayList) obj);
    }

    private final void run$org$telegram$ui$Components$DialogsBotsAdapter$$ExternalSyntheticLambda4(Object obj, Object obj2) {
        int i;
        boolean z;
        ArrayList arrayList = (ArrayList) obj;
        final DialogsBotsAdapter dialogsBotsAdapter = (DialogsBotsAdapter) this.f$0;
        HashSet hashSet = new HashSet();
        boolean zIsEmpty = TextUtils.isEmpty(dialogsBotsAdapter.query);
        DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda6 = dialogsBotsAdapter.openBotCallback;
        boolean z2 = dialogsBotsAdapter.showOnlyPopular;
        if (!zIsEmpty) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(dialogsBotsAdapter.searchMine);
            arrayList2.addAll(dialogsBotsAdapter.searchGlobal);
            boolean zIsEmpty2 = arrayList2.isEmpty();
            ArrayList arrayList3 = dialogsBotsAdapter.searchMessages;
            if (!zIsEmpty2) {
                if (arrayList2.size() <= 5 || arrayList3.isEmpty() || z2) {
                    String string = LocaleController.getString(R.string.SearchApps);
                    UItem uItem = new UItem(31);
                    uItem.text = string;
                    arrayList.add(uItem);
                } else {
                    String string2 = LocaleController.getString(R.string.SearchApps);
                    String string3 = LocaleController.getString(dialogsBotsAdapter.expandedSearchBots ? R.string.ShowLess : R.string.ShowMore);
                    final int i2 = 0;
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i2) {
                                case 0:
                                    DialogsBotsAdapter dialogsBotsAdapter2 = dialogsBotsAdapter;
                                    dialogsBotsAdapter2.expandedSearchBots = !dialogsBotsAdapter2.expandedSearchBots;
                                    dialogsBotsAdapter2.update(true);
                                    break;
                                default:
                                    DialogsBotsAdapter dialogsBotsAdapter3 = dialogsBotsAdapter;
                                    dialogsBotsAdapter3.expandedMyBots = !dialogsBotsAdapter3.expandedMyBots;
                                    dialogsBotsAdapter3.update(true);
                                    break;
                            }
                        }
                    };
                    UItem uItem2 = new UItem(31);
                    uItem2.text = string2;
                    uItem2.subtext = string3;
                    uItem2.clickCallback = onClickListener;
                    arrayList.add(uItem2);
                }
                int size = arrayList2.size();
                if (!dialogsBotsAdapter.expandedSearchBots && !arrayList3.isEmpty() && !z2) {
                    size = Math.min(5, size);
                }
                for (int i3 = 0; i3 < size; i3++) {
                    TLObject tLObject = (TLObject) arrayList2.get(i3);
                    UItem uItem3 = new UItem(32);
                    uItem3.object = tLObject;
                    uItem3.locked = true;
                    uItem3.object2 = dialogCell$$ExternalSyntheticLambda6;
                    arrayList.add(uItem3);
                }
            }
            if (arrayList3.isEmpty() || z2) {
                return;
            }
            String string4 = LocaleController.getString(R.string.SearchMessages);
            UItem uItem4 = new UItem(31);
            uItem4.text = string4;
            arrayList.add(uItem4);
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj3 = arrayList3.get(i4);
                i4++;
                UItem uItem5 = new UItem(33);
                uItem5.object = (MessageObject) obj3;
                arrayList.add(uItem5);
            }
            if (dialogsBotsAdapter.hasMore) {
                UItem uItem6 = new UItem(34);
                uItem6.intValue = 1;
                arrayList.add(uItem6);
                return;
            }
            return;
        }
        int i5 = dialogsBotsAdapter.currentAccount;
        ArrayList<TLRPC.TL_topPeer> arrayList4 = MediaDataController.getInstance(i5).webapps;
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4 != null) {
            for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                TLRPC.User user = MessagesController.getInstance(i5).getUser(Long.valueOf(DialogObject.getPeerDialogId(arrayList4.get(i6).peer)));
                if (user != null && user.bot) {
                    arrayList5.add(user);
                }
            }
        }
        dialogsBotsAdapter.topPeersStart = arrayList.size();
        if (!arrayList5.isEmpty() && !z2) {
            if (arrayList5.size() > 5) {
                String string5 = LocaleController.getString(R.string.SearchAppsMine);
                String string6 = LocaleController.getString(dialogsBotsAdapter.expandedMyBots ? R.string.ShowLess : R.string.ShowMore);
                final int i7 = 1;
                View.OnClickListener onClickListener2 = new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (i7) {
                            case 0:
                                DialogsBotsAdapter dialogsBotsAdapter2 = dialogsBotsAdapter;
                                dialogsBotsAdapter2.expandedSearchBots = !dialogsBotsAdapter2.expandedSearchBots;
                                dialogsBotsAdapter2.update(true);
                                break;
                            default:
                                DialogsBotsAdapter dialogsBotsAdapter3 = dialogsBotsAdapter;
                                dialogsBotsAdapter3.expandedMyBots = !dialogsBotsAdapter3.expandedMyBots;
                                dialogsBotsAdapter3.update(true);
                                break;
                        }
                    }
                };
                UItem uItem7 = new UItem(31);
                uItem7.text = string5;
                uItem7.subtext = string6;
                uItem7.clickCallback = onClickListener2;
                arrayList.add(uItem7);
            } else {
                String string7 = LocaleController.getString(R.string.SearchAppsMine);
                UItem uItem8 = new UItem(31);
                uItem8.text = string7;
                arrayList.add(uItem8);
            }
            for (int i8 = 0; i8 < arrayList5.size() && (i8 < 5 || dialogsBotsAdapter.expandedMyBots); i8++) {
                TLRPC.User user2 = (TLRPC.User) arrayList5.get(i8);
                if (!hashSet.contains(Long.valueOf(user2.id))) {
                    hashSet.add(Long.valueOf(user2.id));
                    UItem uItem9 = new UItem(32);
                    uItem9.object = user2;
                    uItem9.accent = true;
                    uItem9.locked = true;
                    uItem9.object2 = dialogCell$$ExternalSyntheticLambda6;
                    arrayList.add(uItem9);
                }
            }
        }
        hashSet.clear();
        dialogsBotsAdapter.topPeersEnd = arrayList.size();
        DialogsBotsAdapter.PopularBots popularBots = dialogsBotsAdapter.popular;
        if (popularBots.bots.isEmpty()) {
            if (popularBots.loading || !popularBots.endReached) {
                if (z2) {
                    i = 34;
                } else {
                    i = 34;
                    UItem uItem10 = new UItem(34);
                    uItem10.intValue = 30;
                    arrayList.add(uItem10);
                }
                UItem uItem11 = new UItem(i);
                uItem11.intValue = 29;
                UItem uItemM = ArticleViewer.IBlock.CC.m(arrayList, uItem11, i);
                uItemM.intValue = 29;
                UItem uItemM2 = ArticleViewer.IBlock.CC.m(arrayList, uItemM, i);
                uItemM2.intValue = 29;
                UItem uItemM3 = ArticleViewer.IBlock.CC.m(arrayList, uItemM2, i);
                uItemM3.intValue = 29;
                arrayList.add(uItemM3);
            }
            z = false;
        } else {
            if (!z2) {
                String string8 = LocaleController.getString(R.string.SearchAppsPopular);
                UItem uItem12 = new UItem(31);
                uItem12.text = string8;
                arrayList.add(uItem12);
            }
            int i9 = 0;
            boolean z3 = false;
            while (true) {
                ArrayList arrayList6 = popularBots.bots;
                if (i9 >= arrayList6.size()) {
                    break;
                }
                TLRPC.User user3 = (TLRPC.User) arrayList6.get(i9);
                if (!hashSet.contains(Long.valueOf(user3.id))) {
                    hashSet.add(Long.valueOf(user3.id));
                    UItem uItem13 = new UItem(32);
                    uItem13.object = user3;
                    uItem13.accent = true;
                    uItem13.red = true;
                    uItem13.locked = true;
                    uItem13.object2 = dialogCell$$ExternalSyntheticLambda6;
                    arrayList.add(uItem13);
                    z3 = true;
                }
                i9++;
            }
            if (popularBots.loading || !popularBots.endReached) {
                UItem uItem14 = new UItem(34);
                uItem14.intValue = 29;
                UItem uItemM4 = ArticleViewer.IBlock.CC.m(arrayList, uItem14, 34);
                uItemM4.intValue = 29;
                UItem uItemM5 = ArticleViewer.IBlock.CC.m(arrayList, uItemM4, 34);
                uItemM5.intValue = 29;
                arrayList.add(uItemM5);
            }
            z = z3;
        }
        if (z) {
            UItem uItem15 = new UItem(7);
            uItem15.text = dialogsBotsAdapter.infoText;
            arrayList.add(uItem15);
        }
    }

    private final void run$org$telegram$ui$Components$DialogsChannelsAdapter$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        final SearchViewPager.AnonymousClass8 anonymousClass8 = (SearchViewPager.AnonymousClass8) this.f$0;
        boolean zIsEmpty = TextUtils.isEmpty(anonymousClass8.query);
        int i = ((DialogsChannelsAdapter) anonymousClass8).currentAccount;
        if (zIsEmpty) {
            ArrayList arrayList2 = anonymousClass8.myChannels;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                if (arrayList2.size() > 5) {
                    String string = LocaleController.getString(R.string.SearchMyChannels);
                    String string2 = LocaleController.getString(anonymousClass8.expandedMyChannels ? R.string.ShowLess : R.string.ShowMore);
                    final int i2 = 0;
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i2) {
                                case 0:
                                    SearchViewPager.AnonymousClass8 anonymousClass9 = anonymousClass8;
                                    anonymousClass9.expandedMyChannels = !anonymousClass9.expandedMyChannels;
                                    anonymousClass9.update(true);
                                    if (anonymousClass9.expandedMyChannels) {
                                        AndroidUtilities.hideKeyboard(anonymousClass9.val$fragment.getParentActivity().getCurrentFocus());
                                    }
                                    break;
                                default:
                                    SearchViewPager.AnonymousClass8 anonymousClass10 = anonymousClass8;
                                    anonymousClass10.expandedSearchChannels = !anonymousClass10.expandedSearchChannels;
                                    anonymousClass10.update(true);
                                    if (anonymousClass10.expandedSearchChannels) {
                                        AndroidUtilities.hideKeyboard(anonymousClass10.val$fragment.getParentActivity().getCurrentFocus());
                                    }
                                    break;
                            }
                        }
                    };
                    UItem uItem = new UItem(31);
                    uItem.text = string;
                    uItem.subtext = string2;
                    uItem.clickCallback = onClickListener;
                    arrayList.add(uItem);
                } else {
                    String string3 = LocaleController.getString(R.string.SearchMyChannels);
                    UItem uItem2 = new UItem(31);
                    uItem2.text = string3;
                    arrayList.add(uItem2);
                }
                int size = arrayList2.size();
                if (!anonymousClass8.expandedMyChannels) {
                    size = Math.min(5, size);
                }
                for (int i3 = 0; i3 < size; i3++) {
                    TLObject tLObject = (TLObject) arrayList2.get(i3);
                    UItem uItem3 = new UItem(32);
                    uItem3.object = tLObject;
                    uItem3.withUsername = true;
                    arrayList.add(uItem3);
                }
            }
            MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(i).getCachedChannelRecommendations(0L);
            if (cachedChannelRecommendations == null) {
                UItem uItem4 = new UItem(34);
                uItem4.intValue = 30;
                UItem uItemM = ArticleViewer.IBlock.CC.m(arrayList, uItem4, 34);
                uItemM.intValue = 29;
                UItem uItemM2 = ArticleViewer.IBlock.CC.m(arrayList, uItemM, 34);
                uItemM2.intValue = 29;
                UItem uItemM3 = ArticleViewer.IBlock.CC.m(arrayList, uItemM2, 34);
                uItemM3.intValue = 29;
                UItem uItemM4 = ArticleViewer.IBlock.CC.m(arrayList, uItemM3, 34);
                uItemM4.intValue = 29;
                arrayList.add(uItemM4);
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList<TLObject> arrayList4 = cachedChannelRecommendations.chats;
            int size2 = arrayList4.size();
            int i4 = 0;
            while (i4 < size2) {
                TLObject tLObject2 = arrayList4.get(i4);
                i4++;
                TLObject tLObject3 = tLObject2;
                if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    TLRPC.Chat chat2 = MessagesController.getInstance(i).getChat(Long.valueOf(chat.id));
                    if (ChatObject.isNotInChat(chat) && (chat2 == null || ChatObject.isNotInChat(chat2))) {
                        arrayList3.add(chat);
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                String string4 = LocaleController.getString(R.string.SearchRecommendedChannels);
                UItem uItem5 = new UItem(31);
                uItem5.text = string4;
                arrayList.add(uItem5);
            }
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList3.get(i5);
                i5++;
                UItem uItem6 = new UItem(32);
                uItem6.object = (TLRPC.Chat) obj3;
                arrayList.add(uItem6);
            }
            return;
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = anonymousClass8.searchMyChannels;
        int size4 = arrayList6.size();
        int i6 = 0;
        while (i6 < size4) {
            Object obj4 = arrayList6.get(i6);
            i6++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj4;
            ArrayList arrayList7 = arrayList6;
            TLRPC.Chat chat4 = MessagesController.getInstance(i).getChat(Long.valueOf(chat3.id));
            if (ChatObject.isNotInChat(chat3) && (chat4 == null || ChatObject.isNotInChat(chat4))) {
                arrayList5.add(chat3);
            }
            arrayList6 = arrayList7;
        }
        ArrayList arrayList8 = anonymousClass8.searchRecommendedChannels;
        int size5 = arrayList8.size();
        int i7 = 0;
        while (i7 < size5) {
            Object obj5 = arrayList8.get(i7);
            i7++;
            TLRPC.Chat chat5 = (TLRPC.Chat) obj5;
            TLRPC.Chat chat6 = MessagesController.getInstance(i).getChat(Long.valueOf(chat5.id));
            if (ChatObject.isNotInChat(chat5) && (chat6 == null || ChatObject.isNotInChat(chat6))) {
                arrayList5.add(chat5);
            }
        }
        ArrayList arrayList9 = anonymousClass8.searchChannels;
        int size6 = arrayList9.size();
        int i8 = 0;
        while (i8 < size6) {
            Object obj6 = arrayList9.get(i8);
            i8++;
            TLRPC.Chat chat7 = (TLRPC.Chat) obj6;
            TLRPC.Chat chat8 = MessagesController.getInstance(i).getChat(Long.valueOf(chat7.id));
            if (ChatObject.isNotInChat(chat7) && (chat8 == null || ChatObject.isNotInChat(chat8))) {
                arrayList5.add(chat7);
            }
        }
        boolean zIsEmpty2 = arrayList5.isEmpty();
        ArrayList arrayList10 = anonymousClass8.messages;
        if (!zIsEmpty2) {
            if (arrayList5.size() <= 5 || arrayList10.isEmpty()) {
                String string5 = LocaleController.getString(R.string.SearchChannels);
                UItem uItem7 = new UItem(31);
                uItem7.text = string5;
                arrayList.add(uItem7);
            } else {
                String string6 = LocaleController.getString(R.string.SearchChannels);
                String string7 = LocaleController.getString(anonymousClass8.expandedSearchChannels ? R.string.ShowLess : R.string.ShowMore);
                final int i9 = 1;
                View.OnClickListener onClickListener2 = new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (i9) {
                            case 0:
                                SearchViewPager.AnonymousClass8 anonymousClass9 = anonymousClass8;
                                anonymousClass9.expandedMyChannels = !anonymousClass9.expandedMyChannels;
                                anonymousClass9.update(true);
                                if (anonymousClass9.expandedMyChannels) {
                                    AndroidUtilities.hideKeyboard(anonymousClass9.val$fragment.getParentActivity().getCurrentFocus());
                                }
                                break;
                            default:
                                SearchViewPager.AnonymousClass8 anonymousClass10 = anonymousClass8;
                                anonymousClass10.expandedSearchChannels = !anonymousClass10.expandedSearchChannels;
                                anonymousClass10.update(true);
                                if (anonymousClass10.expandedSearchChannels) {
                                    AndroidUtilities.hideKeyboard(anonymousClass10.val$fragment.getParentActivity().getCurrentFocus());
                                }
                                break;
                        }
                    }
                };
                UItem uItem8 = new UItem(31);
                uItem8.text = string6;
                uItem8.subtext = string7;
                uItem8.clickCallback = onClickListener2;
                arrayList.add(uItem8);
            }
            int size7 = arrayList5.size();
            if (!anonymousClass8.expandedSearchChannels && !arrayList10.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i10 = 0; i10 < size7; i10++) {
                TLObject tLObject4 = (TLObject) arrayList5.get(i10);
                UItem uItem9 = new UItem(32);
                uItem9.object = tLObject4;
                arrayList.add(uItem9);
            }
        }
        if (arrayList10.isEmpty()) {
            return;
        }
        String string8 = LocaleController.getString(R.string.SearchMessages);
        UItem uItem10 = new UItem(31);
        uItem10.text = string8;
        arrayList.add(uItem10);
        int size8 = arrayList10.size();
        int i11 = 0;
        while (i11 < size8) {
            Object obj7 = arrayList10.get(i11);
            i11++;
            UItem uItem11 = new UItem(33);
            uItem11.object = (MessageObject) obj7;
            arrayList.add(uItem11);
        }
        if (anonymousClass8.hasMore) {
            UItem uItem12 = new UItem(34);
            uItem12.intValue = 1;
            arrayList.add(uItem12);
        }
    }

    private final void run$org$telegram$ui$Components$EmojiView$$ExternalSyntheticLambda9(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        EmojiView emojiView = (EmojiView) this.f$0;
        EmojiView.ImageViewEmoji imageViewEmoji = emojiView.emojiTouchedView;
        if (imageViewEmoji == null || !(imageViewEmoji.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            return;
        }
        ((CompoundEmoji.CompoundEmojiDrawable) emojiView.emojiTouchedView.getDrawable()).update(num.intValue(), num2.intValue());
        String str = (String) emojiView.emojiTouchedView.getTag();
        if (num.intValue() == -1 && num2.intValue() == -1) {
            Emoji.emojiColor.remove(str);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(num.intValue() >= 0 ? CompoundEmoji.skinTones.get(num.intValue()) : "");
            sb.append("\u200d");
            sb.append(num2.intValue() >= 0 ? CompoundEmoji.skinTones.get(num2.intValue()) : "");
            Emoji.emojiColor.put(str, sb.toString());
        }
        Emoji.saveEmojiColors();
    }

    private final void run$org$telegram$ui$Components$EmojiView$EmojiSearchAdapter$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        EmojiView.EmojiSearchAdapter emojiSearchAdapter = (EmojiView.EmojiSearchAdapter) this.f$0;
        ArrayList arrayList2 = emojiSearchAdapter.packs;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList2.get(i);
            i++;
            EmojiView.EmojiPackInfo emojiPackInfo = (EmojiView.EmojiPackInfo) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = emojiPackInfo.stickerSet;
            if (tL_messages_stickerSet != null) {
                boolean z = tL_messages_stickerSet.set.id == emojiSearchAdapter.selectedPackId;
                int i2 = EmojiView.FoundStickerPackFactory.$r8$clinit;
                UItem uItemOfFactory = UItem.ofFactory(EmojiView.FoundStickerPackFactory.class);
                long j = tL_messages_stickerSet.set.id;
                uItemOfFactory.id = (int) ((j >>> 32) ^ j);
                uItemOfFactory.longValue = j;
                uItemOfFactory.object = tL_messages_stickerSet;
                uItemOfFactory.checked = z;
                arrayList.add(uItemOfFactory);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = emojiPackInfo.stickerSetCovered;
                if (stickerSetCovered != null) {
                    arrayList.add(EmojiView.FoundStickerPackFactory.of(stickerSetCovered, emojiPackInfo, stickerSetCovered.set.id == emojiSearchAdapter.selectedPackId));
                }
            }
        }
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z;
        TLRPC.Chat chat;
        boolean z2;
        UniversalAdapter universalAdapter;
        int i;
        boolean z3;
        int i2;
        int i3;
        CharSequence charSequence;
        StatisticActivity.ChartViewData chartViewData;
        int i4 = 0;
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                CallLogActivity callLogActivity = (CallLogActivity) this.f$0;
                boolean zIsEmpty = callLogActivity.activeGroupCalls.isEmpty();
                ArrayList arrayList2 = callLogActivity.calls;
                boolean zIsEmpty2 = arrayList2.isEmpty();
                if (!zIsEmpty || !zIsEmpty2) {
                    UItem uItemAsButton = UItem.asButton(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    uItemAsButton.accent = true;
                    arrayList.add(uItemAsButton);
                    if (!callLogActivity.getUserConfig().showCallsTab) {
                        UItem uItemAsButton2 = UItem.asButton(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        uItemAsButton2.accent = true;
                        arrayList.add(uItemAsButton2);
                    }
                    UItem uItem = new UItem(7);
                    uItem.text = null;
                    arrayList.add(uItem);
                }
                if (!zIsEmpty) {
                    ArrayList arrayList3 = callLogActivity.activeGroupCalls;
                    int size = arrayList3.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj3 = arrayList3.get(i5);
                        int i6 = 1;
                        i5++;
                        Long l = (Long) obj3;
                        if (l != null && (chat = callLogActivity.getMessagesController().getChat(l)) != null) {
                            CallLogActivity$$ExternalSyntheticLambda2 callLogActivity$$ExternalSyntheticLambda2 = new CallLogActivity$$ExternalSyntheticLambda2(callLogActivity, i6);
                            int i7 = CallLogActivity.GroupCallCell.Factory.$r8$clinit;
                            UItem uItemOfFactory = UItem.ofFactory(CallLogActivity.GroupCallCell.Factory.class);
                            uItemOfFactory.object = chat;
                            uItemOfFactory.clickCallback = callLogActivity$$ExternalSyntheticLambda2;
                            arrayList.add(uItemOfFactory);
                        }
                    }
                    UItem uItem2 = new UItem(7);
                    uItem2.text = null;
                    arrayList.add(uItem2);
                }
                if (!zIsEmpty2) {
                    int size2 = arrayList2.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        Object obj4 = arrayList2.get(i8);
                        i8++;
                        CallLogActivity.CallLogRow callLogRow = (CallLogActivity.CallLogRow) obj4;
                        ChatActivity$$ExternalSyntheticLambda77 chatActivity$$ExternalSyntheticLambda77 = new ChatActivity$$ExternalSyntheticLambda77(16, callLogActivity, callLogRow);
                        int i9 = CallLogActivity.CallCell.Factory.$r8$clinit;
                        UItem uItemOfFactory2 = UItem.ofFactory(CallLogActivity.CallCell.Factory.class);
                        uItemOfFactory2.object = callLogRow;
                        uItemOfFactory2.clickCallback = chatActivity$$ExternalSyntheticLambda77;
                        ArrayList arrayList4 = callLogRow.calls;
                        int size3 = arrayList4.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size3) {
                                z = false;
                            } else if (callLogActivity.selectedIds.contains(Integer.valueOf(((TLRPC.Message) arrayList4.get(i10)).id))) {
                                z = true;
                            } else {
                                i10++;
                            }
                        }
                        uItemOfFactory2.setChecked(z);
                        arrayList.add(uItemOfFactory2);
                    }
                    if (!callLogActivity.endReached) {
                        arrayList.add(UItem.asFlicker(-1, 8));
                        arrayList.add(UItem.asFlicker(-2, 8));
                        arrayList.add(UItem.asFlicker(-3, 8));
                    }
                }
                break;
            case 1:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                SearchViewPager.AnonymousClass1 anonymousClass1 = (SearchViewPager.AnonymousClass1) ((DialogsSearchAdapter) this.f$0);
                DialogsActivity dialogsActivity = anonymousClass1.val$fragment;
                AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                ItemOptions itemOptions = new ItemOptions(dialogsActivity, (ProfileSearchCell) obj, true, true);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z2 = false;
                } else {
                    ItemOptions itemOptionsMakeSwipeback = itemOptions.makeSwipeback();
                    itemOptionsMakeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ChatActivity$$ExternalSyntheticLambda326(1, itemOptions), false);
                    itemOptionsMakeSwipeback.addGap();
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                        itemOptionsMakeSwipeback.addText(13, -1, tL_sponsoredPeer.sponsor_info);
                    }
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                            itemOptionsMakeSwipeback.addGap();
                        }
                        itemOptionsMakeSwipeback.addText(13, -1, tL_sponsoredPeer.additional_info);
                    }
                    z2 = false;
                    itemOptions.add(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new PhotoViewer$$ExternalSyntheticLambda133(itemOptions, itemOptionsMakeSwipeback, 6), false);
                }
                itemOptions.add(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new ChatUsersActivity$$ExternalSyntheticLambda13(anonymousClass1, dialogsActivity, anonymousClass1.val$context, itemOptions, 20), z2);
                itemOptions.add(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new ChatUsersActivity$$ExternalSyntheticLambda13((Object) anonymousClass1, (Object) dialogsActivity, (Object) tL_sponsoredPeer, (Object) itemOptions, 21), z2);
                itemOptions.addGap();
                itemOptions.add(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new FilterGLThread$$ExternalSyntheticLambda1(anonymousClass1, dialogsActivity, itemOptions, 25), z2);
                itemOptions.setGravity(LocaleController.isRTL ? 3 : 5);
                itemOptions.onTopOfScrim = true;
                itemOptions.drawScrim = z2;
                itemOptions.show();
                break;
            case 2:
                AvatarPreviewer.Layout layout = (AvatarPreviewer.Layout) this.f$0;
                layout.blurView.setBackground(new BitmapDrawable((Bitmap) obj));
                layout.preparingBlur = false;
                BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = layout.iBlur3SourceBitmap;
                blurredBackgroundSourceBitmap.setBitmap((Bitmap) obj2);
                Blur3Utils.checkBitmapSourceMatrixScale(blurredBackgroundSourceBitmap, layout);
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = layout.menu;
                if (actionBarPopupWindowLayout != null) {
                    actionBarPopupWindowLayout.invalidate();
                }
                break;
            case 3:
                ((AwayMessagesActivity) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 4:
                BusinessIntroActivity businessIntroActivity = (BusinessIntroActivity) this.f$0;
                businessIntroActivity.chatAttachAlert.lambda$showGiftOfferSheet$15();
                businessIntroActivity.inputStickerPath = (String) obj;
                businessIntroActivity.inputSticker = (TLRPC.InputDocument) obj2;
                businessIntroActivity.stickerRandom = false;
                AndroidUtilities.cancelRunOnUIThread(businessIntroActivity.updateRandomStickerRunnable);
                businessIntroActivity.greetingsView.setSticker(businessIntroActivity.inputStickerPath);
                businessIntroActivity.checkDone$1(true);
                UniversalFragment.AnonymousClass3 anonymousClass3 = businessIntroActivity.listView;
                if (anonymousClass3 != null && (universalAdapter = anonymousClass3.adapter) != null) {
                    universalAdapter.update(true);
                    break;
                }
                break;
            case 5:
                ArrayList arrayList5 = (ArrayList) obj;
                UniversalAdapter universalAdapter2 = (UniversalAdapter) obj2;
                ChatbotSheet chatbotSheet = (ChatbotSheet) this.f$0;
                chatbotSheet.getClass();
                universalAdapter2.itemsOffset = 1;
                LinearLayout linearLayout = chatbotSheet.topView;
                UItem uItem3 = new UItem(-4);
                uItem3.id = -5;
                uItem3.view = linearLayout;
                uItem3.intValue = -1;
                arrayList5.add(uItem3);
                TL_account.TL_connectedBot tL_connectedBot = chatbotSheet.bot;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        String string = LocaleController.getString(R.string.SessionBotConnectedFrom);
                        UItem uItem4 = new UItem(0);
                        uItem4.text = string;
                        arrayList5.add(uItem4);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList5.add(UItem.asButton(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i = 2;
                            arrayList5.add(UItem.asButton(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i)) {
                            arrayList5.add(UItem.asButton(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        UItem uItem5 = new UItem(7);
                        uItem5.text = null;
                        arrayList5.add(uItem5);
                    }
                    universalAdapter2.whiteSectionStart();
                    String string2 = LocaleController.getString(R.string.BusinessBotChats2);
                    UItem uItem6 = new UItem(0);
                    uItem6.text = string2;
                    arrayList5.add(uItem6);
                    UItem uItemAsRadio = UItem.asRadio(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    uItemAsRadio.setChecked(chatbotSheet.exclude);
                    arrayList5.add(uItemAsRadio);
                    UItem uItemAsRadio2 = UItem.asRadio(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    uItemAsRadio2.setChecked(!chatbotSheet.exclude);
                    arrayList5.add(uItemAsRadio2);
                    universalAdapter2.whiteSectionEnd();
                    UItem uItem7 = new UItem(7);
                    uItem7.text = null;
                    arrayList5.add(uItem7);
                    BusinessRecipientsHelper businessRecipientsHelper = chatbotSheet.recipientsHelper;
                    if (businessRecipientsHelper != null) {
                        businessRecipientsHelper.fillItems(arrayList5, universalAdapter2, true);
                    }
                    String string3 = LocaleController.getString(R.string.BusinessBotChatsInfo2);
                    UItem uItem8 = new UItem(7);
                    uItem8.text = string3;
                    arrayList5.add(uItem8);
                }
                break;
            case 6:
                ArrayList arrayList6 = (ArrayList) obj;
                UniversalAdapter universalAdapter3 = (UniversalAdapter) obj2;
                final ChatbotsActivity chatbotsActivity = (ChatbotsActivity) this.f$0;
                String string4 = LocaleController.getString(R.string.BusinessBots2);
                String string5 = LocaleController.getString(R.string.BusinessBots2Info);
                UItem uItem9 = new UItem(2);
                uItem9.text = string4;
                uItem9.animatedText = string5;
                uItem9.subtext = "tg_superplaceholders_android_2";
                uItem9.textValue = "🤖🏝️";
                uItem9.intValue = 120;
                arrayList6.add(uItem9);
                if (chatbotsActivity.selectedBot != null) {
                    universalAdapter3.whiteSectionStart();
                    long j = chatbotsActivity.selectedBot.id;
                    UItem uItem10 = new UItem(13);
                    uItem10.dialogId = j;
                    uItem10.setChecked(true);
                    final int i11 = 0;
                    uItem10.clickCallback = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    ChatbotsActivity chatbotsActivity2 = chatbotsActivity;
                                    chatbotsActivity2.selectedBot = null;
                                    chatbotsActivity2.listView.adapter.update(true);
                                    chatbotsActivity2.checkDone$6(true);
                                    break;
                                case 1:
                                    ChatbotsActivity chatbotsActivity3 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights = chatbotsActivity3.rights;
                                    if (tL_businessBotRights.reply && tL_businessBotRights.read_messages && tL_businessBotRights.delete_received_messages && tL_businessBotRights.delete_sent_messages) {
                                        tL_businessBotRights.delete_sent_messages = false;
                                        tL_businessBotRights.delete_received_messages = false;
                                        tL_businessBotRights.read_messages = false;
                                        tL_businessBotRights.reply = false;
                                    } else {
                                        tL_businessBotRights.delete_sent_messages = true;
                                        tL_businessBotRights.delete_received_messages = true;
                                        tL_businessBotRights.read_messages = true;
                                        tL_businessBotRights.reply = true;
                                    }
                                    chatbotsActivity3.listView.adapter.update(true);
                                    chatbotsActivity3.checkDone$6(true);
                                    break;
                                case 2:
                                    ChatbotsActivity chatbotsActivity4 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = chatbotsActivity4.rights;
                                    if (tL_businessBotRights2.edit_name && tL_businessBotRights2.edit_bio && tL_businessBotRights2.edit_profile_photo && tL_businessBotRights2.edit_username) {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        chatbotsActivity4.listView.adapter.update(true);
                                        chatbotsActivity4.checkDone$6(true);
                                    } else {
                                        chatbotsActivity4.checkAlert(-14, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity4, 2));
                                    }
                                    break;
                                case 3:
                                    ChatbotsActivity chatbotsActivity5 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = chatbotsActivity5.rights;
                                    if (tL_businessBotRights3.view_gifts && tL_businessBotRights3.sell_gifts && tL_businessBotRights3.change_gift_settings && tL_businessBotRights3.transfer_and_upgrade_gifts && tL_businessBotRights3.transfer_stars) {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        chatbotsActivity5.listView.adapter.update(true);
                                        chatbotsActivity5.checkDone$6(true);
                                    } else {
                                        chatbotsActivity5.checkAlert(-17, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity5, 3));
                                    }
                                    break;
                                default:
                                    ChatbotsActivity chatbotsActivity6 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = chatbotsActivity6.rights;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    chatbotsActivity6.listView.adapter.update(true);
                                    chatbotsActivity6.checkDone$6(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(uItem10);
                    universalAdapter3.whiteSectionEnd();
                } else {
                    universalAdapter3.whiteSectionStart();
                    arrayList6.add(UItem.asCustom(chatbotsActivity.editTextContainer));
                    LongSparseArray longSparseArray = chatbotsActivity.foundBots;
                    longSparseArray.clear();
                    boolean z4 = false;
                    for (int i12 = 0; i12 < chatbotsActivity.searchHelper.localServerSearch.size(); i12++) {
                        TLObject tLObject = (TLObject) chatbotsActivity.searchHelper.localServerSearch.get(i12);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                long j2 = user.id;
                                String str = chatbotsActivity.lastQuery;
                                UItem uItem11 = new UItem(13);
                                uItem11.dialogId = j2;
                                uItem11.textValue = str;
                                arrayList6.add(uItem11);
                                longSparseArray.put(user.id, user);
                                z4 = true;
                            }
                        }
                    }
                    for (int i13 = 0; i13 < chatbotsActivity.searchHelper.globalSearch.size(); i13++) {
                        TLObject tLObject2 = (TLObject) chatbotsActivity.searchHelper.globalSearch.get(i13);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j3 = user2.id;
                                String str2 = chatbotsActivity.lastQuery;
                                UItem uItem12 = new UItem(13);
                                uItem12.dialogId = j3;
                                uItem12.textValue = str2;
                                arrayList6.add(uItem12);
                                longSparseArray.put(user2.id, user2);
                                z4 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(chatbotsActivity.editText.getText().toString()) || chatbotsActivity.searchHelper.isSearchInProgress() || chatbotsActivity.scheduledLoading)) {
                        arrayList6.add(UItem.asCustom(chatbotsActivity.emptyView));
                        z4 = true;
                    }
                    chatbotsActivity.editTextDivider.setVisibility(z4 ? 0 : 8);
                    universalAdapter3.whiteSectionEnd();
                }
                String string6 = LocaleController.getString(R.string.BusinessBotLinkInfo2);
                UItem uItem13 = new UItem(7);
                uItem13.text = string6;
                arrayList6.add(uItem13);
                universalAdapter3.whiteSectionStart();
                String string7 = LocaleController.getString(R.string.BusinessBotChats2);
                UItem uItem14 = new UItem(0);
                uItem14.text = string7;
                uItem14.enabled = chatbotsActivity.selectedBot != null;
                arrayList6.add(uItem14);
                UItem uItemAsRadio3 = UItem.asRadio(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                uItemAsRadio3.setChecked(chatbotsActivity.exclude);
                uItemAsRadio3.enabled = chatbotsActivity.selectedBot != null;
                arrayList6.add(uItemAsRadio3);
                UItem uItemAsRadio4 = UItem.asRadio(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                uItemAsRadio4.setChecked(!chatbotsActivity.exclude);
                uItemAsRadio4.enabled = chatbotsActivity.selectedBot != null;
                arrayList6.add(uItemAsRadio4);
                universalAdapter3.whiteSectionEnd();
                UItem uItem15 = new UItem(7);
                uItem15.text = null;
                arrayList6.add(uItem15);
                chatbotsActivity.recipientsHelper.fillItems(arrayList6, universalAdapter3, chatbotsActivity.selectedBot != null);
                String string8 = LocaleController.getString(R.string.BusinessBotChatsInfo2);
                UItem uItem16 = new UItem(7);
                uItem16.text = string8;
                arrayList6.add(uItem16);
                if (chatbotsActivity.selectedBot != null) {
                    universalAdapter3.whiteSectionStart();
                    String string9 = LocaleController.getString(R.string.BusinessBotPermissions);
                    UItem uItem17 = new UItem(0);
                    uItem17.text = string9;
                    arrayList6.add(uItem17);
                    String string10 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = chatbotsActivity.rights;
                    sb.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb.append("/5");
                    String string11 = sb.toString();
                    UItem uItem18 = new UItem(40);
                    uItem18.id = -4;
                    uItem18.text = string10;
                    uItem18.animatedText = string11;
                    TL_account.TL_businessBotRights tL_businessBotRights2 = chatbotsActivity.rights;
                    uItem18.setChecked(tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages);
                    final int i14 = 1;
                    uItem18.collapsed = !chatbotsActivity.expandedMessagesSection;
                    uItem18.clickCallback = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i14) {
                                case 0:
                                    ChatbotsActivity chatbotsActivity2 = chatbotsActivity;
                                    chatbotsActivity2.selectedBot = null;
                                    chatbotsActivity2.listView.adapter.update(true);
                                    chatbotsActivity2.checkDone$6(true);
                                    break;
                                case 1:
                                    ChatbotsActivity chatbotsActivity3 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = chatbotsActivity3.rights;
                                    if (tL_businessBotRights3.reply && tL_businessBotRights3.read_messages && tL_businessBotRights3.delete_received_messages && tL_businessBotRights3.delete_sent_messages) {
                                        tL_businessBotRights3.delete_sent_messages = false;
                                        tL_businessBotRights3.delete_received_messages = false;
                                        tL_businessBotRights3.read_messages = false;
                                        tL_businessBotRights3.reply = false;
                                    } else {
                                        tL_businessBotRights3.delete_sent_messages = true;
                                        tL_businessBotRights3.delete_received_messages = true;
                                        tL_businessBotRights3.read_messages = true;
                                        tL_businessBotRights3.reply = true;
                                    }
                                    chatbotsActivity3.listView.adapter.update(true);
                                    chatbotsActivity3.checkDone$6(true);
                                    break;
                                case 2:
                                    ChatbotsActivity chatbotsActivity4 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = chatbotsActivity4.rights;
                                    if (tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username) {
                                        tL_businessBotRights4.edit_username = false;
                                        tL_businessBotRights4.edit_profile_photo = false;
                                        tL_businessBotRights4.edit_bio = false;
                                        tL_businessBotRights4.edit_name = false;
                                        chatbotsActivity4.listView.adapter.update(true);
                                        chatbotsActivity4.checkDone$6(true);
                                    } else {
                                        chatbotsActivity4.checkAlert(-14, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity4, 2));
                                    }
                                    break;
                                case 3:
                                    ChatbotsActivity chatbotsActivity5 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights5 = chatbotsActivity5.rights;
                                    if (tL_businessBotRights5.view_gifts && tL_businessBotRights5.sell_gifts && tL_businessBotRights5.change_gift_settings && tL_businessBotRights5.transfer_and_upgrade_gifts && tL_businessBotRights5.transfer_stars) {
                                        tL_businessBotRights5.transfer_stars = false;
                                        tL_businessBotRights5.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights5.change_gift_settings = false;
                                        tL_businessBotRights5.sell_gifts = false;
                                        tL_businessBotRights5.view_gifts = false;
                                        chatbotsActivity5.listView.adapter.update(true);
                                        chatbotsActivity5.checkDone$6(true);
                                    } else {
                                        chatbotsActivity5.checkAlert(-17, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity5, 3));
                                    }
                                    break;
                                default:
                                    ChatbotsActivity chatbotsActivity6 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights6 = chatbotsActivity6.rights;
                                    tL_businessBotRights6.manage_stories = !tL_businessBotRights6.manage_stories;
                                    chatbotsActivity6.listView.adapter.update(true);
                                    chatbotsActivity6.checkDone$6(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(uItem18);
                    if (chatbotsActivity.expandedMessagesSection) {
                        UItem uItemAsRoundCheckbox = UItem.asRoundCheckbox(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        uItemAsRoundCheckbox.setChecked(true);
                        uItemAsRoundCheckbox.enabled = false;
                        uItemAsRoundCheckbox.pad = 1;
                        arrayList6.add(uItemAsRoundCheckbox);
                        UItem uItemAsRoundCheckbox2 = UItem.asRoundCheckbox(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        uItemAsRoundCheckbox2.setChecked(chatbotsActivity.rights.reply);
                        uItemAsRoundCheckbox2.pad = 1;
                        arrayList6.add(uItemAsRoundCheckbox2);
                        UItem uItemAsRoundCheckbox3 = UItem.asRoundCheckbox(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        uItemAsRoundCheckbox3.setChecked(chatbotsActivity.rights.read_messages);
                        uItemAsRoundCheckbox3.pad = 1;
                        arrayList6.add(uItemAsRoundCheckbox3);
                        UItem uItemAsRoundCheckbox4 = UItem.asRoundCheckbox(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        uItemAsRoundCheckbox4.setChecked(chatbotsActivity.rights.delete_sent_messages);
                        uItemAsRoundCheckbox4.pad = 1;
                        arrayList6.add(uItemAsRoundCheckbox4);
                        UItem uItemAsRoundCheckbox5 = UItem.asRoundCheckbox(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        uItemAsRoundCheckbox5.setChecked(chatbotsActivity.rights.delete_received_messages);
                        uItemAsRoundCheckbox5.pad = 1;
                        arrayList6.add(uItemAsRoundCheckbox5);
                    }
                    String string12 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = chatbotsActivity.rights;
                    sb2.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb2.append("/4");
                    String string13 = sb2.toString();
                    UItem uItem19 = new UItem(40);
                    uItem19.id = -10;
                    uItem19.text = string12;
                    uItem19.animatedText = string13;
                    TL_account.TL_businessBotRights tL_businessBotRights4 = chatbotsActivity.rights;
                    uItem19.setChecked(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    uItem19.collapsed = !chatbotsActivity.expandedProfileSection;
                    final int i15 = 2;
                    uItem19.clickCallback = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i15) {
                                case 0:
                                    ChatbotsActivity chatbotsActivity2 = chatbotsActivity;
                                    chatbotsActivity2.selectedBot = null;
                                    chatbotsActivity2.listView.adapter.update(true);
                                    chatbotsActivity2.checkDone$6(true);
                                    break;
                                case 1:
                                    ChatbotsActivity chatbotsActivity3 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights5 = chatbotsActivity3.rights;
                                    if (tL_businessBotRights5.reply && tL_businessBotRights5.read_messages && tL_businessBotRights5.delete_received_messages && tL_businessBotRights5.delete_sent_messages) {
                                        tL_businessBotRights5.delete_sent_messages = false;
                                        tL_businessBotRights5.delete_received_messages = false;
                                        tL_businessBotRights5.read_messages = false;
                                        tL_businessBotRights5.reply = false;
                                    } else {
                                        tL_businessBotRights5.delete_sent_messages = true;
                                        tL_businessBotRights5.delete_received_messages = true;
                                        tL_businessBotRights5.read_messages = true;
                                        tL_businessBotRights5.reply = true;
                                    }
                                    chatbotsActivity3.listView.adapter.update(true);
                                    chatbotsActivity3.checkDone$6(true);
                                    break;
                                case 2:
                                    ChatbotsActivity chatbotsActivity4 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights6 = chatbotsActivity4.rights;
                                    if (tL_businessBotRights6.edit_name && tL_businessBotRights6.edit_bio && tL_businessBotRights6.edit_profile_photo && tL_businessBotRights6.edit_username) {
                                        tL_businessBotRights6.edit_username = false;
                                        tL_businessBotRights6.edit_profile_photo = false;
                                        tL_businessBotRights6.edit_bio = false;
                                        tL_businessBotRights6.edit_name = false;
                                        chatbotsActivity4.listView.adapter.update(true);
                                        chatbotsActivity4.checkDone$6(true);
                                    } else {
                                        chatbotsActivity4.checkAlert(-14, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity4, 2));
                                    }
                                    break;
                                case 3:
                                    ChatbotsActivity chatbotsActivity5 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights7 = chatbotsActivity5.rights;
                                    if (tL_businessBotRights7.view_gifts && tL_businessBotRights7.sell_gifts && tL_businessBotRights7.change_gift_settings && tL_businessBotRights7.transfer_and_upgrade_gifts && tL_businessBotRights7.transfer_stars) {
                                        tL_businessBotRights7.transfer_stars = false;
                                        tL_businessBotRights7.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights7.change_gift_settings = false;
                                        tL_businessBotRights7.sell_gifts = false;
                                        tL_businessBotRights7.view_gifts = false;
                                        chatbotsActivity5.listView.adapter.update(true);
                                        chatbotsActivity5.checkDone$6(true);
                                    } else {
                                        chatbotsActivity5.checkAlert(-17, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity5, 3));
                                    }
                                    break;
                                default:
                                    ChatbotsActivity chatbotsActivity6 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights8 = chatbotsActivity6.rights;
                                    tL_businessBotRights8.manage_stories = !tL_businessBotRights8.manage_stories;
                                    chatbotsActivity6.listView.adapter.update(true);
                                    chatbotsActivity6.checkDone$6(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(uItem19);
                    if (chatbotsActivity.expandedProfileSection) {
                        UItem uItemAsRoundCheckbox6 = UItem.asRoundCheckbox(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        uItemAsRoundCheckbox6.setChecked(chatbotsActivity.rights.edit_name);
                        uItemAsRoundCheckbox6.pad = 1;
                        arrayList6.add(uItemAsRoundCheckbox6);
                        UItem uItemAsRoundCheckbox7 = UItem.asRoundCheckbox(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        uItemAsRoundCheckbox7.setChecked(chatbotsActivity.rights.edit_bio);
                        uItemAsRoundCheckbox7.pad = 1;
                        arrayList6.add(uItemAsRoundCheckbox7);
                        UItem uItemAsRoundCheckbox8 = UItem.asRoundCheckbox(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        uItemAsRoundCheckbox8.setChecked(chatbotsActivity.rights.edit_profile_photo);
                        uItemAsRoundCheckbox8.pad = 1;
                        arrayList6.add(uItemAsRoundCheckbox8);
                        UItem uItemAsRoundCheckbox9 = UItem.asRoundCheckbox(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        uItemAsRoundCheckbox9.setChecked(chatbotsActivity.rights.edit_username);
                        uItemAsRoundCheckbox9.pad = 1;
                        arrayList6.add(uItemAsRoundCheckbox9);
                    }
                    String string14 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = chatbotsActivity.rights;
                    sb3.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb3.append("/5");
                    String string15 = sb3.toString();
                    UItem uItem20 = new UItem(40);
                    uItem20.id = -15;
                    uItem20.text = string14;
                    uItem20.animatedText = string15;
                    TL_account.TL_businessBotRights tL_businessBotRights6 = chatbotsActivity.rights;
                    uItem20.setChecked(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    uItem20.collapsed = !chatbotsActivity.expandedGiftsSection;
                    final int i16 = 3;
                    uItem20.clickCallback = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i16) {
                                case 0:
                                    ChatbotsActivity chatbotsActivity2 = chatbotsActivity;
                                    chatbotsActivity2.selectedBot = null;
                                    chatbotsActivity2.listView.adapter.update(true);
                                    chatbotsActivity2.checkDone$6(true);
                                    break;
                                case 1:
                                    ChatbotsActivity chatbotsActivity3 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights7 = chatbotsActivity3.rights;
                                    if (tL_businessBotRights7.reply && tL_businessBotRights7.read_messages && tL_businessBotRights7.delete_received_messages && tL_businessBotRights7.delete_sent_messages) {
                                        tL_businessBotRights7.delete_sent_messages = false;
                                        tL_businessBotRights7.delete_received_messages = false;
                                        tL_businessBotRights7.read_messages = false;
                                        tL_businessBotRights7.reply = false;
                                    } else {
                                        tL_businessBotRights7.delete_sent_messages = true;
                                        tL_businessBotRights7.delete_received_messages = true;
                                        tL_businessBotRights7.read_messages = true;
                                        tL_businessBotRights7.reply = true;
                                    }
                                    chatbotsActivity3.listView.adapter.update(true);
                                    chatbotsActivity3.checkDone$6(true);
                                    break;
                                case 2:
                                    ChatbotsActivity chatbotsActivity4 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights8 = chatbotsActivity4.rights;
                                    if (tL_businessBotRights8.edit_name && tL_businessBotRights8.edit_bio && tL_businessBotRights8.edit_profile_photo && tL_businessBotRights8.edit_username) {
                                        tL_businessBotRights8.edit_username = false;
                                        tL_businessBotRights8.edit_profile_photo = false;
                                        tL_businessBotRights8.edit_bio = false;
                                        tL_businessBotRights8.edit_name = false;
                                        chatbotsActivity4.listView.adapter.update(true);
                                        chatbotsActivity4.checkDone$6(true);
                                    } else {
                                        chatbotsActivity4.checkAlert(-14, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity4, 2));
                                    }
                                    break;
                                case 3:
                                    ChatbotsActivity chatbotsActivity5 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights9 = chatbotsActivity5.rights;
                                    if (tL_businessBotRights9.view_gifts && tL_businessBotRights9.sell_gifts && tL_businessBotRights9.change_gift_settings && tL_businessBotRights9.transfer_and_upgrade_gifts && tL_businessBotRights9.transfer_stars) {
                                        tL_businessBotRights9.transfer_stars = false;
                                        tL_businessBotRights9.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights9.change_gift_settings = false;
                                        tL_businessBotRights9.sell_gifts = false;
                                        tL_businessBotRights9.view_gifts = false;
                                        chatbotsActivity5.listView.adapter.update(true);
                                        chatbotsActivity5.checkDone$6(true);
                                    } else {
                                        chatbotsActivity5.checkAlert(-17, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity5, 3));
                                    }
                                    break;
                                default:
                                    ChatbotsActivity chatbotsActivity6 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights10 = chatbotsActivity6.rights;
                                    tL_businessBotRights10.manage_stories = !tL_businessBotRights10.manage_stories;
                                    chatbotsActivity6.listView.adapter.update(true);
                                    chatbotsActivity6.checkDone$6(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(uItem20);
                    if (chatbotsActivity.expandedGiftsSection) {
                        UItem uItemAsRoundCheckbox10 = UItem.asRoundCheckbox(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        uItemAsRoundCheckbox10.setChecked(chatbotsActivity.rights.view_gifts);
                        uItemAsRoundCheckbox10.pad = 1;
                        arrayList6.add(uItemAsRoundCheckbox10);
                        UItem uItemAsRoundCheckbox11 = UItem.asRoundCheckbox(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        uItemAsRoundCheckbox11.setChecked(chatbotsActivity.rights.sell_gifts);
                        uItemAsRoundCheckbox11.pad = 1;
                        arrayList6.add(uItemAsRoundCheckbox11);
                        UItem uItemAsRoundCheckbox12 = UItem.asRoundCheckbox(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        uItemAsRoundCheckbox12.setChecked(chatbotsActivity.rights.change_gift_settings);
                        uItemAsRoundCheckbox12.pad = 1;
                        arrayList6.add(uItemAsRoundCheckbox12);
                        UItem uItemAsRoundCheckbox13 = UItem.asRoundCheckbox(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        uItemAsRoundCheckbox13.setChecked(chatbotsActivity.rights.transfer_and_upgrade_gifts);
                        uItemAsRoundCheckbox13.pad = 1;
                        arrayList6.add(uItemAsRoundCheckbox13);
                        UItem uItemAsRoundCheckbox14 = UItem.asRoundCheckbox(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        uItemAsRoundCheckbox14.setChecked(chatbotsActivity.rights.transfer_stars);
                        uItemAsRoundCheckbox14.pad = 1;
                        arrayList6.add(uItemAsRoundCheckbox14);
                    }
                    String string16 = LocaleController.getString(R.string.BusinessBotPermissionsStories);
                    UItem uItem21 = new UItem(40);
                    uItem21.id = -21;
                    uItem21.text = string16;
                    uItem21.animatedText = "";
                    uItem21.setChecked(chatbotsActivity.rights.manage_stories);
                    final int i17 = 4;
                    uItem21.clickCallback = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i17) {
                                case 0:
                                    ChatbotsActivity chatbotsActivity2 = chatbotsActivity;
                                    chatbotsActivity2.selectedBot = null;
                                    chatbotsActivity2.listView.adapter.update(true);
                                    chatbotsActivity2.checkDone$6(true);
                                    break;
                                case 1:
                                    ChatbotsActivity chatbotsActivity3 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights7 = chatbotsActivity3.rights;
                                    if (tL_businessBotRights7.reply && tL_businessBotRights7.read_messages && tL_businessBotRights7.delete_received_messages && tL_businessBotRights7.delete_sent_messages) {
                                        tL_businessBotRights7.delete_sent_messages = false;
                                        tL_businessBotRights7.delete_received_messages = false;
                                        tL_businessBotRights7.read_messages = false;
                                        tL_businessBotRights7.reply = false;
                                    } else {
                                        tL_businessBotRights7.delete_sent_messages = true;
                                        tL_businessBotRights7.delete_received_messages = true;
                                        tL_businessBotRights7.read_messages = true;
                                        tL_businessBotRights7.reply = true;
                                    }
                                    chatbotsActivity3.listView.adapter.update(true);
                                    chatbotsActivity3.checkDone$6(true);
                                    break;
                                case 2:
                                    ChatbotsActivity chatbotsActivity4 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights8 = chatbotsActivity4.rights;
                                    if (tL_businessBotRights8.edit_name && tL_businessBotRights8.edit_bio && tL_businessBotRights8.edit_profile_photo && tL_businessBotRights8.edit_username) {
                                        tL_businessBotRights8.edit_username = false;
                                        tL_businessBotRights8.edit_profile_photo = false;
                                        tL_businessBotRights8.edit_bio = false;
                                        tL_businessBotRights8.edit_name = false;
                                        chatbotsActivity4.listView.adapter.update(true);
                                        chatbotsActivity4.checkDone$6(true);
                                    } else {
                                        chatbotsActivity4.checkAlert(-14, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity4, 2));
                                    }
                                    break;
                                case 3:
                                    ChatbotsActivity chatbotsActivity5 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights9 = chatbotsActivity5.rights;
                                    if (tL_businessBotRights9.view_gifts && tL_businessBotRights9.sell_gifts && tL_businessBotRights9.change_gift_settings && tL_businessBotRights9.transfer_and_upgrade_gifts && tL_businessBotRights9.transfer_stars) {
                                        tL_businessBotRights9.transfer_stars = false;
                                        tL_businessBotRights9.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights9.change_gift_settings = false;
                                        tL_businessBotRights9.sell_gifts = false;
                                        tL_businessBotRights9.view_gifts = false;
                                        chatbotsActivity5.listView.adapter.update(true);
                                        chatbotsActivity5.checkDone$6(true);
                                    } else {
                                        chatbotsActivity5.checkAlert(-17, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity5, 3));
                                    }
                                    break;
                                default:
                                    ChatbotsActivity chatbotsActivity6 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights10 = chatbotsActivity6.rights;
                                    tL_businessBotRights10.manage_stories = !tL_businessBotRights10.manage_stories;
                                    chatbotsActivity6.listView.adapter.update(true);
                                    chatbotsActivity6.checkDone$6(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(uItem21);
                    universalAdapter3.whiteSectionEnd();
                    arrayList6.add(UItem.asShadow(-4, null));
                    arrayList6.add(UItem.asShadow(-5, null));
                    arrayList6.add(UItem.asShadow(-6, null));
                    arrayList6.add(UItem.asShadow(-7, null));
                }
                break;
            case 7:
                ((GreetMessagesActivity) this.f$0).fillItems$2((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 8:
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.Business.LocationActivity locationActivity = (org.telegram.ui.Business.LocationActivity) this.f$0;
                String string17 = LocaleController.getString(R.string.BusinessLocation);
                String string18 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i18 = R.raw.biz_map;
                UItem uItem22 = new UItem(2);
                uItem22.text = string17;
                uItem22.animatedText = string18;
                uItem22.iconResId = i18;
                arrayList7.add(uItem22);
                arrayList7.add(UItem.asCustom(locationActivity.editTextContainer));
                UItem uItem23 = new UItem(7);
                uItem23.text = null;
                arrayList7.add(uItem23);
                UItem uItemAsCheck = UItem.asCheck(1, LocaleController.getString(R.string.BusinessLocationMap));
                uItemAsCheck.setChecked(locationActivity.geo != null);
                arrayList7.add(uItemAsCheck);
                if (locationActivity.geo != null) {
                    arrayList7.add(UItem.asCustom(locationActivity.mapPreviewContainer));
                }
                UItem uItem24 = new UItem(7);
                uItem24.text = null;
                arrayList7.add(uItem24);
                boolean z5 = (locationActivity.currentLocation == null || (locationActivity.geo == null && TextUtils.isEmpty(locationActivity.address))) ? false : true;
                locationActivity.clearVisible = z5;
                if (z5) {
                    UItem uItemAsButton3 = UItem.asButton(2, LocaleController.getString(R.string.BusinessLocationClear));
                    z3 = true;
                    uItemAsButton3.red = true;
                    UItem uItemM = ArticleViewer.IBlock.CC.m(arrayList7, uItemAsButton3, 7);
                    uItemM.text = null;
                    arrayList7.add(uItemM);
                } else {
                    z3 = true;
                }
                locationActivity.checkDone$2(z3);
                break;
            case 9:
                ((OpeningHoursActivity) this.f$0).fillItems$4((ArrayList) obj);
                break;
            case 10:
                ArrayList arrayList8 = (ArrayList) obj;
                OpeningHoursDayActivity openingHoursDayActivity = (OpeningHoursDayActivity) this.f$0;
                String string19 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                UItem uItem25 = new UItem(9);
                uItem25.id = -1;
                uItem25.text = string19;
                uItem25.setChecked(openingHoursDayActivity.enabled);
                arrayList8.add(uItem25);
                UItem uItem26 = new UItem(7);
                uItem26.text = null;
                arrayList8.add(uItem26);
                if (openingHoursDayActivity.enabled) {
                    int i19 = 0;
                    while (true) {
                        ArrayList arrayList9 = openingHoursDayActivity.periods;
                        if (i19 >= arrayList9.size()) {
                            if (openingHoursDayActivity.showAddButton()) {
                                UItem uItem27 = new UItem(7);
                                uItem27.text = null;
                                arrayList8.add(uItem27);
                                UItem uItemAsButton4 = UItem.asButton(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                                uItemAsButton4.accent = true;
                                arrayList8.add(uItemAsButton4);
                            }
                            String string20 = LocaleController.getString(R.string.BusinessHoursDayInfo);
                            UItem uItem28 = new UItem(7);
                            uItem28.text = string20;
                            arrayList8.add(uItem28);
                        } else {
                            if (i19 > 0) {
                                UItem uItem29 = new UItem(7);
                                uItem29.text = null;
                                arrayList8.add(uItem29);
                            }
                            OpeningHoursActivity.Period period = (OpeningHoursActivity.Period) arrayList9.get(i19);
                            if (openingHoursDayActivity.is24()) {
                                i2 = 1;
                            } else {
                                int i20 = i19 * 3;
                                arrayList8.add(UItem.asButton(LocaleController.getString(R.string.BusinessHoursDayOpenHour), OpeningHoursActivity.Period.timeToString(period.start), i20));
                                i2 = 1;
                                arrayList8.add(UItem.asButton(LocaleController.getString(R.string.BusinessHoursDayCloseHour), OpeningHoursActivity.Period.timeToString(period.end), i20 + 1));
                                UItem uItemAsButton5 = UItem.asButton(i20 + 2, LocaleController.getString(R.string.Remove));
                                uItemAsButton5.red = true;
                                arrayList8.add(uItemAsButton5);
                            }
                            i19 += i2;
                        }
                    }
                }
                break;
            case 11:
                ((TimezoneSelector) this.f$0).fillItems$6((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 12:
                ChannelMonetizationLayout channelMonetizationLayout = (ChannelMonetizationLayout) this.f$0;
                ArrayList arrayList10 = (ArrayList) obj;
                TLRPC.Chat chat2 = MessagesController.getInstance(channelMonetizationLayout.currentAccount).getChat(Long.valueOf(-channelMonetizationLayout.dialogId));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(channelMonetizationLayout.currentAccount).getChatFull(-channelMonetizationLayout.dialogId);
                int i21 = chatFull != null ? chatFull.stats_dc : -1;
                if (channelMonetizationLayout.tonRevenueAvailable) {
                    arrayList10.add(UItem.asCenterShadow(channelMonetizationLayout.titleInfo));
                    StatisticActivity.ChartViewData chartViewData2 = channelMonetizationLayout.impressionsChart;
                    if (chartViewData2 != null && !chartViewData2.isEmpty) {
                        arrayList10.add(UItem.asChart(5, i21, chartViewData2));
                        arrayList10.add(UItem.asShadow(-1, null));
                    }
                    StatisticActivity.ChartViewData chartViewData3 = channelMonetizationLayout.revenueChart;
                    if (chartViewData3 != null && !chartViewData3.isEmpty) {
                        arrayList10.add(UItem.asChart(2, i21, chartViewData3));
                        arrayList10.add(UItem.asShadow(-2, null));
                    }
                }
                if (channelMonetizationLayout.starsRevenueAvailable && (chartViewData = channelMonetizationLayout.starsRevenueChart) != null && !chartViewData.isEmpty) {
                    arrayList10.add(UItem.asChart(2, i21, chartViewData));
                    arrayList10.add(UItem.asShadow(-3, null));
                }
                if (channelMonetizationLayout.proceedsAvailable) {
                    String string21 = LocaleController.getString(R.string.MonetizationOverview);
                    UItem uItem30 = new UItem(1);
                    uItem30.text = string21;
                    arrayList10.add(uItem30);
                    ChannelMonetizationLayout.ProceedOverview proceedOverview = channelMonetizationLayout.availableValue;
                    UItem uItem31 = new UItem(24);
                    uItem31.object = proceedOverview;
                    arrayList10.add(uItem31);
                    ChannelMonetizationLayout.ProceedOverview proceedOverview2 = channelMonetizationLayout.lastWithdrawalValue;
                    UItem uItem32 = new UItem(24);
                    uItem32.object = proceedOverview2;
                    arrayList10.add(uItem32);
                    ChannelMonetizationLayout.ProceedOverview proceedOverview3 = channelMonetizationLayout.lifetimeValue;
                    UItem uItem33 = new UItem(24);
                    uItem33.object = proceedOverview3;
                    arrayList10.add(uItem33);
                    arrayList10.add(UItem.asShadow(-4, channelMonetizationLayout.proceedsInfo));
                }
                if (chat2 != null && chat2.creator) {
                    if (channelMonetizationLayout.tonRevenueAvailable) {
                        String string22 = LocaleController.getString(R.string.MonetizationBalance);
                        UItem uItem34 = new UItem(1);
                        uItem34.text = string22;
                        arrayList10.add(uItem34);
                        arrayList10.add(UItem.asCustom(channelMonetizationLayout.balanceLayout));
                        arrayList10.add(UItem.asShadow(-5, channelMonetizationLayout.balanceInfo));
                        int i22 = MessagesController.getInstance(channelMonetizationLayout.currentAccount).channelRestrictSponsoredLevelMin;
                        String string23 = LocaleController.getString(R.string.MonetizationSwitchOff);
                        int i23 = channelMonetizationLayout.currentBoostLevel < i22 ? i22 : 0;
                        if (i23 <= 0) {
                            i3 = 1;
                            charSequence = string23;
                        } else {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string23);
                            spannableStringBuilder.append((CharSequence) "  L");
                            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(0, new PeerColorActivity.LevelLock(i23, context, null, false));
                            coloredImageSpan.setTranslateY(AndroidUtilities.dp(1.0f));
                            i3 = 1;
                            spannableStringBuilder.setSpan(coloredImageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            charSequence = spannableStringBuilder;
                        }
                        UItem uItemAsCheck2 = UItem.asCheck(i3, charSequence);
                        uItemAsCheck2.setChecked(channelMonetizationLayout.currentBoostLevel >= i22 && channelMonetizationLayout.switchOffValue);
                        arrayList10.add(uItemAsCheck2);
                        arrayList10.add(UItem.asShadow(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (channelMonetizationLayout.starsRevenueAvailable) {
                        String string24 = LocaleController.getString(R.string.MonetizationStarsBalance);
                        UItem uItem35 = new UItem(1);
                        uItem35.text = string24;
                        arrayList10.add(uItem35);
                        arrayList10.add(UItem.asCustom(3, channelMonetizationLayout.starsBalanceLayout));
                        arrayList10.add(UItem.asShadow(-6, channelMonetizationLayout.starsBalanceInfo));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(channelMonetizationLayout.currentAccount).getChat(Long.valueOf(-channelMonetizationLayout.dialogId))) && MessagesController.getInstance(channelMonetizationLayout.currentAccount).starrefConnectAllowed) {
                    int color = Theme.getColor(Theme.key_color_green, channelMonetizationLayout.resourcesProvider);
                    int i24 = R.drawable.filled_earn_stars;
                    SpannableStringBuilder spannableStringBuilderApplyNewSpan = ChatEditActivity.applyNewSpan(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle));
                    String string25 = LocaleController.getString(R.string.ChannelAffiliateProgramRowText);
                    int i25 = AffiliateProgramFragment.ColorfulTextCell.Factory.$r8$clinit;
                    UItem uItemOfFactory3 = UItem.ofFactory(AffiliateProgramFragment.ColorfulTextCell.Factory.class);
                    uItemOfFactory3.id = 4;
                    uItemOfFactory3.intValue = color;
                    uItemOfFactory3.iconResId = i24;
                    uItemOfFactory3.text = spannableStringBuilderApplyNewSpan;
                    uItemOfFactory3.subtext = string25;
                    arrayList10.add(uItemOfFactory3);
                    arrayList10.add(UItem.asShadow(-7, null));
                }
                if (channelMonetizationLayout.transactionsLayout.hasTransactions()) {
                    ChannelMonetizationLayout.ChannelTransactionsView channelTransactionsView = channelMonetizationLayout.transactionsLayout;
                    int iDp = AndroidUtilities.dp(24.0f);
                    UItem uItem36 = new UItem(-3);
                    uItem36.view = channelTransactionsView;
                    uItem36.intValue = iDp;
                    uItem36.flags = 1;
                    arrayList10.add(uItem36);
                } else {
                    arrayList10.add(UItem.asShadow(-10, null));
                }
                break;
            case 13:
                ArrayList arrayList11 = (ArrayList) obj;
                ChannelMonetizationLayout.ChannelTransactionsView.Page page = (ChannelMonetizationLayout.ChannelTransactionsView.Page) this.f$0;
                ChannelMonetizationLayout.ChannelTransactionsView channelTransactionsView2 = ChannelMonetizationLayout.ChannelTransactionsView.this;
                int i26 = page.type;
                if (i26 == 0) {
                    ArrayList arrayList12 = channelTransactionsView2.starsTransactions;
                    int size4 = arrayList12.size();
                    while (i4 < size4) {
                        Object obj5 = arrayList12.get(i4);
                        i4++;
                        int i27 = StarsIntroActivity.StarsTransactionView.Factory.$r8$clinit;
                        UItem uItemOfFactory4 = UItem.ofFactory(StarsIntroActivity.StarsTransactionView.Factory.class);
                        uItemOfFactory4.object = (TL_stars.StarsTransaction) obj5;
                        uItemOfFactory4.accent = true;
                        arrayList11.add(uItemOfFactory4);
                    }
                    if (!TextUtils.isEmpty(channelTransactionsView2.starsLastOffset)) {
                        arrayList11.add(UItem.asFlicker(arrayList11.size(), 7));
                        arrayList11.add(UItem.asFlicker(arrayList11.size(), 7));
                        arrayList11.add(UItem.asFlicker(arrayList11.size(), 7));
                    }
                } else if (i26 == 1) {
                    ArrayList arrayList13 = channelTransactionsView2.tonTransactions;
                    int size5 = arrayList13.size();
                    while (i4 < size5) {
                        Object obj6 = arrayList13.get(i4);
                        i4++;
                        int i28 = StarsIntroActivity.StarsTransactionView.Factory.$r8$clinit;
                        UItem uItemOfFactory5 = UItem.ofFactory(StarsIntroActivity.StarsTransactionView.Factory.class);
                        uItemOfFactory5.object = (TL_stars.StarsTransaction) obj6;
                        uItemOfFactory5.accent = true;
                        arrayList11.add(uItemOfFactory5);
                    }
                    if (!TextUtils.isEmpty(channelTransactionsView2.tonTransactionsLastOffset)) {
                        arrayList11.add(UItem.asFlicker(arrayList11.size(), 7));
                        arrayList11.add(UItem.asFlicker(arrayList11.size(), 7));
                        arrayList11.add(UItem.asFlicker(arrayList11.size(), 7));
                    }
                }
                break;
            case 14:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ChatEditActivity chatEditActivity = (ChatEditActivity) this.f$0;
                if (tL_error != null) {
                    chatEditActivity.getClass();
                    BulletinFactory.of(chatEditActivity).showForError(false, tL_error);
                }
                AndroidUtilities.removeFromParent(chatEditActivity.communityGapView);
                AndroidUtilities.removeFromParent(chatEditActivity.communityLinkView);
                AndroidUtilities.removeFromParent(chatEditActivity.communityUnlinkCell);
                break;
            case 15:
                run$org$telegram$ui$ChatUsersActivity$$ExternalSyntheticLambda30(obj, obj2);
                break;
            case 16:
                run$org$telegram$ui$ChooseSpeedLayout$$ExternalSyntheticLambda1(obj, obj2);
                break;
            case 17:
                run$org$telegram$ui$Components$AIEditorAlert$$ExternalSyntheticLambda18(obj, obj2);
                break;
            case 18:
                ((AIEditorAlert.AiStyleAlert) this.f$0).fillItems$8((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 19:
                run$org$telegram$ui$Components$AIEditorAlert$CreateAiStyleAlert$$ExternalSyntheticLambda0(obj, obj2);
                break;
            case 20:
                run$org$telegram$ui$Components$AdminLogFilterAlert2$$ExternalSyntheticLambda2(obj, obj2);
                break;
            case 21:
                run$org$telegram$ui$Components$ChatActivityEnterView$$ExternalSyntheticLambda61(obj, obj2);
                break;
            case 22:
                run$org$telegram$ui$Components$ChatAttachAlertAudioLayout$$ExternalSyntheticLambda6(obj, obj2);
                break;
            case 23:
                run$org$telegram$ui$Components$ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda21(obj, obj2);
                break;
            case 24:
                run$org$telegram$ui$Components$CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda3(obj, obj2);
                break;
            case 25:
                run$org$telegram$ui$Components$DialogsBotsAdapter$$ExternalSyntheticLambda4(obj, obj2);
                break;
            case 26:
                run$org$telegram$ui$Components$DialogsChannelsAdapter$$ExternalSyntheticLambda1(obj, obj2);
                break;
            case 27:
                run$org$telegram$ui$Components$EmojiView$$ExternalSyntheticLambda9(obj, obj2);
                break;
            case 28:
                run$org$telegram$ui$Components$EmojiView$EmojiSearchAdapter$$ExternalSyntheticLambda0(obj, obj2);
                break;
            default:
                ArrayList arrayList14 = (ArrayList) obj;
                EmojiView.StickersSearchGridAdapter stickersSearchGridAdapter = (EmojiView.StickersSearchGridAdapter) this.f$0;
                stickersSearchGridAdapter.getClass();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                ArrayList arrayList15 = stickersSearchGridAdapter.localPacks;
                int size6 = arrayList15.size();
                int i29 = 0;
                while (i29 < size6) {
                    Object obj7 = arrayList15.get(i29);
                    i29++;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj7;
                    if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.id) < 0) {
                        longSparseIntArray.append(tL_messages_stickerSet.set.id, 1);
                        boolean z6 = tL_messages_stickerSet.set.id == stickersSearchGridAdapter.selectedPackId;
                        int i30 = EmojiView.FoundStickerPackFactory.$r8$clinit;
                        UItem uItemOfFactory6 = UItem.ofFactory(EmojiView.FoundStickerPackFactory.class);
                        long j4 = tL_messages_stickerSet.set.id;
                        uItemOfFactory6.id = (int) ((j4 >>> 32) ^ j4);
                        uItemOfFactory6.longValue = j4;
                        uItemOfFactory6.object = tL_messages_stickerSet;
                        uItemOfFactory6.checked = z6;
                        arrayList14.add(uItemOfFactory6);
                    }
                }
                ArrayList arrayList16 = stickersSearchGridAdapter.foundEmojiPacks;
                int size7 = arrayList16.size();
                int i31 = 0;
                while (i31 < size7) {
                    Object obj8 = arrayList16.get(i31);
                    i31++;
                    EmojiView.EmojiPackInfo emojiPackInfo = (EmojiView.EmojiPackInfo) obj8;
                    if (longSparseIntArray.indexOfKey(emojiPackInfo.set.id) < 0) {
                        TLRPC.StickerSet stickerSet = emojiPackInfo.set;
                        longSparseIntArray.append(stickerSet.id, 1);
                        arrayList14.add(EmojiView.FoundStickerPackFactory.of(emojiPackInfo.stickerSetCovered, emojiPackInfo, stickerSet.id == stickersSearchGridAdapter.selectedPackId));
                    }
                }
                break;
        }
    }
}
