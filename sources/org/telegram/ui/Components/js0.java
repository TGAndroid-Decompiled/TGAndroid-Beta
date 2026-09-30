package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class js0 extends qz {
    public final xv0 X;
    public final is0 Y;
    public final mv0 Z;

    public js0(mv0 mv0Var, is0 is0Var) {
        super(100, false);
        this.Z = mv0Var;
        this.Y = is0Var;
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
    public final xv0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.h0 adapter = this.Y.h.getAdapter();
        mv0 mv0Var = this.Z;
        bv0[] bv0VarArr = mv0Var.f26445t1;
        if (adapter == mv0Var.O && !bv0VarArr[5].f23015a.isEmpty()) {
            document = ((MessageObject) bv0VarArr[5].f23015a.get(i10)).getDocument();
        } else {
            document = null;
        }
        xv0 xv0Var = this.X;
        xv0Var.f30522b = 100.0f;
        xv0Var.f30521a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f18377w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                xv0Var.f30521a = i11;
                xv0Var.f30522b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    xv0Var.f30521a = documentAttribute.f18359w;
                    xv0Var.f30522b = documentAttribute.h;
                    break;
                }
            }
        }
        return xv0Var;
    }

    @Override
    public final void U(of.e eVar, s4.z0 z0Var, View view, s0.d dVar) {
        he.c cVar;
        super.U(eVar, z0Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f43017a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            cVar = new he.c(collectionItemInfo);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            Object obj = cVar.f10202a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(s4.z0 z0Var, int[] iArr) {
        super.z0(z0Var, iArr);
        is0 is0Var = this.Y;
        int i10 = is0Var.F;
        if (i10 != 0 && !mv0.p0(i10)) {
            if (is0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.u7.a(1) * 2);
    }
}
