package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class zs0 extends e00 {
    public final nw0 X;
    public final ys0 Y;
    public final cw0 Z;

    public zs0(cw0 cw0Var, ys0 ys0Var) {
        super(100, false);
        this.Z = cw0Var;
        this.Y = ys0Var;
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
    public final nw0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.i0 adapter = this.Y.h.getAdapter();
        cw0 cw0Var = this.Z;
        rv0[] rv0VarArr = cw0Var.f25532t1;
        if (adapter == cw0Var.O && !rv0VarArr[5].f30637a.isEmpty()) {
            document = ((MessageObject) rv0VarArr[5].f30637a.get(i10)).getDocument();
        } else {
            document = null;
        }
        nw0 nw0Var = this.X;
        nw0Var.f29303b = 100.0f;
        nw0Var.f29302a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f20093w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                nw0Var.f29302a = i11;
                nw0Var.f29303b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    nw0Var.f29302a = documentAttribute.f20075w;
                    nw0Var.f29303b = documentAttribute.h;
                    break;
                }
            }
        }
        return nw0Var;
    }

    @Override
    public final void U(pf.e eVar, s4.a1 a1Var, View view, s0.d dVar) {
        e.a aVar;
        super.U(eVar, a1Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47711a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            aVar = new e.a(collectionItemInfo);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            Object obj = aVar.f8389a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(s4.a1 a1Var, int[] iArr) {
        super.z0(a1Var, iArr);
        ys0 ys0Var = this.Y;
        int i10 = ys0Var.F;
        if (i10 != 0 && !cw0.p0(i10)) {
            if (ys0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.u7.a(1) * 2);
    }
}
