package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class bz extends zz {
    public final iw0 X;
    public final wz Y;

    public bz(wz wzVar) {
        super(100, true);
        this.Y = wzVar;
        this.X = new Object();
        this.O = new di.w1(this, 4);
    }

    @Override
    public final int A() {
        wz wzVar = this.Y;
        s4.g0 adapter = wzVar.f31029h0.getAdapter();
        az azVar = wzVar.f31035j0;
        if (adapter == azVar && azVar.f23645x.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final iw0 D1(int i10) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        wz wzVar = this.Y;
        az azVar = wzVar.f31035j0;
        s4.g0 adapter = wzVar.f31029h0.getAdapter();
        az azVar2 = wzVar.f31046n0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == azVar2) {
            int i11 = azVar2.H;
            if (i10 > i11) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) azVar2.f23645x.get((i10 - i11) - 1);
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
                document2 = (TLRPC.Document) wzVar.f31033i1.get(i10);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!azVar.f23645x.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) azVar.f23645x.get(i10);
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

    public final iw0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i10;
        int i11;
        iw0 iw0Var = this.X;
        iw0Var.f26117b = 100.0f;
        iw0Var.f26116a = 100.0f;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i10 = closestPhotoSizeWithSize.f19241w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
            iw0Var.f26116a = i10;
            iw0Var.f26117b = i11;
        }
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    iw0Var.f26116a = documentAttribute.f19223w;
                    iw0Var.f26117b = documentAttribute.h;
                    break;
                }
            }
        }
        return iw0Var;
    }
}
