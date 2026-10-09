package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ys0 extends d00 {
    public final mw0 X;
    public final xs0 Y;
    public final bw0 Z;

    public ys0(bw0 bw0Var, xs0 xs0Var) {
        super(100, false);
        this.Z = bw0Var;
        this.Y = xs0Var;
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
    public final mw0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.i0 adapter = this.Y.h.getAdapter();
        bw0 bw0Var = this.Z;
        qv0[] qv0VarArr = bw0Var.f25162t1;
        if (adapter == bw0Var.O && !qv0VarArr[5].f30274a.isEmpty()) {
            document = ((MessageObject) qv0VarArr[5].f30274a.get(i10)).getDocument();
        } else {
            document = null;
        }
        mw0 mw0Var = this.X;
        mw0Var.f28964b = 100.0f;
        mw0Var.f28963a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f20063w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                mw0Var.f28963a = i11;
                mw0Var.f28964b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    mw0Var.f28963a = documentAttribute.f20045w;
                    mw0Var.f28964b = documentAttribute.h;
                    break;
                }
            }
        }
        return mw0Var;
    }

    @Override
    public final void U(pf.e eVar, s4.a1 a1Var, View view, s0.d dVar) {
        e.a aVar;
        super.U(eVar, a1Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47587a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            aVar = new e.a(collectionItemInfo);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            Object obj = aVar.f8390a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(s4.a1 a1Var, int[] iArr) {
        super.z0(a1Var, iArr);
        xs0 xs0Var = this.Y;
        int i10 = xs0Var.F;
        if (i10 != 0 && !bw0.p0(i10)) {
            if (xs0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.u7.a(1) * 2);
    }
}
