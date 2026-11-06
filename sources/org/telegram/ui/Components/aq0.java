package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class aq0 extends jy {
    public final mt0 X;
    public final zp0 Y;
    public final xs0 Z;

    public aq0(xs0 xs0Var, zp0 zp0Var) {
        super(100, false);
        this.Z = xs0Var;
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
    public final mt0 D1(int i7) {
        TLRPC.Document document;
        int i10;
        int i11;
        v4.g0 adapter = this.Y.h.getAdapter();
        xs0 xs0Var = this.Z;
        ms0[] ms0VarArr = xs0Var.f40434v1;
        if (adapter == xs0Var.Q && !ms0VarArr[5].f36063a.isEmpty()) {
            document = ((org.telegram.messenger.ij) ms0VarArr[5].f36063a.get(i7)).F0();
        } else {
            document = null;
        }
        mt0 mt0Var = this.X;
        mt0Var.f36087b = 100.0f;
        mt0Var.f36086a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if (w10 != null && (i10 = w10.f26978w) != 0 && (i11 = w10.h) != 0) {
                mt0Var.f36086a = i10;
                mt0Var.f36087b = i11;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    mt0Var.f36086a = documentAttribute.f26960w;
                    mt0Var.f36087b = documentAttribute.h;
                    break;
                }
            }
        }
        return mt0Var;
    }

    @Override
    public final void U(v4.v0 v0Var, v4.a1 a1Var, View view, s0.d dVar) {
        d9.o oVar;
        super.U(v0Var, a1Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f54508a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            oVar = new d9.o(collectionItemInfo);
        } else {
            oVar = null;
        }
        if (oVar != null) {
            Object obj = oVar.f8253a;
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
        if (i7 != 0 && !xs0.z0(i7)) {
            if (zp0Var.E == 1) {
                iArr[1] = Math.max(iArr[1], org.telegram.messenger.g0.L(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.p7.a(1) * 2);
    }
}
