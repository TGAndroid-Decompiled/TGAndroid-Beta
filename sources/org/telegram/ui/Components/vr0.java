package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class vr0 extends nz {
    public final jv0 X;
    public final ur0 Y;
    public final yu0 Z;

    public vr0(yu0 yu0Var, ur0 ur0Var) {
        super(100, false);
        this.Z = yu0Var;
        this.Y = ur0Var;
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
    public final jv0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.h0 adapter = this.Y.h.getAdapter();
        yu0 yu0Var = this.Z;
        nu0[] nu0VarArr = yu0Var.f30388t1;
        if (adapter == yu0Var.O && !nu0VarArr[5].f26576a.isEmpty()) {
            document = ((MessageObject) nu0VarArr[5].f26576a.get(i10)).getDocument();
        } else {
            document = null;
        }
        jv0 jv0Var = this.X;
        jv0Var.f25444b = 100.0f;
        jv0Var.f25443a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f18137w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                jv0Var.f25443a = i11;
                jv0Var.f25444b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    jv0Var.f25443a = documentAttribute.f18119w;
                    jv0Var.f25444b = documentAttribute.h;
                    break;
                }
            }
        }
        return jv0Var;
    }

    @Override
    public final void U(of.e eVar, s4.z0 z0Var, View view, s0.c cVar) {
        n7.b bVar;
        super.U(eVar, z0Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f42624a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            bVar = new n7.b(collectionItemInfo);
        } else {
            bVar = null;
        }
        if (bVar != null) {
            Object obj = bVar.f15110a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(s4.z0 z0Var, int[] iArr) {
        super.z0(z0Var, iArr);
        ur0 ur0Var = this.Y;
        int i10 = ur0Var.F;
        if (i10 != 0 && !yu0.p0(i10)) {
            if (ur0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.u7.a(1) * 2);
    }
}
