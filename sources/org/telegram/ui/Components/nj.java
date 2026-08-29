package org.telegram.ui.Components;

import android.text.Editable;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class nj implements Runnable {
    public final int f31077a = 2;
    public final int f31078b;
    public final Object f31079c;
    public final int d;
    public final Object f31080e;
    public final Object f31081f;
    public final Object h;

    public nj(oc.i iVar, th.d1 d1Var, int i10, org.telegram.ui.Cells.k9 k9Var, th.g0 g0Var, int i11) {
        this.f31080e = iVar;
        this.f31081f = d1Var;
        this.f31078b = i10;
        this.f31079c = k9Var;
        this.h = g0Var;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        char c3;
        String publicUsername;
        int i12;
        int i13;
        org.telegram.ui.tn tnVar;
        boolean z10;
        int i14 = this.f31077a;
        Object obj = this.h;
        Object obj2 = this.f31079c;
        int i15 = this.f31078b;
        Object obj3 = this.f31081f;
        Object obj4 = this.f31080e;
        switch (i14) {
            case 0:
                oj ojVar = (oj) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                ojVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    ojVar.h = -1;
                    AndroidUtilities.runOnUIThread(new ag.z1((Object) ojVar, ojVar.h, new ArrayList(), (Serializable) new ArrayList(), 14));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                if (translitString != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i16 = i10 + 1;
                String[] strArr = new String[i16];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList4 = new ArrayList();
                oj ojVar2 = ojVar;
                ArrayList arrayList5 = new ArrayList();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                int i17 = 0;
                while (i17 < arrayList2.size()) {
                    ContactsController.Contact contact = (ContactsController.Contact) arrayList2.get(i17);
                    String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    oj ojVar3 = ojVar2;
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
                    int i18 = i15;
                    int i19 = 0;
                    char c6 = 0;
                    while (i19 < i16) {
                        int i20 = i19;
                        String str4 = strArr[i20];
                        if ((str == null || (!str.startsWith(str4) && !org.telegram.messenger.x3.w(" ", str4, str))) && (str2 == null || (!str2.startsWith(str4) && !org.telegram.messenger.x3.w(" ", str4, str2)))) {
                            str3 = str;
                            TLRPC.User user2 = contact.user;
                            if (user2 != null && (publicUsername = UserObject.getPublicUsername(user2)) != null && publicUsername.startsWith(str4)) {
                                c3 = 2;
                            } else if (!lowerCase2.startsWith(str4) && !org.telegram.messenger.x3.w(" ", str4, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str4) && !org.telegram.messenger.x3.w(" ", str4, translitString2)))) {
                                c3 = c6;
                            } else {
                                c3 = 3;
                            }
                        } else {
                            str3 = str;
                            c3 = 1;
                        }
                        String str5 = lowerCase2;
                        if (c3 != 0 && (!contact.phones.isEmpty() || !contact.shortPhones.isEmpty())) {
                            if (c3 == 3) {
                                arrayList5.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str4));
                            } else if (c3 == 1) {
                                TLRPC.User user3 = contact.user;
                                arrayList5.add(AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, str4));
                            } else {
                                arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(contact.user), null, "@" + str4));
                            }
                            TLRPC.User user4 = contact.user;
                            if (user4 != null) {
                                longSparseIntArray.put(user4.f22539id, 1);
                            }
                            arrayList4.add(contact);
                            i17++;
                            ojVar2 = ojVar3;
                            arrayList2 = arrayList;
                            i15 = i18;
                        } else {
                            i19 = i20 + 1;
                            lowerCase2 = str5;
                            c6 = c3;
                            str = str3;
                        }
                    }
                    i17++;
                    ojVar2 = ojVar3;
                    arrayList2 = arrayList;
                    i15 = i18;
                }
                oj ojVar4 = ojVar2;
                int i21 = i15;
                int i22 = 0;
                while (i22 < arrayList3.size()) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList3.get(i22);
                    if (longSparseIntArray.indexOfKey(tL_contact.user_id) < 0) {
                        TLRPC.User user5 = MessagesController.getInstance(i21).getUser(Long.valueOf(tL_contact.user_id));
                        String lowerCase3 = ContactsController.formatName(user5.first_name, user5.last_name).toLowerCase();
                        String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                        if (lowerCase3.equals(translitString3)) {
                            translitString3 = null;
                        }
                        char c10 = 0;
                        int i23 = 0;
                        while (i23 < i16) {
                            String str6 = strArr[i23];
                            if (lowerCase3.startsWith(str6) || org.telegram.messenger.x3.w(" ", str6, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str6) || org.telegram.messenger.x3.w(" ", str6, translitString3)))) {
                                i11 = i22;
                                c10 = 1;
                            } else {
                                i11 = i22;
                                String publicUsername2 = UserObject.getPublicUsername(user5);
                                if (publicUsername2 != null && publicUsername2.startsWith(str6)) {
                                    c10 = 2;
                                }
                            }
                            if (c10 != 0 && user5.phone != null) {
                                if (c10 == 1) {
                                    arrayList5.add(AndroidUtilities.generateSearchName(user5.first_name, user5.last_name, str6));
                                } else {
                                    arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user5), null, "@" + str6));
                                }
                                arrayList4.add(user5);
                                i22 = i11 + 1;
                            } else {
                                i23++;
                                i22 = i11;
                            }
                        }
                    }
                    i11 = i22;
                    i22 = i11 + 1;
                }
                AndroidUtilities.runOnUIThread(new ag.z1((Object) ojVar4, this.d, arrayList4, (Serializable) arrayList5, 14));
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                org.telegram.ui.tn tnVar2 = (org.telegram.ui.tn) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.f26252m1;
                ni niVar = chatAttachAlertPhotoLayout.f28403b;
                if (niVar.B && !niVar.C) {
                    PhotoViewer.t1().K2(null, o2Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.h = 0;
                    t12.f35763n = false;
                    i12 = 3;
                } else {
                    i12 = i15;
                }
                if (niVar.D) {
                    i13 = 13;
                } else {
                    i13 = i12;
                }
                PhotoViewer t13 = PhotoViewer.t1();
                sl slVar = chatAttachAlertPhotoLayout.f26264d1;
                if (niVar.D) {
                    tnVar = null;
                } else {
                    tnVar = tnVar2;
                }
                t13.f2(arrayList6, this.d, i13, false, slVar, tnVar);
                PhotoViewer.t1().x2(niVar.M);
                if (niVar.B && !niVar.C) {
                    PhotoViewer.t1().K = false;
                } else if (niVar.M0 != 0) {
                    PhotoViewer.t1().K = true;
                    PhotoViewer t14 = PhotoViewer.t1();
                    if (niVar.N0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t14.L = z10;
                }
                if (niVar.C) {
                    PhotoViewer.t1().X0(null, null, false, niVar.F);
                }
                if (ChatAttachAlertPhotoLayout.T()) {
                    PhotoViewer t15 = PhotoViewer.t1();
                    Editable text = niVar.m1().getText();
                    t15.f35753l7 = true;
                    t15.f35761m7 = text;
                    t15.A2(null, text, false, false);
                    t15.t3(null);
                    return;
                }
                return;
            default:
                th.d1 d1Var = (th.d1) obj3;
                org.telegram.ui.Cells.k9 k9Var = (org.telegram.ui.Cells.k9) obj2;
                th.g0 g0Var = (th.g0) obj;
                th.h0 h0Var = (th.h0) ((oc.i) obj4).f19484c;
                if (d1Var.length() >= i15 && d1Var.getSelectionStart() != d1Var.getSelectionEnd() && k9Var.k0(g0Var.D(), 0, this.d, i15)) {
                    h0Var.d = true;
                    d1Var.setSelection(i15);
                    h0Var.d = false;
                    return;
                }
                return;
        }
    }

    public nj(oj ojVar, String str, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.f31080e = ojVar;
        this.f31081f = str;
        this.f31079c = arrayList;
        this.h = arrayList2;
        this.f31078b = i10;
        this.d = i11;
    }

    public nj(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, int i11, org.telegram.ui.tn tnVar) {
        this.f31080e = chatAttachAlertPhotoLayout;
        this.f31078b = i10;
        this.f31081f = o2Var;
        this.f31079c = arrayList;
        this.d = i11;
        this.h = tnVar;
    }
}
