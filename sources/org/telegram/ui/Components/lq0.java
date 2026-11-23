package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lq0 extends wy {
    public final yt0 X;
    public final kq0 Y;
    public final jt0 Z;

    public lq0(jt0 jt0Var, kq0 kq0Var) {
        super(100, false);
        this.Z = jt0Var;
        this.Y = kq0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.R) {
            return 0;
        }
        return B();
    }

    @Override
    public final yt0 D1(int i7) {
        TLRPC.Document document;
        int i10;
        int i11;
        v4.h0 adapter = this.Y.h.getAdapter();
        jt0 jt0Var = this.Z;
        ys0[] ys0VarArr = jt0Var.f36632w1;
        if (adapter == jt0Var.R && !ys0VarArr[5].f42474a.isEmpty()) {
            document = ((org.telegram.messenger.gj) ys0VarArr[5].f42474a.get(i7)).F0();
        } else {
            document = null;
        }
        yt0 yt0Var = this.X;
        yt0Var.f42507b = 100.0f;
        yt0Var.f42506a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if (w10 != null && (i10 = w10.f28423w) != 0 && (i11 = w10.h) != 0) {
                yt0Var.f42506a = i10;
                yt0Var.f42507b = i11;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    yt0Var.f42506a = documentAttribute.f28405w;
                    yt0Var.f42507b = documentAttribute.h;
                    break;
                }
            }
        }
        return yt0Var;
    }

    @Override
    public final void U(v4.w0 w0Var, v4.b1 b1Var, View view, s0.c cVar) {
        pf pfVar;
        super.U(w0Var, b1Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f56750a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            pfVar = new pf(collectionItemInfo, 15);
        } else {
            pfVar = null;
        }
        if (pfVar != null) {
            Object obj = pfVar.f38544b;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void z0(v4.b1 b1Var, int[] iArr) {
        super.z0(b1Var, iArr);
        kq0 kq0Var = this.Y;
        int i7 = kq0Var.F;
        if (i7 != 0 && !jt0.z0(i7)) {
            if (kq0Var.F == 1) {
                iArr[1] = Math.max(iArr[1], org.telegram.messenger.g0.L(56.0f) * 2);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.q7.a(1) * 2);
    }
}
