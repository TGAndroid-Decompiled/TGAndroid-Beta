package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class bt0 extends vz {
    public final qw0 X;
    public final at0 Y;
    public final aw0 Z;

    public bt0(aw0 aw0Var, at0 at0Var) {
        super(100, false);
        this.Z = aw0Var;
        this.Y = at0Var;
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
    public final qw0 E1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.h0 adapter = this.Y.h.getAdapter();
        aw0 aw0Var = this.Z;
        pv0[] pv0VarArr = aw0Var.f26698v1;
        if (adapter == aw0Var.Q && !pv0VarArr[5].f31706a.isEmpty()) {
            document = ((MessageObject) pv0VarArr[5].f31706a.get(i10)).getDocument();
        } else {
            document = null;
        }
        qw0 qw0Var = this.X;
        qw0Var.f32055b = 100.0f;
        qw0Var.f32054a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f22052w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                qw0Var.f32054a = i11;
                qw0Var.f32055b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    qw0Var.f32054a = documentAttribute.f22034w;
                    qw0Var.f32055b = documentAttribute.h;
                    break;
                }
            }
        }
        return qw0Var;
    }

    @Override
    public final void U(rf.e eVar, s4.b1 b1Var, View view, s0.d dVar) {
        ke.c cVar;
        super.U(eVar, b1Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47653a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            cVar = new ke.c(collectionItemInfo);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            Object obj = cVar.f16537a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(s4.b1 b1Var, int[] iArr) {
        super.z0(b1Var, iArr);
        at0 at0Var = this.Y;
        int i10 = at0Var.E;
        if (i10 != 0 && !aw0.w0(i10)) {
            if (at0Var.E == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.x7.a(1) * 2);
    }
}
