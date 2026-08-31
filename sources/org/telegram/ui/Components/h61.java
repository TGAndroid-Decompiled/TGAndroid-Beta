package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class h61 extends pz {
    public final int X = 1;
    public final Object Y;

    public h61() {
        super(100, false);
        this.Y = new Object();
    }

    @Override
    public int A() {
        switch (this.X) {
            case 1:
                return 0;
            default:
                return super.A();
        }
    }

    @Override
    public kv0 D1(int i10) {
        switch (this.X) {
            case 1:
                kv0 kv0Var = (kv0) this.Y;
                kv0Var.f28464b = 100.0f;
                kv0Var.f28463a = 100.0f;
                return kv0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override
    public void U(bf.f fVar, f2.j1 j1Var, View view, s0.d dVar) {
        a3.c cVar;
        switch (this.X) {
            case 1:
                super.U(fVar, j1Var, view, dVar);
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f46850a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    cVar = new a3.c(collectionItemInfo);
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    Object obj = cVar.f49a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.U(fVar, j1Var, view, dVar);
                return;
        }
    }

    @Override
    public int W0(f2.j1 j1Var) {
        switch (this.X) {
            case 0:
                if (((i61) this.Y).X2) {
                    return AndroidUtilities.displaySize.y;
                }
                return super.W0(j1Var);
            default:
                return super.W0(j1Var);
        }
    }

    @Override
    public void z0(f2.j1 j1Var, int[] iArr) {
        switch (this.X) {
            case 1:
                super.z0(j1Var, iArr);
                iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.s7.a(1) * 2);
                return;
            default:
                super.z0(j1Var, iArr);
                return;
        }
    }

    public h61(i61 i61Var, int i10) {
        super(i10, false);
        this.Y = i61Var;
    }
}
