package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class nx extends ky {
    public final ot0 X;
    public final hy Y;

    public nx(hy hyVar) {
        super(100, true);
        this.Y = hyVar;
        this.X = new Object();
        this.O = new ai.l(this, 8);
    }

    @Override
    public final int A() {
        hy hyVar = this.Y;
        v4.g0 adapter = hyVar.f34430h0.getAdapter();
        mx mxVar = hyVar.f34436j0;
        if (adapter == mxVar && mxVar.f36167y.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final ot0 D1(int i7) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        hy hyVar = this.Y;
        mx mxVar = hyVar.f34436j0;
        v4.g0 adapter = hyVar.f34430h0.getAdapter();
        mx mxVar2 = hyVar.f34447n0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == mxVar2) {
            int i10 = mxVar2.H;
            if (i7 > i10) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) mxVar2.f36167y.get((i7 - i10) - 1);
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
                document2 = (TLRPC.Document) hyVar.f34434i1.get(i7);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!mxVar.f36167y.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) mxVar.f36167y.get(i7);
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

    public final ot0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize w10;
        int i7;
        int i10;
        ot0 ot0Var = this.X;
        ot0Var.f36802b = 100.0f;
        ot0Var.f36801a = 100.0f;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i7 = w10.f26981w) != 0 && (i10 = w10.h) != 0) {
            ot0Var.f36801a = i7;
            ot0Var.f36802b = i10;
        }
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    ot0Var.f36801a = documentAttribute.f26963w;
                    ot0Var.f36802b = documentAttribute.h;
                    break;
                }
            }
        }
        return ot0Var;
    }
}
