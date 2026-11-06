package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class mx extends jy {
    public final mt0 X;
    public final gy Y;

    public mx(gy gyVar) {
        super(100, true);
        this.Y = gyVar;
        this.X = new Object();
        this.O = new ai.l(this, 8);
    }

    @Override
    public final int A() {
        gy gyVar = this.Y;
        v4.g0 adapter = gyVar.f34039h0.getAdapter();
        lx lxVar = gyVar.f34045j0;
        if (adapter == lxVar && lxVar.f35768y.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override
    public final mt0 D1(int i7) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        gy gyVar = this.Y;
        lx lxVar = gyVar.f34045j0;
        v4.g0 adapter = gyVar.f34039h0.getAdapter();
        lx lxVar2 = gyVar.f34056n0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == lxVar2) {
            int i10 = lxVar2.H;
            if (i7 > i10) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) lxVar2.f35768y.get((i7 - i10) - 1);
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
                document2 = (TLRPC.Document) gyVar.f34043i1.get(i7);
                arrayList = document2.attributes;
                return F1(document2, arrayList);
            }
        } else if (!lxVar.f35768y.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) lxVar.f35768y.get(i7);
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

    public final mt0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize w10;
        int i7;
        int i10;
        mt0 mt0Var = this.X;
        mt0Var.f36071b = 100.0f;
        mt0Var.f36070a = 100.0f;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i7 = w10.f26977w) != 0 && (i10 = w10.h) != 0) {
            mt0Var.f36070a = i7;
            mt0Var.f36071b = i10;
        }
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    mt0Var.f36070a = documentAttribute.f26959w;
                    mt0Var.f36071b = documentAttribute.h;
                    break;
                }
            }
        }
        return mt0Var;
    }
}
