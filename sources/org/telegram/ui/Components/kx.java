package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class kx extends hy {
    public final lt0 X;
    public final ey Y;

    public kx(ey eyVar) {
        super(100, true);
        this.Y = eyVar;
        this.X = new Object();
        this.O = new ai.g2(this, 11);
    }

    @Override
    public final int A() {
        ey eyVar = this.Y;
        u4.h0 adapter = eyVar.f33545i0.getAdapter();
        jx jxVar = eyVar.f33551k0;
        if (adapter == jxVar && jxVar.f35214y.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final lt0 D1(int i3) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        ey eyVar = this.Y;
        jx jxVar = eyVar.f33551k0;
        u4.h0 adapter = eyVar.f33545i0.getAdapter();
        jx jxVar2 = eyVar.f33561o0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == jxVar2) {
            int i10 = jxVar2.I;
            if (i3 > i10) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) jxVar2.f35214y.get((i3 - i10) - 1);
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
            } else if (i3 == i10) {
                return null;
            } else {
                document2 = (TLRPC.Document) eyVar.f33549j1.get(i3);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!jxVar.f35214y.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) jxVar.f35214y.get(i3);
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

    public final lt0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize w10;
        int i3;
        int i10;
        lt0 lt0Var = this.X;
        lt0Var.f35878b = 100.0f;
        lt0Var.f35877a = 100.0f;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i3 = w10.f27026w) != 0 && (i10 = w10.h) != 0) {
            lt0Var.f35877a = i3;
            lt0Var.f35878b = i10;
        }
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    lt0Var.f35877a = documentAttribute.f27008w;
                    lt0Var.f35878b = documentAttribute.h;
                    break;
                }
            }
        }
        return lt0Var;
    }
}
