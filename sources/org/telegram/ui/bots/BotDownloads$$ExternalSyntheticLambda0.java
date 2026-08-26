package org.telegram.ui.bots;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda28;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Storage.CacheModel$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.community.CommunityPendingRequestsActivity;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;
import org.telegram.ui.community.sheet.CommunityInviteOnlySheet;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.RichAIComposeSheet;
import org.telegram.ui.iv.RichAudioCell;
import org.telegram.ui.iv.RichButtonRowCell;
import org.telegram.ui.iv.RichDetailsCell;
import org.telegram.ui.iv.RichDetailsEndCell;
import org.telegram.ui.iv.RichDividerCell;
import org.telegram.ui.iv.RichDocumentCell;
import org.telegram.ui.iv.RichEditorHistory;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda66;
import org.telegram.ui.iv.RichMapCell;
import org.telegram.ui.iv.RichMapCell$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.RichMathCell;
import org.telegram.ui.iv.RichMediaCell;
import org.telegram.ui.iv.RichTableCell;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;
import org.telegram.ui.iv.RichTextCell;
import org.telegram.ui.web.AddressBarList;

public final class BotDownloads$$ExternalSyntheticLambda0 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;

    public BotDownloads$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String lowerCase;
        String upperCase;
        int i;
        int i2;
        UniversalAdapter universalAdapter;
        boolean z;
        ArrayList arrayList;
        int i3;
        int i4;
        boolean z2;
        ?? r12;
        int iIndexOf;
        int i5;
        int i6;
        AddressBarList.BookmarksList bookmarksList;
        ArrayList arrayList2;
        int i7;
        MessageObject messageObject;
        int i8;
        int i9;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        byte b = 7;
        int i10 = 21;
        int i11 = 20;
        int iMax = -1;
        switch (this.$r8$classId) {
            case 0:
                String strSubstring = (String) obj;
                Long l = (Long) obj2;
                StringBuilder sb = new StringBuilder();
                if (l.longValue() > 0) {
                    sb.append("~");
                    sb.append(AndroidUtilities.formatFileSize(l.longValue()));
                }
                if (strSubstring == null) {
                    upperCase = null;
                } else {
                    if (!strSubstring.isEmpty()) {
                        switch (strSubstring.hashCode()) {
                            case -2008589971:
                                if (strSubstring.equals("application/epub+zip")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1719571662:
                                if (strSubstring.equals("application/vnd.oasis.opendocument.text")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1664118616:
                                if (strSubstring.equals("video/3gpp")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1578389996:
                                if (strSubstring.equals("application/vnd.ms-fontobject")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1348237359:
                                if (strSubstring.equals("application/x-cdf")) {
                                    b = 4;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1348236892:
                                if (strSubstring.equals("application/x-csh")) {
                                    b = 5;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1079884372:
                                if (strSubstring.equals("video/x-msvideo")) {
                                    b = 6;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1073633483:
                                if (!strSubstring.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                                    b = -1;
                                }
                                break;
                            case -1071817359:
                                if (strSubstring.equals("application/vnd.ms-powerpoint")) {
                                    b = 8;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1050893613:
                                if (strSubstring.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                                    b = 9;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1007601745:
                                if (strSubstring.equals("audio/x-midi")) {
                                    b = 10;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -958424608:
                                if (strSubstring.equals("text/calendar")) {
                                    b = 11;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -816908365:
                                if (strSubstring.equals("application/x-httpd-php")) {
                                    b = 12;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -648684635:
                                if (strSubstring.equals("audio/3gpp2")) {
                                    b = 13;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -433129473:
                                if (strSubstring.equals("application/vnd.apple.installer+xml")) {
                                    b = 14;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -366307023:
                                if (strSubstring.equals("application/vnd.ms-excel")) {
                                    b = 15;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -48069494:
                                if (strSubstring.equals("video/3gpp2")) {
                                    b = 16;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -43923783:
                                if (strSubstring.equals("application/gzip")) {
                                    b = 17;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -43491031:
                                if (strSubstring.equals("application/x-sh")) {
                                    b = 18;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 187091926:
                                if (strSubstring.equals("audio/ogg")) {
                                    b = 19;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 817335912:
                                if (strSubstring.equals("text/plain")) {
                                    b = 20;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 859118878:
                                if (strSubstring.equals("application/x-abiword")) {
                                    b = 21;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 886992732:
                                if (strSubstring.equals("application/ld+json")) {
                                    b = 22;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 904647503:
                                if (strSubstring.equals("application/msword")) {
                                    b = 23;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1154306387:
                                if (strSubstring.equals("application/x-bzip")) {
                                    b = 24;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1154455342:
                                if (strSubstring.equals("application/x-gzip")) {
                                    b = 25;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1178484637:
                                if (strSubstring.equals("application/octet-stream")) {
                                    b = 26;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1423759679:
                                if (strSubstring.equals("application/x-bzip2")) {
                                    b = 27;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1436962847:
                                if (strSubstring.equals("application/vnd.oasis.opendocument.presentation")) {
                                    b = 28;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1454024983:
                                if (strSubstring.equals("application/x-7z-compressed")) {
                                    b = 29;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1455492626:
                                if (strSubstring.equals("application/x-freearc")) {
                                    b = 30;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1503095341:
                                if (strSubstring.equals("audio/3gpp")) {
                                    b = 31;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1504831518:
                                if (strSubstring.equals("audio/mpeg")) {
                                    b = 32;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1509238306:
                                if (strSubstring.equals("application/vnd.rar")) {
                                    b = 33;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1578362927:
                                if (strSubstring.equals("image/vnd.microsoft.icon")) {
                                    b = 34;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1643664935:
                                if (strSubstring.equals("application/vnd.oasis.opendocument.spreadsheet")) {
                                    b = 35;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1672200517:
                                if (strSubstring.equals("application/vnd.amazon.ebook")) {
                                    b = 36;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1993842850:
                                if (strSubstring.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                                    b = 37;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2049276534:
                                if (strSubstring.equals("application/java-archive")) {
                                    b = 38;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2132236175:
                                if (strSubstring.equals("text/javascript")) {
                                    b = 39;
                                } else {
                                    b = -1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            case 0:
                                lowerCase = "epub";
                                break;
                            case 1:
                                lowerCase = "odt";
                                break;
                            case 2:
                            case 31:
                                lowerCase = "3gp";
                                break;
                            case 3:
                                lowerCase = "eot";
                                break;
                            case 4:
                                lowerCase = "cda";
                                break;
                            case 5:
                                lowerCase = "csh";
                                break;
                            case 6:
                                lowerCase = "avi";
                                break;
                            case 7:
                                lowerCase = "pptx";
                                break;
                            case 8:
                                lowerCase = "ppt";
                                break;
                            case 9:
                                lowerCase = "docx";
                                break;
                            case 10:
                                lowerCase = "midi";
                                break;
                            case 11:
                                lowerCase = "ics";
                                break;
                            case 12:
                                lowerCase = "php";
                                break;
                            case 13:
                            case 16:
                                lowerCase = "3g2";
                                break;
                            case 14:
                                lowerCase = "mpkg";
                                break;
                            case 15:
                                lowerCase = "xls";
                                break;
                            case 17:
                            case 25:
                                lowerCase = "gz";
                                break;
                            case 18:
                                lowerCase = "sh";
                                break;
                            case 19:
                                lowerCase = "opus";
                                break;
                            case 20:
                                lowerCase = "txt";
                                break;
                            case 21:
                                lowerCase = "abw";
                                break;
                            case 22:
                                lowerCase = "jsonld";
                                break;
                            case 23:
                                lowerCase = "doc";
                                break;
                            case 24:
                                lowerCase = "bz";
                                break;
                            case 26:
                                lowerCase = "bin";
                                break;
                            case 27:
                                lowerCase = "bz2";
                                break;
                            case 28:
                                lowerCase = "odp";
                                break;
                            case 29:
                                lowerCase = "7z";
                                break;
                            case 30:
                                lowerCase = "arc";
                                break;
                            case 32:
                                lowerCase = "mp3";
                                break;
                            case 33:
                                lowerCase = "rar";
                                break;
                            case 34:
                                lowerCase = "ico";
                                break;
                            case 35:
                                lowerCase = "ods";
                                break;
                            case 36:
                                lowerCase = "azw";
                                break;
                            case 37:
                                lowerCase = "xlsx";
                                break;
                            case 38:
                                lowerCase = "jar";
                                break;
                            case 39:
                                lowerCase = "js";
                                break;
                            default:
                                if (strSubstring.contains("/")) {
                                    strSubstring = strSubstring.substring(strSubstring.indexOf("/") + 1);
                                }
                                if (strSubstring.contains("-")) {
                                    strSubstring = strSubstring.substring(strSubstring.indexOf("-") + 1);
                                }
                                if (strSubstring.contains("+")) {
                                    strSubstring = strSubstring.substring(0, strSubstring.indexOf("+"));
                                }
                                lowerCase = strSubstring.toLowerCase();
                                break;
                        }
                    } else {
                        lowerCase = "";
                    }
                    upperCase = lowerCase.toUpperCase();
                }
                if (!TextUtils.isEmpty(upperCase)) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(upperCase.toUpperCase());
                }
                if (sb.length() <= 0) {
                    sb.append(LocaleController.getString(R.string.AttachDocument));
                }
                ((AnimatedTextView) this.f$0).setText(sb);
                break;
            case 1:
                ((StarsIntroActivity.GiftStarsSheet) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 2:
                ((StarsIntroActivity.StarsNeededSheet) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 3:
                ((StarsIntroActivity.StarsOptionsSheet) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 4:
                ArrayList arrayList3 = (ArrayList) obj;
                StarsIntroActivity.StarsTransactionsLayout.Page page = (StarsIntroActivity.StarsTransactionsLayout.Page) this.f$0;
                int i12 = page.currentAccount;
                int i13 = page.type;
                long j = page.bot_id;
                if (j != 0) {
                    BotStarsController botStarsController = BotStarsController.getInstance(i12);
                    ArrayList arrayList4 = botStarsController.getTransactionsState(j).transactions[i13];
                    int size = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList4.get(i14);
                        i14++;
                        int i15 = StarsIntroActivity.StarsTransactionView.Factory.$r8$clinit;
                        UItem uItemOfFactory = UItem.ofFactory(StarsIntroActivity.StarsTransactionView.Factory.class);
                        uItemOfFactory.object = (TL_stars.StarsTransaction) obj3;
                        uItemOfFactory.accent = true;
                        arrayList3.add(uItemOfFactory);
                    }
                    if (!botStarsController.getTransactionsState(j).endReached[i13]) {
                        arrayList3.add(UItem.asFlicker(arrayList3.size(), 7));
                        arrayList3.add(UItem.asFlicker(arrayList3.size(), 7));
                        arrayList3.add(UItem.asFlicker(arrayList3.size(), 7));
                    }
                } else {
                    StarsController starsController = StarsController.getInstance(i12, page.ton);
                    ArrayList arrayList5 = starsController.transactions[i13];
                    int size2 = arrayList5.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj4 = arrayList5.get(i16);
                        i16++;
                        int i17 = StarsIntroActivity.StarsTransactionView.Factory.$r8$clinit;
                        UItem uItemOfFactory2 = UItem.ofFactory(StarsIntroActivity.StarsTransactionView.Factory.class);
                        uItemOfFactory2.object = (TL_stars.StarsTransaction) obj4;
                        uItemOfFactory2.accent = false;
                        arrayList3.add(uItemOfFactory2);
                    }
                    if (!starsController.endReached[i13]) {
                        arrayList3.add(UItem.asFlicker(arrayList3.size(), 7));
                        arrayList3.add(UItem.asFlicker(arrayList3.size(), 7));
                        arrayList3.add(UItem.asFlicker(arrayList3.size(), 7));
                    }
                }
                break;
            case 5:
                ArrayList arrayList6 = (ArrayList) obj;
                ((BotPreviewsEditContainer.ChooseLanguageSheet) this.f$0).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size3 = languages.size();
                int i18 = 0;
                while (i18 < size3) {
                    TranslateController.Language language = languages.get(i18);
                    i18++;
                    int i19 = BotPreviewsEditContainer.ChooseLanguageSheet.LanguageView.Factory.$r8$clinit;
                    UItem uItemOfFactory3 = UItem.ofFactory(BotPreviewsEditContainer.ChooseLanguageSheet.LanguageView.Factory.class);
                    uItemOfFactory3.object = language;
                    arrayList6.add(uItemOfFactory3);
                }
                break;
            case 6:
                ((TONIntroActivity) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 7:
                ArrayList arrayList7 = (ArrayList) obj;
                TONIntroActivity.StarsNeededSheet starsNeededSheet = (TONIntroActivity.StarsNeededSheet) this.f$0;
                arrayList7.add(UItem.asCustom(starsNeededSheet.headerView));
                arrayList7.add(UItem.asCustom(starsNeededSheet.footerView));
                break;
            case 8:
                ((AffiliateProgramFragment) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 9:
                ((BotBiometrySettings) this.f$0).fillItems$33((ArrayList) obj);
                break;
            case 10:
                ArrayList arrayList8 = (ArrayList) obj;
                BotShareSheet botShareSheet = (BotShareSheet) this.f$0;
                arrayList8.add(UItem.asCustom(-1, botShareSheet.chatView));
                arrayList8.add(UItem.asShadow(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, botShareSheet.botName))));
                break;
            case 11:
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                BotWebViewSheet botWebViewSheet = (BotWebViewSheet) this.f$0;
                if (tL_error != null) {
                    botWebViewSheet.getClass();
                } else {
                    WebViewRequestProps webViewRequestProps = botWebViewSheet.requestProps;
                    if (webViewRequestProps != null) {
                        webViewRequestProps.response = tL_webViewResultUrl;
                        webViewRequestProps.responseTime = System.currentTimeMillis();
                        botWebViewSheet.loadFromResponse();
                    }
                }
                break;
            case 12:
                ((ChannelAffiliateProgramsFragment) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 13:
                ((SuggestedAffiliateProgramsFragment) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 14:
                ((CommunityPendingRequestsActivity) this.f$0).pendingRequestsList.fillItems((ArrayList) obj);
                break;
            case 15:
                ArrayList arrayList9 = (ArrayList) obj;
                CommunityAddOptionsSheet communityAddOptionsSheet = (CommunityAddOptionsSheet) this.f$0;
                arrayList9.add(UItem.asSpace(0, AndroidUtilities.dp(12.0f)));
                arrayList9.add(UItem.asCustom(1, communityAddOptionsSheet.cell));
                arrayList9.add(UItem.asSpace(2, AndroidUtilities.dp(12.0f)));
                arrayList9.add(UItem.asHeader(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
                communityAddOptionsSheet.visibleRow = arrayList9.size();
                String string = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
                boolean z7 = communityAddOptionsSheet.isBot;
                arrayList9.add(UItem.asRadio2(151, string, LocaleController.getString(z7 ? R.string.CommunityChatVisibilityVisibleBotInfo : R.string.CommunityChatVisibilityVisibleInfo)).setChecked(!communityAddOptionsSheet.isHidden));
                arrayList9.add(UItem.asRadio2(150, LocaleController.getString(R.string.CommunityChatVisibilityHidden), LocaleController.getString(z7 ? R.string.CommunityChatVisibilityHiddenBotInfo : R.string.CommunityChatVisibilityHiddenInfo)).setChecked(communityAddOptionsSheet.isHidden));
                arrayList9.add(UItem.asShadow(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
                break;
            case 16:
                ((ArrayList) obj).add(UItem.asCustom(0, ((CommunityInviteOnlySheet) this.f$0).cell));
                break;
            case 17:
                Utilities.themeQueue.postRunnable(new RichTableCell$$ExternalSyntheticLambda3(i10, (String[]) this.f$0, (Utilities.Callback2) obj2));
                break;
            case 18:
                ArrayList arrayList10 = (ArrayList) obj;
                RichAIComposeSheet richAIComposeSheet = (RichAIComposeSheet) this.f$0;
                arrayList10.add(UItem.asCustom(1, richAIComposeSheet.topView));
                arrayList10.add(UItem.asCustom(3, richAIComposeSheet.promptBox));
                if (richAIComposeSheet.result != null) {
                    arrayList10.add(UItem.asCustom(2, richAIComposeSheet.previewBox));
                }
                break;
            case 19:
                ArrayList arrayList11 = (ArrayList) obj;
                UniversalAdapter universalAdapter2 = (UniversalAdapter) obj2;
                RichEditorListView richEditorListView = ((RichEditorListView[]) this.f$0)[0];
                if (richEditorListView != null) {
                    richEditorListView.assignContainers();
                    ArrayList arrayList12 = richEditorListView.itemRows;
                    arrayList12.clear();
                    HashMap map = new HashMap();
                    int i20 = 0;
                    int i21 = 0;
                    while (true) {
                        ArrayList arrayList13 = richEditorListView.rows;
                        if (i20 >= arrayList13.size()) {
                            boolean z8 = i21 == 1;
                            ArrayList arrayList14 = new ArrayList();
                            int i22 = 0;
                            boolean z9 = false;
                            BlockRow blockRow = null;
                            int size4 = -1;
                            while (i22 < arrayList13.size()) {
                                BlockRow blockRow2 = (BlockRow) arrayList13.get(i22);
                                if (blockRow2.detailsEnd) {
                                    boolean z10 = size4 != iMax;
                                    if (!arrayList14.isEmpty()) {
                                        Fragment$$ExternalSyntheticOutline0.m81m(1, arrayList14);
                                        iMax = -1;
                                    }
                                    if (size4 == iMax || arrayList14.size() >= size4) {
                                        if (z10) {
                                            universalAdapter = universalAdapter2;
                                        } else {
                                            if (z9) {
                                                universalAdapter2.reorderSectionEnd();
                                                z9 = false;
                                            }
                                            int i23 = RichDetailsEndCell.Factory.$r8$clinit;
                                            UItem uItemOfFactory4 = UItem.ofFactory(RichDetailsEndCell.Factory.class);
                                            uItemOfFactory4.object = blockRow2;
                                            arrayList11.add(uItemOfFactory4);
                                            arrayList12.add(blockRow2);
                                            universalAdapter = universalAdapter2;
                                        }
                                        z = z8;
                                        arrayList = arrayList14;
                                    } else {
                                        universalAdapter = universalAdapter2;
                                        z = z8;
                                        arrayList = arrayList14;
                                        size4 = -1;
                                    }
                                } else {
                                    boolean z11 = size4 != iMax;
                                    if (RichEditorListView.isDetailsHeader(blockRow2)) {
                                        if (z11) {
                                            universalAdapter = universalAdapter2;
                                        } else {
                                            boolean z12 = ((TL_iv.pageBlockDetails) blockRow2.block).open;
                                            if (!arrayList14.isEmpty() || z12) {
                                                if (z9) {
                                                    universalAdapter2.reorderSectionEnd();
                                                    z9 = false;
                                                }
                                            } else if (!z9) {
                                                universalAdapter2.reorderSectionStart();
                                                z9 = true;
                                            }
                                            int i24 = RichDetailsCell.Factory.$r8$clinit;
                                            UItem uItemOfFactory5 = UItem.ofFactory(RichDetailsCell.Factory.class);
                                            uItemOfFactory5.object = blockRow2;
                                            universalAdapter = universalAdapter2;
                                            uItemOfFactory5.object2 = richEditorListView.detailsDelegate;
                                            arrayList11.add(uItemOfFactory5);
                                            arrayList12.add(blockRow2);
                                            if (!z12) {
                                                size4 = arrayList14.size() + 1;
                                            }
                                        }
                                        arrayList14.add(blockRow2);
                                    } else {
                                        universalAdapter = universalAdapter2;
                                        if (!z11) {
                                            ArrayList arrayList15 = blockRow2.quoteIds;
                                            if (blockRow != null) {
                                                ArrayList arrayList16 = blockRow.quoteIds;
                                                int size5 = arrayList16.size();
                                                z = z8;
                                                int i25 = 0;
                                                while (true) {
                                                    arrayList = arrayList14;
                                                    if (i25 >= size5 || i25 >= arrayList15.size()) {
                                                        i3 = size5;
                                                    } else {
                                                        i3 = size5;
                                                        if (((Long) arrayList16.get(i25)).equals(arrayList15.get(i25))) {
                                                            i25++;
                                                            arrayList14 = arrayList;
                                                            size5 = i3;
                                                        }
                                                    }
                                                }
                                                int i26 = i3 - 1;
                                                while (i26 >= i25) {
                                                    Long l2 = (Long) arrayList16.get(i26);
                                                    l2.getClass();
                                                    Integer num = (Integer) map.get(l2);
                                                    int i27 = i25;
                                                    if (num != null && (num.intValue() >= 2 || i26 > 0 || richEditorListView.quoteAuthors.containsKey(l2))) {
                                                        if (z9) {
                                                            universalAdapter.reorderSectionEnd();
                                                            z9 = false;
                                                        }
                                                    }
                                                    i26--;
                                                    arrayList16 = arrayList16;
                                                    i25 = i27;
                                                }
                                            } else {
                                                z = z8;
                                                arrayList = arrayList14;
                                            }
                                            if (blockRow != null) {
                                                richEditorListView.injectClosingQuoteAuthors(blockRow, arrayList15, map, arrayList11);
                                            }
                                            if (arrayList.isEmpty()) {
                                                if (!z9) {
                                                    universalAdapter.reorderSectionStart();
                                                    z9 = true;
                                                }
                                            } else if (z9) {
                                                universalAdapter.reorderSectionEnd();
                                                z9 = false;
                                            }
                                            TL_iv.PageBlock pageBlock = blockRow2.block;
                                            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                                                int i28 = RichDividerCell.Factory.$r8$clinit;
                                                UItem uItemOfFactory6 = UItem.ofFactory(RichDividerCell.Factory.class);
                                                uItemOfFactory6.object = blockRow2;
                                                uItemOfFactory6.object2 = richEditorListView.dividerDelegate;
                                                arrayList11.add(uItemOfFactory6);
                                            } else if (RichEditorListView.isMedia(pageBlock)) {
                                                int i29 = RichMediaCell.Factory.$r8$clinit;
                                                UItem uItemOfFactory7 = UItem.ofFactory(RichMediaCell.Factory.class);
                                                uItemOfFactory7.id = (int) blockRow2.id;
                                                uItemOfFactory7.object = blockRow2;
                                                uItemOfFactory7.object2 = richEditorListView.mediaDelegate;
                                                arrayList11.add(uItemOfFactory7);
                                            } else {
                                                TL_iv.PageBlock pageBlock2 = blockRow2.block;
                                                if (pageBlock2 instanceof TL_iv.pageBlockAudio) {
                                                    int i30 = RichAudioCell.Factory.$r8$clinit;
                                                    UItem uItemOfFactory8 = UItem.ofFactory(RichAudioCell.Factory.class);
                                                    uItemOfFactory8.object = blockRow2;
                                                    uItemOfFactory8.object2 = richEditorListView.audioDelegate;
                                                    arrayList11.add(uItemOfFactory8);
                                                } else if (pageBlock2 instanceof TL_iv.pageBlockDocument) {
                                                    int i31 = RichDocumentCell.Factory.$r8$clinit;
                                                    UItem uItemOfFactory9 = UItem.ofFactory(RichDocumentCell.Factory.class);
                                                    uItemOfFactory9.object = blockRow2;
                                                    uItemOfFactory9.object2 = richEditorListView.documentDelegate;
                                                    arrayList11.add(uItemOfFactory9);
                                                } else if (pageBlock2 instanceof TL_iv.pageBlockMap) {
                                                    int i32 = RichMapCell.Factory.$r8$clinit;
                                                    UItem uItemOfFactory10 = UItem.ofFactory(RichMapCell.Factory.class);
                                                    uItemOfFactory10.object = blockRow2;
                                                    uItemOfFactory10.object2 = richEditorListView.mapDelegate;
                                                    arrayList11.add(uItemOfFactory10);
                                                } else if (pageBlock2 instanceof TL_iv.pageBlockMath) {
                                                    int i33 = RichMathCell.Factory.$r8$clinit;
                                                    UItem uItemOfFactory11 = UItem.ofFactory(RichMathCell.Factory.class);
                                                    uItemOfFactory11.object = blockRow2;
                                                    uItemOfFactory11.object2 = richEditorListView.mathDelegate;
                                                    arrayList11.add(uItemOfFactory11);
                                                } else if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                                    int i34 = RichTableCell.Factory.$r8$clinit;
                                                    UItem uItemOfFactory12 = UItem.ofFactory(RichTableCell.Factory.class);
                                                    uItemOfFactory12.object = blockRow2;
                                                    uItemOfFactory12.object2 = richEditorListView.tableDelegate;
                                                    arrayList11.add(uItemOfFactory12);
                                                } else if (pageBlock2 instanceof TL_iv.pageBlockButtonRow) {
                                                    int i35 = RichButtonRowCell.Factory.$r8$clinit;
                                                    UItem uItemOfFactory13 = UItem.ofFactory(RichButtonRowCell.Factory.class);
                                                    uItemOfFactory13.object = blockRow2;
                                                    uItemOfFactory13.object2 = richEditorListView.buttonRowDelegate;
                                                    arrayList11.add(uItemOfFactory13);
                                                } else {
                                                    blockRow2.firstBlock = i22 == 0;
                                                    blockRow2.singleParagraph = z && (pageBlock2 instanceof TL_iv.pageBlockParagraph);
                                                    boolean z13 = arrayList13.size() == 2 && i22 == 1 && (blockRow2.block instanceof TL_iv.pageBlockParagraph) && (((BlockRow) arrayList13.get(0)).block instanceof TL_iv.pageBlockHeading1);
                                                    int i36 = RichTextCell.Factory.$r8$clinit;
                                                    UItem uItemOfFactory14 = UItem.ofFactory(RichTextCell.Factory.class);
                                                    uItemOfFactory14.object = blockRow2;
                                                    uItemOfFactory14.object2 = richEditorListView.cellDelegate;
                                                    uItemOfFactory14.red = z13;
                                                    arrayList11.add(uItemOfFactory14);
                                                }
                                            }
                                            arrayList12.add(blockRow2);
                                            blockRow = blockRow2;
                                        }
                                    }
                                    z = z8;
                                    arrayList = arrayList14;
                                }
                                i22++;
                                universalAdapter2 = universalAdapter;
                                z8 = z;
                                arrayList14 = arrayList;
                                iMax = -1;
                            }
                            UniversalAdapter universalAdapter3 = universalAdapter2;
                            if (z9) {
                                universalAdapter3.reorderSectionEnd();
                            }
                            if (blockRow != null) {
                                richEditorListView.injectClosingQuoteAuthors(blockRow, RichEditorListView.EMPTY_QUOTE_IDS, map, arrayList11);
                            }
                            int i37 = 0;
                            while (i37 < arrayList12.size()) {
                                BlockRow blockRow3 = (BlockRow) arrayList12.get(i37);
                                blockRow3.quoteFirst = false;
                                blockRow3.quoteLast = false;
                                blockRow3.quoteTopEdge = 0;
                                blockRow3.quoteBottomEdge = 0;
                                ArrayList arrayList17 = blockRow3.quoteIds;
                                int size6 = arrayList17.size();
                                if (size6 != 0) {
                                    BlockRow blockRow4 = i37 > 0 ? (BlockRow) arrayList12.get(i37 - 1) : null;
                                    int i38 = i37 + 1;
                                    BlockRow blockRow5 = i38 < arrayList12.size() ? (BlockRow) arrayList12.get(i38) : null;
                                    if (blockRow4 == null) {
                                        i = 0;
                                    } else {
                                        int size7 = arrayList17.size();
                                        ArrayList arrayList18 = blockRow4.quoteIds;
                                        int iMin = Math.min(size7, arrayList18.size());
                                        i = 0;
                                        while (i < iMin && ((Long) arrayList17.get(i)).equals(arrayList18.get(i))) {
                                            i++;
                                        }
                                    }
                                    blockRow3.quoteTopEdge = size6 - i;
                                    if (blockRow5 == null) {
                                        i2 = 0;
                                    } else {
                                        int size8 = arrayList17.size();
                                        ArrayList arrayList19 = blockRow5.quoteIds;
                                        int iMin2 = Math.min(size8, arrayList19.size());
                                        i2 = 0;
                                        while (i2 < iMin2 && ((Long) arrayList17.get(i2)).equals(arrayList19.get(i2))) {
                                            i2++;
                                        }
                                    }
                                    int i39 = size6 - i2;
                                    blockRow3.quoteBottomEdge = i39;
                                    blockRow3.quoteFirst = blockRow3.quoteTopEdge > 0;
                                    blockRow3.quoteLast = i39 > 0;
                                }
                                i37++;
                            }
                        } else {
                            BlockRow blockRow6 = (BlockRow) arrayList13.get(i20);
                            if (blockRow6.detailsEnd) {
                                i4 = 1;
                            } else {
                                int i40 = 0;
                                while (true) {
                                    ArrayList arrayList20 = blockRow6.quoteIds;
                                    if (i40 < arrayList20.size()) {
                                        Map.EL.merge(map, (Long) arrayList20.get(i40), 1, new RichEditorListView$$ExternalSyntheticLambda66());
                                        i40++;
                                    } else {
                                        i4 = 1;
                                        if (blockRow6.block instanceof TL_iv.pageBlockParagraph) {
                                            i21++;
                                        }
                                    }
                                }
                            }
                            i20 += i4;
                        }
                    }
                }
                break;
            case 20:
                ((Integer) obj).getClass();
                ArrayList arrayList21 = (ArrayList) obj2;
                RichEditorListView richEditorListView2 = (RichEditorListView) this.f$0;
                richEditorListView2.getClass();
                ArrayList arrayList22 = new ArrayList(arrayList21.size());
                int size9 = arrayList21.size();
                int i41 = 0;
                while (i41 < size9) {
                    Object obj5 = arrayList21.get(i41);
                    i41++;
                    Object obj6 = ((UItem) obj5).object;
                    if (obj6 instanceof BlockRow) {
                        arrayList22.add((BlockRow) obj6);
                    }
                }
                if (arrayList22.size() >= 2) {
                    ArrayList arrayList23 = new ArrayList();
                    int size10 = arrayList22.size();
                    int iMin3 = Integer.MAX_VALUE;
                    int i42 = 0;
                    int i43 = 0;
                    while (true) {
                        ArrayList arrayList24 = richEditorListView2.rows;
                        if (i42 < size10) {
                            Object obj7 = arrayList22.get(i42);
                            i42++;
                            BlockRow blockRow7 = (BlockRow) obj7;
                            int iIndexOf2 = arrayList24.indexOf(blockRow7);
                            if (iIndexOf2 >= 0) {
                                int size11 = iIndexOf2 + 1;
                                if (RichEditorListView.isDetailsHeader(blockRow7) && !((TL_iv.pageBlockDetails) blockRow7.block).open) {
                                    int iMatchingDetailsEnd = richEditorListView2.matchingDetailsEnd(iIndexOf2);
                                    size11 = iMatchingDetailsEnd >= arrayList24.size() ? arrayList24.size() : iMatchingDetailsEnd + 1;
                                }
                                arrayList23.add(new ArrayList(arrayList24.subList(iIndexOf2, size11)));
                                iMin3 = Math.min(iMin3, iIndexOf2);
                                iMax = Math.max(iMax, size11);
                                i43 += size11 - iIndexOf2;
                            }
                            break;
                        } else if (i43 == iMax - iMin3) {
                            ArrayList arrayList25 = new ArrayList(i43);
                            int size12 = arrayList23.size();
                            int i44 = 0;
                            while (i44 < size12) {
                                Object obj8 = arrayList23.get(i44);
                                i44++;
                                arrayList25.addAll((ArrayList) obj8);
                            }
                            for (int i45 = 0; i45 < arrayList25.size(); i45++) {
                                if (arrayList24.get(iMin3 + i45) != arrayList25.get(i45)) {
                                    RichEditorHistory richEditorHistory = richEditorListView2.history;
                                    if (richEditorHistory != null) {
                                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                                        richEditorHistory.commit();
                                    }
                                    for (int i46 = 0; i46 < arrayList25.size(); i46++) {
                                        arrayList24.set(iMin3 + i46, (BlockRow) arrayList25.get(i46));
                                    }
                                    BlockRow blockRow8 = richEditorListView2.draggingRow;
                                    if (blockRow8 != null && (iIndexOf = arrayList24.indexOf(blockRow8)) >= 0) {
                                        ArrayList arrayList26 = RichEditorListView.EMPTY_QUOTE_IDS;
                                        ArrayList arrayList27 = iIndexOf > 0 ? ((BlockRow) arrayList24.get(iIndexOf - 1)).quoteIds : arrayList26;
                                        int i47 = iIndexOf + 1;
                                        if (i47 < arrayList24.size()) {
                                            arrayList26 = ((BlockRow) arrayList24.get(i47)).quoteIds;
                                        }
                                        if (arrayList27.size() < arrayList26.size()) {
                                            arrayList27 = arrayList26;
                                        }
                                        ArrayList arrayList28 = blockRow8.quoteIds;
                                        if (arrayList28.equals(arrayList27)) {
                                            z2 = false;
                                        } else {
                                            arrayList28.clear();
                                            arrayList28.addAll(arrayList27);
                                            z2 = true;
                                        }
                                    } else {
                                        z2 = false;
                                    }
                                    boolean zCollapseSingleBlockQuotes = richEditorListView2.collapseSingleBlockQuotes();
                                    int i48 = 0;
                                    while (i48 < arrayList24.size()) {
                                        BlockRow blockRow9 = (BlockRow) arrayList24.get(i48);
                                        if (!blockRow9.detailsEnd && !RichEditorListView.isDetailsHeader(blockRow9)) {
                                            BlockRow blockRow10 = i48 > 0 ? (BlockRow) arrayList24.get(i48 - 1) : null;
                                            int iMax2 = blockRow10 != null ? Math.max(0, blockRow10.level) : 0;
                                            if (RichEditorListView.isNonText(blockRow9.block)) {
                                                blockRow9.level = iMax2;
                                                if (iMax2 > 0) {
                                                    blockRow9.num = blockRow10.num > 0 ? 1 : 0;
                                                    r12 = 0;
                                                    blockRow9.checkbox = false;
                                                    blockRow9.checked = false;
                                                } else {
                                                    r12 = 0;
                                                }
                                            } else {
                                                r12 = 0;
                                                r12 = 0;
                                                int i49 = iMax2 + 1;
                                                if (blockRow9.level > i49) {
                                                    blockRow9.level = i49;
                                                }
                                            }
                                            if (blockRow9.level <= 0) {
                                                blockRow9.level = r12;
                                                blockRow9.num = r12;
                                                blockRow9.checkbox = r12;
                                                blockRow9.checked = r12;
                                            }
                                        }
                                        i48++;
                                    }
                                    richEditorListView2.renumberAllRuns();
                                    richEditorListView2.assignContainers();
                                    if (z2 || zCollapseSingleBlockQuotes) {
                                        richEditorListView2.adapter.update(true);
                                        richEditorListView2.resyncInsetCells();
                                    } else {
                                        richEditorListView2.resyncInsetCells();
                                    }
                                    RichEditorHistory richEditorHistory2 = richEditorListView2.history;
                                    if (richEditorHistory2 != null) {
                                        richEditorHistory2.record();
                                    }
                                }
                                break;
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList29 = (ArrayList) obj;
                final AddressBarList addressBarList = (AddressBarList) this.f$0;
                boolean z14 = addressBarList.hideCurrent;
                ArrayList arrayList30 = addressBarList.suggestions;
                if (!z14 && arrayList30.isEmpty()) {
                    arrayList29.add(UItem.asCustom(addressBarList.currentContainer));
                }
                SharedPreferences sharedPreferences = addressBarList.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList31 = new ArrayList();
                String string2 = sharedPreferences.getString("queries_json", null);
                if (string2 != null) {
                    try {
                        ArrayList arrayList32 = new ArrayList();
                        JSONArray jSONArray = new JSONArray(string2);
                        for (int i50 = 0; i50 < jSONArray.length(); i50++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i50);
                            try {
                                AddressBarList.QueryEntry queryEntry = new AddressBarList.QueryEntry(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                                queryEntry.rank = jSONObject.optDouble("rank", 0.0d);
                                arrayList32.add(queryEntry);
                            } catch (Exception unused) {
                                arrayList30.size();
                                arrayList31.size();
                                if (!arrayList30.isEmpty()) {
                                    arrayList29.add(UItem.asCustom(addressBarList.space));
                                }
                                for (i5 = 0; i5 < arrayList30.size(); i5++) {
                                    final String str = (String) arrayList30.get(i5);
                                    if (i5 == 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i5 == arrayList30.size() - 1) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    final int i51 = 0;
                                    View.OnClickListener onClickListener = new View.OnClickListener() {
                                        @Override
                                        public final void onClick(View view) {
                                            switch (i51) {
                                                case 0:
                                                    ArticleViewer$$ExternalSyntheticLambda28 articleViewer$$ExternalSyntheticLambda28 = addressBarList.onQueryInsertClick;
                                                    if (articleViewer$$ExternalSyntheticLambda28 != null) {
                                                        articleViewer$$ExternalSyntheticLambda28.run(str);
                                                    }
                                                    break;
                                                default:
                                                    ArticleViewer$$ExternalSyntheticLambda28 articleViewer$$ExternalSyntheticLambda29 = addressBarList.onQueryInsertClick;
                                                    if (articleViewer$$ExternalSyntheticLambda29 != null) {
                                                        articleViewer$$ExternalSyntheticLambda29.run(str);
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    int i52 = AddressBarList.Address2View.Factory.$r8$clinit;
                                    UItem uItemOfFactory15 = UItem.ofFactory(AddressBarList.Address2View.Factory.class);
                                    uItemOfFactory15.intValue = 1;
                                    uItemOfFactory15.text = str;
                                    uItemOfFactory15.clickCallback = onClickListener;
                                    uItemOfFactory15.accent = z5;
                                    uItemOfFactory15.red = z6;
                                    uItemOfFactory15.object = Boolean.TRUE;
                                    uItemOfFactory15.object2 = addressBarList;
                                    arrayList29.add(uItemOfFactory15);
                                }
                                i6 = 1;
                                if (!arrayList31.isEmpty()) {
                                    arrayList29.add(UItem.asGraySection(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new RichMapCell$$ExternalSyntheticLambda0(addressBarList, i6)));
                                    for (i9 = 0; i9 < arrayList31.size(); i9++) {
                                        final String str2 = (String) arrayList31.get(i9);
                                        if (i9 == 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        final int i53 = 1;
                                        if (i9 == arrayList31.size() - 1) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        View.OnClickListener onClickListener2 = new View.OnClickListener() {
                                            @Override
                                            public final void onClick(View view) {
                                                switch (i53) {
                                                    case 0:
                                                        ArticleViewer$$ExternalSyntheticLambda28 articleViewer$$ExternalSyntheticLambda28 = addressBarList.onQueryInsertClick;
                                                        if (articleViewer$$ExternalSyntheticLambda28 != null) {
                                                            articleViewer$$ExternalSyntheticLambda28.run(str2);
                                                        }
                                                        break;
                                                    default:
                                                        ArticleViewer$$ExternalSyntheticLambda28 articleViewer$$ExternalSyntheticLambda29 = addressBarList.onQueryInsertClick;
                                                        if (articleViewer$$ExternalSyntheticLambda29 != null) {
                                                            articleViewer$$ExternalSyntheticLambda29.run(str2);
                                                        }
                                                        break;
                                                }
                                            }
                                        };
                                        int i54 = AddressBarList.Address2View.Factory.$r8$clinit;
                                        UItem uItemOfFactory16 = UItem.ofFactory(AddressBarList.Address2View.Factory.class);
                                        uItemOfFactory16.intValue = 0;
                                        uItemOfFactory16.text = str2;
                                        uItemOfFactory16.clickCallback = onClickListener2;
                                        uItemOfFactory16.accent = z3;
                                        uItemOfFactory16.red = z4;
                                        uItemOfFactory16.object = Boolean.TRUE;
                                        uItemOfFactory16.object2 = addressBarList;
                                        arrayList29.add(uItemOfFactory16);
                                    }
                                }
                                bookmarksList = addressBarList.bookmarksList;
                                if (bookmarksList != null) {
                                    arrayList2 = bookmarksList.links;
                                    if (arrayList2.isEmpty()) {
                                        return;
                                    }
                                    arrayList29.add(UItem.asGraySection(LocaleController.getString(R.string.WebSectionBookmarks)));
                                    i7 = 0;
                                    while (i7 < arrayList2.size()) {
                                        messageObject = (MessageObject) arrayList2.get(i7);
                                        if (TextUtils.isEmpty(AddressBarList.getLink(messageObject))) {
                                            i8 = 1;
                                        } else {
                                            int i55 = AddressBarList.BookmarkView.Factory.$r8$clinit;
                                            UItem uItemOfFactory17 = UItem.ofFactory(AddressBarList.BookmarkView.Factory.class);
                                            uItemOfFactory17.intValue = 3;
                                            i8 = 1;
                                            uItemOfFactory17.accent = true;
                                            uItemOfFactory17.object2 = messageObject;
                                            arrayList29.add(uItemOfFactory17);
                                        }
                                        i7 += i8;
                                    }
                                    if (bookmarksList.endReached) {
                                        return;
                                    }
                                    arrayList29.add(UItem.asFlicker(arrayList29.size(), 32));
                                    arrayList29.add(UItem.asFlicker(arrayList29.size(), 32));
                                    arrayList29.add(UItem.asFlicker(arrayList29.size(), 32));
                                }
                                return;
                            }
                        }
                        Collections.sort(arrayList32, new CacheModel$$ExternalSyntheticLambda0(i11));
                        int size13 = arrayList32.size();
                        int i56 = 0;
                        while (i56 < size13) {
                            Object obj9 = arrayList32.get(i56);
                            i56++;
                            AddressBarList.QueryEntry queryEntry2 = (AddressBarList.QueryEntry) obj9;
                            if (arrayList31.size() < 20) {
                                arrayList31.add(queryEntry2.query);
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
                arrayList30.size();
                arrayList31.size();
                if (!arrayList30.isEmpty()) {
                    arrayList29.add(UItem.asCustom(addressBarList.space));
                }
                while (i5 < arrayList30.size()) {
                    final String str3 = (String) arrayList30.get(i5);
                    if (i5 == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i5 == arrayList30.size() - 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    final int i57 = 0;
                    View.OnClickListener onClickListener3 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i57) {
                                case 0:
                                    ArticleViewer$$ExternalSyntheticLambda28 articleViewer$$ExternalSyntheticLambda28 = addressBarList.onQueryInsertClick;
                                    if (articleViewer$$ExternalSyntheticLambda28 != null) {
                                        articleViewer$$ExternalSyntheticLambda28.run(str3);
                                    }
                                    break;
                                default:
                                    ArticleViewer$$ExternalSyntheticLambda28 articleViewer$$ExternalSyntheticLambda29 = addressBarList.onQueryInsertClick;
                                    if (articleViewer$$ExternalSyntheticLambda29 != null) {
                                        articleViewer$$ExternalSyntheticLambda29.run(str3);
                                    }
                                    break;
                            }
                        }
                    };
                    int i58 = AddressBarList.Address2View.Factory.$r8$clinit;
                    UItem uItemOfFactory18 = UItem.ofFactory(AddressBarList.Address2View.Factory.class);
                    uItemOfFactory18.intValue = 1;
                    uItemOfFactory18.text = str3;
                    uItemOfFactory18.clickCallback = onClickListener3;
                    uItemOfFactory18.accent = z5;
                    uItemOfFactory18.red = z6;
                    uItemOfFactory18.object = Boolean.TRUE;
                    uItemOfFactory18.object2 = addressBarList;
                    arrayList29.add(uItemOfFactory18);
                }
                i6 = 1;
                if (!arrayList31.isEmpty()) {
                    arrayList29.add(UItem.asGraySection(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new RichMapCell$$ExternalSyntheticLambda0(addressBarList, i6)));
                    while (i9 < arrayList31.size()) {
                        final String str4 = (String) arrayList31.get(i9);
                        if (i9 == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        final int i59 = 1;
                        if (i9 == arrayList31.size() - 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        View.OnClickListener onClickListener4 = new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                switch (i59) {
                                    case 0:
                                        ArticleViewer$$ExternalSyntheticLambda28 articleViewer$$ExternalSyntheticLambda28 = addressBarList.onQueryInsertClick;
                                        if (articleViewer$$ExternalSyntheticLambda28 != null) {
                                            articleViewer$$ExternalSyntheticLambda28.run(str4);
                                        }
                                        break;
                                    default:
                                        ArticleViewer$$ExternalSyntheticLambda28 articleViewer$$ExternalSyntheticLambda29 = addressBarList.onQueryInsertClick;
                                        if (articleViewer$$ExternalSyntheticLambda29 != null) {
                                            articleViewer$$ExternalSyntheticLambda29.run(str4);
                                        }
                                        break;
                                }
                            }
                        };
                        int i510 = AddressBarList.Address2View.Factory.$r8$clinit;
                        UItem uItemOfFactory19 = UItem.ofFactory(AddressBarList.Address2View.Factory.class);
                        uItemOfFactory19.intValue = 0;
                        uItemOfFactory19.text = str4;
                        uItemOfFactory19.clickCallback = onClickListener4;
                        uItemOfFactory19.accent = z3;
                        uItemOfFactory19.red = z4;
                        uItemOfFactory19.object = Boolean.TRUE;
                        uItemOfFactory19.object2 = addressBarList;
                        arrayList29.add(uItemOfFactory19);
                    }
                }
                bookmarksList = addressBarList.bookmarksList;
                if (bookmarksList != null) {
                    arrayList2 = bookmarksList.links;
                    if (arrayList2.isEmpty()) {
                        arrayList29.add(UItem.asGraySection(LocaleController.getString(R.string.WebSectionBookmarks)));
                        i7 = 0;
                        while (i7 < arrayList2.size()) {
                            messageObject = (MessageObject) arrayList2.get(i7);
                            if (TextUtils.isEmpty(AddressBarList.getLink(messageObject))) {
                                i8 = 1;
                            } else {
                                int i511 = AddressBarList.BookmarkView.Factory.$r8$clinit;
                                UItem uItemOfFactory110 = UItem.ofFactory(AddressBarList.BookmarkView.Factory.class);
                                uItemOfFactory110.intValue = 3;
                                i8 = 1;
                                uItemOfFactory110.accent = true;
                                uItemOfFactory110.object2 = messageObject;
                                arrayList29.add(uItemOfFactory110);
                            }
                            i7 += i8;
                        }
                        if (bookmarksList.endReached) {
                            arrayList29.add(UItem.asFlicker(arrayList29.size(), 32));
                            arrayList29.add(UItem.asFlicker(arrayList29.size(), 32));
                            arrayList29.add(UItem.asFlicker(arrayList29.size(), 32));
                        }
                    }
                }
                break;
        }
    }
}
