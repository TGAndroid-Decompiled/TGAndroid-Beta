package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ur0 extends nz {
    public final iv0 X;
    public final tr0 Y;
    public final xu0 Z;

    public ur0(xu0 xu0Var, tr0 tr0Var) {
        super(100, false);
        this.Z = xu0Var;
        this.Y = tr0Var;
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
    public final iv0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.h0 adapter = this.Y.h.getAdapter();
        xu0 xu0Var = this.Z;
        mu0[] mu0VarArr = xu0Var.f32722t1;
        if (adapter == xu0Var.O && !mu0VarArr[5].f28516a.isEmpty()) {
            document = ((MessageObject) mu0VarArr[5].f28516a.get(i10)).getDocument();
        } else {
            document = null;
        }
        iv0 iv0Var = this.X;
        iv0Var.f27272b = 100.0f;
        iv0Var.f27271a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f19894w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                iv0Var.f27271a = i11;
                iv0Var.f27272b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    iv0Var.f27271a = documentAttribute.f19876w;
                    iv0Var.f27272b = documentAttribute.h;
                    break;
                }
            }
        }
        return iv0Var;
    }

    @Override
    public final void U(pf.e eVar, s4.z0 z0Var, View view, s0.c cVar) {
        he.c cVar2;
        super.U(eVar, z0Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f45685a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            cVar2 = new he.c(collectionItemInfo);
        } else {
            cVar2 = null;
        }
        if (cVar2 != null) {
            Object obj = cVar2.f10970a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(s4.z0 z0Var, int[] iArr) {
        super.z0(z0Var, iArr);
        tr0 tr0Var = this.Y;
        int i10 = tr0Var.F;
        if (i10 != 0 && !xu0.p0(i10)) {
            if (tr0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.u7.a(1) * 2);
    }
}
