package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ps0 extends wz {
    public final dw0 X;
    public final os0 Y;
    public final sv0 Z;

    public ps0(sv0 sv0Var, os0 os0Var) {
        super(100, false);
        this.Z = sv0Var;
        this.Y = os0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.O) {
            return 0;
        }
        return B();
    }

    @Override
    public final dw0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.g0 adapter = this.Y.h.getAdapter();
        sv0 sv0Var = this.Z;
        hv0[] hv0VarArr = sv0Var.f30391t1;
        if (adapter == sv0Var.O && !hv0VarArr[5].f26949a.isEmpty()) {
            document = ((MessageObject) hv0VarArr[5].f26949a.get(i10)).getDocument();
        } else {
            document = null;
        }
        dw0 dw0Var = this.X;
        dw0Var.f25728b = 100.0f;
        dw0Var.f25727a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f20304w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                dw0Var.f25727a = i11;
                dw0Var.f25728b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    dw0Var.f25727a = documentAttribute.f20286w;
                    dw0Var.f25728b = documentAttribute.h;
                    break;
                }
            }
        }
        return dw0Var;
    }

    @Override
    public final void U(qf.e eVar, s4.y0 y0Var, View view, s0.c cVar) {
        n7.b bVar;
        super.U(eVar, y0Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f45915a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            bVar = new n7.b(collectionItemInfo);
        } else {
            bVar = null;
        }
        if (bVar != null) {
            Object obj = bVar.f17261a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(s4.y0 y0Var, int[] iArr) {
        super.z0(y0Var, iArr);
        os0 os0Var = this.Y;
        int i10 = os0Var.F;
        if (i10 != 0 && !sv0.q0(i10)) {
            if (os0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.t7.a(1) * 2);
    }
}
