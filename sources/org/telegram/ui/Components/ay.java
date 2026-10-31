package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class ay extends yy {
    public final pu0 X;
    public final vy Y;

    public ay(vy vyVar) {
        super(100, true);
        this.Y = vyVar;
        this.X = new Object();
        this.O = new jg.h1(this, 4);
    }

    @Override
    public final int A() {
        vy vyVar = this.Y;
        s4.g0 adapter = vyVar.f31880h0.getAdapter();
        zx zxVar = vyVar.f31886j0;
        if (adapter == zxVar && zxVar.f33258y.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final pu0 D1(int i10) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        vy vyVar = this.Y;
        zx zxVar = vyVar.f31886j0;
        s4.g0 adapter = vyVar.f31880h0.getAdapter();
        zx zxVar2 = vyVar.f31897n0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == zxVar2) {
            int i11 = zxVar2.H;
            if (i10 > i11) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) zxVar2.f33258y.get((i10 - i11) - 1);
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
            } else if (i10 == i11) {
                return null;
            } else {
                document2 = (TLRPC.Document) vyVar.f31884i1.get(i10);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!zxVar.f33258y.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) zxVar.f33258y.get(i10);
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

    public final pu0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize w9;
        int i10;
        int i11;
        pu0 pu0Var = this.X;
        pu0Var.f29436b = 100.0f;
        pu0Var.f29435a = 100.0f;
        if (document != null && (w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false)) != null && (i10 = w9.f19818w) != 0 && (i11 = w9.h) != 0) {
            pu0Var.f29435a = i10;
            pu0Var.f29436b = i11;
        }
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    pu0Var.f29435a = documentAttribute.f19800w;
                    pu0Var.f29436b = documentAttribute.h;
                    break;
                }
            }
        }
        return pu0Var;
    }
}
