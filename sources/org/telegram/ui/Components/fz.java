package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class fz extends d00 {
    public final mw0 X;
    public final a00 Y;

    public fz(a00 a00Var) {
        super(100, true);
        this.Y = a00Var;
        this.X = new Object();
        this.O = new ci.w1(this, 4);
    }

    @Override
    public final int A() {
        a00 a00Var = this.Y;
        s4.i0 adapter = a00Var.f24417h0.getAdapter();
        ez ezVar = a00Var.f24423j0;
        if (adapter == ezVar && ezVar.f26187x.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final mw0 D1(int i10) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        a00 a00Var = this.Y;
        ez ezVar = a00Var.f24423j0;
        s4.i0 adapter = a00Var.f24417h0.getAdapter();
        ez ezVar2 = a00Var.f24434n0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == ezVar2) {
            int i11 = ezVar2.H;
            if (i10 > i11) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) ezVar2.f26187x.get((i10 - i11) - 1);
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
                document2 = (TLRPC.Document) a00Var.f24421i1.get(i10);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!ezVar.f26187x.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) ezVar.f26187x.get(i10);
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

    public final mw0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i10;
        int i11;
        mw0 mw0Var = this.X;
        mw0Var.f28964b = 100.0f;
        mw0Var.f28963a = 100.0f;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i10 = closestPhotoSizeWithSize.f20063w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
            mw0Var.f28963a = i10;
            mw0Var.f28964b = i11;
        }
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    mw0Var.f28963a = documentAttribute.f20045w;
                    mw0Var.f28964b = documentAttribute.h;
                    break;
                }
            }
        }
        return mw0Var;
    }
}
