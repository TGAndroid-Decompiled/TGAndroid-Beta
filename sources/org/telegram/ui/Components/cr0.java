package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class cr0 extends bz {
    public final tu0 X;
    public final br0 Y;
    public final hu0 Z;

    public cr0(hu0 hu0Var, br0 br0Var) {
        super(100, false);
        this.Z = hu0Var;
        this.Y = br0Var;
        this.X = new tu0();
    }

    @Override
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.K) {
            return 0;
        }
        return B();
    }

    @Override
    public final tu0 D1(int i10) {
        int i11;
        int i12;
        f2.q0 adapter = this.Y.h.getAdapter();
        hu0 hu0Var = this.Z;
        wt0[] wt0VarArr = hu0Var.f29140p1;
        TLRPC.Document document = (adapter != hu0Var.K || wt0VarArr[5].f34325a.isEmpty()) ? null : ((MessageObject) wt0VarArr[5].f34325a.get(i10)).getDocument();
        tu0 tu0Var = this.X;
        tu0Var.f32894b = 100.0f;
        tu0Var.f32893a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f22405w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                tu0Var.f32893a = i11;
                tu0Var.f32894b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    tu0Var.f32893a = documentAttribute.f22387w;
                    tu0Var.f32894b = documentAttribute.h;
                    break;
                }
            }
        }
        return tu0Var;
    }

    @Override
    public final void U(f2.e1 e1Var, f2.l1 l1Var, View view, s0.c cVar) {
        super.U(e1Var, l1Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f47656a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        qd.b bVar = collectionItemInfo != null ? new qd.b(collectionItemInfo) : null;
        if (bVar != null) {
            Object obj = bVar.f46224a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(f2.l1 l1Var, int[] iArr) {
        super.z0(l1Var, iArr);
        br0 br0Var = this.Y;
        int i10 = br0Var.B;
        if (i10 == 0 || hu0.p0(i10)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.p7.a(1) * 2);
        } else if (br0Var.B == 1) {
            iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
        }
    }
}
