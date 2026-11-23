package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class yx extends wy {
    public final yt0 X;
    public final ty Y;

    public yx(ty tyVar) {
        super(100, true);
        this.Y = tyVar;
        this.X = new Object();
        this.O = new bi.w2(this, 11);
    }

    @Override
    public final int A() {
        ty tyVar = this.Y;
        v4.i0 adapter = tyVar.f40106i0.getAdapter();
        xx xxVar = tyVar.f40112k0;
        if (adapter == xxVar && xxVar.f42243y.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final yt0 D1(int i7) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        ty tyVar = this.Y;
        xx xxVar = tyVar.f40112k0;
        v4.i0 adapter = tyVar.f40106i0.getAdapter();
        xx xxVar2 = tyVar.f40122o0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == xxVar2) {
            int i10 = xxVar2.I;
            if (i7 > i10) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) xxVar2.f42243y.get((i7 - i10) - 1);
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
                document2 = (TLRPC.Document) tyVar.f40110j1.get(i7);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!xxVar.f42243y.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) xxVar.f42243y.get(i7);
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

    public final yt0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize w10;
        int i7;
        int i10;
        yt0 yt0Var = this.X;
        yt0Var.f42546b = 100.0f;
        yt0Var.f42545a = 100.0f;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i7 = w10.f28459w) != 0 && (i10 = w10.h) != 0) {
            yt0Var.f42545a = i7;
            yt0Var.f42546b = i10;
        }
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    yt0Var.f42545a = documentAttribute.f28441w;
                    yt0Var.f42546b = documentAttribute.h;
                    break;
                }
            }
        }
        return yt0Var;
    }
}
