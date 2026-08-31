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
    public final int f29522a = 1;
    public final int f29523b;
    public final Object f29524c;
    public final int d;
    public final Object f29525e;
    public final Object f29526f;
    public final Object h;

    public nj(oj ojVar, String str, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.f29525e = ojVar;
        this.f29526f = str;
        this.f29524c = arrayList;
        this.h = arrayList2;
        this.f29523b = i10;
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
        org.telegram.ui.xn xnVar;
        boolean z4;
        int i14 = this.f29522a;
        Object obj = this.h;
        Object obj2 = this.f29524c;
        int i15 = this.f29523b;
        Object obj3 = this.f29526f;
        Object obj4 = this.f29525e;
        switch (i14) {
            case 0:
                oj ojVar = (oj) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                ojVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    ojVar.h = -1;
                    AndroidUtilities.runOnUIThread(new dg.u1((Object) ojVar, ojVar.h, new ArrayList(), (Serializable) new ArrayList(), 14));
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
                    char c10 = 0;
                    while (i19 < i16) {
                        int i20 = i19;
                        String str4 = strArr[i20];
                        if ((str == null || (!str.startsWith(str4) && !org.telegram.messenger.y3.w(" ", str4, str))) && (str2 == null || (!str2.startsWith(str4) && !org.telegram.messenger.y3.w(" ", str4, str2)))) {
                            str3 = str;
                            TLRPC.User user2 = contact.user;
                            if (user2 != null && (publicUsername = UserObject.getPublicUsername(user2)) != null && publicUsername.startsWith(str4)) {
                                c3 = 2;
                            } else if (!lowerCase2.startsWith(str4) && !org.telegram.messenger.y3.w(" ", str4, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str4) && !org.telegram.messenger.y3.w(" ", str4, translitString2)))) {
                                c3 = c10;
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
                                longSparseIntArray.put(user4.f20990id, 1);
                            }
                            arrayList4.add(contact);
                            i17++;
                            ojVar2 = ojVar3;
                            arrayList2 = arrayList;
                            i15 = i18;
                        } else {
                            i19 = i20 + 1;
                            lowerCase2 = str5;
                            c10 = c3;
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
                        char c11 = 0;
                        int i23 = 0;
                        while (i23 < i16) {
                            String str6 = strArr[i23];
                            if (lowerCase3.startsWith(str6) || org.telegram.messenger.y3.w(" ", str6, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str6) || org.telegram.messenger.y3.w(" ", str6, translitString3)))) {
                                i11 = i22;
                                c11 = 1;
                            } else {
                                i11 = i22;
                                String publicUsername2 = UserObject.getPublicUsername(user5);
                                if (publicUsername2 != null && publicUsername2.startsWith(str6)) {
                                    c11 = 2;
                                }
                            }
                            if (c11 != 0 && user5.phone != null) {
                                if (c11 == 1) {
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
                AndroidUtilities.runOnUIThread(new dg.u1((Object) ojVar4, this.d, arrayList4, (Serializable) arrayList5, 14));
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                org.telegram.ui.xn xnVar2 = (org.telegram.ui.xn) obj;
                boolean z10 = ChatAttachAlertPhotoLayout.f24736n1;
                mi miVar = chatAttachAlertPhotoLayout.f26546b;
                if (miVar.C && !miVar.D) {
                    PhotoViewer.t1().K2(null, p2Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.h = 0;
                    t12.f34337n = false;
                    i12 = 3;
                } else {
                    i12 = i15;
                }
                if (miVar.E) {
                    i13 = 13;
                } else {
                    i13 = i12;
                }
                PhotoViewer t13 = PhotoViewer.t1();
                vl vlVar = chatAttachAlertPhotoLayout.f24750e1;
                if (miVar.E) {
                    xnVar = null;
                } else {
                    xnVar = xnVar2;
                }
                t13.f2(arrayList6, this.d, i13, false, vlVar, xnVar);
                PhotoViewer.t1().x2(miVar.N);
                if (miVar.C && !miVar.D) {
                    PhotoViewer.t1().L = false;
                } else if (miVar.N0 != 0) {
                    PhotoViewer.t1().L = true;
                    PhotoViewer t14 = PhotoViewer.t1();
                    if (miVar.O0 != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    t14.M = z4;
                }
                if (miVar.D) {
                    PhotoViewer.t1().Y0(null, null, false, miVar.G);
                }
                if (ChatAttachAlertPhotoLayout.T()) {
                    PhotoViewer t15 = PhotoViewer.t1();
                    Editable text = miVar.m1().getText();
                    t15.f34335m7 = true;
                    t15.f34345n7 = text;
                    t15.A2(null, text, false, false);
                    t15.t3(null);
                    return;
                }
                return;
            default:
                wh.e1 e1Var = (wh.e1) obj3;
                org.telegram.ui.Cells.m9 m9Var = (org.telegram.ui.Cells.m9) obj2;
                wh.h0 h0Var = (wh.h0) obj;
                wh.i0 i0Var = (wh.i0) ((q5.g0) obj4).f44558c;
                if (e1Var.length() >= i15 && e1Var.getSelectionStart() != e1Var.getSelectionEnd() && m9Var.k0(h0Var.E(), 0, this.d, i15)) {
                    i0Var.d = true;
                    e1Var.setSelection(i15);
                    i0Var.d = false;
                    return;
                }
                return;
        }
    }

    public nj(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList, int i11, org.telegram.ui.xn xnVar) {
        this.f29525e = chatAttachAlertPhotoLayout;
        this.f29523b = i10;
        this.f29526f = p2Var;
        this.f29524c = arrayList;
        this.d = i11;
        this.h = xnVar;
    }

    public nj(q5.g0 g0Var, wh.e1 e1Var, int i10, org.telegram.ui.Cells.m9 m9Var, wh.h0 h0Var, int i11) {
        this.f29525e = g0Var;
        this.f29526f = e1Var;
        this.f29523b = i10;
        this.f29524c = m9Var;
        this.h = h0Var;
        this.d = i11;
    }
}
