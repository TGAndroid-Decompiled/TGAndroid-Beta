package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class gz extends e00 {
    public final ow0 X;
    public final b00 Y;

    public gz(b00 b00Var) {
        super(100, true);
        this.Y = b00Var;
        this.X = new Object();
        this.O = new ci.w1(this, 4);
    }

    @Override
    public final int A() {
        b00 b00Var = this.Y;
        s4.i0 adapter = b00Var.f24678h0.getAdapter();
        fz fzVar = b00Var.f24684j0;
        if (adapter == fzVar && fzVar.f26527x.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final ow0 D1(int i10) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        b00 b00Var = this.Y;
        fz fzVar = b00Var.f24684j0;
        s4.i0 adapter = b00Var.f24678h0.getAdapter();
        fz fzVar2 = b00Var.f24695n0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == fzVar2) {
            int i11 = fzVar2.H;
            if (i10 > i11) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) fzVar2.f26527x.get((i10 - i11) - 1);
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
                document2 = (TLRPC.Document) b00Var.f24682i1.get(i10);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!fzVar.f26527x.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) fzVar.f26527x.get(i10);
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

    public final ow0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i10;
        int i11;
        ow0 ow0Var = this.X;
        ow0Var.f29542b = 100.0f;
        ow0Var.f29541a = 100.0f;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i10 = closestPhotoSizeWithSize.f20057w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
            ow0Var.f29541a = i10;
            ow0Var.f29542b = i11;
        }
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    ow0Var.f29541a = documentAttribute.f20039w;
                    ow0Var.f29542b = documentAttribute.h;
                    break;
                }
            }
        }
        return ow0Var;
    }
}
