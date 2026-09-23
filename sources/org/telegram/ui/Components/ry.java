package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class ry extends oz {
    public final jv0 X;
    public final lz Y;

    public ry(lz lzVar) {
        super(100, true);
        this.Y = lzVar;
        this.X = new Object();
        this.O = new ci.x1(this, 4);
    }

    @Override
    public final int A() {
        lz lzVar = this.Y;
        s4.h0 adapter = lzVar.f25983h0.getAdapter();
        qy qyVar = lzVar.f25989j0;
        if (adapter == qyVar && qyVar.f27486x.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final jv0 D1(int i10) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        lz lzVar = this.Y;
        qy qyVar = lzVar.f25989j0;
        s4.h0 adapter = lzVar.f25983h0.getAdapter();
        qy qyVar2 = lzVar.f26000n0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == qyVar2) {
            int i11 = qyVar2.H;
            if (i10 > i11) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) qyVar2.f27486x.get((i10 - i11) - 1);
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
                document2 = (TLRPC.Document) lzVar.f25987i1.get(i10);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!qyVar.f27486x.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) qyVar.f27486x.get(i10);
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

    public final jv0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i10;
        int i11;
        jv0 jv0Var = this.X;
        jv0Var.f25429b = 100.0f;
        jv0Var.f25428a = 100.0f;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i10 = closestPhotoSizeWithSize.f18108w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
            jv0Var.f25428a = i10;
            jv0Var.f25429b = i11;
        }
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    jv0Var.f25428a = documentAttribute.f18090w;
                    jv0Var.f25429b = documentAttribute.h;
                    break;
                }
            }
        }
        return jv0Var;
    }
}
