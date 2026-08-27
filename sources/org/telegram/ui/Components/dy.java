package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

public final class dy extends bz {
    public final tu0 X;
    public final yy Y;

    public dy(yy yyVar) {
        super(100, true);
        this.Y = yyVar;
        this.X = new tu0();
        this.O = new gh.u5(this, 6);
    }

    @Override
    public final int A() {
        yy yyVar = this.Y;
        f2.q0 adapter = yyVar.f34987d0.getAdapter();
        cy cyVar = yyVar.f34995f0;
        if (adapter == cyVar && cyVar.f27569x.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final tu0 D1(int i10) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        yy yyVar = this.Y;
        cy cyVar = yyVar.f34995f0;
        f2.q0 adapter = yyVar.f34987d0.getAdapter();
        cy cyVar2 = yyVar.f35007j0;
        TLRPC.Document document2 = null;
        arrayList = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == cyVar2) {
            int i11 = cyVar2.D;
            if (i10 > i11) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) cyVar2.f27569x.get((i10 - i11) - 1);
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
            } else {
                if (i10 == i11) {
                    return null;
                }
                document2 = (TLRPC.Document) yyVar.f34992e1.get(i10);
                arrayList = document2.attributes;
            }
        } else if (cyVar.f27569x.isEmpty()) {
            arrayList = null;
        } else {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) cyVar.f27569x.get(i10);
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
        }
        return F1(document2, arrayList);
    }

    public final tu0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i10;
        int i11;
        tu0 tu0Var = this.X;
        tu0Var.f32894b = 100.0f;
        tu0Var.f32893a = 100.0f;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i10 = closestPhotoSizeWithSize.f22405w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
            tu0Var.f32893a = i10;
            tu0Var.f32894b = i11;
        }
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    tu0Var.f32893a = documentAttribute.f22387w;
                    tu0Var.f32894b = documentAttribute.h;
                    break;
                }
            }
        }
        return tu0Var;
    }
}
