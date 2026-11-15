package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class rx extends oy {
    public final nt0 X;
    public final ly Y;

    public rx(ly lyVar) {
        super(100, true);
        this.Y = lyVar;
        this.X = new Object();
        this.O = new bi.y1(this, 11);
    }

    @Override
    public final int A() {
        ly lyVar = this.Y;
        v4.h0 adapter = lyVar.f36956i0.getAdapter();
        qx qxVar = lyVar.f36962k0;
        if (adapter == qxVar && qxVar.f38790y.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final nt0 D1(int i7) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        ly lyVar = this.Y;
        qx qxVar = lyVar.f36962k0;
        v4.h0 adapter = lyVar.f36956i0.getAdapter();
        qx qxVar2 = lyVar.f36972o0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == qxVar2) {
            int i10 = qxVar2.I;
            if (i7 > i10) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) qxVar2.f38790y.get((i7 - i10) - 1);
                document = botInlineResult.document;
                if (document != null) {
                    arrayList2 = document.attributes;
                } else {
                    TLRPC.WebDocument webDocument = botInlineResult.content;
                    if (webDocument != null) {
                        arrayList2 = webDocument.attributes;
                    } else {
                        TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                        if (webDocument2 != null) {
                            arrayList2 = webDocument2.attributes;
                        }
                    }
                }
                arrayList = arrayList2;
                document2 = document;
                return F1(document2, arrayList);
            } else if (i7 == i10) {
                return null;
            } else {
                document2 = (TLRPC.Document) lyVar.f36960j1.get(i7);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!qxVar.f38790y.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) qxVar.f38790y.get(i7);
            document = botInlineResult2.document;
            if (document != null) {
                arrayList2 = document.attributes;
            } else {
                TLRPC.WebDocument webDocument3 = botInlineResult2.content;
                if (webDocument3 != null) {
                    arrayList2 = webDocument3.attributes;
                } else {
                    TLRPC.WebDocument webDocument4 = botInlineResult2.thumb;
                    if (webDocument4 != null) {
                        arrayList2 = webDocument4.attributes;
                    }
                }
            }
            arrayList = arrayList2;
            document2 = document;
            return F1(document2, arrayList);
        } else {
            arrayList = null;
            return F1(document2, arrayList);
        }
    }

    public final nt0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize w10;
        int i7;
        int i10;
        nt0 nt0Var = this.X;
        nt0Var.f37714b = 100.0f;
        nt0Var.f37713a = 100.0f;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i7 = w10.f28076w) != 0 && (i10 = w10.h) != 0) {
            nt0Var.f37713a = i7;
            nt0Var.f37714b = i10;
        }
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    nt0Var.f37713a = documentAttribute.f28058w;
                    nt0Var.f37714b = documentAttribute.h;
                    break;
                }
            }
        }
        return nt0Var;
    }
}
