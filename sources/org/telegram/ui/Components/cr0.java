package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cr0 extends yy {
    public final qu0 X;
    public final br0 Y;
    public final au0 Z;

    public cr0(au0 au0Var, br0 br0Var) {
        super(100, false);
        this.Z = au0Var;
        this.Y = br0Var;
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
    public final qu0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.g0 adapter = this.Y.h.getAdapter();
        au0 au0Var = this.Z;
        pt0[] pt0VarArr = au0Var.f24562v1;
        if (adapter == au0Var.Q && !pt0VarArr[5].f29532a.isEmpty()) {
            document = ((org.telegram.messenger.kj) pt0VarArr[5].f29532a.get(i10)).F0();
        } else {
            document = null;
        }
        qu0 qu0Var = this.X;
        qu0Var.f29809b = 100.0f;
        qu0Var.f29808a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
            if (w9 != null && (i11 = w9.f19819w) != 0 && (i12 = w9.h) != 0) {
                qu0Var.f29808a = i11;
                qu0Var.f29809b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    qu0Var.f29808a = documentAttribute.f19801w;
                    qu0Var.f29809b = documentAttribute.h;
                    break;
                }
            }
        }
        return qu0Var;
    }

    @Override
    public final void U(hf.e eVar, s4.z0 z0Var, View view, s0.c cVar) {
        a9.r rVar;
        super.U(eVar, z0Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f47861a;
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
        br0 br0Var = this.Y;
        int i10 = br0Var.E;
        if (i10 != 0 && !au0.y0(i10)) {
            if (br0Var.E == 1) {
                iArr[1] = Math.max(iArr[1], org.telegram.messenger.i0.L(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.t7.a(1) * 2);
    }
}
