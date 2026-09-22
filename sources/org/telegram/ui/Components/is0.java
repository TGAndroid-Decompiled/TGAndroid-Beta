package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class is0 extends nz {
    public final wv0 X;
    public final hs0 Y;
    public final lv0 Z;

    public is0(lv0 lv0Var, hs0 hs0Var) {
        super(100, false);
        this.Z = lv0Var;
        this.Y = hs0Var;
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
    public final wv0 D1(int i10) {
        TLRPC.Document document;
        int i11;
        int i12;
        s4.h0 adapter = this.Y.h.getAdapter();
        lv0 lv0Var = this.Z;
        av0[] av0VarArr = lv0Var.f26230t1;
        if (adapter == lv0Var.O && !av0VarArr[5].f22744a.isEmpty()) {
            document = ((MessageObject) av0VarArr[5].f22744a.get(i10)).getDocument();
        } else {
            document = null;
        }
        wv0 wv0Var = this.X;
        wv0Var.f30162b = 100.0f;
        wv0Var.f30161a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.f18368w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                wv0Var.f30161a = i11;
                wv0Var.f30162b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    wv0Var.f30161a = documentAttribute.f18350w;
                    wv0Var.f30162b = documentAttribute.h;
                    break;
                }
            }
        }
        return wv0Var;
    }

    @Override
    public final void U(of.e eVar, s4.z0 z0Var, View view, s0.d dVar) {
        he.b bVar;
        super.U(eVar, z0Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f42944a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            bVar = new he.b(collectionItemInfo);
        } else {
            bVar = null;
        }
        if (bVar != null) {
            Object obj = bVar.f10207a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(s4.z0 z0Var, int[] iArr) {
        super.z0(z0Var, iArr);
        hs0 hs0Var = this.Y;
        int i10 = hs0Var.F;
        if (i10 != 0 && !lv0.p0(i10)) {
            if (hs0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.v7.a(1) * 2);
    }
}
