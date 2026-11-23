package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kq0 extends ty {
    public final xt0 X;
    public final jq0 Y;
    public final it0 Z;

    public kq0(it0 it0Var, jq0 jq0Var) {
        super(100, false);
        this.Z = it0Var;
        this.Y = jq0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.R) {
            return 0;
        }
        return B();
    }

    @Override
    public final xt0 D1(int i7) {
        TLRPC.Document document;
        int i10;
        int i11;
        v4.i0 adapter = this.Y.h.getAdapter();
        it0 it0Var = this.Z;
        xs0[] xs0VarArr = it0Var.f36160w1;
        if (adapter == it0Var.R && !xs0VarArr[5].f42165a.isEmpty()) {
            document = ((org.telegram.messenger.fj) xs0VarArr[5].f42165a.get(i7)).F0();
        } else {
            document = null;
        }
        xt0 xt0Var = this.X;
        xt0Var.f42190b = 100.0f;
        xt0Var.f42189a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if (w10 != null && (i10 = w10.f28517w) != 0 && (i11 = w10.h) != 0) {
                xt0Var.f42189a = i10;
                xt0Var.f42190b = i11;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    xt0Var.f42189a = documentAttribute.f28499w;
                    xt0Var.f42190b = documentAttribute.h;
                    break;
                }
            }
        }
        return xt0Var;
    }

    @Override
    public final void U(v4.x0 x0Var, v4.c1 c1Var, View view, s0.c cVar) {
        d9.o oVar;
        super.U(x0Var, c1Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f56863a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            oVar = new d9.o(collectionItemInfo);
        } else {
            oVar = null;
        }
        if (oVar != null) {
            Object obj = oVar.f7916a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(v4.c1 c1Var, int[] iArr) {
        super.z0(c1Var, iArr);
        jq0 jq0Var = this.Y;
        int i7 = jq0Var.F;
        if (i7 != 0 && !it0.z0(i7)) {
            if (jq0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], org.telegram.messenger.g0.L(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.p7.a(1) * 2);
    }
}
