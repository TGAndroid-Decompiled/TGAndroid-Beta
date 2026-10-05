package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ns0 extends qz {
    public final gw0 X;
    public final ms0 Y;
    public final qv0 Z;

    public ns0(qv0 qv0Var, ms0 ms0Var) {
        super(100, false);
        this.Z = qv0Var;
        this.Y = ms0Var;
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
    public final gw0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.h0 adapter = this.Y.h.getAdapter();
        qv0 qv0Var = this.Z;
        fv0[] fv0VarArr = qv0Var.f30259t1;
        if (adapter == qv0Var.O && !fv0VarArr[5].f26591a.isEmpty()) {
            document = ((MessageObject) fv0VarArr[5].f26591a.get(i10)).getDocument();
        } else {
            document = null;
        }
        gw0 gw0Var = this.X;
        gw0Var.f27003b = 100.0f;
        gw0Var.f27002a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f20072w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                gw0Var.f27002a = i11;
                gw0Var.f27003b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    gw0Var.f27002a = documentAttribute.f20054w;
                    gw0Var.f27003b = documentAttribute.h;
                    break;
                }
            }
        }
        return gw0Var;
    }

    @Override
    public final void U(of.e eVar, s4.z0 z0Var, View view, s0.d dVar) {
        e.a aVar;
        super.U(eVar, z0Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f46485a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            aVar = new e.a(collectionItemInfo);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            Object obj = aVar.f8396a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(s4.z0 z0Var, int[] iArr) {
        super.z0(z0Var, iArr);
        ms0 ms0Var = this.Y;
        int i10 = ms0Var.F;
        if (i10 != 0 && !qv0.p0(i10)) {
            if (ms0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.u7.a(1) * 2);
    }
}
