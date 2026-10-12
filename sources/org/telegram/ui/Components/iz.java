package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class iz extends g00 {
    public final sw0 X;
    public final d00 Y;

    public iz(d00 d00Var) {
        super(100, true);
        this.Y = d00Var;
        this.X = new Object();
        this.O = new ci.w1(this, 4);
    }

    @Override
    public final int A() {
        d00 d00Var = this.Y;
        s4.i0 adapter = d00Var.f25096h0.getAdapter();
        hz hzVar = d00Var.f25102j0;
        if (adapter == hzVar && hzVar.f26995x.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final sw0 D1(int i10) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        d00 d00Var = this.Y;
        hz hzVar = d00Var.f25102j0;
        s4.i0 adapter = d00Var.f25096h0.getAdapter();
        hz hzVar2 = d00Var.f25113n0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == hzVar2) {
            int i11 = hzVar2.H;
            if (i10 > i11) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) hzVar2.f26995x.get((i10 - i11) - 1);
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
                document2 = (TLRPC.Document) d00Var.f25100i1.get(i10);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!hzVar.f26995x.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) hzVar.f26995x.get(i10);
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

    public final sw0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i10;
        int i11;
        sw0 sw0Var = this.X;
        sw0Var.f30697b = 100.0f;
        sw0Var.f30696a = 100.0f;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i10 = closestPhotoSizeWithSize.f19827w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
            sw0Var.f30696a = i10;
            sw0Var.f30697b = i11;
        }
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    sw0Var.f30696a = documentAttribute.f19809w;
                    sw0Var.f30697b = documentAttribute.h;
                    break;
                }
            }
        }
        return sw0Var;
    }
}
