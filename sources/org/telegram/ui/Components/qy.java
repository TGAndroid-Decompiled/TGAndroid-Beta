package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class qy extends nz {
    public final iv0 X;
    public final kz Y;

    public qy(kz kzVar) {
        super(100, true);
        this.Y = kzVar;
        this.X = new Object();
        this.O = new di.x1(this, 4);
    }

    @Override
    public final int A() {
        kz kzVar = this.Y;
        s4.h0 adapter = kzVar.f27948h0.getAdapter();
        py pyVar = kzVar.f27954j0;
        if (adapter == pyVar && pyVar.f29518x.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final iv0 D1(int i10) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        kz kzVar = this.Y;
        py pyVar = kzVar.f27954j0;
        s4.h0 adapter = kzVar.f27948h0.getAdapter();
        py pyVar2 = kzVar.f27965n0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == pyVar2) {
            int i11 = pyVar2.H;
            if (i10 > i11) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) pyVar2.f29518x.get((i10 - i11) - 1);
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
                document2 = (TLRPC.Document) kzVar.f27952i1.get(i10);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!pyVar.f29518x.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) pyVar.f29518x.get(i10);
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

    public final iv0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i10;
        int i11;
        iv0 iv0Var = this.X;
        iv0Var.f27272b = 100.0f;
        iv0Var.f27271a = 100.0f;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i10 = closestPhotoSizeWithSize.f19894w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
            iv0Var.f27271a = i10;
            iv0Var.f27272b = i11;
        }
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    iv0Var.f27271a = documentAttribute.f19876w;
                    iv0Var.f27272b = documentAttribute.h;
                    break;
                }
            }
        }
        return iv0Var;
    }
}
