package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class br0 extends yy {
    public final pu0 X;
    public final ar0 Y;
    public final zt0 Z;

    public br0(zt0 zt0Var, ar0 ar0Var) {
        super(100, false);
        this.Z = zt0Var;
        this.Y = ar0Var;
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
    public final pu0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.g0 adapter = this.Y.h.getAdapter();
        zt0 zt0Var = this.Z;
        ot0[] ot0VarArr = zt0Var.f33234v1;
        if (adapter == zt0Var.Q && !ot0VarArr[5].f29177a.isEmpty()) {
            document = ((org.telegram.messenger.jj) ot0VarArr[5].f29177a.get(i10)).F0();
        } else {
            document = null;
        }
        pu0 pu0Var = this.X;
        pu0Var.f29436b = 100.0f;
        pu0Var.f29435a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
            if (w9 != null && (i11 = w9.f19818w) != 0 && (i12 = w9.h) != 0) {
                pu0Var.f29435a = i11;
                pu0Var.f29436b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    pu0Var.f29435a = documentAttribute.f19800w;
                    pu0Var.f29436b = documentAttribute.h;
                    break;
                }
            }
        }
        return pu0Var;
    }

    @Override
    public final void U(hf.e eVar, s4.z0 z0Var, View view, s0.c cVar) {
        a9.r rVar;
        super.U(eVar, z0Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f47850a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            rVar = new a9.r(collectionItemInfo);
        } else {
            rVar = null;
        }
        if (rVar != null) {
            Object obj = rVar.f355a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(s4.z0 z0Var, int[] iArr) {
        super.z0(z0Var, iArr);
        ar0 ar0Var = this.Y;
        int i10 = ar0Var.E;
        if (i10 != 0 && !zt0.x0(i10)) {
            if (ar0Var.E == 1) {
                iArr[1] = Math.max(iArr[1], org.telegram.messenger.i0.L(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.t7.a(1) * 2);
    }
}
