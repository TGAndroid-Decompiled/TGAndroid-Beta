package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class i41 extends jy {
    public final int X;
    public final Object Y;

    public i41(k41 k41Var, int i7, int i10) {
        super(i7, false);
        this.X = i10;
        this.Y = k41Var;
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
    public mt0 D1(int i7) {
        switch (this.X) {
            case 2:
                mt0 mt0Var = (mt0) this.Y;
                mt0Var.f36133b = 100.0f;
                mt0Var.f36132a = 100.0f;
                return mt0Var;
            default:
                return super.D1(i7);
        }
    }

    @Override
    public void U(v4.v0 v0Var, v4.a1 a1Var, View view, s0.d dVar) {
        d9.o oVar;
        switch (this.X) {
            case 2:
                super.U(v0Var, a1Var, view, dVar);
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f54484a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    oVar = new d9.o(collectionItemInfo);
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    Object obj = oVar.f8253a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.U(v0Var, a1Var, view, dVar);
                return;
        }
    }

    @Override
    public int W0(v4.a1 a1Var) {
        switch (this.X) {
            case 0:
                if (((k41) this.Y).f35169h3) {
                    return org.telegram.messenger.g0.f22537q.y;
                }
                return super.W0(a1Var);
            case 1:
                if (((k41) this.Y).f35169h3) {
                    return org.telegram.messenger.g0.f22537q.y;
                }
                return super.W0(a1Var);
            default:
                return super.W0(a1Var);
        }
    }

    @Override
    public void z0(v4.a1 a1Var, int[] iArr) {
        switch (this.X) {
            case 2:
                super.z0(a1Var, iArr);
                iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.p7.a(1) * 2);
                return;
            default:
                super.z0(a1Var, iArr);
                return;
        }
    }

    public i41() {
        super(100, false);
        this.X = 2;
        this.Y = new Object();
    }
}
