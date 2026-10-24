package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class xy extends uz {
    public final hw0 X;
    public final rz Y;

    public xy(rz rzVar) {
        super(100, true);
        this.Y = rzVar;
        this.X = new Object();
        this.O = new ai.q1(this, 5);
    }

    @Override
    public final int A() {
        rz rzVar = this.Y;
        s4.g0 adapter = rzVar.f30325h0.getAdapter();
        wy wyVar = rzVar.f30331j0;
        if (adapter == wyVar && wyVar.f32439x.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final hw0 D1(int i10) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        rz rzVar = this.Y;
        wy wyVar = rzVar.f30331j0;
        s4.g0 adapter = rzVar.f30325h0.getAdapter();
        wy wyVar2 = rzVar.f30342n0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == wyVar2) {
            int i11 = wyVar2.H;
            if (i10 > i11) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) wyVar2.f32439x.get((i10 - i11) - 1);
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
                document2 = (TLRPC.Document) rzVar.f30329i1.get(i10);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!wyVar.f32439x.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) wyVar.f32439x.get(i10);
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

    public final hw0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i10;
        int i11;
        hw0 hw0Var = this.X;
        hw0Var.f27189b = 100.0f;
        hw0Var.f27188a = 100.0f;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i10 = closestPhotoSizeWithSize.f20369w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
            hw0Var.f27188a = i10;
            hw0Var.f27189b = i11;
        }
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    hw0Var.f27188a = documentAttribute.f20351w;
                    hw0Var.f27189b = documentAttribute.h;
                    break;
                }
            }
        }
        return hw0Var;
    }
}
