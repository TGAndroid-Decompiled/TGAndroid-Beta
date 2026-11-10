package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class aq0 extends jy {
    public final nt0 X;
    public final zp0 Y;
    public final ys0 Z;

    public aq0(ys0 ys0Var, zp0 zp0Var) {
        super(100, false);
        this.Z = ys0Var;
        this.Y = zp0Var;
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
    public final nt0 D1(int i7) {
        TLRPC.Document document;
        int i10;
        int i11;
        v4.g0 adapter = this.Y.h.getAdapter();
        ys0 ys0Var = this.Z;
        ns0[] ns0VarArr = ys0Var.f40713v1;
        if (adapter == ys0Var.Q && !ns0VarArr[5].f36369a.isEmpty()) {
            document = ((org.telegram.messenger.ij) ns0VarArr[5].f36369a.get(i7)).F0();
        } else {
            document = null;
        }
        nt0 nt0Var = this.X;
        nt0Var.f36393b = 100.0f;
        nt0Var.f36392a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if (w10 != null && (i10 = w10.f26985w) != 0 && (i11 = w10.h) != 0) {
                nt0Var.f36392a = i10;
                nt0Var.f36393b = i11;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    nt0Var.f36392a = documentAttribute.f26967w;
                    nt0Var.f36393b = documentAttribute.h;
                    break;
                }
            }
        }
        return nt0Var;
    }

    @Override
    public final void U(v4.v0 v0Var, v4.a1 a1Var, View view, s0.d dVar) {
        d9.o oVar;
        super.U(v0Var, a1Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f54612a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            oVar = new d9.o(collectionItemInfo);
        } else {
            oVar = null;
        }
        if (oVar != null) {
            Object obj = oVar.f8256a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(v4.a1 a1Var, int[] iArr) {
        super.z0(a1Var, iArr);
        zp0 zp0Var = this.Y;
        int i7 = zp0Var.E;
        if (i7 != 0 && !ys0.z0(i7)) {
            if (zp0Var.E == 1) {
                iArr[1] = Math.max(iArr[1], org.telegram.messenger.g0.L(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.p7.a(1) * 2);
    }
}
