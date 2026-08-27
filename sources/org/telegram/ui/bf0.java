package org.telegram.ui;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class bf0 implements Runnable {

    public final int f36807a;

    public final Object f36808b;

    public final Object f36809c;
    public final Object d;

    public bf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f36807a = i10;
        this.f36808b = callback;
        this.f36809c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        int i10;
        boolean z10;
        int i11;
        ur urVar;
        wr[] wrVarArr;
        int i12;
        int i13;
        boolean z11;
        nt ntVar;
        String[] strArr;
        char c10;
        ArrayList arrayList;
        TLRPC.User user;
        String str;
        String translitString;
        String str2;
        int i14;
        char c11;
        String str3;
        String str4;
        String str5;
        char c12;
        int i15;
        int i16;
        TLRPC.Message message;
        int i17 = 3;
        int i18 = 2;
        hn hnVar = null;
        int i19 = 1;
        switch (this.f36807a) {
            case 0:
                mf0 mf0Var = (mf0) this.f36808b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.f36809c;
                int i20 = mf0Var.f40481b0;
                ig0 ig0Var = mf0Var.f40497o0;
                mf0Var.z(false);
                mf0Var.W = false;
                if (tL_error == null) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    mf0Var.w();
                    mf0Var.u();
                    UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).setCurrentUser(user2);
                    UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).saveConfig(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user2);
                    MessagesStorage.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).putUsersAndChats(arrayList2, null, true, true);
                    MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).putUser(user2, false);
                    NotificationCenter.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                    ig0Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                    if (i20 == 3) {
                        AndroidUtilities.endIncomingCall();
                    }
                    mf0Var.q(new ye0(mf0Var, 5));
                } else {
                    mf0Var.f40479a0 = tL_error.text;
                    mf0Var.W = false;
                    ig0Var.v1(false, true);
                    if (i20 == 3) {
                        int i21 = mf0Var.f40483c0;
                        if (i21 != 4) {
                            i10 = 2;
                            if (i21 == 2 || i21 == 17 || i21 == 16) {
                            }
                            if (i20 == 15) {
                                NotificationCenter.getGlobalInstance().addObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                                z10 = true;
                            } else if (i20 == 2) {
                                z10 = true;
                                AndroidUtilities.setWaitingForSms(true);
                                NotificationCenter.getGlobalInstance().addObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                            } else {
                                z10 = true;
                                if (i20 == 3) {
                                    AndroidUtilities.setWaitingForCall(true);
                                    NotificationCenter.getGlobalInstance().addObserver(mf0Var, NotificationCenter.didReceiveCall);
                                }
                            }
                            mf0Var.V = z10;
                            if (i20 != 3) {
                                if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                    ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                    mf0Var.y();
                                    break;
                                } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                    mf0Var.c(true);
                                    ig0Var.u1(0, true, null, true);
                                    ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                    ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                } else {
                                    ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                                }
                                i11 = 0;
                                while (true) {
                                    urVar = mf0Var.f40487f;
                                    wrVarArr = urVar.f43279f;
                                    if (i11 >= wrVarArr.length) {
                                        urVar.f43278e = false;
                                        wrVarArr[0].requestFocus();
                                    } else {
                                        wrVarArr[i11].setText("");
                                        i11++;
                                    }
                                }
                            }
                        }
                        mf0Var.t();
                        if (i20 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                            z10 = true;
                        } else if (i20 == 2) {
                            z10 = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z10 = true;
                            if (i20 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(mf0Var, NotificationCenter.didReceiveCall);
                            }
                        }
                        mf0Var.V = z10;
                        if (i20 != 3) {
                            if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                if (tL_error.text.contains("PHONE_CODE_EMPTY")) {
                                }
                                mf0Var.y();
                            } else {
                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                            }
                            i11 = 0;
                            while (true) {
                                urVar = mf0Var.f40487f;
                                wrVarArr = urVar.f43279f;
                                if (i11 >= wrVarArr.length) {
                                    urVar.f43278e = false;
                                    wrVarArr[0].requestFocus();
                                } else {
                                    wrVarArr[i11].setText("");
                                    i11++;
                                }
                            }
                        }
                    } else {
                        i10 = 2;
                    }
                    if ((i20 == i10 && ((i13 = mf0Var.f40483c0) == 4 || i13 == 3)) || (i20 == 4 && ((i12 = mf0Var.f40483c0) == i10 || i12 == 17 || i12 == 16))) {
                        mf0Var.t();
                    }
                    if (i20 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                        z10 = true;
                    } else if (i20 == 2) {
                        z10 = true;
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                    } else {
                        z10 = true;
                        if (i20 == 3) {
                            AndroidUtilities.setWaitingForCall(true);
                            NotificationCenter.getGlobalInstance().addObserver(mf0Var, NotificationCenter.didReceiveCall);
                        }
                    }
                    mf0Var.V = z10;
                    if (i20 != 3) {
                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                            if (tL_error.text.contains("PHONE_CODE_EMPTY")) {
                            }
                            mf0Var.y();
                        } else {
                            ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        }
                        i11 = 0;
                        while (true) {
                            urVar = mf0Var.f40487f;
                            wrVarArr = urVar.f43279f;
                            if (i11 >= wrVarArr.length) {
                                urVar.f43278e = false;
                                wrVarArr[0].requestFocus();
                            } else {
                                wrVarArr[i11].setText("");
                                i11++;
                            }
                        }
                    }
                }
                break;
            case 1:
                mf0 mf0Var2 = (mf0) this.f36808b;
                Bundle bundle = (Bundle) this.d;
                TLObject tLObject2 = (TLObject) this.f36809c;
                mf0Var2.f40493k0 = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                mf0Var2.f40494l0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    mf0Var2.f40483c0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    mf0Var2.f40483c0 = 16;
                }
                mf0Var2.f40497o0.g1(bundle, tL_auth_sentCode, true);
                break;
            case 2:
                rf0 rf0Var = (rf0) this.f36808b;
                TLObject tLObject3 = (TLObject) this.f36809c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                lh.d dVar = rf0Var.f41919b;
                ig0 ig0Var2 = rf0Var.v;
                rf0Var.f41925s = -1;
                if (tLObject3 instanceof TLRPC.auth_SentCode) {
                    rf0Var.f41922f = false;
                    dVar.setLoading(false);
                    org.telegram.ui.ActionBar.b5 parentLayout = ig0Var2.getParentLayout();
                    if (parentLayout == null || parentLayout.getFragmentStack() == null) {
                        z11 = true;
                    } else {
                        List fragmentStack = parentLayout.getFragmentStack();
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentStack.isEmpty() ? null : (org.telegram.ui.ActionBar.n2) i0.a.j(1, fragmentStack);
                        ArrayList arrayList3 = new ArrayList(fragmentStack);
                        int size = arrayList3.size();
                        int i22 = 0;
                        while (i22 < size) {
                            Object obj = arrayList3.get(i22);
                            i22++;
                            org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                            if ((n2Var2 instanceof do0) && n2Var2 != n2Var) {
                                n2Var2.removeSelfFromStack();
                            }
                        }
                        if (n2Var instanceof do0) {
                            z11 = true;
                            ((ActionBarLayout) parentLayout).l(true, false);
                        } else {
                            z11 = true;
                        }
                    }
                    ig0Var2.g1(rf0Var.d, (TLRPC.auth_SentCode) tLObject3, z11);
                } else if (tL_error2 != null) {
                    String str6 = tL_error2.text;
                    if (str6 == null || !str6.startsWith("FLOOD_WAIT_")) {
                        String str7 = tL_error2.text;
                        if (str7 == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(str7)) {
                            rf0Var.f41921e = tL_error2.text;
                            rf0Var.f41922f = false;
                            dVar.setLoading(false);
                            new org.telegram.ui.Components.mc(ig0Var2.V, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error2.text));
                        } else {
                            ig0Var2.u1(0, true, null, true);
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new of0(rf0Var, 2), Integer.parseInt(tL_error2.text.substring(11)) * 1000);
                    }
                }
                break;
            case 3:
                rf0 rf0Var2 = (rf0) this.f36808b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.f36809c;
                ig0 ig0Var3 = rf0Var2.v;
                ig0Var3.f39086e = true;
                ig0 ig0Var4 = (ig0) LaunchActivity.N();
                if (ig0Var4 == null) {
                    ig0Var4 = new ig0(((org.telegram.ui.ActionBar.n2) ig0Var3).currentAccount);
                    org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                    if (n2VarU != null) {
                        n2VarU.presentFragment(ig0Var4);
                    }
                }
                ig0Var4.q1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 4:
                hg0 hg0Var = (hg0) this.f36808b;
                mj0 mj0Var = hg0Var.f38804a;
                TLObject tLObject4 = (TLObject) this.f36809c;
                HashMap map = (HashMap) this.d;
                if (tLObject4 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject4;
                    if (mj0Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList4 = hg0Var.A;
                        if (((String) map.get(upperCase)) != null && arrayList4 != null) {
                            int i23 = 0;
                            while (true) {
                                if (i23 >= arrayList4.size()) {
                                    ntVar = null;
                                } else if (arrayList4.get(i23) == null || !((nt) arrayList4.get(i23)).f40915a.equals(upperCase)) {
                                    i23++;
                                } else {
                                    ntVar = (nt) arrayList4.get(i23);
                                }
                            }
                            if (ntVar != null) {
                                mj0Var.setText(ntVar.f40917c);
                                hg0Var.f38813x = 0;
                            }
                            break;
                        }
                    }
                }
                break;
            case 5:
                kh0 kh0Var = (kh0) this.f36808b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.f36809c;
                if (tL_error3 != null) {
                    kh0Var.getClass();
                } else {
                    kh0 kh0Var2 = kh0Var.f39755o0.f36536a;
                    int i24 = 0;
                    while (true) {
                        ArrayList arrayList5 = kh0Var2.f39746f0;
                        if (i24 < arrayList5.size()) {
                            if (((TLRPC.TL_chatInviteExported) arrayList5.get(i24)).link.equals(tL_chatInviteExported.link)) {
                                bh0 bh0VarF0 = kh0Var2.f0();
                                arrayList5.remove(i24);
                                kh0Var2.h0(bh0VarF0);
                            } else {
                                i24++;
                            }
                        }
                    }
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ff0(9, (ib0) this.f36809c, MessagesStorage.getInstance(((oj0) this.f36808b).currentAccount).getUser(((TLRPC.TL_contact) this.d).user_id)));
                break;
            case 7:
                oj0.m((oj0) this.f36808b, (TLObject) this.f36809c, (ib0) this.d);
                break;
            case 8:
                ck0 ck0Var = (ck0) this.f36808b;
                String str8 = (String) this.d;
                ArrayList arrayList6 = (ArrayList) this.f36809c;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = ck0Var.f37111n;
                String lowerCase = str8.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11(ck0Var, new ArrayList(), new ArrayList(), new ArrayList(), 20));
                } else {
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString2) || translitString2.length() == 0) {
                        translitString2 = null;
                    }
                    int i25 = (translitString2 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i25];
                    strArr2[0] = lowerCase;
                    if (translitString2 != null) {
                        strArr2[1] = translitString2;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    String[] strArr3 = new String[2];
                    int i26 = 0;
                    while (i26 < arrayList6.size()) {
                        fk0 fk0Var = (fk0) arrayList6.get(i26);
                        if (DialogObject.isEncryptedDialog(fk0Var.d)) {
                            TLRPC.EncryptedChat encryptedChatN = org.telegram.messenger.y1.n(notificationsCustomSettingsActivity.getMessagesController(), fk0Var.d);
                            if (encryptedChatN != null) {
                                strArr = strArr2;
                                c10 = 0;
                                TLRPC.User user3 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(encryptedChatN.user_id));
                                if (user3 != null) {
                                    strArr3[0] = ContactsController.formatName(user3.first_name, user3.last_name);
                                    strArr3[i19] = UserObject.getPublicUsername(user3);
                                }
                            } else {
                                strArr = strArr2;
                                c10 = 0;
                            }
                        } else {
                            strArr = strArr2;
                            c10 = 0;
                            if (DialogObject.isUserDialog(fk0Var.d)) {
                                TLRPC.User user4 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(fk0Var.d));
                                if (user4 != null && !user4.deleted) {
                                    strArr3[0] = ContactsController.formatName(user4.first_name, user4.last_name);
                                    strArr3[i19] = UserObject.getPublicUsername(user4);
                                    user = user4;
                                    str = strArr3[c10];
                                    strArr3[c10] = str.toLowerCase();
                                    translitString = LocaleController.getInstance().getTranslitString(strArr3[c10]);
                                    str2 = strArr3[c10];
                                    if (str2 != null && str2.equals(translitString)) {
                                        translitString = null;
                                    }
                                    i14 = 0;
                                    c11 = 0;
                                    while (true) {
                                        if (i14 >= i25) {
                                            str3 = strArr[i14];
                                            str4 = strArr3[0];
                                            arrayList = arrayList6;
                                            if (!(str4 == null && (str4.startsWith(str3) || org.telegram.messenger.y1.x(" ", str3, strArr3[0]))) && (translitString == null || !(translitString.startsWith(str3) || org.telegram.messenger.y1.x(" ", str3, translitString)))) {
                                                str5 = strArr3[1];
                                                if (str5 == null && str5.startsWith(str3)) {
                                                    c12 = 2;
                                                } else {
                                                    c12 = c11;
                                                }
                                            } else {
                                                c12 = 1;
                                            }
                                            if (c12 != 0) {
                                                if (c12 == 1) {
                                                    arrayList9.add(AndroidUtilities.generateSearchName(str, null, str3));
                                                } else {
                                                    arrayList9.add(AndroidUtilities.generateSearchName("@" + strArr3[1], null, "@" + str3));
                                                }
                                                arrayList8.add(fk0Var);
                                                if (user == null) {
                                                }
                                                arrayList7.add(user);
                                            }
                                            i14++;
                                            c11 = c12;
                                            arrayList6 = arrayList;
                                            break;
                                        }
                                    }
                                }
                                i26++;
                                strArr2 = strArr;
                                arrayList6 = arrayList;
                                i19 = 1;
                            } else {
                                TLRPC.Chat chat = notificationsCustomSettingsActivity.getMessagesController().getChat(Long.valueOf(-fk0Var.d));
                                if (chat != null) {
                                    if (!chat.left && !chat.kicked && chat.migrated_to == null) {
                                        strArr3[0] = chat.title;
                                        strArr3[i19] = ChatObject.getPublicUsername(chat);
                                        user = chat;
                                    }
                                    i26++;
                                    strArr2 = strArr;
                                    arrayList6 = arrayList;
                                    i19 = 1;
                                }
                                str = strArr3[c10];
                                strArr3[c10] = str.toLowerCase();
                                translitString = LocaleController.getInstance().getTranslitString(strArr3[c10]);
                                str2 = strArr3[c10];
                                if (str2 != null) {
                                    translitString = null;
                                }
                                i14 = 0;
                                c11 = 0;
                                while (true) {
                                    if (i14 >= i25) {
                                        str3 = strArr[i14];
                                        str4 = strArr3[0];
                                        arrayList = arrayList6;
                                        if (str4 == null) {
                                            str5 = strArr3[1];
                                            if (str5 == null) {
                                                c12 = c11;
                                            } else {
                                                c12 = c11;
                                            }
                                        } else {
                                            str5 = strArr3[1];
                                            if (str5 == null) {
                                                c12 = c11;
                                            } else {
                                                c12 = c11;
                                            }
                                        }
                                        if (c12 != 0) {
                                            if (c12 == 1) {
                                                arrayList9.add(AndroidUtilities.generateSearchName(str, null, str3));
                                            } else {
                                                arrayList9.add(AndroidUtilities.generateSearchName("@" + strArr3[1], null, "@" + str3));
                                            }
                                            arrayList8.add(fk0Var);
                                            if (user == null) {
                                                arrayList7.add(user);
                                            }
                                        }
                                        i14++;
                                        c11 = c12;
                                        arrayList6 = arrayList;
                                        break;
                                    }
                                }
                                i26++;
                                strArr2 = strArr;
                                arrayList6 = arrayList;
                                i19 = 1;
                            }
                            arrayList = arrayList6;
                            i26++;
                            strArr2 = strArr;
                            arrayList6 = arrayList;
                            i19 = 1;
                        }
                        user = null;
                        str = strArr3[c10];
                        strArr3[c10] = str.toLowerCase();
                        translitString = LocaleController.getInstance().getTranslitString(strArr3[c10]);
                        str2 = strArr3[c10];
                        if (str2 != null) {
                            translitString = null;
                        }
                        i14 = 0;
                        c11 = 0;
                        while (true) {
                            if (i14 >= i25) {
                                arrayList = arrayList6;
                            }
                            str3 = strArr[i14];
                            str4 = strArr3[0];
                            arrayList = arrayList6;
                            if (str4 == null) {
                                str5 = strArr3[1];
                                if (str5 == null) {
                                    c12 = c11;
                                } else {
                                    c12 = c11;
                                }
                            } else {
                                str5 = strArr3[1];
                                if (str5 == null) {
                                    c12 = c11;
                                } else {
                                    c12 = c11;
                                }
                            }
                            if (c12 != 0) {
                                if (c12 == 1) {
                                    arrayList9.add(AndroidUtilities.generateSearchName(str, null, str3));
                                } else {
                                    arrayList9.add(AndroidUtilities.generateSearchName("@" + strArr3[1], null, "@" + str3));
                                }
                                arrayList8.add(fk0Var);
                                if (user == null) {
                                    arrayList7.add(user);
                                }
                            }
                            i14++;
                            c11 = c12;
                            arrayList6 = arrayList;
                            break;
                            break;
                        }
                        i26++;
                        strArr2 = strArr;
                        arrayList6 = arrayList;
                        i19 = 1;
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11(ck0Var, arrayList8, arrayList9, arrayList7, 20));
                }
                break;
            case 9:
                NotificationsSettingsActivity.W((NotificationsSettingsActivity) this.f36808b, (ArrayList) this.d, (Runnable) this.f36809c);
                break;
            case 10:
                xm0 xm0Var = (xm0) this.f36808b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.f36809c;
                xm0Var.x1();
                if (tL_error4 == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject5;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xm0Var.getParentActivity());
                    alertDialog$Builder.f22702a.P = LocaleController.formatString("RestoreEmailSent", R.string.RestoreEmailSent, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.RestoreEmailSentTitle);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new nl0(i17, xm0Var, tL_auth_passwordRecovery));
                    Dialog dialogShowDialog = xm0Var.showDialog(alertDialog$Builder.f22702a);
                    if (dialogShowDialog != null) {
                        dialogShowDialog.setCanceledOnTouchOutside(false);
                        dialogShowDialog.setCancelable(false);
                    }
                } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                    int iIntValue = Utilities.parseInt((CharSequence) tL_error4.text).intValue();
                    xm0Var.M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                } else {
                    xm0Var.M1(LocaleController.getString(R.string.AppName), tL_error4.text);
                }
                break;
            case 11:
                ((mm0) this.f36808b).S(((TLRPC.TL_error) this.d).text, (String) this.f36809c);
                break;
            case 12:
                km0 km0Var = (km0) this.f36808b;
                byte[] bArr = (byte[]) this.d;
                String str9 = (String) this.f36809c;
                SecureRandom secureRandom = Utilities.random;
                xm0 xm0Var2 = km0Var.f39810e;
                secureRandom.setSeed(xm0Var2.F.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = xm0Var2.F;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] bArrP1 = xm0.p1();
                xm0Var2.Y0 = bArrP1;
                xm0Var2.X0 = Utilities.bytesToLong(Utilities.computeSHA256(bArrP1));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = xm0Var2.F.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] bArrComputePBKDF2 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    xm0Var2.f44481a1 = bArrComputePBKDF2;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(bArrComputePBKDF2, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(xm0Var2.f44481a1, 32, bArr3, 0, 16);
                    byte[] bArr4 = xm0Var2.Y0;
                    Utilities.aesCbcEncryptionByteArraySafe(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = xm0Var2.Y0;
                    tL_secureSecretSettings.secure_secret_id = xm0Var2.X0;
                    passwordinputsettings.flags |= 4;
                }
                ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var2).currentAccount).sendRequest(updatepasswordsettings, new im0(km0Var, i18));
                break;
            case 13:
                tm0 tm0Var = (tm0) this.f36808b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.f36809c;
                int i27 = tm0Var.H;
                xm0 xm0Var3 = tm0Var.M;
                xm0Var3.x1();
                tm0Var.F = false;
                if (tL_error5 == null) {
                    tm0Var.s();
                    tm0Var.r();
                    ((bm0) xm0Var3.f44534x1).c(xm0Var3.A, (String) xm0Var3.f44512o1.get("phone"), null, null, null, null, null, null, null, null, new hl0(xm0Var3, 6), null);
                } else {
                    tm0Var.G = tL_error5.text;
                    if ((i27 == 3 && ((i16 = tm0Var.I) == 4 || i16 == 2)) || ((i27 == 2 && ((i15 = tm0Var.I) == 4 || i15 == 3)) || (i27 == 4 && tm0Var.I == 2))) {
                        tm0Var.q();
                    }
                    if (i27 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(tm0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i27 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(tm0Var, NotificationCenter.didReceiveCall);
                    }
                    tm0Var.E = true;
                    if (i27 != 3) {
                        org.telegram.ui.Components.y4.f0(((org.telegram.ui.ActionBar.n2) xm0Var3).currentAccount, tL_error5, xm0Var3, verifyphone, new Object[0]);
                    }
                    xm0Var3.N1(true, false);
                    if (tL_error5.text.contains("PHONE_CODE_EMPTY") || tL_error5.text.contains("PHONE_CODE_INVALID")) {
                        int i28 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = tm0Var.d;
                            if (i28 >= editTextBoldCursorArr.length) {
                                editTextBoldCursorArr[0].requestFocus();
                            } else {
                                editTextBoldCursorArr[i28].setText("");
                                i28++;
                            }
                        }
                    } else if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                        tm0Var.c(true);
                        xm0Var3.K1(0, true, null);
                    }
                }
                break;
            case 14:
                do0.U((do0) this.f36808b, (TL_account.Password) this.d, (byte[]) this.f36809c);
                break;
            case 15:
                do0.b0((do0) this.f36808b, (TLRPC.TL_error) this.d, (TLRPC.TL_payments_sendPaymentForm) this.f36809c);
                break;
            case 16:
                do0 do0Var = (do0) this.f36808b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.d;
                ff0 ff0Var = (ff0) this.f36809c;
                do0Var.A0 = tL_payments_validatedRequestedInfo;
                ff0Var.run();
                do0Var.D0(false);
                do0Var.H0(true, false);
                break;
            case 17:
                PhotoViewer photoViewer = (PhotoViewer) this.f36808b;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.d;
                String str10 = (String) this.f36809c;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.getClass();
                bitmapHolder.release();
                if (str10.equals(photoViewer.f35805y4.getImageKey())) {
                    photoViewer.f35750s4 = 2;
                    photoViewer.f35759t4 = str10;
                }
                break;
            case 18:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f36808b;
                Bitmap bitmap = (Bitmap) this.d;
                hq0 hq0Var = (hq0) this.f36809c;
                photoViewer2.f35805y4.setImageBitmap(bitmap);
                photoViewer2.f35724p5.setUndoCutState(true);
                photoViewer2.a3(true, true);
                AndroidUtilities.cancelRunOnUIThread(hq0Var);
                AndroidUtilities.runOnUIThread(hq0Var, 800L);
                break;
            case 19:
                PhotoViewer photoViewer3 = (PhotoViewer) this.f36808b;
                boolean[] zArr = (boolean[]) this.d;
                dr0 dr0Var = (dr0) this.f36809c;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                if (!zArr[0]) {
                    ImageView imageView = photoViewer3.f35758t3;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    SurfaceView surfaceView = photoViewer3.f35803y2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    zArr[0] = true;
                    dr0Var.run();
                }
                break;
            case 20:
                it0 it0Var = (it0) this.f36808b;
                it0 it0Var2 = (it0) this.d;
                int[] iArr = (int[]) this.f36809c;
                PhotoViewer photoViewer4 = it0Var.d;
                if (photoViewer4.f35800y != null && it0Var2 == photoViewer4.f35754s8) {
                    photoViewer4.f35754s8 = null;
                    photoViewer4.f35691l8 = iArr[5];
                    photoViewer4.f35618d8 = iArr[4];
                    photoViewer4.f35628e8 = iArr[7];
                    float f10 = photoViewer4.f35599b8 / 8;
                    PhotoViewer photoViewer5 = it0Var.d;
                    photoViewer4.f35699m8 = (long) ((f10 * photoViewer5.f35618d8) / 1000.0f);
                    if (photoViewer5.f35638f8) {
                        PhotoViewer photoViewer6 = it0Var.d;
                        photoViewer6.W7 = iArr[8];
                        photoViewer6.D3();
                        if (it0Var.d.T7 > it0Var.d.U7 - 1) {
                            PhotoViewer photoViewer7 = it0Var.d;
                            photoViewer7.T7 = photoViewer7.U7 - 1;
                        }
                        PhotoViewer photoViewer8 = it0Var.d;
                        if (!photoViewer8.F4) {
                            org.telegram.ui.Components.y51 y51Var = photoViewer8.f35631f1;
                            boolean z12 = photoViewer8.U7 > 1;
                            PhotoViewer photoViewer9 = it0Var.d;
                            y51Var.a(Math.min(photoViewer9.Z7, it0Var.d.f35589a8), z12, photoViewer9.f35735r);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb2 = new StringBuilder("compressionsCount = ");
                            sb2.append(it0Var.d.U7);
                            sb2.append(" w = ");
                            sb2.append(it0Var.d.X7);
                            sb2.append(" h = ");
                            sb2.append(it0Var.d.Y7);
                            sb2.append(" r = ");
                            i0.a.v(it0Var.d.W7, sb2);
                        }
                        it0Var.d.J7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = it0Var.d;
                        if (!photoViewer10.F4) {
                            photoViewer10.f35631f1.a(Math.min(photoViewer10.Z7, it0Var.d.f35589a8), false, photoViewer10.f35735r);
                        }
                        it0Var.d.U7 = 0;
                    }
                    it0Var.d.B3();
                    it0Var.d.x3();
                    break;
                }
                break;
            case 21:
                jv0 jv0Var = (jv0) this.f36808b;
                rn rnVar = (rn) this.d;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.f36809c;
                MessageObject messageObject = jv0Var.D;
                byte[] bArr5 = pollAnswer.option;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    messageObject.getDialogId();
                    hnVar = new hn();
                    hnVar.f38861a = messageObject;
                    hnVar.f38862b = -1;
                    hnVar.f38863c = -1;
                    hnVar.h = true;
                    hnVar.f38864e = bArr5;
                    hnVar.e();
                }
                rnVar.Cb(messageObject, hnVar);
                jv0Var.c(false);
                break;
            case 22:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f36808b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.f36809c;
                if (tL_error6 != null) {
                    org.telegram.ui.Components.mc.b0(tL_error6);
                } else if (!(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.y1.r(R.string.UnknownError, org.telegram.ui.Components.mc.a0(premiumPreviewFragment), null);
                }
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) this.f36808b;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.f36809c;
                profileActivity.getClass();
                int size2 = arrayList10.size();
                for (int i29 = 0; i29 < size2; i29++) {
                    TLRPC.User user5 = (TLRPC.User) arrayList10.get(i29);
                    if (!hashSet.contains(Long.valueOf(user5.f22527id))) {
                        TLRPC.ChatFull chatFull = profileActivity.f36036q2;
                        if (chatFull.participants == null) {
                            chatFull.participants = new TLRPC.TL_chatParticipants();
                        }
                        if (ChatObject.isChannel(profileActivity.A2)) {
                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                            TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                            tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                            tL_channelParticipant.inviter_id = profileActivity.getUserConfig().getClientUserId();
                            tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                            channelParticipant.peer.user_id = user5.f22527id;
                            channelParticipant.date = profileActivity.getConnectionsManager().getCurrentTime();
                            tL_chatChannelParticipant.user_id = user5.f22527id;
                            profileActivity.f36036q2.participants.participants.add(tL_chatChannelParticipant);
                        } else {
                            TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                            tL_chatParticipant.user_id = user5.f22527id;
                            tL_chatParticipant.inviter_id = profileActivity.getAccountInstance().getUserConfig().clientUserId;
                            profileActivity.f36036q2.participants.participants.add(tL_chatParticipant);
                        }
                        profileActivity.f36036q2.participants_count++;
                        profileActivity.getMessagesController().putUser(user5, false);
                    }
                }
                profileActivity.e5(true, false);
                break;
            case 24:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f36808b;
                org.telegram.ui.Components.rn rnVar2 = (org.telegram.ui.Components.rn) this.d;
                rn rnVar3 = (rn) this.f36809c;
                org.telegram.ui.Components.nn nnVar = rnVar2.f32217e;
                ViewGroup viewGroup = (ViewGroup) rnVar3.fragmentView;
                RectF rectF = qg.j.h;
                qg.j.c(nnVar, viewGroup, rectF);
                profileActivity2.K5 = rectF.left;
                profileActivity2.N3();
                break;
            case 25:
                org.telegram.ui.Components.mc.D((qb) this.f36808b, (TLRPC.User) this.d, ((TLRPC.Chat) this.f36809c).title).j();
                break;
            case 26:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f36808b;
                Runnable runnable = (Runnable) this.d;
                MessageObject messageObject2 = (MessageObject) this.f36809c;
                secretMediaViewer.f36140i0 = 0;
                secretMediaViewer.G0 = null;
                if (runnable != null) {
                    runnable.run();
                }
                ag.y1 y1Var = secretMediaViewer.f36130e;
                if (y1Var != null) {
                    y1Var.setLayerType(0, null);
                    secretMediaViewer.f36130e.invalidate();
                    v31 v31Var = secretMediaViewer.f36148n;
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    long j10 = message2.destroyTimeMillis;
                    long j11 = message2.ttl;
                    v31Var.f43343e = false;
                    v31Var.f43344f = j10;
                    v31Var.h = j11;
                    v31Var.f43345n.start();
                    v31Var.invalidate();
                    if (secretMediaViewer.f36129d1) {
                        secretMediaViewer.e(true, true);
                        break;
                    } else if (secretMediaViewer.f36147m1 && MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) < 3) {
                        secretMediaViewer.l();
                        break;
                    }
                }
                break;
            case 27:
                f71 f71Var = (f71) this.f36808b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.f36809c;
                SessionsActivity sessionsActivity = f71Var.f37957b0;
                if (tL_error7 == null) {
                    sessionsActivity.f36179e.remove(tL_authorization);
                    sessionsActivity.f36180f.remove(tL_authorization);
                    sessionsActivity.m0();
                    j71 j71Var = sessionsActivity.f36176a;
                    if (j71Var != null) {
                        j71Var.l();
                    }
                    sessionsActivity.k0(true);
                }
                break;
            case 28:
                g71 g71Var = (g71) this.f36808b;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) this.f36809c;
                SessionsActivity sessionsActivity2 = g71Var.f38331a;
                if (tL_error8 == null) {
                    sessionsActivity2.f36179e.remove(tL_authorization2);
                    sessionsActivity2.f36180f.remove(tL_authorization2);
                    sessionsActivity2.m0();
                    j71 j71Var2 = sessionsActivity2.f36176a;
                    if (j71Var2 != null) {
                        j71Var2.l();
                    }
                }
                break;
            default:
                i71 i71Var = (i71) this.f36808b;
                String str11 = (String) this.d;
                k9 k9Var = (k9) this.f36809c;
                try {
                    byte[] bArrDecode = Base64.decode(str11.substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = bArrDecode;
                    i71Var.f38992c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new v80(25, i71Var, k9Var));
                } catch (Exception e9) {
                    FileLog.e("Failed to pass qr code auth", e9);
                    AndroidUtilities.runOnUIThread(new h71(i71Var, i19));
                    k9Var.run();
                }
                break;
        }
    }

    public bf0(Object obj, Object obj2, Object obj3, int i10) {
        this.f36807a = i10;
        this.f36808b = obj;
        this.d = obj2;
        this.f36809c = obj3;
    }
}
