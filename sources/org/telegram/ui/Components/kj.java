package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class kj implements Runnable {
    public final int f30182a = 2;
    public final int f30183b;
    public final Object f30184c;
    public final int d;
    public final Object f30185e;
    public final Object f30186f;
    public final Object h;

    public kj(org.telegram.ui.Cells.e3 e3Var, qh.d1 d1Var, int i9, org.telegram.ui.Cells.n9 n9Var, qh.g0 g0Var, int i10) {
        this.f30185e = e3Var;
        this.f30186f = d1Var;
        this.f30183b = i9;
        this.f30184c = n9Var;
        this.h = g0Var;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i9;
        int i10;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        char c10;
        String publicUsername;
        int i11;
        int i12;
        org.telegram.ui.qn qnVar;
        boolean z10;
        int i13 = this.f30182a;
        Object obj = this.h;
        Object obj2 = this.f30184c;
        int i14 = this.f30183b;
        Object obj3 = this.f30186f;
        Object obj4 = this.f30185e;
        switch (i13) {
            case 0:
                lj ljVar = (lj) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                ljVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    ljVar.h = -1;
                    AndroidUtilities.runOnUIThread(new c3.d(ljVar, ljVar.h, new ArrayList(), new ArrayList(), 15));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                if (translitString != null) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                int i15 = i9 + 1;
                String[] strArr = new String[i15];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList4 = new ArrayList();
                lj ljVar2 = ljVar;
                ArrayList arrayList5 = new ArrayList();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                int i16 = 0;
                while (i16 < arrayList2.size()) {
                    ContactsController.Contact contact = (ContactsController.Contact) arrayList2.get(i16);
                    String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    lj ljVar3 = ljVar2;
                    TLRPC.User user = contact.user;
                    if (user != null) {
                        arrayList = arrayList2;
                        str = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                        str2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    } else {
                        arrayList = arrayList2;
                        str = null;
                        str2 = null;
                    }
                    if (lowerCase2.equals(translitString2)) {
                        translitString2 = null;
                    }
                    int i17 = i14;
                    int i18 = 0;
                    char c11 = 0;
                    while (i18 < i15) {
                        int i19 = i18;
                        String str4 = strArr[i19];
                        if ((str == null || (!str.startsWith(str4) && !org.telegram.messenger.l0.w(" ", str4, str))) && (str2 == null || (!str2.startsWith(str4) && !org.telegram.messenger.l0.w(" ", str4, str2)))) {
                            str3 = str;
                            TLRPC.User user2 = contact.user;
                            if (user2 != null && (publicUsername = UserObject.getPublicUsername(user2)) != null && publicUsername.startsWith(str4)) {
                                c10 = 2;
                            } else if (!lowerCase2.startsWith(str4) && !org.telegram.messenger.l0.w(" ", str4, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str4) && !org.telegram.messenger.l0.w(" ", str4, translitString2)))) {
                                c10 = c11;
                            } else {
                                c10 = 3;
                            }
                        } else {
                            str3 = str;
                            c10 = 1;
                        }
                        String str5 = lowerCase2;
                        if (c10 != 0 && (!contact.phones.isEmpty() || !contact.shortPhones.isEmpty())) {
                            if (c10 == 3) {
                                arrayList5.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str4));
                            } else if (c10 == 1) {
                                TLRPC.User user3 = contact.user;
                                arrayList5.add(AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, str4));
                            } else {
                                arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(contact.user), null, "@" + str4));
                            }
                            TLRPC.User user4 = contact.user;
                            if (user4 != null) {
                                longSparseIntArray.put(user4.f22527id, 1);
                            }
                            arrayList4.add(contact);
                            i16++;
                            ljVar2 = ljVar3;
                            arrayList2 = arrayList;
                            i14 = i17;
                        } else {
                            i18 = i19 + 1;
                            lowerCase2 = str5;
                            c11 = c10;
                            str = str3;
                        }
                    }
                    i16++;
                    ljVar2 = ljVar3;
                    arrayList2 = arrayList;
                    i14 = i17;
                }
                lj ljVar4 = ljVar2;
                int i20 = i14;
                int i21 = 0;
                while (i21 < arrayList3.size()) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList3.get(i21);
                    if (longSparseIntArray.indexOfKey(tL_contact.user_id) < 0) {
                        TLRPC.User user5 = MessagesController.getInstance(i20).getUser(Long.valueOf(tL_contact.user_id));
                        String lowerCase3 = ContactsController.formatName(user5.first_name, user5.last_name).toLowerCase();
                        String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                        if (lowerCase3.equals(translitString3)) {
                            translitString3 = null;
                        }
                        char c12 = 0;
                        int i22 = 0;
                        while (i22 < i15) {
                            String str6 = strArr[i22];
                            if (lowerCase3.startsWith(str6) || org.telegram.messenger.l0.w(" ", str6, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str6) || org.telegram.messenger.l0.w(" ", str6, translitString3)))) {
                                i10 = i21;
                                c12 = 1;
                            } else {
                                i10 = i21;
                                String publicUsername2 = UserObject.getPublicUsername(user5);
                                if (publicUsername2 != null && publicUsername2.startsWith(str6)) {
                                    c12 = 2;
                                }
                            }
                            if (c12 != 0 && user5.phone != null) {
                                if (c12 == 1) {
                                    arrayList5.add(AndroidUtilities.generateSearchName(user5.first_name, user5.last_name, str6));
                                } else {
                                    arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user5), null, "@" + str6));
                                }
                                arrayList4.add(user5);
                                i21 = i10 + 1;
                            } else {
                                i22++;
                                i21 = i10;
                            }
                        }
                    }
                    i10 = i21;
                    i21 = i10 + 1;
                }
                AndroidUtilities.runOnUIThread(new c3.d(ljVar4, this.d, arrayList4, arrayList5, 15));
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                org.telegram.ui.qn qnVar2 = (org.telegram.ui.qn) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.f26241m1;
                ki kiVar = chatAttachAlertPhotoLayout.f27493b;
                if (kiVar.B && !kiVar.C) {
                    PhotoViewer.t1().K2(null, o2Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.h = 0;
                    t12.f35697n = false;
                    i11 = 3;
                } else {
                    i11 = i14;
                }
                if (kiVar.D) {
                    i12 = 13;
                } else {
                    i12 = i11;
                }
                PhotoViewer t13 = PhotoViewer.t1();
                ol olVar = chatAttachAlertPhotoLayout.f26253d1;
                if (kiVar.D) {
                    qnVar = null;
                } else {
                    qnVar = qnVar2;
                }
                t13.f2(arrayList6, this.d, i12, false, olVar, qnVar);
                PhotoViewer.t1().x2(kiVar.M);
                if (kiVar.B && !kiVar.C) {
                    PhotoViewer.t1().K = false;
                } else if (kiVar.M0 != 0) {
                    PhotoViewer.t1().K = true;
                    PhotoViewer t14 = PhotoViewer.t1();
                    if (kiVar.N0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t14.L = z10;
                }
                if (kiVar.C) {
                    PhotoViewer.t1().X0(null, null, false, kiVar.F);
                }
                if (ChatAttachAlertPhotoLayout.S()) {
                    PhotoViewer t15 = PhotoViewer.t1();
                    Editable text = kiVar.m1().getText();
                    t15.f35687l7 = true;
                    t15.f35695m7 = text;
                    t15.A2(null, text, false, false);
                    t15.t3(null);
                    return;
                }
                return;
            default:
                qh.d1 d1Var = (qh.d1) obj3;
                org.telegram.ui.Cells.n9 n9Var = (org.telegram.ui.Cells.n9) obj2;
                qh.g0 g0Var = (qh.g0) obj;
                qh.h0 h0Var = (qh.h0) ((org.telegram.ui.Cells.e3) obj4).f24287c;
                if (d1Var.length() >= i14 && d1Var.getSelectionStart() != d1Var.getSelectionEnd() && n9Var.k0(g0Var.H(), 0, this.d, i14)) {
                    h0Var.d = true;
                    d1Var.setSelection(i14);
                    h0Var.d = false;
                    return;
                }
                return;
        }
    }

    public kj(lj ljVar, String str, ArrayList arrayList, ArrayList arrayList2, int i9, int i10) {
        this.f30185e = ljVar;
        this.f30186f = str;
        this.f30184c = arrayList;
        this.h = arrayList2;
        this.f30183b = i9;
        this.d = i10;
    }

    public kj(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i9, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, int i10, org.telegram.ui.qn qnVar) {
        this.f30185e = chatAttachAlertPhotoLayout;
        this.f30183b = i9;
        this.f30186f = o2Var;
        this.f30184c = arrayList;
        this.d = i10;
        this.h = qnVar;
    }
}
