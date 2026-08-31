package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class vr0 extends pz {
    public final kv0 X;
    public final ur0 Y;
    public final zu0 Z;

    public vr0(zu0 zu0Var, ur0 ur0Var) {
        super(100, false);
        this.Z = zu0Var;
        this.Y = ur0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.L) {
            return 0;
        }
        return B();
    }

    @Override
    public final kv0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        f2.p0 adapter = this.Y.h.getAdapter();
        zu0 zu0Var = this.Z;
        ou0[] ou0VarArr = zu0Var.f33998q1;
        if (adapter == zu0Var.L && !ou0VarArr[5].f29851a.isEmpty()) {
            document = ((MessageObject) ou0VarArr[5].f29851a.get(i10)).getDocument();
        } else {
            document = null;
        }
        kv0 kv0Var = this.X;
        kv0Var.f28464b = 100.0f;
        kv0Var.f28463a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f20868w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                kv0Var.f28463a = i11;
                kv0Var.f28464b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    kv0Var.f28463a = documentAttribute.f20850w;
                    kv0Var.f28464b = documentAttribute.h;
                    break;
                }
            }
        }
        return kv0Var;
    }

    @Override
    public final void U(bf.f fVar, f2.j1 j1Var, View view, s0.d dVar) {
        a3.c cVar;
        super.U(fVar, j1Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f46850a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            cVar = new a3.c(collectionItemInfo);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            Object obj = cVar.f49a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(f2.j1 j1Var, int[] iArr) {
        super.z0(j1Var, iArr);
        ur0 ur0Var = this.Y;
        int i10 = ur0Var.C;
        if (i10 != 0 && !zu0.p0(i10)) {
            if (ur0Var.C == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.s7.a(1) * 2);
    }
}
