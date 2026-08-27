package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class z7 implements Runnable {

    public final int f35175a = 0;

    public final a8 f35176b;

    public final ArrayList f35177c;
    public final String d;

    public z7(a8 a8Var, String str, ArrayList arrayList) {
        this.f35176b = a8Var;
        this.d = str;
        this.f35177c = arrayList;
    }

    @Override
    public final void run() {
        boolean zContains;
        String str;
        int i10 = this.f35175a;
        String str2 = this.d;
        ArrayList arrayList = this.f35177c;
        a8 a8Var = this.f35176b;
        switch (i10) {
            case 0:
                a8Var.getClass();
                String lowerCase = str2.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new z7(a8Var, new ArrayList(), str2));
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i11 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i11];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i12);
                        for (int i13 = 0; i13 < i11; i13++) {
                            String str3 = strArr[i13];
                            String documentName = messageObject.getDocumentName();
                            if (documentName != null && documentName.length() != 0) {
                                if (documentName.toLowerCase().contains(str3)) {
                                    arrayList2.add(messageObject);
                                }
                                TLRPC.Document document = messageObject.type == 0 ? messageObject.messageOwner.media.webpage.document : messageObject.messageOwner.media.document;
                                int i14 = 0;
                                while (true) {
                                    if (i14 < document.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i14);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                            String str4 = documentAttribute.performer;
                                            zContains = str4 != null ? str4.toLowerCase().contains(str3) : false;
                                            if (!zContains && (str = documentAttribute.title) != null) {
                                                zContains = str.toLowerCase().contains(str3);
                                            }
                                        } else {
                                            i14++;
                                        }
                                    } else {
                                        zContains = false;
                                    }
                                }
                                if (zContains) {
                                    arrayList2.add(messageObject);
                                }
                                break;
                                break;
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new z7(a8Var, arrayList2, str2));
                }
                break;
            default:
                b8 b8Var = a8Var.f26657n;
                if (b8Var.h) {
                    b8Var.f27018f = true;
                    a8Var.d = arrayList;
                    a8Var.f26655e = str2;
                    a8Var.l();
                    b8Var.f27031r.n0(0);
                    org.telegram.messenger.rl.n(R.string.NoAudioFoundPlayerInfo, new Object[]{str2}, b8Var.f27042y);
                    break;
                }
                break;
        }
    }

    public z7(a8 a8Var, ArrayList arrayList, String str) {
        this.f35176b = a8Var;
        this.f35177c = arrayList;
        this.d = str;
    }
}
