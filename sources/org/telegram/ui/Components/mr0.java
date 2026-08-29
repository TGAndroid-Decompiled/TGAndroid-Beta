package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class mr0 extends iz {
    public final bv0 X;
    public final lr0 Y;
    public final qu0 Z;

    public mr0(qu0 qu0Var, lr0 lr0Var) {
        super(100, false);
        this.Z = qu0Var;
        this.Y = lr0Var;
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
    public final bv0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        f2.p0 adapter = this.Y.h.getAdapter();
        qu0 qu0Var = this.Z;
        fu0[] fu0VarArr = qu0Var.f32088p1;
        if (adapter == qu0Var.K && !fu0VarArr[5].f28534a.isEmpty()) {
            document = ((MessageObject) fu0VarArr[5].f28534a.get(i10)).getDocument();
        } else {
            document = null;
        }
        bv0 bv0Var = this.X;
        bv0Var.f27239b = 100.0f;
        bv0Var.f27238a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f22417w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                bv0Var.f27238a = i11;
                bv0Var.f27239b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    bv0Var.f27238a = documentAttribute.f22399w;
                    bv0Var.f27239b = documentAttribute.h;
                    break;
                }
            }
        }
        return bv0Var;
    }

    @Override
    public final void U(f2.d1 d1Var, f2.k1 k1Var, View view, s0.c cVar) {
        m8.o oVar;
        super.U(d1Var, k1Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f47482a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            oVar = new m8.o(collectionItemInfo);
        } else {
            oVar = null;
        }
        if (oVar != null) {
            Object obj = oVar.f16924a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(f2.k1 k1Var, int[] iArr) {
        super.z0(k1Var, iArr);
        lr0 lr0Var = this.Y;
        int i10 = lr0Var.B;
        if (i10 != 0 && !qu0.p0(i10)) {
            if (lr0Var.B == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.q7.a(1) * 2);
    }
}
