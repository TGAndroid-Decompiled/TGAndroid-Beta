package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class rs0 extends wz {
    public final fw0 X;
    public final qs0 Y;
    public final uv0 Z;

    public rs0(uv0 uv0Var, qs0 qs0Var) {
        super(100, false);
        this.Z = uv0Var;
        this.Y = qs0Var;
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
    public final fw0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.g0 adapter = this.Y.h.getAdapter();
        uv0 uv0Var = this.Z;
        jv0[] jv0VarArr = uv0Var.f31071t1;
        if (adapter == uv0Var.O && !jv0VarArr[5].f27645a.isEmpty()) {
            document = ((MessageObject) jv0VarArr[5].f27645a.get(i10)).getDocument();
        } else {
            document = null;
        }
        fw0 fw0Var = this.X;
        fw0Var.f26433b = 100.0f;
        fw0Var.f26432a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f20305w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                fw0Var.f26432a = i11;
                fw0Var.f26433b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    fw0Var.f26432a = documentAttribute.f20287w;
                    fw0Var.f26433b = documentAttribute.h;
                    break;
                }
            }
        }
        return fw0Var;
    }

    @Override
    public final void U(qf.e eVar, s4.y0 y0Var, View view, s0.c cVar) {
        n5.c cVar2;
        super.U(eVar, y0Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f45878a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            cVar2 = new n5.c(collectionItemInfo);
        } else {
            cVar2 = null;
        }
        if (cVar2 != null) {
            Object obj = cVar2.f17151a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(s4.y0 y0Var, int[] iArr) {
        super.z0(y0Var, iArr);
        qs0 qs0Var = this.Y;
        int i10 = qs0Var.F;
        if (i10 != 0 && !uv0.q0(i10)) {
            if (qs0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.t7.a(1) * 2);
    }
}
