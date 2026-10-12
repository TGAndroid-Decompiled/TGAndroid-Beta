package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class et0 extends g00 {
    public final sw0 X;
    public final dt0 Y;
    public final hw0 Z;

    public et0(hw0 hw0Var, dt0 dt0Var) {
        super(100, false);
        this.Z = hw0Var;
        this.Y = dt0Var;
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
    public final sw0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.i0 adapter = this.Y.h.getAdapter();
        hw0 hw0Var = this.Z;
        wv0[] wv0VarArr = hw0Var.f26953t1;
        if (adapter == hw0Var.O && !wv0VarArr[5].f32552a.isEmpty()) {
            document = ((MessageObject) wv0VarArr[5].f32552a.get(i10)).getDocument();
        } else {
            document = null;
        }
        sw0 sw0Var = this.X;
        sw0Var.f30700b = 100.0f;
        sw0Var.f30699a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f19828w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                sw0Var.f30699a = i11;
                sw0Var.f30700b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    sw0Var.f30699a = documentAttribute.f19810w;
                    sw0Var.f30700b = documentAttribute.h;
                    break;
                }
            }
        }
        return sw0Var;
    }

    @Override
    public final void U(pf.e eVar, s4.a1 a1Var, View view, s0.d dVar) {
        e.a aVar;
        super.U(eVar, a1Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47826a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            aVar = new e.a(collectionItemInfo);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            Object obj = aVar.f8387a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(s4.a1 a1Var, int[] iArr) {
        super.z0(a1Var, iArr);
        dt0 dt0Var = this.Y;
        int i10 = dt0Var.F;
        if (i10 != 0 && !hw0.p0(i10)) {
            if (dt0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.u7.a(1) * 2);
    }
}
