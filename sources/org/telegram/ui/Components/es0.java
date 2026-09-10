package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class es0 extends uz {
    public final tv0 X;
    public final ds0 Y;
    public final iv0 Z;

    public es0(iv0 iv0Var, ds0 ds0Var) {
        super(100, false);
        this.Z = iv0Var;
        this.Y = ds0Var;
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
    public final tv0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.h0 adapter = this.Y.h.getAdapter();
        iv0 iv0Var = this.Z;
        xu0[] xu0VarArr = iv0Var.f24127t1;
        if (adapter == iv0Var.O && !xu0VarArr[5].f29156a.isEmpty()) {
            document = ((MessageObject) xu0VarArr[5].f29156a.get(i10)).getDocument();
        } else {
            document = null;
        }
        tv0 tv0Var = this.X;
        tv0Var.f27500b = 100.0f;
        tv0Var.f27499a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f17220w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                tv0Var.f27499a = i11;
                tv0Var.f27500b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    tv0Var.f27499a = documentAttribute.f17202w;
                    tv0Var.f27500b = documentAttribute.h;
                    break;
                }
            }
        }
        return tv0Var;
    }

    @Override
    public final void U(of.e eVar, s4.z0 z0Var, View view, s0.d dVar) {
        n7.b bVar;
        super.U(eVar, z0Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f41559a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            bVar = new n7.b(collectionItemInfo);
        } else {
            bVar = null;
        }
        if (bVar != null) {
            Object obj = bVar.f13940a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(s4.z0 z0Var, int[] iArr) {
        super.z0(z0Var, iArr);
        ds0 ds0Var = this.Y;
        int i10 = ds0Var.F;
        if (i10 != 0 && !iv0.p0(i10)) {
            if (ds0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.v7.a(1) * 2);
    }
}
