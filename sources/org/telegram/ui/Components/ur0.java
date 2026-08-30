package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ur0 extends nz {
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
        f2.o0 adapter = this.Y.h.getAdapter();
        yu0 yu0Var = this.Z;
        nu0[] nu0VarArr = yu0Var.f31138q1;
        if (adapter == yu0Var.L && !nu0VarArr[5].f27364a.isEmpty()) {
            document = ((MessageObject) nu0VarArr[5].f27364a.get(i10)).getDocument();
        } else {
            document = null;
        }
        jv0 jv0Var = this.X;
        jv0Var.f26053b = 100.0f;
        jv0Var.f26052a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f19209w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                jv0Var.f26052a = i11;
                jv0Var.f26053b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    jv0Var.f26052a = documentAttribute.f19191w;
                    jv0Var.f26053b = documentAttribute.h;
                    break;
                }
            }
        }
        return jv0Var;
    }

    @Override
    public final void U(bf.f fVar, f2.i1 i1Var, View view, s0.e eVar) {
        s0.d dVar;
        super.U(fVar, i1Var, view, eVar);
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f43904a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            dVar = new s0.d(collectionItemInfo);
        } else {
            dVar = null;
        }
        if (dVar != null) {
            Object obj = dVar.f43902a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(f2.i1 i1Var, int[] iArr) {
        super.z0(i1Var, iArr);
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
