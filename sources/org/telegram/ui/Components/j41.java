package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class j41 extends hy {
    public final int X;
    public final Object Y;

    public j41(l41 l41Var, int i3, int i10) {
        super(i3, false);
        this.X = i10;
        this.Y = l41Var;
    }

    @Override
    public int A() {
        switch (this.X) {
            case 2:
                return 0;
            default:
                return super.A();
        }
    }

    @Override
    public lt0 D1(int i3) {
        switch (this.X) {
            case 2:
                lt0 lt0Var = (lt0) this.Y;
                lt0Var.f35878b = 100.0f;
                lt0Var.f35877a = 100.0f;
                return lt0Var;
            default:
                return super.D1(i3);
        }
    }

    @Override
    public void U(tf.e eVar, u4.a1 a1Var, View view, s0.d dVar) {
        e.a aVar;
        switch (this.X) {
            case 2:
                super.U(eVar, a1Var, view, dVar);
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f54570a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    aVar = new e.a(collectionItemInfo);
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    Object obj = aVar.f9205a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.U(eVar, a1Var, view, dVar);
                return;
        }
    }

    @Override
    public int W0(u4.a1 a1Var) {
        switch (this.X) {
            case 0:
                if (((l41) this.Y).i3) {
                    return org.telegram.messenger.g0.f22608q.y;
                }
                return super.W0(a1Var);
            case 1:
                if (((l41) this.Y).i3) {
                    return org.telegram.messenger.g0.f22608q.y;
                }
                return super.W0(a1Var);
            default:
                return super.W0(a1Var);
        }
    }

    @Override
    public void z0(u4.a1 a1Var, int[] iArr) {
        switch (this.X) {
            case 2:
                super.z0(a1Var, iArr);
                iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.o7.a(1) * 2);
                return;
            default:
                super.z0(a1Var, iArr);
                return;
        }
    }

    public j41() {
        super(100, false);
        this.X = 2;
        this.Y = new Object();
    }
}
