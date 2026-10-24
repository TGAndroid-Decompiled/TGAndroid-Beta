package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ts0 extends uz {
    public final hw0 X;
    public final ss0 Y;
    public final wv0 Z;

    public ts0(wv0 wv0Var, ss0 ss0Var) {
        super(100, false);
        this.Z = wv0Var;
        this.Y = ss0Var;
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
    public final hw0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.g0 adapter = this.Y.h.getAdapter();
        wv0 wv0Var = this.Z;
        lv0[] lv0VarArr = wv0Var.f32406t1;
        if (adapter == wv0Var.O && !lv0VarArr[5].f28439a.isEmpty()) {
            document = ((MessageObject) lv0VarArr[5].f28439a.get(i10)).getDocument();
        } else {
            document = null;
        }
        hw0 hw0Var = this.X;
        hw0Var.f27189b = 100.0f;
        hw0Var.f27188a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f20369w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                hw0Var.f27188a = i11;
                hw0Var.f27189b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    hw0Var.f27188a = documentAttribute.f20351w;
                    hw0Var.f27189b = documentAttribute.h;
                    break;
                }
            }
        }
        return hw0Var;
    }

    @Override
    public final void U(qf.e eVar, s4.y0 y0Var, View view, s0.d dVar) {
        n5.c cVar;
        super.U(eVar, y0Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f46299a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            cVar = new n5.c(collectionItemInfo);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            Object obj = cVar.f17214a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(s4.y0 y0Var, int[] iArr) {
        super.z0(y0Var, iArr);
        ss0 ss0Var = this.Y;
        int i10 = ss0Var.F;
        if (i10 != 0 && !wv0.r0(i10)) {
            if (ss0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.t7.a(1) * 2);
    }
}
