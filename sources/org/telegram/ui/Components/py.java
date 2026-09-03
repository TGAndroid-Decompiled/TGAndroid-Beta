package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class py extends nz {
    public final jv0 X;
    public final kz Y;

    public py(kz kzVar) {
        super(100, true);
        this.Y = kzVar;
        this.X = new Object();
        this.O = new kh.m5(this, 4);
    }

    @Override
    public final int A() {
        kz kzVar = this.Y;
        f2.o0 adapter = kzVar.f26435e0.getAdapter();
        oy oyVar = kzVar.f26442g0;
        if (adapter == oyVar && oyVar.f27688x.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final jv0 D1(int i10) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        kz kzVar = this.Y;
        oy oyVar = kzVar.f26442g0;
        f2.o0 adapter = kzVar.f26435e0.getAdapter();
        oy oyVar2 = kzVar.f26454k0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == oyVar2) {
            int i11 = oyVar2.E;
            if (i10 > i11) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) oyVar2.f27688x.get((i10 - i11) - 1);
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
                document2 = (TLRPC.Document) kzVar.f26440f1.get(i10);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!oyVar.f27688x.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) oyVar.f27688x.get(i10);
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
        jv0Var.f26063b = 100.0f;
        jv0Var.f26062a = 100.0f;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i10 = closestPhotoSizeWithSize.f19184w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
            jv0Var.f26062a = i10;
            jv0Var.f26063b = i11;
        }
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    jv0Var.f26062a = documentAttribute.f19166w;
                    jv0Var.f26063b = documentAttribute.h;
                    break;
                }
            }
        }
        return jv0Var;
    }
}
