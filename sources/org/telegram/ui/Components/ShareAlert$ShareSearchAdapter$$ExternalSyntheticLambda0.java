package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda17;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda18;

public final class ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ShareAlert.ShareSearchAdapter f$0;
    public final String f$1;
    public final int f$2;

    public ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0(ShareAlert.ShareSearchAdapter shareSearchAdapter, int i, String str) {
        this.$r8$classId = 1;
        this.f$0 = shareSearchAdapter;
        this.f$2 = i;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        int i;
        ShareAlert.ShareSearchAdapter shareSearchAdapter;
        String[] strArr;
        int i2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        char c;
        char c2;
        switch (this.$r8$classId) {
            case 0:
                ShareAlert.ShareSearchAdapter shareSearchAdapter2 = this.f$0;
                shareSearchAdapter2.searchRunnable = null;
                DispatchQueue storageQueue = MessagesStorage.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getStorageQueue();
                String str = this.f$1;
                int i3 = this.f$2;
                storageQueue.postRunnable(new ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0(shareSearchAdapter2, str, i3, 2));
                ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0 shareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0 = new ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0(shareSearchAdapter2, i3, str);
                shareSearchAdapter2.searchRunnable2 = shareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0;
                AndroidUtilities.runOnUIThread(shareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0);
                break;
            case 1:
                ShareAlert.ShareSearchAdapter shareSearchAdapter3 = this.f$0;
                shareSearchAdapter3.searchRunnable2 = null;
                int i4 = shareSearchAdapter3.lastSearchId;
                int i5 = this.f$2;
                if (i5 == i4) {
                    shareSearchAdapter3.searchAdapterHelper.queryServerSearch(this.f$1, true, true, true, true, false, 0L, false, 0, i5, 0L, null);
                    break;
                }
                break;
            default:
                String str2 = this.f$1;
                int i6 = this.f$2;
                ShareAlert.ShareSearchAdapter shareSearchAdapter4 = this.f$0;
                ShareAlert shareAlert = ShareAlert.this;
                try {
                    String lowerCase = str2.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        shareSearchAdapter4.lastSearchId = -1;
                        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda17(shareSearchAdapter4, shareSearchAdapter4.lastSearchId, new ArrayList(), 29));
                    } else {
                        String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                        if (lowerCase.equals(translitString) || translitString.length() == 0) {
                            translitString = null;
                        }
                        int i7 = (translitString != null ? 1 : 0) + 1;
                        String[] strArr2 = new String[i7];
                        strArr2[0] = lowerCase;
                        if (translitString != null) {
                            strArr2[1] = translitString;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        LongSparseArray longSparseArray = new LongSparseArray();
                        SQLiteCursor sQLiteCursorQueryFinalized = MessagesStorage.getInstance(((BottomSheet) shareAlert).currentAccount).getDatabase().queryFinalized("SELECT did, date FROM dialogs ORDER BY date DESC LIMIT 400", new Object[0]);
                        while (sQLiteCursorQueryFinalized.next()) {
                            long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                            ShareAlert.DialogSearchResult dialogSearchResult = new ShareAlert.DialogSearchResult();
                            dialogSearchResult.date = sQLiteCursorQueryFinalized.intValue(1);
                            longSparseArray.put(dialogSearchResult, jLongValue);
                            if (DialogObject.isUserDialog(jLongValue)) {
                                if (!arrayList.contains(Long.valueOf(jLongValue))) {
                                    arrayList.add(Long.valueOf(jLongValue));
                                }
                            } else if (DialogObject.isChatDialog(jLongValue)) {
                                long j = -jLongValue;
                                if (!arrayList2.contains(Long.valueOf(j))) {
                                    arrayList2.add(Long.valueOf(j));
                                }
                            }
                        }
                        sQLiteCursorQueryFinalized.dispose();
                        if (arrayList.isEmpty()) {
                            i = i6;
                            shareSearchAdapter = shareSearchAdapter4;
                            strArr = strArr2;
                            i2 = 0;
                        } else {
                            SQLiteDatabase database = MessagesStorage.getInstance(((BottomSheet) shareAlert).currentAccount).getDatabase();
                            Locale locale = Locale.US;
                            SQLiteCursor sQLiteCursorQueryFinalized2 = database.queryFinalized("SELECT data, status, name FROM users WHERE uid IN(" + TextUtils.join(",", arrayList) + ")", new Object[0]);
                            int i8 = 0;
                            while (sQLiteCursorQueryFinalized2.next()) {
                                String strStringValue = sQLiteCursorQueryFinalized2.stringValue(2);
                                String translitString2 = LocaleController.getInstance().getTranslitString(strStringValue);
                                if (strStringValue.equals(translitString2)) {
                                    translitString2 = null;
                                }
                                int i9 = i8;
                                int iLastIndexOf = strStringValue.lastIndexOf(";;;");
                                String[] strArr3 = strArr2;
                                String strSubstring = iLastIndexOf != -1 ? strStringValue.substring(iLastIndexOf + 3) : null;
                                int i10 = 0;
                                char c3 = 0;
                                while (true) {
                                    if (i10 < i7) {
                                        int i11 = i10;
                                        String str3 = strArr3[i11];
                                        if (strStringValue.startsWith(str3)) {
                                            c = 1;
                                        } else {
                                            if (strStringValue.contains(" " + str3)) {
                                                c = 1;
                                            } else {
                                                if (translitString2 != null) {
                                                    if (!translitString2.startsWith(str3)) {
                                                        if (translitString2.contains(" " + str3)) {
                                                        }
                                                    }
                                                    c = 1;
                                                }
                                                c = (strSubstring == null || !strSubstring.startsWith(str3)) ? c3 : (char) 2;
                                            }
                                        }
                                        if (c != 0) {
                                            NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized2.byteBufferValue(0);
                                            if (nativeByteBufferByteBufferValue != null) {
                                                TLRPC.User userTLdeserialize = TLRPC.User.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                                                nativeByteBufferByteBufferValue.reuse();
                                                ShareAlert.DialogSearchResult dialogSearchResult2 = (ShareAlert.DialogSearchResult) longSparseArray.get(userTLdeserialize.id);
                                                TLRPC.UserStatus userStatus = userTLdeserialize.status;
                                                if (userStatus != null) {
                                                    c2 = 1;
                                                    userStatus.expires = sQLiteCursorQueryFinalized2.intValue(1);
                                                } else {
                                                    c2 = 1;
                                                }
                                                if (c == c2) {
                                                    dialogSearchResult2.name = AndroidUtilities.generateSearchName(userTLdeserialize.first_name, userTLdeserialize.last_name, str3);
                                                } else {
                                                    dialogSearchResult2.name = AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(userTLdeserialize), null, "@" + str3);
                                                }
                                                dialogSearchResult2.object = userTLdeserialize;
                                                dialogSearchResult2.dialog.id = userTLdeserialize.id;
                                                i8 = i9 + 1;
                                            }
                                            strArr2 = strArr3;
                                            shareSearchAdapter4 = shareSearchAdapter4;
                                            i6 = i6;
                                        } else {
                                            i10 = i11 + 1;
                                            c3 = c;
                                        }
                                    }
                                    i8 = i9;
                                    strArr2 = strArr3;
                                    shareSearchAdapter4 = shareSearchAdapter4;
                                    i6 = i6;
                                }
                            }
                            i = i6;
                            shareSearchAdapter = shareSearchAdapter4;
                            i2 = i8;
                            strArr = strArr2;
                            sQLiteCursorQueryFinalized2.dispose();
                        }
                        if (!arrayList2.isEmpty()) {
                            SQLiteDatabase database2 = MessagesStorage.getInstance(((BottomSheet) shareAlert).currentAccount).getDatabase();
                            Locale locale2 = Locale.US;
                            SQLiteCursor sQLiteCursorQueryFinalized3 = database2.queryFinalized("SELECT data, name FROM chats WHERE uid IN(" + TextUtils.join(",", arrayList2) + ")", new Object[0]);
                            while (sQLiteCursorQueryFinalized3.next()) {
                                String strStringValue2 = sQLiteCursorQueryFinalized3.stringValue(1);
                                String translitString3 = LocaleController.getInstance().getTranslitString(strStringValue2);
                                if (strStringValue2.equals(translitString3)) {
                                    translitString3 = null;
                                }
                                int i12 = 0;
                                while (true) {
                                    if (i12 < i7) {
                                        String str4 = strArr[i12];
                                        if (!strStringValue2.startsWith(str4)) {
                                            if (!strStringValue2.contains(" " + str4)) {
                                                if (translitString3 != null) {
                                                    if (!translitString3.startsWith(str4)) {
                                                        if (translitString3.contains(" " + str4)) {
                                                        }
                                                    }
                                                }
                                                i12++;
                                            }
                                        }
                                        NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized3.byteBufferValue(0);
                                        if (nativeByteBufferByteBufferValue2 != null) {
                                            TLRPC.Chat chatTLdeserialize = TLRPC.Chat.TLdeserialize(nativeByteBufferByteBufferValue2, nativeByteBufferByteBufferValue2.readInt32(false), false);
                                            nativeByteBufferByteBufferValue2.reuse();
                                            if (chatTLdeserialize != null && !ChatObject.isNotInChat(chatTLdeserialize) && (!ChatObject.isChannel(chatTLdeserialize) || chatTLdeserialize.creator || (((tL_chatAdminRights = chatTLdeserialize.admin_rights) != null && tL_chatAdminRights.post_messages) || chatTLdeserialize.megagroup))) {
                                                ShareAlert.DialogSearchResult dialogSearchResult3 = (ShareAlert.DialogSearchResult) longSparseArray.get(-chatTLdeserialize.id);
                                                dialogSearchResult3.name = AndroidUtilities.generateSearchName(chatTLdeserialize.title, null, str4);
                                                dialogSearchResult3.object = chatTLdeserialize;
                                                dialogSearchResult3.dialog.id = -chatTLdeserialize.id;
                                                i2++;
                                            }
                                        }
                                    }
                                }
                            }
                            sQLiteCursorQueryFinalized3.dispose();
                        }
                        ArrayList arrayList3 = new ArrayList(i2);
                        for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
                            ShareAlert.DialogSearchResult dialogSearchResult4 = (ShareAlert.DialogSearchResult) longSparseArray.valueAt(i13);
                            if (dialogSearchResult4.object != null && dialogSearchResult4.name != null) {
                                arrayList3.add(dialogSearchResult4);
                            }
                        }
                        SQLiteCursor sQLiteCursorQueryFinalized4 = MessagesStorage.getInstance(((BottomSheet) shareAlert).currentAccount).getDatabase().queryFinalized("SELECT u.data, u.status, u.name, u.uid FROM users as u INNER JOIN contacts as c ON u.uid = c.uid", new Object[0]);
                        while (sQLiteCursorQueryFinalized4.next()) {
                            if (longSparseArray.indexOfKey(sQLiteCursorQueryFinalized4.longValue(3)) < 0) {
                                String strStringValue3 = sQLiteCursorQueryFinalized4.stringValue(2);
                                String translitString4 = LocaleController.getInstance().getTranslitString(strStringValue3);
                                if (strStringValue3.equals(translitString4)) {
                                    translitString4 = null;
                                }
                                int iLastIndexOf2 = strStringValue3.lastIndexOf(";;;");
                                String strSubstring2 = iLastIndexOf2 != -1 ? strStringValue3.substring(iLastIndexOf2 + 3) : null;
                                char c4 = 0;
                                for (int i14 = 0; i14 < i7; i14++) {
                                    String str5 = strArr[i14];
                                    if (strStringValue3.startsWith(str5)) {
                                        c4 = 1;
                                    } else {
                                        if (strStringValue3.contains(" " + str5)) {
                                            c4 = 1;
                                        } else {
                                            if (translitString4 != null) {
                                                if (!translitString4.startsWith(str5)) {
                                                    if (translitString4.contains(" " + str5)) {
                                                    }
                                                }
                                                c4 = 1;
                                            }
                                            if (strSubstring2 != null && strSubstring2.startsWith(str5)) {
                                                c4 = 2;
                                            }
                                        }
                                    }
                                    if (c4 != 0) {
                                        NativeByteBuffer nativeByteBufferByteBufferValue3 = sQLiteCursorQueryFinalized4.byteBufferValue(0);
                                        if (nativeByteBufferByteBufferValue3 == null) {
                                        }
                                        TLRPC.User userTLdeserialize2 = TLRPC.User.TLdeserialize(nativeByteBufferByteBufferValue3, nativeByteBufferByteBufferValue3.readInt32(false), false);
                                        nativeByteBufferByteBufferValue3.reuse();
                                        ShareAlert.DialogSearchResult dialogSearchResult5 = new ShareAlert.DialogSearchResult();
                                        TLRPC.UserStatus userStatus2 = userTLdeserialize2.status;
                                        if (userStatus2 != null) {
                                            userStatus2.expires = sQLiteCursorQueryFinalized4.intValue(1);
                                        }
                                        dialogSearchResult5.dialog.id = userTLdeserialize2.id;
                                        dialogSearchResult5.object = userTLdeserialize2;
                                        if (c4 == 1) {
                                            dialogSearchResult5.name = AndroidUtilities.generateSearchName(userTLdeserialize2.first_name, userTLdeserialize2.last_name, str5);
                                        } else {
                                            dialogSearchResult5.name = AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(userTLdeserialize2), null, "@" + str5);
                                        }
                                        arrayList3.add(dialogSearchResult5);
                                    }
                                    break;
                                }
                            }
                        }
                        sQLiteCursorQueryFinalized4.dispose();
                        Collections.sort(arrayList3, new ChatActivity$$ExternalSyntheticLambda18(23));
                        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda17(shareSearchAdapter, i, arrayList3, 29));
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                break;
        }
    }

    public ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0(ShareAlert.ShareSearchAdapter shareSearchAdapter, String str, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = shareSearchAdapter;
        this.f$1 = str;
        this.f$2 = i;
    }
}
