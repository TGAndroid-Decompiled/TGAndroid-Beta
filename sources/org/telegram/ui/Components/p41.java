package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class p41 extends ky {
    public final int X;
    public final Object Y;

    public p41(r41 r41Var, int i7, int i10) {
        super(i7, false);
        this.X = i10;
        this.Y = r41Var;
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
    public ot0 D1(int i7) {
        switch (this.X) {
            case 2:
                ot0 ot0Var = (ot0) this.Y;
                ot0Var.f36802b = 100.0f;
                ot0Var.f36801a = 100.0f;
                return ot0Var;
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
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f54613a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    oVar = new d9.o(collectionItemInfo);
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    Object obj = oVar.f8251a;
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
                if (((r41) this.Y).f37558h3) {
                    return org.telegram.messenger.g0.f22563q.y;
                }
                return super.W0(a1Var);
            case 1:
                if (((r41) this.Y).f37558h3) {
                    return org.telegram.messenger.g0.f22563q.y;
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

    public p41() {
        super(100, false);
        this.X = 2;
        this.Y = new Object();
    }
}
