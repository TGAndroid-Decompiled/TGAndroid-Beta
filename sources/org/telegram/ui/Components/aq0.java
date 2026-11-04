package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class aq0 extends hy {
    public final lt0 X;
    public final zp0 Y;
    public final ws0 Z;

    public aq0(ws0 ws0Var, zp0 zp0Var) {
        super(100, false);
        this.Z = ws0Var;
        this.Y = zp0Var;
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
    public final lt0 D1(int i3) {
        TLRPC.Document document;
        int i10;
        int i11;
        u4.h0 adapter = this.Y.h.getAdapter();
        ws0 ws0Var = this.Z;
        ls0[] ls0VarArr = ws0Var.f40136w1;
        if (adapter == ws0Var.R && !ls0VarArr[5].f35854a.isEmpty()) {
            document = ((org.telegram.messenger.zi) ls0VarArr[5].f35854a.get(i3)).F0();
        } else {
            document = null;
        }
        lt0 lt0Var = this.X;
        lt0Var.f35878b = 100.0f;
        lt0Var.f35877a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if (w10 != null && (i10 = w10.f27026w) != 0 && (i11 = w10.h) != 0) {
                lt0Var.f35877a = i10;
                lt0Var.f35878b = i11;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    lt0Var.f35877a = documentAttribute.f27008w;
                    lt0Var.f35878b = documentAttribute.h;
                    break;
                }
            }
        }
        return lt0Var;
    }

    @Override
    public final void U(tf.e eVar, u4.a1 a1Var, View view, s0.d dVar) {
        e.a aVar;
        super.U(eVar, a1Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f54570a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            aVar = new e.a(collectionItemInfo);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            Object obj = aVar.f9205a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(u4.a1 a1Var, int[] iArr) {
        super.z0(a1Var, iArr);
        zp0 zp0Var = this.Y;
        int i3 = zp0Var.F;
        if (i3 != 0 && !ws0.z0(i3)) {
            if (zp0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], org.telegram.messenger.g0.L(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.o7.a(1) * 2);
    }
}
