package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class at0 extends e00 {
    public final ow0 X;
    public final zs0 Y;
    public final dw0 Z;

    public at0(dw0 dw0Var, zs0 zs0Var) {
        super(100, false);
        this.Z = dw0Var;
        this.Y = zs0Var;
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
    public final ow0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.i0 adapter = this.Y.h.getAdapter();
        dw0 dw0Var = this.Z;
        sv0[] sv0VarArr = dw0Var.f25731t1;
        if (adapter == dw0Var.O && !sv0VarArr[5].f30867a.isEmpty()) {
            document = ((MessageObject) sv0VarArr[5].f30867a.get(i10)).getDocument();
        } else {
            document = null;
        }
        ow0 ow0Var = this.X;
        ow0Var.f29542b = 100.0f;
        ow0Var.f29541a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f20057w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                ow0Var.f29541a = i11;
                ow0Var.f29542b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    ow0Var.f29541a = documentAttribute.f20039w;
                    ow0Var.f29542b = documentAttribute.h;
                    break;
                }
            }
        }
        return ow0Var;
    }

    @Override
    public final void U(pf.e eVar, s4.a1 a1Var, View view, s0.d dVar) {
        e.a aVar;
        super.U(eVar, a1Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47677a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            aVar = new e.a(collectionItemInfo);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            Object obj = aVar.f8389a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(s4.a1 a1Var, int[] iArr) {
        super.z0(a1Var, iArr);
        zs0 zs0Var = this.Y;
        int i10 = zs0Var.F;
        if (i10 != 0 && !dw0.p0(i10)) {
            if (zs0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.u7.a(1) * 2);
    }
}
