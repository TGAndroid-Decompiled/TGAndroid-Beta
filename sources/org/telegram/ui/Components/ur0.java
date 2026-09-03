package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ur0 extends pz {
    public final jv0 X;
    public final tr0 Y;
    public final yu0 Z;

    public ur0(yu0 yu0Var, tr0 tr0Var) {
        super(100, false);
        this.Z = yu0Var;
        this.Y = tr0Var;
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
    public final jv0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        f2.p0 adapter = this.Y.h.getAdapter();
        yu0 yu0Var = this.Z;
        nu0[] nu0VarArr = yu0Var.f33643q1;
        if (adapter == yu0Var.L && !nu0VarArr[5].f29580a.isEmpty()) {
            document = ((MessageObject) nu0VarArr[5].f29580a.get(i10)).getDocument();
        } else {
            document = null;
        }
        jv0 jv0Var = this.X;
        jv0Var.f28202b = 100.0f;
        jv0Var.f28201a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f20870w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                jv0Var.f28201a = i11;
                jv0Var.f28202b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    jv0Var.f28201a = documentAttribute.f20852w;
                    jv0Var.f28202b = documentAttribute.h;
                    break;
                }
            }
        }
        return jv0Var;
    }

    @Override
    public final void U(bf.f fVar, f2.j1 j1Var, View view, s0.d dVar) {
        a3.c cVar;
        super.U(fVar, j1Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f46881a;
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
        tr0 tr0Var = this.Y;
        int i10 = tr0Var.C;
        if (i10 != 0 && !yu0.p0(i10)) {
            if (tr0Var.C == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.s7.a(1) * 2);
    }
}
