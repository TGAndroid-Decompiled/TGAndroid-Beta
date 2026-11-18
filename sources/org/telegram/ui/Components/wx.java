package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class wx extends uy {
    public final vt0 X;
    public final ry Y;

    public wx(ry ryVar) {
        super(100, true);
        this.Y = ryVar;
        this.X = new Object();
        this.O = new bi.s2(this, 11);
    }

    @Override
    public final int A() {
        ry ryVar = this.Y;
        v4.i0 adapter = ryVar.f39360i0.getAdapter();
        vx vxVar = ryVar.f39366k0;
        if (adapter == vxVar && vxVar.f41479y.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final vt0 D1(int i7) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        ry ryVar = this.Y;
        vx vxVar = ryVar.f39366k0;
        v4.i0 adapter = ryVar.f39360i0.getAdapter();
        vx vxVar2 = ryVar.f39376o0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == vxVar2) {
            int i10 = vxVar2.I;
            if (i7 > i10) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) vxVar2.f41479y.get((i7 - i10) - 1);
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
            } else if (i7 == i10) {
                return null;
            } else {
                document2 = (TLRPC.Document) ryVar.f39364j1.get(i7);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!vxVar.f41479y.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) vxVar.f41479y.get(i7);
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

    public final vt0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize w10;
        int i7;
        int i10;
        vt0 vt0Var = this.X;
        vt0Var.f41434b = 100.0f;
        vt0Var.f41433a = 100.0f;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i7 = w10.f28428w) != 0 && (i10 = w10.h) != 0) {
            vt0Var.f41433a = i7;
            vt0Var.f41434b = i10;
        }
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    vt0Var.f41433a = documentAttribute.f28410w;
                    vt0Var.f41434b = documentAttribute.h;
                    break;
                }
            }
        }
        return vt0Var;
    }
}
