package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class s41 extends oy {
    public final int X;
    public final Object Y;

    public s41(u41 u41Var, int i7, int i10) {
        super(i7, false);
        this.X = i10;
        this.Y = u41Var;
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
    public nt0 D1(int i7) {
        switch (this.X) {
            case 2:
                nt0 nt0Var = (nt0) this.Y;
                nt0Var.f37703b = 100.0f;
                nt0Var.f37702a = 100.0f;
                return nt0Var;
            default:
                return super.D1(i7);
        }
    }

    @Override
    public void U(v4.w0 w0Var, v4.b1 b1Var, View view, s0.c cVar) {
        e.a aVar;
        switch (this.X) {
            case 2:
                super.U(w0Var, b1Var, view, cVar);
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.f56166a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    aVar = new e.a(collectionItemInfo);
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    Object obj = aVar.f9862a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.U(w0Var, b1Var, view, cVar);
                return;
        }
    }

    @Override
    public int W0(v4.b1 b1Var) {
        switch (this.X) {
            case 0:
                if (((u41) this.Y).f39894i3) {
                    return org.telegram.messenger.g0.f23611q.y;
                }
                return super.W0(b1Var);
            case 1:
                if (((u41) this.Y).f39894i3) {
                    return org.telegram.messenger.g0.f23611q.y;
                }
                return super.W0(b1Var);
            default:
                return super.W0(b1Var);
        }
    }

    @Override
    public void z0(v4.b1 b1Var, int[] iArr) {
        switch (this.X) {
            case 2:
                super.z0(b1Var, iArr);
                iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.o7.a(1) * 2);
                return;
            default:
                super.z0(b1Var, iArr);
                return;
        }
    }

    public s41() {
        super(100, false);
        this.X = 2;
        this.Y = new Object();
    }
}
