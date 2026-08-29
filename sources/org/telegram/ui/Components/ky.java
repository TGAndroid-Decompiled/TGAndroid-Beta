package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class ky extends iz {
    public final bv0 X;
    public final fz Y;

    public ky(fz fzVar) {
        super(100, true);
        this.Y = fzVar;
        this.X = new Object();
        this.O = new ih.n5(this, 6);
    }

    @Override
    public final int A() {
        fz fzVar = this.Y;
        f2.p0 adapter = fzVar.f28585d0.getAdapter();
        jy jyVar = fzVar.f28593f0;
        if (adapter == jyVar && jyVar.f29852x.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final bv0 D1(int i10) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        fz fzVar = this.Y;
        jy jyVar = fzVar.f28593f0;
        f2.p0 adapter = fzVar.f28585d0.getAdapter();
        jy jyVar2 = fzVar.f28605j0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == jyVar2) {
            int i11 = jyVar2.D;
            if (i10 > i11) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) jyVar2.f29852x.get((i10 - i11) - 1);
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
                document2 = (TLRPC.Document) fzVar.f28590e1.get(i10);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!jyVar.f29852x.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) jyVar.f29852x.get(i10);
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

    public final bv0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i10;
        int i11;
        bv0 bv0Var = this.X;
        bv0Var.f27239b = 100.0f;
        bv0Var.f27238a = 100.0f;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i10 = closestPhotoSizeWithSize.f22417w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
            bv0Var.f27238a = i10;
            bv0Var.f27239b = i11;
        }
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    bv0Var.f27238a = documentAttribute.f22399w;
                    bv0Var.f27239b = documentAttribute.h;
                    break;
                }
            }
        }
        return bv0Var;
    }
}
