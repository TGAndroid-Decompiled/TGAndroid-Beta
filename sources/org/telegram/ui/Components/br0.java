package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class br0 extends zy {
    public final qu0 X;
    public final ar0 Y;
    public final eu0 Z;

    public br0(eu0 eu0Var, ar0 ar0Var) {
        super(100, false);
        this.Z = eu0Var;
        this.Y = ar0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.K) {
            return 0;
        }
        return B();
    }

    @Override
    public final qu0 D1(int i9) {
        TLRPC.Document document;
        int i10;
        int i11;
        f2.r0 adapter = this.Y.h.getAdapter();
        eu0 eu0Var = this.Z;
        tt0[] tt0VarArr = eu0Var.f28155p1;
        if (adapter == eu0Var.K && !tt0VarArr[5].f32788a.isEmpty()) {
            document = ((MessageObject) tt0VarArr[5].f32788a.get(i9)).getDocument();
        } else {
            document = null;
        }
        qu0 qu0Var = this.X;
        qu0Var.f32027b = 100.0f;
        qu0Var.f32026a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f22405w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
                qu0Var.f32026a = i10;
                qu0Var.f32027b = i11;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    qu0Var.f32026a = documentAttribute.f22387w;
                    qu0Var.f32027b = documentAttribute.h;
                    break;
                }
            }
        }
        return qu0Var;
    }

    @Override
    public final void U(f2.g1 g1Var, f2.n1 n1Var, View view, s0.d dVar) {
        k8.o oVar;
        super.U(g1Var, n1Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47292a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            oVar = new k8.o(collectionItemInfo);
        } else {
            oVar = null;
        }
        if (oVar != null) {
            Object obj = oVar.f14703a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(f2.n1 n1Var, int[] iArr) {
        super.z0(n1Var, iArr);
        ar0 ar0Var = this.Y;
        int i9 = ar0Var.B;
        if (i9 != 0 && !eu0.p0(i9)) {
            if (ar0Var.B == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.s7.a(1) * 2);
    }
}
