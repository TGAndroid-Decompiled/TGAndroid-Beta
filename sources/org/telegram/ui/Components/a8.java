package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class a8 implements Runnable {
    public final int f26717a = 0;
    public final b8 f26718b;
    public final ArrayList f26719c;
    public final String d;

    public a8(b8 b8Var, String str, ArrayList arrayList) {
        this.f26718b = b8Var;
        this.d = str;
        this.f26719c = arrayList;
    }

    @Override
    public final void run() {
        int i9;
        TLRPC.Document document;
        boolean z10;
        String str;
        int i10 = this.f26717a;
        String str2 = this.d;
        ArrayList arrayList = this.f26719c;
        b8 b8Var = this.f26718b;
        switch (i10) {
            case 0:
                b8Var.getClass();
                String lowerCase = str2.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new a8(b8Var, new ArrayList(), str2));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                translitString = (lowerCase.equals(translitString) || translitString.length() == 0) ? null : null;
                if (translitString != null) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                int i11 = i9 + 1;
                String[] strArr = new String[i11];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i12);
                    int i13 = 0;
                    while (true) {
                        if (i13 < i11) {
                            String str3 = strArr[i13];
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
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 < document.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i14);
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
                                                i14++;
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
                            i13++;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new a8(b8Var, arrayList2, str2));
                return;
            default:
                c8 c8Var = b8Var.f27070n;
                if (c8Var.h) {
                    c8Var.f27386f = true;
                    b8Var.d = arrayList;
                    b8Var.f27068e = str2;
                    b8Var.l();
                    c8Var.f27399r.n0(0);
                    org.telegram.messenger.ll.q(R.string.NoAudioFoundPlayerInfo, new Object[]{str2}, c8Var.f27410y);
                    return;
                }
                return;
        }
    }

    public a8(b8 b8Var, ArrayList arrayList, String str) {
        this.f26718b = b8Var;
        this.f26719c = arrayList;
        this.d = str;
    }
}
