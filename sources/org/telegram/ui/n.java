package org.telegram.ui;

import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;

public final class n implements RequestDelegate {

    public final int f40614a;

    public final Object f40615b;

    public n(Object obj, int i10) {
        this.f40614a = i10;
        this.f40615b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String string;
        String[] strArr;
        TLObject tLObject2 = tLObject;
        int i10 = this.f40614a;
        int i11 = 29;
        int i12 = 6;
        int i13 = 24;
        int i14 = 28;
        int i15 = 2;
        int i16 = 1;
        Object obj = this.f40615b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1((q) obj, tL_error, tLObject2, i15));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new u1((j9) obj, tL_error, tLObject2, i12));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ti((ho) obj, 10));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new rd(i13, (jp) obj, tLObject2));
                break;
            case 4:
                lr lrVar = (lr) obj;
                if (tLObject2 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    lrVar.getMessagesController().processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new rd(i11, lrVar, updates), 1000L);
                    }
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new bs((js) obj, i15));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new bu((DataSettingsActivity) obj, 0));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new lq((d00) obj, tL_error, tLObject2, 7));
                break;
            case 8:
                v40 v40Var = (v40) obj;
                if (tLObject2 instanceof TLRPC.TL_updates) {
                    v40Var.f43351b.d.getMessagesController().processUpdates((TLRPC.TL_updates) tLObject2, false);
                } else {
                    v40Var.getClass();
                }
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new a30(1, (c70) obj, tL_error));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new a30(18, (ob0) obj, tLObject2));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new lq((te0) obj, tLObject2, tL_error, 27));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new a30(i14, (ue0) obj, tL_error));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new bf0(obj, (Object) tL_error, (Object) tLObject2, 0));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new bf0((KeyEvent.Callback) obj, tLObject2, (Object) tL_error, i15));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new r00((NotificationsSettingsActivity) obj, i11));
                break;
            case 16:
                sm0 sm0Var = (sm0) obj;
                if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new ff0(17, sm0Var, tL_error));
                    break;
                }
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new bf0((PremiumPreviewFragment) obj, tL_error, tLObject2, 22));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new zs0(i12, (PrivacyControlActivity) obj, tLObject2));
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new zs0(8, privacySettingsActivity, (TL_account.Password) tLObject2));
                }
                break;
            case 20:
                g01 g01Var = (g01) obj;
                int i17 = g01Var.f38254f;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i17).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i17).putChats(tL_messages_webPage.chats, false);
                    tLObject2 = tL_messages_webPage.webpage;
                }
                if (tLObject2 instanceof TLRPC.WebPage) {
                    ArrayList arrayList = new ArrayList();
                    TLRPC.WebPage webPage = (TLRPC.WebPage) tLObject2;
                    TL_iv.Page page = webPage.cached_page;
                    if (page != null) {
                        int size = page.blocks.size();
                        int i18 = 0;
                        while (i18 < size) {
                            TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i18);
                            if (pageBlock instanceof TL_iv.pageBlockList) {
                                if (i18 != 0) {
                                    TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(i18 - 1);
                                    if (pageBlock2 instanceof TL_iv.pageBlockParagraph) {
                                        string = m4.B(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                    } else {
                                        string = null;
                                    }
                                } else {
                                    string = null;
                                }
                                TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                int size2 = pageblocklist.items.size();
                                int i19 = 0;
                                while (i19 < size2) {
                                    TL_iv.PageListItem pageListItem = pageblocklist.items.get(i19);
                                    if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                        TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                        String strF = m4.F(tL_pageListItemText.text);
                                        String string2 = m4.B(tL_pageListItemText.text).toString();
                                        if (!TextUtils.isEmpty(strF) && !TextUtils.isEmpty(string2)) {
                                            if (string != null) {
                                                strArr = new String[2];
                                                strArr[0] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                strArr[i16] = string;
                                            } else {
                                                strArr = new String[i16];
                                                strArr[0] = LocaleController.getString(R.string.SettingsSearchFaq);
                                            }
                                            arrayList.add(new MessagesController.FaqSearchResult(string2, strArr, strF));
                                        }
                                    }
                                    i19++;
                                    i16 = 1;
                                }
                            } else if (pageBlock instanceof TL_iv.pageBlockAnchor) {
                                g01Var.A = webPage;
                            }
                            i18++;
                            i16 = 1;
                        }
                        g01Var.A = webPage;
                    }
                    AndroidUtilities.runOnUIThread(new zs0(i13, g01Var, arrayList));
                }
                g01Var.B = false;
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new r91((StickersActivity) obj, 1));
                break;
            case 22:
                ld1 ld1Var = (ld1) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i20 = 0; i20 < tL_messages_inactiveChats.chats.size(); i20++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i20);
                        int currentTime = (ld1Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i20).intValue()) / 86400;
                        String pluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                        if (ChatObject.isMegagroup(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), pluralString));
                        } else if (ChatObject.isChannel(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, pluralString));
                        } else {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), pluralString));
                        }
                    }
                    AndroidUtilities.runOnUIThread(new pc1(ld1Var, arrayList2, tL_messages_inactiveChats, 3));
                }
                break;
            case 23:
                fg1 fg1Var = (fg1) obj;
                fg1Var.getClass();
                AndroidUtilities.runOnUIThread(new m21(26, fg1Var, tLObject2));
                break;
            case 24:
                int[][] iArr = WallpapersListActivity.f36299g0;
                AndroidUtilities.runOnUIThread(new ky0((WallpapersListActivity) obj, i14));
                break;
            default:
                ai1 ai1Var = (ai1) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new zh1(i16, ai1Var, tLObject2));
                }
                break;
        }
    }
}
