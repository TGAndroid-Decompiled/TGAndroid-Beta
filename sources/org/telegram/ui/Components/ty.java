package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class ty extends qz {
    public final xv0 X;
    public final nz Y;

    public ty(nz nzVar) {
        super(100, true);
        this.Y = nzVar;
        this.X = new Object();
        this.O = new ci.x1(this, 4);
    }

    @Override
    public final int A() {
        nz nzVar = this.Y;
        s4.h0 adapter = nzVar.f26833h0.getAdapter();
        sy syVar = nzVar.f26839j0;
        if (adapter == syVar && syVar.f28368x.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final xv0 D1(int i10) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        nz nzVar = this.Y;
        sy syVar = nzVar.f26839j0;
        s4.h0 adapter = nzVar.f26833h0.getAdapter();
        sy syVar2 = nzVar.f26850n0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == syVar2) {
            int i11 = syVar2.H;
            if (i10 > i11) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) syVar2.f28368x.get((i10 - i11) - 1);
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
                document2 = (TLRPC.Document) nzVar.f26837i1.get(i10);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!syVar.f28368x.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) syVar.f28368x.get(i10);
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

    public final xv0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i10;
        int i11;
        xv0 xv0Var = this.X;
        xv0Var.f30522b = 100.0f;
        xv0Var.f30521a = 100.0f;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i10 = closestPhotoSizeWithSize.f18377w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
            xv0Var.f30521a = i10;
            xv0Var.f30522b = i11;
        }
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    xv0Var.f30521a = documentAttribute.f18359w;
                    xv0Var.f30522b = documentAttribute.h;
                    break;
                }
            }
        }
        return xv0Var;
    }
}
