package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class f8 implements Runnable {
    public final int f23846a = 0;
    public final g8 f23847b;
    public final ArrayList f23848c;
    public final String d;

    public f8(g8 g8Var, String str, ArrayList arrayList) {
        this.f23847b = g8Var;
        this.d = str;
        this.f23848c = arrayList;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.Document document;
        boolean z10;
        String str;
        int i11 = this.f23846a;
        String str2 = this.d;
        ArrayList arrayList = this.f23848c;
        g8 g8Var = this.f23847b;
        switch (i11) {
            case 0:
                g8Var.getClass();
                String lowerCase = str2.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new f8(g8Var, new ArrayList(), str2));
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
                AndroidUtilities.runOnUIThread(new f8(g8Var, arrayList2, str2));
                return;
            default:
                h8 h8Var = g8Var.f24248n;
                if (h8Var.h) {
                    h8Var.f24558f = true;
                    g8Var.d = arrayList;
                    g8Var.e = str2;
                    g8Var.l();
                    h8Var.f24571r.n0(0);
                    org.telegram.messenger.wl.p(R.string.NoAudioFoundPlayerInfo, new Object[]{str2}, h8Var.f24582y);
                    return;
                }
                return;
        }
    }

    public f8(g8 g8Var, ArrayList arrayList, String str) {
        this.f23847b = g8Var;
        this.f23848c = arrayList;
        this.d = str;
    }
}
