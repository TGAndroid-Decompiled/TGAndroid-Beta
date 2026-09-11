package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class i8 implements Runnable {
    public final int f27008a = 0;
    public final j8 f27009b;
    public final ArrayList f27010c;
    public final String d;

    public i8(j8 j8Var, String str, ArrayList arrayList) {
        this.f27009b = j8Var;
        this.d = str;
        this.f27010c = arrayList;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.Document document;
        boolean z10;
        String str;
        int i11 = this.f27008a;
        String str2 = this.d;
        ArrayList arrayList = this.f27010c;
        j8 j8Var = this.f27009b;
        switch (i11) {
            case 0:
                j8Var.getClass();
                String lowerCase = str2.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new i8(j8Var, new ArrayList(), str2));
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
                AndroidUtilities.runOnUIThread(new i8(j8Var, arrayList2, str2));
                return;
            default:
                k8 k8Var = j8Var.f27376n;
                if (k8Var.h) {
                    k8Var.f27721f = true;
                    j8Var.d = arrayList;
                    j8Var.f27374e = str2;
                    j8Var.l();
                    k8Var.f27734r.n0(0);
                    org.telegram.messenger.vl.p(R.string.NoAudioFoundPlayerInfo, new Object[]{str2}, k8Var.f27745y);
                    return;
                }
                return;
        }
    }

    public i8(j8 j8Var, ArrayList arrayList, String str) {
        this.f27009b = j8Var;
        this.f27010c = arrayList;
        this.d = str;
    }
}
