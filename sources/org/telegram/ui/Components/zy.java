package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class zy extends wz {
    public final fw0 X;
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
        s4.g0 adapter = tzVar.f30742h0.getAdapter();
        yy yyVar = tzVar.f30748j0;
        if (adapter == yyVar && yyVar.f32769x.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final fw0 D1(int i10) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        tz tzVar = this.Y;
        yy yyVar = tzVar.f30748j0;
        s4.g0 adapter = tzVar.f30742h0.getAdapter();
        yy yyVar2 = tzVar.f30759n0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == yyVar2) {
            int i11 = yyVar2.H;
            if (i10 > i11) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) yyVar2.f32769x.get((i10 - i11) - 1);
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
                document2 = (TLRPC.Document) tzVar.f30746i1.get(i10);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!yyVar.f32769x.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) yyVar.f32769x.get(i10);
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

    public final fw0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i10;
        int i11;
        fw0 fw0Var = this.X;
        fw0Var.f26433b = 100.0f;
        fw0Var.f26432a = 100.0f;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i10 = closestPhotoSizeWithSize.f20305w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
            fw0Var.f26432a = i10;
            fw0Var.f26433b = i11;
        }
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    fw0Var.f26432a = documentAttribute.f20287w;
                    fw0Var.f26433b = documentAttribute.h;
                    break;
                }
            }
        }
        return fw0Var;
    }
}
