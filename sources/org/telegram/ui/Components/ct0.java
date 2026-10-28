package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ct0 extends vz {
    public final rw0 X;
    public final bt0 Y;
    public final bw0 Z;

    public ct0(bw0 bw0Var, bt0 bt0Var) {
        super(100, false);
        this.Z = bw0Var;
        this.Y = bt0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.Q) {
            return 0;
        }
        return B();
    }

    @Override
    public final rw0 E1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.h0 adapter = this.Y.h.getAdapter();
        bw0 bw0Var = this.Z;
        qv0[] qv0VarArr = bw0Var.f26986v1;
        if (adapter == bw0Var.Q && !qv0VarArr[5].f32033a.isEmpty()) {
            document = ((MessageObject) qv0VarArr[5].f32033a.get(i10)).getDocument();
        } else {
            document = null;
        }
        rw0 rw0Var = this.X;
        rw0Var.f32393b = 100.0f;
        rw0Var.f32392a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f22053w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                rw0Var.f32392a = i11;
                rw0Var.f32393b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    rw0Var.f32392a = documentAttribute.f22035w;
                    rw0Var.f32393b = documentAttribute.h;
                    break;
                }
            }
        }
        return rw0Var;
    }

    @Override
    public final void U(rf.e eVar, s4.b1 b1Var, View view, s0.d dVar) {
        ke.c cVar;
        super.U(eVar, b1Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47688a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            cVar = new ke.c(collectionItemInfo);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            Object obj = cVar.f16536a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(s4.b1 b1Var, int[] iArr) {
        super.z0(b1Var, iArr);
        bt0 bt0Var = this.Y;
        int i10 = bt0Var.E;
        if (i10 != 0 && !bw0.w0(i10)) {
            if (bt0Var.E == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.x7.a(1) * 2);
    }
}
