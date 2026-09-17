package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class wr0 extends nz {
    public final kv0 X;
    public final vr0 Y;
    public final zu0 Z;

    public wr0(zu0 zu0Var, vr0 vr0Var) {
        super(100, false);
        this.Z = zu0Var;
        this.Y = vr0Var;
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
    public final kv0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.h0 adapter = this.Y.h.getAdapter();
        zu0 zu0Var = this.Z;
        ou0[] ou0VarArr = zu0Var.f30652t1;
        if (adapter == zu0Var.O && !ou0VarArr[5].f26849a.isEmpty()) {
            document = ((MessageObject) ou0VarArr[5].f26849a.get(i10)).getDocument();
        } else {
            document = null;
        }
        kv0 kv0Var = this.X;
        kv0Var.f25696b = 100.0f;
        kv0Var.f25695a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f18146w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                kv0Var.f25695a = i11;
                kv0Var.f25696b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    kv0Var.f25695a = documentAttribute.f18128w;
                    kv0Var.f25696b = documentAttribute.h;
                    break;
                }
            }
        }
        return kv0Var;
    }

    @Override
    public final void U(of.e eVar, s4.z0 z0Var, View view, s0.c cVar) {
        n7.b bVar;
        super.U(eVar, z0Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f42646a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            bVar = new n7.b(collectionItemInfo);
        } else {
            bVar = null;
        }
        if (bVar != null) {
            Object obj = bVar.f15120a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(s4.z0 z0Var, int[] iArr) {
        super.z0(z0Var, iArr);
        vr0 vr0Var = this.Y;
        int i10 = vr0Var.F;
        if (i10 != 0 && !zu0.p0(i10)) {
            if (vr0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.u7.a(1) * 2);
    }
}
