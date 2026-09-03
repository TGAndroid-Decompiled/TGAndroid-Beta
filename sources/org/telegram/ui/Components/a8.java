package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class a8 implements Runnable {
    public final int f25178a = 0;
    public final b8 f25179b;
    public final ArrayList f25180c;
    public final String d;

    public a8(b8 b8Var, String str, ArrayList arrayList) {
        this.f25179b = b8Var;
        this.d = str;
        this.f25180c = arrayList;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.Document document;
        boolean z4;
        String str;
        int i11 = this.f25178a;
        String str2 = this.d;
        ArrayList arrayList = this.f25180c;
        b8 b8Var = this.f25179b;
        switch (i11) {
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
                                                    z4 = str4.toLowerCase().contains(str3);
                                                } else {
                                                    z4 = false;
                                                }
                                                if (!z4 && (str = documentAttribute.title) != null) {
                                                    z4 = str.toLowerCase().contains(str3);
                                                }
                                            } else {
                                                i15++;
                                            }
                                        } else {
                                            z4 = false;
                                        }
                                    }
                                    if (z4) {
                                        arrayList2.add(messageObject);
                                    }
                                }
                            }
                            i14++;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new a8(b8Var, arrayList2, str2));
                return;
            default:
                c8 c8Var = b8Var.f25536n;
                if (c8Var.h) {
                    c8Var.f25809f = true;
                    b8Var.d = arrayList;
                    b8Var.f25534e = str2;
                    b8Var.l();
                    c8Var.f25822r.n0(0);
                    org.telegram.ui.b.o(R.string.NoAudioFoundPlayerInfo, new Object[]{str2}, c8Var.f25833y);
                    return;
                }
                return;
        }
    }

    public a8(b8 b8Var, ArrayList arrayList, String str) {
        this.f25179b = b8Var;
        this.f25180c = arrayList;
        this.d = str;
    }
}
