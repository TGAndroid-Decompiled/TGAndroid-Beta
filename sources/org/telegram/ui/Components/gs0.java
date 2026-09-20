package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class gs0 extends nz {
    public final uv0 X;
    public final fs0 Y;
    public final jv0 Z;

    public gs0(jv0 jv0Var, fs0 fs0Var) {
        super(100, false);
        this.Z = jv0Var;
        this.Y = fs0Var;
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
    public final uv0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.h0 adapter = this.Y.h.getAdapter();
        jv0 jv0Var = this.Z;
        yu0[] yu0VarArr = jv0Var.f25524t1;
        if (adapter == jv0Var.O && !yu0VarArr[5].f30612a.isEmpty()) {
            document = ((MessageObject) yu0VarArr[5].f30612a.get(i10)).getDocument();
        } else {
            document = null;
        }
        uv0 uv0Var = this.X;
        uv0Var.f28869b = 100.0f;
        uv0Var.f28868a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f18353w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                uv0Var.f28868a = i11;
                uv0Var.f28869b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    uv0Var.f28868a = documentAttribute.f18335w;
                    uv0Var.f28869b = documentAttribute.h;
                    break;
                }
            }
        }
        return uv0Var;
    }

    @Override
    public final void U(of.e eVar, s4.z0 z0Var, View view, s0.d dVar) {
        he.c cVar;
        super.U(eVar, z0Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f42923a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            cVar = new he.c(collectionItemInfo);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            Object obj = cVar.f10207a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(s4.z0 z0Var, int[] iArr) {
        super.z0(z0Var, iArr);
        fs0 fs0Var = this.Y;
        int i10 = fs0Var.F;
        if (i10 != 0 && !jv0.p0(i10)) {
            if (fs0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.v7.a(1) * 2);
    }
}
