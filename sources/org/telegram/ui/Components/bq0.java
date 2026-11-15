package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bq0 extends oy {
    public final nt0 X;
    public final aq0 Y;
    public final ys0 Z;

    public bq0(ys0 ys0Var, aq0 aq0Var) {
        super(100, false);
        this.Z = ys0Var;
        this.Y = aq0Var;
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
    public final nt0 D1(int i7) {
        TLRPC.Document document;
        int i10;
        int i11;
        v4.h0 adapter = this.Y.h.getAdapter();
        ys0 ys0Var = this.Z;
        ns0[] ns0VarArr = ys0Var.f42146w1;
        if (adapter == ys0Var.R && !ns0VarArr[5].f37681a.isEmpty()) {
            document = ((org.telegram.messenger.gj) ns0VarArr[5].f37681a.get(i7)).F0();
        } else {
            document = null;
        }
        nt0 nt0Var = this.X;
        nt0Var.f37703b = 100.0f;
        nt0Var.f37702a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if (w10 != null && (i10 = w10.f28076w) != 0 && (i11 = w10.h) != 0) {
                nt0Var.f37702a = i10;
                nt0Var.f37703b = i11;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    nt0Var.f37702a = documentAttribute.f28058w;
                    nt0Var.f37703b = documentAttribute.h;
                    break;
                }
            }
        }
        return nt0Var;
    }

    @Override
    public final void U(v4.w0 w0Var, v4.b1 b1Var, View view, s0.c cVar) {
        e.a aVar;
        super.U(w0Var, b1Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f56166a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            aVar = new e.a(collectionItemInfo);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            Object obj = aVar.f9862a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(v4.b1 b1Var, int[] iArr) {
        super.z0(b1Var, iArr);
        aq0 aq0Var = this.Y;
        int i7 = aq0Var.F;
        if (i7 != 0 && !ys0.z0(i7)) {
            if (aq0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], org.telegram.messenger.g0.L(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.o7.a(1) * 2);
    }
}
