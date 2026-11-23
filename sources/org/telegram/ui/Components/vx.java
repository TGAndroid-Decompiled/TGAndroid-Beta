package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class vx extends ty {
    public final xt0 X;
    public final qy Y;

    public vx(qy qyVar) {
        super(100, true);
        this.Y = qyVar;
        this.X = new Object();
        this.O = new bi.y2(this, 11);
    }

    @Override
    public final int A() {
        qy qyVar = this.Y;
        v4.i0 adapter = qyVar.f39062i0.getAdapter();
        ux uxVar = qyVar.f39068k0;
        if (adapter == uxVar && uxVar.f40499y.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final xt0 D1(int i7) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        qy qyVar = this.Y;
        ux uxVar = qyVar.f39068k0;
        v4.i0 adapter = qyVar.f39062i0.getAdapter();
        ux uxVar2 = qyVar.f39078o0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == uxVar2) {
            int i10 = uxVar2.I;
            if (i7 > i10) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) uxVar2.f40499y.get((i7 - i10) - 1);
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
                document2 = (TLRPC.Document) qyVar.f39066j1.get(i7);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!uxVar.f40499y.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) uxVar.f40499y.get(i7);
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

    public final xt0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize w10;
        int i7;
        int i10;
        xt0 xt0Var = this.X;
        xt0Var.f42190b = 100.0f;
        xt0Var.f42189a = 100.0f;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i7 = w10.f28517w) != 0 && (i10 = w10.h) != 0) {
            xt0Var.f42189a = i7;
            xt0Var.f42190b = i10;
        }
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    xt0Var.f42189a = documentAttribute.f28499w;
                    xt0Var.f42190b = documentAttribute.h;
                    break;
                }
            }
        }
        return xt0Var;
    }
}
