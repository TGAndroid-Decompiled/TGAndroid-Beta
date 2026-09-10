package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class h8 implements Runnable {
    public final int f23544a = 0;
    public final i8 f23545b;
    public final ArrayList f23546c;
    public final String d;

    public h8(i8 i8Var, String str, ArrayList arrayList) {
        this.f23545b = i8Var;
        this.d = str;
        this.f23546c = arrayList;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.Document document;
        boolean z10;
        String str;
        int i11 = this.f23544a;
        String str2 = this.d;
        ArrayList arrayList = this.f23546c;
        i8 i8Var = this.f23545b;
        switch (i11) {
            case 0:
                i8Var.getClass();
                String lowerCase = str2.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new h8(i8Var, new ArrayList(), str2));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                translitString = (lowerCase.equals(translitString) || translitString.length() == 0) ? null : null;
                if (translitString != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i12 = i10 + 1;
                String[] strArr = new String[i12];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 < i12) {
                            String str3 = strArr[i14];
                            String documentName = messageObject.getDocumentName();
                            if (documentName != null && documentName.length() != 0) {
                                if (documentName.toLowerCase().contains(str3)) {
                                    arrayList2.add(messageObject);
                                } else {
                                    if (messageObject.type == 0) {
                                        document = messageObject.messageOwner.media.webpage.document;
                                    } else {
                                        document = messageObject.messageOwner.media.document;
                                    }
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 < document.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i15);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                String str4 = documentAttribute.performer;
                                                if (str4 != null) {
                                                    z10 = str4.toLowerCase().contains(str3);
                                                } else {
                                                    z10 = false;
                                                }
                                                if (!z10 && (str = documentAttribute.title) != null) {
                                                    z10 = str.toLowerCase().contains(str3);
                                                }
                                            } else {
                                                i15++;
                                            }
                                        } else {
                                            z10 = false;
                                        }
                                    }
                                    if (z10) {
                                        arrayList2.add(messageObject);
                                    }
                                }
                            }
                            i14++;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new h8(i8Var, arrayList2, str2));
                return;
            default:
                j8 j8Var = i8Var.f23923n;
                if (j8Var.h) {
                    j8Var.f24283f = true;
                    i8Var.d = arrayList;
                    i8Var.e = str2;
                    i8Var.l();
                    j8Var.f24296r.n0(0);
                    org.telegram.messenger.em.p(R.string.NoAudioFoundPlayerInfo, new Object[]{str2}, j8Var.f24307y);
                    return;
                }
                return;
        }
    }

    public h8(i8 i8Var, ArrayList arrayList, String str) {
        this.f23545b = i8Var;
        this.f23546c = arrayList;
        this.d = str;
    }
}
