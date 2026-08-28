package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class cy extends zy {
    public final qu0 X;
    public final wy Y;

    public cy(wy wyVar) {
        super(100, true);
        this.Y = wyVar;
        this.X = new Object();
        this.O = new fh.c6(this, 6);
    }

    @Override
    public final int A() {
        wy wyVar = this.Y;
        f2.r0 adapter = wyVar.f34394d0.getAdapter();
        ay ayVar = wyVar.f34402f0;
        if (adapter == ayVar && ayVar.f26924x.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final qu0 D1(int i9) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        wy wyVar = this.Y;
        ay ayVar = wyVar.f34402f0;
        f2.r0 adapter = wyVar.f34394d0.getAdapter();
        ay ayVar2 = wyVar.f34414j0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == ayVar2) {
            int i10 = ayVar2.D;
            if (i9 > i10) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) ayVar2.f26924x.get((i9 - i10) - 1);
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
            } else if (i9 == i10) {
                return null;
            } else {
                document2 = (TLRPC.Document) wyVar.f34399e1.get(i9);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!ayVar.f26924x.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) ayVar.f26924x.get(i9);
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

    public final qu0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i9;
        int i10;
        qu0 qu0Var = this.X;
        qu0Var.f32027b = 100.0f;
        qu0Var.f32026a = 100.0f;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i9 = closestPhotoSizeWithSize.f22405w) != 0 && (i10 = closestPhotoSizeWithSize.h) != 0) {
            qu0Var.f32026a = i9;
            qu0Var.f32027b = i10;
        }
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    qu0Var.f32026a = documentAttribute.f22387w;
                    qu0Var.f32027b = documentAttribute.h;
                    break;
                }
            }
        }
        return qu0Var;
    }
}
