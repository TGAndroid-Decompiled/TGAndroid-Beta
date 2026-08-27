package org.telegram.ui.Components;

import android.text.TextUtils;
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

public final class kp0 implements Runnable {

    public final int f30164a;

    public final op0 f30165b;

    public final int f30166c;
    public final String d;

    public kp0(op0 op0Var, int i10, String str) {
        this.f30164a = 1;
        this.f30165b = op0Var;
        this.f30166c = i10;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10;
        op0 op0Var;
        String[] strArr;
        int i11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        char c10;
        char c11;
        switch (this.f30164a) {
            case 0:
                op0 op0Var2 = this.f30165b;
                op0Var2.f31376f = null;
                DispatchQueue storageQueue = MessagesStorage.getInstance(((org.telegram.ui.ActionBar.e3) op0Var2.G).currentAccount).getStorageQueue();
                String str = this.d;
                int i12 = this.f30166c;
                storageQueue.postRunnable(new kp0(op0Var2, str, i12, 2));
                kp0 kp0Var = new kp0(op0Var2, i12, str);
                op0Var2.h = kp0Var;
                AndroidUtilities.runOnUIThread(kp0Var);
                break;
            case 1:
                op0 op0Var3 = this.f30165b;
                op0Var3.h = null;
                int i13 = op0Var3.f31378r;
                int i14 = this.f30166c;
                if (i14 == i13) {
                    op0Var3.f31375e.g(this.d, true, true, true, true, 0L, false, 0, i14);
                    break;
                }
                break;
            default:
                String str2 = this.d;
                int i15 = this.f30166c;
                op0 op0Var4 = this.f30165b;
                sp0 sp0Var = op0Var4.G;
                try {
                    String lowerCase = str2.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        op0Var4.f31378r = -1;
                        AndroidUtilities.runOnUIThread(new km(op0Var4, op0Var4.f31378r, new ArrayList(), 9));
                    } else {
                        String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                        if (lowerCase.equals(translitString) || translitString.length() == 0) {
                            translitString = null;
                        }
                        int i16 = (translitString != null ? 1 : 0) + 1;
                        String[] strArr2 = new String[i16];
                        strArr2[0] = lowerCase;
                        if (translitString != null) {
                            strArr2[1] = translitString;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        a0.h hVar = new a0.h();
                        SQLiteCursor sQLiteCursorQueryFinalized = MessagesStorage.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).getDatabase().queryFinalized("SELECT did, date FROM dialogs ORDER BY date DESC LIMIT 400", new Object[0]);
                        while (sQLiteCursorQueryFinalized.next()) {
                            long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                            fp0 fp0Var = new fp0();
                            fp0Var.f28430c = sQLiteCursorQueryFinalized.intValue(1);
                            hVar.k(fp0Var, jLongValue);
                            if (DialogObject.isUserDialog(jLongValue)) {
                                if (!arrayList.contains(Long.valueOf(jLongValue))) {
                                    arrayList.add(Long.valueOf(jLongValue));
                                }
                            } else if (DialogObject.isChatDialog(jLongValue)) {
                                long j10 = -jLongValue;
                                if (!arrayList2.contains(Long.valueOf(j10))) {
                                    arrayList2.add(Long.valueOf(j10));
                                }
                            }
                        }
                        sQLiteCursorQueryFinalized.dispose();
                        if (arrayList.isEmpty()) {
                            i10 = i15;
                            op0Var = op0Var4;
                            strArr = strArr2;
                            i11 = 0;
                        } else {
                            SQLiteDatabase database = MessagesStorage.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).getDatabase();
                            Locale locale = Locale.US;
                            SQLiteCursor sQLiteCursorQueryFinalized2 = database.queryFinalized("SELECT data, status, name FROM users WHERE uid IN(" + TextUtils.join(",", arrayList) + ")", new Object[0]);
                            int i17 = 0;
                            while (sQLiteCursorQueryFinalized2.next()) {
                                String strStringValue = sQLiteCursorQueryFinalized2.stringValue(2);
                                String translitString2 = LocaleController.getInstance().getTranslitString(strStringValue);
                                if (strStringValue.equals(translitString2)) {
                                    translitString2 = null;
                                }
                                int i18 = i17;
                                int iLastIndexOf = strStringValue.lastIndexOf(";;;");
                                String[] strArr3 = strArr2;
                                String strSubstring = iLastIndexOf != -1 ? strStringValue.substring(iLastIndexOf + 3) : null;
                                int i19 = 0;
                                char c12 = 0;
                                while (true) {
                                    if (i19 < i16) {
                                        int i20 = i19;
                                        String str3 = strArr3[i20];
                                        if (strStringValue.startsWith(str3)) {
                                            c10 = 1;
                                        } else {
                                            if (strStringValue.contains(" " + str3)) {
                                                c10 = 1;
                                            } else {
                                                if (translitString2 != null) {
                                                    if (!translitString2.startsWith(str3)) {
                                                        if (translitString2.contains(" " + str3)) {
                                                        }
                                                    }
                                                    c10 = 1;
                                                }
                                                c10 = (strSubstring == null || !strSubstring.startsWith(str3)) ? c12 : (char) 2;
                                            }
                                        }
                                        if (c10 != 0) {
                                            NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized2.byteBufferValue(0);
                                            if (nativeByteBufferByteBufferValue != null) {
                                                TLRPC.User userTLdeserialize = TLRPC.User.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                                                nativeByteBufferByteBufferValue.reuse();
                                                fp0 fp0Var2 = (fp0) hVar.f(userTLdeserialize.f22527id);
                                                TLRPC.UserStatus userStatus = userTLdeserialize.status;
                                                if (userStatus != null) {
                                                    c11 = 1;
                                                    userStatus.expires = sQLiteCursorQueryFinalized2.intValue(1);
                                                } else {
                                                    c11 = 1;
                                                }
                                                if (c10 == c11) {
                                                    fp0Var2.d = AndroidUtilities.generateSearchName(userTLdeserialize.first_name, userTLdeserialize.last_name, str3);
                                                } else {
                                                    fp0Var2.d = AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(userTLdeserialize), null, "@" + str3);
                                                }
                                                fp0Var2.f28429b = userTLdeserialize;
                                                fp0Var2.f28428a.f22384id = userTLdeserialize.f22527id;
                                                i17 = i18 + 1;
                                            }
                                            strArr2 = strArr3;
                                            op0Var4 = op0Var4;
                                            i15 = i15;
                                        } else {
                                            i19 = i20 + 1;
                                            c12 = c10;
                                        }
                                    }
                                    i17 = i18;
                                    strArr2 = strArr3;
                                    op0Var4 = op0Var4;
                                    i15 = i15;
                                }
                            }
                            i10 = i15;
                            op0Var = op0Var4;
                            i11 = i17;
                            strArr = strArr2;
                            sQLiteCursorQueryFinalized2.dispose();
                        }
                        if (!arrayList2.isEmpty()) {
                            SQLiteDatabase database2 = MessagesStorage.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).getDatabase();
                            Locale locale2 = Locale.US;
                            SQLiteCursor sQLiteCursorQueryFinalized3 = database2.queryFinalized("SELECT data, name FROM chats WHERE uid IN(" + TextUtils.join(",", arrayList2) + ")", new Object[0]);
                            while (sQLiteCursorQueryFinalized3.next()) {
                                String strStringValue2 = sQLiteCursorQueryFinalized3.stringValue(1);
                                String translitString3 = LocaleController.getInstance().getTranslitString(strStringValue2);
                                if (strStringValue2.equals(translitString3)) {
                                    translitString3 = null;
                                }
                                int i21 = 0;
                                while (true) {
                                    if (i21 < i16) {
                                        String str4 = strArr[i21];
                                        if (!strStringValue2.startsWith(str4)) {
                                            if (!strStringValue2.contains(" " + str4)) {
                                                if (translitString3 != null) {
                                                    if (!translitString3.startsWith(str4)) {
                                                        if (translitString3.contains(" " + str4)) {
                                                        }
                                                    }
                                                }
                                                i21++;
                                            }
                                        }
                                        NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized3.byteBufferValue(0);
                                        if (nativeByteBufferByteBufferValue2 != null) {
                                            TLRPC.Chat chatTLdeserialize = TLRPC.Chat.TLdeserialize(nativeByteBufferByteBufferValue2, nativeByteBufferByteBufferValue2.readInt32(false), false);
                                            nativeByteBufferByteBufferValue2.reuse();
                                            if (chatTLdeserialize != null && !ChatObject.isNotInChat(chatTLdeserialize) && (!ChatObject.isChannel(chatTLdeserialize) || chatTLdeserialize.creator || (((tL_chatAdminRights = chatTLdeserialize.admin_rights) != null && tL_chatAdminRights.post_messages) || chatTLdeserialize.megagroup))) {
                                                fp0 fp0Var3 = (fp0) hVar.f(-chatTLdeserialize.f22380id);
                                                fp0Var3.d = AndroidUtilities.generateSearchName(chatTLdeserialize.title, null, str4);
                                                fp0Var3.f28429b = chatTLdeserialize;
                                                fp0Var3.f28428a.f22384id = -chatTLdeserialize.f22380id;
                                                i11++;
                                            }
                                        }
                                    }
                                }
                            }
                            sQLiteCursorQueryFinalized3.dispose();
                        }
                        ArrayList arrayList3 = new ArrayList(i11);
                        for (int i22 = 0; i22 < hVar.m(); i22++) {
                            fp0 fp0Var4 = (fp0) hVar.n(i22);
                            if (fp0Var4.f28429b != null && fp0Var4.d != null) {
                                arrayList3.add(fp0Var4);
                            }
                        }
                        SQLiteCursor sQLiteCursorQueryFinalized4 = MessagesStorage.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).getDatabase().queryFinalized("SELECT u.data, u.status, u.name, u.uid FROM users as u INNER JOIN contacts as c ON u.uid = c.uid", new Object[0]);
                        while (sQLiteCursorQueryFinalized4.next()) {
                            if (hVar.h(sQLiteCursorQueryFinalized4.longValue(3)) < 0) {
                                String strStringValue3 = sQLiteCursorQueryFinalized4.stringValue(2);
                                String translitString4 = LocaleController.getInstance().getTranslitString(strStringValue3);
                                if (strStringValue3.equals(translitString4)) {
                                    translitString4 = null;
                                }
                                int iLastIndexOf2 = strStringValue3.lastIndexOf(";;;");
                                String strSubstring2 = iLastIndexOf2 != -1 ? strStringValue3.substring(iLastIndexOf2 + 3) : null;
                                char c13 = 0;
                                for (int i23 = 0; i23 < i16; i23++) {
                                    String str5 = strArr[i23];
                                    if (strStringValue3.startsWith(str5)) {
                                        c13 = 1;
                                    } else {
                                        if (strStringValue3.contains(" " + str5)) {
                                            c13 = 1;
                                        } else {
                                            if (translitString4 != null) {
                                                if (!translitString4.startsWith(str5)) {
                                                    if (translitString4.contains(" " + str5)) {
                                                    }
                                                }
                                                c13 = 1;
                                            }
                                            if (strSubstring2 != null && strSubstring2.startsWith(str5)) {
                                                c13 = 2;
                                            }
                                        }
                                    }
                                    if (c13 != 0) {
                                        NativeByteBuffer nativeByteBufferByteBufferValue3 = sQLiteCursorQueryFinalized4.byteBufferValue(0);
                                        if (nativeByteBufferByteBufferValue3 == null) {
                                        }
                                        TLRPC.User userTLdeserialize2 = TLRPC.User.TLdeserialize(nativeByteBufferByteBufferValue3, nativeByteBufferByteBufferValue3.readInt32(false), false);
                                        nativeByteBufferByteBufferValue3.reuse();
                                        fp0 fp0Var5 = new fp0();
                                        TLRPC.UserStatus userStatus2 = userTLdeserialize2.status;
                                        if (userStatus2 != null) {
                                            userStatus2.expires = sQLiteCursorQueryFinalized4.intValue(1);
                                        }
                                        fp0Var5.f28428a.f22384id = userTLdeserialize2.f22527id;
                                        fp0Var5.f28429b = userTLdeserialize2;
                                        if (c13 == 1) {
                                            fp0Var5.d = AndroidUtilities.generateSearchName(userTLdeserialize2.first_name, userTLdeserialize2.last_name, str5);
                                        } else {
                                            fp0Var5.d = AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(userTLdeserialize2), null, "@" + str5);
                                        }
                                        arrayList3.add(fp0Var5);
                                    }
                                    break;
                                }
                            }
                        }
                        sQLiteCursorQueryFinalized4.dispose();
                        Collections.sort(arrayList3, new lp0(0));
                        AndroidUtilities.runOnUIThread(new km(op0Var, i10, arrayList3, 9));
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                break;
        }
    }

    public kp0(op0 op0Var, String str, int i10, int i11) {
        this.f30164a = i11;
        this.f30165b = op0Var;
        this.d = str;
        this.f30166c = i10;
    }
}
