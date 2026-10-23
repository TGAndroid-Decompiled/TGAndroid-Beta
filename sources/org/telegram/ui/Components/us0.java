package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class us0 extends wz {
    public final iw0 X;
    public final ts0 Y;
    public final xv0 Z;

    public us0(xv0 xv0Var, ts0 ts0Var) {
        super(100, false);
        this.Z = xv0Var;
        this.Y = ts0Var;
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
    public final iw0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.g0 adapter = this.Y.h.getAdapter();
        xv0 xv0Var = this.Z;
        mv0[] mv0VarArr = xv0Var.f32707t1;
        if (adapter == xv0Var.O && !mv0VarArr[5].f28757a.isEmpty()) {
            document = ((MessageObject) mv0VarArr[5].f28757a.get(i10)).getDocument();
        } else {
            document = null;
        }
        iw0 iw0Var = this.X;
        iw0Var.f27466b = 100.0f;
        iw0Var.f27465a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f20368w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                iw0Var.f27465a = i11;
                iw0Var.f27466b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    iw0Var.f27465a = documentAttribute.f20350w;
                    iw0Var.f27466b = documentAttribute.h;
                    break;
                }
            }
        }
        return iw0Var;
    }

    @Override
    public final void U(qf.e eVar, s4.y0 y0Var, View view, s0.d dVar) {
        n5.c cVar;
        super.U(eVar, y0Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f46300a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            cVar = new n5.c(collectionItemInfo);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            Object obj = cVar.f17214a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(s4.y0 y0Var, int[] iArr) {
        super.z0(y0Var, iArr);
        ts0 ts0Var = this.Y;
        int i10 = ts0Var.F;
        if (i10 != 0 && !xv0.r0(i10)) {
            if (ts0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.t7.a(1) * 2);
    }
}
