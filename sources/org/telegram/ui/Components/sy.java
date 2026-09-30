package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class sy extends pz {
    public final wv0 X;
    public final mz Y;

    public sy(mz mzVar) {
        super(100, true);
        this.Y = mzVar;
        this.X = new Object();
        this.O = new ci.x1(this, 4);
    }

    @Override
    public final int A() {
        mz mzVar = this.Y;
        s4.h0 adapter = mzVar.f26546h0.getAdapter();
        ry ryVar = mzVar.f26552j0;
        if (adapter == ryVar && ryVar.f28071x.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final wv0 D1(int i10) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        mz mzVar = this.Y;
        ry ryVar = mzVar.f26552j0;
        s4.h0 adapter = mzVar.f26546h0.getAdapter();
        ry ryVar2 = mzVar.f26563n0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == ryVar2) {
            int i11 = ryVar2.H;
            if (i10 > i11) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) ryVar2.f28071x.get((i10 - i11) - 1);
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
                document2 = (TLRPC.Document) mzVar.f26550i1.get(i10);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!ryVar.f28071x.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) ryVar.f28071x.get(i10);
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

    public final wv0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i10;
        int i11;
        wv0 wv0Var = this.X;
        wv0Var.f30183b = 100.0f;
        wv0Var.f30182a = 100.0f;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i10 = closestPhotoSizeWithSize.f18362w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
            wv0Var.f30182a = i10;
            wv0Var.f30183b = i11;
        }
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    wv0Var.f30182a = documentAttribute.f18344w;
                    wv0Var.f30183b = documentAttribute.h;
                    break;
                }
            }
        }
        return wv0Var;
    }
}
