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

public final class gj implements Runnable {

    public final int f28718a = 1;

    public final int f28719b;

    public final Object f28720c;
    public final int d;

    public final Object f28721e;

    public final Object f28722f;
    public final Object h;

    public gj(org.telegram.ui.i6 i6Var, rh.d1 d1Var, int i10, org.telegram.ui.Cells.j9 j9Var, rh.g0 g0Var, int i11) {
        this.f28721e = i6Var;
        this.f28722f = d1Var;
        this.f28719b = i10;
        this.f28720c = j9Var;
        this.h = g0Var;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        String lowerCase;
        String translitString;
        String str;
        char c10;
        String publicUsername;
        int i11;
        int i12 = this.f28718a;
        Object obj = this.h;
        Object obj2 = this.f28720c;
        int i13 = this.f28719b;
        Object obj3 = this.f28722f;
        Object obj4 = this.f28721e;
        switch (i12) {
            case 0:
                hj hjVar = (hj) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                hjVar.getClass();
                String lowerCase2 = ((String) obj3).trim().toLowerCase();
                if (lowerCase2.length() != 0) {
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString2) || translitString2.length() == 0) {
                        translitString2 = null;
                    }
                    int i14 = (translitString2 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i14];
                    strArr[0] = lowerCase2;
                    if (translitString2 != null) {
                        strArr[1] = translitString2;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    hj hjVar2 = hjVar;
                    ArrayList arrayList4 = new ArrayList();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int i15 = 0;
                    while (i15 < arrayList.size()) {
                        ContactsController.Contact contact = (ContactsController.Contact) arrayList.get(i15);
                        String lowerCase3 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                        String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                        hj hjVar3 = hjVar2;
                        TLRPC.User user = contact.user;
                        if (user != null) {
                            lowerCase = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                            translitString = LocaleController.getInstance().getTranslitString(lowerCase3);
                        } else {
                            lowerCase = null;
                            translitString = null;
                        }
                        if (lowerCase3.equals(translitString3)) {
                            translitString3 = null;
                        }
                        int i16 = i13;
                        int i17 = 0;
                        char c11 = 0;
                        while (i17 < i14) {
                            int i18 = i17;
                            String str2 = strArr[i18];
                            if ((lowerCase == null || !(lowerCase.startsWith(str2) || org.telegram.messenger.y1.x(" ", str2, lowerCase))) && (translitString == null || !(translitString.startsWith(str2) || org.telegram.messenger.y1.x(" ", str2, translitString)))) {
                                str = lowerCase;
                                TLRPC.User user2 = contact.user;
                                c10 = (user2 == null || (publicUsername = UserObject.getPublicUsername(user2)) == null || !publicUsername.startsWith(str2)) ? (lowerCase3.startsWith(str2) || org.telegram.messenger.y1.x(" ", str2, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str2) || org.telegram.messenger.y1.x(" ", str2, translitString3)))) ? (char) 3 : c11 : (char) 2;
                            } else {
                                str = lowerCase;
                                c10 = 1;
                            }
                            String str3 = lowerCase3;
                            if (c10 != 0 && (!contact.phones.isEmpty() || !contact.shortPhones.isEmpty())) {
                                if (c10 == 3) {
                                    arrayList4.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str2));
                                } else if (c10 == 1) {
                                    TLRPC.User user3 = contact.user;
                                    arrayList4.add(AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, str2));
                                } else {
                                    arrayList4.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(contact.user), null, "@" + str2));
                                }
                                TLRPC.User user4 = contact.user;
                                if (user4 != null) {
                                    longSparseIntArray.put(user4.f22527id, 1);
                                }
                                arrayList3.add(contact);
                            }
                            i17 = i18 + 1;
                            lowerCase3 = str3;
                            c11 = c10;
                            lowerCase = str;
                            break;
                        }
                        i15++;
                        hjVar2 = hjVar3;
                        arrayList = arrayList;
                        i13 = i16;
                    }
                    hj hjVar4 = hjVar2;
                    int i19 = i13;
                    int i20 = 0;
                    while (i20 < arrayList2.size()) {
                        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i20);
                        if (longSparseIntArray.indexOfKey(tL_contact.user_id) < 0) {
                            TLRPC.User user5 = MessagesController.getInstance(i19).getUser(Long.valueOf(tL_contact.user_id));
                            String lowerCase4 = ContactsController.formatName(user5.first_name, user5.last_name).toLowerCase();
                            String translitString4 = LocaleController.getInstance().getTranslitString(lowerCase4);
                            if (lowerCase4.equals(translitString4)) {
                                translitString4 = null;
                            }
                            char c12 = 0;
                            int i21 = 0;
                            while (true) {
                                if (i21 >= i14) {
                                    i10 = i20;
                                }
                                String str4 = strArr[i21];
                                if (lowerCase4.startsWith(str4) || org.telegram.messenger.y1.x(" ", str4, lowerCase4) || (translitString4 != null && (translitString4.startsWith(str4) || org.telegram.messenger.y1.x(" ", str4, translitString4)))) {
                                    i10 = i20;
                                    c12 = 1;
                                } else {
                                    i10 = i20;
                                    String publicUsername2 = UserObject.getPublicUsername(user5);
                                    if (publicUsername2 != null && publicUsername2.startsWith(str4)) {
                                        c12 = 2;
                                    }
                                }
                                if (c12 != 0 && user5.phone != null) {
                                    if (c12 == 1) {
                                        arrayList4.add(AndroidUtilities.generateSearchName(user5.first_name, user5.last_name, str4));
                                    } else {
                                        arrayList4.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user5), null, "@" + str4));
                                    }
                                    arrayList3.add(user5);
                                }
                                i21++;
                                i20 = i10;
                                break;
                            }
                        } else {
                            i10 = i20;
                        }
                        i20 = i10 + 1;
                        break;
                    }
                    AndroidUtilities.runOnUIThread(new ag.k0(hjVar4, this.d, arrayList3, arrayList4, 14));
                } else {
                    hjVar.h = -1;
                    AndroidUtilities.runOnUIThread(new ag.k0(hjVar, hjVar.h, new ArrayList(), new ArrayList(), 14));
                }
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) obj;
                boolean z10 = ChatAttachAlertPhotoLayout.f26237m1;
                gi giVar = chatAttachAlertPhotoLayout.f34900b;
                if (!giVar.B || giVar.C) {
                    i11 = i13;
                } else {
                    PhotoViewer.t1().K2(null, n2Var, null);
                    PhotoViewer photoViewerT1 = PhotoViewer.t1();
                    photoViewerT1.h = 0;
                    photoViewerT1.f35700n = false;
                    i11 = 3;
                }
                PhotoViewer.t1().f2(arrayList5, this.d, giVar.D ? 13 : i11, false, chatAttachAlertPhotoLayout.f26249d1, giVar.D ? null : rnVar);
                PhotoViewer.t1().x2(giVar.M);
                if (giVar.B && !giVar.C) {
                    PhotoViewer.t1().K = false;
                } else if (giVar.M0 != 0) {
                    PhotoViewer.t1().K = true;
                    PhotoViewer.t1().L = giVar.N0 != null;
                }
                if (giVar.C) {
                    PhotoViewer.t1().X0(null, null, false, giVar.F);
                }
                if (ChatAttachAlertPhotoLayout.T()) {
                    PhotoViewer photoViewerT2 = PhotoViewer.t1();
                    Editable text = giVar.m1().getText();
                    photoViewerT2.f35690l7 = true;
                    photoViewerT2.f35698m7 = text;
                    photoViewerT2.A2(null, text, false, false);
                    photoViewerT2.t3(null);
                }
                break;
            default:
                rh.d1 d1Var = (rh.d1) obj3;
                org.telegram.ui.Cells.j9 j9Var = (org.telegram.ui.Cells.j9) obj2;
                rh.g0 g0Var = (rh.g0) obj;
                rh.h0 h0Var = (rh.h0) ((org.telegram.ui.i6) obj4).f38985c;
                if (d1Var.length() >= i13 && d1Var.getSelectionStart() != d1Var.getSelectionEnd() && j9Var.k0(g0Var.q0(), 0, this.d, i13)) {
                    h0Var.d = true;
                    d1Var.setSelection(i13);
                    h0Var.d = false;
                    break;
                }
                break;
        }
    }

    public gj(hj hjVar, String str, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.f28721e = hjVar;
        this.f28722f = str;
        this.f28720c = arrayList;
        this.h = arrayList2;
        this.f28719b = i10;
        this.d = i11;
    }

    public gj(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, int i11, org.telegram.ui.rn rnVar) {
        this.f28721e = chatAttachAlertPhotoLayout;
        this.f28719b = i10;
        this.f28722f = n2Var;
        this.f28720c = arrayList;
        this.d = i11;
        this.h = rnVar;
    }
}
