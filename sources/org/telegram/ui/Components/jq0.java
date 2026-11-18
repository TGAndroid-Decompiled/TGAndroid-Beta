package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jq0 extends uy {
    public final vt0 X;
    public final iq0 Y;
    public final gt0 Z;

    public jq0(gt0 gt0Var, iq0 iq0Var) {
        super(100, false);
        this.Z = gt0Var;
        this.Y = iq0Var;
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
    public final vt0 D1(int i7) {
        TLRPC.Document document;
        int i10;
        int i11;
        v4.i0 adapter = this.Y.h.getAdapter();
        gt0 gt0Var = this.Z;
        vs0[] vs0VarArr = gt0Var.f35636w1;
        if (adapter == gt0Var.R && !vs0VarArr[5].f41412a.isEmpty()) {
            document = ((org.telegram.messenger.fj) vs0VarArr[5].f41412a.get(i7)).F0();
        } else {
            document = null;
        }
        vt0 vt0Var = this.X;
        vt0Var.f41434b = 100.0f;
        vt0Var.f41433a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if (w10 != null && (i10 = w10.f28430w) != 0 && (i11 = w10.h) != 0) {
                vt0Var.f41433a = i10;
                vt0Var.f41434b = i11;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    vt0Var.f41433a = documentAttribute.f28412w;
                    vt0Var.f41434b = documentAttribute.h;
                    break;
                }
            }
        }
        return vt0Var;
    }

    @Override
    public final void U(v4.x0 x0Var, v4.c1 c1Var, View view, s0.c cVar) {
        of ofVar;
        super.U(x0Var, c1Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f56740a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            ofVar = new of(collectionItemInfo, 15);
        } else {
            ofVar = null;
        }
        if (ofVar != null) {
            Object obj = ofVar.f38076b;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(v4.c1 c1Var, int[] iArr) {
        super.z0(c1Var, iArr);
        iq0 iq0Var = this.Y;
        int i7 = iq0Var.F;
        if (i7 != 0 && !gt0.z0(i7)) {
            if (iq0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], org.telegram.messenger.g0.L(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.p7.a(1) * 2);
    }
}
