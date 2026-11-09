package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bq0 extends ky {
    public final ot0 X;
    public final aq0 Y;
    public final zs0 Z;

    public bq0(zs0 zs0Var, aq0 aq0Var) {
        super(100, false);
        this.Z = zs0Var;
        this.Y = aq0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.Q) {
            return 0;
        }
        return B();
    }

    @Override
    public final ot0 D1(int i7) {
        TLRPC.Document document;
        int i10;
        int i11;
        v4.g0 adapter = this.Y.h.getAdapter();
        zs0 zs0Var = this.Z;
        os0[] os0VarArr = zs0Var.f41121v1;
        if (adapter == zs0Var.Q && !os0VarArr[5].f36778a.isEmpty()) {
            document = ((org.telegram.messenger.ij) os0VarArr[5].f36778a.get(i7)).F0();
        } else {
            document = null;
        }
        ot0 ot0Var = this.X;
        ot0Var.f36802b = 100.0f;
        ot0Var.f36801a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if (w10 != null && (i10 = w10.f26981w) != 0 && (i11 = w10.h) != 0) {
                ot0Var.f36801a = i10;
                ot0Var.f36802b = i11;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    ot0Var.f36801a = documentAttribute.f26963w;
                    ot0Var.f36802b = documentAttribute.h;
                    break;
                }
            }
        }
        return ot0Var;
    }

    @Override
    public final void U(v4.v0 v0Var, v4.a1 a1Var, View view, s0.d dVar) {
        d9.o oVar;
        super.U(v0Var, a1Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f54613a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            oVar = new d9.o(collectionItemInfo);
        } else {
            oVar = null;
        }
        if (oVar != null) {
            Object obj = oVar.f8251a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(v4.a1 a1Var, int[] iArr) {
        super.z0(a1Var, iArr);
        aq0 aq0Var = this.Y;
        int i7 = aq0Var.E;
        if (i7 != 0 && !zs0.z0(i7)) {
            if (aq0Var.E == 1) {
                iArr[1] = Math.max(iArr[1], org.telegram.messenger.g0.L(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.p7.a(1) * 2);
    }
}
