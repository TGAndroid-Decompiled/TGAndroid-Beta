package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class zy extends wz {
    public final ew0 X;
    public final tz Y;

    public zy(tz tzVar) {
        super(100, true);
        this.Y = tzVar;
        this.X = new Object();
        this.O = new ai.q1(this, 5);
    }

    @Override
    public final int A() {
        tz tzVar = this.Y;
        s4.g0 adapter = tzVar.f30785h0.getAdapter();
        yy yyVar = tzVar.f30791j0;
        if (adapter == yyVar && yyVar.f32775x.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final ew0 D1(int i10) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        tz tzVar = this.Y;
        yy yyVar = tzVar.f30791j0;
        s4.g0 adapter = tzVar.f30785h0.getAdapter();
        yy yyVar2 = tzVar.f30802n0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == yyVar2) {
            int i11 = yyVar2.H;
            if (i10 > i11) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) yyVar2.f32775x.get((i10 - i11) - 1);
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
                document2 = (TLRPC.Document) tzVar.f30789i1.get(i10);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!yyVar.f32775x.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) yyVar.f32775x.get(i10);
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

    public final ew0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i10;
        int i11;
        ew0 ew0Var = this.X;
        ew0Var.f26041b = 100.0f;
        ew0Var.f26040a = 100.0f;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i10 = closestPhotoSizeWithSize.f20300w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
            ew0Var.f26040a = i10;
            ew0Var.f26041b = i11;
        }
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    ew0Var.f26040a = documentAttribute.f20282w;
                    ew0Var.f26041b = documentAttribute.h;
                    break;
                }
            }
        }
        return ew0Var;
    }
}
